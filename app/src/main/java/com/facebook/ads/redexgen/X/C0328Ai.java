package com.facebook.ads.redexgen.X;

import java.util.Comparator;
import java.util.TreeSet;

/* renamed from: com.facebook.ads.redexgen.X.Ai */
/* loaded from: assets/audience_network.dex */
public final class C0328Ai implements US, Comparator<H1> {
    public long A00;
    public final long A01;
    public final TreeSet<H1> A02 = new TreeSet<>(this);

    public C0328Ai(long j) {
        this.A01 = j;
    }

    @Override // java.util.Comparator
    /* renamed from: A00 */
    public final int compare(H1 h1, H1 h12) {
        if (h1.A00 - h12.A00 == 0) {
            return h1.compareTo(h12);
        }
        return h1.A00 < h12.A00 ? -1 : 1;
    }

    private void A01(InterfaceC0478Gx interfaceC0478Gx, long j) {
        while (this.A00 + j > this.A01 && !this.A02.isEmpty()) {
            try {
                interfaceC0478Gx.AEF(this.A02.first());
            } catch (C0476Gv unused) {
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0477Gw
    public final void ACc(InterfaceC0478Gx interfaceC0478Gx, H1 h1) {
        this.A02.add(h1);
        this.A00 += h1.A01;
        A01(interfaceC0478Gx, 0L);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0477Gw
    public final void ACd(InterfaceC0478Gx interfaceC0478Gx, H1 h1) {
        this.A02.remove(h1);
        this.A00 -= h1.A01;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0477Gw
    public final void ACe(InterfaceC0478Gx interfaceC0478Gx, H1 h1, H1 h12) {
        ACd(interfaceC0478Gx, h1);
        ACc(interfaceC0478Gx, h12);
    }

    @Override // com.facebook.ads.redexgen.X.US
    public final void ACf(InterfaceC0478Gx interfaceC0478Gx, String str, long j, long j2) {
        A01(interfaceC0478Gx, j2);
    }
}
