package com.facebook.ads.redexgen.X;

import android.database.Observable;

/* renamed from: com.facebook.ads.redexgen.X.4O */
/* loaded from: assets/audience_network.dex */
public class C4O extends Observable<C4P> {
    public final void A00() {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            ((C4P) this.mObservers.get(size)).A00();
        }
    }
}
