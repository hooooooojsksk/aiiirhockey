package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
/* loaded from: assets/audience_network.dex */
public final class Z1 implements C2R {
    private C2S A00(C2Q c2q) {
        return (C2S) c2q.A62();
    }

    public final void A01(C2Q c2q) {
        if (!c2q.A7y()) {
            c2q.AF8(0, 0, 0, 0);
            return;
        }
        float A73 = A73(c2q);
        float A7T = A7T(c2q);
        float elevation = C2U.A00(A73, A7T, c2q.A7S());
        int vPadding = (int) Math.ceil(elevation);
        float elevation2 = C2U.A01(A73, A7T, c2q.A7S());
        int ceil = (int) Math.ceil(elevation2);
        c2q.AF8(vPadding, ceil, vPadding, ceil);
    }

    @Override // com.facebook.ads.redexgen.X.C2R
    public final ColorStateList A5p(C2Q c2q) {
        return A00(c2q).A05();
    }

    @Override // com.facebook.ads.redexgen.X.C2R
    public final float A6a(C2Q c2q) {
        return c2q.A63().getElevation();
    }

    @Override // com.facebook.ads.redexgen.X.C2R
    public final float A73(C2Q c2q) {
        return A00(c2q).A03();
    }

    @Override // com.facebook.ads.redexgen.X.C2R
    public final float A78(C2Q c2q) {
        return A7T(c2q) * 2.0f;
    }

    @Override // com.facebook.ads.redexgen.X.C2R
    public final float A79(C2Q c2q) {
        return A7T(c2q) * 2.0f;
    }

    @Override // com.facebook.ads.redexgen.X.C2R
    public final float A7T(C2Q c2q) {
        return A00(c2q).A04();
    }

    @Override // com.facebook.ads.redexgen.X.C2R
    public final void A8Y() {
    }

    @Override // com.facebook.ads.redexgen.X.C2R
    public final void A8Z(C2Q c2q, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        C2S background = new C2S(colorStateList, f);
        c2q.AEq(background);
        View view = c2q.A63();
        view.setClipToOutline(true);
        view.setElevation(f2);
        AF0(c2q, f3);
    }

    @Override // com.facebook.ads.redexgen.X.C2R
    public final void AAX(C2Q c2q) {
        AF0(c2q, A73(c2q));
    }

    @Override // com.facebook.ads.redexgen.X.C2R
    public final void ACA(C2Q c2q) {
        AF0(c2q, A73(c2q));
    }

    @Override // com.facebook.ads.redexgen.X.C2R
    public final void AEp(C2Q c2q, @Nullable ColorStateList colorStateList) {
        A00(c2q).A08(colorStateList);
    }

    @Override // com.facebook.ads.redexgen.X.C2R
    public final void AEu(C2Q c2q, float f) {
        c2q.A63().setElevation(f);
    }

    @Override // com.facebook.ads.redexgen.X.C2R
    public final void AF0(C2Q c2q, float f) {
        A00(c2q).A07(f, c2q.A7y(), c2q.A7S());
        A01(c2q);
    }

    @Override // com.facebook.ads.redexgen.X.C2R
    public final void AF6(C2Q c2q, float f) {
        A00(c2q).A06(f);
    }
}
