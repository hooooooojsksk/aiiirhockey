package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.concurrent.Executor;

/* loaded from: assets/audience_network.dex */
public final class LZ {
    @Nullable
    public static LZ A02;
    public final TL A00;
    public final C0579Lb A01;

    public LZ(C0887Xc c0887Xc, Executor executor, C8A c8a) {
        this.A01 = new C0579Lb(c0887Xc);
        this.A00 = new TL(executor, c8a, c0887Xc);
    }

    private void A00() {
        this.A01.A03(this.A00);
    }

    public static void A01(C0887Xc c0887Xc, Executor executor, C8A c8a) {
        if (!IK.A17(c0887Xc)) {
            return;
        }
        LZ lz = A02;
        if (lz == null) {
            A02 = new LZ(c0887Xc, executor, c8a);
            A02.A00();
            return;
        }
        lz.A02(c8a);
    }

    private void A02(C8A c8a) {
        this.A00.A07(c8a);
    }
}
