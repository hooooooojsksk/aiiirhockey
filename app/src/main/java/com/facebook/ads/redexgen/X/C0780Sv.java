package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Sv */
/* loaded from: assets/audience_network.dex */
public class C0780Sv implements MJ {
    public static byte[] A01;
    public static String[] A02 = {"nV", "0i4Wqrqqd8V", "SjjlSsHq4luZ", "UY2G1G5tdkkQRCLDawUW8PMELrtkam", "x8YzSsjyce", "sMLSYBAewXVAxhh2DbXf8YHA5QSbjC", "Z41BjwW", "WlPnbv1jMaDivlCQdRIz8mOz1GWjjHLQ"};
    public final /* synthetic */ MH A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 111);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-29, -17, -19, -82, -26, -31, -29, -27, -30, -17, -17, -21, -82, -31, -28, -13, -82, -31, -28, -14, -27, -16, -17, -14, -12, -23, -18, -25, -82, -58, -55, -50, -55, -45, -56, -33, -63, -60, -33, -46, -59, -48, -49, -46, -44, -55, -50, -57, -33, -58, -52, -49, -41};
        String[] strArr = A02;
        if (strArr[4].length() == strArr[1].length()) {
            throw new RuntimeException();
        }
        A02[7] = "41BFLxMtpa8zSeOoPh8lyezFWRN0z1Os";
    }

    static {
        A01();
    }

    public C0780Sv(MH mh) {
        this.A00 = mh;
    }

    @Override // com.facebook.ads.redexgen.X.MJ
    public final void A45() {
        InterfaceC0587Lj interfaceC0587Lj;
        InterfaceC0587Lj interfaceC0587Lj2;
        interfaceC0587Lj = this.A00.A07;
        if (interfaceC0587Lj != null) {
            interfaceC0587Lj2 = this.A00.A07;
            interfaceC0587Lj2.A3t(A00(0, 53, 17));
        }
    }

    @Override // com.facebook.ads.redexgen.X.MJ
    public final void A46() {
        InterfaceC0588Lk interfaceC0588Lk;
        InterfaceC0588Lk interfaceC0588Lk2;
        this.A00.A0M();
        interfaceC0588Lk = this.A00.A08;
        if (interfaceC0588Lk != null) {
            interfaceC0588Lk2 = this.A00.A08;
            interfaceC0588Lk2.ACM(true);
        }
        this.A00.A0B();
    }

    @Override // com.facebook.ads.redexgen.X.MJ
    public final void A86() {
        C2H c2h;
        C2H c2h2;
        C2H c2h3;
        C0887Xc c0887Xc;
        c2h = this.A00.A03;
        if (c2h == null) {
            A46();
            return;
        }
        MH.A01(this.A00);
        c2h2 = this.A00.A03;
        if (c2h2.A02() == null) {
            MH mh = this.A00;
            if (A02[6].length() != 7) {
                throw new RuntimeException();
            }
            A02[7] = "M7aB9yPR9altU9X1FYnvgfaKEANBwcUB";
            mh.A0C();
        } else {
            MH mh2 = this.A00;
            c2h3 = mh2.A03;
            mh2.A0E(c2h3.A02());
        }
        if (Build.VERSION.SDK_INT >= 16) {
            c0887Xc = this.A00.A05;
            if (IK.A1s(c0887Xc)) {
                this.A00.performAccessibilityAction(128, null);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.MJ
    public final void A8z() {
        C2D c2d;
        C2G c2g;
        C0887Xc c0887Xc;
        C2D c2d2;
        String str;
        c2d = this.A00.A04;
        if (!TextUtils.isEmpty(c2d.A0I())) {
            KS ks = new KS();
            c0887Xc = this.A00.A05;
            c2d2 = this.A00.A04;
            Uri A00 = KT.A00(c2d2.A0I());
            str = this.A00.A09;
            KS.A0E(ks, c0887Xc, A00, str);
        }
        c2g = this.A00.A02;
        c2g.A04();
    }

    @Override // com.facebook.ads.redexgen.X.MJ
    public final void A90() {
        InterfaceC0588Lk interfaceC0588Lk;
        C2D c2d;
        C2G c2g;
        C0887Xc c0887Xc;
        C2D c2d2;
        String str;
        InterfaceC0588Lk interfaceC0588Lk2;
        this.A00.A0M();
        interfaceC0588Lk = this.A00.A08;
        if (interfaceC0588Lk != null) {
            interfaceC0588Lk2 = this.A00.A08;
            interfaceC0588Lk2.ACM(true);
        }
        c2d = this.A00.A04;
        if (!TextUtils.isEmpty(c2d.A0C())) {
            KS ks = new KS();
            c0887Xc = this.A00.A05;
            c2d2 = this.A00.A04;
            Uri A00 = KT.A00(c2d2.A0C());
            str = this.A00.A09;
            KS.A0E(ks, c0887Xc, A00, str);
        }
        c2g = this.A00.A02;
        c2g.A06();
        this.A00.A0B();
    }

    @Override // com.facebook.ads.redexgen.X.MJ
    public final void ABj(C2F c2f) {
        C2F c2f2;
        C2D c2d;
        C2H A0B;
        C2D c2d2;
        MH.A00(this.A00);
        this.A00.A01 = c2f;
        c2f2 = this.A00.A01;
        if (c2f2 == C2F.A03) {
            c2d2 = this.A00.A04;
            A0B = c2d2.A0A();
        } else {
            c2d = this.A00.A04;
            A0B = c2d.A0B();
        }
        this.A00.A0E(A0B);
    }

    @Override // com.facebook.ads.redexgen.X.MJ
    public final void ABs(C2H c2h) {
        C2G c2g;
        MH.A00(this.A00);
        c2g = this.A00.A02;
        c2g.A07(c2h.A01());
        if (!c2h.A05().isEmpty()) {
            this.A00.A0E(c2h);
        } else {
            this.A00.A0D(c2h);
        }
    }
}
