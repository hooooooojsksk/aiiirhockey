package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class X8 implements C8K {
    public final /* synthetic */ String[] A00;

    public X8(String[] strArr) {
        this.A00 = strArr;
    }

    @Override // com.facebook.ads.redexgen.X.C8K
    public final boolean A2O(String str) {
        for (String str2 : this.A00) {
            if (str2.equals(str)) {
                return false;
            }
        }
        return true;
    }
}
