package com.facebook.ads.redexgen.X;

import android.view.ViewGroup;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class F5 extends AbstractC0953Zt {
    public final C0887Xc A00;
    public final J0 A01;

    public F5(C0887Xc c0887Xc, AnonymousClass19 anonymousClass19, List<C0799Tp> list, @Nullable J0 j0) {
        super(anonymousClass19, list, c0887Xc);
        this.A00 = c0887Xc;
        this.A01 = j0 == null ? new J0() : j0;
    }

    @Override // com.facebook.ads.redexgen.X.C4N
    /* renamed from: A01 */
    public final TF A0C(ViewGroup viewGroup, int i) {
        return new TF(new C0589Ll(this.A00, this.A01));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0953Zt, com.facebook.ads.redexgen.X.C4N
    /* renamed from: A0H */
    public final void A0E(TF tf, int i) {
        super.A0E(tf, i);
        C0589Ll c0589Ll = (C0589Ll) tf.A0l();
        A0F(c0589Ll.getImageCardView(), i);
        if (((AbstractC0953Zt) this).A01.get(i) != null) {
            c0589Ll.setTitle(((AbstractC0953Zt) this).A01.get(i).getAdHeadline());
            c0589Ll.setSubtitle(((AbstractC0953Zt) this).A01.get(i).getAdLinkDescription());
            c0589Ll.setButtonText(((AbstractC0953Zt) this).A01.get(i).getAdCallToAction());
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(c0589Ll);
        ((AbstractC0953Zt) this).A01.get(i).A1O(c0589Ll, c0589Ll, arrayList);
    }
}
