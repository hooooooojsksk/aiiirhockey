package com.facebook.ads.redexgen.X;

import android.util.SparseArray;

/* renamed from: com.facebook.ads.redexgen.X.Vb */
/* loaded from: assets/audience_network.dex */
public class C0837Vb implements InterfaceC0370Cj {
    public static String[] A02 = {"KDcVXuz53RpoF9UEOZ96l2VZuhVX9ip0", "CKRJ1Pqx0SMvAzHTc14bPVY1Im6KLWKe", "CZRg2SIX1VWZgfyXTOdEl1", "FcRR7mDk42dnDG0ym1pZJ2", "QPo", "3iSkzhZlTwG2jcdx249ci8whKDsXKTKF", "nuc6nRuUqT3GqwIih", "HhkYvD09GQfRAuSaGWngxJEfFHmtitdD"};
    public final C0482Hb A00 = new C0482Hb(new byte[4]);
    public final /* synthetic */ VZ A01;

    public C0837Vb(VZ vz) {
        this.A01 = vz;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0370Cj
    public final void A4B(C0483Hc c0483Hc) {
        int i;
        SparseArray sparseArray;
        SparseArray sparseArray2;
        int tableId = c0483Hc.A0E();
        if (tableId != 0) {
            return;
        }
        c0483Hc.A0Z(7);
        int A04 = c0483Hc.A04() / 4;
        for (int programNumber = 0; programNumber < A04; programNumber++) {
            c0483Hc.A0a(this.A00, 4);
            int A042 = this.A00.A04(16);
            this.A00.A08(3);
            if (A042 == 0) {
                this.A00.A08(13);
            } else {
                int i2 = this.A00.A04(13);
                sparseArray2 = this.A01.A06;
                sparseArray2.put(i2, new C0840Ve(new C0836Va(this.A01, i2)));
                VZ.A01(this.A01);
            }
        }
        i = this.A01.A05;
        int programCount = A02[4].length();
        if (programCount == 11) {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[3] = "4awIAPS5zJKVkKN48BLjJX";
        strArr[2] = "yyhTqQNSKamLuuIUjTGErW";
        if (i != 2) {
            sparseArray = this.A01.A06;
            sparseArray.remove(0);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0370Cj
    public final void A8X(C0495Ho c0495Ho, BX bx, C0375Cp c0375Cp) {
    }
}
