package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.Zj */
/* loaded from: assets/audience_network.dex */
public class C0943Zj implements C6E {
    public static String[] A03 = {"SGxBKOT0PnlxeQ2jGccieZy3bFeI", "1PQaT", "uVEahNbfwTxCxKVGO7p", "rVPhbhRBlKfAg8fviAhE", "2ov", "KrP87Bn8e271VzBAE5Wi", "4No2VIB7eIWgh7ub8hExBeYUcY", "mEjh"};
    public final /* synthetic */ C01041d A00;
    public final /* synthetic */ C0887Xc A01;
    public final /* synthetic */ boolean A02;

    public C0943Zj(C01041d c01041d, C0887Xc c0887Xc, boolean z) {
        this.A00 = c01041d;
        this.A01 = c0887Xc;
        this.A02 = z;
    }

    private void A00(boolean z) {
        InterfaceC01031c interfaceC01031c;
        InterfaceC01031c interfaceC01031c2;
        F1 f1;
        if (!z) {
            interfaceC01031c = this.A00.A04;
            String[] strArr = A03;
            if (strArr[7].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[5] = "3TR1ccuSepVqqTAhPt5x";
            strArr2[3] = "2nf30Z9fIqCCPDXuu277";
            interfaceC01031c.AA6(AdError.CACHE_ERROR);
            return;
        }
        if (IK.A1I(this.A01)) {
            boolean z2 = this.A02;
            String[] strArr3 = A03;
            if (strArr3[7].length() == strArr3[0].length()) {
                throw new RuntimeException();
            }
            A03[4] = "td5rO8fwqS2g7pt7eIgv7CCFkrrD";
            if (z2) {
                C01041d c01041d = this.A00;
                C0887Xc c0887Xc = this.A01;
                f1 = c01041d.A03;
                c01041d.A02 = ON.A01(c0887Xc, f1, 1, new C0944Zk(this));
                return;
            }
        }
        interfaceC01031c2 = this.A00.A04;
        interfaceC01031c2.AA7();
    }

    @Override // com.facebook.ads.redexgen.X.C6E
    public final void AAT() {
        A00(false);
    }

    @Override // com.facebook.ads.redexgen.X.C6E
    public final void AAb() {
        A00(true);
    }
}
