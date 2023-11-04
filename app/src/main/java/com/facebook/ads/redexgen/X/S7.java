package com.facebook.ads.redexgen.X;

import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: assets/audience_network.dex */
public class S7 implements OL {
    public static byte[] A01;
    public static String[] A02 = {"0PGepnyvQncL93SwwJBKfYdUcygiJGu5", "mA1Oa6p2jIMu30EggfbRnzpoMhUl4ssl", "uwNPSbrm", "iNgEEx1gRKfrkJTOWqECaM4K08S9ZrIg", "vqVg9oljZl3AjvyleCGqLOYkhmYrxu", "amhtUlMIP3hZuFCKepG62aSokShv2UYv", "BTFyXEOVMEP0nOw0jY0q9zOCSLZ2OeYc", "tcCWg0XVw1JTHEC59N6ZXoklrHSl9wSv"};
    public final /* synthetic */ C02908v A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = (byte) ((copyOfRange[i4] ^ i3) ^ 51);
            String[] strArr = A02;
            if (strArr[0].charAt(0) == strArr[7].charAt(0)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[3] = "WujDwNVbN3bAuExlfya79vhQsxgnNgQM";
            strArr2[5] = "dVRJVduTnq2Mgx4vxcEM2Hhpe9jWwRq5";
            copyOfRange[i4] = b;
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{91, 90, 44, 111, 126, 109, ByteCompanionObject.MAX_VALUE, airhockey.J_ONREWARDED, airhockey.J_GAME_REMATCH, airhockey.J_ENEMYLOSE, 87, airhockey.P_GAME_STANDBY, airhockey.P_NATION, ByteCompanionObject.MAX_VALUE, 86, airhockey.P_GAME_REMATCH, airhockey.P_GAME_STANDBY, 87};
    }

    static {
        A01();
    }

    public S7(C02908v c02908v) {
        this.A00 = c02908v;
    }

    @Override // com.facebook.ads.redexgen.X.OL
    public final void ACB() {
        C0886Xb context = C7M.A00();
        if (context != null) {
            context.A07().A9C(A00(10, 8, 19), C02627s.A2d, new C02637t(A00(0, 10, 63)));
        }
    }
}
