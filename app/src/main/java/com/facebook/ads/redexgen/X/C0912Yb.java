package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Yb */
/* loaded from: assets/audience_network.dex */
public class C0912Yb extends C4J {
    public C0912Yb(C4Z c4z) {
        super(c4z, null);
    }

    @Override // com.facebook.ads.redexgen.X.C4J
    public final int A06() {
        return this.A02.A0X();
    }

    @Override // com.facebook.ads.redexgen.X.C4J
    public final int A07() {
        return this.A02.A0X() - this.A02.A0d();
    }

    @Override // com.facebook.ads.redexgen.X.C4J
    public final int A08() {
        return this.A02.A0d();
    }

    @Override // com.facebook.ads.redexgen.X.C4J
    public final int A09() {
        return this.A02.A0Y();
    }

    @Override // com.facebook.ads.redexgen.X.C4J
    public final int A0A() {
        return this.A02.A0g();
    }

    @Override // com.facebook.ads.redexgen.X.C4J
    public final int A0B() {
        return (this.A02.A0X() - this.A02.A0g()) - this.A02.A0d();
    }

    @Override // com.facebook.ads.redexgen.X.C4J
    public final int A0C(View view) {
        return this.A02.A0j(view) + ((C01774a) view.getLayoutParams()).bottomMargin;
    }

    @Override // com.facebook.ads.redexgen.X.C4J
    public final int A0D(View view) {
        C01774a c01774a = (C01774a) view.getLayoutParams();
        return this.A02.A0l(view) + c01774a.topMargin + c01774a.bottomMargin;
    }

    @Override // com.facebook.ads.redexgen.X.C4J
    public final int A0E(View view) {
        C01774a c01774a = (C01774a) view.getLayoutParams();
        return this.A02.A0m(view) + c01774a.leftMargin + c01774a.rightMargin;
    }

    @Override // com.facebook.ads.redexgen.X.C4J
    public final int A0F(View view) {
        return this.A02.A0o(view) - ((C01774a) view.getLayoutParams()).topMargin;
    }

    @Override // com.facebook.ads.redexgen.X.C4J
    public final int A0G(View view) {
        this.A02.A1E(view, true, this.A01);
        return this.A01.bottom;
    }

    @Override // com.facebook.ads.redexgen.X.C4J
    public final int A0H(View view) {
        this.A02.A1E(view, true, this.A01);
        return this.A01.top;
    }

    @Override // com.facebook.ads.redexgen.X.C4J
    public final void A0J(int i) {
        this.A02.A10(i);
    }
}
