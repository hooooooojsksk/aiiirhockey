package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Fx */
/* loaded from: assets/audience_network.dex */
public class C0454Fx implements InterfaceC1025bD {
    public final List<InterfaceC1026bE> A00 = new ArrayList();

    @Override // com.facebook.ads.redexgen.X.InterfaceC1025bD
    public final InterfaceC1026bE A5a(int i) {
        return this.A00.get(i);
    }

    @Override // java.lang.Iterable
    public final Iterator<InterfaceC1026bE> iterator() {
        return this.A00.iterator();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1025bD
    public final int size() {
        return this.A00.size();
    }
}
