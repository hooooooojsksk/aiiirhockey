package com.facebook.ads.redexgen.X;

import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Lv */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC0599Lv implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ T0 A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 61);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{43, 41, 27, 40, 25, 34, 31, 25, 33};
    }

    public View$OnClickListenerC0599Lv(T0 t0) {
        this.A00 = t0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            this.A00.A0X(false, A00(0, 9, 121));
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }
}
