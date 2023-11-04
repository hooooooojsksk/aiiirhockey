package com.facebook.ads.redexgen.X;

import android.app.Activity;
import android.content.Context;

/* renamed from: com.facebook.ads.redexgen.X.5M */
/* loaded from: assets/audience_network.dex */
public final class C5M {
    public static C0R A00(Context context, C7P c7p) {
        C0886Xb sdkContext = A07(context);
        C0U A6p = c7p.A6p(sdkContext);
        if (A6p != null) {
            return A6p.A9f();
        }
        return new C0984aO();
    }

    public static C0887Xc A01(Activity activity) {
        return new C0887Xc(activity, A08(), A00(activity, A08()));
    }

    public static C0887Xc A02(Context context) {
        return new C0887Xc(context, A08(), new C0984aO());
    }

    public static C0887Xc A03(Context context) {
        return new C0887Xc(context, A08(), A00(context, A08()));
    }

    public static C0887Xc A04(Context context) {
        if (IK.A0r(context)) {
            return new C0887Xc(context, A08(), A00(context, A08()));
        }
        return A02(context);
    }

    public static C0887Xc A05(Context context) {
        return new C0887Xc(context, A08(), A00(context, A08()));
    }

    public static C0402Dv A06(Context context) {
        return new C0402Dv(context, A08(), A08().A6p(A07(context)));
    }

    public static C0886Xb A07(Context context) {
        return new C0886Xb(context, A08());
    }

    public static synchronized C7P A08() {
        XA A02;
        synchronized (C5M.class) {
            A02 = XA.A02();
        }
        return A02;
    }
}
