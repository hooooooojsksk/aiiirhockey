package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.ads.NativeAd;

/* loaded from: assets/audience_network.dex */
public class YB implements OB {
    public final /* synthetic */ NativeAd A00;
    public final /* synthetic */ Y6 A01;
    public final /* synthetic */ C0799Tp A02;

    public YB(Y6 y6, C0799Tp c0799Tp, NativeAd nativeAd) {
        this.A01 = y6;
        this.A02 = c0799Tp;
        this.A00 = nativeAd;
    }

    @Override // com.facebook.ads.redexgen.X.OB
    public final void A8x() {
    }

    @Override // com.facebook.ads.redexgen.X.OB
    public final void AAs(C02908v c02908v) {
        new Handler(Looper.getMainLooper()).postDelayed(new YC(this, c02908v), 1L);
    }

    @Override // com.facebook.ads.redexgen.X.OB
    public final void AB6() {
        C02908v c02908v;
        C02908v c02908v2;
        c02908v = this.A01.A0A;
        if (c02908v != null) {
            c02908v2 = this.A01.A0A;
            c02908v2.A08();
        }
    }

    @Override // com.facebook.ads.redexgen.X.OB
    public final void ACm(View view, MotionEvent motionEvent) {
        C0887Xc c0887Xc;
        boolean A0J;
        LD A19 = this.A02.A19();
        c0887Xc = this.A01.A07;
        A19.A06(c0887Xc, motionEvent, view, view);
        if (motionEvent.getAction() == 1) {
            A0J = this.A01.A0J(this.A00);
            if (!A0J && this.A02.A12() != null) {
                this.A02.A12().onClick(view);
            }
        }
    }
}
