package com.facebook.ads.redexgen.X;

import android.view.View;
import com.facebook.infer.annotation.Nullsafe;
import java.util.Collection;
import java.util.Map;
import java.util.WeakHashMap;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* renamed from: com.facebook.ads.redexgen.X.b2 */
/* loaded from: assets/audience_network.dex */
public final class C1014b2 {
    public final Map<View, C1021b9> A00 = new WeakHashMap();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized C1021b9 A00(View view) {
        C1021b9 c1021b9 = this.A00.get(view);
        if (c1021b9 == null) {
            return C1021b9.A08;
        }
        return c1021b9;
    }

    public final synchronized void A01(View view) {
        this.A00.remove(view);
    }

    public final synchronized void A02(View view, C1021b9 c1021b9) {
        this.A00.put(view, c1021b9);
    }

    public final synchronized void A03(Collection<View> result) {
        for (View view : this.A00.keySet()) {
            result.add(view);
        }
    }
}
