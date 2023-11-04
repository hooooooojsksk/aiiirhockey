package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Wp */
/* loaded from: assets/audience_network.dex */
public class C0874Wp implements InterfaceC0320Aa {
    public final C0868Wj A00 = new C0868Wj();
    public final C0867Wi A01 = new C0867Wi();
    public final AE[] A02;

    public C0874Wp(AE... aeArr) {
        this.A02 = (AE[]) Arrays.copyOf(aeArr, aeArr.length + 2);
        AE[] aeArr2 = this.A02;
        aeArr2[aeArr.length] = this.A00;
        aeArr2[aeArr.length + 1] = this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0320Aa
    public final C02959a A3R(C02959a c02959a) {
        this.A00.A0B(c02959a.A02);
        return new C02959a(this.A01.A01(c02959a.A01), this.A01.A00(c02959a.A00), c02959a.A02);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0320Aa
    public final AE[] A5n() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0320Aa
    public final long A76(long j) {
        return this.A01.A02(j);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0320Aa
    public final long A7h() {
        return this.A00.A0A();
    }
}
