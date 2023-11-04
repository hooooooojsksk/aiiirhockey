package com.facebook.ads.redexgen.X;

import android.util.AttributeSet;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;

/* loaded from: assets/audience_network.dex */
public abstract class PR extends RelativeLayout implements PL {
    @Nullable
    public RA A00;

    public PR(C0887Xc c0887Xc) {
        super(c0887Xc);
    }

    public PR(C0887Xc c0887Xc, AttributeSet attributeSet, int i) {
        super(c0887Xc, attributeSet, i);
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(-1, -1);
        setLayoutParams(params);
    }

    public void A07() {
    }

    public void A08() {
    }

    @Override // com.facebook.ads.redexgen.X.PL
    public final void A93(RA ra) {
        this.A00 = ra;
        A07();
    }

    @Override // com.facebook.ads.redexgen.X.PL
    public final void AFf(RA ra) {
        A08();
        this.A00 = null;
    }

    @Nullable
    public RA getVideoView() {
        return this.A00;
    }
}
