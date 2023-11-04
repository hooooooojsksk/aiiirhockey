package com.facebook.ads.redexgen.X;

import android.graphics.drawable.Drawable;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public class Z3 implements C2Q {
    public Drawable A00;
    public final /* synthetic */ C2P A01;

    public Z3(C2P c2p) {
        this.A01 = c2p;
    }

    @Override // com.facebook.ads.redexgen.X.C2Q
    public final Drawable A62() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.C2Q
    public final View A63() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.C2Q
    public final boolean A7S() {
        return this.A01.getPreventCornerOverlap();
    }

    @Override // com.facebook.ads.redexgen.X.C2Q
    public final boolean A7y() {
        return this.A01.getUseCompatPadding();
    }

    @Override // com.facebook.ads.redexgen.X.C2Q
    public final void AEq(Drawable drawable) {
        this.A00 = drawable;
        this.A01.setBackgroundDrawable(drawable);
    }

    @Override // com.facebook.ads.redexgen.X.C2Q
    public final void AF1(int i, int i2) {
        if (i > this.A01.A01) {
            super/*android.widget.FrameLayout*/.setMinimumWidth(i);
        }
        if (i2 > this.A01.A00) {
            super/*android.widget.FrameLayout*/.setMinimumHeight(i2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C2Q
    public final void AF8(int i, int i2, int i3, int i4) {
        this.A01.A05.set(i, i2, i3, i4);
        C2P c2p = this.A01;
        super/*android.widget.FrameLayout*/.setPadding(c2p.A04.left + i, this.A01.A04.top + i2, this.A01.A04.right + i3, this.A01.A04.bottom + i4);
    }
}
