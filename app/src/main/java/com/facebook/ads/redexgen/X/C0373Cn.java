package com.facebook.ads.redexgen.X;

import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Cn */
/* loaded from: assets/audience_network.dex */
public final class C0373Cn {
    public final int A00;
    public final String A01;
    public final List<C0372Cm> A02;
    public final byte[] A03;

    public C0373Cn(int i, String str, List<C0372Cm> list, byte[] bArr) {
        List<C0372Cm> unmodifiableList;
        this.A00 = i;
        this.A01 = str;
        if (list == null) {
            unmodifiableList = Collections.emptyList();
        } else {
            unmodifiableList = Collections.unmodifiableList(list);
        }
        this.A02 = unmodifiableList;
        this.A03 = bArr;
    }
}
