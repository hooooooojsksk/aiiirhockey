package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Yj */
/* loaded from: assets/audience_network.dex */
public class C0920Yj implements InterfaceC01613k {
    public final /* synthetic */ ED A00;
    public final /* synthetic */ C01573f A01;

    public C0920Yj(ED ed, C01573f c01573f) {
        this.A00 = ed;
        this.A01 = c01573f;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01613k
    public final Object A4G(int i) {
        C01553d compatInfo = this.A01.A00(i);
        if (compatInfo == null) {
            return null;
        }
        return compatInfo.A0M();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01613k
    public final List<Object> A5Q(String str, int i) {
        List<C01553d> A03 = this.A01.A03(str, i);
        if (A03 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int infoCount = A03.size();
        for (int i2 = 0; i2 < infoCount; i2++) {
            arrayList.add(A03.get(i2).A0M());
        }
        return arrayList;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01613k
    public final Object A5R(int i) {
        C01553d compatInfo = this.A01.A01(i);
        if (compatInfo == null) {
            return null;
        }
        return compatInfo.A0M();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01613k
    public final boolean ADR(int i, int i2, Bundle bundle) {
        return this.A01.A04(i, i2, bundle);
    }
}
