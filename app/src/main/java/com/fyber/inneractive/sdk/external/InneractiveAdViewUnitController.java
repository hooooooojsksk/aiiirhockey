package com.fyber.inneractive.sdk.external;

import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.t;
import com.fyber.inneractive.sdk.factories.a;
import com.fyber.inneractive.sdk.factories.c;
import com.fyber.inneractive.sdk.flow.a0;
import com.fyber.inneractive.sdk.flow.c0;
import com.fyber.inneractive.sdk.flow.r;
import com.fyber.inneractive.sdk.flow.u;
import com.fyber.inneractive.sdk.interfaces.c;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.m;
import com.fyber.inneractive.sdk.util.q;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public class InneractiveAdViewUnitController extends c0<InneractiveAdViewEventsListener> implements r.c, InneractiveFullscreenAdActivity.FullScreenRendererProvider {
    public static final int DISABLED_REFRESH_INTERVAL = -1;
    public Set<InneractiveAdRenderer> a;
    public boolean b;
    public View c;
    public int d;
    public int mAdContentHeight;
    public int mAdContentWidth;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
            InneractiveAdViewUnitController.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            InneractiveAdViewUnitController.this.a();
        }
    }

    public InneractiveAdViewUnitController() {
        this.b = false;
        this.mAdContentWidth = -1;
        this.mAdContentHeight = -1;
        this.d = 0;
        this.a = new HashSet();
    }

    public final void a() {
        this.b = true;
        Iterator it = new HashSet(this.a).iterator();
        while (it.hasNext()) {
            ((InneractiveAdRenderer) it.next()).destroy();
        }
        this.a.clear();
        this.c = null;
        super.destroy();
    }

    public void bindView(ViewGroup viewGroup) {
        com.fyber.inneractive.sdk.interfaces.b bVar;
        IAlog.a("%sPPPP bindView called with parent: %s", logPrefix(), viewGroup);
        InneractiveAdSpot adSpot = getAdSpot();
        if (adSpot == null) {
            IAlog.e("InneractiveFullscreenUnitController was not attached to an ad spot", new Object[0]);
            return;
        }
        IAlog.a("%sPPPP bindView spot is %s", logPrefix(), adSpot);
        Iterator it = new HashSet(this.a).iterator();
        while (it.hasNext()) {
            InneractiveAdRenderer inneractiveAdRenderer = (InneractiveAdRenderer) it.next();
            if (inneractiveAdRenderer instanceof com.fyber.inneractive.sdk.interfaces.b) {
                com.fyber.inneractive.sdk.interfaces.b bVar2 = (com.fyber.inneractive.sdk.interfaces.b) inneractiveAdRenderer;
                if (bVar2.a((View) viewGroup)) {
                    bVar2.n();
                    IAlog.a("%sPPPP bindAdToRenderer returning an already attached renderer %s", logPrefix(), bVar2);
                    return;
                }
            }
        }
        this.c = viewGroup;
        Iterator<a.InterfaceC0015a> it2 = a.b.a.a.iterator();
        while (true) {
            if (!it2.hasNext()) {
                bVar = null;
                break;
            }
            a.InterfaceC0015a next = it2.next();
            if (next.a(adSpot)) {
                bVar = next.b(adSpot);
                break;
            }
        }
        int i = this.d;
        if (i != 0) {
            bVar.a(i);
        }
        if (bVar == null) {
            IAlog.e("%sCould not find a renderer for the given spot! Did you add the appropriate module to your project?", logPrefix());
            return;
        }
        bVar.initialize(adSpot);
        selectContentController();
        bVar.a(viewGroup);
        this.a.add(bVar);
        IAlog.a("%sPPPP bindView created renderer %s", logPrefix(), bVar);
    }

    @Override // com.fyber.inneractive.sdk.flow.c0
    public boolean canRefreshAd() {
        if (supportsRefresh()) {
            for (InneractiveAdRenderer inneractiveAdRenderer : this.a) {
                if (!inneractiveAdRenderer.canRefreshAd()) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.flow.c0, com.fyber.inneractive.sdk.external.InneractiveUnitController
    public void destroy() {
        if (Looper.myLooper() != null && Looper.getMainLooper() == Looper.myLooper()) {
            a();
        } else {
            m.b.post(new a());
        }
    }

    public int getAdContentHeight() {
        int p;
        for (InneractiveAdRenderer inneractiveAdRenderer : this.a) {
            if ((inneractiveAdRenderer instanceof com.fyber.inneractive.sdk.interfaces.b) && (p = ((com.fyber.inneractive.sdk.interfaces.b) inneractiveAdRenderer).p()) > 0) {
                return p;
            }
        }
        return this.mAdContentHeight;
    }

    public int getAdContentWidth() {
        int f;
        for (InneractiveAdRenderer inneractiveAdRenderer : this.a) {
            if ((inneractiveAdRenderer instanceof com.fyber.inneractive.sdk.interfaces.b) && (f = ((com.fyber.inneractive.sdk.interfaces.b) inneractiveAdRenderer).f()) > 0) {
                return f;
            }
        }
        return this.mAdContentWidth;
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity.FullScreenRendererProvider
    public c getFullscreenRenderer() {
        c a2 = c.b.a.a((InneractiveAdSpot) q.a(this.mAdSpot));
        this.a.add(a2);
        return a2;
    }

    @Override // com.fyber.inneractive.sdk.flow.c0, com.fyber.inneractive.sdk.external.InneractiveUnitController
    public InneractiveContentController getSelectedContentController() {
        return this.mSelectedContentController;
    }

    @Override // com.fyber.inneractive.sdk.flow.r.c
    public void onAdRefreshFailed(InneractiveAdSpot inneractiveAdSpot, InneractiveErrorCode inneractiveErrorCode) {
        Iterator it = new HashSet(this.a).iterator();
        while (it.hasNext()) {
            InneractiveAdRenderer inneractiveAdRenderer = (InneractiveAdRenderer) it.next();
            if (inneractiveAdRenderer instanceof com.fyber.inneractive.sdk.interfaces.b) {
                ((com.fyber.inneractive.sdk.interfaces.b) inneractiveAdRenderer).r();
                return;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.r.c
    public void onAdRefreshed(InneractiveAdSpot inneractiveAdSpot) {
        com.fyber.inneractive.sdk.interfaces.b bVar;
        Iterator it = new HashSet(this.a).iterator();
        while (true) {
            if (!it.hasNext()) {
                bVar = null;
                break;
            }
            InneractiveAdRenderer inneractiveAdRenderer = (InneractiveAdRenderer) it.next();
            if (inneractiveAdRenderer instanceof com.fyber.inneractive.sdk.interfaces.b) {
                bVar = (com.fyber.inneractive.sdk.interfaces.b) inneractiveAdRenderer;
                if (bVar.a(inneractiveAdSpot.getAdContent())) {
                    break;
                }
            }
        }
        if (bVar != null) {
            bVar.a((ViewGroup) null);
        } else {
            onAdRefreshFailed(inneractiveAdSpot, InneractiveErrorCode.SDK_INTERNAL_ERROR);
        }
        try {
            if (inneractiveAdSpot instanceof r) {
                int i = IAlog.a;
                IAlog.a(1, null, "%s %s", "AD_REFRESH", ((r) inneractiveAdSpot).h.g.f.a());
            }
        } catch (Exception unused) {
        }
        IAlog.a("InneractiveFullscreenUnitController onAdRefreshed called", new Object[0]);
    }

    public void refreshAd() {
        IAlog.a("InneractiveFullscreenUnitController refreshAd called", new Object[0]);
        InneractiveAdSpot inneractiveAdSpot = (InneractiveAdSpot) q.a(this.mAdSpot);
        if (inneractiveAdSpot == null || !(inneractiveAdSpot instanceof a0)) {
            return;
        }
        ((a0) inneractiveAdSpot).a(this);
    }

    @Override // com.fyber.inneractive.sdk.flow.c0
    public boolean supports(InneractiveAdSpot inneractiveAdSpot) {
        com.fyber.inneractive.sdk.config.a0 a0Var = (com.fyber.inneractive.sdk.config.a0) inneractiveAdSpot.getAdContent().d;
        if (a0Var.e != null) {
            return false;
        }
        t tVar = a0Var.c;
        if (tVar != null) {
            if (UnitDisplayType.BANNER.equals(tVar.b) || UnitDisplayType.MRECT.equals(tVar.b)) {
                return true;
            }
            if (UnitDisplayType.INTERSTITIAL.equals(tVar.b)) {
                return !inneractiveAdSpot.getCurrentProcessedRequest().getAllowFullscreen();
            }
        }
        com.fyber.inneractive.sdk.config.c0 c0Var = a0Var.f;
        return c0Var != null && (UnitDisplayType.LANDSCAPE.equals(c0Var.j) || UnitDisplayType.SQUARE.equals(c0Var.j) || UnitDisplayType.MRECT.equals(c0Var.j));
    }

    @Override // com.fyber.inneractive.sdk.flow.c0
    public boolean supportsRefresh() {
        return true;
    }

    public void unbindFullscreenRenderer(com.fyber.inneractive.sdk.interfaces.c cVar) {
        WeakReference<u> weakReference;
        IAlog.a("%sremoving full screen ad renderer %s", logPrefix(), cVar);
        Set<InneractiveAdRenderer> set = this.a;
        if (set != null) {
            set.remove(cVar);
        }
        if (this.b) {
            return;
        }
        Iterator it = new HashSet(this.a).iterator();
        while (it.hasNext()) {
            InneractiveAdRenderer inneractiveAdRenderer = (InneractiveAdRenderer) it.next();
            if (inneractiveAdRenderer instanceof com.fyber.inneractive.sdk.interfaces.b) {
                ((com.fyber.inneractive.sdk.interfaces.b) inneractiveAdRenderer).a();
                if (this.mEventsListener != 0 && (weakReference = this.mAdSpot) != null && weakReference.get() != null) {
                    ((InneractiveAdViewEventsListener) this.mEventsListener).onAdCollapsed(this.mAdSpot.get());
                }
            }
        }
    }

    public void unbindView(View view) {
        if (this.c != view) {
            IAlog.e("%s unbindView invoked with incorrect view, was - %s received - %s", logPrefix(), this.c, view);
        } else {
            this.c = null;
        }
        IAlog.a("%sPPPP unbindView called with %s", logPrefix(), view);
        IAlog.a("%sPPPP spot is %s", logPrefix(), this.mAdSpot);
        Iterator it = new HashSet(this.a).iterator();
        while (it.hasNext()) {
            InneractiveAdRenderer inneractiveAdRenderer = (InneractiveAdRenderer) it.next();
            if (inneractiveAdRenderer instanceof com.fyber.inneractive.sdk.interfaces.b) {
                com.fyber.inneractive.sdk.interfaces.b bVar = (com.fyber.inneractive.sdk.interfaces.b) inneractiveAdRenderer;
                if (bVar.a(view)) {
                    IAlog.a("%sPPPP unbindView unbinding renderer %s", logPrefix(), inneractiveAdRenderer);
                    bVar.u();
                    this.a.remove(bVar);
                    return;
                }
            }
        }
    }

    public InneractiveAdViewUnitController(int i) {
        this();
        if (i >= 30) {
            IAlog.a("InneractiveAdViewUnitController: Overriding remote config refresh interval to: %d", Integer.valueOf(i));
            this.d = i;
            return;
        }
        IAlog.a("InneractiveAdViewUnitController: Overriding remote config refresh interval - value too low. Setting to default: %d -> %d", Integer.valueOf(i), 30);
        this.d = 30;
    }

    public InneractiveAdViewUnitController(boolean z) {
        this();
        if (z) {
            this.d = -1;
        }
    }
}
