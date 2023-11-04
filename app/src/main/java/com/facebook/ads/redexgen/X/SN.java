package com.facebook.ads.redexgen.X;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;

/* loaded from: assets/audience_network.dex */
public final class SN extends AbstractC0638Ni {
    public static final int A01 = Resources.getSystem().getDisplayMetrics().widthPixels;
    public final C0654Ny A00;

    public SN(C0642Nm c0642Nm, boolean z) {
        super(c0642Nm, z);
        this.A00 = new C0654Ny(c0642Nm.A05(), c0642Nm.A02());
        this.A00.A01(getTitleDescContainer(), z);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        layoutParams.setMargins(AbstractC0638Ni.A07, AbstractC0638Ni.A07, AbstractC0638Ni.A07, AbstractC0638Ni.A07);
        getCtaButton().setLayoutParams(layoutParams);
        FrameLayout frameLayout = new FrameLayout(c0642Nm.A05());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(2, getCtaButton().getId());
        frameLayout.setLayoutParams(layoutParams2);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams3.gravity = 17;
        layoutParams3.setMargins(AbstractC0638Ni.A07, 0, AbstractC0638Ni.A07, 0);
        frameLayout.addView(this.A00, layoutParams3);
        addView(frameLayout);
        addView(getCtaButton());
        getCtaButton().A0A(c0642Nm.A04(), c0642Nm.A08());
        View A02 = c0642Nm.A02();
        if (A02 != null && IK.A13(getAdContextWrapper())) {
            A02.setOnClickListener(new View$OnClickListenerC0646Nq(this));
        }
        if (IK.A0y(c0642Nm.A05())) {
            getTitleDescContainer().setCTAClickListener(getCtaButton());
            if (c0642Nm.A08() != null) {
                c0642Nm.A08().setCTAClickListener(getCtaButton());
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0638Ni
    public final boolean A02() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0638Ni
    public final boolean A0D() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0638Ni
    public final void A0c(C1C c1c, String str, double d, @Nullable Bundle bundle) {
        super.A0c(c1c, str, d, bundle);
        if (d > 0.0d) {
            int mediaHeight = (int) ((A01 - (AbstractC0638Ni.A07 * 2)) / d);
            this.A00.A00(mediaHeight);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0638Ni
    public final boolean A0d() {
        return false;
    }
}
