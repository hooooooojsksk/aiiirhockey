package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray;
import java.io.IOException;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: assets/audience_network.dex */
public final class BS implements VA, VB {
    public static String[] A06 = {"ZtwyXb21lqsDJdKT2ajh9JxAXgW69QuB", "FrcJuXyaSLrnc8pAXv2TAxnFyZgF4qHK", "0iGJizGlWH9", "qhteMkWWDojgH5n0mIn7zojGTGtfRfRL", "S4vRLIoihFPQ", "xoDrhUfozcoi1lbYtymgci4hovtTAG3t", "yhmtadr4WKeMx7Xbvtz69UkymvwaYHjB", "iiLQKF6aVsd0mv8Gzt0Boeru5TAZQ446"};
    public long A00;
    public long A01;
    public long A02;
    public VB A03;
    public VG[] A04 = new VG[0];
    public final VA A05;

    public BS(VA va, boolean z, long j, long j2) {
        this.A05 = va;
        this.A02 = z ? j : -9223372036854775807L;
        this.A01 = j;
        this.A00 = j2;
    }

    private C03119q A00(long j, C03119q c03119q) {
        long toleranceBeforeUs = C0499Hs.A0E(c03119q.A01, 0L, j - this.A01);
        long j2 = c03119q.A00;
        long j3 = this.A00;
        long A0E = C0499Hs.A0E(j2, 0L, j3 == Long.MIN_VALUE ? LongCompanionObject.MAX_VALUE : j3 - j);
        if (toleranceBeforeUs == c03119q.A01 && A0E == c03119q.A00) {
            return c03119q;
        }
        return new C03119q(toleranceBeforeUs, A0E);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0422Ep
    /* renamed from: A01 */
    public final void AAc(VA va) {
        this.A03.AAc(this);
    }

    public static boolean A02(long j, GJ[] gjArr) {
        if (j != 0) {
            for (GJ gj : gjArr) {
                if (gj != null && !HV.A09(gj.A7b().A0O)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean A03() {
        return this.A02 != -9223372036854775807L;
    }

    @Override // com.facebook.ads.redexgen.X.VA
    public final boolean A4D(long j) {
        return this.A05.A4D(j);
    }

    @Override // com.facebook.ads.redexgen.X.VA
    public final void A4s(long j, boolean z) {
        this.A05.A4s(j, z);
    }

    @Override // com.facebook.ads.redexgen.X.VA
    public final long A5g(long j, C03119q c03119q) {
        long j2 = this.A01;
        if (j == j2) {
            return j2;
        }
        return this.A05.A5g(j, A00(j, c03119q));
    }

    @Override // com.facebook.ads.redexgen.X.VA
    public final long A5w() {
        long A5w = this.A05.A5w();
        if (A5w != Long.MIN_VALUE) {
            long j = this.A00;
            if (j != Long.MIN_VALUE) {
                int i = (A5w > j ? 1 : (A5w == j ? 0 : -1));
                if (A06[2].length() == 17) {
                    throw new RuntimeException();
                }
                A06[5] = "DtDan6JMsc2D9dL8KrRs9GVt0cLu7T4O";
                if (i >= 0) {
                }
            }
            return A5w;
        }
        return Long.MIN_VALUE;
    }

    @Override // com.facebook.ads.redexgen.X.VA
    public final long A7B() {
        long A7B = this.A05.A7B();
        if (A7B != Long.MIN_VALUE) {
            long j = this.A00;
            if (j == Long.MIN_VALUE || A7B < j) {
                return A7B;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.facebook.ads.redexgen.X.VA
    public final TrackGroupArray A7t() {
        return this.A05.A7t();
    }

    @Override // com.facebook.ads.redexgen.X.VA
    public final void A9k() throws IOException {
        this.A05.A9k();
    }

    @Override // com.facebook.ads.redexgen.X.VB
    public final void AC9(VA va) {
        this.A03.AC9(this);
    }

    @Override // com.facebook.ads.redexgen.X.VA
    public final void ADY(VB vb, long j) {
        this.A03 = vb;
        this.A05.ADY(this, j);
    }

    @Override // com.facebook.ads.redexgen.X.VA
    public final long ADt() {
        if (A03()) {
            long childDiscontinuityUs = this.A02;
            if (A06[4].length() != 12) {
                throw new RuntimeException();
            }
            A06[6] = "LhyfL76jA11YYofpKqTom8Rw5oMGbfG9";
            this.A02 = -9223372036854775807L;
            long initialDiscontinuityUs = ADt();
            return initialDiscontinuityUs != -9223372036854775807L ? initialDiscontinuityUs : childDiscontinuityUs;
        }
        long ADt = this.A05.ADt();
        if (ADt == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z = true;
        HD.A04(ADt >= this.A01);
        long discontinuityUs = this.A00;
        if (discontinuityUs != Long.MIN_VALUE && ADt > discontinuityUs) {
            z = false;
        }
        HD.A04(z);
        return ADt;
    }

    @Override // com.facebook.ads.redexgen.X.VA
    public final void AE0(long j) {
        this.A05.AE0(j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x004e, code lost:
        if (r3 <= 0) goto L25;
     */
    @Override // com.facebook.ads.redexgen.X.VA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long AEg(long r10) {
        /*
            r9 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r9.A02 = r0
            com.facebook.ads.redexgen.X.VG[] r3 = r9.A04
            int r2 = r3.length
            r8 = 0
            r1 = 0
        Lc:
            if (r1 >= r2) goto L18
            r0 = r3[r1]
            if (r0 == 0) goto L15
            r0.A00()
        L15:
            int r1 = r1 + 1
            goto Lc
        L18:
            com.facebook.ads.redexgen.X.VA r0 = r9.A05
            long r6 = r0.AEg(r10)
            int r0 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r0 == 0) goto L50
            long r1 = r9.A01
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 < 0) goto L51
            long r4 = r9.A00
            r1 = -9223372036854775808
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L50
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.BS.A06
            r0 = 0
            r1 = r1[r0]
            r0 = 28
            char r1 = r1.charAt(r0)
            r0 = 57
            if (r1 == r0) goto L47
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L47:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.BS.A06
            java.lang.String r1 = "Q"
            r0 = 2
            r2[r0] = r1
            if (r3 > 0) goto L51
        L50:
            r8 = 1
        L51:
            com.facebook.ads.redexgen.X.HD.A04(r8)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.BS.AEg(long):long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x005b, code lost:
        if (r7 > r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:65:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0065  */
    @Override // com.facebook.ads.redexgen.X.VA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long AEh(com.facebook.ads.redexgen.X.GJ[] r16, boolean[] r17, com.facebook.ads.redexgen.X.InterfaceC0421Eo[] r18, boolean[] r19, long r20) {
        /*
            r15 = this;
            r4 = r18
            int r0 = r4.length
            com.facebook.ads.redexgen.X.VG[] r0 = new com.facebook.ads.redexgen.X.VG[r0]
            r15.A04 = r0
            int r0 = r4.length
            com.facebook.ads.redexgen.X.Eo[] r11 = new com.facebook.ads.redexgen.X.InterfaceC0421Eo[r0]
            r2 = 0
        Lb:
            int r0 = r4.length
            r3 = 0
            if (r2 >= r0) goto L24
            com.facebook.ads.redexgen.X.VG[] r1 = r15.A04
            r0 = r4[r2]
            com.facebook.ads.redexgen.X.VG r0 = (com.facebook.ads.redexgen.X.VG) r0
            r1[r2] = r0
            r0 = r1[r2]
            if (r0 == 0) goto L1f
            r0 = r1[r2]
            com.facebook.ads.redexgen.X.Eo r3 = r0.A01
        L1f:
            r11[r2] = r3
            int r2 = r2 + 1
            goto Lb
        L24:
            com.facebook.ads.redexgen.X.VA r8 = r15.A05
            r9 = r16
            r10 = r17
            r12 = r19
            r13 = r20
            long r7 = r8.AEh(r9, r10, r11, r12, r13)
            boolean r0 = r15.A03()
            if (r0 == 0) goto L92
            long r0 = r15.A01
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 != 0) goto L92
            boolean r0 = A02(r0, r9)
            if (r0 == 0) goto L92
            r0 = r7
        L45:
            r15.A02 = r0
            int r0 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r0 == 0) goto L5d
            long r1 = r15.A01
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 < 0) goto L90
            long r1 = r15.A00
            r5 = -9223372036854775808
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 == 0) goto L5d
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 > 0) goto L90
        L5d:
            r0 = 1
        L5e:
            com.facebook.ads.redexgen.X.HD.A04(r0)
            r5 = 0
        L62:
            int r0 = r4.length
            if (r5 >= r0) goto L98
            r0 = r11[r5]
            if (r0 != 0) goto L76
            com.facebook.ads.redexgen.X.VG[] r0 = r15.A04
            r0[r5] = r3
        L6d:
            com.facebook.ads.redexgen.X.VG[] r0 = r15.A04
            r0 = r0[r5]
            r4[r5] = r0
            int r5 = r5 + 1
            goto L62
        L76:
            r0 = r4[r5]
            if (r0 == 0) goto L84
            com.facebook.ads.redexgen.X.VG[] r0 = r15.A04
            r0 = r0[r5]
            com.facebook.ads.redexgen.X.Eo r1 = r0.A01
            r0 = r11[r5]
            if (r1 == r0) goto L6d
        L84:
            com.facebook.ads.redexgen.X.VG[] r2 = r15.A04
            r1 = r11[r5]
            com.facebook.ads.redexgen.X.VG r0 = new com.facebook.ads.redexgen.X.VG
            r0.<init>(r15, r1)
            r2[r5] = r0
            goto L6d
        L90:
            r0 = 0
            goto L5e
        L92:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L45
        L98:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.BS.AEh(com.facebook.ads.redexgen.X.GJ[], boolean[], com.facebook.ads.redexgen.X.Eo[], boolean[], long):long");
    }
}
