package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class SL extends K1 {
    public static String[] A02 = {"UPn8XPbwEALUh69UMVXoUiPqGt8R4kTd", "xdZVJjkszNZsmCCeX5Z25YrBhtN0pwn3", "FeQmPyEiHax0mF5hQMzTPI1Ffvx0tG7b", "fvmioVuVICVgRcdenOF4sg60aa8ahOYc", "VSPkGqnnwW3mFwqMeREhEXKooJI9EmdX", "BoeGFpZQYNsfmUsiS6UyLTqqNWCMa5Si", "RMRc2", "QDt69ZTuQHjtvDaFmv1xWY1HLwI8P5x9"};
    public final /* synthetic */ SG A00;
    public final /* synthetic */ boolean A01;

    public SL(SG sg, boolean z) {
        this.A00 = sg;
        this.A01 = z;
    }

    @Override // com.facebook.ads.redexgen.X.K1
    public final void A06() {
        C0642Nm c0642Nm;
        c0642Nm = this.A00.A0E;
        AbstractC0586Li A08 = c0642Nm.A08();
        if (A08 == null) {
            return;
        }
        A08.setPageDetailsVisible((this.A01 || A08.A05()) ? false : true);
        if (A02[6].length() == 26) {
            throw new RuntimeException();
        }
        A02[6] = "0vUmK8ViOKnLOUfa8Uz3HinzNmc8";
        A08.setToolbarActionMode(this.A00.getCloseButtonStyle());
    }
}
