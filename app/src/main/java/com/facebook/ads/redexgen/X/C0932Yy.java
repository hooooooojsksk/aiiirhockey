package com.facebook.ads.redexgen.X;

import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Yy */
/* loaded from: assets/audience_network.dex */
public class C0932Yy<K, V> extends AbstractC01362j<K, V> {
    public final /* synthetic */ C0931Yx A00;

    public C0932Yy(C0931Yx c0931Yx) {
        this.A00 = c0931Yx;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01362j
    public final int A04() {
        return ((C01392m) this.A00).A00;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01362j
    public final int A05(Object obj) {
        return this.A00.A08(obj);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01362j
    public final int A06(Object obj) {
        return this.A00.A07(obj);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01362j
    public final Object A07(int i, int i2) {
        return this.A00.A02[(i << 1) + i2];
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01362j
    public final V A08(int i, V value) {
        return this.A00.A0C(i, value);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01362j
    public final Map<K, V> A0A() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01362j
    public final void A0D() {
        this.A00.clear();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01362j
    public final void A0E(int i) {
        this.A00.A0A(i);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01362j
    public final void A0F(K key, V value) {
        this.A00.put(key, value);
    }
}
