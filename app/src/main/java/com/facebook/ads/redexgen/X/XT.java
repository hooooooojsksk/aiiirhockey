package com.facebook.ads.redexgen.X;

import com.mobirix.airhockey.airhockey;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class XT extends K1 {
    public static byte[] A05;
    public final /* synthetic */ int A00;
    public final /* synthetic */ C7N A01;
    public final /* synthetic */ InterfaceC02557l A02;
    public final /* synthetic */ C02637t A03;
    public final /* synthetic */ String A04;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 120);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A05 = new byte[]{-37, -3, 30, 27, 46, 32, -39, 28, 43, 26, 44, 33, -39, 27, 30, 28, 26, 46, 44, 30, -39, 44, -2, 39, 47, 34, 43, 40, 39, 38, 30, 39, 45, -3, 26, 45, 26, 9, 43, 40, 47, 34, 29, 30, 43, -39, 39, 40, 45, -39, 34, 39, 35, 30, 28, 45, 30, 29, -46, -24, -19, -22, -97, -24, -14, -97, -19, -12, -21, -21, -96, 30, 33, 33, 38, 49, 38, 44, 43, 30, 41, 28, 38, 43, 35, 44, 45, airhockey.P_NATION, 45, 53, 56, 45, 46, 56, 49, 43, 48, 53, 63, 55, 43, 63, 60, 45, 47, 49, 62, 60, 62, airhockey.P_GAME_MYSCORE, 64, airhockey.J_ENEMYLOSE, 91, 89, airhockey.J_GAME_STANDBY, airhockey.J_ENEMYLOSE, 90, 85, 90, 87, airhockey.J_GAME_EXIT, 87, 88, 87, airhockey.J_GAME_REMATCH, 91, -18, -31, -19, -15, -31, -17, -16, -37, -27, -32, 44, 46, 27, 45, 50, 41, 30, 49, 51, 32, 50, 55, 46, 35, 29, 33, 45, 34, 35};
    }

    public XT(C7N c7n, String str, int i, C02637t c02637t, InterfaceC02557l interfaceC02557l) {
        this.A01 = c7n;
        this.A04 = str;
        this.A00 = i;
        this.A03 = c02637t;
        this.A02 = interfaceC02557l;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00b1, code lost:
        if (r2.equals(r1) != false) goto L30;
     */
    @Override // com.facebook.ads.redexgen.X.K1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A06() {
        /*
            Method dump skipped, instructions count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.XT.A06():void");
    }
}
