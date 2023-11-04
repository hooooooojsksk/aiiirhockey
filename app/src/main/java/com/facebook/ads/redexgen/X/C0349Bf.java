package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Bf */
/* loaded from: assets/audience_network.dex */
public final class C0349Bf {
    public static byte[] A02;
    public static final C0349Bf A03;
    public final long A00;
    public final long A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 58);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{airhockey.J_SAVEDGAME_RELOAD, 126, 46, 49, 45, 55, 42, 55, 49, 48, 99, 50, 29, 0, 4, 12, 60, 26, 84, 102};
    }

    static {
        A01();
        A03 = new C0349Bf(0L, 0L);
    }

    public C0349Bf(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0349Bf c0349Bf = (C0349Bf) obj;
        return this.A01 == c0349Bf.A01 && this.A00 == c0349Bf.A00;
    }

    public final int hashCode() {
        return (((int) this.A01) * 31) + ((int) this.A00);
    }

    public final String toString() {
        return A00(11, 8, 83) + this.A01 + A00(0, 11, 100) + this.A00 + A00(19, 1, 1);
    }
}
