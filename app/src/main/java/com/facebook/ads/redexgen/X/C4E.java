package com.facebook.ads.redexgen.X;

import android.view.View;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.4E */
/* loaded from: assets/audience_network.dex */
public class C4E {
    public int A00;
    public int A01;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public boolean A09;
    public boolean A0B = true;
    public int A02 = 0;
    public boolean A0A = false;
    public List<AbstractC01934r> A08 = null;

    private View A00() {
        int size = this.A08.size();
        for (int i = 0; i < size; i++) {
            View view = this.A08.get(i).A0H;
            C01774a c01774a = (C01774a) view.getLayoutParams();
            if (!c01774a.A02()) {
                int i2 = this.A01;
                int size2 = c01774a.A00();
                if (i2 == size2) {
                    A02(view);
                    return view;
                }
            }
        }
        return null;
    }

    private final View A01(View view) {
        int size = this.A08.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = this.A08.get(i2).A0H;
            C01774a c01774a = (C01774a) view3.getLayoutParams();
            if (view3 != view && !c01774a.A02()) {
                int A00 = c01774a.A00();
                int size2 = this.A01;
                int i3 = A00 - size2;
                int size3 = this.A03;
                int i4 = i3 * size3;
                if (i4 >= 0 && i4 < i) {
                    view2 = view3;
                    i = i4;
                    if (i4 == 0) {
                        break;
                    }
                }
            }
        }
        return view2;
    }

    private final void A02(View view) {
        View closest = A01(view);
        if (closest == null) {
            this.A01 = -1;
        } else {
            this.A01 = ((C01774a) closest.getLayoutParams()).A00();
        }
    }

    public final View A03(C01834h c01834h) {
        if (this.A08 != null) {
            return A00();
        }
        View A0G = c01834h.A0G(this.A01);
        this.A01 += this.A03;
        return A0G;
    }

    public final void A04() {
        A02(null);
    }

    public final boolean A05(C01904o c01904o) {
        int i = this.A01;
        return i >= 0 && i < c01904o.A03();
    }
}
