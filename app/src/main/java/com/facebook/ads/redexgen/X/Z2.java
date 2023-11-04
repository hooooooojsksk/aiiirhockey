package com.facebook.ads.redexgen.X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* loaded from: assets/audience_network.dex */
public class Z2 implements C2T {
    public final /* synthetic */ EJ A00;

    public Z2(EJ ej) {
        this.A00 = ej;
    }

    @Override // com.facebook.ads.redexgen.X.C2T
    public final void A4w(Canvas canvas, RectF rectF, float f, Paint paint) {
        canvas.drawRoundRect(rectF, f, f, paint);
    }
}
