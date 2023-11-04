package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class TJ implements InterfaceC0624Mu {
    public final /* synthetic */ InterfaceC0587Lj A00;
    public final /* synthetic */ TH A01;

    public TJ(TH th, InterfaceC0587Lj interfaceC0587Lj) {
        this.A01 = th;
        this.A00 = interfaceC0587Lj;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0624Mu
    public final void ABt(String str) {
        C0617Mn c0617Mn;
        c0617Mn = this.A01.A0A;
        c0617Mn.setProgress(100);
        this.A01.A05 = false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0624Mu
    public final void ABv(String str) {
        C0616Mm c0616Mm;
        this.A01.A05 = true;
        c0616Mm = this.A01.A09;
        c0616Mm.setUrl(str);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0624Mu
    public final void ACD(int i) {
        boolean z;
        C0617Mn c0617Mn;
        z = this.A01.A05;
        if (z) {
            c0617Mn = this.A01.A0A;
            c0617Mn.setProgress(i);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0624Mu
    public final void ACI(String str) {
        C0616Mm c0616Mm;
        c0616Mm = this.A01.A09;
        c0616Mm.setTitle(str);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0624Mu
    public final void ACK() {
        this.A00.AAR(14);
    }
}
