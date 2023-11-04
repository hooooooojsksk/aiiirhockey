package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.measurement.a;
import com.fyber.inneractive.sdk.ui.IAmraidWebViewController;

/* loaded from: classes.dex */
public class z extends n<com.fyber.inneractive.sdk.response.f> {
    public IAmraidWebViewController i;

    public z(com.fyber.inneractive.sdk.config.b0 b0Var, com.fyber.inneractive.sdk.config.global.s sVar) {
        super(b0Var, sVar);
    }

    @Override // com.fyber.inneractive.sdk.flow.o
    public void a() {
        if (this.g != null && e()) {
            this.g.a();
            this.g = null;
        }
        IAmraidWebViewController iAmraidWebViewController = this.i;
        if (iAmraidWebViewController != null) {
            a.InterfaceC0020a interfaceC0020a = iAmraidWebViewController.L;
            if (interfaceC0020a != null) {
                ((com.fyber.inneractive.sdk.measurement.tracker.c) interfaceC0020a).d();
            }
            this.i.c();
            this.i = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.o
    public boolean e() {
        com.fyber.inneractive.sdk.config.b0 b0Var = this.d;
        if (b0Var != null) {
            com.fyber.inneractive.sdk.config.a0 a0Var = (com.fyber.inneractive.sdk.config.a0) b0Var;
            if (a0Var.c == null || a0Var.c.b == null) {
                return false;
            }
            return a0Var.c.b.isFullscreenUnit();
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.flow.o
    public boolean g() {
        IAmraidWebViewController iAmraidWebViewController = this.i;
        if (iAmraidWebViewController != null) {
            if (iAmraidWebViewController.b != null) {
                return true;
            }
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.flow.o
    public boolean isVideoAd() {
        return false;
    }
}
