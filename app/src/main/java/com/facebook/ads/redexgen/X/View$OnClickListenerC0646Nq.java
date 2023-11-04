package com.facebook.ads.redexgen.X;

import android.view.View;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Nq */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC0646Nq implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ SN A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 45);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{airhockey.J_GAME_ENEMYEXIT, 111, 99, airhockey.J_GAME_STANDBY, airhockey.J_ENEMYWIN};
    }

    public View$OnClickListenerC0646Nq(SN sn) {
        this.A00 = sn;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            this.A00.getCtaButton().A09(A00(0, 5, 47));
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }
}
