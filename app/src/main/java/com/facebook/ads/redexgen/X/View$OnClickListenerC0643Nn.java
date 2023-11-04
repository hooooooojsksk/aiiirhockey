package com.facebook.ads.redexgen.X;

import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Nn */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC0643Nn implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ AnonymousClass94 A00;

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
        A01 = new byte[]{27, 31, 19, 25, 23};
    }

    public View$OnClickListenerC0643Nn(AnonymousClass94 anonymousClass94) {
        this.A00 = anonymousClass94;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            getCtaButton().A09(A00(0, 5, 67));
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }
}
