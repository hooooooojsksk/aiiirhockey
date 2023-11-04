package com.facebook.ads.redexgen.X;

import android.view.ViewGroup;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class F4 extends AbstractC0953Zt {
    public final C0887Xc A00;

    public F4(AnonymousClass19 anonymousClass19, List<C0799Tp> list, C0887Xc c0887Xc) {
        super(anonymousClass19, list, c0887Xc);
        this.A00 = c0887Xc;
    }

    @Override // com.facebook.ads.redexgen.X.C4N
    /* renamed from: A01 */
    public final TF A0C(ViewGroup viewGroup, int i) {
        return new TF(new C0594Lq(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0953Zt, com.facebook.ads.redexgen.X.C4N
    /* renamed from: A0H */
    public final void A0E(TF tf, int i) {
        super.A0E(tf, i);
        C0594Lq c0594Lq = (C0594Lq) tf.A0l();
        M2 imageView = (M2) c0594Lq.getImageCardView();
        imageView.setImageDrawable(null);
        A0F(imageView, i);
        C0799Tp childAd = ((AbstractC0953Zt) this).A01.get(i);
        childAd.A11().A0G(this.A00);
        childAd.A1N(c0594Lq, c0594Lq);
    }
}
