package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class NP implements View.OnClickListener {
    public final /* synthetic */ NS A00;

    public NP(NS ns) {
        this.A00 = ns;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        NR nr;
        AbstractC0586Li abstractC0586Li;
        View[] viewArr;
        RA ra;
        RA ra2;
        RA ra3;
        AbstractC0586Li abstractC0586Li2;
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            nr = this.A00.A04;
            nr.ABc();
            abstractC0586Li = this.A00.A00;
            if (abstractC0586Li != null) {
                abstractC0586Li2 = this.A00.A00;
                LL.A0L(abstractC0586Li2);
            }
            viewArr = this.A00.A06;
            for (View view2 : viewArr) {
                LL.A0N(view2, 0);
            }
            LL.A0J(this.A00);
            ra = this.A00.A05;
            if (ra == null) {
                return;
            }
            ra2 = this.A00.A05;
            LL.A0N(ra2, 0);
            ra3 = this.A00.A05;
            ra3.A0b(PK.A02, 14);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }
}
