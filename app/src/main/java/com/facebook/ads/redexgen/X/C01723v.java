package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.3v */
/* loaded from: assets/audience_network.dex */
public class C01723v {
    public static byte[] A02;
    public static String[] A03 = {"bULQ32o9JJN83aCucFVWf9xMaMFfdsau", "BEVDZxUetTHXZyMQk8onv0fPj1ZBZ1Qa", "0vYpub5LBkfCpAgXclsnPo1", "vVWBcEJQjEsfNalmzVe1r7miASaPIW1B", "LFkzDQh", "g5RhG8eWHWtWI7ENz9qYtKd", "50dEOoYhOQRa91fvkd77j3svvS12NHRj", "eQbNRdF"};
    public long A00 = 0;
    public C01723v A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 5);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-34, -34};
    }

    static {
        A02();
    }

    private void A01() {
        if (this.A01 == null) {
            this.A01 = new C01723v();
        }
    }

    public final int A03(int i) {
        C01723v c01723v = this.A01;
        if (c01723v == null) {
            if (i >= 64) {
                return Long.bitCount(this.A00);
            }
            return Long.bitCount(this.A00 & ((1 << i) - 1));
        } else if (i < 64) {
            return Long.bitCount(this.A00 & ((1 << i) - 1));
        } else {
            return c01723v.A03(i - 64) + Long.bitCount(this.A00);
        }
    }

    public final void A04() {
        this.A00 = 0L;
        C01723v c01723v = this.A01;
        if (c01723v != null) {
            c01723v.A04();
        }
    }

    public final void A05(int i) {
        if (i >= 64) {
            C01723v c01723v = this.A01;
            if (c01723v != null) {
                c01723v.A05(i - 64);
                return;
            }
            return;
        }
        long j = this.A00 & ((1 << i) ^ (-1));
        if (A03[1].charAt(31) != 'a') {
            throw new RuntimeException();
        }
        String[] strArr = A03;
        strArr[6] = "FQtQPqX5zshXn4VmNwTVsnzPJS3Krcw4";
        strArr[3] = "mEVd87EgPvtBoIzzDeJnjIPIOSUL2jIs";
        this.A00 = j;
    }

    public final void A06(int i) {
        if (i >= 64) {
            A01();
            this.A01.A06(i - 64);
            return;
        }
        this.A00 |= 1 << i;
    }

    public final void A07(int i, boolean z) {
        if (i >= 64) {
            A01();
            this.A01.A07(i - 64, z);
            return;
        }
        boolean z2 = (this.A00 & Long.MIN_VALUE) != 0;
        long mask = (1 << i) - 1;
        long j = this.A00;
        this.A00 = (j & mask) | ((j & ((-1) ^ mask)) << 1);
        if (z) {
            A06(i);
        } else {
            A05(i);
        }
        if (!z2 && this.A01 == null) {
            return;
        }
        A01();
        this.A01.A07(0, z2);
    }

    public final boolean A08(int i) {
        if (i < 64) {
            return (this.A00 & (1 << i)) != 0;
        }
        A01();
        return this.A01.A08(i - 64);
    }

    public final boolean A09(int i) {
        if (i >= 64) {
            A01();
            return this.A01.A09(i - 64);
        }
        long j = 1 << i;
        boolean z = (this.A00 & j) != 0;
        long mask = this.A00;
        this.A00 = mask & (j ^ (-1));
        long j2 = j - 1;
        long j3 = this.A00;
        long mask2 = j3 & j2;
        long after = Long.rotateRight(j3 & ((-1) ^ j2), 1);
        this.A00 = mask2 | after;
        C01723v c01723v = this.A01;
        if (c01723v != null) {
            if (c01723v.A08(0)) {
                A06(63);
            }
            this.A01.A09(0);
        }
        return z;
    }

    public final String toString() {
        if (this.A01 != null) {
            return this.A01.toString() + A00(0, 2, 97) + Long.toBinaryString(this.A00);
        }
        long j = this.A00;
        if (A03[1].charAt(31) != 'a') {
            throw new RuntimeException();
        }
        String[] strArr = A03;
        strArr[2] = "hJ9KUEYMHtIt6rT1Ez0KfdL";
        strArr[5] = "B6CHA8tZa8vt0H5l4hWvu9Y";
        return Long.toBinaryString(j);
    }
}
