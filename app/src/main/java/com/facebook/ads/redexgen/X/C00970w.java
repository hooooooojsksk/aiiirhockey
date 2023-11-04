package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.0w */
/* loaded from: assets/audience_network.dex */
public final class C00970w extends C2M implements InterfaceC0527Iw {
    public C03019g A00;
    @Nullable
    public List<C0668On> A01;

    public C00970w(C0887Xc c0887Xc) {
        super(c0887Xc);
        this.A00 = new C03019g(this, 1, null, null, null);
    }

    public final void A23(QA qa) {
        C03019g c03019g = this.A00;
        if (c03019g != null) {
            c03019g.A0d(qa);
        }
    }

    public C03019g getCarouselCardBehaviorHelper() {
        return this.A00;
    }

    public void setCardsInfo(ArrayList arrayList) {
        this.A01 = arrayList;
        this.A00.A0e(this.A01);
    }
}
