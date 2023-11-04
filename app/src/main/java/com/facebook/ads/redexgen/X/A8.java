package com.facebook.ads.redexgen.X;

import com.mobirix.airhockey.airhockey;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class A8 extends NY {
    public static byte[] A01;
    public final /* synthetic */ C0783Sy A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 63);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{airhockey.P_GAME_MYLOSE, 87, 90, 91, 81, 119, 80, airhockey.P_GAME_EXIT, 91, 76, 77, airhockey.P_GAME_EXIT, 87, airhockey.P_GAME_EXIT, 95, 82, 123, airhockey.P_GAME_MYLOSE, 91, 80, airhockey.P_GAME_EXIT};
    }

    public A8(C0783Sy c0783Sy) {
        this.A00 = c0783Sy;
    }

    @Override // com.facebook.ads.redexgen.X.C8V
    /* renamed from: A02 */
    public final void A03(C02466z c02466z) {
        InterfaceC0587Lj interfaceC0587Lj;
        interfaceC0587Lj = this.A00.A06;
        interfaceC0587Lj.A3u(A00(0, 21, 1), c02466z);
    }
}
