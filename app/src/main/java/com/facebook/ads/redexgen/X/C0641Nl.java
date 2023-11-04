package com.facebook.ads.redexgen.X;

import android.view.View;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.Nl */
/* loaded from: assets/audience_network.dex */
public class C0641Nl {
    @Nullable
    public View A02;
    @Nullable
    public C0799Tp A03;
    @Nullable
    public AbstractC0586Li A04;
    @Nullable
    public JW A05;
    @Nullable
    public final View A06;
    public final AbstractC0952Zs A07;
    public final C0887Xc A08;
    public final InterfaceC0505Ia A09;
    public final LD A0A;
    public final InterfaceC0587Lj A0B;
    public final QA A0C;
    public int A01 = 0;
    public int A00 = 1;

    public C0641Nl(C0887Xc c0887Xc, InterfaceC0505Ia interfaceC0505Ia, InterfaceC0587Lj interfaceC0587Lj, AbstractC0952Zs abstractC0952Zs, @Nullable View view, QA qa, LD ld) {
        this.A08 = c0887Xc;
        this.A09 = interfaceC0505Ia;
        this.A0B = interfaceC0587Lj;
        this.A07 = abstractC0952Zs;
        this.A06 = view;
        this.A0C = qa;
        this.A0A = ld;
    }

    public final C0641Nl A0D(int i) {
        this.A00 = i;
        return this;
    }

    public final C0641Nl A0E(int i) {
        this.A01 = i;
        return this;
    }

    public final C0641Nl A0F(View view) {
        this.A02 = view;
        return this;
    }

    public final C0641Nl A0G(C0799Tp c0799Tp) {
        this.A03 = c0799Tp;
        return this;
    }

    public final C0641Nl A0H(AbstractC0586Li abstractC0586Li) {
        this.A04 = abstractC0586Li;
        return this;
    }

    public final C0641Nl A0I(JW jw) {
        this.A05 = jw;
        return this;
    }

    public final C0642Nm A0J() {
        return new C0642Nm(this);
    }
}
