package com.facebook.ads.redexgen.X;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.6v */
/* loaded from: assets/audience_network.dex */
public class C02436v extends AbstractC0623Mt {
    public final /* synthetic */ C0551Jx A00;

    public C02436v(C0551Jx c0551Jx) {
        this.A00 = c0551Jx;
    }

    @Override // com.facebook.ads.redexgen.X.C8V
    /* renamed from: A00 */
    public final void A03(NC nc) {
        boolean z;
        boolean z2;
        boolean A0D;
        Handler handler;
        int i;
        boolean z3;
        boolean A0D2;
        z = this.A00.A03;
        if (!z) {
            return;
        }
        z2 = this.A00.A02;
        if (!z2) {
            return;
        }
        this.A00.A03 = false;
        A0D = this.A00.A0D(EnumC0687Pg.A04);
        if (!A0D) {
            z3 = this.A00.A04;
            if (!z3) {
                A0D2 = this.A00.A0D(EnumC0687Pg.A03);
                if (!A0D2) {
                    return;
                }
                this.A00.A03();
                this.A00.A06(true, true);
                return;
            }
        }
        this.A00.A04 = false;
        handler = this.A00.A05;
        KC kc = new KC(this);
        i = this.A00.A00;
        handler.postDelayed(kc, i);
    }
}
