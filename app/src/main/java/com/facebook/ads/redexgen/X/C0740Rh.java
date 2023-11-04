package com.facebook.ads.redexgen.X;

import com.mobirix.airhockey.airhockey;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Rh */
/* loaded from: assets/audience_network.dex */
public class C0740Rh extends K1 {
    public static byte[] A01;
    public final /* synthetic */ C7J A00;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 126);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{airhockey.J_ONREWARDED, 91, 86, 87, 93, 18, airhockey.P_GAME_STANDBY, 83, 65, 18, 92, 87, airhockey.P_GAME_SELECTMAP, 87, 64, 18, airhockey.P_NATION, 64, 87, airhockey.P_NATION, 83, 64, 87, 86};
    }

    public C0740Rh(C7J c7j) {
        this.A00 = c7j;
    }

    @Override // com.facebook.ads.redexgen.X.K1
    public final void A06() {
        boolean z;
        z = this.A00.A07;
        if (!z) {
            this.A00.A0G(A00(0, 24, 76));
        }
    }
}
