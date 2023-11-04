package com.fyber.inneractive.sdk.player.controller;

import android.view.View;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.f0;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.mraid.b0;
import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.k0;
import com.fyber.inneractive.sdk.util.x;
import com.fyber.inneractive.sdk.web.b;
import com.fyber.inneractive.sdk.web.i;

/* loaded from: classes.dex */
public class o extends i.l {
    public final /* synthetic */ k a;

    public o(k kVar) {
        this.a = kVar;
    }

    @Override // com.fyber.inneractive.sdk.web.d0
    public void a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        k kVar = this.a;
        kVar.getClass();
        sb.append(IAlog.a(kVar));
        sb.append("web view callback: onSuspiciousNoUserWebActionDetected");
        IAlog.a(sb.toString(), new Object[0]);
        ListenerT listenert = this.a.g;
        if (listenert != 0) {
            listenert.a(str, str2);
        }
    }

    @Override // com.fyber.inneractive.sdk.web.d0
    public void b() {
        ListenerT listenert = this.a.g;
        if (listenert != 0) {
            listenert.j();
        }
    }

    @Override // com.fyber.inneractive.sdk.web.i.f
    public void c() {
        com.fyber.inneractive.sdk.model.vast.c d;
        k kVar = this.a;
        kVar.getClass();
        IAlog.a("%sweb view callback: onClickedAndOpen", IAlog.a(kVar));
        this.a.a(f0.b.COMPANION.value);
        k kVar2 = this.a;
        if (kVar2.g != 0) {
            com.fyber.inneractive.sdk.player.b bVar = kVar2.a;
            if (bVar != null && (d = bVar.d()) != null) {
                this.a.a.a(d, VideoClickOrigin.COMPANION, com.fyber.inneractive.sdk.model.vast.s.EVENT_CLICK);
            }
            int i = IAlog.a;
            IAlog.a(1, null, "AD_CLICKED", new Object[0]);
            this.a.g.g();
        }
    }

    @Override // com.fyber.inneractive.sdk.web.i.f
    public void b(com.fyber.inneractive.sdk.web.i iVar) {
        ListenerT listenert = this.a.g;
        if (listenert != 0) {
            listenert.s();
        }
    }

    @Override // com.fyber.inneractive.sdk.web.d0
    public x.a a(String str, k0 k0Var, b.a aVar) {
        k kVar = this.a;
        kVar.getClass();
        IAlog.a("%sweb view callback: onClicked", IAlog.a(kVar));
        this.a.a(f0.b.COMPANION.value);
        k kVar2 = this.a;
        if (kVar2.g != 0) {
            com.fyber.inneractive.sdk.player.b bVar = kVar2.a;
            if (bVar != null) {
                com.fyber.inneractive.sdk.model.vast.c d = bVar.d();
                if (d != null) {
                    this.a.a.a(d, VideoClickOrigin.COMPANION, com.fyber.inneractive.sdk.model.vast.s.EVENT_CLICK);
                } else if (k.a(this.a)) {
                    com.fyber.inneractive.sdk.player.e eVar = (com.fyber.inneractive.sdk.player.e) this.a.a;
                    eVar.a(eVar.x, VideoClickOrigin.COMPANION, com.fyber.inneractive.sdk.model.vast.s.EVENT_CLICK);
                }
            }
            int i = IAlog.a;
            IAlog.a(1, null, "AD_CLICKED", new Object[0]);
            this.a.m();
            return this.a.g.a(str, k0Var, aVar, false);
        }
        return new x.a(x.d.FAILED, new Exception("mListener is null, internal SDK fatal error"), "null");
    }

    @Override // com.fyber.inneractive.sdk.web.i.f
    public boolean a(String str) {
        View endCardView = this.a.d.getEndCardView();
        ListenerT listenert = this.a.g;
        if (listenert != 0) {
            listenert.a(endCardView, str);
            return true;
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.web.i.f
    public void a(InneractiveUnitController.AdDisplayError adDisplayError) {
        ListenerT listenert = this.a.g;
        if (listenert != 0) {
            listenert.onPlayerError();
        }
    }

    @Override // com.fyber.inneractive.sdk.web.i.f
    public void a(com.fyber.inneractive.sdk.web.i iVar) {
        ListenerT listenert = this.a.g;
        if (listenert != 0) {
            listenert.s();
        }
    }

    @Override // com.fyber.inneractive.sdk.web.i.f
    public void a(com.fyber.inneractive.sdk.web.i iVar, b0 b0Var) {
        ListenerT listenert = this.a.g;
        if (listenert != 0) {
            listenert.k();
        }
    }

    @Override // com.fyber.inneractive.sdk.web.i.f
    public void a(com.fyber.inneractive.sdk.web.i iVar, boolean z) {
        k kVar = this.a;
        kVar.getClass();
        IAlog.a("%sonCustomCloseButtonAvailableEnabled : %s", IAlog.a(kVar), Boolean.valueOf(z));
        ListenerT listenert = this.a.g;
        if (listenert == 0 || !z) {
            return;
        }
        listenert.h();
    }

    @Override // com.fyber.inneractive.sdk.web.i.f
    public void a(com.fyber.inneractive.sdk.web.i iVar, boolean z, Orientation orientation) {
        k kVar = this.a;
        kVar.getClass();
        IAlog.a("%sonOrientationProperties: allowOrientationChange: %s, forceOrientationType: %s", IAlog.a(kVar), Boolean.valueOf(z), orientation.toString());
        ListenerT listenert = this.a.g;
        if (listenert != 0) {
            listenert.a(z, orientation);
        }
    }
}
