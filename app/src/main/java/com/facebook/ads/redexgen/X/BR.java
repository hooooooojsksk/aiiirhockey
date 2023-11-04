package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.work.WorkRequest;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray;
import com.mobirix.airhockey.airhockey;
import java.io.IOException;
import java.util.Arrays;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: assets/audience_network.dex */
public final class BR implements VA, BX, InterfaceC0464Gj<VE>, InterfaceC0467Gm, InterfaceC0420En {
    public static byte[] A0c;
    public static String[] A0d = {"uM3", "HhtEoeszujhq2hqW803X6wAUFNr2yIvk", "llgRlYE2HHrDKVr9Tlv1gg4sawaKL", "gd26Zevc0BeMQVnsPvgEWj4kMHitbDqE", "B56DgxYfwXnRdFUWoxgY8ZwWxUmrPQlR", "o6X9hbG4Io42IRbcZylLcsRNIhbJFPRA", "SBfu1SOz9uKNnyoy8", "5PtJb97AhuhjIJJCziWFyl83Esr9CMYA"};
    public int A00;
    public int A01;
    public int A02;
    public long A04;
    public InterfaceC0348Be A07;
    @Nullable
    public VB A08;
    public TrackGroupArray A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean[] A0L;
    public boolean[] A0M;
    public boolean[] A0N;
    public final int A0O;
    public final long A0P;
    public final Uri A0Q;
    public final EN A0S;
    public final EO A0T;
    public final C0411Ee A0U;
    public final GP A0V;
    public final GX A0W;
    @Nullable
    public final String A0b;
    public final C0810Ua A0X = new C0810Ua(A07(0, 27, 27));
    public final HJ A0Y = new HJ();
    public final Runnable A0Z = new EL(this);
    public final Runnable A0a = new EM(this);
    public final Handler A0R = new Handler();
    public int[] A0J = new int[0];
    public V9[] A0K = new V9[0];
    public long A06 = -9223372036854775807L;
    public long A05 = -1;
    public long A03 = -9223372036854775807L;

