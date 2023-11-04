package com.facebook.ads.redexgen.X;

import com.mobirix.airhockey.airhockey;
import java.lang.reflect.Constructor;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class WX implements BY {
    public static byte[] A06;
    public static final Constructor<? extends BV> A07;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05 = 1;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 120);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{38, 83, 83, 80, 83, 1, airhockey.P_GAME_EXIT, 79, 84, 85, airhockey.P_NATION, 79, 85, airhockey.P_GAME_EXIT, airhockey.P_NATION, 85, airhockey.P_GAME_EXIT, 79, airhockey.P_GAME_MYLOSE, 1, 39, 45, 34, 36, 1, airhockey.P_GAME_BREAKBALLCOUNT, 89, 85, airhockey.P_GAME_BREAKBALLCOUNT, 79, 84, airhockey.P_GAME_EXIT, 80, 79, 42, airhockey.P_GAME_MYSCORE, 58, 77, airhockey.P_GAME_STANDBY, 58, 56, airhockey.P_GAME_REMATCH, 58, 57, -11, 58, airhockey.P_GAME_MYWIN, airhockey.P_GAME_MYWIN, airhockey.P_GAME_SELECTMAP, airhockey.P_GAME_MYWIN, -11, 56, airhockey.P_GAME_MYWIN, 58, 54, airhockey.P_GAME_REMATCH, 62, airhockey.P_GAME_MYSCORE, 60, -11, 27, 33, 22, 24, -11, 58, 77, airhockey.P_GAME_REMATCH, airhockey.P_GAME_MYWIN, 54, 56, airhockey.P_GAME_REMATCH, airhockey.P_GAME_SELECTMAP, airhockey.P_GAME_MYWIN, 24, 36, 34, -29, 27, 22, 24, 26, 23, 36, 36, 32, -29, 22, 25, 40, -29, 30, 35, 41, 26, 39, 35, 22, 33, -29, 26, 45, 36, 37, 33, 22, 46, 26, 39, -25, -29, 26, 45, 41, -29, 27, 33, 22, 24, -29, -5, 33, 22, 24, -6, 45, 41, 39, 22, 24, 41, 36, 39};
    }

    static {
        A01();
        Constructor<? extends BV> constructor = null;
        try {
            constructor = Class.forName(A00(74, 59, 61)).asSubclass(BV.class).getConstructor(new Class[0]);
        } catch (ClassNotFoundException unused) {
        } catch (Exception e) {
            throw new RuntimeException(A00(0, 34, 105), e);
        }
        A07 = constructor;
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final synchronized BV[] A4L() {
        BV[] bvArr;
        bvArr = new BV[A07 == null ? 12 : 13];
        bvArr[0] = new WI(this.A01);
        bvArr[1] = new W8(this.A00);
        bvArr[2] = new W6(this.A03);
        bvArr[3] = new WF(this.A02);
        bvArr[4] = new C0851Vs();
        bvArr[5] = new C0854Vv();
        bvArr[6] = new VZ(this.A05, this.A04);
        bvArr[7] = new WP();
        bvArr[8] = new W0();
        bvArr[9] = new C0841Vf();
        bvArr[10] = new VX();
        bvArr[11] = new WS();
        if (A07 != null) {
            try {
                bvArr[12] = A07.newInstance(new Object[0]);
            } catch (Exception e) {
                throw new IllegalStateException(A00(34, 40, 93), e);
            }
        }
        return bvArr;
    }
}
