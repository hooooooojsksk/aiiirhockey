package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import com.facebook.ads.AdError;
import com.facebook.ads.S2SRewardedVideoAdExtendedListener;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class Z8 extends AnonymousClass25 implements S2SRewardedVideoAdExtendedListener {
    public static byte[] A02;
    public final ZF A00;
    public final AnonymousClass24 A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 24);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{airhockey.J_ENEMYWIN, 96, airhockey.J_PURCHASE, airhockey.J_BACK, airhockey.J_GAME_ENEMYEXIT, 124, 124, airhockey.J_SDKVER, 124, airhockey.J_BACK, 109, airhockey.J_SDKVER, airhockey.J_GAME_EXIT, airhockey.J_GAME_ENEMYEXIT, airhockey.J_BACK, airhockey.J_GAME_STANDBY, airhockey.J_GAME_ENEMYEXIT, 119, 34, 37, 63, 52, 57, 61, 52, 61, 34, 47, 46, 36, 52, 47, 62, 57, 42, 63, 34, 36, 37, 52, 32, 46, 50, 62, 61, 60, 53, 45, 59, 60, 36, 51, 62, 59, 54, 51, 38, 59, 61, 60, 45, 38, 59, 63, 55, 45, 57, 55, 43, airhockey.P_GAME_EXIT, 77, 75, airhockey.P_GAME_BREAKBALLCOUNT, 92, 75, 75, 86, 75, airhockey.P_GAME_BREAKBALLCOUNT, 84, 92, airhockey.P_GAME_EXIT, airhockey.P_GAME_EXIT, 88, 94, 92, airhockey.P_GAME_BREAKBALLCOUNT, 82, 92, 64};
    }

    public Z8(String str, AnonymousClass27 anonymousClass27, ZF zf, AnonymousClass24 anonymousClass24) {
        super(str, anonymousClass27);
        this.A00 = zf;
        this.A01 = anonymousClass24;
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(com.facebook.ads.Ad ad) {
        super.A00.ABk(2104, super.A01, null);
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(com.facebook.ads.Ad ad) {
        Bundle bundle = new Bundle();
        bundle.putLong(A00(43, 26, 106), this.A00.A0G());
        bundle.putInt(A00(18, 25, 115), this.A01.A00);
        super.A00.ABk(AdError.BROKEN_MEDIA_ERROR_CODE, super.A01, bundle);
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(com.facebook.ads.Ad ad, AdError adError) {
        Bundle bundle = new Bundle();
        bundle.putString(A00(69, 21, 1), adError.getErrorMessage());
        bundle.putInt(A00(0, 18, 54), adError.getErrorCode());
        super.A00.ABk(2103, super.A01, bundle);
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(com.facebook.ads.Ad ad) {
        super.A00.ABk(2105, super.A01, null);
    }

    @Override // com.facebook.ads.S2SRewardedVideoAdListener
    public final void onRewardServerFailed() {
        super.A00.ABk(3002, super.A01, null);
    }

    @Override // com.facebook.ads.S2SRewardedVideoAdListener
    public final void onRewardServerSuccess() {
        super.A00.ABk(3001, super.A01, null);
    }

    @Override // com.facebook.ads.RewardedVideoAdExtendedListener
    public final void onRewardedVideoActivityDestroyed() {
        super.A00.ABk(2106, super.A01, null);
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public final void onRewardedVideoClosed() {
        super.A00.ABk(2110, super.A01, null);
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public final void onRewardedVideoCompleted() {
        super.A00.ABk(3000, super.A01, null);
    }
}
