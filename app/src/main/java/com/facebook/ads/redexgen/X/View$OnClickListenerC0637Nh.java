package com.facebook.ads.redexgen.X;

import android.view.View;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Nh */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC0637Nh implements View.OnClickListener {
    public static byte[] A01;
    public static String[] A02 = {"", "HBnrsW65aYWVvlJTMpWxFuU7z6MV4xxJ", "tXIuQqWBvr", "", "VtieTS2CshWtQMI3l6Acm9um24vRFq1J", "25ZZ2FxRZN7AWJhoRaY84f3F1yf7l7BH", "QBWydbCUfoNWyqRHIYB4mtuveM9uMuB5", "ip309lScFF5SkXTTlyumKzm4Zaw9hedS"};
    public final /* synthetic */ SQ A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            int i5 = copyOfRange[i4] ^ i3;
            if (A02[2].length() == 2) {
                throw new RuntimeException();
            }
            A02[4] = "tqBSefJA8FkovjSgYNKxEGKjBcizSh9O";
            copyOfRange[i4] = (byte) (i5 ^ 15);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{airhockey.J_SAVEDGAME_RELOAD, airhockey.J_REWARD, airhockey.J_PURCHASE, 124, 126};
    }

    static {
        A01();
    }

    public View$OnClickListenerC0637Nh(SQ sq) {
        this.A00 = sq;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            this.A00.getCtaButton().A09(A00(0, 5, 20));
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }
}
