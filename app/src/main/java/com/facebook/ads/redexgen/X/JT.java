package com.facebook.ads.redexgen.X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Handler;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public final class JT implements InterfaceC0688Ph {
    public TransitionDrawable A00;
    public TransitionDrawable A01;
    public final int A03;
    public final Drawable A04;
    public final Drawable A05;
    public final View A07;
    public final Handler A06 = new Handler();
    public EnumC0687Pg A02 = EnumC0687Pg.A05;

    public JT(View view, int i, Drawable drawable, Drawable drawable2) {
        this.A03 = i;
        this.A07 = view;
        this.A05 = drawable;
        this.A04 = drawable2;
        this.A01 = new TransitionDrawable(new Drawable[]{drawable, drawable2});
        this.A01.setCrossFadeEnabled(true);
        this.A00 = new TransitionDrawable(new Drawable[]{drawable2, drawable});
        this.A00.setCrossFadeEnabled(true);
        LL.A0S(this.A07, this.A01);
    }

    private void A04(boolean z) {
        this.A06.removeCallbacksAndMessages(null);
        if (z) {
            this.A02 = EnumC0687Pg.A06;
            LL.A0S(this.A07, this.A00);
            this.A00.startTransition(this.A03);
            this.A06.postDelayed(new JU(this), this.A03);
            return;
        }
        LL.A0S(this.A07, this.A05);
        this.A02 = EnumC0687Pg.A05;
    }

    private void A05(boolean z) {
        this.A06.removeCallbacksAndMessages(null);
        if (z) {
            this.A02 = EnumC0687Pg.A04;
            LL.A0S(this.A07, this.A01);
            this.A01.startTransition(this.A03);
            this.A06.postDelayed(new JV(this), this.A03);
            return;
        }
        LL.A0S(this.A07, this.A04);
        this.A02 = EnumC0687Pg.A03;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0688Ph
    public final void A3N(boolean z, boolean z2) {
        if (z2) {
            A04(z);
        } else {
            A05(z);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0688Ph
    public final EnumC0687Pg A7j() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0688Ph
    public final void cancel() {
        EnumC0687Pg enumC0687Pg;
        this.A06.removeCallbacksAndMessages(null);
        this.A01.resetTransition();
        this.A00.resetTransition();
        if (this.A02 == EnumC0687Pg.A04) {
            enumC0687Pg = EnumC0687Pg.A05;
        } else {
            enumC0687Pg = EnumC0687Pg.A03;
        }
        this.A02 = enumC0687Pg;
    }
}
