package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.ads.internal.protocol.AdPlacementType;

/* renamed from: com.facebook.ads.redexgen.X.0s */
/* loaded from: assets/audience_network.dex */
public final class C00930s {
    public static InterfaceC00880n A00;

    @Nullable
    public final InterfaceC00880n A00(C0887Xc c0887Xc, AdPlacementType adPlacementType) {
        InterfaceC00880n interfaceC00880n = A00;
        if (interfaceC00880n != null) {
            return interfaceC00880n;
        }
        int i = C00920r.A00[adPlacementType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return null;
                        }
                        return new F6();
                    }
                    return new F9(c0887Xc);
                }
                return new C0967a7(c0887Xc);
            }
            return new C0969a9();
        }
        return new C0970aA();
    }
}
