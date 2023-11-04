package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata;
import com.mobirix.airhockey.airhockey;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: assets/audience_network.dex */
public final class WF implements BV {
    public static byte[] A0E;
    public static String[] A0F = {"FKupPKXcsIkycQ3l5ptAH5wluEqc6YoI", "RW", "ogqWAOna8QODFLIqijT7vOYnhApvYyU7", "UAOUtvFDqNmRNLgZ1GU6DrNnbPesxUgh", "z4WGtVpeHmr0jWMfeyoB2cmDzFByDj9w", "gdGWUcFUabEj8aTRXEAi5amp", "tmhvTid", "WDNv6R6VbALBmvSk6DCmHF7NFi0i9puO"};
    public static final BY A0G;
    public static final int A0H;
    public static final int A0I;
    public static final int A0J;
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public BX A04;
    public InterfaceC0351Bh A05;
    public WG A06;
    public Metadata A07;
    public final int A08;
    public final long A09;
    public final BZ A0A;
    public final Ba A0B;
    public final Bb A0C;
    public final C0483Hc A0D;

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 31);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A0E = new byte[]{-94, -57, -65, -56, -110, -92, -96, -79, -94, -89, -92, -93, 95, -77, -82, -82, 95, -84, -96, -83, -72, 95, -95, -72, -77, -92, -78, 109, -115, airhockey.J_WAIT, -119, ByteCompanionObject.MIN_VALUE, -100, -83, -78, -85};
    }

    static {
        A05();
        A0G = new WH();
        A0J = C0499Hs.A08(A04(32, 4, 37));
        A0H = C0499Hs.A08(A04(0, 4, 58));
        A0I = C0499Hs.A08(A04(28, 4, 24));
    }

    public WF() {
        this(0);
    }

    public WF(int i) {
        this(i, -9223372036854775807L);
    }

    public WF(int i, long j) {
        this.A08 = i;
        this.A09 = j;
        this.A0D = new C0483Hc(10);
        this.A0C = new Bb();
        this.A0A = new BZ();
        this.A02 = -9223372036854775807L;
        this.A0B = new Ba();
    }

    private int A00(BW bw) throws IOException, InterruptedException {
        if (this.A00 == 0) {
            bw.AES();
            if (bw.ADQ(this.A0D.A00, 0, 4, true)) {
                this.A0D.A0Y(0);
                int A08 = this.A0D.A08();
                int sampleHeaderData = this.A01;
                if (A06(A08, sampleHeaderData)) {
                    int sampleHeaderData2 = Bb.A00(A08);
                    if (sampleHeaderData2 != -1) {
                        Bb.A04(A08, this.A0C);
                        if (this.A02 == -9223372036854775807L) {
                            WG wg = this.A06;
                            long A7P = bw.A7P();
                            if (A0F[0].charAt(7) == '2') {
                                throw new RuntimeException();
                            }
                            A0F[5] = "uwsYCHPiCgNXlhDD9rc7dT19";
                            this.A02 = wg.A7q(A7P);
                            if (this.A09 != -9223372036854775807L) {
                                this.A02 += this.A09 - this.A06.A7q(0L);
                            }
                        }
                        int sampleHeaderData3 = this.A0C.A02;
                        this.A00 = sampleHeaderData3;
                    }
                }
                bw.AFJ(1);
                this.A01 = 0;
                return 0;
            }
            return -1;
        }
        int AEW = this.A05.AEW(bw, this.A00, true);
        if (AEW == -1) {
            return -1;
        }
        int bytesAppended = this.A00;
        this.A00 = bytesAppended - AEW;
        int bytesAppended2 = this.A00;
        if (bytesAppended2 > 0) {
            return 0;
        }
        long j = this.A02;
        int bytesAppended3 = this.A0C.A03;
        this.A05.AEY(j + ((this.A03 * 1000000) / bytesAppended3), 1, this.A0C.A02, 0, null);
        long j2 = this.A03;
        int bytesAppended4 = this.A0C.A04;
        this.A03 = j2 + bytesAppended4;
        this.A00 = 0;
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0035, code lost:
        if (r3 == r0) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A01(com.facebook.ads.redexgen.X.C0483Hc r4, int r5) {
        /*
            int r1 = r4.A07()
            int r0 = r5 + 4
            if (r1 < r0) goto L3e
            r4.A0Y(r5)
            int r3 = r4.A08()
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.WF.A0F
            r0 = 4
            r1 = r2[r0]
            r0 = 3
            r2 = r2[r0]
            r0 = 21
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L38
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.WF.A0F
            java.lang.String r1 = "RZ9mFeyNnV0sPgPCsPCuasZg37Uzdp17"
            r0 = 4
            r2[r0] = r1
            java.lang.String r1 = "fK9CAyTZYj28knSP6u8xHPIK1qnXYcxa"
            r0 = 3
            r2[r0] = r1
            int r0 = com.facebook.ads.redexgen.X.WF.A0J
            if (r3 == r0) goto L37
            int r0 = com.facebook.ads.redexgen.X.WF.A0H
            if (r3 != r0) goto L3e
        L37:
            return r3
        L38:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L3e:
            int r1 = r4.A07()
            r0 = 40
            if (r1 < r0) goto L54
            r0 = 36
            r4.A0Y(r0)
            int r1 = r4.A08()
            int r0 = com.facebook.ads.redexgen.X.WF.A0I
            if (r1 != r0) goto L54
            return r0
        L54:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.WF.A01(com.facebook.ads.redexgen.X.Hc, int):int");
    }

    private WG A02(BW bw) throws IOException, InterruptedException {
        bw.ADP(this.A0D.A00, 0, 4);
        this.A0D.A0Y(0);
        Bb.A04(this.A0D.A08(), this.A0C);
        return new C0384Dd(bw.A70(), bw.A7P(), this.A0C);
    }

    private WG A03(BW bw) throws IOException, InterruptedException {
        C0483Hc c0483Hc = new C0483Hc(this.A0C.A02);
        bw.ADP(c0483Hc.A00, 0, this.A0C.A02);
        int i = 21;
        if ((this.A0C.A05 & 1) != 0) {
            int i2 = this.A0C.A01;
            if (A0F[5].length() != 24) {
                throw new RuntimeException();
            }
            String[] strArr = A0F;
            strArr[6] = "1a7oiXE";
            strArr[1] = "rh";
            if (i2 != 1) {
                i = 36;
            }
        } else if (this.A0C.A01 == 1) {
            i = 13;
        }
        int xingBase = A01(c0483Hc, i);
        if (xingBase == A0J || xingBase == A0H) {
            C0382Cy A01 = C0382Cy.A01(bw.A70(), bw.A7P(), this.A0C, c0483Hc);
            if (A01 != null && !this.A0A.A03()) {
                bw.AES();
                bw.A3L(i + 141);
                C0483Hc frame = this.A0D;
                bw.ADP(frame.A00, 0, 3);
                C0483Hc frame2 = this.A0D;
                frame2.A0Y(0);
                BZ bz = this.A0A;
                C0483Hc frame3 = this.A0D;
                bz.A04(frame3.A0G());
            }
            bw.AFJ(this.A0C.A02);
            if (A01 != null && !A01.A8v() && xingBase == A0H) {
                return A02(bw);
            }
            return A01;
        } else if (xingBase == A0I) {
            DE A00 = DE.A00(bw.A70(), bw.A7P(), this.A0C, c0483Hc);
            bw.AFJ(this.A0C.A02);
            return A00;
        } else {
            bw.AES();
            return null;
        }
    }

    public static boolean A06(int i, long j) {
        return ((long) ((-128000) & i)) == ((-128000) & j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x009f, code lost:
        if (r15 == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x00a1, code lost:
        r14.AFJ(r2 + r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x00a5, code lost:
        r13.A01 = r7;
        r2 = com.facebook.ads.redexgen.X.WF.A0F;
        r1 = r2[2];
        r2 = r2[7];
        r1 = r1.charAt(28);
        r0 = r2.charAt(28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x00b9, code lost:
        if (r1 == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x00bb, code lost:
        com.facebook.ads.redexgen.X.WF.A0F[0] = "JRrUIGwZBJczcB1fqhgNVGoVSbza2n0c";
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x00c2, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x00c3, code lost:
        r14.AES();
     */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A07(com.facebook.ads.redexgen.X.BW r14, boolean r15) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.WF.A07(com.facebook.ads.redexgen.X.BW, boolean):boolean");
    }

    @Override // com.facebook.ads.redexgen.X.BV
    public final void A8V(BX bx) {
        this.A04 = bx;
        this.A05 = this.A04.AFc(0, 1);
        this.A04.A5G();
    }

    @Override // com.facebook.ads.redexgen.X.BV
    public final int ADp(BW bw, C0346Bc c0346Bc) throws IOException, InterruptedException {
        if (this.A01 == 0) {
            try {
                A07(bw, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.A06 == null) {
            this.A06 = A03(bw);
            WG wg = this.A06;
            if (wg == null || (!wg.A8v() && (this.A08 & 1) != 0)) {
                this.A06 = A02(bw);
            }
            this.A04.AEd(this.A06);
            this.A05.A5X(Format.A05(null, this.A0C.A06, null, -1, 4096, this.A0C.A01, this.A0C.A03, -1, this.A0A.A00, this.A0A.A01, null, null, 0, null, (this.A08 & 2) != 0 ? null : this.A07));
        }
        return A00(bw);
    }

    @Override // com.facebook.ads.redexgen.X.BV
    public final void AEc(long j, long j2) {
        this.A01 = 0;
        this.A02 = -9223372036854775807L;
        this.A03 = 0L;
        this.A00 = 0;
    }

    @Override // com.facebook.ads.redexgen.X.BV
    public final boolean AFL(BW bw) throws IOException, InterruptedException {
        return A07(bw, true);
    }
}
