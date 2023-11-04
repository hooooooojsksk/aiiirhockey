package com.facebook.ads.redexgen.X;

import com.facebook.ads.AudienceNetworkAds;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class XN extends K1 {
    public static byte[] A02;
    public final /* synthetic */ AudienceNetworkAds.InitListener A00;
    public final /* synthetic */ AudienceNetworkAds.InitResult A01;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 70);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{22, 20, 27, 18, airhockey.P_GAME_SELECTMAP, 26, airhockey.P_GAME_MYSCORE, airhockey.P_GAME_MYWIN, 94, airhockey.P_GAME_REMATCH, airhockey.P_GAME_BREAKBALLCOUNT, 45, airhockey.J_ONREWARDED, 99, airhockey.J_ONREWARDED, airhockey.J_WAIT, airhockey.J_ONREWARDED, airhockey.J_GAME_DISCONNECT, airhockey.J_SDKVER, airhockey.J_ONREWARDED, 119, airhockey.J_GAME_DISCONNECT, airhockey.J_WAIT, airhockey.J_ONREWARDED, airhockey.J_NATION, 99, 45, airhockey.J_INVITE, airhockey.J_NATION, 96, 125, airhockey.J_SDKVER, airhockey.J_ENEMYLOSE, airhockey.J_WAIT, airhockey.J_ENEMYLOSE, airhockey.P_GAME_STANDBY, airhockey.P_NATION, 89, airhockey.J_ONREWARDED, 86, 81, 82};
    }

    public XN(AudienceNetworkAds.InitListener initListener, AudienceNetworkAds.InitResult initResult) {
        this.A00 = initListener;
        this.A01 = initResult;
    }

    @Override // com.facebook.ads.redexgen.X.K1
    public final void A06() {
        JO.A05(A00(35, 7, 113), A00(8, 27, 75), A00(0, 8, 100));
        this.A00.onInitialized(this.A01);
    }
}
