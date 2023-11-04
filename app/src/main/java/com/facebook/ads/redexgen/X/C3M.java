package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.mobirix.airhockey.airhockey;
import cz.msebera.android.httpclient.HttpStatus;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.ByteCompanionObject;

@TargetApi(16)
/* renamed from: com.facebook.ads.redexgen.X.3M */
/* loaded from: assets/audience_network.dex */
public abstract class C3M extends AbstractC0388Dh {
    public static byte[] A0d;
    public static String[] A0e = {"el1NIdjJdnQk8rQ7yI3DLJMJGUNGpsaL", "cMnDkAErKs2M6cVzDcwdPqTaRDuVL2G6", "3Ljz1yFix4teFI07gFBJ1ZVJZ4Elk", "rfweshkfyu7YGNu9gmTN5aJbUxr0jD44", "UwDJ5OwzyxxJZbvw2og9SG", "E", "kELoxR7DFwuexd5ZjpenISH", "LMGopoJZLCWwOw1IQPtLBjMdbqq8sxxW"};
    public static final byte[] A0f;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public MediaCodec A06;
    public Format A07;
    public BE<C0859Wa> A08;
    public BE<C0859Wa> A09;
    public C0379Ct A0A;
    public ByteBuffer A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public ByteBuffer[] A0S;
    public ByteBuffer[] A0T;
    public C0335Ap A0U;
    public final MediaCodec.BufferInfo A0V;
    public final C9S A0W;
    public final C0865Wg A0X;
    public final C0865Wg A0Y;
    @Nullable
    public final BF<C0859Wa> A0Z;
    public final Cz A0a;
    public final List<Long> A0b;
    public final boolean A0c;

