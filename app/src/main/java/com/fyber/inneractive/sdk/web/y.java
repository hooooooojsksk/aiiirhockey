package com.fyber.inneractive.sdk.web;

/* loaded from: classes.dex */
public class y implements Runnable {
    public final /* synthetic */ z a;

    public y(z zVar) {
        this.a = zVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.a.a.evictAll();
        } catch (Throwable unused) {
        }
    }
}
