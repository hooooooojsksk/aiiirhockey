package com.facebook.ads.redexgen.X;

import android.graphics.Rect;

/* loaded from: assets/audience_network.dex */
public final class UH implements IP {
    public static String[] A02 = {"AMQNzlG2eGPOJo74lPpddO6twtMEce", "8uZuLGh3CZSzV4eSaK74M9a8aAW81o1g", "CYs8BZmCr6kO5jRRUq4laItl384RlovT", "PO4hUmmCpilEicL1R3sLdD9hI0Kiey5Z", "WmgRsP13YsLJamj9MMjVCco3tjnpIVCq", "0ErvOAeoLZJf3MJzf6jF5Cw5BrHPqp", "S0kgbIpbc64QMPj8XCJtTK8zDrzNpUnW", "MO6xPizLQkqntlkNHRrNVg7dZ2stU5UP"};
    public final Rect A00 = new Rect();
    public final Rect A01 = new Rect();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private boolean A01(C1021b9<IQ, IV> c1021b9, InterfaceC1010ay interfaceC1010ay) {
        float f = -1.0f;
        try {
            f = interfaceC1010ay.A84(c1021b9);
        } catch (IllegalStateException unused) {
        }
        if (f <= 0.0f || !A00(c1021b9)) {
            if (c1021b9.A02.A00().getGlobalVisibleRect(this.A01) && this.A01.bottom - this.A01.top > 0 && A00(c1021b9)) {
                return true;
            }
            interfaceC1010ay.A83(this.A00);
            interfaceC1010ay.A6q(c1021b9, this.A01);
            return (this.A00.bottom - this.A00.top > 0 && this.A01.bottom - this.A00.top > 0) && A00(c1021b9);
        }
        return true;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.b9 != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    public static boolean A00(C1021b9<IQ, IV> c1021b9) {
        if (c1021b9.A02.A05()) {
            return c1021b9.A03.A07();
        }
        if (!c1021b9.A02.A06()) {
            return true;
        }
        IV iv = c1021b9.A03;
        String[] strArr = A02;
        if (strArr[3].charAt(7) != strArr[2].charAt(7)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[3] = "8O0EOVeCMdEJdeSbYPFIeNjJXhTUSITs";
        strArr2[2] = "Km62DwbCV8Ma1ecjtuIU72b1y8KakI9d";
        return iv.A06();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.b9 != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    public final void A02(C1021b9<IQ, IV> c1021b9, InterfaceC1010ay interfaceC1010ay) {
        if (c1021b9.A03.A04() && A01(c1021b9, interfaceC1010ay)) {
            c1021b9.A03.A01();
            c1021b9.A02.A02().A9T(c1021b9.A02.A03(), c1021b9.A02.A04());
        }
        if (c1021b9.A03.A05() && IK.A1E(c1021b9.A02.A01())) {
            c1021b9.A03.A02();
            c1021b9.A02.A02().A9J(c1021b9.A02.A03(), c1021b9.A02.A04());
        }
    }
}
