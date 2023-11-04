package com.facebook.ads.redexgen.X;

import java.lang.ref.WeakReference;

/* loaded from: assets/audience_network.dex */
public abstract class TO<T> extends K1 {
    public final WeakReference<T> A00;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.TO != com.facebook.ads.internal.util.common.WeakRunnable<T> */
    public TO(T reference) {
        this.A00 = new WeakReference<>(reference);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.TO != com.facebook.ads.internal.util.common.WeakRunnable<T> */
    public final T A07() {
        return this.A00.get();
    }
}
