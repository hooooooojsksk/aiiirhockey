package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class NE implements View.OnClickListener {
    public static String[] A01 = {"itOWPxSAafQZkTcpSE", "P8wVkr4WQB2iTQj27U1zAKNwbIgp5ttm", "3fifleoLwZA9ZUHROlHUKOtdLR5u4T8w", "3T74ydaV22", "9uWerCzeZ8xawRpMyxj77IpYV", "ULhUZegm5nSDnYs3Ds4NwOgfcNiZFAvv", "CnafhHPdNyHtxs0BoCQt5IwpL7l3OIL1", "MX4uPfGpQbRpYZ87lJTfxvNpA"};
    public final /* synthetic */ C0761Sc A00;

    public NE(C0761Sc c0761Sc) {
        this.A00 = c0761Sc;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            this.A00.A02();
        } catch (Throwable th) {
            String[] strArr = A01;
            if (strArr[7].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[7] = "eKgsbHFhDVYlHC4UrNgZgZ37z";
            strArr2[4] = "vADQv3Fh0d5p8ZODn5ENkbcNb";
            C0548Jt.A00(th, this);
        }
    }
}
