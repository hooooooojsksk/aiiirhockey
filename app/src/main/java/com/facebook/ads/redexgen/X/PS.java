package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public final class PS implements PI {
    public final View A00;
    public final C0887Xc A01;

    public PS(C0887Xc c0887Xc, View view) {
        this.A01 = c0887Xc;
        this.A00 = view;
    }

    @Override // com.facebook.ads.redexgen.X.PI
    public final double A82() {
        QB result = QA.A0E(this.A00, 0, this.A01);
        return result.A00();
    }
}
