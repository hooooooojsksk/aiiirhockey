package com.facebook.ads.redexgen.X;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.facebook.ads.redexgen.X.aw */
/* loaded from: assets/audience_network.dex */
public class C1008aw {
    public final Map<String, C1021b9> A00;
    public final Set<C1021b9> A01;

    public C1008aw() {
        this.A00 = new HashMap();
        this.A01 = new HashSet();
    }

    public Collection<C1021b9> A00() {
        return this.A01;
    }

    public Collection<C1021b9> A01() {
        return this.A00.values();
    }

    public void A04() {
        this.A00.clear();
        for (C1021b9 c1021b9 : this.A01) {
            this.A00.put(c1021b9.A04, c1021b9);
        }
        this.A01.clear();
    }

    public boolean A06(C1021b9 c1021b9) {
        if (this.A01.add(c1021b9)) {
            this.A00.remove(c1021b9.A04);
            return true;
        }
        return false;
    }
}
