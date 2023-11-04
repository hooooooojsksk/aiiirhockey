package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class ON {
    public static final Map<String, WeakReference<OM>> A00 = new HashMap();

    public static int A00() {
        return A00.size();
    }

    public static OM A01(C0887Xc c0887Xc, AbstractC0952Zs abstractC0952Zs, int i, OK ok) {
        OM om = new OM(c0887Xc, abstractC0952Zs, c0887Xc.A01().A09(), i);
        om.A0b(ok);
        om.A0X();
        A00.put(abstractC0952Zs.A0L(), new WeakReference<>(om));
        return om;
    }

    @Nullable
    public static OM A02(String str) {
        WeakReference<OM> weakReference = A00.get(str);
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public static void A03(AbstractC0952Zs abstractC0952Zs, OM om) {
        A00.put(abstractC0952Zs.A0L(), new WeakReference<>(om));
    }

    public static void A04(String str) {
        A00.remove(str);
    }
}
