package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: com.facebook.ads.redexgen.X.Ft */
/* loaded from: assets/audience_network.dex */
public class C0450Ft implements InterfaceC1016b4 {
    public final /* synthetic */ C1015b3 A00;

    public C0450Ft(C1015b3 c1015b3) {
        this.A00 = c1015b3;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1016b4
    public final void ACU() {
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        ArrayList<Runnable> arrayList;
        LinkedHashMap linkedHashMap3;
        LinkedHashMap linkedHashMap4;
        InterfaceC1016b4 interfaceC1016b4;
        InterfaceC1016b4 interfaceC1016b42;
        linkedHashMap = this.A00.A06;
        synchronized (linkedHashMap) {
            linkedHashMap2 = this.A00.A06;
            arrayList = new ArrayList(linkedHashMap2.size());
            linkedHashMap3 = this.A00.A06;
            for (Runnable runnable : linkedHashMap3.values()) {
                if (runnable != null) {
                    arrayList.add(runnable);
                }
            }
            linkedHashMap4 = this.A00.A06;
            linkedHashMap4.clear();
        }
        for (Runnable runnable2 : arrayList) {
            runnable2.run();
        }
        interfaceC1016b4 = this.A00.A01;
        if (interfaceC1016b4 == null) {
            return;
        }
        interfaceC1016b42 = this.A00.A01;
        interfaceC1016b42.ACU();
    }
}
