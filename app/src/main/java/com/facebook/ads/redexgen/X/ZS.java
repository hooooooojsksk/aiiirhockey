package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: assets/audience_network.dex */
public class ZS implements AnonymousClass14 {
    public static byte[] A02;
    public static String[] A03 = {"gOGPE1XGqnroAJihU7XGAfTAdWa21jWC", "Kcs30m2Uc1eFMAQARd2pOhOOSRswugkg", "xkwB", "vFLx4ryI8nKhSFQKGVnAMH5qObxMihWN", "NnwKyO2XMzRH0BXfVduboZ9DAJ5a5svW", "U3uRLxNZuwH", "U9y6Wp3Jad2LD1", "sOAhAPVwmiqriGnbgM61Uai8lTIQh97W"};
    public final /* synthetic */ C0408Eb A00;
    public final /* synthetic */ Runnable A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 97);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{85, 83, 82, 4, 83, 87, 84, 85, airhockey.J_GOO, airhockey.P_GAME_MYWIN, 85, airhockey.P_GAME_MYSCORE, 80, airhockey.P_GAME_BREAKBALLCOUNT, airhockey.P_GAME_MYWIN, airhockey.P_GAME_BREAKBALLCOUNT, 2, airhockey.J_DISCONNECT, 75, airhockey.P_GAME_BREAKBALLCOUNT, airhockey.P_GAME_MYWIN, 77, 2, 75, 79, 82, 80, airhockey.P_GAME_MYWIN, 81, 81, 75, 77, 76, 2, airhockey.P_GAME_SELECTMAP, 75, 80, airhockey.P_GAME_MYWIN, airhockey.P_GAME_BREAKBALLCOUNT, airhockey.P_GAME_BREAKBALLCOUNT, airhockey.P_GAME_MYWIN, 123, 76, 94, airhockey.P_GAME_MYLOSE, 91, 77, 76, 77, ByteCompanionObject.MAX_VALUE, 64, 77, 76, airhockey.P_GAME_BREAKBALLCOUNT, airhockey.J_ENEMYLOSE, 77, airhockey.J_GAME_STANDBY, airhockey.P_GAME_BREAKBALLCOUNT, 78, 78, 64, airhockey.P_GAME_MYWIN, 78, 96, airhockey.P_GAME_SELECTMAP, 89, 91, 76, 90, 90, 64, airhockey.P_GAME_BREAKBALLCOUNT, airhockey.P_GAME_MYWIN};
    }

    static {
        A01();
    }

    public ZS(C0408Eb c0408Eb, Runnable runnable) {
        this.A00 = c0408Eb;
        this.A01 = runnable;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass14
    public final void ACN(AbstractC0956Zw abstractC0956Zw) {
        this.A00.A06.A06();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass14
    public final void ACO(AbstractC0956Zw abstractC0956Zw) {
        this.A00.A06.A07();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass14
    public final void ACP(AbstractC0956Zw abstractC0956Zw) {
        this.A00.A06.A0C();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass14
    public final void ACQ(AbstractC0956Zw abstractC0956Zw) {
        this.A00.A0E().removeCallbacks(this.A01);
        C0408Eb c0408Eb = this.A00;
        c0408Eb.A01 = abstractC0956Zw;
        c0408Eb.A0H();
        this.A00.A06.A0F(abstractC0956Zw);
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass14
    public final void ACR(AbstractC0956Zw abstractC0956Zw) {
        JO.A05(A00(39, 34, 72), A00(8, 31, 67), A00(0, 8, 7));
        this.A00.A06.A0D();
        this.A00.A0K();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass14
    public final void ACS(AbstractC0956Zw abstractC0956Zw) {
        this.A00.A06.A08();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass14
    public final void ACT(AbstractC0956Zw abstractC0956Zw, AdError adError) {
        this.A00.A0E().removeCallbacks(this.A01);
        this.A00.A0B.A0E().A4c(adError.getErrorCode(), adError.getErrorMessage());
        if (AdError.AD_PRESENTATION_ERROR.equals(adError) && IK.A1P(this.A00.A0B)) {
            this.A00.A06.A0G(JA.A00(AdErrorType.AD_PRESENTATION_ERROR));
        } else {
            AdError adError2 = AdError.NO_FILL;
            if (A03[2].length() != 4) {
                throw new RuntimeException();
            }
            A03[2] = "s57s";
            if (adError2.equals(adError)) {
                this.A00.A06.A0G(JA.A00(AdErrorType.NO_FILL));
            } else {
                this.A00.A06.A0G(JA.A00(AdErrorType.INTERNAL_ERROR));
            }
        }
        this.A00.A0M(abstractC0956Zw);
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass14
    public final void onRewardedVideoActivityDestroyed() {
        this.A00.A06.A09();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass14
    public final void onRewardedVideoClosed() {
        this.A00.A06.A0A();
    }
}
