package com.facebook.ads.redexgen.X;

import androidx.annotation.NonNull;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.facebook.ads.redexgen.X.Hr */
/* loaded from: assets/audience_network.dex */
public class ThreadFactoryC0498Hr implements ThreadFactory {
    public final /* synthetic */ String A00;

    public ThreadFactoryC0498Hr(String str) {
        this.A00 = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(@NonNull Runnable runnable) {
        return new Thread(runnable, this.A00);
    }
}
