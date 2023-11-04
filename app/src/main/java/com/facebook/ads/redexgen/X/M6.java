package com.facebook.ads.redexgen.X;

import android.view.View;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class M6 implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C0783Sy A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 108);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-27, -38, -25, -37, -28, -25, -30, -72, -23, -42, -72, -31, -34, -40, -32};
    }

    public M6(C0783Sy c0783Sy) {
        this.A00 = c0783Sy;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC0587Lj interfaceC0587Lj;
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            interfaceC0587Lj = this.A00.A06;
            interfaceC0587Lj.A3t(A00(0, 15, 9));
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }
}
