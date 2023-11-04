package com.facebook.ads.redexgen.X;

import com.mobirix.airhockey.airhockey;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class KH implements Runnable {
    public static byte[] A01;
    public final /* synthetic */ C0887Xc A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 118);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{airhockey.J_SDKVER, airhockey.J_PURCHASE, 125, airhockey.J_NATION, airhockey.J_SDKVER, 99, airhockey.J_ENEMYLOSE, 99, airhockey.J_DISCONNECT, 111, airhockey.J_GAME_STANDBY};
    }

    public KH(C0887Xc c0887Xc) {
        this.A00 = c0887Xc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            C02637t c02637t = new C02637t(A00(0, 4, 88));
            c02637t.A03(1);
            c02637t.A04(1);
            c02637t.A08(false);
            this.A00.A07().A9D(A00(4, 7, 112), C02627s.A1Y, c02637t);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }
}
