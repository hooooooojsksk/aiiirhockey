package com.facebook.ads.redexgen.X;

import android.view.View;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class P4 implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ RL A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 111);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{21, 30, 20, 19, 17, 34, 20, 35};
    }

    public P4(RL rl) {
        this.A00 = rl;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View$OnClickListenerC0759Sa view$OnClickListenerC0759Sa;
        View$OnClickListenerC0759Sa view$OnClickListenerC0759Sa2;
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            view$OnClickListenerC0759Sa = this.A00.A02;
            if (view$OnClickListenerC0759Sa == null) {
                return;
            }
            view$OnClickListenerC0759Sa2 = this.A00.A02;
            view$OnClickListenerC0759Sa2.A09(A00(0, 8, 65));
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }
}
