package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.4w */
/* loaded from: assets/audience_network.dex */
public final class C01984w {
    public C01954t A00 = new C01954t();
    public final InterfaceC01964u A01;

    public C01984w(InterfaceC01964u interfaceC01964u) {
        this.A01 = interfaceC01964u;
    }

    public final View A00(int i, int i2, int i3, int i4) {
        int A7I = this.A01.A7I();
        int next = this.A01.A7H();
        int childEnd = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View A65 = this.A01.A65(i);
            int A68 = this.A01.A68(A65);
            int i5 = this.A01.A67(A65);
            this.A00.A03(A7I, next, A68, i5);
            if (i3 != 0) {
                this.A00.A01();
                this.A00.A02(i3);
                if (this.A00.A04()) {
                    return A65;
                }
            }
            if (i4 != 0) {
                this.A00.A01();
                this.A00.A02(i4);
                if (this.A00.A04()) {
                    view = A65;
                }
            }
            i += childEnd;
        }
        return view;
    }
}
