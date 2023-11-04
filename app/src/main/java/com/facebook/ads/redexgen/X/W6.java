package com.facebook.ads.redexgen.X;

import android.support.v4.media.session.PlaybackStateCompat;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata;
import com.mobirix.airhockey.airhockey;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: assets/audience_network.dex */
public final class W6 implements BV, InterfaceC0348Be {
    public static byte[] A0J;
    public static String[] A0K = {"NMENm2VVY4CjFU7qkzTmTxviYk7AnS7Z", "JBVFfjWytxpjUnZZ6lInsU7tzfFzOPaX", "YaevPinMBRqhVFzNm59vwI8bFO4cI8AD", "52TqclTutshaaFkrwJ4nyJTeA2xWvRpu", "JGseDZtum4mqdbq3nSxMUnsGXrSMUYmk", "xuKwDkc3QqvJvTm3i1k9vAbPWWVSjov2", "2GdyUNwnHd6eSNq3THJOdF5Wjs3u7UdX", "VVA8bJ0ju0kVaqoWpNH4VPWsYewebzZE"};
    public static final BY A0L;
    public static final int A0M;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public BX A09;
    public C0483Hc A0A;
    public boolean A0B;
    public CB[] A0C;
    public long[][] A0D;
    public final int A0E;
    public final C0483Hc A0F;
    public final C0483Hc A0G;
    public final C0483Hc A0H;
    public final ArrayDeque<WE> A0I;

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0J, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 32);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A0J = new byte[]{airhockey.J_GAME_ENEMYEXIT, 94, airhockey.P_GAME_STANDBY, airhockey.P_GAME_MYWIN, 10, 89, airhockey.P_GAME_MYSCORE, 80, 79, 10, airhockey.P_GAME_BREAKBALLCOUNT, 79, 89, 89, 10, 94, airhockey.P_NATION, 75, airhockey.P_GAME_SELECTMAP, 10, airhockey.P_NATION, 79, 75, 78, 79, 88, 10, airhockey.P_GAME_BREAKBALLCOUNT, 79, airhockey.P_GAME_SELECTMAP, 77, 94, airhockey.P_NATION, 10, 2, 95, airhockey.P_GAME_SELECTMAP, 89, 95, 90, 90, airhockey.P_GAME_STANDBY, 88, 94, 79, 78, 3, 4, airhockey.J_ENEMYLOSE, 109, 57, 57};
    }

    static {
        A07();
        A0L = new W7();
        A0M = C0499Hs.A08(A04(48, 4, 57));
    }

    public W6() {
        this(0);
    }

    public W6(int i) {
        this.A0E = i;
        this.A0F = new C0483Hc(16);
        this.A0I = new ArrayDeque<>();
        this.A0H = new C0483Hc(HY.A03);
        this.A0G = new C0483Hc(4);
        this.A06 = -1;
    }

    private int A00(long j) {
        long sampleAccumulatedBytes = LongCompanionObject.MAX_VALUE;
        int i = 1;
        int i2 = -1;
        long j2 = LongCompanionObject.MAX_VALUE;
        long j3 = LongCompanionObject.MAX_VALUE;
        int trackIndex = 1;
        int minAccumulatedBytesTrackIndex = -1;
        int i3 = 0;
        while (true) {
            CB[] cbArr = this.A0C;
            if (i3 < cbArr.length) {
                CB cb = cbArr[i3];
                int i4 = cb.A00;
                if (i4 != cb.A03.A01) {
                    long j4 = cb.A03.A06[i4];
                    String[] strArr = A0K;
                    if (strArr[2].charAt(0) == strArr[4].charAt(0)) {
                        throw new RuntimeException();
                    }
                    A0K[7] = "SNUxNBsUQVazn7VwiZNUPsjETt3vlrb9";
                    long j5 = this.A0D[i3][i4];
                    long j6 = j4 - j;
                    int i5 = (j6 < 0 || j6 >= PlaybackStateCompat.ACTION_SET_REPEAT_MODE) ? 1 : 0;
                    if ((i5 == 0 && i != 0) || (i5 == i && j6 < sampleAccumulatedBytes)) {
                        i = i5;
                        sampleAccumulatedBytes = j6;
                        i2 = i3;
                        j2 = j5;
                    }
                    if (j5 < j3) {
                        j3 = j5;
                        trackIndex = i5;
                        minAccumulatedBytesTrackIndex = i3;
                    }
                }
                i3++;
            } else if (j3 == LongCompanionObject.MAX_VALUE || trackIndex == 0) {
                return i2;
            } else {
                long preferredSkipAmount = 10485760 + j3;
                if (j2 < preferredSkipAmount) {
                    return i2;
                }
                return minAccumulatedBytesTrackIndex;
            }
        }
    }

    private int A01(BW bw, C0346Bc c0346Bc) throws IOException, InterruptedException {
        int i;
        long A7P = bw.A7P();
        if (this.A06 == -1) {
            this.A06 = A00(A7P);
            if (this.A06 == -1) {
                return -1;
            }
        }
        CB cb = this.A0C[this.A06];
        InterfaceC0351Bh trackOutput = cb.A01;
        int i2 = cb.A00;
        long j = cb.A03.A06[i2];
        int i3 = cb.A03.A05[i2];
        long j2 = (j - A7P) + this.A04;
        if (j2 < 0 || j2 >= PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
            c0346Bc.A00 = j;
            return 1;
        }
        if (cb.A02.A02 == 1) {
            j2 += 8;
            i3 -= 8;
        }
        bw.AFJ((int) j2);
        int sampleSize = cb.A02.A01;
        String[] strArr = A0K;
        if (strArr[5].charAt(6) != strArr[3].charAt(6)) {
            String[] strArr2 = A0K;
            strArr2[2] = "Kr0RNkXRcq3MKFcdyeDViEL730qvS1Or";
            strArr2[4] = "dsHpYadjIesMKkl8nKWo5Xy2zI1EHMvq";
            if (sampleSize != 0) {
                byte[] bArr = this.A0G.A00;
                bArr[0] = 0;
                bArr[1] = 0;
                bArr[2] = 0;
                int nalUnitLengthFieldLength = cb.A02.A01;
                int i4 = 4 - cb.A02.A01;
                while (this.A04 < i3) {
                    int i5 = this.A05;
                    if (i5 == 0) {
                        bw.readFully(this.A0G.A00, i4, nalUnitLengthFieldLength);
                        this.A0G.A0Y(0);
                        this.A05 = this.A0G.A0H();
                        this.A0H.A0Y(0);
                        trackOutput.AEX(this.A0H, 4);
                        this.A04 += 4;
                        i3 += i4;
                    } else {
                        int AEW = trackOutput.AEW(bw, i5, false);
                        this.A04 += AEW;
                        this.A05 -= AEW;
                    }
                }
                i = 0;
            } else {
                while (true) {
                    int i6 = this.A04;
                    if (i6 >= i3) {
                        break;
                    }
                    int AEW2 = trackOutput.AEW(bw, i3 - i6, false);
                    this.A04 += AEW2;
                    this.A05 -= AEW2;
                }
                i = 0;
            }
            long[] jArr = cb.A03.A07;
            String[] strArr3 = A0K;
            if (strArr3[0].charAt(11) != strArr3[1].charAt(11)) {
                A0K[6] = "rOKgrdqhHdXOkXubOIefZGVtdh7cvyNY";
                trackOutput.AEY(jArr[i2], cb.A03.A04[i2], i3, 0, null);
                cb.A00 += 0;
                this.A06 = -1;
                this.A04 = i;
                this.A05 = i;
                return i;
            }
            A0K[6] = "wHchi0wLq1ErSeSpKTFcZRDvkUCQV0RS";
            trackOutput.AEY(jArr[i2], cb.A03.A04[i2], i3, 0, null);
            cb.A00++;
            this.A06 = -1;
            this.A04 = i;
            this.A05 = i;
            return i;
        }
        throw new RuntimeException();
    }

    public static int A02(CK ck, long j) {
        int A00 = ck.A00(j);
        if (A00 == -1) {
            return ck.A01(j);
        }
        return A00;
    }

    public static long A03(CK ck, long j, long j2) {
        int A02 = A02(ck, j);
        if (A02 == -1) {
            return j2;
        }
        long min = Math.min(ck.A06[A02], j2);
        if (A0K[6].charAt(20) != 'b') {
            String[] strArr = A0K;
            strArr[5] = "p3vbyKglgBhvg6ga7RihuDYjPakbSwaT";
            strArr[3] = "aiiDKqFmbgCXZZv8uVJN0mXFbRvDRlE6";
            return min;
        }
        throw new RuntimeException();
    }

    private ArrayList<CK> A05(WE we, BZ bz, boolean z) throws C9Y {
        CH A0C;
        ArrayList<CK> arrayList = new ArrayList<>();
        for (int i = 0; i < we.A01.size(); i++) {
            WE we2 = we.A01.get(i);
            int i2 = ((AbstractC0360Bw) we2).A00;
            if (i2 == AbstractC0360Bw.A1M && (A0C = C1.A0C(we2, we.A07(AbstractC0360Bw.A0o), -9223372036854775807L, null, z, this.A0B)) != null) {
                CK A0E = C1.A0E(A0C, we2.A06(AbstractC0360Bw.A0e).A06(AbstractC0360Bw.A0i).A06(AbstractC0360Bw.A17), bz);
                if (A0E.A01 != 0) {
                    arrayList.add(A0E);
                }
            }
        }
        return arrayList;
    }

    private void A06() {
        this.A03 = 0;
        this.A00 = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0061, code lost:
        if (r5.A03 == 2) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0063, code lost:
        A06();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0066, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A08(long r6) throws com.facebook.ads.redexgen.X.C9Y {
        /*
            r5 = this;
        L0:
            java.util.ArrayDeque<com.facebook.ads.redexgen.X.WE> r0 = r5.A0I
            boolean r4 = r0.isEmpty()
            r3 = 2
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.W6.A0K
            r0 = 7
            r1 = r1[r0]
            r0 = 14
            char r1 = r1.charAt(r0)
            r0 = 114(0x72, float:1.6E-43)
            if (r1 == r0) goto L67
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.W6.A0K
            java.lang.String r1 = "xKK31fned0mjTVppOAxzoNj9viNrlryO"
            r0 = 0
            r2[r0] = r1
            java.lang.String r1 = "3HkC7zoZl6jjTlZPcBHC3lXiUTtQlSXh"
            r0 = 1
            r2[r0] = r1
            if (r4 != 0) goto L5f
            java.util.ArrayDeque<com.facebook.ads.redexgen.X.WE> r0 = r5.A0I
            java.lang.Object r0 = r0.peek()
            com.facebook.ads.redexgen.X.WE r0 = (com.facebook.ads.redexgen.X.WE) r0
            long r1 = r0.A00
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 != 0) goto L5f
            java.util.ArrayDeque<com.facebook.ads.redexgen.X.WE> r0 = r5.A0I
            java.lang.Object r2 = r0.pop()
            com.facebook.ads.redexgen.X.WE r2 = (com.facebook.ads.redexgen.X.WE) r2
            int r1 = r2.A00
            int r0 = com.facebook.ads.redexgen.X.AbstractC0360Bw.A0k
            if (r1 != r0) goto L4b
            r5.A0A(r2)
            java.util.ArrayDeque<com.facebook.ads.redexgen.X.WE> r0 = r5.A0I
            r0.clear()
            r5.A03 = r3
            goto L0
        L4b:
            java.util.ArrayDeque<com.facebook.ads.redexgen.X.WE> r0 = r5.A0I
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L0
            java.util.ArrayDeque<com.facebook.ads.redexgen.X.WE> r0 = r5.A0I
            java.lang.Object r0 = r0.peek()
            com.facebook.ads.redexgen.X.WE r0 = (com.facebook.ads.redexgen.X.WE) r0
            r0.A08(r2)
            goto L0
        L5f:
            int r0 = r5.A03
            if (r0 == r3) goto L66
            r5.A06()
        L66:
            return
        L67:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.W6.A08(long):void");
    }

    private void A09(long j) {
        CB[] cbArr;
        for (CB cb : this.A0C) {
            CK ck = cb.A03;
            int A00 = ck.A00(j);
            if (A00 == -1) {
                A00 = ck.A01(j);
            }
            cb.A00 = A00;
            if (A0K[6].charAt(20) == 'b') {
                throw new RuntimeException();
            }
            String[] strArr = A0K;
            strArr[5] = "MNnvCsSYuz9FkO9KQczdYnABN7zTLwyu";
            strArr[3] = "oflUn1lXrJVPIzwz3GYNJmaWxDOTuoWv";
        }
    }

    private void A0A(WE we) throws C9Y {
        ArrayList<CK> A05;
        int trackCount = -1;
        long j = -9223372036854775807L;
        ArrayList arrayList = new ArrayList();
        Metadata metadata = null;
        BZ bz = new BZ();
        WD A07 = we.A07(AbstractC0360Bw.A1Q);
        if (A07 != null && (metadata = C1.A0F(A07, this.A0B)) != null) {
            bz.A05(metadata);
        }
        try {
            A05 = A05(we, bz, (this.A0E & 1) != 0);
        } catch (WA unused) {
            bz = new BZ();
            A05 = A05(we, bz, true);
        }
        int size = A05.size();
        for (int i = 0; i < size; i++) {
            CK ck = A05.get(i);
            CH ch = ck.A03;
            CB cb = new CB(ch, ck, this.A09.AFc(i, ch.A03));
            Format A0F = ch.A07.A0F(ck.A00 + 30);
            if (ch.A03 == 1) {
                if (bz.A03()) {
                    A0F = A0F.A0G(bz.A00, bz.A01);
                }
                if (metadata != null) {
                    A0F = A0F.A0J(metadata);
                }
            }
            cb.A01.A5X(A0F);
            j = Math.max(j, ch.A04 != -9223372036854775807L ? ch.A04 : ck.A02);
            if (ch.A03 == 2 && trackCount == -1) {
                trackCount = arrayList.size();
            }
            arrayList.add(cb);
        }
        this.A02 = trackCount;
        this.A08 = j;
        this.A0C = (CB[]) arrayList.toArray(new CB[arrayList.size()]);
        this.A0D = A0G(this.A0C);
        this.A09.A5G();
        this.A09.AEd(this);
    }

    public static boolean A0B(int i) {
        return i == AbstractC0360Bw.A0k || i == AbstractC0360Bw.A1M || i == AbstractC0360Bw.A0e || i == AbstractC0360Bw.A0i || i == AbstractC0360Bw.A17 || i == AbstractC0360Bw.A0O;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0054, code lost:
        if (r4 != r3) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0058, code lost:
        if (r4 == com.facebook.ads.redexgen.X.AbstractC0360Bw.A0P) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x005c, code lost:
        if (r4 == com.facebook.ads.redexgen.X.AbstractC0360Bw.A1A) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0060, code lost:
        if (r4 == com.facebook.ads.redexgen.X.AbstractC0360Bw.A1D) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0064, code lost:
        if (r4 == com.facebook.ads.redexgen.X.AbstractC0360Bw.A1F) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0068, code lost:
        if (r4 == com.facebook.ads.redexgen.X.AbstractC0360Bw.A18) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x006c, code lost:
        if (r4 == com.facebook.ads.redexgen.X.AbstractC0360Bw.A0C) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0070, code lost:
        if (r4 == com.facebook.ads.redexgen.X.AbstractC0360Bw.A1K) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0074, code lost:
        if (r4 == com.facebook.ads.redexgen.X.AbstractC0360Bw.A0V) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0078, code lost:
        if (r4 != com.facebook.ads.redexgen.X.AbstractC0360Bw.A1Q) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x007c, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0085, code lost:
        if (r4 != r3) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0C(int r4) {
        /*
            int r0 = com.facebook.ads.redexgen.X.AbstractC0360Bw.A0d
            if (r4 == r0) goto L7a
            int r0 = com.facebook.ads.redexgen.X.AbstractC0360Bw.A0o
            if (r4 == r0) goto L7a
            int r3 = com.facebook.ads.redexgen.X.AbstractC0360Bw.A0W
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.W6.A0K
            r0 = 2
            r1 = r2[r0]
            r0 = 4
            r2 = r2[r0]
            r0 = 0
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L88
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.W6.A0K
            java.lang.String r1 = "Lbfp0NvNFR61AEm901fhAiQEZdUAojSN"
            r0 = 7
            r2[r0] = r1
            if (r4 == r3) goto L7a
            int r0 = com.facebook.ads.redexgen.X.AbstractC0360Bw.A1B
            if (r4 == r0) goto L7a
            int r0 = com.facebook.ads.redexgen.X.AbstractC0360Bw.A1E
            if (r4 == r0) goto L7a
            int r0 = com.facebook.ads.redexgen.X.AbstractC0360Bw.A1C
            if (r4 == r0) goto L7a
            int r3 = com.facebook.ads.redexgen.X.AbstractC0360Bw.A0D
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.W6.A0K
            r0 = 0
            r1 = r2[r0]
            r0 = 1
            r2 = r2[r0]
            r0 = 11
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L7e
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.W6.A0K
            java.lang.String r1 = "AcWpjtb96ZMDu8ZbPmw7y3S9ldwHNTMG"
            r0 = 2
            r2[r0] = r1
            java.lang.String r1 = "liNDCAzQcSMqwn5YpITrjlM20opaDBZf"
            r0 = 4
            r2[r0] = r1
            if (r4 == r3) goto L7a
        L56:
            int r0 = com.facebook.ads.redexgen.X.AbstractC0360Bw.A0P
            if (r4 == r0) goto L7a
            int r0 = com.facebook.ads.redexgen.X.AbstractC0360Bw.A1A
            if (r4 == r0) goto L7a
            int r0 = com.facebook.ads.redexgen.X.AbstractC0360Bw.A1D
            if (r4 == r0) goto L7a
            int r0 = com.facebook.ads.redexgen.X.AbstractC0360Bw.A1F
            if (r4 == r0) goto L7a
            int r0 = com.facebook.ads.redexgen.X.AbstractC0360Bw.A18
            if (r4 == r0) goto L7a
            int r0 = com.facebook.ads.redexgen.X.AbstractC0360Bw.A0C
            if (r4 == r0) goto L7a
            int r0 = com.facebook.ads.redexgen.X.AbstractC0360Bw.A1K
            if (r4 == r0) goto L7a
            int r0 = com.facebook.ads.redexgen.X.AbstractC0360Bw.A0V
            if (r4 == r0) goto L7a
            int r0 = com.facebook.ads.redexgen.X.AbstractC0360Bw.A1Q
            if (r4 != r0) goto L7c
        L7a:
            r0 = 1
        L7b:
            return r0
        L7c:
            r0 = 0
            goto L7b
        L7e:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.W6.A0K
            java.lang.String r1 = "Et4fiiNPrE1ktHaAFcacRxoSMiMckR7G"
            r0 = 6
            r2[r0] = r1
            if (r4 == r3) goto L7a
            goto L56
        L88:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.W6.A0C(int):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x012c, code lost:
        r11.A07 = (r2 - r12.A7P()) + r11.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0145, code lost:
        if (r8 != 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x012a, code lost:
        if (r8 != 0) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0D(com.facebook.ads.redexgen.X.BW r12) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 343
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.W6.A0D(com.facebook.ads.redexgen.X.BW):boolean");
    }

    private boolean A0E(BW bw, C0346Bc c0346Bc) throws IOException, InterruptedException {
        long j = this.A07 - this.A00;
        long atomEndPosition = bw.A7P() + j;
        boolean z = false;
        C0483Hc c0483Hc = this.A0A;
        if (c0483Hc != null) {
            bw.readFully(c0483Hc.A00, this.A00, (int) j);
            if (this.A01 == AbstractC0360Bw.A0V) {
                this.A0B = A0F(this.A0A);
            } else if (!this.A0I.isEmpty()) {
                this.A0I.peek().A09(new WD(this.A01, this.A0A));
            }
        } else if (j < PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
            bw.AFJ((int) j);
        } else {
            long atomPayloadSize = bw.A7P();
            c0346Bc.A00 = atomPayloadSize + j;
            z = true;
        }
        A08(atomEndPosition);
        return z && this.A03 != 2;
    }

    public static boolean A0F(C0483Hc c0483Hc) {
        int A08;
        int majorBrand;
        c0483Hc.A0Y(8);
        int A082 = c0483Hc.A08();
        int majorBrand2 = A0M;
        if (A082 == majorBrand2) {
            return true;
        }
        c0483Hc.A0Z(4);
        do {
            int A04 = c0483Hc.A04();
            String[] strArr = A0K;
            String str = strArr[0];
            String str2 = strArr[1];
            int charAt = str.charAt(11);
            int majorBrand3 = str2.charAt(11);
            if (charAt != majorBrand3) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0K;
            strArr2[5] = "HZNBHqeXKlwJLRyY4R1ZazClo3jLxgS8";
            strArr2[3] = "ULnGw1bPzwMM6OF7GcjqoSbIBNnkFp5Y";
            if (A04 > 0) {
                A08 = c0483Hc.A08();
                majorBrand = A0M;
            } else {
                return false;
            }
        } while (A08 != majorBrand);
        return true;
    }

    public static long[][] A0G(CB[] cbArr) {
        long[][] jArr = new long[cbArr.length];
        int[] iArr = new int[cbArr.length];
        long[] jArr2 = new long[cbArr.length];
        boolean[] tracksFinished = new boolean[cbArr.length];
        for (int i = 0; i < cbArr.length; i++) {
            jArr[i] = new long[cbArr[i].A03.A01];
            jArr2[i] = cbArr[i].A03.A07[0];
        }
        long j = 0;
        int i2 = 0;
        while (true) {
            int length = cbArr.length;
            String[] strArr = A0K;
            if (strArr[0].charAt(11) != strArr[1].charAt(11)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0K;
            strArr2[5] = "yJ2jD62HfH2jQTY3DSfm8DixkPqWTM6R";
            strArr2[3] = "ERCQlGdy7dAXpXma9fK0CLCiAFSx2az3";
            if (i2 < length) {
                long j2 = LongCompanionObject.MAX_VALUE;
                int minTimeTrackIndex = -1;
                for (int i3 = 0; i3 < cbArr.length; i3++) {
                    if (!tracksFinished[i3]) {
                        long minTimeUs = jArr2[i3];
                        if (minTimeUs <= j2) {
                            minTimeTrackIndex = i3;
                            j2 = jArr2[i3];
                        }
                    }
                }
                int i4 = iArr[minTimeTrackIndex];
                jArr[minTimeTrackIndex][i4] = j;
                j += cbArr[minTimeTrackIndex].A03.A05[i4];
                int i5 = i4 + 1;
                iArr[minTimeTrackIndex] = i5;
                if (i5 < jArr[minTimeTrackIndex].length) {
                    jArr2[minTimeTrackIndex] = cbArr[minTimeTrackIndex].A03.A07[i5];
                } else {
                    tracksFinished[minTimeTrackIndex] = true;
                    i2++;
                }
            } else {
                return jArr;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0348Be
    public final long A6Y() {
        return this.A08;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0348Be
    public final C0347Bd A7a(long j) {
        long j2;
        long j3;
        int A01;
        CB[] cbArr = this.A0C;
        if (cbArr.length == 0) {
            return new C0347Bd(C0349Bf.A03);
        }
        long j4 = -9223372036854775807L;
        long j5 = -1;
        int i = this.A02;
        if (i != -1) {
            CK ck = cbArr[i].A03;
            int A02 = A02(ck, j);
            if (A02 == -1) {
                return new C0347Bd(C0349Bf.A03);
            }
            j2 = ck.A07[A02];
            j3 = ck.A06[A02];
            if (j2 < j && A02 < ck.A01 - 1 && (A01 = ck.A01(j)) != -1 && A01 != A02) {
                j4 = ck.A07[A01];
                j5 = ck.A06[A01];
            }
        } else {
            j2 = j;
            j3 = LongCompanionObject.MAX_VALUE;
        }
        int secondSampleIndex = 0;
        while (true) {
            CB[] cbArr2 = this.A0C;
            if (secondSampleIndex >= cbArr2.length) {
                break;
            }
            if (secondSampleIndex != this.A02) {
                CK ck2 = cbArr2[secondSampleIndex].A03;
                j3 = A03(ck2, j2, j3);
                if (j4 != -9223372036854775807L) {
                    j5 = A03(ck2, j4, j5);
                }
            }
            secondSampleIndex++;
        }
        C0349Bf c0349Bf = new C0349Bf(j2, j3);
        if (j4 == -9223372036854775807L) {
            return new C0347Bd(c0349Bf);
        }
        return new C0347Bd(c0349Bf, new C0349Bf(j4, j5));
    }

    @Override // com.facebook.ads.redexgen.X.BV
    public final void A8V(BX bx) {
        this.A09 = bx;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0348Be
    public final boolean A8v() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.BV
    public final int ADp(BW bw, C0346Bc c0346Bc) throws IOException, InterruptedException {
        while (true) {
            int i = this.A03;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        return A01(bw, c0346Bc);
                    }
                    throw new IllegalStateException();
                } else if (A0E(bw, c0346Bc)) {
                    return 1;
                }
            } else if (!A0D(bw)) {
                return -1;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.BV
    public final void AEc(long j, long j2) {
        this.A0I.clear();
        this.A00 = 0;
        this.A06 = -1;
        this.A04 = 0;
        this.A05 = 0;
        if (j == 0) {
            A06();
        } else if (this.A0C == null) {
        } else {
            A09(j2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.BV
    public final boolean AFL(BW bw) throws IOException, InterruptedException {
        return CF.A04(bw);
    }
}
