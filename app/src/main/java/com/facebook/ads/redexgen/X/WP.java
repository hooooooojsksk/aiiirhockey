package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class WP implements BV {
    public static byte[] A0F;
    public static String[] A0G = {"QnLOeuXESrCaGCWmeMmr3ccgSJivirlh", "YhzsmTzzzxhtyY2gbPt9z7nrByNpJ8AG", "zwujZ5tU8kb2uxp5tp3MFQMZqwl6Xl8T", "kc6RUJmY0MGel4Ws9MlGHroinjQjp2AB", "ZiGWNZua4Zts1sNsjYBSU4OXsNo5k01z", "vZczIWNBPrLvTkXGahgR3lrPVHA61MAE", "WEnNwLMqAaXyN6vSaeVfRhJYgSEHaora", "u0NJWOpvT5UyzhfOPQB88kiisy6mVL7a"};
    public static final BY A0H;
    public static final int A0I;
    public int A00;
    public int A02;
    public int A03;
    public long A05;
    public BX A06;
    public WR A07;
    public WM A08;
    public boolean A09;
    public final C0483Hc A0C = new C0483Hc(4);
    public final C0483Hc A0B = new C0483Hc(9);
    public final C0483Hc A0E = new C0483Hc(11);
    public final C0483Hc A0D = new C0483Hc();
    public final WO A0A = new WO();
    public int A01 = 1;
    public long A04 = -9223372036854775807L;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0F, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 84);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A0F = new byte[]{-41, -35, -25};
    }

    static {
        A03();
        A0H = new WQ();
        A0I = C0499Hs.A08(A01(0, 3, 61));
    }

    private C0483Hc A00(BW bw) throws IOException, InterruptedException {
        if (this.A02 > this.A0D.A05()) {
            C0483Hc c0483Hc = this.A0D;
            c0483Hc.A0b(new byte[Math.max(c0483Hc.A05() * 2, this.A02)], 0);
        } else {
            this.A0D.A0Y(0);
        }
        this.A0D.A0X(this.A02);
        bw.readFully(this.A0D.A00, 0, this.A02);
        return this.A0D;
    }

    private void A02() {
        long j;
        if (!this.A09) {
            this.A06.AEd(new WU(-9223372036854775807L));
            this.A09 = true;
        }
        if (this.A04 == -9223372036854775807L) {
            if (this.A0A.A0D() == -9223372036854775807L) {
                long j2 = this.A05;
                String[] strArr = A0G;
                if (strArr[5].charAt(20) != strArr[0].charAt(20)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0G;
                strArr2[7] = "L5UStG7DYoKpX710PXz3zQwSbfDogpGa";
                strArr2[6] = "NY6hXsIFzv8ItyXdU8z07IBZswL3MGXa";
                j = -j2;
            } else {
                j = 0;
            }
            this.A04 = j;
        }
    }

    private void A04(BW bw) throws IOException, InterruptedException {
        bw.AFJ(this.A00);
        this.A00 = 0;
        this.A01 = 3;
    }

    private boolean A05(BW bw) throws IOException, InterruptedException {
        if (bw.ADu(this.A0B.A00, 0, 9, true)) {
            this.A0B.A0Y(0);
            this.A0B.A0Z(4);
            int A0E = this.A0B.A0E();
            int flags = A0E & 4;
            boolean z = flags != 0;
            int flags2 = A0E & 1;
            boolean z2 = flags2 != 0;
            if (z && this.A07 == null) {
                this.A07 = new WR(this.A06.AFc(8, 1));
            }
            if (z2 && this.A08 == null) {
                this.A08 = new WM(this.A06.AFc(9, 2));
            }
            this.A06.A5G();
            int flags3 = this.A0B.A08();
            this.A00 = (flags3 - 9) + 4;
            this.A01 = 2;
            return true;
        }
        return false;
    }

    private boolean A06(BW bw) throws IOException, InterruptedException {
        boolean z = true;
        if (this.A03 == 8 && this.A07 != null) {
            A02();
            WR wr = this.A07;
            C0483Hc A00 = A00(bw);
            long j = this.A04;
            String[] strArr = A0G;
            if (strArr[2].charAt(9) == strArr[1].charAt(9)) {
                throw new RuntimeException();
            }
            A0G[4] = "14LyfFoDFqyov0bzU05kIxDiosYU9C09";
            wr.A00(A00, j + this.A05);
        } else if (this.A03 == 9 && this.A08 != null) {
            A02();
            this.A08.A00(A00(bw), this.A04 + this.A05);
        } else {
            if (this.A03 == 18) {
                boolean wasConsumed = this.A09;
                if (!wasConsumed) {
                    this.A0A.A00(A00(bw), this.A05);
                    long A0D = this.A0A.A0D();
                    if (A0D != -9223372036854775807L) {
                        this.A06.AEd(new WU(A0D));
                        this.A09 = true;
                    }
                }
            }
            bw.AFJ(this.A02);
            z = false;
        }
        this.A00 = 4;
        this.A01 = 2;
        return z;
    }

    private boolean A07(BW bw) throws IOException, InterruptedException {
        if (bw.ADu(this.A0E.A00, 0, 11, true)) {
            this.A0E.A0Y(0);
            this.A03 = this.A0E.A0E();
            this.A02 = this.A0E.A0G();
            this.A05 = this.A0E.A0G();
            this.A05 = ((this.A0E.A0E() << 24) | this.A05) * 1000;
            this.A0E.A0Z(3);
            this.A01 = 4;
            return true;
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.BV
    public final void A8V(BX bx) {
        this.A06 = bx;
    }

    @Override // com.facebook.ads.redexgen.X.BV
    public final int ADp(BW bw, C0346Bc c0346Bc) throws IOException, InterruptedException {
        while (true) {
            int i = this.A01;
            if (i != 1) {
                if (i == 2) {
                    A04(bw);
                } else if (i != 3) {
                    if (i == 4) {
                        if (A06(bw)) {
                            return 0;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else if (!A07(bw)) {
                    return -1;
                }
            } else if (!A05(bw)) {
                return -1;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.BV
    public final void AEc(long j, long j2) {
        this.A01 = 1;
        this.A04 = -9223372036854775807L;
        this.A00 = 0;
    }

    @Override // com.facebook.ads.redexgen.X.BV
    public final boolean AFL(BW bw) throws IOException, InterruptedException {
        bw.ADP(this.A0C.A00, 0, 3);
        this.A0C.A0Y(0);
        if (this.A0C.A0G() != A0I) {
            return false;
        }
        bw.ADP(this.A0C.A00, 0, 2);
        this.A0C.A0Y(0);
        if ((this.A0C.A0I() & 250) != 0) {
            return false;
        }
        bw.ADP(this.A0C.A00, 0, 4);
        this.A0C.A0Y(0);
        int dataOffset = this.A0C.A08();
        bw.AES();
        bw.A3L(dataOffset);
        bw.ADP(this.A0C.A00, 0, 4);
        this.A0C.A0Y(0);
        int dataOffset2 = this.A0C.A08();
        return dataOffset2 == 0;
    }
}
