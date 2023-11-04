package com.facebook.ads.redexgen.X;

import android.graphics.Rect;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.4W */
/* loaded from: assets/audience_network.dex */
public abstract class C4W {
    @Deprecated
    private final void A00(Rect rect, int i, E9 e9) {
        rect.set(0, 0, 0, 0);
    }

    public final void A01(Rect rect, View view, E9 e9, C01904o c01904o) {
        A00(rect, ((C01774a) view.getLayoutParams()).A00(), e9);
    }
}
