package com.facebook.ads.redexgen.X;

import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Bs */
/* loaded from: assets/audience_network.dex */
public final class C0358Bs {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public boolean A04;
    public final byte[] A05 = new byte[10];

    public final void A00() {
        this.A04 = false;
    }

    public final void A01(BW bw, int i, int i2) throws IOException, InterruptedException {
        if (!this.A04) {
            bw.ADP(this.A05, 0, 10);
            bw.AES();
            if (A3.A06(this.A05) == -1) {
                return;
            }
            this.A04 = true;
            this.A02 = 0;
        }
        if (this.A02 == 0) {
            this.A00 = i;
            this.A01 = 0;
        }
        this.A01 += i2;
    }

    public final void A02(C0357Br c0357Br) {
        if (this.A04 && this.A02 > 0) {
            c0357Br.A0W.AEY(this.A03, this.A00, this.A01, 0, c0357Br.A0V);
            this.A02 = 0;
        }
    }

    public final void A03(C0357Br c0357Br, long j) {
        if (!this.A04) {
            return;
        }
        int i = this.A02;
        this.A02 = i + 1;
        if (i == 0) {
            this.A03 = j;
        }
        if (this.A02 < 16) {
            return;
        }
        c0357Br.A0W.AEY(this.A03, this.A00, this.A01, 0, c0357Br.A0V);
        this.A02 = 0;
    }
}
