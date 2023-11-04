package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.response.e;

/* loaded from: classes.dex */
public abstract class o<T extends com.fyber.inneractive.sdk.response.e> {
    public InneractiveAdRequest a;
    public T b;
    public com.fyber.inneractive.sdk.config.global.s c;
    public final com.fyber.inneractive.sdk.config.b0 d;
    public boolean e = false;
    public boolean f = false;

    public o(com.fyber.inneractive.sdk.config.b0 b0Var, com.fyber.inneractive.sdk.config.global.s sVar) {
        this.d = b0Var;
        this.c = sVar;
    }

    public abstract void a();

    public void a(T t) {
        this.b = t;
    }

    public void a(String str) {
    }

    public boolean a(boolean z, com.fyber.inneractive.sdk.util.e eVar) {
        return false;
    }

    public com.fyber.inneractive.sdk.config.global.s b() {
        return this.c;
    }

    public com.fyber.inneractive.sdk.web.t c() {
        return null;
    }

    public T d() {
        return this.b;
    }

    public boolean e() {
        com.fyber.inneractive.sdk.config.y yVar = ((com.fyber.inneractive.sdk.config.a0) this.d).e;
        return false;
    }

    public boolean f() {
        return false;
    }

    public abstract boolean g();

    public boolean h() {
        return IAConfigManager.M.l || this.f;
    }

    public void i() {
    }

    public abstract boolean isVideoAd();

    public void a(InneractiveAdRequest inneractiveAdRequest) {
        this.a = inneractiveAdRequest;
    }
}
