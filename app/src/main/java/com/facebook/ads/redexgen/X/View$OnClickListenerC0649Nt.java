package com.facebook.ads.redexgen.X;

import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Nt */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC0649Nt implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ SG A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 39);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-14, -27, -32, -31, -21};
    }

    public View$OnClickListenerC0649Nt(SG sg) {
        this.A00 = sg;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        O0 o0;
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            z = this.A00.A0H;
            if (z) {
                return;
            }
            o0 = this.A00.A0F;
            o0.A02(A00(0, 5, 85));
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }
}
