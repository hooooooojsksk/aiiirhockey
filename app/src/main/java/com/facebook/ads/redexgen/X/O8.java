package com.facebook.ads.redexgen.X;

import android.graphics.drawable.ColorDrawable;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* loaded from: assets/audience_network.dex */
public final class O8 {
    public static AbstractC02928x A00(C0642Nm c0642Nm, int i, String str, C0736Rd c0736Rd) {
        if (i == 1) {
            return new AbstractC02928x(c0642Nm, str, c0736Rd) { // from class: com.facebook.ads.redexgen.X.1i
                public static final int A00 = (int) (Kk.A02 * 20.0f);
                public static final int A01 = (int) (Kk.A02 * 16.0f);

                @Override // com.facebook.ads.redexgen.X.AbstractC0638Ni
                public final boolean A01() {
                    return false;
                }

                @Override // com.facebook.ads.redexgen.X.AbstractC02928x
                public final void A0l(C0887Xc c0887Xc) {
                    C0630Na titleDescContainer = getTitleDescContainer();
                    titleDescContainer.setAlignment(3);
                    titleDescContainer.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
                    titleDescContainer.setPadding(0, 0, 0, A00);
                    getCtaButton().setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
                    LinearLayout linearLayout = new LinearLayout(c0887Xc);
                    LL.A0S(linearLayout, new ColorDrawable(-1));
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams.addRule(3, getMediaContainer().getId());
                    linearLayout.setLayoutParams(layoutParams);
                    linearLayout.setOrientation(1);
                    int i2 = A01;
                    linearLayout.setPadding(i2, i2, i2, i2);
                    linearLayout.addView(titleDescContainer);
                    linearLayout.addView(getCtaButton());
                    addView(getMediaContainer());
                    addView(linearLayout);
                }
            };
        }
        return new AbstractC02928x(c0642Nm, str, c0736Rd) { // from class: com.facebook.ads.redexgen.X.26
            public static final int A00 = (int) (Kk.A02 * 12.0f);

            @Override // com.facebook.ads.redexgen.X.AbstractC0638Ni
            public final boolean A00() {
                return false;
            }

            @Override // com.facebook.ads.redexgen.X.AbstractC02928x, com.facebook.ads.redexgen.X.AbstractC0638Ni
            public final boolean A0D() {
                return false;
            }

            @Override // com.facebook.ads.redexgen.X.AbstractC02928x
            public final void A0l(C0887Xc c0887Xc) {
                C0630Na titleDescContainer = getTitleDescContainer();
                titleDescContainer.setAlignment(3);
                RelativeLayout.LayoutParams adTitleAndDescriptionLayoutParams = new RelativeLayout.LayoutParams(-1, -2);
                adTitleAndDescriptionLayoutParams.addRule(8, getMediaContainer().getId());
                titleDescContainer.setLayoutParams(adTitleAndDescriptionLayoutParams);
                int i2 = A00;
                titleDescContainer.setPadding(i2, i2, i2, i2);
                LL.A0R(titleDescContainer, getAdContextWrapper());
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams.addRule(3, getMediaContainer().getId());
                getCtaButton().setLayoutParams(layoutParams);
                addView(getMediaContainer());
                addView(titleDescContainer);
                addView(getCtaButton());
            }
        };
    }
}
