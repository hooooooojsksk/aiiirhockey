package com.facebook.ads.redexgen.X;

import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Ag */
/* loaded from: assets/audience_network.dex */
public class C0326Ag extends C0914Yd {
    public final /* synthetic */ C0323Ad A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.X.C0914Yd
    public final int A0O(View view, int i) {
        int i2;
        C4Z A08 = A08();
        if (A08.A24()) {
            C01774a c01774a = (C01774a) view.getLayoutParams();
            int A0N = A0N(A08.A0k(view) - c01774a.leftMargin, A08.A0n(view) + c01774a.rightMargin, A08.A0e(), A08.A0h() - A08.A0f(), i);
            i2 = this.A00.A02;
            return A0N + i2;
        }
        return 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0326Ag(C0323Ad c0323Ad, C0887Xc c0887Xc) {
        super(c0887Xc);
        this.A00 = c0323Ad;
    }

    @Override // com.facebook.ads.redexgen.X.C0914Yd
    public final float A0J(DisplayMetrics displayMetrics) {
        float f;
        f = this.A00.A00;
        return f / displayMetrics.densityDpi;
    }

    @Override // com.facebook.ads.redexgen.X.C0914Yd
    public final int A0K() {
        return -1;
    }

    @Override // com.facebook.ads.redexgen.X.C0914Yd
    public final PointF A0P(int i) {
        return this.A00.A48(i);
    }
}
