package com.facebook.ads.redexgen.X;

import com.mobirix.airhockey.airhockey;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class ST extends K1 {
    public static byte[] A01;
    public static String[] A02 = {"tqjsEEcJIl5fnT50RexN0Ul8jJNRcJH3", "bcHaNcoWvApI2nKaudb7K7xtbFjWkSY2", "iyPpS1SdU0ZqVBkmFeVqNLta6ZFg9Iqa", "UBClilIqx1CzUaWBAcSFWImK7oEyUnNj", "3QGuHwFl80gr6moaepv76MMeXXWdVHzR", "LTxBQzMWcHhaEkgA4RYqwBVdVGvYrVKd", "khQutPcnm0RXwnjsvW5BsBwBtMJWmKup", "vMJICmQj5dYIJdPu1hKuz0wH7PDNWSqy"};
    public final /* synthetic */ C0633Nd A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 100);
            String[] strArr = A02;
            if (strArr[3].charAt(18) == strArr[1].charAt(18)) {
                throw new RuntimeException();
            }
            A02[6] = "0Kfb69VsCmdvaLaP4iTMNX4D6n507IHd";
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{96, 95, 82, 83, 89, 22, 65, 87, airhockey.P_GAME_STANDBY, 22, 88, 83, 64, 83, airhockey.P_GAME_SELECTMAP, 22, airhockey.P_GAME_BREAKBALLCOUNT, airhockey.P_GAME_SELECTMAP, 83, airhockey.P_GAME_BREAKBALLCOUNT, 87, airhockey.P_GAME_SELECTMAP, 83, 82};
    }

    static {
        A02();
    }

    public ST(C0633Nd c0633Nd) {
        this.A00 = c0633Nd;
    }

    @Override // com.facebook.ads.redexgen.X.K1
    public final void A06() {
        boolean z;
        InterfaceC0657Ob interfaceC0657Ob;
        z = this.A00.A08;
        if (!z) {
            interfaceC0657Ob = this.A00.A0M;
            interfaceC0657Ob.ACz(A00(0, 24, 82));
        }
    }
}
