package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.os.Bundle;
import androidx.annotation.Nullable;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.3f */
/* loaded from: assets/audience_network.dex */
public final class C01573f {
    public static final InterfaceC01563e A01;
    public final Object A00;

    static {
        if (Build.VERSION.SDK_INT >= 19) {
            A01 = new ED();
        } else if (Build.VERSION.SDK_INT >= 16) {
            A01 = new EE();
        } else {
            A01 = new C0919Yi();
        }
    }

    public C01573f() {
        this.A00 = A01.A9t(this);
    }

    public C01573f(Object obj) {
        this.A00 = obj;
    }

    @Nullable
    public final C01553d A00(int i) {
        return null;
    }

    @Nullable
    public final C01553d A01(int i) {
        return null;
    }

    public final Object A02() {
        return this.A00;
    }

    @Nullable
    public final List<C01553d> A03(String str, int i) {
        return null;
    }

    public final boolean A04(int i, int i2, Bundle bundle) {
        return false;
    }
}
