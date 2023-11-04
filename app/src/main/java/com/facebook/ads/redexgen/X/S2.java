package com.facebook.ads.redexgen.X;

import com.mobirix.airhockey.airhockey;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class S2 extends K1 {
    public static byte[] A02;
    public final /* synthetic */ OE A00;
    public final /* synthetic */ C02456y A01;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 46);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{93, airhockey.J_GAME_EXIT, airhockey.J_WAIT, airhockey.J_WAIT, airhockey.J_PURCHASE, 109, airhockey.J_REWARD, airhockey.J_BACK, airhockey.J_ACHIEVEMENTCALLBACK, 63, airhockey.J_REWARD, airhockey.J_BACK, 123, airhockey.J_PURCHASE, airhockey.J_WAIT, airhockey.J_REWARD, airhockey.J_BACK, airhockey.J_REWARD, airhockey.J_GAME_ENEMYEXIT, airhockey.J_PURCHASE, airhockey.J_SAVEDGAME_SAVE, 102};
    }

    public S2(OE oe, C02456y c02456y) {
        this.A00 = oe;
        this.A01 = c02456y;
    }

    @Override // com.facebook.ads.redexgen.X.K1
    public final void A06() {
        RA ra;
        RA ra2;
        ra = this.A00.A0D;
        if (ra.getState() == Q7.A02) {
            ra2 = this.A00.A0D;
            if (ra2.getCurrentPositionInMillis() == A00()) {
                this.A00.A0I(A00(0, 22, 49));
            }
        }
    }
}
