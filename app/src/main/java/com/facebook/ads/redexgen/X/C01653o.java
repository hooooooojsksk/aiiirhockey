package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.widget.EdgeEffect;

/* renamed from: com.facebook.ads.redexgen.X.3o */
/* loaded from: assets/audience_network.dex */
public final class C01653o {
    public static final C01643n A00;

    static {
        if (Build.VERSION.SDK_INT >= 21) {
            A00 = new C0918Yh();
        } else {
            A00 = new C01643n();
        }
    }

    public static void A00(EdgeEffect edgeEffect, float f, float f2) {
        A00.A00(edgeEffect, f, f2);
    }
}
