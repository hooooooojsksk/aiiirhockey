package com.fyber.inneractive.sdk.config;

import android.content.Context;

/* loaded from: classes.dex */
public class n implements Runnable {
    public final /* synthetic */ IAConfigManager a;
    public final /* synthetic */ Context b;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
            n.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            n.this.a.J = new com.fyber.inneractive.sdk.measurement.b();
            n nVar = n.this;
            com.fyber.inneractive.sdk.measurement.a aVar = nVar.a.J;
            Context context = nVar.b;
            if (aVar.a) {
                return;
            }
            aVar.a = true;
            com.fyber.inneractive.sdk.util.m.b.post(new com.fyber.inneractive.sdk.measurement.c((com.fyber.inneractive.sdk.measurement.b) aVar, context));
        }
    }

    public n(IAConfigManager iAConfigManager, Context context) {
        this.a = iAConfigManager;
        this.b = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            Class.forName("com.iab.omid.library.fyber.Omid");
            com.fyber.inneractive.sdk.util.m.b.post(new a());
        } catch (Throwable unused) {
        }
    }
}
