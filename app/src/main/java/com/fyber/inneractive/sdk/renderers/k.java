package com.fyber.inneractive.sdk.renderers;

import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.a0;
import com.fyber.inneractive.sdk.config.b0;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.s;
import com.fyber.inneractive.sdk.config.t;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.flow.o;
import com.fyber.inneractive.sdk.flow.u;
import com.fyber.inneractive.sdk.flow.x;
import com.fyber.inneractive.sdk.flow.z;
import com.fyber.inneractive.sdk.interfaces.c;
import com.fyber.inneractive.sdk.measurement.tracker.c;
import com.fyber.inneractive.sdk.network.p;
import com.fyber.inneractive.sdk.network.q;
import com.fyber.inneractive.sdk.ui.FyberAdIdentifier;
import com.fyber.inneractive.sdk.ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g0;
import com.fyber.inneractive.sdk.util.t0;
import com.fyber.inneractive.sdk.util.w;
import com.fyber.inneractive.sdk.web.i;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class k extends x<z, InneractiveFullscreenAdEventsListener> {
    public t0 F;
    public c.b J;
    public g0 K;
    public i.f x;
    public IAmraidWebViewController z;
    public boolean y = false;
    public boolean A = false;
    public boolean B = false;
    public boolean C = false;
    public boolean D = false;
    public boolean E = false;
    public UnitDisplayType G = UnitDisplayType.INTERSTITIAL;
    public boolean H = false;
    public boolean I = false;

    /* loaded from: classes.dex */
    public class a implements t0.b {
        public a() {
            k.this = r1;
        }

        @Override // com.fyber.inneractive.sdk.util.t0.b
        public void a(t0 t0Var) {
            k.this.H = true;
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public boolean J() {
        return !this.C && this.z.a0;
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public int L() {
        Integer b;
        AdContent adcontent = this.b;
        if (adcontent != 0) {
            z zVar = (z) adcontent;
            if (zVar.c == null || zVar.c.a(com.fyber.inneractive.sdk.config.global.features.e.class) == null || (b = ((com.fyber.inneractive.sdk.config.global.features.e) ((z) this.b).c.a(com.fyber.inneractive.sdk.config.global.features.e.class)).b("close_clickable_area_dp")) == null) {
                return -1;
            }
            return b.intValue();
        }
        return -1;
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public int M() {
        Integer b;
        AdContent adcontent = this.b;
        if (adcontent != 0) {
            z zVar = (z) adcontent;
            if (zVar.c == null || zVar.c.a(com.fyber.inneractive.sdk.config.global.features.e.class) == null || (b = ((com.fyber.inneractive.sdk.config.global.features.e) ((z) this.b).c.a(com.fyber.inneractive.sdk.config.global.features.e.class)).b("close_visible_size_dp")) == null) {
                return -1;
            }
            return b.intValue();
        }
        return -1;
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public long N() {
        int min;
        int i = 2;
        if (this.G == UnitDisplayType.REWARDED) {
            int a2 = IAConfigManager.M.u.b.a("rewarded_mraid_delay", 31, 30);
            IAlog.a("%sGetting rewarded total delay of %d seconds", IAlog.a(this), Integer.valueOf(a2));
            i = a2;
        } else {
            com.fyber.inneractive.sdk.config.i iVar = IAConfigManager.M.u.b;
            String l = Long.toString(2L);
            if (iVar.a.containsKey("mraid_x_delay")) {
                l = iVar.a.get("mraid_x_delay");
            }
            try {
                i = Integer.parseInt(l);
            } catch (Throwable unused) {
            }
        }
        if (InneractiveAdManager.isCurrentUserAChild()) {
            if (B()) {
                min = ((com.fyber.inneractive.sdk.config.global.features.c) ((z) this.b).c.a(com.fyber.inneractive.sdk.config.global.features.c.class)).c();
            } else {
                min = Math.min(i, 5);
            }
            i = Math.min(min, i);
        }
        return i * 1000;
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public boolean O() {
        return false;
    }

    public final void S() {
        IAmraidWebViewController iAmraidWebViewController;
        if (this.b != 0 && (iAmraidWebViewController = this.z) != null) {
            com.fyber.inneractive.sdk.web.g gVar = iAmraidWebViewController.b;
            if (gVar != null) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                layoutParams.gravity = 17;
                gVar.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        IAlog.a("updateWebViewLayoutParams called, but web view is invalid", new Object[0]);
    }

    @Override // com.fyber.inneractive.sdk.flow.x, com.fyber.inneractive.sdk.flow.p, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public void destroy() {
        EventsListener eventslistener;
        if (this.A && !this.B && (eventslistener = this.c) != 0) {
            this.B = true;
            ((InneractiveFullscreenAdEventsListener) eventslistener).onAdDismissed(this.a);
        }
        this.x = null;
        t0 t0Var = this.F;
        if (t0Var != null) {
            t0Var.e = null;
            this.F = null;
        }
        super.destroy();
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c
    public void m() {
        s sVar;
        EventsListener eventslistener;
        if (this.G == UnitDisplayType.REWARDED && this.H) {
            R();
        }
        if (!this.B && (eventslistener = this.c) != 0) {
            this.B = true;
            ((InneractiveFullscreenAdEventsListener) eventslistener).onAdDismissed(this.a);
        }
        g0 g0Var = this.K;
        if (g0Var != null) {
            long j = g0Var.b;
            if (j != 0) {
                String a2 = w.a(j, g0Var.d);
                g0Var.b = 0L;
                g0Var.c = 0L;
                g0Var.d = 0L;
                InneractiveAdSpot inneractiveAdSpot = g0Var.a;
                o adContent = inneractiveAdSpot != null ? inneractiveAdSpot.getAdContent() : null;
                q.a aVar = new q.a(p.INTERSTITIAL_VIEW_TIME, adContent != null ? adContent.a : null, adContent != null ? adContent.d() : null, (adContent == null || (sVar = adContent.c) == null) ? null : sVar.c());
                aVar.a("time", a2);
                aVar.a((String) null);
            }
        }
        InneractiveAdSpot inneractiveAdSpot2 = this.a;
        if (inneractiveAdSpot2 == null || !(inneractiveAdSpot2 instanceof u)) {
            return;
        }
        ((u) inneractiveAdSpot2).a();
    }

    @Override // com.fyber.inneractive.sdk.flow.x, com.fyber.inneractive.sdk.interfaces.c
    public void o() {
        t0 t0Var;
        super.o();
        if (this.G == UnitDisplayType.REWARDED && (t0Var = this.F) != null) {
            t0Var.b();
        }
        g0 g0Var = this.K;
        if (g0Var != null) {
            if (g0Var.b == 0) {
                g0Var.b = System.currentTimeMillis();
            }
            if (g0Var.c > 0) {
                g0Var.d += System.currentTimeMillis() - g0Var.c;
                g0Var.c = 0L;
            }
        }
        this.v.b();
    }

    @Override // com.fyber.inneractive.sdk.flow.x, com.fyber.inneractive.sdk.interfaces.c
    public void t() {
        t0 t0Var;
        super.t();
        if (this.G == UnitDisplayType.REWARDED && (t0Var = this.F) != null) {
            t0Var.a();
        }
        g0 g0Var = this.K;
        if (g0Var != null) {
            g0Var.c = System.currentTimeMillis();
        }
        com.fyber.inneractive.sdk.util.a aVar = this.v;
        if (aVar.b) {
            aVar.e = System.currentTimeMillis();
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c
    public boolean v() {
        boolean z;
        if (this.l == null) {
            z = true;
        } else if (this.G == UnitDisplayType.REWARDED) {
            if (this.H) {
                R();
            }
            z = this.H;
        } else {
            z = this.q;
        }
        if (z) {
            c.a aVar = this.l;
            if (aVar != null) {
                aVar.dismissAd(true);
                return true;
            }
            return false;
        }
        return true;
    }

    public final void R() {
        IAlog.a("%sprovide reward called", IAlog.a(this));
        if (this.I) {
            IAlog.a("%sreward was already provided", IAlog.a(this));
            return;
        }
        IAlog.a("%sreward sent", IAlog.a(this));
        if (this.J != null) {
            a(com.fyber.inneractive.sdk.cache.session.enums.a.COMPLETION, com.fyber.inneractive.sdk.cache.session.enums.b.REWARDED_DISPLAY);
            ((InneractiveFullscreenUnitController.a) this.J).a();
        }
        IAmraidWebViewController iAmraidWebViewController = this.z;
        if (iAmraidWebViewController == null || !iAmraidWebViewController.F) {
            I();
        }
        this.I = true;
    }

    @Override // com.fyber.inneractive.sdk.flow.x, com.fyber.inneractive.sdk.interfaces.c
    public void a(c.a aVar, Activity activity) throws InneractiveUnitController.AdDisplayError, Resources.NotFoundException {
        b0 b0Var;
        super.a(aVar, activity);
        AdContent adcontent = this.b;
        t tVar = (adcontent == 0 || (b0Var = ((z) adcontent).d) == null) ? null : ((a0) b0Var).c;
        if (tVar != null) {
            IAmraidWebViewController iAmraidWebViewController = adcontent != 0 ? ((z) adcontent).i : null;
            this.z = iAmraidWebViewController;
            if (iAmraidWebViewController != null) {
                if (iAmraidWebViewController.b != null) {
                    ((z) adcontent).i();
                    this.G = tVar.b;
                    this.A = false;
                    this.B = false;
                    this.K = new g0(this.a);
                    this.l = aVar;
                    IAmraidWebViewController iAmraidWebViewController2 = this.z;
                    if (iAmraidWebViewController2 == null) {
                        IAlog.e("InneractiveFullscreenMraidAdRenderer.renderAd: Spot ad content is not the right content :( %s", this.b);
                        return;
                    }
                    iAmraidWebViewController2.a(aVar.getCloseButton(), c.EnumC0022c.CloseButton);
                    com.fyber.inneractive.sdk.response.f fVar = (com.fyber.inneractive.sdk.response.f) ((z) this.b).b;
                    int i = fVar.e;
                    int i2 = fVar.f;
                    boolean z = (i == 300 && i2 == 250) || (i == 600 && i2 == 500);
                    this.C = z;
                    if (z) {
                        this.z.setAdDefaultSize(com.fyber.inneractive.sdk.util.l.a(i), com.fyber.inneractive.sdk.util.l.a(i2));
                    }
                    if (this.x == null) {
                        this.x = new l(this);
                    }
                    this.z.setListener(this.x);
                    InneractiveAdSpot inneractiveAdSpot = this.a;
                    if (inneractiveAdSpot != null && inneractiveAdSpot.getAdContent() != null && activity != null) {
                        com.fyber.inneractive.sdk.flow.d dVar = new com.fyber.inneractive.sdk.flow.d(this.a.getAdContent().a, this.a.getAdContent().d(), this.a.getAdContent().c);
                        ViewGroup viewGroup = (ViewGroup) activity.findViewById(R.id.ia_identifier_overlay);
                        dVar.a(viewGroup, FyberAdIdentifier.Corner.BOTTOM_LEFT);
                        viewGroup.setVisibility(0);
                        this.z.a(viewGroup, c.EnumC0022c.IdentifierView);
                    }
                    S();
                    IAmraidWebViewController iAmraidWebViewController3 = this.z;
                    ViewGroup layout = this.l.getLayout();
                    InneractiveAdRequest inneractiveAdRequest = ((z) this.b).a;
                    iAmraidWebViewController3.a(layout, (ViewGroup.LayoutParams) null);
                    this.A = true;
                    if (this.G == UnitDisplayType.REWARDED) {
                        t0 t0Var = new t0(TimeUnit.SECONDS, IAConfigManager.M.u.b.a("rewarded_mraid_delay", 31, 30));
                        this.F = t0Var;
                        t0Var.e = new a();
                        t0Var.c();
                        return;
                    }
                    return;
                }
            }
            IAlog.e("%sWeb view controller content is not valid. Web view might have crashed", IAlog.a(this));
            throw new InneractiveUnitController.AdDisplayError("Web view could not be loaded");
        }
        IAlog.e("%sNo display config for full screen mraid ad renderer! Cannot render", IAlog.a(this));
        throw new InneractiveUnitController.AdDisplayError("No display config for full screen mraid");
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public /* bridge */ /* synthetic */ boolean b(z zVar) {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.flow.p
    public void c(View view) {
        IAmraidWebViewController iAmraidWebViewController = this.z;
        if (iAmraidWebViewController != null) {
            iAmraidWebViewController.a(view);
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c
    public void b() {
        S();
    }

    @Override // com.fyber.inneractive.sdk.flow.x, com.fyber.inneractive.sdk.interfaces.c
    public void b(boolean z) {
        if (!J()) {
            if (z) {
                this.v.a((String) null);
            } else {
                this.v.a();
            }
        }
        c.a aVar = this.l;
        if (aVar != null) {
            aVar.destroy();
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.p
    public void b(View view) {
        IAmraidWebViewController iAmraidWebViewController = this.z;
        if (iAmraidWebViewController != null) {
            iAmraidWebViewController.a(view, c.EnumC0022c.ProgressOverlay);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public long a(long j) {
        if (this.G == UnitDisplayType.REWARDED) {
            return 0L;
        }
        com.fyber.inneractive.sdk.config.i iVar = IAConfigManager.M.u.b;
        long j2 = 13;
        String l = Long.toString(13L);
        if (iVar.a.containsKey("mraid_x_fallback_delay")) {
            l = iVar.a.get("mraid_x_fallback_delay");
        }
        try {
            j2 = Long.parseLong(l);
        } catch (Throwable unused) {
        }
        return j2 * 1000;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c
    public void a(c.b bVar) {
        this.J = bVar;
    }
}
