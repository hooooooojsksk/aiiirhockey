package com.fyber.inneractive.sdk.renderers;

import android.view.View;
import com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.a0;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveNativeAdEventsListener;
import com.fyber.inneractive.sdk.external.WebViewRendererProcessHasGoneError;
import com.fyber.inneractive.sdk.flow.d0;
import com.fyber.inneractive.sdk.flow.x;
import com.fyber.inneractive.sdk.interfaces.c;
import com.fyber.inneractive.sdk.player.controller.u;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.k0;
import com.fyber.inneractive.sdk.util.x;
import com.fyber.inneractive.sdk.web.b;

/* loaded from: classes.dex */
public class j extends x<d0, InneractiveNativeAdEventsListener> implements u {
    public boolean x = false;

    @Override // com.fyber.inneractive.sdk.flow.x
    public boolean J() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public int L() {
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public int M() {
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public long N() {
        return 0L;
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public boolean O() {
        return false;
    }

    public final void R() {
        AdContent adcontent = this.b;
        if (adcontent != 0) {
            d0 d0Var = (d0) adcontent;
            if (d0Var.d == null || ((a0) d0Var.d).c == null) {
                return;
            }
            IAConfigManager.M.x.a(((a0) d0Var.d).c.b == UnitDisplayType.REWARDED ? com.fyber.inneractive.sdk.cache.session.enums.b.REWARDED_VIDEO : com.fyber.inneractive.sdk.cache.session.enums.b.INTERSTITIAL_VIDEO, com.fyber.inneractive.sdk.cache.session.enums.a.CLICK);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public long a(long j) {
        return 0L;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.u
    public x.a a(k0 k0Var, com.fyber.inneractive.sdk.util.e eVar) {
        R();
        throw null;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c
    public void a(c.b bVar) {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.u
    public void a(boolean z) {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.u
    public void a(boolean z, Orientation orientation) {
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c
    public void b() {
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public /* bridge */ /* synthetic */ boolean b(d0 d0Var) {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.flow.x, com.fyber.inneractive.sdk.flow.p, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public void destroy() {
        if (!this.x) {
            m();
        }
        this.b = null;
        super.destroy();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.u
    public void e() {
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
            com.fyber.inneractive.sdk.model.vast.b bVar = ((com.fyber.inneractive.sdk.response.g) d0Var.b).J;
            if (bVar != null && (cVar = bVar.h) != null && (hVar = cVar.b) != null) {
                str = hVar.toString();
            }
            a(str);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.u
    public void j() {
        a(new WebViewRendererProcessHasGoneError());
    }

    @Override // com.fyber.inneractive.sdk.player.controller.u
    public void k() {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.u
    public void l() {
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c
    public void m() {
        this.x = true;
        AdContent adcontent = this.b;
        if (adcontent != 0) {
            com.fyber.inneractive.sdk.player.h hVar = ((d0) adcontent).i;
        }
        IAlog.a("%sunit controller is null!", IAlog.a(this));
    }

    @Override // com.fyber.inneractive.sdk.flow.x, com.fyber.inneractive.sdk.interfaces.c
    public void o() {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.u
    public void onCompleted() {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.u
    public void onPlayerError() {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.u
    public void onProgress(int i, int i2) {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.u
    public void s() {
        D();
    }

    @Override // com.fyber.inneractive.sdk.flow.x, com.fyber.inneractive.sdk.interfaces.c
    public void t() {
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c
    public boolean v() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.u
    public void h() {
        IAlog.a("%snShownCloseButton", IAlog.a(this));
    }

    @Override // com.fyber.inneractive.sdk.player.controller.u
    public x.a a(String str, k0 k0Var, b.a aVar, boolean z) {
        com.fyber.inneractive.sdk.model.vast.c cVar;
        com.fyber.inneractive.sdk.model.vast.h hVar;
        AdContent adcontent = this.b;
        if (adcontent != 0) {
            d0 d0Var = (d0) adcontent;
            if (d0Var.a != null && d0Var.b != 0) {
                R();
                com.fyber.inneractive.sdk.model.vast.b bVar = ((com.fyber.inneractive.sdk.response.g) ((d0) this.b).b).J;
                a((bVar == null || (cVar = bVar.h) == null || (hVar = cVar.b) == null) ? null : hVar.toString());
            }
        }
        throw null;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.u
    public void a(String str, String str2) {
        IAlog.a(IAlog.a(this) + "full screen video ad renderer callback: onSuspiciousNoUserWebActionDetected", new Object[0]);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.u
    public void a(View view, String str) {
        if (view == null || view.getContext() == null) {
            return;
        }
        InneractiveRichMediaVideoPlayerActivityCore.startRichMediaIntent(view.getContext(), str);
        D();
    }
}
