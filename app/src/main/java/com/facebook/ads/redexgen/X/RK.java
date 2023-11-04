package com.facebook.ads.redexgen.X;

import android.widget.ImageView;
import android.widget.RelativeLayout;

/* loaded from: assets/audience_network.dex */
public final class RK extends NV {
    public final ImageView A00;
    public final C0887Xc A01;

    public RK(C0887Xc c0887Xc) {
        super(c0887Xc);
        this.A01 = c0887Xc;
        this.A00 = new ImageView(c0887Xc);
        this.A00.setAdjustViewBounds(true);
        addView(this.A00, new RelativeLayout.LayoutParams(-2, -1));
    }

    public final void A00(String str) {
        AsyncTaskC0764Sf downloadImageTask = new AsyncTaskC0764Sf(this.A00, this.A01);
        downloadImageTask.A04();
        downloadImageTask.A07(str);
    }
}
