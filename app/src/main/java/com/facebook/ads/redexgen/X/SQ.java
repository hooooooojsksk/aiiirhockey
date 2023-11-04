package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;

/* loaded from: assets/audience_network.dex */
public final class SQ extends AbstractC0638Ni {
    public SQ(C0642Nm c0642Nm, boolean z) {
        super(c0642Nm, true);
        FrameLayout.LayoutParams mediaViewParams;
        RelativeLayout relativeLayout = new RelativeLayout(c0642Nm.A05());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        LL.A0R(relativeLayout, getAdContextWrapper());
        LinearLayout linearLayout = new LinearLayout(c0642Nm.A05());
        linearLayout.setOrientation(!z ? 1 : 0);
        linearLayout.setGravity(80);
        LL.A0K(linearLayout);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(AbstractC0638Ni.A07, 0, AbstractC0638Ni.A07, AbstractC0638Ni.A07);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(z ? -2 : -1, -2);
        layoutParams3.setMargins(z ? AbstractC0638Ni.A07 : 0, z ? 0 : AbstractC0638Ni.A07, 0, 0);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(z ? 0 : -1, -2);
        layoutParams4.setMargins(0, 0, 0, 0);
        layoutParams4.weight = 1.0f;
        linearLayout.addView(getTitleDescContainer(), layoutParams4);
        linearLayout.addView(getCtaButton(), layoutParams3);
        relativeLayout.addView(linearLayout, layoutParams2);
        getCtaButton().A0A(c0642Nm.A04(), c0642Nm.A08());
        View A02 = c0642Nm.A02();
        if (A02 != null && IK.A13(getAdContextWrapper())) {
            if (z) {
                mediaViewParams = new FrameLayout.LayoutParams(-2, -1);
            } else {
                mediaViewParams = new FrameLayout.LayoutParams(-1, -2);
            }
            mediaViewParams.gravity = 17;
            FrameLayout frameLayout = new FrameLayout(c0642Nm.A05());
            frameLayout.addView(A02, mediaViewParams);
            addView(frameLayout, new RelativeLayout.LayoutParams(-1, -1));
            A02.setOnClickListener(new View$OnClickListenerC0637Nh(this));
        } else if (A02 != null) {
            addView(A02, new RelativeLayout.LayoutParams(-1, -1));
        }
        addView(relativeLayout, layoutParams);
        if (IK.A0y(c0642Nm.A05())) {
            getTitleDescContainer().setCTAClickListener(getCtaButton());
            if (c0642Nm.A08() != null) {
                c0642Nm.A08().setCTAClickListener(getCtaButton());
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0638Ni
    public final void A0c(C1C c1c, String str, double d, @Nullable Bundle bundle) {
        super.A0c(c1c, str, d, bundle);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0638Ni
    public final boolean A0d() {
        return true;
    }
}
