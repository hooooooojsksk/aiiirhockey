package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

@VisibleForTesting
/* renamed from: com.facebook.ads.redexgen.X.7Z */
/* loaded from: assets/audience_network.dex */
public abstract class C7Z<T> {
    public C7Y A00;

    @Nullable
    public abstract T A03();

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7Z != com.facebook.ads.internal.database.AdDatabaseQuery<T> */
    public final C7Y A00() {
        return this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7Z != com.facebook.ads.internal.database.AdDatabaseQuery<T> */
    public final void A01(C7Y c7y) {
        this.A00 = c7y;
    }
}
