package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Zu */
/* loaded from: assets/audience_network.dex */
public class C0954Zu implements N9 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractC0953Zt A01;
    public final /* synthetic */ C0799Tp A02;

    public C0954Zu(AbstractC0953Zt abstractC0953Zt, int i, C0799Tp c0799Tp) {
        this.A01 = abstractC0953Zt;
        this.A00 = i;
        this.A02 = c0799Tp;
    }

    @Override // com.facebook.ads.redexgen.X.N9
    public final void ABA(boolean z) {
        Q9 q9;
        if (this.A00 == 0) {
            C0799Tp c0799Tp = this.A02;
            q9 = this.A01.A04;
            c0799Tp.A1Z(q9);
        }
        this.A02.A1c(z, true);
    }
}
