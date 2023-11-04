package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: assets/audience_network.dex */
public final class W2 extends CR {
    public static byte[] A02;
    public static String[] A03 = {"8dTWvXK8tch0WiEnFvHb8QUOTjgSOqY9", "GP5XsFGUIcP3F8wb7eo6", "CqCUMDrIKsNfOt03xA9INRdZ8", "ntm6pkiJXJn0b4vYMFRbAtYqalurqDmt", "MKNWZ4ceQqyXKZHhShlPBWdiS", "qmQfSGtBK4Bh2Swsb", "DS4", "jEA"};
    public W3 A00;
    public HP A01;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 12);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A02 = new byte[]{-97, -77, -94, -89, -83, 109, -92, -86, -97, -95};
    }

    static {
        A03();
    }

    private int A00(C0483Hc c0483Hc) {
        int i = (c0483Hc.A00[2] & UByte.MAX_VALUE) >> 4;
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                int i2 = i - 2;
                String[] strArr = A03;
                String str = strArr[3];
                String str2 = strArr[0];
                int charAt = str.charAt(11);
                int blockSizeCode = str2.charAt(11);
                if (charAt != blockSizeCode) {
                    String[] strArr2 = A03;
                    strArr2[6] = "ZGd";
                    strArr2[7] = "V9k";
                    return 576 << i2;
                }
                A03[1] = "m7WV3F64xJdvTLT";
                return 576 << i2;
            case 6:
            case 7:
                c0483Hc.A0Z(4);
                c0483Hc.A0O();
                String[] strArr3 = A03;
                String str3 = strArr3[3];
                String str4 = strArr3[0];
                int charAt2 = str3.charAt(11);
                int blockSizeCode2 = str4.charAt(11);
                if (charAt2 != blockSizeCode2) {
                    throw new RuntimeException();
                }
                String[] strArr4 = A03;
                strArr4[6] = "ycs";
                strArr4[7] = "AJV";
                int value = i == 6 ? c0483Hc.A0E() : c0483Hc.A0I();
                c0483Hc.A0Y(0);
                int blockSizeCode3 = value + 1;
                return blockSizeCode3;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                int blockSizeCode4 = i - 8;
                int value2 = 256 << blockSizeCode4;
                return value2;
            default:
                return -1;
        }
    }

    public static boolean A04(C0483Hc c0483Hc) {
        return c0483Hc.A04() >= 5 && c0483Hc.A0E() == 127 && c0483Hc.A0M() == 1179402563;
    }

    public static boolean A05(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // com.facebook.ads.redexgen.X.CR
    public final long A07(C0483Hc c0483Hc) {
        if (!A05(c0483Hc.A00)) {
            return -1L;
        }
        return A00(c0483Hc);
    }

    @Override // com.facebook.ads.redexgen.X.CR
    public final void A09(boolean z) {
        super.A09(z);
        if (z) {
            this.A01 = null;
            this.A00 = null;
        }
    }

    @Override // com.facebook.ads.redexgen.X.CR
    public final boolean A0A(C0483Hc c0483Hc, long j, CQ cq) throws IOException, InterruptedException {
        byte[] bArr = c0483Hc.A00;
        if (this.A01 == null) {
            this.A01 = new HP(bArr, 17);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 9, c0483Hc.A07());
            copyOfRange[4] = ByteCompanionObject.MIN_VALUE;
            List singletonList = Collections.singletonList(copyOfRange);
            cq.A00 = Format.A07(null, A02(0, 10, 50), null, -1, this.A01.A00(), this.A01.A01, this.A01.A06, singletonList, null, 0, null);
            return true;
        } else if ((bArr[0] & ByteCompanionObject.MAX_VALUE) == 3) {
            this.A00 = new W3(this);
            this.A00.A01(c0483Hc);
            return true;
        } else if (!A05(bArr)) {
            return true;
        } else {
            W3 w3 = this.A00;
            if (A03[5].length() != 17) {
                throw new RuntimeException();
            }
            A03[1] = "qWJSCS9yuHod5mMI2FbA5J9U";
            if (w3 != null) {
                w3.A00(j);
                cq.A01 = this.A00;
            }
            return false;
        }
    }
}
