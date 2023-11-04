package com.fyber.inneractive.sdk.renderers;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity;
import com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController;
import com.fyber.inneractive.sdk.external.InneractiveAdViewVideoContentController;
import com.fyber.inneractive.sdk.external.InneractiveContentController;
import com.fyber.inneractive.sdk.external.InneractiveNativeVideoContentController;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.VideoContentListener;
import com.fyber.inneractive.sdk.external.WebViewRendererProcessHasGoneError;
import com.fyber.inneractive.sdk.flow.d0;
import com.fyber.inneractive.sdk.flow.o;
import com.fyber.inneractive.sdk.flow.p;
import com.fyber.inneractive.sdk.network.s;
import com.fyber.inneractive.sdk.player.b;
import com.fyber.inneractive.sdk.player.controller.r;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.k0;
import com.fyber.inneractive.sdk.util.x;
import com.fyber.inneractive.sdk.util.z;
import com.fyber.inneractive.sdk.web.b;
import com.google.android.gms.drive.DriveFile;

/* loaded from: classes.dex */
public class h extends p<d0, InneractiveAdViewEventsListener> implements com.fyber.inneractive.sdk.interfaces.b, InneractiveNativeVideoContentController.Renderer, z.e {
    public FrameLayout l;
    public com.fyber.inneractive.sdk.player.ui.h m;
    public r n;
    public VideoContentListener o;
    public ViewGroup q;
    public n r;
    public Runnable u;
    public final b.d p = new a();
    public float s = 0.0f;
    public Rect t = new Rect();
    public boolean v = false;
    public final r.a w = new b();

    /* loaded from: classes.dex */
    public class a implements b.d {
        public a() {
            h.this = r1;
        }

        @Override // com.fyber.inneractive.sdk.player.b.d
        public void a(com.fyber.inneractive.sdk.player.b bVar) {
            r rVar = h.this.n;
            if (rVar != null) {
                rVar.d(false);
                h.this.n.h();
            }
        }
    }

