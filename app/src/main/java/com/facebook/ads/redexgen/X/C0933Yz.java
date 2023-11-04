package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.Yz */
/* loaded from: assets/audience_network.dex */
public class C0933Yz implements C2R {
    public final RectF A00 = new RectF();

    private C2U A00(Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        return new C2U(context.getResources(), colorStateList, f, f2, f3);
    }

    private C2U A01(C2Q c2q) {
        return (C2U) c2q.A62();
    }

    public final void A02(C2Q c2q) {
        Rect rect = new Rect();
        A01(c2q).A0K(rect);
        c2q.AF1((int) Math.ceil(A79(c2q)), (int) Math.ceil(A78(c2q)));
        c2q.AF8(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // com.facebook.ads.redexgen.X.C2R
    public final ColorStateList A5p(C2Q c2q) {
        return A01(c2q).A0F();
    }

    @Override // com.facebook.ads.redexgen.X.C2R
    public final float A6a(C2Q c2q) {
        return A01(c2q).A0E();
    }

    @Override // com.facebook.ads.redexgen.X.C2R
    public final float A73(C2Q c2q) {
        return A01(c2q).A0B();
    }

    @Override // com.facebook.ads.redexgen.X.C2R
    public final float A78(C2Q c2q) {
        return A01(c2q).A0C();
    }

    @Override // com.facebook.ads.redexgen.X.C2R
    public final float A79(C2Q c2q) {
        return A01(c2q).A0D();
    }

    @Override // com.facebook.ads.redexgen.X.C2R
    public final float A7T(C2Q c2q) {
        return A01(c2q).A0A();
    }

    @Override // com.facebook.ads.redexgen.X.C2R
    public void A8Y() {
        C2U.A0G = new Z0(this);
    }

    @Override // com.facebook.ads.redexgen.X.C2R
    public final void A8Z(C2Q c2q, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        C2U A00 = A00(context, colorStateList, f, f2, f3);
        A00.A0L(c2q.A7S());
        c2q.AEq(A00);
        A02(c2q);
    }

    @Override // com.facebook.ads.redexgen.X.C2R
    public final void AAX(C2Q c2q) {
    }

    @Override // com.facebook.ads.redexgen.X.C2R
    public final void ACA(C2Q c2q) {
        A01(c2q).A0L(c2q.A7S());
        A02(c2q);
    }

    @Override // com.facebook.ads.redexgen.X.C2R
    public final void AEp(C2Q c2q, @Nullable ColorStateList colorStateList) {
        A01(c2q).A0J(colorStateList);
    }

    @Override // com.facebook.ads.redexgen.X.C2R
    public final void AEu(C2Q c2q, float f) {
        A01(c2q).A0I(f);
    }

    @Override // com.facebook.ads.redexgen.X.C2R
    public final void AF0(C2Q c2q, float f) {
        A01(c2q).A0H(f);
        A02(c2q);
    }

    @Override // com.facebook.ads.redexgen.X.C2R
    public final void AF6(C2Q c2q, float f) {
        A01(c2q).A0G(f);
        A02(c2q);
    }
}
