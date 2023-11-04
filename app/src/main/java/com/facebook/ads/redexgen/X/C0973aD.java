package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.aD */
/* loaded from: assets/audience_network.dex */
public class C0973aD implements OB {
    public final /* synthetic */ C0970aA A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.X.OB
    public final void A8x() {
        F3 f3;
        C0402Dv c0402Dv;
        f3 = this.A00.A02;
        String A00 = f3.A0k().A00();
        if (TextUtils.isEmpty(A00)) {
            return;
        }
        KS ks = new KS();
        c0402Dv = this.A00.A03;
        KS.A0E(ks, c0402Dv, KT.A00(A00), this.A00.A6B());
    }

    public C0973aD(C0970aA c0970aA) {
        this.A00 = c0970aA;
    }

    @Override // com.facebook.ads.redexgen.X.OB
    public final void AAs(C02908v c02908v) {
        new Handler(Looper.getMainLooper()).postDelayed(new C0974aE(this, c02908v), 1L);
    }

    @Override // com.facebook.ads.redexgen.X.OB
    public final void AB6() {
    }

    @Override // com.facebook.ads.redexgen.X.OB
    public final void ACm(View view, MotionEvent motionEvent) {
    }
}
