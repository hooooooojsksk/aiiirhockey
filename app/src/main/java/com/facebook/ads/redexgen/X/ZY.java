package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: assets/audience_network.dex */
public class ZY implements InterfaceC00980x {
    public static byte[] A02;
    public static String[] A03 = {"CodBKn6Rx4Nd2NCJ9VlYeJoUvBmT0K9p", "5Rf8WjvcJZOUdeEvkpnEyeT6h0OK8cqO", "9H9umRBAwWbsUQsHVAjP1GvoefoGWKiv", "nqryT6E7", "BkgpBj4q", "vUmBCwuwnOwC6wDkIlhiKnb32h6Srhe1", "47HB5bdSxtP74yDXUEGozfNjn4WOkRGN", "xids5JFtyjlo4uGEh5DI8Wwgi7h0jVQM"};
    public final /* synthetic */ C0425Es A00;
    public final /* synthetic */ Runnable A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            int i5 = (copyOfRange[i4] ^ i3) ^ 34;
            String[] strArr = A03;
            if (strArr[5].charAt(5) == strArr[1].charAt(5)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[5] = "sVZQ6Ml9fBzEITS5ybXWTtwXQoWqWbAN";
            strArr2[1] = "MwEMOJFXQFuJpU8zWQ85tYeWswvxAO3B";
            copyOfRange[i4] = (byte) i5;
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{109, airhockey.J_GAME_ENEMYEXIT, airhockey.J_ENEMYLOSE, airhockey.J_GAME_EXIT, airhockey.J_ENEMYLOSE, 61, 56, 15, 42, 47, 62, 58, 43, 60, airhockey.J_INVITE, 39, 61, airhockey.J_INVITE, 32, 59, 34, 34, airhockey.J_INVITE, 33, 32, airhockey.J_INVITE, 34, 33, 47, 42, 7, 32, 58, 43, 60, 61, 58, 39, 58, 39, 47, 34, 15, 42, 93, airhockey.J_PURCHASE, 96, airhockey.J_BACK, 102, airhockey.J_ENEMYWIN, 96, 125, 96, 125, airhockey.J_ERROR, airhockey.J_ACHIEVEMENTCALLBACK, 52, 125, airhockey.J_WAIT, airhockey.J_ONREWARDED, 102, airhockey.J_BACK, airhockey.J_ENEMYWIN, airhockey.J_ENEMYWIN, 125, 123, airhockey.J_PURCHASE, 52, airhockey.J_SAVEDGAME_RELOAD, 125, 102, airhockey.J_BACK, airhockey.J_GOO, airhockey.J_GAME_EXIT, airhockey.J_GAME_STANDBY, 84, airhockey.J_GAME_EXIT, airhockey.J_ENEMYLOSE, ByteCompanionObject.MAX_VALUE, airhockey.J_NATION, 125, airhockey.J_NATION, ByteCompanionObject.MAX_VALUE, airhockey.J_SAVEDGAME_RELOAD, 47, 32, 42, 60, 33, 39, 42, 96, 39, 32, 58, 43, 32, 58, 96, 47, 45, 58, 39, 33, 32, 96, 24, 7, 11, 25, airhockey.J_INVITE, ByteCompanionObject.MAX_VALUE, 102, 11, 10, 45, 10, 16, 1, 22, 23, 16, 13, 16, 13, 5, 8, 40, 11, 3, 3, 13, 10, 3, 45, 9, 20, 22, 1, 23, 23, 13, 11, 10};
    }

    static {
        A01();
    }

    public ZY(C0425Es c0425Es, Runnable runnable) {
        this.A00 = c0425Es;
        this.A01 = runnable;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00980x
    public final void ABE(C0969a9 c0969a9, String str, boolean z) {
        this.A00.A06.A0C();
        boolean clickUrlDefined = !TextUtils.isEmpty(str);
        if (z && clickUrlDefined) {
            try {
                Intent intent = new Intent(A00(84, 26, 108));
                intent.setData(KT.A00(str));
                KG.A0B(this.A00.A0B, intent);
            } catch (KE e) {
                Throwable cause = e.getCause();
                Throwable th = e;
                if (cause != null) {
                    th = e.getCause();
                }
                this.A00.A0B.A07().A9C(A00(73, 11, 41), C02627s.A04, new C02637t(th));
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00980x
    public final void ABF(C0969a9 c0969a9) {
        this.A00.A06.A04();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00980x
    public final void ABG(C0969a9 c0969a9) {
        this.A00.A06.A05();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00980x
    public final void ABH(C0969a9 c0969a9) {
        if (c0969a9 != this.A00.A00) {
            return;
        }
        if (c0969a9 == null) {
            this.A00.A0B.A07().A9C(A00(110, 3, 45), C02627s.A0X, new C02637t(A00(7, 37, 108)));
            ABI(c0969a9, AdError.internalError(AdError.INTERNAL_ERROR_2004));
            return;
        }
        this.A00.A0E().removeCallbacks(this.A01);
        C0425Es c0425Es = this.A00;
        c0425Es.A01 = c0969a9;
        c0425Es.A0H();
        this.A00.A06.A0F(c0969a9);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00980x
    public final void ABI(C0969a9 c0969a9, AdError adError) {
        if (c0969a9 != this.A00.A00) {
            return;
        }
        this.A00.A0E().removeCallbacks(this.A01);
        this.A00.A0M(c0969a9);
        this.A00.A0B.A0E().A4c(adError.getErrorCode(), adError.getErrorMessage());
        this.A00.A06.A0G(new JA(adError.getErrorCode(), adError.getErrorMessage()));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00980x
    public final void ABJ(C0969a9 c0969a9) {
        JO.A05(A00(113, 31, 70), A00(44, 29, 54), A00(0, 7, 121));
        this.A00.A06.A0D();
        this.A00.A0K();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00980x
    public final void ABK() {
        this.A00.A06.A08();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00980x
    public final void ABL() {
        this.A00.A06.A06();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00980x
    public final void ABM() {
        this.A00.A06.A07();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00980x
    public final void onInterstitialActivityDestroyed() {
        this.A00.A06.A02();
    }
}
