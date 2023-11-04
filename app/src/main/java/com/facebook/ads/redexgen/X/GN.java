package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;

/* loaded from: assets/audience_network.dex */
public final class GN {
    public static String[] A04 = {"1e59kXQlLqMkYu", "73uDxCsdQKWLV7ukq8JJdZs18UKd6swo", "mCuMZDHsEtXcrT2f0", "82", "pR5c7vVXcuaoTTpQp", "OeCOW4uYvzA4LVqnaAabDbQ1U", "2mUnq0j6yY0W6wQrn1U3Lg5rNBUJPBqf", "6oWLaazoE5vpCSBDL9uHOzoNvgEAVE9"};
    public final int A00;
    public final GK A01;
    @Nullable
    public final Object A02;
    public final C03099o[] A03;

    public GN(C03099o[] c03099oArr, GJ[] gjArr, @Nullable Object obj) {
        this.A03 = c03099oArr;
        this.A01 = new GK(gjArr);
        this.A02 = obj;
        this.A00 = c03099oArr.length;
    }

    public final boolean A00(int i) {
        return this.A03[i] != null;
    }

    public final boolean A01(GN gn) {
        if (gn == null || gn.A01.A01 != this.A01.A01) {
            return false;
        }
        for (int i = 0; i < this.A01.A01; i++) {
            if (!A02(gn, i)) {
                return false;
            }
        }
        return true;
    }

    public final boolean A02(GN gn, int i) {
        if (gn == null) {
            return false;
        }
        C03099o[] c03099oArr = this.A03;
        String[] strArr = A04;
        if (strArr[0].length() != strArr[3].length()) {
            String[] strArr2 = A04;
            strArr2[0] = "XY11p18RHVDFci";
            strArr2[3] = "x2";
            return C0499Hs.A0g(c03099oArr[i], gn.A03[i]) && C0499Hs.A0g(this.A01.A00(i), gn.A01.A00(i));
        }
        throw new RuntimeException();
    }
}
