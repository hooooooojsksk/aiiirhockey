package com.facebook.ads.redexgen.X;

import android.view.View;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class O7 implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ AbstractC02928x A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 50);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{airhockey.P_GAME_MYSCORE, 92, 81, 80, 90};
    }

    public O7(AbstractC02928x abstractC02928x) {
        this.A00 = abstractC02928x;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View$OnClickListenerC0759Sa ctaButton;
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            ctaButton = this.A00.getCtaButton();
            ctaButton.A09(A00(0, 5, 7));
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }
}
