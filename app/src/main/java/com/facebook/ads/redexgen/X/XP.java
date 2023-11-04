package com.facebook.ads.redexgen.X;

import com.facebook.ads.AudienceNetworkAds;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class XP extends K1 {
    public static byte[] A02;
    public final /* synthetic */ AudienceNetworkAds.InitListener A00;
    public final /* synthetic */ C0886Xb A01;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 8);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{91, airhockey.J_GAME_DISCONNECT, 99, 40, 123, 125, airhockey.J_GAME_ENEMYEXIT, airhockey.J_GAME_ENEMYEXIT, 109, 123, 123, airhockey.J_INVITE, 125, airhockey.J_ONREWARDED, airhockey.J_ONREWARDED, airhockey.J_BACK, 40, airhockey.J_SDKVER, 102, airhockey.J_SDKVER, 124, airhockey.J_SDKVER, airhockey.J_GAME_REMATCH, airhockey.J_ONREWARDED, airhockey.J_SDKVER, airhockey.J_SAVEDGAME_RELOAD, 109, airhockey.J_GAME_DISCONNECT, 41};
    }

    public XP(C0886Xb c0886Xb, AudienceNetworkAds.InitListener initListener) {
        this.A01 = c0886Xb;
        this.A00 = initListener;
    }

    @Override // com.facebook.ads.redexgen.X.K1
    public final void A06() {
        try {
            XA.A02().A0C(this.A01);
        } catch (Throwable th) {
            this.A01.A07().A3S(th);
        }
        C8G.A0C(this.A01);
        AudienceNetworkAds.InitListener initListener = this.A00;
        if (initListener != null) {
            C8G.A04(initListener, new C8F(true, A00(0, 29, 0)));
        }
    }
}
