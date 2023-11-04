package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class YV implements InterfaceC01964u {
    public final /* synthetic */ C4Z A00;

    public YV(C4Z c4z) {
        this.A00 = c4z;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01964u
    public final View A65(int i) {
        return this.A00.A0t(i);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01964u
    public final int A67(View view) {
        return this.A00.A0j(view) + ((C01774a) view.getLayoutParams()).bottomMargin;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01964u
    public final int A68(View view) {
        return this.A00.A0o(view) - ((C01774a) view.getLayoutParams()).topMargin;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01964u
    public final int A7H() {
        return this.A00.A0X() - this.A00.A0d();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01964u
    public final int A7I() {
        return this.A00.A0g();
    }
}
