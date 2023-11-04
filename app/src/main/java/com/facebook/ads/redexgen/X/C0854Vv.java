package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Vv */
/* loaded from: assets/audience_network.dex */
public final class C0854Vv implements BV {
    public static byte[] A04;
    public static String[] A05 = {"89ZAS4gKAvfsCOhGFLRndaPlzH5Jylu0", "WDj0w8iYShPhw5JkNLQVjMzFidij1YMB", "SZD8V9ebG6DMCxkEToUDQHseHkwYH45y", "flB69VC8Ebs69L5nDVZVAs6kLxLMfW9p", "Dc9Giep11FBAOEJK", "fiVRhSZcsaoyqUlEeIiHO4czNXpaN55t", "HHz5E2PDkz6p7na9zQig", "GASwop9kiLfFsL9tAHZWlbr16muWtU3x"};
    public static final BY A06;
    public static final int A07;
    public boolean A00;
    public final long A01;
    public final C0853Vu A02;
    public final C0483Hc A03;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 70);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-8, -13, -30};
        if (A05[3].charAt(6) != 'C') {
            throw new RuntimeException();
        }
        A05[6] = "Dcf";
    }

    static {
        A01();
        A06 = new C0855Vw();
        A07 = C0499Hs.A08(A00(0, 3, 105));
    }

    public C0854Vv() {
        this(0L);
    }

    public C0854Vv(long j) {
        this.A01 = j;
        this.A02 = new C0853Vu();
        this.A03 = new C0483Hc(2786);
    }

    @Override // com.facebook.ads.redexgen.X.BV
    public final void A8V(BX bx) {
        this.A02.A4Y(bx, new C0375Cp(0, 1));
        bx.A5G();
        bx.AEd(new WU(-9223372036854775807L));
    }

    @Override // com.facebook.ads.redexgen.X.BV
    public final int ADp(BW bw, C0346Bc c0346Bc) throws IOException, InterruptedException {
        int read = bw.read(this.A03.A00, 0, 2786);
        if (read == -1) {
            return -1;
        }
        this.A03.A0Y(0);
        this.A03.A0X(read);
        if (!this.A00) {
            this.A02.ADN(this.A01, true);
            this.A00 = true;
        }
        this.A02.A4B(this.A03);
        return 0;
    }

    @Override // com.facebook.ads.redexgen.X.BV
    public final void AEc(long j, long j2) {
        this.A00 = false;
        this.A02.AEb();
    }

    @Override // com.facebook.ads.redexgen.X.BV
    public final boolean AFL(BW bw) throws IOException, InterruptedException {
        C0483Hc c0483Hc = new C0483Hc(10);
        int startPosition = 0;
        while (true) {
            bw.ADP(c0483Hc.A00, 0, 10);
            c0483Hc.A0Y(0);
            if (c0483Hc.A0G() != A07) {
                break;
            }
            c0483Hc.A0Z(3);
            int A0D = c0483Hc.A0D();
            startPosition += A0D + 10;
            bw.A3L(A0D);
        }
        bw.AES();
        bw.A3L(startPosition);
        int syncBytes = startPosition;
        int i = 0;
        while (true) {
            bw.ADP(c0483Hc.A00, 0, 5);
            c0483Hc.A0Y(0);
            int headerPosition = c0483Hc.A0I();
            if (headerPosition != 2935) {
                i = 0;
                bw.AES();
                syncBytes++;
                int headerPosition2 = syncBytes - startPosition;
                if (headerPosition2 >= 8192) {
                    return false;
                }
                bw.A3L(syncBytes);
            } else {
                i++;
                if (i >= 4) {
                    return true;
                }
                int headerPosition3 = A3.A05(c0483Hc.A00);
                if (headerPosition3 == -1) {
                    return false;
                }
                bw.A3L(headerPosition3 - 5);
            }
        }
    }
}
