package com.facebook.ads.redexgen.X;

import com.mobirix.airhockey.airhockey;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class W4 implements CO {
    public static byte[] A0C;
    public static String[] A0D = {"qlUqm53dx2wRFYI19yFYkvkmPQFopPfK", "kfzPj4jiKhQrTstJ9wOtTomcMDMJFI2R", "tio4jxSpdKgrcMNksdh3F2ai0PxCizyi", "S5qskWqDqPkhPpuUuuvRcKySD9vc4n0H", "X67UodKHNvmZa3DnASt4fZlpL2cJMcNV", "01LnOYH7rGQp5f5o2UGBiyg7bnJQxBa8", "qDTiiMVukWANjWrPbJo4riKeblMOo1tu", "5dAWhKcmsHilqUXjq3PFXu2GkNxyPnDG"};
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public final long A08;
    public final long A09;
    public final CN A0A = new CN();
    public final CR A0B;

    public static String A09(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 78);
        }
        return new String(copyOfRange);
    }

    public static void A0A() {
        A0C = new byte[]{22, 55, airhockey.J_ACHIEVEMENTCALLBACK, 55, 63, 63, airhockey.J_ACHIEVEMENTCALLBACK, 40, 57, 63, 61, airhockey.J_ACHIEVEMENTCALLBACK, 59, 57, 54, airhockey.J_ACHIEVEMENTCALLBACK, 58, 61, airhockey.J_ACHIEVEMENTCALLBACK, 62, 55, 45, 54, 60, airhockey.J_REWARD};
    }

    static {
        A0A();
    }

    public W4(long j, long j2, CR cr, int i, long j3) {
        HD.A03(j >= 0 && j2 > j);
        this.A0B = cr;
        this.A09 = j;
        this.A08 = j2;
        if (i == j2 - j) {
            this.A07 = j3;
            this.A00 = 3;
            return;
        }
        this.A00 = 0;
    }

    public long A00(long j, long j2, long j3) {
        long j4 = this.A08;
        long j5 = this.A09;
        long j6 = j + ((((j4 - j5) * j2) / this.A07) - j3);
        if (j6 < j5) {
            j6 = this.A09;
        }
        long j7 = this.A08;
        if (j6 >= j7) {
            return j7 - 1;
        }
        return j6;
    }

    private final long A01(long j, BW bw) throws IOException, InterruptedException {
        if (this.A04 == this.A01) {
            return -(this.A05 + 2);
        }
        long A7P = bw.A7P();
        if (A0D(bw, this.A01)) {
            this.A0A.A03(bw, false);
            bw.AES();
            long j2 = j - this.A0A.A05;
            int i = this.A0A.A01 + this.A0A.A00;
            if (j2 < 0 || j2 > 72000) {
                if (j2 < 0) {
                    this.A01 = A7P;
                    this.A02 = this.A0A.A05;
                } else {
                    long initialPosition = bw.A7P();
                    this.A04 = initialPosition + i;
                    this.A05 = this.A0A.A05;
                    long initialPosition2 = this.A01;
                    if ((initialPosition2 - this.A04) + i < 100000) {
                        bw.AFJ(i);
                        long initialPosition3 = this.A05;
                        return -(initialPosition3 + 2);
                    }
                }
                long initialPosition4 = this.A01;
                long j3 = this.A04;
                String[] strArr = A0D;
                if (strArr[4].charAt(12) != strArr[0].charAt(12)) {
                    A0D[3] = "zvKF8WQUI0SajHpo4Xv9v8DHT9e2MTPL";
                    if (initialPosition4 - j3 < 100000) {
                        this.A01 = j3;
                        return j3;
                    }
                    long j4 = i;
                    long j5 = j2 > 0 ? 1L : 2L;
                    long A7P2 = bw.A7P();
                    long j6 = this.A01;
                    long granuleDistance = this.A04;
                    long initialPosition5 = this.A02;
                    long nextPosition = (A7P2 - (j4 * j5)) + (((j6 - granuleDistance) * j2) / (initialPosition5 - this.A05));
                    return Math.min(Math.max(nextPosition, granuleDistance), this.A01 - 1);
                }
                throw new RuntimeException();
            }
            bw.AFJ(i);
            return -(this.A0A.A05 + 2);
        }
        long j7 = this.A04;
        if (j7 != A7P) {
            return j7;
        }
        throw new IOException(A09(0, 25, 22));
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0051, code lost:
        return r5.A0A.A05;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final long A02(com.facebook.ads.redexgen.X.BW r6) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r5 = this;
            r5.A0C(r6)
            com.facebook.ads.redexgen.X.CN r0 = r5.A0A
            r0.A02()
        L8:
            com.facebook.ads.redexgen.X.CN r0 = r5.A0A
            int r3 = r0.A04
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.W4.A0D
            r0 = 4
            r1 = r2[r0]
            r0 = 0
            r2 = r2[r0]
            r0 = 12
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L52
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.W4.A0D
            java.lang.String r1 = "8L7HD1AI4we5ropKbStlQEIIPOmJrEUL"
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "xLnKc6RM4Edpr9DSdPLSxPAMnW98GKHb"
            r0 = 2
            r2[r0] = r1
            r0 = 4
            r3 = r3 & r0
            if (r3 == r0) goto L4d
            long r3 = r6.A7P()
            long r1 = r5.A08
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L4d
            com.facebook.ads.redexgen.X.CN r1 = r5.A0A
            r0 = 0
            r1.A03(r6, r0)
            com.facebook.ads.redexgen.X.CN r0 = r5.A0A
            int r1 = r0.A01
            com.facebook.ads.redexgen.X.CN r0 = r5.A0A
            int r0 = r0.A00
            int r1 = r1 + r0
            r6.AFJ(r1)
            goto L8
        L4d:
            com.facebook.ads.redexgen.X.CN r0 = r5.A0A
            long r0 = r0.A05
            return r0
        L52:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.W4.A02(com.facebook.ads.redexgen.X.BW):long");
    }

    private final long A03(BW bw, long j, long j2) throws IOException, InterruptedException {
        this.A0A.A03(bw, false);
        while (this.A0A.A05 < j) {
            bw.AFJ(this.A0A.A01 + this.A0A.A00);
            j2 = this.A0A.A05;
            this.A0A.A03(bw, false);
        }
        bw.AES();
        return j2;
    }

    @Override // com.facebook.ads.redexgen.X.CO
    /* renamed from: A07 */
    public final W5 A4V() {
        if (this.A07 != 0) {
            return new W5(this);
        }
        return null;
    }

    private final void A0B() {
        this.A04 = this.A09;
        this.A01 = this.A08;
        this.A05 = 0L;
        this.A02 = this.A07;
    }

    private final void A0C(BW bw) throws IOException, InterruptedException {
        if (A0D(bw, this.A08)) {
            return;
        }
        throw new EOFException();
    }

    private final boolean A0D(BW bw, long j) throws IOException, InterruptedException {
        long min = Math.min(3 + j, this.A08);
        byte[] bArr = new byte[2048];
        int i = bArr.length;
        while (true) {
            if (bw.A7P() + i > min && (i = (int) (min - bw.A7P())) < 4) {
                return false;
            }
            bw.ADQ(bArr, 0, i, false);
            for (int i2 = 0; i2 < i - 3; i2++) {
                int peekLength = bArr[i2];
                if (peekLength == 79 && bArr[i2 + 1] == 103 && bArr[i2 + 2] == 103) {
                    int peekLength2 = bArr[i2 + 3];
                    if (peekLength2 == 83) {
                        bw.AFJ(i2);
                        return true;
                    }
                }
            }
            bw.AFJ(i - 3);
        }
    }

    @Override // com.facebook.ads.redexgen.X.CO
    public final long ADq(BW bw) throws IOException, InterruptedException {
        long currentGranule;
        int i = this.A00;
        if (i == 0) {
            this.A03 = bw.A7P();
            this.A00 = 1;
            long j = this.A08 - 65307;
            if (j > this.A03) {
                return j;
            }
        } else if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return -1L;
                }
                throw new IllegalStateException();
            }
            long currentGranule2 = this.A06;
            if (currentGranule2 == 0) {
                currentGranule = 0;
            } else {
                long position = A01(currentGranule2, bw);
                if (position >= 0) {
                    return position;
                }
                long j2 = this.A06;
                long j3 = -(position + 2);
                if (A0D[3].charAt(18) != 'v') {
                    throw new RuntimeException();
                }
                A0D[5] = "dlJMt4bYi9Wd99tok2AKRnDxWagHn2V7";
                currentGranule = A03(bw, j2, j3);
            }
            this.A00 = 3;
            return -(2 + currentGranule);
        }
        long lastPageSearchPosition = A02(bw);
        this.A07 = lastPageSearchPosition;
        this.A00 = 3;
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.CO
    public final long AFR(long j) {
        int i = this.A00;
        HD.A03(i == 3 || i == 2);
        long j2 = 0;
        if (j != 0) {
            j2 = this.A0B.A04(j);
        }
        this.A06 = j2;
        this.A00 = 2;
        A0B();
        return this.A06;
    }
}
