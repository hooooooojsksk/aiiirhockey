package com.facebook.ads.redexgen.X;

import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import java.util.HashMap;

/* loaded from: assets/audience_network.dex */
public final class NJ {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ads.redexgen.X.2L] */
    public static C2L A00(C0642Nm c0642Nm, C0799Tp c0799Tp, String str, C03019g c03019g) {
        return new C9D(c0642Nm, c0799Tp, true, str, c03019g) { // from class: com.facebook.ads.redexgen.X.2L
            @Nullable
            public View$OnClickListenerC0759Sa A00;
            @Nullable
            public C0668On A01;
            public final InterfaceC0505Ia A02 = this.A0I.A05().A01().A09();
            public final C0799Tp A03;
            public final C03019g A04;
            public final String A05;
            public static final int A07 = (int) (Kk.A02 * (-4.0f));
            public static final int A06 = (int) (Kk.A02 * 6.0f);

            {
                this.A03 = c0799Tp;
                this.A05 = str;
                this.A04 = c03019g;
                this.A03.A1K(this);
            }

            @Override // com.facebook.ads.redexgen.X.SF
            public void setupNativeCtaExtension(C0668On c0668On) {
                this.A01 = c0668On;
                int A0L = IK.A0L(this.A0I.A05());
                C1L A01 = this.A03.A0z().A0g().A01();
                this.A00 = new View$OnClickListenerC0759Sa(this.A0I.A05(), this.A03.A0z().A0G(), A01, this.A02, C0628My.getDummyListener(), this.A04.A0c(), this.A03.A19());
                this.A00.setCta(c0668On.A03().A0F(), this.A05, new HashMap());
                this.A03.A1K(this.A00);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                if (A0L == 1) {
                    layoutParams.addRule(12);
                    View$OnClickListenerC0759Sa view$OnClickListenerC0759Sa = this.A00;
                    int i = A06;
                    int extensionVariant = A01.A09(false);
                    LL.A0P(view$OnClickListenerC0759Sa, i, 5, extensionVariant);
                    ((C9D) this).A06.addView(this.A00, layoutParams);
                } else if (A0L != 2) {
                } else {
                    int extensionVariant2 = ((C9D) this).A06.getId();
                    layoutParams.addRule(3, extensionVariant2);
                    int extensionVariant3 = A07;
                    layoutParams.setMargins(0, extensionVariant3, 0, 0);
                    addView(this.A00, 0, layoutParams);
                    ((C9D) this).A06.bringToFront();
                }
            }
        };
    }

    public static C9D A01(C0642Nm c0642Nm, String str, C0736Rd c0736Rd) {
        return new C9D(c0642Nm, true, str, c0736Rd);
    }
}
