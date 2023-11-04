package com.facebook.ads.redexgen.X;

import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData;
import com.mobirix.airhockey.airhockey;
import cz.msebera.android.httpclient.HttpStatus;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: assets/audience_network.dex */
public final class W8 implements BV {
    public static byte[] A0X;
    public static String[] A0Y = {"XdJWu", "FUlE3E4RGCFuY0n1jkLa4sDNStY", "LTfWg4MeBgD", "ea2mTe", "5aN4xnjUR54", "JRDUjTwIRED0cdRjG5ryaKaac6vLzQ8c", "s80pf3iUB", "VFz"};
    public static final BY A0Z;
    public static final int A0a;
    public static final Format A0b;
    public static final byte[] A0c;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public BX A0C;
    public C8 A0D;
    public C0483Hc A0E;
    public boolean A0F;
    public boolean A0G;
    public InterfaceC0351Bh[] A0H;
    public InterfaceC0351Bh[] A0I;
    public final int A0J;
    public final SparseArray<C8> A0K;
    @Nullable
    public final DrmInitData A0L;
    @Nullable
    public final InterfaceC0351Bh A0M;
    @Nullable
    public final CH A0N;
    public final C0483Hc A0O;
    public final C0483Hc A0P;
    public final C0483Hc A0Q;
    public final C0483Hc A0R;
    @Nullable
    public final C0495Ho A0S;
    public final ArrayDeque<WE> A0T;
    public final ArrayDeque<C7> A0U;
    public final List<Format> A0V;
    public final byte[] A0W;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static int A00(C8 c8, int i, long j, int i2, C0483Hc c0483Hc, int i3) {
        int i4;
        int i5 = i3;
        long j2 = j;
        c0483Hc.A0Y(8);
        int A00 = AbstractC0360Bw.A00(c0483Hc.A08());
        CH ch = c8.A05;
        CJ cj = c8.A07;
        C2 c2 = cj.A07;
        cj.A0E[i] = c0483Hc.A0H();
        cj.A0G[i] = cj.A05;
        if ((A00 & 1) != 0) {
            long[] jArr = cj.A0G;
            jArr[i] = jArr[i] + c0483Hc.A08();
        }
        boolean z = (A00 & 4) != 0;
        int i6 = c2.A01;
        if (z) {
            i6 = c0483Hc.A0H();
        }
        boolean z2 = (A00 & 256) != 0;
        boolean z3 = (A00 & 512) != 0;
        boolean z4 = (A00 & 1024) != 0;
        boolean z5 = (A00 & 2048) != 0;
        long j3 = 0;
        if (ch.A08 != null && ch.A08.length == 1 && ch.A08[0] == 0) {
            j3 = C0499Hs.A0F(ch.A09[0], 1000L, ch.A06);
        }
        int[] iArr = cj.A0D;
        int[] iArr2 = cj.A0C;
        long[] jArr2 = cj.A0F;
        boolean[] zArr = cj.A0I;
        boolean z6 = ch.A03 == 2 && (i2 & 1) != 0;
        int i7 = i5 + cj.A0E[i];
        long j4 = ch.A06;
        if (i > 0) {
            j2 = cj.A06;
        }
        while (i5 < i7) {
            int A0H = z2 ? c0483Hc.A0H() : c2.A00;
            if (z3) {
                i4 = c0483Hc.A0H();
            } else {
                i4 = c2.A03;
                if (A0Y[5].charAt(2) == 'C') {
                    throw new RuntimeException();
                }
                A0Y[6] = "dkwnFPd0";
            }
            int A08 = (i5 == 0 && z) ? i6 : z4 ? c0483Hc.A08() : c2.A01;
            if (z5) {
                iArr2[i5] = (int) ((c0483Hc.A08() * 1000) / j4);
            } else {
                iArr2[i5] = 0;
            }
            jArr2[i5] = C0499Hs.A0F(j2, 1000L, j4) - j3;
            iArr[i5] = i4;
            zArr[i5] = ((A08 >> 16) & 1) == 0 && (!z6 || i5 == 0);
            j2 += A0H;
            i5++;
        }
        cj.A06 = j2;
        return i7;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static Pair<Long, WZ> A04(C0483Hc c0483Hc, long j) throws C9Y {
        long A0N;
        long A0N2;
        c0483Hc.A0Y(8);
        int A01 = AbstractC0360Bw.A01(c0483Hc.A08());
        c0483Hc.A0Z(4);
        long A0M = c0483Hc.A0M();
        if (A01 == 0) {
            A0N = c0483Hc.A0M();
            A0N2 = j + c0483Hc.A0M();
        } else {
            A0N = c0483Hc.A0N();
            A0N2 = j + c0483Hc.A0N();
        }
        long A0F = C0499Hs.A0F(A0N, 1000000L, A0M);
        c0483Hc.A0Z(2);
        int A0I = c0483Hc.A0I();
        int[] iArr = new int[A0I];
        long[] jArr = new long[A0I];
        long[] jArr2 = new long[A0I];
        long[] jArr3 = new long[A0I];
        long j2 = A0F;
        for (int i = 0; i < A0I; i++) {
            int A08 = c0483Hc.A08();
            if ((Integer.MIN_VALUE & A08) != 0) {
                throw new C9Y(A0A(581, 28, 126));
            }
            long A0M2 = c0483Hc.A0M();
            iArr[i] = Integer.MAX_VALUE & A08;
            jArr[i] = A0N2;
            jArr3[i] = j2;
            A0N += A0M2;
            j2 = C0499Hs.A0F(A0N, 1000000L, A0M);
            jArr2[i] = j2 - jArr3[i];
            c0483Hc.A0Z(4);
            A0N2 += iArr[i];
        }
        return Pair.create(Long.valueOf(A0F), new WZ(iArr, jArr, jArr2, jArr3));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C8 A09(C0483Hc c0483Hc, SparseArray<C8> sparseArray) {
        c0483Hc.A0Y(8);
        int A00 = AbstractC0360Bw.A00(c0483Hc.A08());
        C8 A08 = A08(sparseArray, c0483Hc.A08());
        if (A08 == null) {
            return null;
        }
        if ((A00 & 1) != 0) {
            long A0N = c0483Hc.A0N();
            A08.A07.A05 = A0N;
            A08.A07.A04 = A0N;
        }
        C2 c2 = A08.A04;
        A08.A07.A07 = new C2((A00 & 2) != 0 ? c0483Hc.A0H() - 1 : c2.A02, (A00 & 8) != 0 ? c0483Hc.A0H() : c2.A00, (A00 & 16) != 0 ? c0483Hc.A0H() : c2.A03, (A00 & 32) != 0 ? c0483Hc.A0H() : c2.A01);
        return A08;
    }

    public static String A0A(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0X, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 103);
        }
        return new String(copyOfRange);
    }

