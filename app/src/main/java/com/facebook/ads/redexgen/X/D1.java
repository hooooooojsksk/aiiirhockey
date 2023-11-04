package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import androidx.annotation.Nullable;

/* loaded from: assets/audience_network.dex */
public final class D1 {
    public final String A00;
    public final boolean A01;

    public D1(String str, boolean z) {
        this.A00 = str;
        this.A01 = z;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != D1.class) {
            return false;
        }
        D1 d1 = (D1) obj;
        return TextUtils.equals(this.A00, d1.A00) && this.A01 == d1.A01;
    }

    public final int hashCode() {
        int result = 1 * 31;
        String str = this.A00;
        int prime = str == null ? 0 : str.hashCode();
        int result2 = (result + prime) * 31;
        int prime2 = this.A01 ? 1231 : 1237;
        return result2 + prime2;
    }
}
