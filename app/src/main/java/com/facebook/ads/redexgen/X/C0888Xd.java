package com.facebook.ads.redexgen.X;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.facebook.ads.redexgen.X.Xd */
/* loaded from: assets/audience_network.dex */
public final class C0888Xd implements C6Q {
    public final Map<String, Set<String>> A00 = new HashMap();

    @Override // com.facebook.ads.redexgen.X.C6Q
    public final synchronized void A41(String str) {
        this.A00.remove(str);
    }

    @Override // com.facebook.ads.redexgen.X.C6Q
    public final boolean A8d(String str, String str2) {
        Set<String> loadedAds = this.A00.get(str2);
        return loadedAds != null && loadedAds.contains(str);
    }

    @Override // com.facebook.ads.redexgen.X.C6Q
    public final synchronized void AEm(String str, String str2) {
        Set<String> set = this.A00.get(str2);
        if (set == null) {
            set = new HashSet<>();
            this.A00.put(str2, set);
        }
        set.add(str);
    }
}
