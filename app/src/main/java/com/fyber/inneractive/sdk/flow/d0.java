package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;

/* loaded from: classes.dex */
public class d0 extends n<com.fyber.inneractive.sdk.response.g> {
    public com.fyber.inneractive.sdk.player.h i;
    public boolean j;

    public d0(com.fyber.inneractive.sdk.config.b0 b0Var, com.fyber.inneractive.sdk.config.global.s sVar, com.fyber.inneractive.sdk.response.g gVar, InneractiveAdRequest inneractiveAdRequest) {
        super(b0Var, sVar);
        this.j = false;
        a((d0) gVar);
        a(inneractiveAdRequest);
    }

    @Override // com.fyber.inneractive.sdk.flow.o
    public void a() {
        if (this.g != null && e()) {
            this.g.a();
            this.g = null;
        }
        com.fyber.inneractive.sdk.player.h hVar = this.i;
        if (hVar != null) {
            hVar.a();
            this.i = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.o
    public boolean e() {
        com.fyber.inneractive.sdk.config.a0 a0Var = (com.fyber.inneractive.sdk.config.a0) this.d;
        if (a0Var.f == null) {
            return false;
        }
        return com.fyber.inneractive.sdk.util.y.a(a0Var.f.j);
    }

    @Override // com.fyber.inneractive.sdk.flow.o
    public boolean g() {
        return this.i != null;
    }

    @Override // com.fyber.inneractive.sdk.flow.o
    public boolean isVideoAd() {
        return true;
    }

    public String k() {
        com.fyber.inneractive.sdk.model.vast.b bVar;
        T t = this.b;
        if (t == 0 || (bVar = ((com.fyber.inneractive.sdk.response.g) t).J) == null) {
            return null;
        }
        return bVar.b;
    }
}
