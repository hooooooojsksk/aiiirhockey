package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public final class UO implements HT {
    public long A00;
    public long A01;
    public C02959a A02 = C02959a.A04;
    public boolean A03;
    public final HG A04;

    public UO(HG hg) {
        this.A04 = hg;
    }

    public final void A00() {
        if (!this.A03) {
            this.A00 = this.A04.A5B();
            this.A03 = true;
        }
    }

    public final void A01() {
        if (this.A03) {
            A02(A7R());
            this.A03 = false;
        }
    }

    public final void A02(long j) {
        this.A01 = j;
        if (this.A03) {
            this.A00 = this.A04.A5B();
        }
    }

    @Override // com.facebook.ads.redexgen.X.HT
    public final C02959a A7O() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.HT
    public final long A7R() {
        long elapsedSinceBaseMs = this.A01;
        if (this.A03) {
            long A5B = this.A04.A5B();
            long positionUs = this.A00;
            long j = A5B - positionUs;
            if (this.A02.A01 == 1.0f) {
                long positionUs2 = AnonymousClass99.A00(j);
                return elapsedSinceBaseMs + positionUs2;
            }
            long positionUs3 = this.A02.A00(j);
            return elapsedSinceBaseMs + positionUs3;
        }
        return elapsedSinceBaseMs;
    }

    @Override // com.facebook.ads.redexgen.X.HT
    public final C02959a AF4(C02959a c02959a) {
        if (this.A03) {
            A02(A7R());
        }
        this.A02 = c02959a;
        return c02959a;
    }
}
