package com.facebook.ads.redexgen.X;

import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class NK extends View {
    public static byte[] A09;
    public static String[] A0A = {"Nbc6Jmo5XxwoSf0WsC4pNUwvbxxmeuzU", "Es2t6BS2", "WUgCzt6qD3CB9cjx4HsVq0Jqaz41VBuo", "hkZRo5NTzxOFCAK6tj2hPIlun6a", "TTjuir0T4YhatH37Odlm7BF", "mNho4RFDELoa", "9llBB27OMv3OwRnb05oM", "XnRgJ28VorNH"};
    public static final int A0B;
    public float A00;
    @Nullable
    public ObjectAnimator A01;
    @Nullable
    public Bitmap A02;
    public final float A03;
    public final Paint A04;
    public final Paint A05;
    public final Paint A06;
    public final RectF A07;
    public final RectF A08;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 80);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A09 = new byte[]{0, 2, 31, 23, 2, 21, 3, 3};
    }

    static {
        A01();
        A0B = (int) (Kk.A02 * 5.0f);
    }

    public NK(C0887Xc c0887Xc) {
        super(c0887Xc);
        this.A03 = Resources.getSystem().getDisplayMetrics().density * 3.0f;
        this.A00 = 0.0f;
        this.A01 = null;
        this.A07 = new RectF();
        this.A08 = new RectF();
        this.A04 = new Paint(1);
        this.A04.setStyle(Paint.Style.STROKE);
        this.A04.setStrokeWidth(this.A03);
        this.A05 = new Paint(1);
        this.A05.setStyle(Paint.Style.STROKE);
        this.A05.setStrokeWidth(this.A03);
        this.A06 = new Paint(1);
    }

    public final void A02(int i, int i2, int i3) {
        this.A04.setColor(i);
        this.A05.setColor(i2);
        this.A06.setColorFilter(new PorterDuffColorFilter(C01272a.A01(i2, i3), PorterDuff.Mode.SRC_ATOP));
    }

    @Override // android.view.View
    public final void clearAnimation() {
        ObjectAnimator objectAnimator = this.A01;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            if (A0A[4].length() == 15) {
                throw new RuntimeException();
            }
            A0A[0] = "vMfsJaJNlQJ6eTU2cMKDLU2YSzRmfzEH";
            this.A01 = null;
        }
    }

    @Keep
    public float getProgress() {
        return this.A00;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawArc(this.A07, 0.0f, 360.0f, false, this.A04);
        canvas.drawArc(this.A07, -90.0f, ((100.0f - this.A00) * 360.0f) / 100.0f, false, this.A05);
        Bitmap bitmap = this.A02;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, new Rect(0, 0, bitmap.getWidth(), this.A02.getHeight()), this.A08, this.A06);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int min = Math.min(getDefaultSize(getSuggestedMinimumHeight(), i2), getDefaultSize(getSuggestedMinimumWidth(), i));
        setMeasuredDimension(min, min);
        RectF rectF = this.A07;
        int min2 = getPaddingLeft();
        float f = (this.A03 / 2.0f) + 0.0f + min2;
        int min3 = getPaddingTop();
        float f2 = (this.A03 / 2.0f) + 0.0f + min3;
        float f3 = min - (this.A03 / 2.0f);
        int min4 = getPaddingRight();
        float f4 = f3 - min4;
        float f5 = min - (this.A03 / 2.0f);
        int min5 = getPaddingBottom();
        rectF.set(f, f2, f4, f5 - min5);
        RectF rectF2 = this.A08;
        float f6 = this.A07.left;
        int min6 = A0B;
        float f7 = f6 + min6;
        float f8 = this.A07.top;
        int min7 = A0B;
        float f9 = f8 + min7;
        float f10 = this.A07.right;
        int min8 = A0B;
        float f11 = f10 - min8;
        float f12 = this.A07.bottom;
        int min9 = A0B;
        rectF2.set(f7, f9, f11, f12 - min9);
    }

    public void setImage(@Nullable LT lt) {
        this.A02 = lt == null ? null : LU.A01(lt);
        invalidate();
    }

    @Keep
    public void setProgress(float f) {
        this.A00 = Math.min(f, 100.0f);
        postInvalidate();
    }

    public void setProgressWithAnimation(float f) {
        this.A01 = ObjectAnimator.ofFloat(this, A00(0, 8, 32), f);
        this.A01.setDuration(400L);
        this.A01.setInterpolator(new LinearInterpolator());
        this.A01.start();
    }
}
