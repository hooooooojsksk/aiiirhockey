package com.fyber.inneractive.sdk.renderers;

import android.content.Context;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.RelativeLayout;
import com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.a0;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.f0;
import com.fyber.inneractive.sdk.config.global.features.q;
import com.fyber.inneractive.sdk.config.global.features.r;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenVideoContentController;
import com.fyber.inneractive.sdk.external.WebViewRendererProcessHasGoneError;
import com.fyber.inneractive.sdk.flow.d0;
import com.fyber.inneractive.sdk.flow.x;
import com.fyber.inneractive.sdk.interfaces.c;
import com.fyber.inneractive.sdk.model.vast.s;
import com.fyber.inneractive.sdk.player.b;
import com.fyber.inneractive.sdk.player.controller.u;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.k0;
import com.fyber.inneractive.sdk.util.x;
import com.fyber.inneractive.sdk.web.b;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class m extends x<d0, InneractiveFullscreenAdEventsListener> implements u {
    public WeakReference<InneractiveFullscreenVideoContentController> A;
    public c.b E;
    public n G;
    public c.a x;
    public com.fyber.inneractive.sdk.player.ui.h y;
    public com.fyber.inneractive.sdk.player.controller.b z;
    public boolean B = false;
    public boolean C = false;
    public boolean D = false;
    public UnitDisplayType F = UnitDisplayType.INTERSTITIAL;
    public boolean H = false;
    public final b.d I = new a();
    public final RelativeLayout.LayoutParams J = new RelativeLayout.LayoutParams(-1, -1);
    public boolean K = false;
    public boolean L = false;

    /* loaded from: classes.dex */
    public class a implements b.d {
        public a() {
            m.this = r1;
        }

        @Override // com.fyber.inneractive.sdk.player.b.d
        public void a(com.fyber.inneractive.sdk.player.b bVar) {
            m.this.z.d(false);
            m.this.z.h();
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.p
    public void H() {
        View view = this.k;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public boolean J() {
        return this.K;
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public int L() {
        Integer b;
        AdContent adcontent = this.b;
        if (adcontent != 0) {
            d0 d0Var = (d0) adcontent;
            if (d0Var.c == null || (b = ((q) d0Var.c.a(q.class)).b("close_clickable_area_dp")) == null) {
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
            d0 d0Var = (d0) adcontent;
            if (d0Var.c == null || (b = ((q) d0Var.c.a(q.class)).b("close_visible_size_dp")) == null) {
                return -1;
            }
            return b.intValue();
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x00c6  */
    @Override // com.fyber.inneractive.sdk.flow.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long N() {
        /*
            Method dump skipped, instructions count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.renderers.m.N():long");
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public boolean O() {
        com.fyber.inneractive.sdk.player.ui.h hVar = this.y;
        return hVar != null && ((com.fyber.inneractive.sdk.player.ui.l) hVar).f();
    }

    public final void R() {
        c.a aVar = this.x;
        if (aVar != null) {
            aVar.destroy();
        }
    }

    public void S() {
        if (this.C || this.c == 0) {
            return;
        }
        boolean z = true;
        this.C = true;
        c.a aVar = this.x;
        if (aVar == null || (!aVar.wasDismissedByUser() && !IAConfigManager.M.u.b.a("endcard").a("dsos", false))) {
            z = false;
        }
        if (z) {
            a(s.EVENT_CLOSE);
            a(s.EVENT_CLOSE_LINEAR);
        }
        ((InneractiveFullscreenAdEventsListener) this.c).onAdDismissed(this.a);
    }

    public final void T() {
        AdContent adcontent = this.b;
        if (adcontent != 0) {
            d0 d0Var = (d0) adcontent;
            if (d0Var.d == null || ((a0) d0Var.d).c == null) {
                return;
            }
            IAConfigManager.M.x.a(((a0) d0Var.d).c.b == UnitDisplayType.REWARDED ? com.fyber.inneractive.sdk.cache.session.enums.b.REWARDED_VIDEO : com.fyber.inneractive.sdk.cache.session.enums.b.INTERSTITIAL_VIDEO, com.fyber.inneractive.sdk.cache.session.enums.a.CLICK);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0102  */
    @Override // com.fyber.inneractive.sdk.flow.x, com.fyber.inneractive.sdk.interfaces.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.fyber.inneractive.sdk.interfaces.c.a r5, android.app.Activity r6) throws com.fyber.inneractive.sdk.external.InneractiveUnitController.AdDisplayError {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.renderers.m.a(com.fyber.inneractive.sdk.interfaces.c$a, android.app.Activity):void");
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c
    public void b() {
    }

    @Override // com.fyber.inneractive.sdk.flow.x, com.fyber.inneractive.sdk.flow.p, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public void destroy() {
        R();
        if (this.B) {
            S();
        }
        com.fyber.inneractive.sdk.player.controller.b bVar = this.z;
        if (bVar != null) {
            bVar.destroy();
            this.z = null;
        }
        com.fyber.inneractive.sdk.player.ui.h hVar = this.y;
        if (hVar != null) {
            hVar.destroy();
            this.y = null;
        }
        this.x = null;
        this.A = null;
        super.destroy();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.u
    public void e() {
        if (!this.D) {
            this.v.a(true);
        }
        this.D = true;
    }

    public final void f(boolean z) {
        com.fyber.inneractive.sdk.player.ui.h hVar = this.y;
        if ((hVar != null && ((com.fyber.inneractive.sdk.player.ui.l) hVar).f()) && this.K) {
            return;
        }
        if (z) {
            com.fyber.inneractive.sdk.player.controller.b bVar = this.z;
            String str = null;
            com.fyber.inneractive.sdk.flow.vast.e c = bVar != null ? bVar.c() : null;
            if (c != null && c.c) {
                com.fyber.inneractive.sdk.util.e eVar = com.fyber.inneractive.sdk.util.e.FMP_ENDCARD;
                eVar.a(c.d);
                str = eVar.toString();
            }
            this.v.a(str);
            return;
        }
        this.v.a();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.u
    public void g() {
        com.fyber.inneractive.sdk.model.vast.c cVar;
        com.fyber.inneractive.sdk.model.vast.h hVar;
        AdContent adcontent = this.b;
        if (adcontent != 0) {
            d0 d0Var = (d0) adcontent;
            if (d0Var.a == null || d0Var.b == 0) {
                return;
            }
            String str = null;
            T();
            com.fyber.inneractive.sdk.model.vast.b bVar = ((com.fyber.inneractive.sdk.response.g) ((d0) this.b).b).J;
            if (bVar != null && (cVar = bVar.h) != null && (hVar = cVar.b) != null) {
                str = hVar.toString();
            }
            a(str);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.u
    public void h() {
        this.K = true;
        CountDownTimer countDownTimer = this.w;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.w = null;
        }
        if (!this.t) {
            this.t = true;
            c.a aVar = this.x;
            if (aVar != null) {
                d(aVar.isCloseButtonDisplay());
            }
        }
        c.a aVar2 = this.x;
        if (aVar2 == null || !aVar2.isCloseButtonDisplay()) {
            return;
        }
        e(true ^ this.u);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.u
    public void j() {
        c.a aVar = this.x;
        if (aVar != null) {
            aVar.dismissAd(false);
        }
        a(new WebViewRendererProcessHasGoneError());
    }

    @Override // com.fyber.inneractive.sdk.player.controller.u
    public void k() {
        c.a aVar = this.x;
        if (aVar != null) {
            aVar.dismissAd(true);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.u
    public void l() {
        IAConfigManager.M.x.a(this.F == UnitDisplayType.INTERSTITIAL ? com.fyber.inneractive.sdk.cache.session.enums.b.INTERSTITIAL_VIDEO : com.fyber.inneractive.sdk.cache.session.enums.b.REWARDED_VIDEO, com.fyber.inneractive.sdk.cache.session.enums.a.IMPRESSION);
        E();
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c
    public void m() {
        S();
        InneractiveAdSpot inneractiveAdSpot = this.a;
        if (inneractiveAdSpot == null || !(inneractiveAdSpot instanceof com.fyber.inneractive.sdk.flow.u)) {
            return;
        }
        ((com.fyber.inneractive.sdk.flow.u) inneractiveAdSpot).a();
    }

    @Override // com.fyber.inneractive.sdk.flow.x, com.fyber.inneractive.sdk.interfaces.c
    public void o() {
        super.o();
        this.v.b();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.u
    public void onCompleted() {
        InneractiveFullscreenVideoContentController inneractiveFullscreenVideoContentController = (InneractiveFullscreenVideoContentController) com.fyber.inneractive.sdk.util.q.a(this.A);
        if (inneractiveFullscreenVideoContentController != null) {
            inneractiveFullscreenVideoContentController.onCompleted();
        }
        f0 f0Var = IAConfigManager.M.x;
        UnitDisplayType unitDisplayType = this.F;
        UnitDisplayType unitDisplayType2 = UnitDisplayType.REWARDED;
        f0Var.a(unitDisplayType == unitDisplayType2 ? com.fyber.inneractive.sdk.cache.session.enums.b.REWARDED_VIDEO : com.fyber.inneractive.sdk.cache.session.enums.b.INTERSTITIAL_VIDEO, com.fyber.inneractive.sdk.cache.session.enums.a.COMPLETION);
        if (this.F == unitDisplayType2) {
            c.b bVar = this.E;
            if (bVar != null) {
                ((InneractiveFullscreenUnitController.a) bVar).a();
            }
            I();
        }
        AdContent adcontent = this.b;
        if (adcontent == 0 || ((d0) adcontent).i == null) {
            return;
        }
        K();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.u
    public void onPlayerError() {
        InneractiveFullscreenVideoContentController inneractiveFullscreenVideoContentController = (InneractiveFullscreenVideoContentController) com.fyber.inneractive.sdk.util.q.a(this.A);
        c.a aVar = this.x;
        if (aVar != null) {
            aVar.dismissAd(false);
        }
        if (inneractiveFullscreenVideoContentController != null) {
            inneractiveFullscreenVideoContentController.onPlayerError();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.u
    public void onProgress(int i, int i2) {
        InneractiveFullscreenVideoContentController inneractiveFullscreenVideoContentController = (InneractiveFullscreenVideoContentController) com.fyber.inneractive.sdk.util.q.a(this.A);
        if (inneractiveFullscreenVideoContentController != null) {
            inneractiveFullscreenVideoContentController.onProgress(i, i2);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.u
    public void s() {
        D();
    }

    @Override // com.fyber.inneractive.sdk.flow.x, com.fyber.inneractive.sdk.interfaces.c
    public void t() {
        super.t();
        com.fyber.inneractive.sdk.util.a aVar = this.v;
        if (aVar.b) {
            aVar.e = System.currentTimeMillis();
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c
    public boolean v() {
        com.fyber.inneractive.sdk.player.controller.b bVar;
        c.a aVar;
        com.fyber.inneractive.sdk.player.ui.h hVar;
        AdContent adcontent = this.b;
        if (adcontent != 0) {
            d0 d0Var = (d0) adcontent;
            if (d0Var.i != null && (bVar = this.z) != null && (aVar = this.x) != null && (hVar = this.y) != null) {
                ((com.fyber.inneractive.sdk.player.e) d0Var.i.f).getClass();
                if (bVar == null) {
                    aVar.dismissAd(true);
                    return true;
                } else if (((com.fyber.inneractive.sdk.player.ui.l) hVar).f()) {
                    if (this.q) {
                        aVar.dismissAd(true);
                        return true;
                    }
                    return true;
                } else if (bVar.e()) {
                    bVar.c(true);
                    return true;
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.flow.p
    public void x() {
        View view = this.k;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0034  */
    @Override // com.fyber.inneractive.sdk.flow.x, com.fyber.inneractive.sdk.interfaces.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(boolean r7) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.renderers.m.b(boolean):void");
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c
    public void a(c.b bVar) {
        this.E = bVar;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.u
    public x.a a(k0 k0Var, com.fyber.inneractive.sdk.util.e eVar) {
        Context context;
        T();
        if (this.y.getContext() == null) {
            context = com.fyber.inneractive.sdk.util.l.a;
        } else {
            context = this.y.getContext();
        }
        AdContent adcontent = this.b;
        return a(context, adcontent != 0 ? ((d0) adcontent).k() : null, k0Var, eVar);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.u
    public void a(boolean z, Orientation orientation) {
        c.a aVar = this.x;
        if (aVar != null) {
            aVar.setActivityOrientation(z, orientation);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.u
    public void a(String str, String str2) {
        IAlog.a(IAlog.a(this) + "full screen video ad renderer callback: onSuspiciousNoUserWebActionDetected", new Object[0]);
        c.a aVar = this.x;
        if (aVar == null || aVar.getLayout() == null || this.x.getLayout().getContext() == null) {
            return;
        }
        if (!this.L) {
            com.fyber.inneractive.sdk.network.s.a(this.x.getLayout().getContext(), str, str2, this.b);
            this.L = true;
            IAlog.a(IAlog.a(this) + "reporting auto redirect", new Object[0]);
            return;
        }
        IAlog.a(IAlog.a(this) + "redirect already reported for this ad", new Object[0]);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.u
    public x.a a(String str, k0 k0Var, b.a aVar, boolean z) {
        Context context;
        com.fyber.inneractive.sdk.model.vast.h hVar;
        if (this.F == UnitDisplayType.INTERSTITIAL) {
            this.H = true;
        }
        AdContent adcontent = this.b;
        if (adcontent != 0) {
            d0 d0Var = (d0) adcontent;
            if (d0Var.b != 0 && d0Var.b != 0) {
                com.fyber.inneractive.sdk.model.vast.b bVar = ((com.fyber.inneractive.sdk.response.g) d0Var.b).J;
                T();
                if (bVar != null) {
                    com.fyber.inneractive.sdk.model.vast.c cVar = bVar.h;
                    a((cVar == null || (hVar = cVar.b) == null || z) ? null : hVar.toString());
                    com.fyber.inneractive.sdk.util.e eVar = z ? com.fyber.inneractive.sdk.util.e.DEFAULT_ENDCARD : com.fyber.inneractive.sdk.util.e.VAST_ENDCARD;
                    com.fyber.inneractive.sdk.player.controller.b bVar2 = this.z;
                    com.fyber.inneractive.sdk.flow.vast.e c = bVar2 != null ? bVar2.c() : null;
                    if (aVar != null) {
                        eVar = com.fyber.inneractive.sdk.util.e.FMP_ENDCARD;
                        eVar.a(aVar.a);
                        eVar.a(aVar.b);
                    } else if (c != null && c.c) {
                        eVar = com.fyber.inneractive.sdk.util.e.FMP_ENDCARD;
                        eVar.a(c.e);
                        eVar.a(c.d);
                    }
                    if (this.y.getContext() == null) {
                        context = com.fyber.inneractive.sdk.util.l.a;
                    } else {
                        context = this.y.getContext();
                    }
                    x.a a2 = a(context, str, k0Var, eVar);
                    if (cVar != null && a2.a != x.d.FAILED) {
                        String[] strArr = {s.EVENT_CLICK.toString()};
                        com.fyber.inneractive.sdk.player.h hVar2 = ((d0) this.b).i;
                        if (hVar2 != null) {
                            hVar2.a("EVENT_TRACKING", strArr);
                        }
                    }
                    return a2;
                }
            }
        }
        return new x.a(x.d.FAILED, new Exception("Internal SDK Error"), "null");
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    /* renamed from: a */
    public boolean b(d0 d0Var) {
        com.fyber.inneractive.sdk.config.h hVar;
        T t;
        com.fyber.inneractive.sdk.model.vast.b bVar;
        com.fyber.inneractive.sdk.model.vast.c cVar;
        IAConfigManager iAConfigManager = IAConfigManager.M;
        com.fyber.inneractive.sdk.config.i iVar = iAConfigManager.u.b;
        iVar.getClass();
        String str = iAConfigManager.d;
        if (iVar.b.containsKey(str)) {
            hVar = iVar.b.get(str);
        } else {
            hVar = new com.fyber.inneractive.sdk.config.h();
        }
        if (hVar.a.containsKey("endcard") || (t = d0Var.b) == 0 || (bVar = ((com.fyber.inneractive.sdk.response.g) t).J) == null || (cVar = bVar.h) == null || cVar.a != com.fyber.inneractive.sdk.model.vast.g.Static) {
            return false;
        }
        r rVar = (r) d0Var.c.a(r.class);
        UnitDisplayType unitDisplayType = this.F;
        rVar.getClass();
        int i = r.a.a[unitDisplayType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            return rVar.a("countdown_iv", false);
        }
        return rVar.a("countdown_rv", false);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.u
    public void a(boolean z) {
        com.fyber.inneractive.sdk.player.h hVar;
        AdContent adcontent = this.b;
        if (adcontent == 0 || (hVar = ((d0) adcontent).i) == null) {
            return;
        }
        hVar.a("TRACKING_COMPLETED", new String[0]);
        K();
        String[] strArr = new String[0];
        com.fyber.inneractive.sdk.player.h hVar2 = ((d0) this.b).i;
        if (hVar2 != null) {
            hVar2.a("TRACKING_COMPLETED", strArr);
        }
        if (IAConfigManager.M.u.b.a("endcard").a("dsos", false) && z) {
            R();
        }
        f(z);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.u
    public void a(View view, String str) {
        if (view == null || view.getContext() == null) {
            return;
        }
        InneractiveRichMediaVideoPlayerActivityCore.startRichMediaIntent(view.getContext(), str);
        D();
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public long a(long j) {
        if (this.u) {
            return j;
        }
        com.fyber.inneractive.sdk.config.i iVar = IAConfigManager.M.u.b;
        long j2 = 12;
        String l = Long.toString(12L);
        if (iVar.a.containsKey("vast_endcard_x_fallback_delay")) {
            l = iVar.a.get("vast_endcard_x_fallback_delay");
        }
        try {
            j2 = Long.parseLong(l);
        } catch (Throwable unused) {
        }
        return j2 * 1000;
    }

    public void a(s sVar) {
        AdContent adcontent = this.b;
        if (adcontent != 0) {
            d0 d0Var = (d0) adcontent;
            if (d0Var.i != null) {
                String[] strArr = {sVar.e()};
                com.fyber.inneractive.sdk.player.h hVar = d0Var.i;
                if (hVar != null) {
                    hVar.a("EVENT_TRACKING", strArr);
                }
            }
        }
    }
}
