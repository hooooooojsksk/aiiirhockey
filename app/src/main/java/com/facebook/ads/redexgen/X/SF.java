package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public abstract class SF extends AbstractC0638Ni {
    public static byte[] A00;
    public static String[] A01 = {"tJRtfPKHoy7gQ0Hrrag4OkVDHQvHpM6e", "ntrk62ddU7J9c8B2GtO4dhepCrAVPpDV", "iQ54QNqjdD5kyZO2OLG", "4R7BJQoUCBFINf313UyvxR7fWPUp11Dk", "Ad2P", "mQFjJcGEaXO3GAoxmnr0yBCCZwtlhd6p", "65xONPI2i6gPpcf6kW2ve41HMoO1k057", "z69fhWo2iasYfVs3h6jnYZwontL4UpVs"};

    public static String A0C(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 94);
        }
        return new String(copyOfRange);
    }

    public static void A0D() {
        A00 = new byte[]{43, 46, 46, 47, 62, 43, 51, 54, 61};
    }

    public abstract void A0g();

    public abstract void A0h();

    public abstract void A0i();

    public abstract boolean A0j();

    public abstract boolean A0k();

    static {
        A0D();
    }

    public SF(C0642Nm c0642Nm, boolean z) {
        super(c0642Nm, z);
        if (IK.A0y(c0642Nm.A05())) {
            if (c0642Nm.A08() != null) {
                c0642Nm.A08().setCTAClickListener(getCtaButton());
            }
            getTitleDescContainer().setCTAClickListener(getCtaButton());
        }
    }

    public final void A0f() {
        if (IK.A0y(this.A06.A05()) && this.A06.A08() != null) {
            this.A06.A08().setCTAClickListener(getCtaButton());
        }
    }

    public void setAdDetailsClickListener(@Nullable ND nd) {
        if (IK.A0y(this.A06.A05()) && nd != null) {
            View$OnClickListenerC0759Sa ctaButton = getCtaButton();
            if (A01[1].charAt(21) != 'h') {
                throw new RuntimeException();
            }
            A01[3] = "am5A0dIgunRuJRLaM18rzwVTPisxqXDR";
            nd.setOnClickListener(C0636Ng.A03(ctaButton, A0C(0, 9, 108)));
        }
    }

    public void setupNativeCtaExtension(C0668On c0668On) {
    }
}
