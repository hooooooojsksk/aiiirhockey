package com.facebook.ads.redexgen.X;

import java.util.Set;

/* loaded from: assets/audience_network.dex */
public class QK {
    public QO A00;
    public Set<String> A01;
    public Set<String> A02;
    public boolean A03;
    public boolean A04 = true;

    public final QK A00(QO qo) {
        this.A00 = qo;
        return this;
    }

    public final QK A01(Set<String> pinnedCertificates) {
        this.A01 = pinnedCertificates;
        return this;
    }

    public final QK A02(Set<String> pinnedPublicKeys) {
        this.A02 = pinnedPublicKeys;
        return this;
    }

    public final QK A03(boolean z) {
        this.A04 = z;
        return this;
    }

    public final QK A04(boolean z) {
        this.A03 = z;
        return this;
    }

    public final QL A05() {
        return new QL(this.A00, this.A04, this.A02, this.A01, this.A03);
    }
}
