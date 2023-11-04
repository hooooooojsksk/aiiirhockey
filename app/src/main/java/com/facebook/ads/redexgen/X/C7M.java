package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.7M */
/* loaded from: assets/audience_network.dex */
public final class C7M {
    public static final AtomicReference<C0886Xb> A00 = new AtomicReference<>();

    @Nullable
    public static C0886Xb A00() {
        return A00.get();
    }

    public static void A01(C0886Xb c0886Xb) {
        if (c0886Xb == null) {
            return;
        }
        A00.compareAndSet(null, c0886Xb);
    }
}
