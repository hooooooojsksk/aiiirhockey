package com.facebook.ads.redexgen.X;

import android.text.Layout;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Fu */
/* loaded from: assets/audience_network.dex */
public final class C0451Fu {
    public static byte[] A0E;
    public static String[] A0F = {"EnH25CHWMSY6kl25xfmHDjH3RJCVhcCa", "c9QwS3HStmnCaTv4XqOiovcAW3vqBlCk", "yJ9YFZ76HfVljhtFvtfSYsYYLHoVkMB3", "y69MVLIQwTRqYQkH6ft3AFsQHNhuhuqd", "HDxitRoDWw9zLH1l", "uTT6gRFq1HF7aES4vampCOqVAKYvWyzU", "m9Eh3F3c5Q4haO7Pkkaf6ux3SCszBLsk", "9FJhR48G617i"};
    public float A00;
    public int A01;
    public int A03;
    public Layout.Alignment A08;
    public String A09;
    public String A0A;
    public boolean A0B;
    public boolean A0C;
    public final C0451Fu A0D;
    public int A06 = -1;
    public int A07 = -1;
    public int A02 = -1;
    public int A05 = -1;
    public int A04 = -1;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 41);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        byte[] bArr = {-32, -1, 1, 9, 5, 16, 13, 19, 12, 2, -66, 1, 13, 10, 13, 16, -66, 6, -1, 17, -66, 12, 13, 18, -66, 0, 3, 3, 12, -66, 2, 3, 4, 7, 12, 3, 2, -52, -120, -79, -80, -74, airhockey.J_NATION, -91, -79, -82, -79, -76, airhockey.J_NATION, -86, -93, -75, airhockey.J_NATION, -80, -79, -74, airhockey.J_NATION, -92, -89, -89, -80, airhockey.J_NATION, -90, -89, -88, -85, -80, -89, -90, airhockey.J_GOO};
        if (A0F[3].charAt(14) == 'v') {
            throw new RuntimeException();
        }
        A0F[7] = "ykTASi";
        A0E = bArr;
    }

    static {
        A02();
    }

    private C0451Fu A00(C0451Fu c0451Fu, boolean z) {
        if (c0451Fu != null) {
            if (!this.A0C && c0451Fu.A0C) {
                A0B(c0451Fu.A03);
            }
            if (this.A02 == -1) {
                this.A02 = c0451Fu.A02;
            }
            if (this.A05 == -1) {
                this.A05 = c0451Fu.A05;
            }
            if (this.A09 == null) {
                this.A09 = c0451Fu.A09;
            }
            if (this.A06 == -1) {
                this.A06 = c0451Fu.A06;
            }
            if (this.A07 == -1) {
                this.A07 = c0451Fu.A07;
            }
            if (this.A08 == null) {
                this.A08 = c0451Fu.A08;
            }
            if (this.A04 == -1) {
                int i = c0451Fu.A04;
                String[] strArr = A0F;
                if (strArr[2].charAt(27) != strArr[0].charAt(27)) {
                    throw new RuntimeException();
                }
                A0F[1] = "7dqV6HxUrZiNBplekuLou9nhbRk7RVhU";
                this.A04 = i;
                this.A00 = c0451Fu.A00;
            }
            if (z && !this.A0B && c0451Fu.A0B) {
                A0A(c0451Fu.A01);
            }
        }
        return this;
    }

    public final float A03() {
        return this.A00;
    }

    public final int A04() {
        if (this.A0B) {
            int i = this.A01;
            if (A0F[4].length() != 32) {
                A0F[7] = "KTxuuxMEH1VJoR6Md1";
                return i;
            }
            throw new RuntimeException();
        }
        throw new IllegalStateException(A01(0, 38, 117));
    }

    public final int A05() {
        if (this.A0C) {
            return this.A03;
        }
        throw new IllegalStateException(A01(38, 32, 25));
    }

    public final int A06() {
        return this.A04;
    }

    public final int A07() {
        if (this.A02 == -1 && this.A05 == -1) {
            return -1;
        }
        return (this.A02 == 1 ? 1 : 0) | (this.A05 == 1 ? 2 : 0);
    }

    public final Layout.Alignment A08() {
        return this.A08;
    }

    public final C0451Fu A09(float f) {
        this.A00 = f;
        return this;
    }

    public final C0451Fu A0A(int i) {
        this.A01 = i;
        this.A0B = true;
        return this;
    }

    public final C0451Fu A0B(int i) {
        HD.A04(this.A0D == null);
        String[] strArr = A0F;
        if (strArr[2].charAt(27) != strArr[0].charAt(27)) {
            throw new RuntimeException();
        }
        A0F[1] = "pCA0IZ9lubeHZB9SkjDL2kYLsCYdHLPR";
        this.A03 = i;
        this.A0C = true;
        return this;
    }

    public final C0451Fu A0C(int i) {
        this.A04 = i;
        return this;
    }

    public final C0451Fu A0D(Layout.Alignment alignment) {
        this.A08 = alignment;
        return this;
    }

    public final C0451Fu A0E(C0451Fu c0451Fu) {
        return A00(c0451Fu, true);
    }

    public final C0451Fu A0F(String str) {
        HD.A04(this.A0D == null);
        this.A09 = str;
        return this;
    }

    public final C0451Fu A0G(String str) {
        this.A0A = str;
        return this;
    }

    public final C0451Fu A0H(boolean z) {
        HD.A04(this.A0D == null);
        this.A02 = z ? 1 : 0;
        return this;
    }

    public final C0451Fu A0I(boolean z) {
        HD.A04(this.A0D == null);
        this.A05 = z ? 1 : 0;
        return this;
    }

    public final C0451Fu A0J(boolean z) {
        HD.A04(this.A0D == null);
        this.A06 = z ? 1 : 0;
        return this;
    }

    public final C0451Fu A0K(boolean z) {
        HD.A04(this.A0D == null);
        this.A07 = z ? 1 : 0;
        return this;
    }

    public final String A0L() {
        return this.A09;
    }

    public final String A0M() {
        return this.A0A;
    }

    public final boolean A0N() {
        return this.A0B;
    }

    public final boolean A0O() {
        return this.A0C;
    }

    public final boolean A0P() {
        return this.A06 == 1;
    }

    public final boolean A0Q() {
        return this.A07 == 1;
    }
}
