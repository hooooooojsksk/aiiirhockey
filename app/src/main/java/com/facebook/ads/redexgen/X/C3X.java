package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: com.facebook.ads.redexgen.X.3X */
/* loaded from: assets/audience_network.dex */
public final class C3X {
    public static final C3W A00;

    static {
        if (Build.VERSION.SDK_INT >= 19) {
            A00 = new EG();
        } else if (Build.VERSION.SDK_INT >= 16) {
            A00 = new C0923Ym();
        } else {
            A00 = new C3W();
        }
    }

    public static int A00(AccessibilityEvent accessibilityEvent) {
        return A00.A00(accessibilityEvent);
    }

    public static void A01(AccessibilityEvent accessibilityEvent, int i) {
        A00.A01(accessibilityEvent, i);
    }
}
