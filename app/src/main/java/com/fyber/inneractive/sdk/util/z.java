package com.fyber.inneractive.sdk.util;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.Pair;
import android.view.View;
import android.view.ViewTreeObserver;
import com.fyber.inneractive.sdk.util.i;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class z {
    public final WeakHashMap<Context, WeakHashMap<View, e>> b = new WeakHashMap<>();
    public final Map<Context, Pair<ViewTreeObserver, ViewTreeObserver.OnPreDrawListener>> a = new WeakHashMap();
    public final i<Rect> c = new i<>(16, new a(this));
    public final i<HashSet<View>> d = new i<>(16, new b(this));

    /* loaded from: classes.dex */
    public class a implements i.a<Rect> {
        public a(z zVar) {
        }

        @Override // com.fyber.inneractive.sdk.util.i.a
        public Rect a() {
            return new Rect();
        }
    }

    /* loaded from: classes.dex */
    public class b implements i.a<HashSet<View>> {
        public b(z zVar) {
        }

        @Override // com.fyber.inneractive.sdk.util.i.a
        public HashSet<View> a() {
            return new HashSet<>();
        }
    }

    /* loaded from: classes.dex */
    public class c implements ViewTreeObserver.OnPreDrawListener {
        public final /* synthetic */ Context a;

        public c(Context context) {
            z.this = r1;
            this.a = context;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            WeakHashMap<View, e> weakHashMap;
            z zVar = z.this;
            Context context = this.a;
            zVar.getClass();
            if (context == null || (weakHashMap = zVar.b.get(context)) == null) {
                return true;
            }
            HashSet<View> a = zVar.d.a();
            a.addAll(weakHashMap.keySet());
            Iterator<View> it = a.iterator();
            while (it.hasNext()) {
                View next = it.next();
                e eVar = weakHashMap.get(next);
                if (eVar != null) {
                    float f = 0.0f;
                    Rect a2 = zVar.c.a();
                    if (next != null && next.getParent() != null && next.isShown() && next.getGlobalVisibleRect(a2)) {
                        f = (a2.height() * a2.width()) / (next.getHeight() * next.getWidth());
                    }
                    eVar.a(next, f, a2);
                    zVar.c.a.offer(a2);
                }
            }
            a.clear();
            zVar.d.a.offer(a);
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public static final z a = new z();
    }

    /* loaded from: classes.dex */
    public interface e {
        void a(View view, float f, Rect rect);
    }

    public static z a() {
        return d.a;
    }

    public final String b() {
        return "IAVisibilityTracker: ";
    }

    public final void c() {
        for (Context context : this.b.keySet()) {
            IAlog.a("%stracking context: %s", b(), context);
            WeakHashMap<View, e> weakHashMap = this.b.get(context);
            if (weakHashMap != null) {
                Iterator<View> it = weakHashMap.keySet().iterator();
                while (it.hasNext()) {
                    IAlog.a("%stracking view: %s", b(), it.next());
                }
            }
        }
    }

    public void a(Context context, View view, e eVar) {
        View rootView;
        ViewTreeObserver viewTreeObserver;
        IAlog.a("%strackView called with context: %s view: %s", b(), context, view);
        if (context != null) {
            WeakHashMap<View, e> weakHashMap = this.b.get(context);
            if (weakHashMap == null) {
                weakHashMap = new WeakHashMap<>();
                this.b.put(context, weakHashMap);
                if (context instanceof Activity) {
                    Activity activity = (Activity) context;
                    if (activity.getWindow() != null) {
                        rootView = activity.getWindow().getDecorView();
                        viewTreeObserver = rootView.getViewTreeObserver();
                        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                            c cVar = new c(context);
                            viewTreeObserver.addOnPreDrawListener(cVar);
                            this.a.put(context, new Pair<>(viewTreeObserver, cVar));
                        }
                    }
                }
                rootView = view.getRootView();
                viewTreeObserver = rootView.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    c cVar2 = new c(context);
                    viewTreeObserver.addOnPreDrawListener(cVar2);
                    this.a.put(context, new Pair<>(viewTreeObserver, cVar2));
                }
            }
            weakHashMap.put(view, eVar);
            c();
            return;
        }
        throw new IllegalStateException("View must be attached to an Activity context");
    }

    public void a(View view) {
        IAlog.a("%sunTrackView called with view", b());
        if (view == null) {
            IAlog.a("%sunTrackView called with a null view!", b());
            return;
        }
        Context context = view.getContext();
        if (context == null) {
            IAlog.a("%sview.getContext() returned null!", b());
            return;
        }
        WeakHashMap<View, e> weakHashMap = this.b.get(context);
        if (weakHashMap != null) {
            a(context, weakHashMap, view);
        } else {
            Iterator it = new HashSet(this.b.keySet()).iterator();
            while (it.hasNext()) {
                Context context2 = (Context) it.next();
                WeakHashMap<View, e> weakHashMap2 = this.b.get(context2);
                if (weakHashMap2 != null) {
                    a(context2, weakHashMap2, view);
                }
            }
        }
        c();
    }

    public final void a(Context context, Map<View, e> map, View view) {
        if (map.remove(view) != null) {
            if (IAlog.a <= 2) {
                IAlog.d("removeViewFromContext found view for removal!", new Object[0]);
            }
            if (map.isEmpty()) {
                this.b.remove(context);
                Pair<ViewTreeObserver, ViewTreeObserver.OnPreDrawListener> pair = this.a.get(context);
                if (pair != null) {
                    if (((ViewTreeObserver) pair.first).isAlive()) {
                        ((ViewTreeObserver) pair.first).removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) pair.second);
                    }
                    this.a.remove(context);
                }
            }
        }
    }
}
