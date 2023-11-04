package com.fyber.inneractive.sdk.dv;

import com.fyber.inneractive.sdk.config.b0;
import com.fyber.inneractive.sdk.config.global.s;
import com.fyber.inneractive.sdk.flow.o;
import com.google.android.gms.ads.AdRequest;

/* loaded from: classes.dex */
public abstract class a<T> extends o<f> {
    public d g;
    public com.fyber.inneractive.sdk.dv.banner.b h;
    public T i;

    public a(b0 b0Var, s sVar, f fVar) {
        super(b0Var, sVar);
        a((a<T>) fVar);
    }

    @Override // com.fyber.inneractive.sdk.flow.o
    public void a() {
        this.g = null;
        this.i = null;
    }

    @Override // com.fyber.inneractive.sdk.flow.o
    public f d() {
        return (f) this.b;
    }

    @Override // com.fyber.inneractive.sdk.flow.o
    public boolean g() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.flow.o
    public boolean isVideoAd() {
        return false;
    }

    public void a(AdRequest adRequest, d dVar) {
        this.g = dVar;
    }
}
