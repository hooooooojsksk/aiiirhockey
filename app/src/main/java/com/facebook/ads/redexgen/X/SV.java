package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class SV implements InterfaceC0557Kd {
    public final /* synthetic */ C0633Nd A00;

    public SV(C0633Nd c0633Nd) {
        this.A00 = c0633Nd;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0557Kd
    public final void AAa() {
        InterfaceC0657Ob interfaceC0657Ob;
        int i;
        InterfaceC0657Ob interfaceC0657Ob2;
        interfaceC0657Ob = this.A00.A0M;
        i = this.A00.A0C;
        interfaceC0657Ob.ACv(i);
        interfaceC0657Ob2 = this.A00.A0M;
        interfaceC0657Ob2.AD1();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0557Kd
    public final void ACC(float f) {
        int i;
        RA ra;
        int i2;
        InterfaceC0657Ob interfaceC0657Ob;
        i = this.A00.A0C;
        ra = this.A00.A0P;
        float duration = (i - f) + ra.getDuration();
        i2 = this.A00.A0B;
        float f2 = duration / i2;
        interfaceC0657Ob = this.A00.A0M;
        interfaceC0657Ob.AFk(f2);
    }
}
