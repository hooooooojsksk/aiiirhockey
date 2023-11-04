package com.facebook.ads.redexgen.X;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public class U4 implements N9 {
    public static String[] A01 = {"PnhhxO44eyGR", "6RYeLXmAClA1SiGKn201px", "WqNcg2MFF", "kFMGwY5yNNV", "mQRpAL1oxGJgw", "Eqf6jMIzeI3tCjJb", "9imsVe3tjkVzhTosgYrmf1lKW7QE2MSM", "NRYl8cTHkwcGHXULnCD2cakkWnkUWd4e"};
    public final /* synthetic */ U1 A00;

    public U4(U1 u1) {
        this.A00 = u1;
    }

    @Override // com.facebook.ads.redexgen.X.N9
    public final void ABA(boolean z) {
        AtomicBoolean atomicBoolean;
        AtomicBoolean atomicBoolean2;
        InterfaceC0522Ir interfaceC0522Ir;
        InterfaceC0522Ir interfaceC0522Ir2;
        atomicBoolean = this.A00.A0D;
        atomicBoolean.set(z);
        atomicBoolean2 = this.A00.A0E;
        if (atomicBoolean2.get()) {
            interfaceC0522Ir = this.A00.A02;
            if (interfaceC0522Ir != null) {
                U1 u1 = this.A00;
                String[] strArr = A01;
                if (strArr[5].length() == strArr[3].length()) {
                    throw new RuntimeException();
                }
                A01[2] = "moHDWw2Q1";
                interfaceC0522Ir2 = u1.A02;
                interfaceC0522Ir2.ABx(z);
            }
        }
    }
}
