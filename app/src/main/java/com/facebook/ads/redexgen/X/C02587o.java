package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.facebook.ads.redexgen.X.7o */
/* loaded from: assets/audience_network.dex */
public class C02587o extends AbstractC0664Oj {
    public final /* synthetic */ C7J A00;

    public C02587o(C7J c7j) {
        this.A00 = c7j;
    }

    @Override // com.facebook.ads.redexgen.X.C8V
    /* renamed from: A00 */
    public final void A03(P8 p8) {
        new Handler(Looper.getMainLooper()).post(new RunnableC0661Of(this));
    }
}
