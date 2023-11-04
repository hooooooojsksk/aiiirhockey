package com.facebook.ads.redexgen.X;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;

/* loaded from: assets/audience_network.dex */
public final class JS implements InterfaceC0688Ph {
    public int A00;
    @Nullable
    public ValueAnimator A01;
    public EnumC0687Pg A02 = EnumC0687Pg.A05;
    public final int A03;
    public final int A04;
    public final View A05;

    public JS(View view, int i, int i2, int i3) {
        this.A05 = view;
        this.A03 = i;
        this.A00 = i2;
        this.A04 = i3;
    }

    private ValueAnimator A00(int i, int i2, View view) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
        ofInt.setDuration(this.A03);
        ofInt.addUpdateListener(new C0691Pk(this, view));
        return ofInt;
    }

    public void A07(boolean z) {
        if (z) {
            this.A02 = EnumC0687Pg.A06;
            this.A01 = A00(this.A00, this.A04, this.A05);
            this.A01.addListener(new C0690Pj(this));
            this.A01.start();
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.A05.getLayoutParams();
        layoutParams.height = this.A04;
        this.A05.setLayoutParams(layoutParams);
        LL.A0H(this.A05);
        this.A02 = EnumC0687Pg.A05;
    }

    public void A08(boolean z) {
        LL.A0L(this.A05);
        if (z) {
            this.A02 = EnumC0687Pg.A04;
            this.A01 = A00(this.A04, this.A00, this.A05);
            this.A01.addListener(new C0689Pi(this));
            this.A01.start();
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.A05.getLayoutParams();
        layoutParams.height = this.A00;
        this.A05.setLayoutParams(layoutParams);
        this.A02 = EnumC0687Pg.A03;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0688Ph
    public final void A3N(boolean z, boolean z2) {
        if (z2) {
            A07(z);
        } else {
            A08(z);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0688Ph
    public final EnumC0687Pg A7j() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0688Ph
    public final void cancel() {
        ValueAnimator valueAnimator = this.A01;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }
}
