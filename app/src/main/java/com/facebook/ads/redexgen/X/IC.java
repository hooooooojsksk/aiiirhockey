package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class IC implements Runnable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ IF A04;

    public IC(IF r1, int i, int i2, int i3, float f) {
        this.A04 = r1;
        this.A03 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A00 = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IG ig;
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            ig = this.A04.A01;
            ig.AD9(this.A03, this.A01, this.A02, this.A00);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }
}