    public static String A0Z(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0d, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            int i5 = (copyOfRange[i4] ^ i3) ^ 57;
            if (A0e[5].length() == 20) {
                throw new RuntimeException();
            }
            A0e[0] = "GT4OiQXgMfCUtJ1QRZ1mZZkQ0KPtv7dD";
            copyOfRange[i4] = (byte) i5;
        }
        return new String(copyOfRange);
    }

    public static void A0j() {
        A0d = new byte[]{85, 89, 27, 12, 13, 89, 23, 22, 89, 10, 28, 26, 12, 11, 28, 89, 29, 28, 26, 22, 29, 28, 11, 89, 24, 15, 24, 16, 21, 24, 27, 21, 28, 87, 89, 45, 11, 0, 16, 23, 30, 89, 13, 22, 89, 9, 11, 22, 26, 28, 28, 29, 89, 14, 16, 13, 17, 89, 19, airhockey.J_GAME_EXIT, airhockey.J_GAME_EXIT, airhockey.J_GAME_EXIT, airhockey.J_GAME_EXIT, airhockey.J_GAME_EXIT, airhockey.J_GAME_ENEMYEXIT, airhockey.J_GAME_DISCONNECT, 109, airhockey.J_INVITE, airhockey.J_ENEMYLOSE, 25, airhockey.J_GAME_EXIT, airhockey.J_GAME_EXIT, 24, 30, 27, airhockey.J_ENEMYLOSE, 111, 99, airhockey.J_GAME_EXIT, airhockey.J_GAME_EXIT, airhockey.J_GAME_EXIT, airhockey.J_GAME_EXIT, airhockey.J_GAME_EXIT, airhockey.J_GAME_EXIT, airhockey.J_GAME_ENEMYEXIT, airhockey.J_GAME_DISCONNECT, airhockey.J_NATION, 25, 31, airhockey.J_GAME_EXIT, 28, airhockey.J_GAME_ENEMYEXIT, airhockey.J_GAME_REMATCH, airhockey.J_ENEMYLOSE, airhockey.J_GAME_EXIT, airhockey.J_GAME_EXIT, airhockey.J_GAME_EXIT, airhockey.J_GAME_EXIT, airhockey.J_GAME_EXIT, airhockey.J_GAME_EXIT, airhockey.J_GAME_ENEMYEXIT, airhockey.J_GAME_DISCONNECT, 111, airhockey.J_NATION, airhockey.J_NATION, airhockey.J_NATION, airhockey.J_INVITE, airhockey.J_GAME_EXIT, 30, 25, 31, 109, airhockey.J_GAME_ENEMYEXIT, airhockey.J_GAME_ENEMYEXIT, airhockey.J_NATION, 27, airhockey.J_GAME_EXIT, airhockey.J_GAME_EXIT, airhockey.J_GAME_EXIT, airhockey.J_ENEMYLOSE, 28, 24, 28, airhockey.J_GAME_ENEMYEXIT, 25, airhockey.J_GAME_REMATCH, airhockey.J_GAME_ENEMYEXIT, 25, airhockey.J_GAME_REMATCH, airhockey.J_ENEMYLOSE, 109, 111, 30, 109, airhockey.J_NATION, airhockey.J_GAME_ENEMYEXIT, airhockey.J_GAME_DISCONNECT, 126, airhockey.J_ENEMYLOSE, 3, 4, 22, 15, 88, 95, 77, airhockey.P_GAME_EXIT, 23, 59, 55, 44, 57, 56, 0, 54, 41, airhockey.J_ONREWARDED, 55, 33, 55, 55, 45, 43, 42, airhockey.J_ONREWARDED, 54, 33, 53, 49, 45, 54, 33, 55, airhockey.J_ONREWARDED, 55, 33, 39, 49, 54, 33, airhockey.J_ONREWARDED, 32, 33, 39, 43, 32, 33, 54, airhockey.J_ONREWARDED, 34, 43, 54, airhockey.J_ONREWARDED, airhockey.P_GAME_MYWIN, 111, airhockey.J_INVITE, 99, airhockey.J_GAME_ENEMYEXIT, 42, airhockey.J_ACHIEVEMENTCALLBACK, 111, 123, ByteCompanionObject.MAX_VALUE, 99, airhockey.J_ACHIEVEMENTCALLBACK, 111, airhockey.J_WAIT, 42, airhockey.J_GAME_ENEMYEXIT, 42, 78, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_ENEMYWIN, 89, 111, airhockey.J_WAIT, airhockey.J_WAIT, 99, airhockey.J_GAME_STANDBY, airhockey.J_ONREWARDED, airhockey.P_GAME_MYWIN, airhockey.J_GAME_ENEMYEXIT, airhockey.J_ONREWARDED, airhockey.J_GAME_ENEMYEXIT, 109, 111, airhockey.J_ACHIEVEMENTCALLBACK, 34, 10, 11, 6, 14, 44, 0, 11, 10, 12, 61, 10, 1, 11, 10, 29, 10, 29, 42, 40, 61, 75, 32, 29, 28, 11, 10, 22, 75, 4, 19, 6, 75, 1, 0, 6, 80, 82, airhockey.P_GAME_MYWIN, 49, 90, airhockey.J_ENEMYWIN, 102, airhockey.J_BACK, airhockey.J_GOO, airhockey.J_GAME_DISCONNECT, 49, 126, airhockey.J_GAME_REMATCH, 124, 49, 123, airhockey.J_PURCHASE, 124, 49, airhockey.J_GAME_DISCONNECT, airhockey.J_PURCHASE, 124, airhockey.J_GAME_EXIT, 109, airhockey.J_PURCHASE, 36, 38, 51, airhockey.P_GAME_STANDBY, 38, 63, 32, airhockey.P_GAME_STANDBY, 42, 62, 47, 34, 36, airhockey.P_GAME_STANDBY, 47, 46, 40, 36, 47, 46, 57, airhockey.P_GAME_STANDBY, 38, 59, 88, 63, 61, 40, 94, 61, 36, 59, 94, 38, 57, 52, 53, 63, 94, 52, 53, 51, 63, 52, 53, 34, 94, 49, 38, 51, 14, 12, 25, 111, 15, 55, 40, 37, 40, 32, 111, 41, airhockey.J_SAVEDGAME_SAVE, 119, airhockey.J_ERROR, 111, 37, 36, 34, 46, 37, 36, 4, 6, 19, airhockey.J_GAME_STANDBY, 5, 61, 34, 47, 34, 42, airhockey.J_GAME_STANDBY, 35, airhockey.J_WAIT, 125, ByteCompanionObject.MAX_VALUE, airhockey.J_GAME_STANDBY, 47, 46, 40, 36, 47, 46, airhockey.J_GAME_STANDBY, 56, 46, 40, 62, 57, 46, 4, 6, 19, airhockey.J_GAME_STANDBY, 24, 14, 8, airhockey.J_GAME_STANDBY, 42, 61, 40, airhockey.J_GAME_STANDBY, 47, 46, 40, 75, airhockey.P_GAME_REMATCH, 92, 42, 87, 65, airhockey.P_GAME_MYWIN, 42, airhockey.J_GAME_STANDBY, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_ENEMYWIN, 42, 96, airhockey.J_SDKVER, airhockey.J_ENEMYWIN, 42, 119, airhockey.J_SDKVER, airhockey.J_ENEMYWIN, airhockey.J_BACK, airhockey.J_REWARD, airhockey.J_SDKVER, airhockey.J_INVITE, airhockey.J_GAME_DISCONNECT, airhockey.J_WAIT, 15, 64, 77, 77, 86, airhockey.P_GAME_MYLOSE, 79, 79, airhockey.P_GAME_SELECTMAP, 83, 15, 87, airhockey.P_GAME_MYLOSE, airhockey.P_GAME_STANDBY, airhockey.P_GAME_SELECTMAP, 78, 15, airhockey.P_GAME_STANDBY, airhockey.P_GAME_SELECTMAP, airhockey.P_NATION, 78, airhockey.P_GAME_STANDBY, airhockey.P_GAME_SELECTMAP, 83, 15, 64, 87, airhockey.P_NATION, 87, 85, 64, 54, airhockey.J_WAIT, airhockey.J_ERROR, airhockey.J_DISCONNECT, 119, ByteCompanionObject.MAX_VALUE, airhockey.J_BACK, 123, 54, airhockey.J_WAIT, airhockey.J_INVITE, 123, 54, 124, 125, 123, 119, 124, 125, airhockey.J_GAME_EXIT, 54, airhockey.J_WAIT, 111, 125, airhockey.J_GAME_ENEMYEXIT, 119, airhockey.J_ERROR, 125, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_GOO, airhockey.J_GAME_STANDBY, 19, 92, 80, 81, 82, 90, 84, 94, 19, 92, 75, 94, 19, 89, 88, 94, 82, 89, 88, 79, 19, 92, airhockey.P_GAME_EXIT, 88, 78, 82, 80, 88, 19, 78, 88, 94, airhockey.P_GAME_MYLOSE, 79, 88, 123, airhockey.J_WAIT, airhockey.J_GAME_DISCONNECT, 26, 83, 91, 91, 83, 88, 81, 26, 85, 85, 87, 26, 80, 81, 87, 91, 80, 81, airhockey.P_GAME_BREAKBALLCOUNT, 95, 93, airhockey.P_GAME_MYLOSE, 62, 119, ByteCompanionObject.MAX_VALUE, ByteCompanionObject.MAX_VALUE, 119, 124, airhockey.J_ERROR, 62, 102, ByteCompanionObject.MAX_VALUE, airhockey.J_NATION, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_WAIT, 99, 62, airhockey.J_DISCONNECT, airhockey.J_ERROR, airhockey.J_SAVEDGAME_SAVE, ByteCompanionObject.MAX_VALUE, airhockey.J_DISCONNECT, airhockey.J_ERROR, airhockey.J_NATION, 38, 36, 49, airhockey.P_GAME_MYWIN, 27, 2, airhockey.P_GAME_MYWIN, 31, 0, 13, 12, 6, 54, 13, 12, 10, 6, 13, 12, 27, airhockey.P_GAME_MYWIN, 8, 31, 10, 57, 39, airhockey.P_GAME_MYWIN, 43, 95, 91, 90, 11, 21, airhockey.J_ERROR, 25, 109, airhockey.J_GAME_EXIT, airhockey.J_ENEMYLOSE, airhockey.J_GAME_REMATCH, 119, 23, 125, 2, 10, 10, 90, airhockey.P_GAME_SELECTMAP, 36, airhockey.P_GAME_MYSCORE, 62, 57, 57, 76, 82, 50, 75, 42, 39, 42, 11, 0, 9, 6, 6, 13, 4, airhockey.P_GAME_STANDBY, 11, 7, 29, 6, 28, 4, 8, 9, 1, 14, 0, 18, 21, 2, 36, 8, 3, 2, 4, 125, airhockey.J_GAME_DISCONNECT, 123, ByteCompanionObject.MAX_VALUE, airhockey.J_GAME_EXIT, 123, 93, airhockey.J_BACK, airhockey.J_PURCHASE, 123, 125, 36, 28, 10, 25, 17, 22, 57, 22, 28, 62, 29, 29, 28, 57, 51, 48, 42, 49, 59, 58, 45, airhockey.J_GAME_EXIT, 96, 99, airhockey.J_WAIT, airhockey.J_NATION, airhockey.J_ENEMYLOSE, airhockey.J_GAME_REMATCH, 126, 83, 96, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_GAME_REMATCH, 1, 20, 9, 19, 22, 3, 20, 64, airhockey.P_GAME_EXIT, 26, 24, 24, 24, 62, 51, 63, 49, 62, 34, 125, airhockey.J_PURCHASE, 111, 124, airhockey.J_PURCHASE, 77, airhockey.J_SDKVER, airhockey.J_GAME_EXIT, airhockey.J_GAME_ENEMYEXIT, 109, airhockey.P_NATION, 95, 90, 87, airhockey.P_GAME_BREAKBALLCOUNT, 95, 87, 51, 45, 32, 48, 44};
    }

    public abstract int A1B(Cz cz2, BF<C0859Wa> bf, Format format) throws D2;

    public abstract void A1N(C0379Ct c0379Ct, MediaCodec mediaCodec, Format format, MediaCrypto mediaCrypto) throws D2;

    public abstract boolean A1P(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) throws C9F;

    static {
        A0j();
        A0f = C0499Hs.A0h(A0Z(59, 76, 99));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BF != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    public C3M(int i, Cz cz2, @Nullable BF<C0859Wa> bf, boolean z) {
        super(i);
        HD.A04(C0499Hs.A02 >= 16);
        this.A0a = (Cz) HD.A01(cz2);
        this.A0Z = bf;
        this.A0c = z;
        this.A0X = new C0865Wg(0);
        this.A0Y = C0865Wg.A02();
        this.A0W = new C9S();
        this.A0b = new ArrayList();
        this.A0V = new MediaCodec.BufferInfo();
        this.A01 = 0;
        this.A02 = 0;
    }

    private int A0W(String str) {
        if (C0499Hs.A02 <= 25 && A0Z(263, 25, 38).equals(str) && (C0499Hs.A06.startsWith(A0Z(625, 7, 38)) || C0499Hs.A06.startsWith(A0Z(597, 7, 83)) || C0499Hs.A06.startsWith(A0Z(604, 7, 97)) || C0499Hs.A06.startsWith(A0Z(618, 7, 48)))) {
            return 2;
        }
        if (C0499Hs.A02 < 24) {
            if (A0Z(338, 22, 120).equals(str) || A0Z(360, 29, 114).equals(str)) {
                if (!A0Z(683, 8, 102).equals(C0499Hs.A03)) {
                    if (!A0Z(691, 12, 53).equals(C0499Hs.A03)) {
                        if (!A0Z(703, 7, 95).equals(C0499Hs.A03)) {
                            if (A0Z(732, 7, 15).equals(C0499Hs.A03)) {
                                return 1;
                            }
                            return 0;
                        }
                        return 1;
                    }
                    return 1;
                }
                return 1;
            }
            return 0;
        }
        return 0;
    }

    private final long A0X() {
        return 0L;
    }

    public static MediaCodec.CryptoInfo A0Y(C0865Wg c0865Wg, int i) {
        MediaCodec.CryptoInfo A02 = c0865Wg.A02.A02();
        if (i == 0) {
            return A02;
        }
        if (A02.numBytesOfClearData == null) {
            A02.numBytesOfClearData = new int[1];
        }
        int[] iArr = A02.numBytesOfClearData;
        int i2 = iArr[0];
        if (A0e[2].length() != 1) {
            String[] strArr = A0e;
            strArr[7] = "NOzrMPRB76F8DdbUb3OPVPb4rTNpEGvY";
            strArr[3] = "IDmZDsJhwqXuUzopfYWLVElAjmr2DtdU";
            iArr[0] = i2 + i;
            return A02;
        }
        throw new RuntimeException();
    }

    private ByteBuffer A0a(int i) {
        if (C0499Hs.A02 >= 21) {
            return this.A06.getInputBuffer(i);
        }
        ByteBuffer byteBuffer = this.A0S[i];
        String[] strArr = A0e;
        if (strArr[4].length() != strArr[6].length()) {
            String[] strArr2 = A0e;
            strArr2[7] = "akmimywpCQzy2zgGqC6e1Zi0HtFx9MqZ";
            strArr2[3] = "4g16x1WFaX1F1Ai56lyJAgpz1Kjl0dDQ";
            return byteBuffer;
        }
        throw new RuntimeException();
    }

    private ByteBuffer A0b(int i) {
        if (C0499Hs.A02 >= 21) {
            return this.A06.getOutputBuffer(i);
        }
        return this.A0T[i];
    }

    private void A0c() {
        if (C0499Hs.A02 < 21) {
            this.A0S = this.A06.getInputBuffers();
            MediaCodec mediaCodec = this.A06;
            if (A0e[5].length() == 20) {
                throw new RuntimeException();
            }
            A0e[2] = "BQUwUvW99pDNY9ExELsrhPAvhUrne6";
            this.A0T = mediaCodec.getOutputBuffers();
        }
    }

    private void A0d() throws C9F {
        if (this.A02 == 2) {
            A1G();
            A1I();
            return;
        }
        this.A0N = true;
        A1H();
    }

    private void A0e() {
        if (C0499Hs.A02 < 21) {
            this.A0T = this.A06.getOutputBuffers();
        }
    }

    private void A0f() throws C9F {
        MediaFormat outputFormat = this.A06.getOutputFormat();
        if (this.A00 != 0 && outputFormat.getInteger(A0Z(739, 5, 125)) == 32 && outputFormat.getInteger(A0Z(716, 6, 111)) == 32) {
            this.A0O = true;
            return;
        }
        if (this.A0I) {
            outputFormat.setInteger(A0Z(632, 13, 81), 1);
        }
        A1K(this.A06, outputFormat);
    }

    private void A0g() {
        if (C0499Hs.A02 < 21) {
            this.A0S = null;
            this.A0T = null;
        }
    }

    private void A0h() {
        this.A03 = -1;
        this.A0X.A01 = null;
    }

    private void A0i() {
        this.A04 = -1;
        this.A0B = null;
    }

    private void A0k(C0380Cv c0380Cv) throws C9F {
        throw C9F.A01(c0380Cv, A0y());
    }

    private boolean A0l() {
        if (A0Z(147, 6, 111).equals(C0499Hs.A05)) {
            if (!A0Z(139, 4, 123).equals(C0499Hs.A06)) {
                if (A0Z(135, 4, 19).equals(C0499Hs.A06)) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:181:0x013d, code lost:
        if (r6 == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x013f, code lost:
        A0d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0142, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x014a, code lost:
        if (r6 == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x014f, code lost:
        if (r14.A0G == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0152, code lost:
        r14.A0K = true;
        r14.A06.queueInputBuffer(r14.A03, 0, 0, 0, 4);
        A0h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0163, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0164, code lost:
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x016d, code lost:
        throw com.facebook.ads.redexgen.X.C9F.A01(r1, A0y());
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x018e, code lost:
        if (r8.A05() == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0190, code lost:
        r14.A0X.A07();
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0197, code lost:
        if (r14.A01 != 2) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0199, code lost:
        r14.A01 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x019b, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x01ac, code lost:
        if (r8.A05() == false) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0m() throws com.facebook.ads.redexgen.X.C9F {
        /*
            Method dump skipped, instructions count: 580
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C3M.A0m():boolean");
    }

    private boolean A0n() {
        return this.A04 >= 0;
    }

    private boolean A0o(long j) {
        int size = this.A0b.size();
        for (int i = 0; i < size; i++) {
            int size2 = (this.A0b.get(i).longValue() > j ? 1 : (this.A0b.get(i).longValue() == j ? 0 : -1));
            if (size2 == 0) {
                this.A0b.remove(i);
                int i2 = A0e[1].charAt(18);
                if (i2 != 119) {
                    throw new RuntimeException();
                }
                A0e[5] = "GAQPkPxILqrNxqRn";
                return true;
            }
        }
        return false;
    }

    private boolean A0p(long j, long j2) throws C9F {
        boolean processedOutputBuffer;
        int dequeueOutputBuffer;
        if (!A0n()) {
            if (this.A0F && this.A0K) {
                try {
                    dequeueOutputBuffer = this.A06.dequeueOutputBuffer(this.A0V, A0X());
                } catch (IllegalStateException unused) {
                    A0d();
                    if (this.A0N) {
                        A1G();
                    }
                    return false;
                }
            } else {
                dequeueOutputBuffer = this.A06.dequeueOutputBuffer(this.A0V, A0X());
            }
            if (dequeueOutputBuffer >= 0) {
                if (this.A0O) {
                    this.A0O = false;
                    this.A06.releaseOutputBuffer(dequeueOutputBuffer, false);
                    return true;
                }
                int outputIndex = this.A0V.size;
                if (outputIndex == 0) {
                    int outputIndex2 = this.A0V.flags;
                    if ((outputIndex2 & 4) != 0) {
                        A0d();
                        return false;
                    }
                }
                this.A04 = dequeueOutputBuffer;
                this.A0B = A0b(dequeueOutputBuffer);
                ByteBuffer byteBuffer = this.A0B;
                if (byteBuffer != null) {
                    int outputIndex3 = this.A0V.offset;
                    byteBuffer.position(outputIndex3);
                    ByteBuffer byteBuffer2 = this.A0B;
                    int i = this.A0V.offset;
                    int outputIndex4 = this.A0V.size;
                    int i2 = i + outputIndex4;
                    if (A0e[2].length() != 1) {
                        String[] strArr = A0e;
                        strArr[4] = "FaJE2XiArfhYqeNyfkTyaQ";
                        strArr[6] = "HvmGKe0EFE5f200jghUPQNW";
                        byteBuffer2.limit(i2);
                    }
                }
                this.A0P = A0o(this.A0V.presentationTimeUs);
            } else if (A0e[5].length() != 20) {
                A0e[1] = "HT1pBWWLOYy8PEf8scwcSavywhmMK5P3";
                if (dequeueOutputBuffer == -2) {
                    A0f();
                    String[] strArr2 = A0e;
                    String str = strArr2[4];
                    String str2 = strArr2[6];
                    int length = str.length();
                    int outputIndex5 = str2.length();
                    if (length != outputIndex5) {
                        A0e[5] = "todLl0dSZi0vPTtgICo1ottwNzErViL";
                        return true;
                    }
                    return true;
                } else if (A0e[0].charAt(8) != 's') {
                    A0e[5] = "4PVEqwR";
                    if (dequeueOutputBuffer == -3) {
                        A0e();
                        return true;
                    }
                    boolean z = this.A0G;
                    if (A0e[0].charAt(8) != 's') {
                        A0e[1] = "oPTnjsm2EBoNSW7B2QwBvulptlCCgQiW";
                        if (z && (this.A0M || this.A02 == 2)) {
                            A0d();
                        }
                        return false;
                    }
                    throw new RuntimeException();
                } else {
                    throw new RuntimeException();
                }
            }
            throw new RuntimeException();
        }
        if (this.A0F && this.A0K) {
            try {
                processedOutputBuffer = A1P(j, j2, this.A06, this.A0B, this.A04, this.A0V.flags, this.A0V.presentationTimeUs, this.A0P);
            } catch (IllegalStateException unused2) {
                A0d();
                if (this.A0N) {
                    A1G();
                }
                return false;
            }
        } else {
            processedOutputBuffer = A1P(j, j2, this.A06, this.A0B, this.A04, this.A0V.flags, this.A0V.presentationTimeUs, this.A0P);
        }
        if (processedOutputBuffer) {
            A1J(this.A0V.presentationTimeUs);
            boolean processedOutputBuffer2 = (this.A0V.flags & 4) != 0;
            A0i();
            if (!processedOutputBuffer2) {
                return true;
            }
            A0d();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0026, code lost:
        if (r0.equals(r3) == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0q(com.facebook.ads.redexgen.X.C0379Ct r7) {
        /*
            java.lang.String r3 = r7.A02
            int r1 = com.facebook.ads.redexgen.X.C0499Hs.A02
            r0 = 17
            if (r1 > r0) goto L28
            r2 = 573(0x23d, float:8.03E-43)
            r1 = 24
            r0 = 80
            java.lang.String r0 = A0Z(r2, r1, r0)
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L67
            r2 = 426(0x1aa, float:5.97E-43)
            r1 = 31
            r0 = 24
            java.lang.String r0 = A0Z(r2, r1, r0)
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L67
        L28:
            java.lang.String r3 = com.facebook.ads.redexgen.X.C0499Hs.A05
            r2 = 147(0x93, float:2.06E-43)
            r1 = 6
            r0 = 111(0x6f, float:1.56E-43)
            java.lang.String r0 = A0Z(r2, r1, r0)
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L69
            java.lang.String r6 = com.facebook.ads.redexgen.X.C0499Hs.A06
            r5 = 143(0x8f, float:2.0E-43)
            r4 = 4
            r3 = 32
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C3M.A0e
            r0 = 5
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 20
            if (r1 == r0) goto L6b
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C3M.A0e
            java.lang.String r1 = "ta8dfTbq5GbSxrQo9R7BCH"
            r0 = 4
            r2[r0] = r1
            java.lang.String r1 = "TLzt7USKw6C8aMs6TrECz9n"
            r0 = 6
            r2[r0] = r1
            java.lang.String r0 = A0Z(r5, r4, r3)
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L69
            boolean r0 = r7.A05
            if (r0 == 0) goto L69
        L67:
            r0 = 1
        L68:
            return r0
        L69:
            r0 = 0
            goto L68
        L6b:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C3M.A0q(com.facebook.ads.redexgen.X.Ct):boolean");
    }

    public static boolean A0r(String str) {
        if (C0499Hs.A02 > 23 || !A0Z(548, 25, 41).equals(str)) {
            if (C0499Hs.A02 <= 19) {
                if (!A0Z(710, 6, 17).equals(C0499Hs.A03) || (!A0Z(457, 31, 33).equals(str) && !A0Z(488, 38, 4).equals(str))) {
                }
            }
            return false;
        }
        return true;
    }

    public static boolean A0s(String str) {
        return C0499Hs.A02 == 21 && A0Z(526, 22, 13).equals(str);
    }

    public static boolean A0t(String str) {
        return C0499Hs.A02 < 18 || (C0499Hs.A02 == 18 && (A0Z(389, 15, 114).equals(str) || A0Z(HttpStatus.SC_NOT_FOUND, 22, 61).equals(str))) || (C0499Hs.A02 == 19 && C0499Hs.A06.startsWith(A0Z(611, 7, 3)) && (A0Z(245, 18, 92).equals(str) || A0Z(263, 25, 38).equals(str)));
    }

    public static boolean A0u(String str, Format format) {
        return C0499Hs.A02 < 21 && format.A0P.isEmpty() && A0Z(313, 25, 73).equals(str);
    }

    public static boolean A0v(String str, Format format) {
        return C0499Hs.A02 <= 18 && format.A05 == 1 && A0Z(288, 25, 82).equals(str);
    }

    private boolean A0w(boolean z) throws C9F {
        if (this.A08 == null || (!z && this.A0c)) {
            return false;
        }
        int A7i = this.A08.A7i();
        if (A7i != 1) {
            return A7i != 4;
        }
        BC A6f = this.A08.A6f();
        int drmSessionState = A0y();
        throw C9F.A01(A6f, drmSessionState);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0388Dh
    public void A12() {
        this.A07 = null;
        try {
            A1G();
            try {
                if (this.A08 != null) {
                    this.A0Z.AEA(this.A08);
                }
                try {
                    if (this.A09 != null && this.A09 != this.A08) {
                        this.A0Z.AEA(this.A09);
                    }
                    this.A08 = null;
                    this.A09 = null;
                    String[] strArr = A0e;
                    if (strArr[7].charAt(15) == strArr[3].charAt(15)) {
                        throw new RuntimeException();
                    }
                    A0e[0] = "7dwj0KBDIsFyzp5b78UdOB5dCWX1QTuU";
                } finally {
                }
            } catch (Throwable th) {
                try {
                    if (this.A09 != null && this.A09 != this.A08) {
                        this.A0Z.AEA(this.A09);
                    }
                    throw th;
                } finally {
                }
            }
        } catch (Throwable th2) {
            try {
                if (this.A08 != null) {
                    this.A0Z.AEA(this.A08);
                }
                try {
                    if (this.A09 != null && this.A09 != this.A08) {
                        this.A0Z.AEA(this.A09);
                    }
                    throw th2;
                } finally {
                }
            } catch (Throwable th3) {
                try {
                    if (this.A09 != null && this.A09 != this.A08) {
                        this.A0Z.AEA(this.A09);
                    }
                    throw th3;
                } finally {
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0388Dh
    public void A13() {
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0388Dh
    public void A14() {
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0388Dh
    public void A15(long j, boolean z) throws C9F {
        this.A0M = false;
        this.A0N = false;
        if (this.A06 != null) {
            A1F();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0388Dh
    public void A16(boolean z) throws C9F {
        this.A0U = new C0335Ap();
    }

    public int A1A(MediaCodec mediaCodec, C0379Ct c0379Ct, Format format, Format format2) {
        return 0;
    }

    public final MediaCodec A1C() {
        return this.A06;
    }

    public final C0379Ct A1D() {
        return this.A0A;
    }

    public C0379Ct A1E(Cz cz2, Format format, boolean z) throws D2 {
        return cz2.A6T(format.A0O, z);
    }

    public void A1F() throws C9F {
        this.A05 = -9223372036854775807L;
        A0h();
        A0i();
        this.A0Q = true;
        this.A0R = false;
        this.A0P = false;
        this.A0b.clear();
        this.A0C = false;
        this.A0O = false;
        if (this.A0H || (this.A0E && this.A0K)) {
            A1G();
            A1I();
        } else if (this.A02 != 0) {
            A1G();
            A1I();
        } else {
            this.A06.flush();
            this.A0J = false;
        }
        if (this.A0L && this.A07 != null) {
            this.A01 = 1;
        }
    }

    public void A1G() {
        this.A05 = -9223372036854775807L;
        A0h();
        A0i();
        this.A0R = false;
        this.A0P = false;
        this.A0b.clear();
        A0g();
        this.A0A = null;
        this.A0L = false;
        this.A0J = false;
        this.A0D = false;
        this.A0H = false;
        this.A00 = 0;
        this.A0G = false;
        this.A0E = false;
        this.A0I = false;
        this.A0C = false;
        this.A0O = false;
        this.A0K = false;
        this.A01 = 0;
        this.A02 = 0;
        if (this.A06 != null) {
            this.A0U.A01++;
            try {
                this.A06.stop();
                try {
                    this.A06.release();
                    this.A06 = null;
                    BE<C0859Wa> be = this.A08;
                    if (be != null && this.A09 != be) {
                        try {
                            this.A0Z.AEA(be);
                        } finally {
                        }
                    }
                } catch (Throwable th) {
                    this.A06 = null;
                    BE<C0859Wa> be2 = this.A08;
                    if (A0e[1].charAt(18) != 'w') {
                        throw new RuntimeException();
                    }
                    A0e[1] = "xSjaYNEZ4qh1ZPx8xTwjTufaVWwElX5P";
                    if (be2 != null && this.A09 != be2) {
                        try {
                            this.A0Z.AEA(be2);
                        } finally {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    this.A06.release();
                    this.A06 = null;
                    BE<C0859Wa> be3 = this.A08;
                    if (be3 != null && this.A09 != be3) {
                        try {
                            this.A0Z.AEA(be3);
                        } finally {
                        }
                    }
                    throw th2;
                } catch (Throwable th3) {
                    this.A06 = null;
                    BE<C0859Wa> be4 = this.A08;
                    if (be4 != null) {
                        BE<C0859Wa> be5 = this.A09;
                        if (A0e[1].charAt(18) != 'w') {
                            throw new RuntimeException();
                        }
                        A0e[0] = "vD6SaWSNQpnT2etBhelIXAl4LKAzAMEb";
                        if (be5 != be4) {
                            try {
                                this.A0Z.AEA(be4);
                            } finally {
                            }
                        }
                    }
                    throw th3;
                }
            }
        }
    }

    public void A1H() throws C9F {
    }

    public final void A1I() throws C9F {
        Format format;
        long j;
        if (this.A06 != null || (format = this.A07) == null) {
            return;
        }
        this.A08 = this.A09;
        String str = format.A0O;
        MediaCrypto mediaCrypto = null;
        String[] strArr = A0e;
        if (strArr[7].charAt(15) == strArr[3].charAt(15)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0e;
        strArr2[7] = "pTVSxclXptnWdkcsOldSnbHbt080oNsP";
        strArr2[3] = "3A2dqVKC7anzB9bdQIqtLGHUlM9PHMrl";
        boolean z = false;
        BE<C0859Wa> be = this.A08;
        if (be != null) {
            C0859Wa A75 = be.A75();
            if (A75 == null) {
                if (this.A08.A6f() == null) {
                    return;
                }
            } else {
                mediaCrypto = A75.A00();
                z = A75.A01(str);
            }
            if (A0l()) {
                int A7i = this.A08.A7i();
                if (A7i != 1) {
                    if (A7i != 4) {
                        return;
                    }
                } else {
                    throw C9F.A01(this.A08.A6f(), A0y());
                }
            }
        }
        C0379Ct c0379Ct = this.A0A;
        String[] strArr3 = A0e;
        String str2 = strArr3[4];
        String mimeType = strArr3[6];
        if (str2.length() == mimeType.length()) {
            throw new RuntimeException();
        }
        A0e[5] = "oPP6wTkKkwktIyM";
        if (c0379Ct == null) {
            try {
                this.A0A = A1E(this.A0a, this.A07, z);
                if (this.A0A == null && z) {
                    this.A0A = A1E(this.A0a, this.A07, false);
                    if (this.A0A != null) {
                        String A0Z = A0Z(227, 18, 86);
                        StringBuilder sb = new StringBuilder();
                        String mimeType2 = A0Z(153, 40, 125);
                        sb.append(mimeType2);
                        sb.append(str);
                        String mimeType3 = A0Z(0, 58, 64);
                        sb.append(mimeType3);
                        String mimeType4 = this.A0A.A02;
                        sb.append(mimeType4);
                        String mimeType5 = A0Z(58, 1, 4);
                        sb.append(mimeType5);
                        String mimeType6 = sb.toString();
                        Log.w(A0Z, mimeType6);
                    }
                }
            } catch (D2 e) {
                A0k(new C0380Cv(this.A07, e, z, -49998));
            }
            if (this.A0A == null) {
                A0k(new C0380Cv(this.A07, (Throwable) null, z, -49999));
            }
        }
        if (!A1Q(this.A0A)) {
            return;
        }
        String str3 = this.A0A.A02;
        this.A00 = A0W(str3);
        this.A0D = A0u(str3, this.A07);
        this.A0H = A0t(str3);
        this.A0G = A0q(this.A0A);
        this.A0E = A0r(str3);
        this.A0F = A0s(str3);
        this.A0I = A0v(str3, this.A07);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            StringBuilder sb2 = new StringBuilder();
            String mimeType7 = A0Z(659, 12, 39);
            sb2.append(mimeType7);
            sb2.append(str3);
            String mimeType8 = sb2.toString();
            C0496Hp.A02(mimeType8);
            this.A06 = MediaCodec.createByCodecName(str3);
            C0496Hp.A00();
            String mimeType9 = A0Z(645, 14, 94);
            C0496Hp.A02(mimeType9);
            A1N(this.A0A, this.A06, this.A07, mediaCrypto);
            C0496Hp.A00();
            String mimeType10 = A0Z(722, 10, 55);
            C0496Hp.A02(mimeType10);
            this.A06.start();
            C0496Hp.A00();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            A1O(str3, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
            A0c();
        } catch (Exception e2) {
            A0k(new C0380Cv(this.A07, e2, z, str3));
        }
        if (A7i() == 2) {
            long elapsedRealtime3 = SystemClock.elapsedRealtime();
            String mimeType11 = A0e[5];
            if (mimeType11.length() == 20) {
                throw new RuntimeException();
            }
            A0e[0] = "PmY0JvPcAmgMlvk30PUrAfvygqaUDHom";
            j = elapsedRealtime3 + 1000;
        } else {
            j = -9223372036854775807L;
        }
        this.A05 = j;
        A0h();
        A0i();
        this.A0Q = true;
        this.A0U.A00++;
    }

    public void A1J(long j) {
    }

    public void A1K(MediaCodec mediaCodec, MediaFormat mediaFormat) throws C9F {
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x008d, code lost:
        if (r0.A08 == r4.A08) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A1L(com.facebook.ads.internal.exoplayer2.thirdparty.Format r7) throws com.facebook.ads.redexgen.X.C9F {
        /*
            r6 = this;
            com.facebook.ads.internal.exoplayer2.thirdparty.Format r4 = r6.A07
            r6.A07 = r7
            com.facebook.ads.internal.exoplayer2.thirdparty.Format r0 = r6.A07
            com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData r2 = r0.A0H
            r1 = 0
            if (r4 != 0) goto L6c
            r0 = r1
        Lc:
            boolean r0 = com.facebook.ads.redexgen.X.C0499Hs.A0g(r2, r0)
            r3 = 1
            r0 = r0 ^ r3
            if (r0 == 0) goto L37
            com.facebook.ads.internal.exoplayer2.thirdparty.Format r0 = r6.A07
            com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData r0 = r0.A0H
            if (r0 == 0) goto L69
            com.facebook.ads.redexgen.X.BF<com.facebook.ads.redexgen.X.Wa> r2 = r6.A0Z
            if (r2 == 0) goto Lac
            android.os.Looper r1 = android.os.Looper.myLooper()
            com.facebook.ads.internal.exoplayer2.thirdparty.Format r0 = r6.A07
            com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData r0 = r0.A0H
            com.facebook.ads.redexgen.X.BE r0 = r2.A2Q(r1, r0)
            r6.A09 = r0
            com.facebook.ads.redexgen.X.BE<com.facebook.ads.redexgen.X.Wa> r1 = r6.A09
            com.facebook.ads.redexgen.X.BE<com.facebook.ads.redexgen.X.Wa> r0 = r6.A08
            if (r1 != r0) goto L37
            com.facebook.ads.redexgen.X.BF<com.facebook.ads.redexgen.X.Wa> r0 = r6.A0Z
            r0.AEA(r1)
        L37:
            r5 = 0
            com.facebook.ads.redexgen.X.BE<com.facebook.ads.redexgen.X.Wa> r1 = r6.A09
            com.facebook.ads.redexgen.X.BE<com.facebook.ads.redexgen.X.Wa> r0 = r6.A08
            if (r1 != r0) goto L9c
            android.media.MediaCodec r2 = r6.A06
            if (r2 == 0) goto L9c
            com.facebook.ads.redexgen.X.Ct r1 = r6.A0A
            com.facebook.ads.internal.exoplayer2.thirdparty.Format r0 = r6.A07
            int r1 = r6.A1A(r2, r1, r4, r0)
            if (r1 == 0) goto L9c
            if (r1 == r3) goto L9b
            r0 = 3
            if (r1 != r0) goto L95
            r5 = 1
            r6.A0L = r3
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C3M.A0e
            r0 = 1
            r1 = r1[r0]
            r0 = 18
            char r1 = r1.charAt(r0)
            r0 = 119(0x77, float:1.67E-43)
            if (r1 == r0) goto L6f
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L69:
            r6.A09 = r1
            goto L37
        L6c:
            com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData r0 = r4.A0H
            goto Lc
        L6f:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C3M.A0e
            java.lang.String r1 = "470Pj9QxuaVscsy8pk25MlpSOfE9YJj"
            r0 = 5
            r2[r0] = r1
            r6.A01 = r3
            int r1 = r6.A00
            r0 = 2
            if (r1 == r0) goto L8f
            if (r1 != r3) goto L93
            com.facebook.ads.internal.exoplayer2.thirdparty.Format r0 = r6.A07
            int r1 = r0.A0F
            int r0 = r4.A0F
            if (r1 != r0) goto L93
            com.facebook.ads.internal.exoplayer2.thirdparty.Format r0 = r6.A07
            int r1 = r0.A08
            int r0 = r4.A08
            if (r1 != r0) goto L93
        L8f:
            r0 = 1
        L90:
            r6.A0C = r0
            goto L9c
        L93:
            r0 = 0
            goto L90
        L95:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L9b:
            r5 = 1
        L9c:
            if (r5 != 0) goto La4
            boolean r0 = r6.A0J
            if (r0 == 0) goto La5
            r6.A02 = r3
        La4:
            return
        La5:
            r6.A1G()
            r6.A1I()
            goto La4
        Lac:
            r2 = 193(0xc1, float:2.7E-43)
            r1 = 34
            r0 = 51
            java.lang.String r0 = A0Z(r2, r1, r0)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            int r0 = r6.A0y()
            com.facebook.ads.redexgen.X.9F r0 = com.facebook.ads.redexgen.X.C9F.A01(r1, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C3M.A1L(com.facebook.ads.internal.exoplayer2.thirdparty.Format):void");
    }

    public void A1M(C0865Wg c0865Wg) {
    }

    public void A1O(String str, long j, long j2) {
    }

    public boolean A1Q(C0379Ct c0379Ct) {
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0879Wu
    public boolean A8h() {
        return this.A0N;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0879Wu
    public boolean A8r() {
        return (this.A07 == null || this.A0R || (!A18() && !A0n() && (this.A05 == -9223372036854775807L || SystemClock.elapsedRealtime() >= this.A05))) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0062, code lost:
        if (r6.A06 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0064, code lost:
        com.facebook.ads.redexgen.X.C0496Hp.A02(A0Z(671, 12, 65));
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0075, code lost:
        if (A0p(r7, r9) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0081, code lost:
        if (r6.A06 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0088, code lost:
        if (A0m() == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x008b, code lost:
        r6.A0U.A07 += A0z(r7);
        r6.A0Y.A07();
        r0 = A10(r6.A0W, r6.A0Y, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00a4, code lost:
        if (r0 != (-5)) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00a6, code lost:
        A1L(r6.A0W.A00);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00ae, code lost:
        if (r0 != (-4)) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00b0, code lost:
        com.facebook.ads.redexgen.X.HD.A04(r6.A0Y.A04());
        r6.A0M = true;
        A0d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00bf, code lost:
        com.facebook.ads.redexgen.X.C0496Hp.A00();
     */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0879Wu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void AEH(long r7, long r9) throws com.facebook.ads.redexgen.X.C9F {
        /*
            Method dump skipped, instructions count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C3M.AEH(long, long):void");
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03089n
    public final int AFY(Format format) throws C9F {
        try {
            return A1B(this.A0a, this.A0Z, format);
        } catch (D2 e) {
            throw C9F.A01(e, A0y());
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0388Dh, com.facebook.ads.redexgen.X.InterfaceC03089n
    public final int AFa() {
        return 8;
    }
}
