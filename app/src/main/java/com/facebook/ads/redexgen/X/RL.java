package com.facebook.ads.redexgen.X;

import android.view.ViewGroup;
import androidx.annotation.Nullable;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class RL extends C4N<RJ> {
    public final int A00;
    public final C0887Xc A01;
    @Nullable
    public final View$OnClickListenerC0759Sa A02;
    public final List<String> A03;

    public RL(C0887Xc c0887Xc, List<String> screenshotUrls, int i, @Nullable View$OnClickListenerC0759Sa view$OnClickListenerC0759Sa) {
        this.A03 = screenshotUrls;
        this.A00 = i;
        this.A01 = c0887Xc;
        this.A02 = view$OnClickListenerC0759Sa;
    }

    @Override // com.facebook.ads.redexgen.X.C4N
    /* renamed from: A02 */
    public final RJ A0C(ViewGroup viewGroup, int i) {
        RK rk = new RK(this.A01);
        if (IK.A11(this.A01)) {
            rk.setOnClickListener(new P4(this));
        }
        return new RJ(rk);
    }

    @Override // com.facebook.ads.redexgen.X.C4N
    /* renamed from: A03 */
    public final void A0E(RJ rj, int i) {
        String str = this.A03.get(i);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -1);
        int leftMargin = this.A00;
        int i2 = leftMargin * 4;
        if (i == 0) {
            leftMargin = i2;
        }
        marginLayoutParams.setMargins(leftMargin, 0, i >= A0D() + (-1) ? this.A00 * 4 : this.A00, 0);
        rj.A0l().setLayoutParams(marginLayoutParams);
        rj.A0l().A00(str);
    }

    @Override // com.facebook.ads.redexgen.X.C4N
    public final int A0D() {
        return this.A03.size();
    }
}
