package com.facebook.ads.redexgen.X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.Xy */
/* loaded from: assets/audience_network.dex */
public class C0909Xy implements C5Y {
    public final /* synthetic */ ImageView A00;
    public final /* synthetic */ C02025a A01;
    public final /* synthetic */ C0799Tp A02;

    public C0909Xy(C02025a c02025a, ImageView imageView, C0799Tp c0799Tp) {
        this.A01 = c02025a;
        this.A00 = imageView;
        this.A02 = c0799Tp;
    }

    @Override // com.facebook.ads.redexgen.X.C5Y
    public final void ABB(@Nullable Drawable drawable) {
        C0799Tp.A0e(drawable, this.A00);
        this.A02.A1J(drawable);
    }
}
