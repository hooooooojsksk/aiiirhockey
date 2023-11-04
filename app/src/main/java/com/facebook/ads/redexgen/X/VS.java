package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class VS implements DB {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 87);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-61, -10, -10, -25, -17, -14, -10, -25, -26, -94, -10, -15, -94, -27, -12, -25, -29, -10, -25, -94, -26, -25, -27, -15, -26, -25, -12, -94, -24, -15, -12, -94, -9, -16, -11, -9, -14, -14, -15, -12, -10, -25, -26, -94, -24, -15, -12, -17, -29, -10, 8, 23, 23, 19, 16, 10, 8, 27, 16, 22, 21, -42, 16, 11, -38, -39, -24, -24, -28, -31, -37, -39, -20, -31, -25, -26, -89, -16, -91, -35, -27, -21, -33, -72, -57, -57, -61, -64, -70, -72, -53, -64, -58, -59, -122, -49, -124, -54, -70, -53, -68, -118, -116};
    }

    @Override // com.facebook.ads.redexgen.X.DB
    public final D9 A4I(Format format) {
        char c;
        String str = format.A0O;
        int hashCode = str.hashCode();
        if (hashCode == -1248341703) {
            if (str.equals(A00(50, 15, 80))) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != 1154383568) {
            if (hashCode == 1652648887 && str.equals(A00(83, 20, 0))) {
                c = 2;
            }
            c = 65535;
        } else {
            if (str.equals(A00(65, 18, 33))) {
                c = 1;
            }
            c = 65535;
        }
        if (c != 0) {
            if (c != 1) {
                if (c == 2) {
                    return new VL();
                }
                throw new IllegalArgumentException(A00(0, 50, 43));
            }
            return new VQ();
        }
        return new VO();
    }

    @Override // com.facebook.ads.redexgen.X.DB
    public final boolean AFZ(Format format) {
        String str = format.A0O;
        String mimeType = A00(50, 15, 80);
        if (!mimeType.equals(str)) {
            String mimeType2 = A00(65, 18, 33);
            if (!mimeType2.equals(str)) {
                String mimeType3 = A00(83, 20, 0);
                if (!mimeType3.equals(str)) {
                    return false;
                }
            }
        }
        return true;
    }
}
