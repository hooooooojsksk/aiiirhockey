package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Collection;

/* loaded from: assets/audience_network.dex */
public class TU implements L1 {
    public final Collection<String> A00;

    public TU() {
        this.A00 = new ArrayList();
    }

    @Override // com.facebook.ads.redexgen.X.L1
    public final void ADc(String str) {
        this.A00.add(str);
    }

    @Override // com.facebook.ads.redexgen.X.L1
    public final void flush() {
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (String str : this.A00) {
            sb.append(str);
            sb.append('\n');
        }
        return sb.toString();
    }
}
