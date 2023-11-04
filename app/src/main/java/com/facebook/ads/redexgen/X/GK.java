package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class GK {
    public int A00;
    public final int A01;
    public final GJ[] A02;

    public GK(GJ... gjArr) {
        this.A02 = gjArr;
        this.A01 = gjArr.length;
    }

    @Nullable
    public final GJ A00(int i) {
        return this.A02[i];
    }

    public final GJ[] A01() {
        return (GJ[]) this.A02.clone();
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.A02, ((GK) obj).A02);
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            int result = Arrays.hashCode(this.A02);
            this.A00 = (17 * 31) + result;
        }
        return this.A00;
    }
}
