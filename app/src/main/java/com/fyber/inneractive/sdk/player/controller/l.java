package com.fyber.inneractive.sdk.player.controller;

/* loaded from: classes.dex */
public class l implements Runnable {
    public final /* synthetic */ k a;

    public l(k kVar) {
        this.a = kVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        k kVar = this.a;
        kVar.j = null;
        kVar.u();
    }
}
