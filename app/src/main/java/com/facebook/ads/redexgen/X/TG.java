package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class TG extends AbstractC01814e {
    public static String[] A01 = {"8Yn2PgyedH1iX", "R67HljoZMbsPm0e6EtybvG", "", "R8Pp2uuVTku92bGxcvFWCvwfHASfPd1y", "2y5E80sPhAjkTDK", "Itturke", "abRBLy2wdT4xlnoMDCf2vtSzdY3x1mV2", "QG421Xj1ReSIzqeVHucrcoJTP843GzsJ"};
    public final /* synthetic */ C2M A00;

    public TG(C2M c2m) {
        this.A00 = c2m;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01814e
    public final void A0L(E9 e9, int i) {
        int scrollPosition;
        super.A0L(e9, i);
        C0915Ye linearLayoutManager = this.A00.getLayoutManager();
        if (linearLayoutManager == null || (scrollPosition = linearLayoutManager.A27()) < 0 || this.A00.getAdapter() == null || scrollPosition >= this.A00.getAdapter().A0D()) {
            return;
        }
        InterfaceC0590Lm interfaceC0590Lm = (InterfaceC0590Lm) e9.A1F(scrollPosition);
        if (A01[1].length() == 0) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[5] = "EBOsosi";
        strArr[2] = "";
        if (interfaceC0590Lm == null) {
            return;
        }
        interfaceC0590Lm.AEn();
    }
}