    /*  JADX ERROR: NullPointerException in pass: MarkMethodsForInline
        java.lang.NullPointerException
        */
    public static /* synthetic */ boolean a(com.fyber.inneractive.sdk.renderers.h r0, boolean r1) {
        /*
            r0.getClass()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.renderers.h.a(com.fyber.inneractive.sdk.renderers.h, boolean):boolean");
    }

    public final void J() {
        ViewGroup viewGroup;
        Runnable runnable = this.u;
        if (runnable == null || (viewGroup = this.q) == null) {
            return;
        }
        viewGroup.removeCallbacks(runnable);
        this.u = null;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public void a(int i) {
    }

    @Override // com.fyber.inneractive.sdk.flow.p, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public void destroy() {
        u();
        super.destroy();
    }

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public int f() {
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public void n() {
        r rVar = this.n;
        if (rVar != null) {
            rVar.d(false);
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public int p() {
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveNativeVideoContentController.Renderer
    public void pauseVideo() {
        r rVar = this.n;
        if (rVar != null) {
            rVar.pauseVideo();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveNativeVideoContentController.Renderer
    public void playVideo() {
        r rVar = this.n;
        if (rVar != null) {
            rVar.b(0);
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public void r() {
    }

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public void u() {
        J();
        z.d.a.a(this.q);
        IAlog.a("%sunbind called. root is %s", IAlog.a(this), this.q);
        if (this.n != null) {
            IAlog.a("%sdestroying video ui controller", IAlog.a(this));
            this.n.a((r) null);
            this.n.destroy();
            this.n = null;
        }
        if (this.m != null) {
            this.q.setLayoutTransition(null);
            this.q.removeView(this.l);
            this.m.destroy();
            this.m = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.p
    public View y() {
        return this.l;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public boolean a(o oVar) {
        return oVar instanceof d0;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public void a(ViewGroup viewGroup) {
        Bitmap bitmap;
        InneractiveAdSpot inneractiveAdSpot = this.a;
        if (inneractiveAdSpot == null) {
            IAlog.e("%sYou must set the spot to render before calling renderAd", IAlog.a(this));
            return;
        }
        this.q = viewGroup;
        InneractiveUnitController selectedUnitController = inneractiveAdSpot.getSelectedUnitController();
        if (!(selectedUnitController instanceof InneractiveAdViewUnitController)) {
            IAlog.e("%sWrong type of unit controller found. Expecting InneractiveAdViewUnitController", IAlog.a(this));
        } else {
            InneractiveContentController selectedContentController = selectedUnitController.getSelectedContentController();
            if (selectedContentController != null) {
                if (selectedContentController instanceof InneractiveAdViewVideoContentController) {
                    this.o = ((InneractiveAdViewVideoContentController) selectedContentController).getEventsListener();
                } else {
                    IAlog.e("%sContent controller expected to be InneractiveFullscreenVideoContentController and is %s", IAlog.a(this), selectedContentController.getClass().getSimpleName());
                }
            }
        }
        this.v = false;
        this.l = new FrameLayout(viewGroup.getContext());
        AdContent adcontent = this.b;
        com.fyber.inneractive.sdk.player.h hVar = adcontent != 0 ? ((d0) adcontent).i : null;
        Context context = viewGroup.getContext();
        if (hVar != null) {
            ((com.fyber.inneractive.sdk.player.e) hVar.f).getClass();
            com.fyber.inneractive.sdk.renderers.a aVar = new com.fyber.inneractive.sdk.renderers.a(hVar);
            this.r = aVar;
            this.m = aVar.a(context, ((d0) this.b).c);
            this.n = (r) this.r.a(this.a, (d0) this.b);
            this.q.addView(this.l, new ViewGroup.LayoutParams(-1, -2));
            this.q.setLayoutTransition(null);
            this.l.addView((View) this.m, new FrameLayout.LayoutParams(-2, -2, 17));
            this.n.a((r) this.w);
            this.n.d(this.r.c());
            this.r.a(this.p);
            if ((this.r instanceof com.fyber.inneractive.sdk.renderers.a) && (bitmap = ((com.fyber.inneractive.sdk.player.e) hVar.f).l) != null) {
                this.n.a(bitmap);
            }
            z zVar = z.d.a;
            ViewGroup viewGroup2 = this.q;
            zVar.getClass();
            zVar.a(viewGroup2.getContext(), viewGroup2, this);
        }
    }

    /* loaded from: classes.dex */
    public class b implements r.a {
        public b() {
            h.this = r1;
        }

        @Override // com.fyber.inneractive.sdk.player.controller.u
        public void a(String str, String str2) {
            h hVar = h.this;
            hVar.getClass();
            IAlog.a("%s ad view video ad renderer callback: onSuspiciousNoUserWebActionDetected", IAlog.a(hVar));
            ViewGroup viewGroup = h.this.q;
            if (viewGroup == null || viewGroup.getContext() == null) {
                return;
            }
            h hVar2 = h.this;
            if (!hVar2.v) {
                s.a(hVar2.q.getContext(), str, str2, h.this.b);
                h.this.v = true;
                h hVar3 = h.this;
                hVar3.getClass();
                IAlog.a("%s reporting auto redirect", IAlog.a(hVar3));
                return;
            }
            hVar2.getClass();
            IAlog.a("%s redirect already reported for this ad", IAlog.a(hVar2));
        }

        @Override // com.fyber.inneractive.sdk.player.controller.u
        public void a(boolean z) {
        }

        @Override // com.fyber.inneractive.sdk.player.controller.u
        public void a(boolean z, Orientation orientation) {
        }

        @Override // com.fyber.inneractive.sdk.player.controller.r.a
        public void c() {
            com.fyber.inneractive.sdk.display.a cVar;
            h hVar = h.this;
            EventsListener eventslistener = hVar.c;
            if (eventslistener != 0) {
                ((InneractiveAdViewEventsListener) eventslistener).onAdExpanded(hVar.a);
            }
            ViewGroup viewGroup = h.this.q;
            if (viewGroup == null || viewGroup.getContext() == null) {
                return;
            }
            h hVar2 = h.this;
            if (hVar2.b instanceof com.fyber.inneractive.sdk.dv.a) {
                cVar = new com.fyber.inneractive.sdk.display.b();
            } else {
                cVar = new com.fyber.inneractive.sdk.display.c();
            }
            if (cVar instanceof com.fyber.inneractive.sdk.display.c) {
                com.fyber.inneractive.sdk.display.c cVar2 = (com.fyber.inneractive.sdk.display.c) cVar;
                Context context = hVar2.q.getContext();
                InneractiveAdSpot inneractiveAdSpot = h.this.a;
                Intent intent = new Intent(context, InneractiveFullscreenAdActivity.class);
                intent.putExtra("spotId", inneractiveAdSpot.getLocalUniqueId());
                if (!(context instanceof Activity)) {
                    intent.setFlags(DriveFile.MODE_READ_ONLY);
                }
                try {
                    IAlog.a("%sIAInterstitialUtil: Opening interstitial for spot id: %s", IAlog.a(context), inneractiveAdSpot.getLocalUniqueId());
                    context.startActivity(intent);
                } catch (ActivityNotFoundException unused) {
                    IAlog.c("%sIAInterstitialUtil: InneractiveFullscreenAdActivity.class not found. Did you declare InneractiveFullscreenAdActivity in your manifest?", IAlog.a(context));
                }
            }
        }

        @Override // com.fyber.inneractive.sdk.player.controller.u
        public void e() {
        }

        @Override // com.fyber.inneractive.sdk.player.controller.u
        public void g() {
            com.fyber.inneractive.sdk.model.vast.c cVar;
            com.fyber.inneractive.sdk.model.vast.h hVar;
            AdContent adcontent = h.this.b;
            if (adcontent != 0) {
                d0 d0Var = (d0) adcontent;
                if (d0Var.a == null || d0Var.b == 0) {
                    return;
                }
                String str = null;
                com.fyber.inneractive.sdk.model.vast.b bVar = ((com.fyber.inneractive.sdk.response.g) d0Var.b).J;
                if (bVar != null && (cVar = bVar.h) != null && (hVar = cVar.b) != null) {
                    str = hVar.toString();
                }
                h.this.a(str);
            }
        }

        @Override // com.fyber.inneractive.sdk.player.controller.u
        public void h() {
        }

        @Override // com.fyber.inneractive.sdk.player.controller.u
        public void j() {
            h.this.a(new WebViewRendererProcessHasGoneError());
        }

        @Override // com.fyber.inneractive.sdk.player.controller.u
        public void k() {
        }

        @Override // com.fyber.inneractive.sdk.player.controller.u
        public void l() {
            h hVar = h.this;
            d0 d0Var = (d0) hVar.b;
            if (d0Var.j) {
                return;
            }
            d0Var.j = true;
            hVar.E();
        }

        @Override // com.fyber.inneractive.sdk.player.controller.u
        public void onCompleted() {
            com.fyber.inneractive.sdk.player.ui.h hVar;
            h hVar2 = h.this;
            VideoContentListener videoContentListener = hVar2.o;
            if (videoContentListener == null || (hVar = hVar2.m) == null || !((com.fyber.inneractive.sdk.player.ui.d) hVar).e) {
                return;
            }
            videoContentListener.onCompleted();
        }

        @Override // com.fyber.inneractive.sdk.player.controller.u
        public void onPlayerError() {
            com.fyber.inneractive.sdk.player.ui.h hVar;
            h hVar2 = h.this;
            VideoContentListener videoContentListener = hVar2.o;
            if (videoContentListener == null || (hVar = hVar2.m) == null || !((com.fyber.inneractive.sdk.player.ui.d) hVar).e) {
                return;
            }
            videoContentListener.onPlayerError();
        }

        @Override // com.fyber.inneractive.sdk.player.controller.u
        public void onProgress(int i, int i2) {
            com.fyber.inneractive.sdk.player.ui.h hVar;
            h hVar2 = h.this;
            VideoContentListener videoContentListener = hVar2.o;
            if (videoContentListener == null || (hVar = hVar2.m) == null || !((com.fyber.inneractive.sdk.player.ui.d) hVar).e) {
                return;
            }
            videoContentListener.onProgress(i, i2);
        }

        @Override // com.fyber.inneractive.sdk.player.controller.u
        public com.fyber.inneractive.sdk.ignite.k q() {
            return com.fyber.inneractive.sdk.ignite.k.NONE;
        }

        @Override // com.fyber.inneractive.sdk.player.controller.u
        public void s() {
            h hVar = h.this;
            if (hVar.c != 0) {
                hVar.D();
            }
        }

        @Override // com.fyber.inneractive.sdk.player.controller.u
        public void a(View view, String str) {
            if (view == null || view.getContext() == null) {
                return;
            }
            InneractiveRichMediaVideoPlayerActivityCore.startRichMediaIntent(view.getContext(), str);
            h.this.D();
        }

        @Override // com.fyber.inneractive.sdk.player.controller.u
        public x.a a(k0 k0Var, com.fyber.inneractive.sdk.util.e eVar) {
            Context context;
            h hVar = h.this;
            if (hVar.m.getContext() == null) {
                context = com.fyber.inneractive.sdk.util.l.a;
            } else {
                context = h.this.m.getContext();
            }
            AdContent adcontent = h.this.b;
            return hVar.a(context, adcontent != 0 ? ((d0) adcontent).k() : null, k0Var, eVar);
        }

        @Override // com.fyber.inneractive.sdk.player.controller.u
        public x.a a(String str, k0 k0Var, b.a aVar, boolean z) {
            com.fyber.inneractive.sdk.model.vast.c cVar;
            com.fyber.inneractive.sdk.model.vast.h hVar;
            AdContent adcontent = h.this.b;
            if (adcontent != 0) {
                d0 d0Var = (d0) adcontent;
                if (d0Var.a != null && d0Var.b != 0) {
                    com.fyber.inneractive.sdk.model.vast.b bVar = ((com.fyber.inneractive.sdk.response.g) d0Var.b).J;
                    h.this.a((bVar == null || z || (cVar = bVar.h) == null || (hVar = cVar.b) == null) ? null : hVar.toString());
                }
            }
            if (TextUtils.isEmpty(str)) {
                d0 d0Var2 = (d0) h.this.b;
                T t = d0Var2.b;
                if (t != 0) {
                    com.fyber.inneractive.sdk.model.vast.c cVar2 = ((com.fyber.inneractive.sdk.response.g) t).J.h;
                    r0 = cVar2 != null ? cVar2.g : null;
                    if (r0 == null) {
                        str = d0Var2.k();
                    }
                }
                str = r0;
            }
            h hVar2 = h.this;
            Context context = com.fyber.inneractive.sdk.util.l.a;
            ViewGroup viewGroup = hVar2.q;
            if (viewGroup != null && viewGroup.getContext() != null) {
                context = hVar2.q.getContext();
            }
            return hVar2.a(context, str, k0Var, z ? com.fyber.inneractive.sdk.util.e.DEFAULT_ENDCARD : com.fyber.inneractive.sdk.util.e.VAST_ENDCARD);
        }
    }

    @Override // com.fyber.inneractive.sdk.util.z.e
    public void a(View view, float f, Rect rect) {
        if (this.s == f && this.t.equals(rect)) {
            return;
        }
        this.s = f;
        this.t.set(rect);
        r rVar = this.n;
        if (rVar != null) {
            rVar.b(false);
            ((com.fyber.inneractive.sdk.player.ui.d) this.m).b();
            this.n.a(f);
        }
        if (f > 0.0f) {
            J();
            i iVar = new i(this);
            this.u = iVar;
            this.q.postDelayed(iVar, 100L);
            return;
        }
        J();
    }

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public boolean a(View view) {
        return view.equals(this.q);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public void a() {
        r rVar = this.n;
        if (rVar != null) {
            rVar.a();
        }
    }
}
