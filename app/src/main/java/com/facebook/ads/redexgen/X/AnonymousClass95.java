package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.facebook.ads.redexgen.X.95 */
/* loaded from: assets/audience_network.dex */
public class AnonymousClass95 extends AbstractC0664Oj {
    public final /* synthetic */ C0633Nd A00;

    public AnonymousClass95(C0633Nd c0633Nd) {
        this.A00 = c0633Nd;
    }

    @Override // com.facebook.ads.redexgen.X.C8V
    /* renamed from: A00 */
    public final void A03(P8 p8) {
        new Handler(Looper.getMainLooper()).post(new RunnableC0632Nc(this));
    }
}
