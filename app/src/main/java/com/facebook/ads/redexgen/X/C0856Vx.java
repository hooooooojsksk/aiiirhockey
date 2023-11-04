package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.mobirix.airhockey.airhockey;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Vx */
/* loaded from: assets/audience_network.dex */
public final class C0856Vx extends CR {
    public static byte[] A05;
    public static String[] A06 = {"yJHQcBl4f4L", "G0ieIp3rn9VMbRQq", "FaSr", "diNTGhkPk6T4rZ0cbtlCtFUtzgnoDDOW", "ZsfK02RsUHO", "uQbwEIiYvgO", "fIpYaZEOmsgiiOCz2AK4PDqwDhI8GLBw", "t90Xt1PXy7A3GvR50K3KPdbeyD"};
    public int A00;
    public CT A01;
    public CV A02;
    public CX A03;
    public boolean A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final CT A02(C0483Hc c0483Hc) throws IOException {
        if (this.A03 == null) {
            this.A03 = CY.A04(c0483Hc);
            return null;
        } else if (this.A02 == null) {
            this.A02 = CY.A03(c0483Hc);
            return null;
        } else {
            byte[] bArr = new byte[c0483Hc.A07()];
            System.arraycopy(c0483Hc.A00, 0, bArr, 0, c0483Hc.A07());
            CW[] A0C = CY.A0C(c0483Hc, this.A03.A05);
            return new CT(this.A03, this.A02, bArr, A0C, CY.A00(A0C.length - 1));
        }
    }

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 45);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A05 = new byte[]{88, 76, 93, 80, 86, 22, 79, 86, 75, 91, 80, airhockey.P_GAME_EXIT};
    }

    static {
        A04();
    }

    public static int A00(byte b, int i, int i2) {
        return (b >> i2) & (255 >>> (8 - i));
    }

    public static int A01(byte b, CT ct) {
        if (!ct.A04[A00(b, ct.A00, 1)].A03) {
            int modeNumber = ct.A02.A03;
            return modeNumber;
        }
        int modeNumber2 = ct.A02.A04;
        return modeNumber2;
    }

    public static void A05(C0483Hc c0483Hc, long j) {
        c0483Hc.A0X(c0483Hc.A07() + 4);
        c0483Hc.A00[c0483Hc.A07() - 4] = (byte) (j & 255);
        c0483Hc.A00[c0483Hc.A07() - 3] = (byte) ((j >>> 8) & 255);
        c0483Hc.A00[c0483Hc.A07() - 2] = (byte) ((j >>> 16) & 255);
        c0483Hc.A00[c0483Hc.A07() - 1] = (byte) (255 & (j >>> 24));
    }

    public static boolean A06(C0483Hc c0483Hc) {
        try {
            return CY.A0A(1, c0483Hc, true);
        } catch (C9Y unused) {
            return false;
        }
    }

    @Override // com.facebook.ads.redexgen.X.CR
    public final long A07(C0483Hc c0483Hc) {
        int i = 0;
        if ((c0483Hc.A00[0] & 1) == 1) {
            return -1L;
        }
        int A01 = A01(c0483Hc.A00[0], this.A01);
        if (this.A04) {
            int packetBlockSize = this.A00;
            i = (packetBlockSize + A01) / 4;
        }
        A05(c0483Hc, i);
        this.A04 = true;
        int samplesInPacket = A06[2].length();
        if (samplesInPacket != 7) {
            String[] strArr = A06;
            strArr[6] = "lV1SPFBYbG5lxAnFlWta4jj5erMHhp00";
            strArr[3] = "grWENQhpkSsLY54DCH6OLJaVWIdWM4Dq";
            this.A00 = A01;
            return i;
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.X.CR
    public final void A08(long j) {
        super.A08(j);
        this.A04 = j != 0;
        CX cx = this.A03;
        this.A00 = cx != null ? cx.A03 : 0;
    }

    @Override // com.facebook.ads.redexgen.X.CR
    public final void A09(boolean z) {
        super.A09(z);
        if (z) {
            this.A01 = null;
            this.A03 = null;
            this.A02 = null;
        }
        this.A00 = 0;
        this.A04 = false;
    }

    @Override // com.facebook.ads.redexgen.X.CR
    public final boolean A0A(C0483Hc c0483Hc, long j, CQ cq) throws IOException, InterruptedException {
        if (this.A01 == null) {
            this.A01 = A02(c0483Hc);
            if (this.A01 == null) {
                return true;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.A01.A02.A09);
            arrayList.add(this.A01.A03);
            cq.A00 = Format.A07(null, A03(0, 12, 20), null, this.A01.A02.A02, -1, this.A01.A02.A05, (int) this.A01.A02.A06, arrayList, null, 0, null);
            return true;
        }
        return false;
    }
}
