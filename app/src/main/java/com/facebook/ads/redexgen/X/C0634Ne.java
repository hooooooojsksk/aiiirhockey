package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.facebook.ads.redexgen.X.Ne */
/* loaded from: assets/audience_network.dex */
public final class C0634Ne {
    public static final int A00 = LL.A00();

    public static void A00(C0887Xc c0887Xc, ViewGroup viewGroup, String str) {
        new AsyncTaskC0764Sf(viewGroup, c0887Xc).A07(str);
        View view = new View(c0887Xc);
        view.setId(A00);
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        LL.A0R(view, c0887Xc);
        viewGroup.addView(view, 0);
    }
}
