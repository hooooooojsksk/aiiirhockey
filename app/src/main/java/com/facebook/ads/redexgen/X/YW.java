package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class YW implements InterfaceC01964u {
    public final /* synthetic */ C4Z A00;

    public YW(C4Z c4z) {
        this.A00 = c4z;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01964u
    public final View A65(int i) {
        return this.A00.A0t(i);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01964u
    public final int A67(View view) {
        return this.A00.A0n(view) + ((C01774a) view.getLayoutParams()).rightMargin;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01964u
    public final int A68(View view) {
        return this.A00.A0k(view) - ((C01774a) view.getLayoutParams()).leftMargin;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01964u
    public final int A7H() {
        return this.A00.A0h() - this.A00.A0f();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01964u
    public final int A7I() {
        return this.A00.A0e();
    }
}
