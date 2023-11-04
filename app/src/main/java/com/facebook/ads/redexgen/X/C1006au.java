package com.facebook.ads.redexgen.X;

import android.graphics.Rect;
import com.facebook.infer.annotation.Nullsafe;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* renamed from: com.facebook.ads.redexgen.X.au */
/* loaded from: assets/audience_network.dex */
public final class C1006au {
    public final InterfaceC1010ay A00;
    public final String A01;
    public final Collection<C1021b9> A02;
    public final Collection<C1021b9> A03;
    public final List<Rect> A04;

    public C1006au(String str, InterfaceC1010ay interfaceC1010ay, List<Rect> rects, Collection<C1021b9> collection, Collection<C1021b9> collection2) {
        this.A01 = str;
        this.A00 = interfaceC1010ay;
        this.A04 = new ArrayList(rects);
        this.A02 = collection;
        this.A03 = collection2;
    }
}
