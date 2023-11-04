package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public final class AA extends RA {
    public AA(C0887Xc c0887Xc) {
        super(c0887Xc);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int newWidthSpec = View.MeasureSpec.getMode(i);
        if (newWidthSpec == 1073741824) {
            i2 = i;
        } else {
            int newWidthSpec2 = View.MeasureSpec.getMode(i2);
            if (newWidthSpec2 == 1073741824) {
                i = i2;
            }
        }
        super.onMeasure(i, i2);
    }
}
