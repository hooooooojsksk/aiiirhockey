package com.facebook.ads.redexgen.X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* loaded from: assets/audience_network.dex */
public class Z0 implements C2T {
    public final /* synthetic */ C0933Yz A00;

    public Z0(C0933Yz c0933Yz) {
        this.A00 = c0933Yz;
    }

    @Override // com.facebook.ads.redexgen.X.C2T
    public final void A4w(Canvas canvas, RectF rectF, float f, Paint paint) {
        float f2 = f * 2.0f;
        float width = (rectF.width() - f2) - 1.0f;
        float height = (rectF.height() - f2) - 1.0f;
        Canvas canvas2 = canvas;
        Paint paint2 = paint;
        if (f >= 1.0f) {
            float f3 = f + 0.5f;
            this.A00.A00.set(-f3, -f3, f3, f3);
            int save = canvas2.save();
            canvas2.translate(rectF.left + f3, rectF.top + f3);
            canvas2.drawArc(this.A00.A00, 180.0f, 90.0f, true, paint2);
            canvas2.translate(width, 0.0f);
            canvas2.rotate(90.0f);
            canvas2.drawArc(this.A00.A00, 180.0f, 90.0f, true, paint2);
            canvas2.translate(height, 0.0f);
            canvas2.rotate(90.0f);
            canvas2.drawArc(this.A00.A00, 180.0f, 90.0f, true, paint2);
            canvas2.translate(width, 0.0f);
            canvas2.rotate(90.0f);
            canvas2 = canvas2;
            canvas2.drawArc(this.A00.A00, 180.0f, 90.0f, true, paint2);
            canvas2.restoreToCount(save);
            float innerWidth = rectF.top;
            float innerHeight = (rectF.right - f3) + 1.0f;
            float roundedCornerRadius = rectF.top + f3;
            canvas2.drawRect((rectF.left + f3) - 1.0f, innerWidth, innerHeight, roundedCornerRadius, paint2);
            float innerWidth2 = rectF.bottom - f3;
            float innerHeight2 = (rectF.right - f3) + 1.0f;
            float roundedCornerRadius2 = rectF.bottom;
            paint2 = paint2;
            canvas2.drawRect((rectF.left + f3) - 1.0f, innerWidth2, innerHeight2, roundedCornerRadius2, paint2);
        }
        float f4 = rectF.left;
        float innerWidth3 = rectF.top + f;
        float innerHeight3 = rectF.right;
        canvas2.drawRect(f4, innerWidth3, innerHeight3, rectF.bottom - f, paint2);
    }
}
