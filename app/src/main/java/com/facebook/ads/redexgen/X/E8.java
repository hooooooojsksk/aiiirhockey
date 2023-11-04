package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public class E8 extends C0914Yd {
    public final /* synthetic */ YO A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E8(YO yo, Context context) {
        super(context);
        this.A00 = yo;
    }

    @Override // com.facebook.ads.redexgen.X.C0914Yd, com.facebook.ads.redexgen.X.AbstractC01884m
    public final void A0I(View view, C01904o c01904o, C01864k c01864k) {
        YO yo = this.A00;
        int[] A0H = yo.A0H(yo.A00.getLayoutManager(), view);
        int time = A0H[0];
        int dy = A0H[1];
        int dx = A0M(Math.max(Math.abs(time), Math.abs(dy)));
        if (dx > 0) {
            c01864k.A04(time, dy, dx, ((C0914Yd) this).A04);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0914Yd
    public final float A0J(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }
}
