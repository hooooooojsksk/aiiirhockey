package com.facebook.ads.redexgen.X;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.Display;
import android.view.View;
import androidx.annotation.NonNull;

/* renamed from: com.facebook.ads.redexgen.X.3E */
/* loaded from: assets/audience_network.dex */
public final class C3E {
    public static final C3D A00;

    static {
        if (Build.VERSION.SDK_INT >= 26) {
            A00 = new C0O() { // from class: com.facebook.ads.redexgen.X.04
            };
        } else if (Build.VERSION.SDK_INT >= 24) {
            A00 = new C0O();
        } else if (Build.VERSION.SDK_INT >= 23) {
            A00 = new C0Y();
        } else if (Build.VERSION.SDK_INT >= 21) {
            A00 = new C00760a();
        } else if (Build.VERSION.SDK_INT >= 19) {
            A00 = new C00790d();
        } else if (Build.VERSION.SDK_INT >= 18) {
            A00 = new C01071g();
        } else if (Build.VERSION.SDK_INT >= 17) {
            A00 = new C01543c();
        } else if (Build.VERSION.SDK_INT >= 16) {
            A00 = new EI();
        } else if (Build.VERSION.SDK_INT >= 15) {
            A00 = new C0927Yr();
        } else {
            A00 = new C3D();
        }
    }

    public static int A00(View view) {
        return A00.A03(view);
    }

    public static int A01(View view) {
        return A00.A04(view);
    }

    public static int A02(View view) {
        return A00.A05(view);
    }

    public static int A03(View view) {
        return A00.A06(view);
    }

    public static Display A04(@NonNull View view) {
        return A00.A07(view);
    }

    public static C3V A05(View view, C3V c3v) {
        return A00.A08(view, c3v);
    }

    public static C3V A06(View view, C3V c3v) {
        return A00.A09(view, c3v);
    }

    public static void A07(View view) {
        A00.A0A(view);
    }

    public static void A08(@NonNull View view) {
        A00.A0B(view);
    }

    public static void A09(View view, int i) {
        A00.A0C(view, i);
    }

    public static void A0A(View view, Drawable drawable) {
        A00.A0D(view, drawable);
    }

    public static void A0B(View view, C01442s c01442s) {
        A00.A0E(view, c01442s);
    }

    public static void A0C(View view, InterfaceC01502y interfaceC01502y) {
        A00.A0F(view, interfaceC01502y);
    }

    public static void A0D(View view, Runnable runnable) {
        A00.A0G(view, runnable);
    }

    public static void A0E(View view, Runnable runnable, long j) {
        A00.A0H(view, runnable, j);
    }

    public static boolean A0F(View view) {
        return A00.A0K(view);
    }

    public static boolean A0G(View view) {
        return A00.A0I(view);
    }

    public static boolean A0H(View view) {
        return A00.A0J(view);
    }
}