    public static void A0D() {
        A0X = new byte[]{airhockey.J_ERROR, airhockey.J_WAIT, 84, airhockey.J_SDKVER, airhockey.J_PURCHASE, airhockey.J_ACHIEVEMENTCALLBACK, 53, 102, 124, 111, airhockey.J_GOO, 53, airhockey.J_WAIT, airhockey.J_GOO, 102, 102, 53, airhockey.J_SDKVER, 125, airhockey.J_DISCONNECT, 123, 53, 125, airhockey.J_GOO, airhockey.J_DISCONNECT, airhockey.J_BACK, airhockey.J_GOO, airhockey.J_ENEMYWIN, 53, airhockey.J_WAIT, airhockey.J_GOO, 123, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_SDKVER, 125, 53, 61, 96, 123, 102, 96, airhockey.J_GAME_STANDBY, airhockey.J_GAME_STANDBY, airhockey.J_PURCHASE, airhockey.J_ENEMYWIN, airhockey.J_SDKVER, airhockey.J_GOO, airhockey.J_BACK, 60, 59, airhockey.J_SAVEDGAME_RELOAD, 89, airhockey.P_GAME_MYSCORE, airhockey.P_GAME_STANDBY, 78, 23, 84, 88, airhockey.P_NATION, 89, airhockey.P_GAME_MYSCORE, 23, 94, 89, 23, airhockey.P_GAME_SELECTMAP, 85, 80, airhockey.P_GAME_MYWIN, 23, 22, 10, 23, 6, 23, 31, airhockey.P_NATION, 89, airhockey.P_GAME_SELECTMAP, airhockey.P_NATION, airhockey.P_GAME_MYWIN, airhockey.P_GAME_MYWIN, 88, airhockey.P_GAME_STANDBY, airhockey.P_GAME_MYSCORE, 82, 83, 30, 25, 119, 92, airhockey.P_GAME_BREAKBALLCOUNT, 64, 75, 18, 81, 93, airhockey.P_GAME_MYWIN, 92, airhockey.P_GAME_BREAKBALLCOUNT, 18, 91, 92, 18, 65, 85, airhockey.P_NATION, 86, 18, 19, 15, 18, 3, 18, 26, airhockey.P_GAME_MYWIN, 92, 65, airhockey.P_GAME_MYWIN, airhockey.P_NATION, airhockey.P_NATION, 93, 64, airhockey.P_GAME_BREAKBALLCOUNT, 87, 86, 27, 28, 57, 13, 30, 24, 18, 26, 17, 11, 26, 27, 50, 15, 75, 58, 7, 11, 13, 30, 28, 11, 16, 13, 0, 46, 39, 38, 59, 32, 39, 46, airhockey.J_GAME_REMATCH, 39, 44, 46, 40, 61, 32, 63, 44, airhockey.J_GAME_REMATCH, 38, 47, 47, 58, 44, 61, airhockey.J_GAME_REMATCH, 61, 38, airhockey.J_GAME_REMATCH, 58, 40, 36, 57, 37, 44, airhockey.J_GAME_REMATCH, 45, 40, 61, 40, airhockey.J_ENEMYWIN, 51, 26, 30, 25, 95, 30, 11, 16, 18, 95, 27, 26, 25, 22, 17, 26, 12, 95, 26, 7, 11, 26, 17, 27, 26, 27, 95, 30, 11, 16, 18, 95, 12, 22, 5, 26, 95, 87, 10, 17, 12, 10, 15, 15, 16, 13, 11, 26, 27, 86, 81, 30, 55, 51, 52, airhockey.J_SAVEDGAME_RELOAD, 51, 38, 61, 63, airhockey.J_SAVEDGAME_RELOAD, 37, 59, 38, 58, airhockey.J_SAVEDGAME_RELOAD, 62, 55, 60, 53, 38, 58, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_GAME_DISCONNECT, airhockey.J_SAVEDGAME_RELOAD, 96, 99, 102, airhockey.J_GAME_STANDBY, 102, airhockey.J_GAME_EXIT, airhockey.J_SDKVER, airhockey.J_ONREWARDED, 102, airhockey.J_GAME_STANDBY, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_PURCHASE, 39, 60, 33, 39, 34, 34, 61, 32, 38, 55, 54, 123, 124, 63, 22, 29, 20, 7, 27, 83, 30, 26, 0, 30, 18, 7, 16, 27, airhockey.P_GAME_REMATCH, 83, 15, 38, 38, 51, 37, 52, 96, 52, 47, 96, 37, 46, 35, 50, 57, 48, 52, 41, 47, 46, 96, 36, 33, 52, 33, 96, 55, 33, 51, 96, 46, 37, 39, 33, 52, 41, 54, 37, airhockey.J_INVITE, 16, 57, 57, 44, 58, 43, ByteCompanionObject.MAX_VALUE, 43, 48, ByteCompanionObject.MAX_VALUE, 58, 49, 59, ByteCompanionObject.MAX_VALUE, 48, 57, ByteCompanionObject.MAX_VALUE, 50, 59, 62, 43, ByteCompanionObject.MAX_VALUE, 40, 62, 44, ByteCompanionObject.MAX_VALUE, 49, 58, 56, 62, 43, 54, 41, 58, airhockey.J_BACK, airhockey.J_GAME_EXIT, 83, 64, 87, 87, 76, 65, 76, 75, airhockey.P_NATION, 5, airhockey.J_BACK, 87, airhockey.P_GAME_SELECTMAP, airhockey.P_GAME_BREAKBALLCOUNT, 78, 96, 75, airhockey.P_GAME_BREAKBALLCOUNT, 87, 92, 85, 81, 76, airhockey.P_GAME_EXIT, 75, airhockey.J_ENEMYWIN, airhockey.P_GAME_EXIT, 93, 5, 85, airhockey.P_GAME_SELECTMAP, 87, airhockey.P_GAME_SELECTMAP, airhockey.P_GAME_MYLOSE, 64, 81, 64, 87, 86, 5, 76, 86, 5, 80, 75, 86, 80, 85, 85, airhockey.P_GAME_EXIT, 87, 81, 64, 65, 11, 14, 54, 52, 45, 45, 56, 57, 125, 45, 46, 46, 53, 125, 60, 41, 50, 48, 125, airhockey.J_ERROR, 59, 60, 52, 49, 56, 57, 125, 41, 50, 125, 56, 37, 41, 47, 60, 62, 41, 125, 40, 40, 52, 57, airhockey.J_DISCONNECT, 54, 14, 12, 21, 21, 12, 11, 2, airhockey.P_GAME_STANDBY, 4, 17, 10, 8, airhockey.P_GAME_STANDBY, 18, 12, 17, 13, airhockey.P_GAME_STANDBY, 9, 0, 11, 2, 17, 13, airhockey.P_GAME_STANDBY, 91, airhockey.P_GAME_STANDBY, 87, 84, 81, 82, 81, 93, 86, 83, 81, 82, airhockey.P_GAME_STANDBY, 77, 16, 11, 22, 16, 21, 21, 10, 23, 17, 0, 1, 76, 75, 62, 5, 14, 19, 27, 14, 8, 31, 14, 15, 75, 6, 4, 4, 29, 75, 9, 4, 19, airhockey.P_GAME_STANDBY, 13, 54, 61, 32, 40, 61, 59, 44, 61, 60, airhockey.J_ACHIEVEMENTCALLBACK, 43, 57, 49, 55, airhockey.J_ACHIEVEMENTCALLBACK, 61, 54, 44, 42, 33, airhockey.J_ACHIEVEMENTCALLBACK, 59, 55, 45, 54, 44, airhockey.J_NATION, airhockey.J_ACHIEVEMENTCALLBACK, 76, 119, airhockey.J_BACK, airhockey.J_ACHIEVEMENTCALLBACK, 119, 125, airhockey.J_ERROR, 124, 125, 57, airhockey.J_GOO, 119, 125, airhockey.J_GOO, airhockey.J_GAME_ENEMYEXIT, 124, airhockey.J_PURCHASE, 109, 57, airhockey.J_GAME_ENEMYEXIT, 124, ByteCompanionObject.MAX_VALUE, 124, airhockey.J_GAME_ENEMYEXIT, 124, 119, airhockey.J_PURCHASE, 124, 58, 13, 30, 5, 13, 14, 0, 9, 76, 0, 9, 2, 11, 24, 4, 76, 8, 9, 31, 15, 30, 5, 28, 24, 5, 3, 2, 76, 5, 2, 76, 31, 11, 28, 8, 76, 10, 3, 25, 2, 8, 76, airhockey.P_GAME_SELECTMAP, 25, 2, 31, 25, 28, 28, 3, 30, 24, 9, 8, airhockey.P_GAME_STANDBY, 31, 14, 14, 18, 23, 29, 31, 10, 23, 17, 16, 81, 6, 83, 27, 19, 13, 25, 3, 21, 25, 23, 23, 8, 5, 4, 14, 78, 9, 4, 23, 2, 6, 25, 20, 21, 31, 95, 29, 0, airhockey.P_GAME_SELECTMAP};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A0K(WE we) throws C9Y {
        HD.A06(this.A0N == null, A0A(532, 20, 12));
        DrmInitData drmInitData = this.A0L;
        if (drmInitData == null) {
            drmInitData = A05(we.A02);
        }
        WE A06 = we.A06(AbstractC0360Bw.A0n);
        SparseArray<C2> sparseArray = new SparseArray<>();
        long j = -9223372036854775807L;
        int size = A06.A02.size();
        for (int i = 0; i < size; i++) {
            WD wd = A06.A02.get(i);
            if (((AbstractC0360Bw) wd).A00 == AbstractC0360Bw.A1N) {
                Pair<Integer, C2> A03 = A03(wd.A00);
                sparseArray.put(((Integer) A03.first).intValue(), (C2) A03.second);
            } else if (((AbstractC0360Bw) wd).A00 == AbstractC0360Bw.A0g) {
                j = A01(wd.A00);
            }
        }
        SparseArray sparseArray2 = new SparseArray();
        int size2 = we.A01.size();
        for (int i2 = 0; i2 < size2; i2++) {
            WE we2 = we.A01.get(i2);
            if (((AbstractC0360Bw) we2).A00 == AbstractC0360Bw.A1M) {
                CH A0C = C1.A0C(we2, we.A07(AbstractC0360Bw.A0o), j, drmInitData, (this.A0J & 16) != 0, false);
                if (A0C != null) {
                    sparseArray2.put(A0C.A00, A0C);
                }
            }
        }
        int size3 = sparseArray2.size();
        if (this.A0K.size() != 0) {
            HD.A04(this.A0K.size() == size3);
            for (int i3 = 0; i3 < size3; i3++) {
                CH ch = (CH) sparseArray2.valueAt(i3);
                this.A0K.get(ch.A00).A07(ch, A06(sparseArray, ch.A00));
            }
            return;
        }
        for (int i4 = 0; i4 < size3; i4++) {
            CH ch2 = (CH) sparseArray2.valueAt(i4);
            C8 c8 = new C8(this.A0C.AFc(i4, ch2.A03));
            c8.A07(ch2, A06(sparseArray, ch2.A00));
            this.A0K.put(ch2.A00, c8);
            this.A08 = Math.max(this.A08, ch2.A04);
        }
        A0C();
        this.A0C.A5G();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0M(WE we, SparseArray<C8> sparseArray, int i, byte[] bArr) throws C9Y {
        C8 A09 = A09(we.A07(AbstractC0360Bw.A1J).A00, sparseArray);
        if (A09 == null) {
            return;
        }
        CJ cj = A09.A07;
        long j = cj.A06;
        A09.A04();
        if (we.A07(AbstractC0360Bw.A1I) != null && (i & 2) == 0) {
            j = A02(we.A07(AbstractC0360Bw.A1I).A00);
        }
        A0N(we, A09, j, i);
        CI A00 = A09.A05.A00(cj.A07.A02);
        WD A07 = we.A07(AbstractC0360Bw.A0v);
        if (A07 != null) {
            A0P(A00, A07.A00, cj);
        }
        WD A072 = we.A07(AbstractC0360Bw.A0u);
        if (A072 != null) {
            A0S(A072.A00, cj);
        }
        WD A073 = we.A07(AbstractC0360Bw.A11);
        if (A073 != null) {
            A0T(A073.A00, cj);
        }
        WD A074 = we.A07(AbstractC0360Bw.A0y);
        WD A075 = we.A07(AbstractC0360Bw.A12);
        if (A074 != null && A075 != null) {
            A0V(A074.A00, A075.A00, A00 != null ? A00.A02 : null, cj);
        }
        int size = we.A02.size();
        for (int i2 = 0; i2 < size; i2++) {
            WD wd = we.A02.get(i2);
            if (A0Y[7].length() != 3) {
                throw new RuntimeException();
            }
            A0Y[7] = "89j";
            WD wd2 = wd;
            if (((AbstractC0360Bw) wd2).A00 == AbstractC0360Bw.A1R) {
                A0U(wd2.A00, cj, bArr);
            }
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0P(CI ci, C0483Hc c0483Hc, CJ cj) throws C9Y {
        int i = ci.A00;
        c0483Hc.A0Y(8);
        if ((AbstractC0360Bw.A00(c0483Hc.A08()) & 1) == 1) {
            c0483Hc.A0Z(8);
        }
        int A0E = c0483Hc.A0E();
        int A0H = c0483Hc.A0H();
        if (A0H != cj.A00) {
            throw new C9Y(A0A(290, 17, 20) + A0H + A0A(0, 2, 62) + cj.A00);
        }
        int i2 = 0;
        if (A0E == 0) {
            boolean[] zArr = cj.A0H;
            for (int i3 = 0; i3 < A0H; i3++) {
                int A0E2 = c0483Hc.A0E();
                i2 += A0E2;
                zArr[i3] = A0E2 > i;
            }
        } else {
            i2 = 0 + (A0E * A0H);
            Arrays.fill(cj.A0H, 0, A0H, A0E > i);
        }
        cj.A02(i2);
        if (A0Y[6].length() == 17) {
            throw new RuntimeException();
        }
        String[] strArr = A0Y;
        strArr[2] = "tC3WLCXP6DZ";
        strArr[4] = "0Zxl8CEli3D";
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0V(C0483Hc c0483Hc, C0483Hc c0483Hc2, String str, CJ cj) throws C9Y {
        c0483Hc.A0Y(8);
        int A08 = c0483Hc.A08();
        if (c0483Hc.A08() != A0a) {
            return;
        }
        if (AbstractC0360Bw.A01(A08) == 1) {
            c0483Hc.A0Z(4);
        }
        if (c0483Hc.A08() != 1) {
            throw new C9Y(A0A(50, 39, 80));
        }
        c0483Hc2.A0Y(8);
        int A082 = c0483Hc2.A08();
        if (c0483Hc2.A08() != A0a) {
            return;
        }
        int A01 = AbstractC0360Bw.A01(A082);
        if (A01 == 1) {
            if (c0483Hc2.A0M() == 0) {
                throw new C9Y(A0A(609, 55, 11));
            }
        } else if (A01 >= 2) {
            c0483Hc2.A0Z(4);
        }
        if (c0483Hc2.A0M() != 1) {
            throw new C9Y(A0A(89, 39, 85));
        }
        c0483Hc2.A0Z(1);
        int A0E = c0483Hc2.A0E();
        int i = (A0E & 240) >> 4;
        int i2 = A0E & 15;
        boolean z = c0483Hc2.A0E() == 1;
        if (z) {
            int A0E2 = c0483Hc2.A0E();
            byte[] bArr = new byte[16];
            c0483Hc2.A0c(bArr, 0, bArr.length);
            byte[] bArr2 = null;
            if (z && A0E2 == 0) {
                int A0E3 = c0483Hc2.A0E();
                bArr2 = new byte[A0E3];
                c0483Hc2.A0c(bArr2, 0, A0E3);
            }
            cj.A0A = true;
            cj.A08 = new CI(z, str, A0E2, bArr, i, i2, bArr2);
        }
    }

    static {
        A0D();
        A0Z = new W9();
        A0a = C0499Hs.A08(A0A(682, 4, 23));
        A0c = new byte[]{-94, 57, 79, 82, 90, -101, 79, 20, -94, airhockey.P_GAME_SELECTMAP, airhockey.J_GAME_DISCONNECT, airhockey.P_NATION, 124, airhockey.J_ONREWARDED, -115, -12};
        A0b = Format.A02(null, A0A(664, 18, 25), LongCompanionObject.MAX_VALUE);
    }

    public W8() {
        this(0);
    }

    public W8(int i) {
        this(i, null);
    }

    public W8(int i, @Nullable C0495Ho c0495Ho) {
        this(i, c0495Ho, null, null);
    }

    public W8(int i, @Nullable C0495Ho c0495Ho, @Nullable CH ch, @Nullable DrmInitData drmInitData) {
        this(i, c0495Ho, ch, drmInitData, Collections.emptyList());
    }

    public W8(int i, @Nullable C0495Ho c0495Ho, @Nullable CH ch, @Nullable DrmInitData drmInitData, List<Format> closedCaptionFormats) {
        this(i, c0495Ho, ch, drmInitData, closedCaptionFormats, null);
    }

    public W8(int i, @Nullable C0495Ho c0495Ho, @Nullable CH ch, @Nullable DrmInitData drmInitData, List<Format> closedCaptionFormats, @Nullable InterfaceC0351Bh interfaceC0351Bh) {
        this.A0J = (ch != null ? 8 : 0) | i;
        this.A0S = c0495Ho;
        this.A0N = ch;
        this.A0L = drmInitData;
        this.A0V = Collections.unmodifiableList(closedCaptionFormats);
        this.A0M = interfaceC0351Bh;
        this.A0O = new C0483Hc(16);
        this.A0R = new C0483Hc(HY.A03);
        this.A0Q = new C0483Hc(5);
        this.A0P = new C0483Hc();
        this.A0W = new byte[16];
        this.A0T = new ArrayDeque<>();
        this.A0U = new ArrayDeque<>();
        this.A0K = new SparseArray<>();
        this.A08 = -9223372036854775807L;
        this.A0A = -9223372036854775807L;
        this.A0B = -9223372036854775807L;
        A0B();
    }

    public static long A01(C0483Hc c0483Hc) {
        c0483Hc.A0Y(8);
        int fullAtom = c0483Hc.A08();
        return AbstractC0360Bw.A01(fullAtom) == 0 ? c0483Hc.A0M() : c0483Hc.A0N();
    }

    public static long A02(C0483Hc c0483Hc) {
        c0483Hc.A0Y(8);
        int fullAtom = c0483Hc.A08();
        int version = AbstractC0360Bw.A01(fullAtom);
        return version == 1 ? c0483Hc.A0N() : c0483Hc.A0M();
    }

    public static Pair<Integer, C2> A03(C0483Hc c0483Hc) {
        c0483Hc.A0Y(12);
        int defaultSampleDescriptionIndex = c0483Hc.A08();
        int trackId = c0483Hc.A0H();
        int defaultSampleFlags = c0483Hc.A0H();
        int defaultSampleSize = c0483Hc.A0H();
        int defaultSampleDuration = c0483Hc.A08();
        return Pair.create(Integer.valueOf(defaultSampleDescriptionIndex), new C2(trackId - 1, defaultSampleFlags, defaultSampleSize, defaultSampleDuration));
    }

    public static DrmInitData A05(List<WD> list) {
        ArrayList arrayList = null;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            WD wd = list.get(i);
            int leafChildrenSize = ((AbstractC0360Bw) wd).A00;
            if (leafChildrenSize == AbstractC0360Bw.A0s) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = wd.A00.A00;
                UUID A03 = CE.A03(bArr);
                int leafChildrenSize2 = A0Y[3].length();
                if (leafChildrenSize2 != 6) {
                    throw new RuntimeException();
                }
                A0Y[7] = "tzO";
                if (A03 == null) {
                    Log.w(A0A(128, 22, 24), A0A(437, 42, 58));
                } else {
                    arrayList.add(new DrmInitData.SchemeData(A03, A0A(696, 9, 23), bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new DrmInitData(arrayList);
    }

    private C2 A06(SparseArray<C2> sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        return (C2) HD.A01(sparseArray.get(i));
    }

    public static C8 A07(SparseArray<C8> sparseArray) {
        C8 c8 = null;
        long trunOffset = LongCompanionObject.MAX_VALUE;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            C8 valueAt = sparseArray.valueAt(i);
            int i2 = valueAt.A02;
            if (A0Y[1].length() == 5) {
                throw new RuntimeException();
            }
            A0Y[0] = "VXm0n";
            if (i2 != valueAt.A07.A02) {
                long nextTrackRunOffset = valueAt.A07.A0G[valueAt.A02];
                if (nextTrackRunOffset < trunOffset) {
                    c8 = valueAt;
                    trunOffset = nextTrackRunOffset;
                }
            }
        }
        return c8;
    }

    @Nullable
    public static C8 A08(SparseArray<C8> sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        return sparseArray.get(i);
    }

    private void A0B() {
        this.A02 = 0;
        this.A00 = 0;
    }

    /* JADX WARN: Incorrect condition in loop: B:46:0x006e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A0C() {
        /*
            r6 = this;
            com.facebook.ads.redexgen.X.Bh[] r0 = r6.A0I
            if (r0 != 0) goto L48
            r0 = 2
            com.facebook.ads.redexgen.X.Bh[] r0 = new com.facebook.ads.redexgen.X.InterfaceC0351Bh[r0]
            r6.A0I = r0
            r5 = 0
            com.facebook.ads.redexgen.X.Bh r2 = r6.A0M
            if (r2 == 0) goto L15
            com.facebook.ads.redexgen.X.Bh[] r1 = r6.A0I
            int r0 = r5 + 1
            r1[r5] = r2
            r5 = r0
        L15:
            int r0 = r6.A0J
            r4 = 4
            r0 = r0 & r4
            if (r0 == 0) goto L2e
            com.facebook.ads.redexgen.X.Bh[] r3 = r6.A0I
            int r2 = r5 + 1
            com.facebook.ads.redexgen.X.BX r1 = r6.A0C
            android.util.SparseArray<com.facebook.ads.redexgen.X.C8> r0 = r6.A0K
            int r0 = r0.size()
            com.facebook.ads.redexgen.X.Bh r0 = r1.AFc(r0, r4)
            r3[r5] = r0
            r5 = r2
        L2e:
            com.facebook.ads.redexgen.X.Bh[] r0 = r6.A0I
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r5)
            com.facebook.ads.redexgen.X.Bh[] r0 = (com.facebook.ads.redexgen.X.InterfaceC0351Bh[]) r0
            r6.A0I = r0
            com.facebook.ads.redexgen.X.Bh[] r4 = r6.A0I
            int r3 = r4.length
            r2 = 0
        L3c:
            if (r2 >= r3) goto L48
            r1 = r4[r2]
            com.facebook.ads.internal.exoplayer2.thirdparty.Format r0 = com.facebook.ads.redexgen.X.W8.A0b
            r1.A5X(r0)
            int r2 = r2 + 1
            goto L3c
        L48:
            com.facebook.ads.redexgen.X.Bh[] r3 = r6.A0H
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.W8.A0Y
            r0 = 6
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 17
            if (r1 == r0) goto L93
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.W8.A0Y
            java.lang.String r1 = "8HQd7O"
            r0 = 3
            r2[r0] = r1
            if (r3 != 0) goto L92
            java.util.List<com.facebook.ads.internal.exoplayer2.thirdparty.Format> r0 = r6.A0V
            int r0 = r0.size()
            com.facebook.ads.redexgen.X.Bh[] r0 = new com.facebook.ads.redexgen.X.InterfaceC0351Bh[r0]
            r6.A0H = r0
            r3 = 0
        L6b:
            com.facebook.ads.redexgen.X.Bh[] r0 = r6.A0H
            int r0 = r0.length
            if (r3 >= r0) goto L92
            com.facebook.ads.redexgen.X.BX r2 = r6.A0C
            android.util.SparseArray<com.facebook.ads.redexgen.X.C8> r0 = r6.A0K
            int r0 = r0.size()
            int r1 = r0 + 1
            int r1 = r1 + r3
            r0 = 3
            com.facebook.ads.redexgen.X.Bh r1 = r2.AFc(r1, r0)
            java.util.List<com.facebook.ads.internal.exoplayer2.thirdparty.Format> r0 = r6.A0V
            java.lang.Object r0 = r0.get(r3)
            com.facebook.ads.internal.exoplayer2.thirdparty.Format r0 = (com.facebook.ads.internal.exoplayer2.thirdparty.Format) r0
            r1.A5X(r0)
            com.facebook.ads.redexgen.X.Bh[] r0 = r6.A0H
            r0[r3] = r1
            int r3 = r3 + 1
            goto L6b
        L92:
            return
        L93:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.W8.A0C():void");
    }

    private void A0E(long j) {
        while (!this.A0U.isEmpty()) {
            C7 removeFirst = this.A0U.removeFirst();
            this.A03 -= removeFirst.A00;
            long j2 = j + removeFirst.A01;
            C0495Ho c0495Ho = this.A0S;
            if (c0495Ho != null) {
                j2 = c0495Ho.A06(j2);
            }
            InterfaceC0351Bh[] interfaceC0351BhArr = this.A0I;
            if (A0Y[7].length() != 3) {
                throw new RuntimeException();
            }
            A0Y[7] = "ltl";
            for (InterfaceC0351Bh interfaceC0351Bh : interfaceC0351BhArr) {
                interfaceC0351Bh.AEY(j2, 1, removeFirst.A00, this.A03, null);
            }
        }
    }

    private void A0F(long j) throws C9Y {
        while (!this.A0T.isEmpty() && this.A0T.peek().A00 == j) {
            A0I(this.A0T.pop());
        }
        A0B();
    }

    private void A0G(BW bw) throws IOException, InterruptedException {
        int i = ((int) this.A07) - this.A00;
        C0483Hc c0483Hc = this.A0E;
        if (c0483Hc != null) {
            bw.readFully(c0483Hc.A00, 8, i);
            int atomPayloadSize = this.A01;
            A0O(new WD(atomPayloadSize, this.A0E), bw.A7P());
        } else {
            bw.AFJ(i);
        }
        A0F(bw.A7P());
        String[] strArr = A0Y;
        String str = strArr[2];
        String str2 = strArr[4];
        int atomPayloadSize2 = str.length();
        if (atomPayloadSize2 != str2.length()) {
            throw new RuntimeException();
        }
        A0Y[1] = "jmSEpbOdW733bHBoDHkBty1cmj";
    }

    private void A0H(BW bw) throws IOException, InterruptedException {
        C8 c8 = null;
        long j = LongCompanionObject.MAX_VALUE;
        int size = this.A0K.size();
        for (int i = 0; i < size; i++) {
            C8 nextTrackBundle = this.A0K.valueAt(i);
            CJ cj = nextTrackBundle.A07;
            if (cj.A0B && cj.A04 < j) {
                j = cj.A04;
                c8 = this.A0K.valueAt(i);
            }
        }
        if (c8 == null) {
            this.A02 = 3;
            return;
        }
        int A7P = (int) (j - bw.A7P());
        if (A7P >= 0) {
            bw.AFJ(A7P);
            c8.A07.A04(bw);
            return;
        }
        throw new C9Y(A0A(HttpStatus.SC_TEMPORARY_REDIRECT, 39, 39));
    }

    private void A0I(WE we) throws C9Y {
        if (((AbstractC0360Bw) we).A00 == AbstractC0360Bw.A0k) {
            A0K(we);
            return;
        }
        int i = ((AbstractC0360Bw) we).A00;
        int i2 = AbstractC0360Bw.A0j;
        String[] strArr = A0Y;
        if (strArr[2].length() != strArr[4].length()) {
            throw new RuntimeException();
        }
        A0Y[6] = "QeKmRdkmErMZReeQj8";
        if (i == i2) {
            A0J(we);
        } else if (this.A0T.isEmpty()) {
        } else {
            WE peek = this.A0T.peek();
            if (A0Y[6].length() != 17) {
                A0Y[1] = "g8UpS1NyodMZ5eBXtPatKQwsoR";
                peek.A08(we);
                return;
            }
            A0Y[5] = "mkv5is6F5Mu6y6USr0b4mkDGodGLaqlp";
            peek.A08(we);
        }
    }

    private void A0J(WE we) throws C9Y {
        DrmInitData A05;
        A0L(we, this.A0K, this.A0J, this.A0W);
        if (this.A0L != null) {
            A05 = null;
        } else {
            List<WD> list = we.A02;
            int trackCount = A0Y[3].length();
            if (trackCount != 6) {
                throw new RuntimeException();
            }
            String[] strArr = A0Y;
            strArr[2] = "YTpzURZBrt0";
            strArr[4] = "jDJUPBNch9x";
            A05 = A05(list);
        }
        if (A05 != null) {
            int i = this.A0K.size();
            for (int trackCount2 = 0; trackCount2 < i; trackCount2++) {
                this.A0K.valueAt(trackCount2).A06(A05);
            }
        }
        if (this.A0A != -9223372036854775807L) {
            int size = this.A0K.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.A0K.valueAt(i2).A05(this.A0A);
            }
            this.A0A = -9223372036854775807L;
        }
    }

    public static void A0L(WE we, SparseArray<C8> sparseArray, int i, byte[] bArr) throws C9Y {
        int size = we.A01.size();
        for (int i2 = 0; i2 < size; i2++) {
            WE child = we.A01.get(i2);
            int i3 = ((AbstractC0360Bw) child).A00;
            int moofContainerChildrenSize = AbstractC0360Bw.A1L;
            if (i3 == moofContainerChildrenSize) {
                A0M(child, sparseArray, i, bArr);
            }
        }
    }

    public static void A0N(WE we, C8 c8, long j, int totalSampleCount) {
        int i = 0;
        int i2 = 0;
        List<WD> list = we.A02;
        int size = list.size();
        for (int trunSampleCount = 0; trunSampleCount < size; trunSampleCount++) {
            WD wd = list.get(trunSampleCount);
            if (((AbstractC0360Bw) wd).A00 == AbstractC0360Bw.A1O) {
                C0483Hc trunData = wd.A00;
                trunData.A0Y(12);
                int A0H = trunData.A0H();
                if (A0H > 0) {
                    i2 += A0H;
                    i++;
                }
            }
        }
        c8.A02 = 0;
        c8.A00 = 0;
        c8.A01 = 0;
        c8.A07.A03(i, i2);
        int i3 = 0;
        int trunStartPosition = 0;
        for (int i4 = 0; i4 < size; i4++) {
            WD wd2 = list.get(i4);
            int trunIndex = ((AbstractC0360Bw) wd2).A00;
            if (trunIndex == AbstractC0360Bw.A1O) {
                trunStartPosition = A00(c8, i3, j, totalSampleCount, wd2.A00, trunStartPosition);
                i3++;
            }
        }
    }

    private void A0O(WD wd, long j) throws C9Y {
        if (!this.A0T.isEmpty()) {
            this.A0T.peek().A09(wd);
        } else if (((AbstractC0360Bw) wd).A00 == AbstractC0360Bw.A13) {
            Pair<Long, WZ> A04 = A04(wd.A00, j);
            this.A0B = ((Long) A04.first).longValue();
            this.A0C.AEd((InterfaceC0348Be) A04.second);
            this.A0F = true;
        } else if (((AbstractC0360Bw) wd).A00 != AbstractC0360Bw.A0Q) {
        } else {
            A0Q(wd.A00);
        }
    }

    private void A0Q(C0483Hc c0483Hc) {
        InterfaceC0351Bh[] interfaceC0351BhArr;
        InterfaceC0351Bh[] interfaceC0351BhArr2 = this.A0I;
        if (interfaceC0351BhArr2 == null || interfaceC0351BhArr2.length == 0) {
            return;
        }
        c0483Hc.A0Y(12);
        int sampleSize = c0483Hc.A04();
        c0483Hc.A0Q();
        c0483Hc.A0Q();
        long A0M = c0483Hc.A0M();
        long timescale = c0483Hc.A0M();
        long A0F = C0499Hs.A0F(timescale, 1000000L, A0M);
        for (InterfaceC0351Bh interfaceC0351Bh : this.A0I) {
            c0483Hc.A0Y(12);
            interfaceC0351Bh.AEX(c0483Hc, sampleSize);
        }
        long j = this.A0B;
        if (j != -9223372036854775807L) {
            long j2 = j + A0F;
            C0495Ho c0495Ho = this.A0S;
            if (c0495Ho != null) {
                j2 = c0495Ho.A06(j2);
            }
            for (InterfaceC0351Bh interfaceC0351Bh2 : this.A0I) {
                interfaceC0351Bh2.AEY(j2, 1, sampleSize, 0, null);
            }
            return;
        }
        this.A0U.addLast(new C7(A0F, sampleSize));
        this.A03 += sampleSize;
    }

    public static void A0R(C0483Hc c0483Hc, int i, CJ cj) throws C9Y {
        c0483Hc.A0Y(i + 8);
        int fullAtom = c0483Hc.A08();
        int flags = AbstractC0360Bw.A00(fullAtom);
        int fullAtom2 = flags & 1;
        if (fullAtom2 == 0) {
            int fullAtom3 = flags & 2;
            boolean z = fullAtom3 != 0;
            int sampleCount = c0483Hc.A0H();
            int fullAtom4 = cj.A00;
            if (sampleCount == fullAtom4) {
                Arrays.fill(cj.A0H, 0, sampleCount, z);
                int fullAtom5 = c0483Hc.A04();
                cj.A02(fullAtom5);
                cj.A05(c0483Hc);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(A0A(290, 17, 20));
            sb.append(sampleCount);
            sb.append(A0A(0, 2, 62));
            int fullAtom6 = cj.A00;
            sb.append(fullAtom6);
            throw new C9Y(sb.toString());
        }
        throw new C9Y(A0A(381, 56, 66));
    }

    public static void A0S(C0483Hc c0483Hc, CJ cj) throws C9Y {
        c0483Hc.A0Y(8);
        int flags = c0483Hc.A08();
        int fullAtom = AbstractC0360Bw.A00(flags) & 1;
        if (fullAtom == 1) {
            c0483Hc.A0Z(8);
        }
        int A0H = c0483Hc.A0H();
        if (A0H == 1) {
            int entryCount = AbstractC0360Bw.A01(flags);
            cj.A04 += entryCount == 0 ? c0483Hc.A0M() : c0483Hc.A0N();
            return;
        }
        throw new C9Y(A0A(552, 29, 63) + A0H);
    }

    public static void A0T(C0483Hc c0483Hc, CJ cj) throws C9Y {
        A0R(c0483Hc, 0, cj);
    }

    public static void A0U(C0483Hc c0483Hc, CJ cj, byte[] bArr) throws C9Y {
        c0483Hc.A0Y(8);
        c0483Hc.A0c(bArr, 0, 16);
        if (!Arrays.equals(bArr, A0c)) {
            return;
        }
        A0R(c0483Hc, 16, cj);
    }

    public static boolean A0W(int i) {
        return i == AbstractC0360Bw.A0k || i == AbstractC0360Bw.A1M || i == AbstractC0360Bw.A0e || i == AbstractC0360Bw.A0i || i == AbstractC0360Bw.A17 || i == AbstractC0360Bw.A0j || i == AbstractC0360Bw.A1L || i == AbstractC0360Bw.A0n || i == AbstractC0360Bw.A0O;
    }

    public static boolean A0X(int i) {
        if (i != AbstractC0360Bw.A0W && i != AbstractC0360Bw.A0d && i != AbstractC0360Bw.A0o && i != AbstractC0360Bw.A13 && i != AbstractC0360Bw.A1B) {
            int i2 = AbstractC0360Bw.A1I;
            if (A0Y[6].length() != 17) {
                A0Y[0] = "0bfDB";
                if (i != i2 && i != AbstractC0360Bw.A1J && i != AbstractC0360Bw.A1K && i != AbstractC0360Bw.A1N && i != AbstractC0360Bw.A1O && i != AbstractC0360Bw.A0s && i != AbstractC0360Bw.A0v) {
                    int i3 = AbstractC0360Bw.A0u;
                    if (A0Y[1].length() != 5) {
                        A0Y[5] = "GM1eDi9JpLsxcWxFcWWsCjSZthCJdr4f";
                        if (i != i3 && i != AbstractC0360Bw.A11 && i != AbstractC0360Bw.A1R && i != AbstractC0360Bw.A0y && i != AbstractC0360Bw.A12 && i != AbstractC0360Bw.A0P) {
                            int i4 = AbstractC0360Bw.A0g;
                            if (A0Y[3].length() == 6) {
                                A0Y[7] = "Eu3";
                                if (i != i4 && i != AbstractC0360Bw.A0Q) {
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
            throw new RuntimeException();
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x007e, code lost:
        r2 = r11.A7P() - r10.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x008a, code lost:
        if (r10.A01 != com.facebook.ads.redexgen.X.AbstractC0360Bw.A0j) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x008c, code lost:
        r9 = r10.A0K.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0093, code lost:
        if (r8 >= r9) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0095, code lost:
        r0 = r10.A0K.valueAt(r8).A07;
        r0.A03 = r2;
        r0.A04 = r2;
        r0.A05 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x00af, code lost:
        if (com.facebook.ads.redexgen.X.W8.A0Y[3].length() == 6) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x00b1, code lost:
        r7 = com.facebook.ads.redexgen.X.W8.A0Y;
        r7[2] = "tKeeSnEBB5V";
        r7[4] = "1ppH9MP2kpM";
        r8 = r8 + 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x00c0, code lost:
        com.facebook.ads.redexgen.X.W8.A0Y[0] = "GrBVN";
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x00d4, code lost:
        if (r2 >= r8) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x012c, code lost:
        if (r10.A01 != com.facebook.ads.redexgen.X.AbstractC0360Bw.A0c) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x012e, code lost:
        r10.A0D = null;
        r10.A09 = r10.A07 + r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0137, code lost:
        if (r10.A0F != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0139, code lost:
        r10.A0C.AEd(new com.facebook.ads.redexgen.X.WU(r10.A08, r2));
        r10.A0F = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0147, code lost:
        r10.A02 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x014a, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0159, code lost:
        throw new com.facebook.ads.redexgen.X.C9Y(A0A(2, 48, 114));
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0163, code lost:
        if (A0X(r10.A01) == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0165, code lost:
        r3 = r10.A00;
        r2 = com.facebook.ads.redexgen.X.W8.A0Y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0177, code lost:
        if (r2[2].length() == r2[4].length()) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x017f, code lost:
        com.facebook.ads.redexgen.X.W8.A0Y[7] = "6Yw";
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0186, code lost:
        if (r3 != 8) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0188, code lost:
        r2 = r10.A07;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x018c, code lost:
        if (r2 > 2147483647L) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x018e, code lost:
        r10.A0E = new com.facebook.ads.redexgen.X.C0483Hc((int) r2);
        java.lang.System.arraycopy(r10.A0O.A00, 0, r10.A0E.A00, 0, 8);
        r10.A02 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x01a8, code lost:
        if (r10.A07 > 2147483647L) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x01aa, code lost:
        r10.A0E = null;
        r10.A02 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x01b5, code lost:
        if (A0W(r10.A01) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x01b7, code lost:
        r5 = (r11.A7P() + r10.A07) - 8;
        r10.A0T.push(new com.facebook.ads.redexgen.X.WE(r10.A01, r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x01d4, code lost:
        if (r10.A07 != r10.A00) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x01d6, code lost:
        A0F(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x01d9, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x01da, code lost:
        A0B();
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x01ed, code lost:
        throw new com.facebook.ads.redexgen.X.C9Y(A0A(241, 49, 53));
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x01fd, code lost:
        throw new com.facebook.ads.redexgen.X.C9Y(A0A(190, 51, 24));
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x020c, code lost:
        throw new com.facebook.ads.redexgen.X.C9Y(A0A(479, 53, 2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x007c, code lost:
        if (r2 >= r8) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0Y(com.facebook.ads.redexgen.X.BW r11) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 525
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.W8.A0Y(com.facebook.ads.redexgen.X.BW):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x0107, code lost:
        if (r0 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0109, code lost:
        r1 = r0.A06(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x010f, code lost:
        if (r5.A01 == 0) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0111, code lost:
        r11 = r18.A0Q.A00;
        r11[0] = 0;
        r11[1] = 0;
        r11[2] = 0;
        r10 = r5.A01 + 1;
        r17 = 4 - r5.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0127, code lost:
        if (r18.A04 >= r18.A06) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0129, code lost:
        r15 = r18.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0137, code lost:
        if (com.facebook.ads.redexgen.X.W8.A0Y[1].length() == 5) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0139, code lost:
        r16 = com.facebook.ads.redexgen.X.W8.A0Y;
        r16[2] = "oY9Cfc6NZLH";
        r16[4] = "IHvoiGll8tT";
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0145, code lost:
        if (r15 != 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0147, code lost:
        r19.readFully(r11, r17, r10);
        r18.A0Q.A0Y(r12);
        r18.A05 = r18.A0Q.A0H() - r13;
        r18.A0R.A0Y(r12);
        r7.AEX(r18.A0R, r14);
        r7.AEX(r18.A0Q, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x016c, code lost:
        if (r18.A0H.length <= 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0178, code lost:
        if (com.facebook.ads.redexgen.X.HY.A0C(r5.A07.A0O, r11[r14]) == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x017a, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x017b, code lost:
        r18.A0G = r0;
        r18.A04 += 5;
        r18.A06 += r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x018a, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x018c, code lost:
        if (r15 != 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0191, code lost:
        if (r18.A0G == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0193, code lost:
        r18.A0P.A0W(r15);
        r19.readFully(r18.A0P.A00, r12, r18.A05);
        r7.AEX(r18.A0P, r18.A05);
        r3 = r18.A05;
        r15 = com.facebook.ads.redexgen.X.HY.A02(r18.A0P.A00, r18.A0P.A07());
        r0 = r18.A0P;
        r12 = A0A(686, 10, 6).equals(r5.A07.A0O) ? 1 : 0;
        r0.A0Y(r12);
        r18.A0P.A0X(r15);
        com.facebook.ads.redexgen.X.C0432Fb.A03(r1, r18.A0P, r18.A0H);
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x01df, code lost:
        r18.A04 += r3;
        r18.A05 -= r3;
        r14 = 4;
        r13 = 1;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x01ee, code lost:
        r3 = r7.AEW(r19, r15, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x020e, code lost:
        if (r0 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0212, code lost:
        r0 = r18.A04;
        r3 = r18.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0216, code lost:
        if (r0 >= r3) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0218, code lost:
        r18.A04 += r7.AEW(r19, r3 - r0, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0224, code lost:
        r10 = r6.A0I[r8];
        r3 = null;
        r10 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x022b, code lost:
        if (r6.A0A == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x022d, code lost:
        r10 = (r10 ? 1 : 0) | true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0232, code lost:
        if (r6.A08 == null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0234, code lost:
        r0 = r6.A08;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0236, code lost:
        r3 = r0.A01;
        r10 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0238, code lost:
        r0 = r18.A06;
        r7.AEY(r1, r10, r0, 0, r3);
        A0E(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x024c, code lost:
        if (r18.A0D.A08() != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x024e, code lost:
        r18.A0D = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0251, code lost:
        r18.A02 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0255, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0256, code lost:
        r0 = r5.A00(r6.A07.A02);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0Z(com.facebook.ads.redexgen.X.BW r19) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 607
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.W8.A0Z(com.facebook.ads.redexgen.X.BW):boolean");
    }

    @Override // com.facebook.ads.redexgen.X.BV
    public final void A8V(BX bx) {
        this.A0C = bx;
        CH ch = this.A0N;
        if (ch != null) {
            C8 c8 = new C8(bx.AFc(0, ch.A03));
            c8.A07(this.A0N, new C2(0, 0, 0, 0));
            this.A0K.put(0, c8);
            A0C();
            this.A0C.A5G();
        }
    }

    @Override // com.facebook.ads.redexgen.X.BV
    public final int ADp(BW bw, C0346Bc c0346Bc) throws IOException, InterruptedException {
        while (true) {
            int i = this.A02;
            if (A0Y[6].length() == 17) {
                throw new RuntimeException();
            }
            A0Y[6] = "Adcvl3OLLWBEEjCvRjB7l1tHvWvuGk";
            if (i != 0) {
                if (i == 1) {
                    A0G(bw);
                } else if (i != 2) {
                    if (A0Z(bw)) {
                        return 0;
                    }
                } else {
                    A0H(bw);
                }
            } else if (!A0Y(bw)) {
                return -1;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.BV
    public final void AEc(long j, long j2) {
        int size = this.A0K.size();
        for (int i = 0; i < size; i++) {
            this.A0K.valueAt(i).A04();
        }
        this.A0U.clear();
        this.A03 = 0;
        this.A0A = j2;
        this.A0T.clear();
        A0B();
    }

    @Override // com.facebook.ads.redexgen.X.BV
    public final boolean AFL(BW bw) throws IOException, InterruptedException {
        return CF.A03(bw);
    }
}