    public static String A07(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0c, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 25);
        }
        return new String(copyOfRange);
    }

    public static void A0B() {
        A0c = new byte[]{78, 109, 99, 102, airhockey.J_ENEMYWIN, airhockey.J_GOO, 56, airhockey.P_GAME_MYWIN, airhockey.J_PURCHASE, airhockey.J_REWARD, airhockey.J_GOO, 99, airhockey.J_SDKVER, airhockey.J_REWARD, 109, airhockey.J_GOO, 79, airhockey.J_ENEMYWIN, 102, airhockey.J_GAME_ENEMYEXIT, 99, 82, airhockey.J_ENEMYWIN, airhockey.J_GOO, airhockey.J_GAME_ENEMYEXIT, 109, 102};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.X.VA
    public final long AEh(GJ[] gjArr, boolean[] zArr, InterfaceC0421Eo[] interfaceC0421EoArr, boolean[] zArr2, long j) {
        int i;
        HD.A04(this.A0F);
        int i2 = this.A01;
        int i3 = 0;
        while (true) {
            int i4 = 0;
            if (i3 >= gjArr.length) {
                boolean z = !this.A0I ? j == 0 : i2 != 0;
                for (int i5 = 0; i5 < gjArr.length; i5++) {
                    if (interfaceC0421EoArr[i5] == null && gjArr[i5] != null) {
                        GJ gj = gjArr[i5];
                        HD.A04(gj.length() == 1);
                        HD.A04(gj.A6u(0) == 0);
                        int A00 = this.A09.A00(gj.A7s());
                        HD.A04(!this.A0L[A00]);
                        this.A01++;
                        this.A0L[A00] = true;
                        interfaceC0421EoArr[i5] = new VD(this, A00);
                        zArr2[i5] = true;
                        if (!z) {
                            V9 v9 = this.A0K[A00];
                            v9.A0J();
                            z = v9.A0D(j, true, true) == -1 && v9.A0B() != 0;
                        }
                    }
                }
                if (this.A01 == 0) {
                    this.A0E = false;
                    this.A0D = false;
                    if (this.A0X.A08()) {
                        V9[] v9Arr = this.A0K;
                        int length = v9Arr.length;
                        while (i4 < length) {
                            v9Arr[i4].A0H();
                            i4++;
                        }
                        this.A0X.A05();
                    } else {
                        V9[] v9Arr2 = this.A0K;
                        int length2 = v9Arr2.length;
                        while (i4 < length2) {
                            v9Arr2[i4].A0I();
                            i4++;
                        }
                    }
                } else if (z) {
                    j = AEg(j);
                    for (int i6 = 0; i6 < interfaceC0421EoArr.length; i6++) {
                        if (interfaceC0421EoArr[i6] != null) {
                            zArr2[i6] = true;
                        }
                    }
                }
                this.A0I = true;
                return j;
            }
            InterfaceC0421Eo interfaceC0421Eo = interfaceC0421EoArr[i3];
            String[] strArr = A0d;
            if (strArr[4].charAt(19) == strArr[5].charAt(19)) {
                throw new RuntimeException();
            }
            A0d[2] = "mg4ta7ka0nUwB4FGZ9fOP";
            if (interfaceC0421Eo != null && (gjArr[i3] == null || !zArr[i3])) {
                i = ((VD) interfaceC0421EoArr[i3]).A00;
                HD.A04(this.A0L[i]);
                this.A01--;
                this.A0L[i] = false;
                interfaceC0421EoArr[i3] = null;
            }
            i3++;
        }
    }

    static {
        A0B();
    }

    public BR(Uri uri, GX gx, BV[] bvArr, int i, C0411Ee c0411Ee, EO eo, GP gp, @Nullable String str, int i2) {
        this.A0Q = uri;
        this.A0W = gx;
        this.A0O = i;
        this.A0U = c0411Ee;
        this.A0T = eo;
        this.A0V = gp;
        this.A0b = str;
        this.A0P = i2;
        this.A0S = new EN(bvArr, this);
        this.A00 = i == -1 ? 3 : i;
        c0411Ee.A03();
    }

    private int A00() {
        int i = 0;
        for (V9 v9 : this.A0K) {
            int extractedSamplesCount = v9.A0C();
            i += extractedSamplesCount;
        }
        return i;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0464Gj
    /* renamed from: A01 */
    public final int ABV(VE ve, long j, long j2, IOException iOException) {
        C0458Gb c0458Gb;
        long j3;
        long j4;
        boolean isErrorFatal = A0N(iOException);
        C0411Ee c0411Ee = this.A0U;
        c0458Gb = ve.A03;
        j3 = ve.A02;
        long j5 = this.A03;
        j4 = ve.A00;
        c0411Ee.A0H(c0458Gb, 1, -1, null, 0, null, j3, j5, j, j2, j4, iOException, isErrorFatal);
        A0E(ve);
        if (isErrorFatal) {
            return 3;
        }
        int A00 = A00();
        boolean madeProgress = A00 > this.A02;
        if (A0L(ve, A00)) {
            return madeProgress ? 1 : 0;
        }
        return 2;
    }

    private long A02() {
        long j = Long.MIN_VALUE;
        for (V9 v9 : this.A0K) {
            long largestQueuedTimestampUs = v9.A0F();
            j = Math.max(j, largestQueuedTimestampUs);
        }
        return j;
    }

    public void A09() {
        if (this.A0G || this.A0F || this.A07 == null || !this.A0H) {
            return;
        }
        for (V9 v9 : this.A0K) {
            if (v9.A0G() == null) {
                return;
            }
        }
        this.A0Y.A01();
        int length = this.A0K.length;
        TrackGroup[] trackGroupArr = new TrackGroup[length];
        this.A0N = new boolean[length];
        this.A0L = new boolean[length];
        this.A0M = new boolean[length];
        this.A03 = this.A07.A6Y();
        int i = 0;
        while (true) {
            boolean isAudioVideo = true;
            if (i >= length) {
                break;
            }
            Format A0G = this.A0K[i].A0G();
            trackGroupArr[i] = new TrackGroup(A0G);
            String str = A0G.A0O;
            if (!HV.A0B(str) && !HV.A09(str)) {
                isAudioVideo = false;
            }
            this.A0N[i] = isAudioVideo;
            this.A0A |= isAudioVideo;
            i++;
        }
        this.A09 = new TrackGroupArray(trackGroupArr);
        if (this.A0O == -1) {
            int trackCount = (this.A05 > (-1L) ? 1 : (this.A05 == (-1L) ? 0 : -1));
            if (trackCount == 0) {
                int trackCount2 = (this.A07.A6Y() > (-9223372036854775807L) ? 1 : (this.A07.A6Y() == (-9223372036854775807L) ? 0 : -1));
                if (trackCount2 == 0) {
                    String[] strArr = A0d;
                    String str2 = strArr[4];
                    String str3 = strArr[5];
                    int charAt = str2.charAt(19);
                    int trackCount3 = str3.charAt(19);
                    if (charAt == trackCount3) {
                        throw new RuntimeException();
                    }
                    A0d[2] = "7a3gC0RfnKvRSexgB6r2d4KLSEZ";
                    this.A00 = 6;
                }
            }
        }
        this.A0F = true;
        this.A0T.ACa(this.A03, this.A07.A8v());
        this.A08.AC9(this);
    }

    private void A0A() {
        C0458Gb c0458Gb;
        long j;
        VE ve = new VE(this, this.A0Q, this.A0W, this.A0S, this.A0Y);
        if (this.A0F) {
            HD.A04(A0I());
            long j2 = this.A03;
            if (j2 != -9223372036854775807L && this.A06 >= j2) {
                this.A0B = true;
                this.A06 = -9223372036854775807L;
                return;
            }
            ve.A04(this.A07.A7a(this.A06).A00.A00, this.A06);
            this.A06 = -9223372036854775807L;
        }
        this.A02 = A00();
        long A04 = this.A0X.A04(ve, this, this.A00);
        C0411Ee c0411Ee = this.A0U;
        c0458Gb = ve.A03;
        j = ve.A02;
        c0411Ee.A0E(c0458Gb, 1, -1, null, 0, null, j, this.A03, A04);
    }

    private void A0C(int i) {
        if (!this.A0M[i]) {
            Format A01 = this.A09.A01(i).A01(0);
            this.A0U.A06(HV.A01(A01.A0O), A01, 0, null, this.A04);
            boolean[] zArr = this.A0M;
            if (A0d[2].length() == 31) {
                throw new RuntimeException();
            }
            A0d[2] = "eh27oOHcwVOmHzYfi8kDTS";
            zArr[i] = true;
        }
    }

    private void A0D(int i) {
        if (this.A0E && this.A0N[i] && !this.A0K[i].A0M()) {
            String[] strArr = A0d;
            if (strArr[7].charAt(26) != strArr[1].charAt(26)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0d;
            strArr2[6] = "sgNFiq5UDquEcD4Be";
            strArr2[0] = "0a9";
            this.A06 = 0L;
            this.A0E = false;
            this.A0D = true;
            this.A04 = 0L;
            this.A02 = 0;
            for (V9 v9 : this.A0K) {
                v9.A0I();
            }
            this.A08.AAc(this);
        }
    }

    private void A0E(VE ve) {
        long j;
        if (this.A05 != -1) {
            return;
        }
        j = ve.A01;
        this.A05 = j;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0464Gj
    /* renamed from: A0F */
    public final void ABU(VE ve, long j, long j2) {
        C0458Gb c0458Gb;
        long j3;
        long j4;
        long j5;
        if (this.A03 == -9223372036854775807L) {
            long A02 = A02();
            if (A02 == Long.MIN_VALUE) {
                j5 = 0;
            } else {
                j5 = WorkRequest.MIN_BACKOFF_MILLIS + A02;
            }
            this.A03 = j5;
            this.A0T.ACa(this.A03, this.A07.A8v());
        }
        C0411Ee c0411Ee = this.A0U;
        c0458Gb = ve.A03;
        j3 = ve.A02;
        long j6 = this.A03;
        j4 = ve.A00;
        c0411Ee.A0G(c0458Gb, 1, -1, null, 0, null, j3, j6, j, j2, j4);
        A0E(ve);
        this.A0B = true;
        this.A08.AAc(this);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0464Gj
    /* renamed from: A0G */
    public final void ABS(VE ve, long j, long j2, boolean z) {
        C0458Gb c0458Gb;
        long j3;
        long j4;
        C0411Ee c0411Ee = this.A0U;
        c0458Gb = ve.A03;
        j3 = ve.A02;
        long j5 = this.A03;
        j4 = ve.A00;
        c0411Ee.A0F(c0458Gb, 1, -1, null, 0, null, j3, j5, j, j2, j4);
        if (!z) {
            A0E(ve);
            for (V9 v9 : this.A0K) {
                v9.A0I();
            }
            if (this.A01 > 0) {
                this.A08.AAc(this);
            }
        }
    }

    private boolean A0I() {
        return this.A06 != -9223372036854775807L;
    }

    private boolean A0J() {
        return this.A0D || A0I();
    }

    private boolean A0K(long j) {
        int length = this.A0K.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                return true;
            }
            V9 v9 = this.A0K[i];
            v9.A0J();
            int i2 = v9.A0D(j, true, false);
            boolean seekInsideQueue = i2 != -1;
            if (!seekInsideQueue) {
                if (this.A0N[i]) {
                    break;
                }
                boolean z = this.A0A;
                String[] strArr = A0d;
                String str = strArr[4];
                String str2 = strArr[5];
                int i3 = str.charAt(19);
                int trackCount = str2.charAt(19);
                if (i3 == trackCount) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0d;
                strArr2[7] = "iCn5X7g6PoYVWCe4GwpQYWYt9drfTGBT";
                strArr2[1] = "IDd3eJ2NBG0wgz78gdspZyWtrcrofueQ";
                if (!z) {
                    break;
                }
            }
            i++;
        }
        return false;
    }

    private boolean A0L(VE ve, int i) {
        InterfaceC0348Be interfaceC0348Be;
        if (this.A05 != -1 || ((interfaceC0348Be = this.A07) != null && interfaceC0348Be.A6Y() != -9223372036854775807L)) {
            this.A02 = i;
            if (A0d[2].length() != 31) {
                String[] strArr = A0d;
                strArr[6] = "F1SGTXFlfQdsRtCv2";
                strArr[0] = "c29";
                return true;
            }
            throw new RuntimeException();
        }
        if (this.A0F && !A0J()) {
            this.A0E = true;
            return false;
        }
        this.A0D = this.A0F;
        this.A04 = 0L;
        this.A02 = 0;
        for (V9 v9 : this.A0K) {
            v9.A0I();
        }
        ve.A04(0L, 0L);
        return true;
    }

    public static boolean A0N(IOException iOException) {
        return iOException instanceof V7;
    }

    public final int A0O(int i, long j) {
        int A0D;
        if (A0J()) {
            return 0;
        }
        V9 v9 = this.A0K[i];
        if (this.A0B && j > v9.A0F()) {
            A0D = v9.A0A();
        } else {
            A0D = v9.A0D(j, true, true);
            String[] strArr = A0d;
            String str = strArr[4];
            String str2 = strArr[5];
            int skipCount = str.charAt(19);
            if (skipCount == str2.charAt(19)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0d;
            strArr2[6] = "NIYG9FQCzFZSe10IE";
            strArr2[0] = "6cN";
            if (A0D == -1) {
                A0D = 0;
            }
        }
        if (A0D > 0) {
            A0C(i);
        } else {
            A0D(i);
        }
        return A0D;
    }

    public final int A0P(int i, C9S c9s, C0865Wg c0865Wg, boolean z) {
        if (A0J()) {
            return -3;
        }
        int A0E = this.A0K[i].A0E(c9s, c0865Wg, z, this.A0B, this.A04);
        if (A0E == -4) {
            A0C(i);
        } else if (A0E == -3) {
            A0D(i);
        }
        return A0E;
    }

    public final void A0Q() throws IOException {
        this.A0X.A06(this.A00);
    }

    public final void A0R() {
        if (this.A0F) {
            for (V9 v9 : this.A0K) {
                v9.A0H();
            }
        }
        this.A0X.A07(this);
        this.A0R.removeCallbacksAndMessages(null);
        this.A08 = null;
        this.A0G = true;
        this.A0U.A04();
    }

    public final boolean A0S(int i) {
        return !A0J() && (this.A0B || this.A0K[i].A0M());
    }

    @Override // com.facebook.ads.redexgen.X.VA
    public final boolean A4D(long j) {
        if (this.A0B || this.A0E) {
            return false;
        }
        if (this.A0F && this.A01 == 0) {
            return false;
        }
        boolean A02 = this.A0Y.A02();
        boolean continuedLoading = this.A0X.A08();
        if (!continuedLoading) {
            A0A();
            return true;
        }
        return A02;
    }

    @Override // com.facebook.ads.redexgen.X.VA
    public final void A4s(long j, boolean z) {
        int length = this.A0K.length;
        for (int i = 0; i < length; i++) {
            this.A0K[i].A0K(j, z, this.A0L[i]);
        }
    }

    @Override // com.facebook.ads.redexgen.X.BX
    public final void A5G() {
        this.A0H = true;
        this.A0R.post(this.A0Z);
    }

    @Override // com.facebook.ads.redexgen.X.VA
    public final long A5g(long j, C03119q c03119q) {
        if (!this.A07.A8v()) {
            return 0L;
        }
        C0347Bd A7a = this.A07.A7a(j);
        return C0499Hs.A0I(j, c03119q, A7a.A00.A01, A7a.A01.A01);
    }

    @Override // com.facebook.ads.redexgen.X.VA
    public final long A5w() {
        long A02;
        if (this.A0B) {
            return Long.MIN_VALUE;
        }
        if (A0I()) {
            long j = this.A06;
            String[] strArr = A0d;
            if (strArr[7].charAt(26) != strArr[1].charAt(26)) {
                throw new RuntimeException();
            }
            A0d[3] = "ld4wWqv9tK9nTvU7QEEl8vpde5wWqGSi";
            return j;
        }
        if (this.A0A) {
            A02 = LongCompanionObject.MAX_VALUE;
            int i = this.A0K.length;
            for (int i2 = 0; i2 < i; i2++) {
                if (this.A0N[i2]) {
                    A02 = Math.min(A02, this.A0K[i2].A0F());
                }
            }
        } else {
            A02 = A02();
        }
        int trackCount = (A02 > Long.MIN_VALUE ? 1 : (A02 == Long.MIN_VALUE ? 0 : -1));
        if (trackCount == 0) {
            return this.A04;
        }
        return A02;
    }

    @Override // com.facebook.ads.redexgen.X.VA
    public final long A7B() {
        if (this.A01 == 0) {
            return Long.MIN_VALUE;
        }
        return A5w();
    }

    @Override // com.facebook.ads.redexgen.X.VA
    public final TrackGroupArray A7t() {
        return this.A09;
    }

    @Override // com.facebook.ads.redexgen.X.VA
    public final void A9k() throws IOException {
        A0Q();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0467Gm
    public final void ABZ() {
        for (V9 v9 : this.A0K) {
            v9.A0I();
        }
        this.A0S.A03();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0420En
    public final void ACt(Format format) {
        this.A0R.post(this.A0Z);
    }

    @Override // com.facebook.ads.redexgen.X.VA
    public final void ADY(VB vb, long j) {
        this.A08 = vb;
        this.A0Y.A02();
        A0A();
    }

    @Override // com.facebook.ads.redexgen.X.VA
    public final long ADt() {
        if (!this.A0C) {
            this.A0U.A05();
            this.A0C = true;
        }
        boolean z = this.A0D;
        String[] strArr = A0d;
        if (strArr[6].length() != strArr[0].length()) {
            A0d[2] = "";
            if (z && (this.A0B || A00() > this.A02)) {
                this.A0D = false;
                return this.A04;
            }
            String[] strArr2 = A0d;
            if (strArr2[7].charAt(26) == strArr2[1].charAt(26)) {
                String[] strArr3 = A0d;
                strArr3[4] = "a8TiTKBNhx8jXxPRrcAgh1BUcIw96G2f";
                strArr3[5] = "NHpS1UqcJuZi4hHtySMRiLK65X8yfSYb";
                return -9223372036854775807L;
            }
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.X.VA
    public final void AE0(long j) {
    }

    @Override // com.facebook.ads.redexgen.X.BX
    public final void AEd(InterfaceC0348Be interfaceC0348Be) {
        this.A07 = interfaceC0348Be;
        this.A0R.post(this.A0Z);
    }

    @Override // com.facebook.ads.redexgen.X.VA
    public final long AEg(long j) {
        if (!this.A07.A8v()) {
            j = 0;
        }
        this.A04 = j;
        this.A0D = false;
        if (!A0I()) {
            boolean A0K = A0K(j);
            String[] strArr = A0d;
            if (strArr[4].charAt(19) == strArr[5].charAt(19)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0d;
            strArr2[4] = "4t4h1X84Q9aXzP6i3O1IFqP61fZwJyic";
            strArr2[5] = "YchhDxV7HDCpyjRy2lVbypcIuIxdt4SR";
            if (A0K) {
                return j;
            }
        }
        this.A0E = false;
        this.A06 = j;
        this.A0B = false;
        if (this.A0X.A08()) {
            this.A0X.A05();
        } else {
            for (V9 v9 : this.A0K) {
                v9.A0I();
            }
        }
        return j;
    }

    @Override // com.facebook.ads.redexgen.X.BX
    public final InterfaceC0351Bh AFc(int i, int i2) {
        int length = this.A0K.length;
        for (int i3 = 0; i3 < length; i3++) {
            int trackCount = this.A0J[i3];
            if (trackCount == i) {
                return this.A0K[i3];
            }
        }
        V9 v9 = new V9(this.A0V);
        v9.A0L(this);
        int trackCount2 = length + 1;
        this.A0J = Arrays.copyOf(this.A0J, trackCount2);
        this.A0J[length] = i;
        int trackCount3 = length + 1;
        this.A0K = (V9[]) Arrays.copyOf(this.A0K, trackCount3);
        this.A0K[length] = v9;
        return v9;
    }
}
