package com.facebook.ads.redexgen.X;

import com.mobirix.airhockey.airhockey;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class T5 implements InterfaceC0557Kd {
    public static byte[] A01;
    public final /* synthetic */ T0 A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 97);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{airhockey.J_GAME_DISCONNECT, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_WAIT, airhockey.J_NATION, airhockey.J_INVITE, airhockey.J_SDKVER, airhockey.J_ONREWARDED, airhockey.J_INVITE, 102};
    }

    public T5(T0 t0) {
        this.A00 = t0;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0557Kd
    public final void AAa() {
        boolean z;
        boolean z2;
        z = this.A00.A0B;
        if (!z) {
            z2 = this.A00.A09;
            if (!z2) {
                this.A00.A0X(false, A00(0, 9, 108));
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0557Kd
    public final void ACC(float f) {
    }
}
