package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.mobirix.airhockey.airhockey;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class VX implements BV {
    public static byte[] A05;
    public static String[] A06 = {"4UYaWsXN1cGpTlRGsO1EVWVYv3mJMVWU", "hbK8JAe0mxfaYRX1PJWZwY", "A0tXjRJ", "osk77A0r9", "0YYQ7Ec", "0ahCLR5uyRlwKx93emwBc8GJDT750HRT", "YIO", "F1mMZvBQ8EiEftVGCLgPL0zcj9avMacR"};
    public static final BY A07;
    public int A00;
    public int A01;
    public BX A02;
    public InterfaceC0351Bh A03;
    public VW A04;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 98);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{53, 78, 83, 85, 80, 80, 79, 82, 84, airhockey.P_GAME_STANDBY, airhockey.P_GAME_SELECTMAP, 0, 79, 82, 0, 85, 78, 82, airhockey.P_GAME_STANDBY, airhockey.P_GAME_MYSCORE, 79, airhockey.P_GAME_MYWIN, 78, airhockey.P_GAME_REMATCH, 90, airhockey.P_GAME_STANDBY, airhockey.P_GAME_SELECTMAP, 0, 87, 65, 86, 0, airhockey.P_GAME_MYLOSE, airhockey.P_GAME_STANDBY, 65, airhockey.P_GAME_SELECTMAP, airhockey.P_GAME_STANDBY, 82, 14, 52, airhockey.P_GAME_MYLOSE, 55, 60, airhockey.P_NATION, 2, airhockey.P_GAME_STANDBY, 52, airhockey.P_GAME_EXIT};
    }

    static {
        A01();
        A07 = new VY();
    }

    @Override // com.facebook.ads.redexgen.X.BV
    public final void A8V(BX bx) {
        this.A02 = bx;
        this.A03 = bx.AFc(0, 1);
        this.A04 = null;
        bx.A5G();
    }

    @Override // com.facebook.ads.redexgen.X.BV
    public final int ADp(BW bw, C0346Bc c0346Bc) throws IOException, InterruptedException {
        if (this.A04 == null) {
            this.A04 = C0378Cs.A00(bw);
            VW vw = this.A04;
            if (vw != null) {
                this.A03.A5X(Format.A06(null, A00(39, 9, 113), null, vw.A00(), 32768, this.A04.A03(), this.A04.A04(), this.A04.A02(), null, null, 0, null));
                this.A00 = this.A04.A01();
            } else {
                throw new C9Y(A00(0, 39, 126));
            }
        }
        VW vw2 = this.A04;
        if (A06[0].charAt(24) != 'v') {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[6] = "XBd";
        strArr[3] = "hS3DTCCH9";
        if (!vw2.A07()) {
            C0378Cs.A03(bw, this.A04);
            this.A02.AEd(this.A04);
        }
        int AEW = this.A03.AEW(bw, 32768 - this.A01, true);
        if (AEW != -1) {
            this.A01 += AEW;
        }
        int i = this.A01 / this.A00;
        if (i > 0) {
            long A052 = this.A04.A05(bw.A7P() - this.A01);
            int i2 = this.A00 * i;
            this.A01 -= i2;
            this.A03.AEY(A052, 1, i2, this.A01, null);
        }
        return AEW == -1 ? -1 : 0;
    }

    @Override // com.facebook.ads.redexgen.X.BV
    public final void AEc(long j, long j2) {
        this.A01 = 0;
    }

    @Override // com.facebook.ads.redexgen.X.BV
    public final boolean AFL(BW bw) throws IOException, InterruptedException {
        return C0378Cs.A00(bw) != null;
    }
}
