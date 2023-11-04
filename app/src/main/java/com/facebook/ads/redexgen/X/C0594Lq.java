package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.ads.internal.api.AdNativeComponentView;

/* renamed from: com.facebook.ads.redexgen.X.Lq */
/* loaded from: assets/audience_network.dex */
public final class C0594Lq extends AdNativeComponentView {
    public static final int A01 = (int) (Kk.A02 * 1.0f);
    public final ImageView A00;

    public C0594Lq(C0887Xc c0887Xc) {
        super(c0887Xc);
        this.A00 = new M2(c0887Xc);
        this.A00.setScaleType(ImageView.ScaleType.CENTER_CROP);
        EnumC0567Kp.A04(this.A00, EnumC0567Kp.A0A);
        addView(this.A00, new ViewGroup.LayoutParams(-1, -1));
        LL.A0M(this.A00, -2130706433);
        int i = A01;
        setPadding(i, i, i, i);
    }

    @Override // com.facebook.ads.internal.api.AdNativeComponentView
    public View getAdContentsView() {
        return this.A00;
    }

    public ImageView getImageCardView() {
        return this.A00;
    }
}
