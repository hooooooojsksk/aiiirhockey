package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.games.GamesStatusCodes;
import com.mobirix.airhockey.airhockey;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import kotlin.jvm.internal.ByteCompanionObject;

/* renamed from: com.facebook.ads.redexgen.X.Wn */
/* loaded from: assets/audience_network.dex */
public final class C0872Wn implements AR {
    public static boolean A0p;
    public static boolean A0q;
    public static byte[] A0r;
    public static String[] A0s = {"hUCCDXcY4t01difYD4QJmSlSRe7RVS9F", "yHOnf8lHgEM0FI0EKX1KbB3TaozNa", "kXByBOPR65DToxooqsu0gGt9HKAYl4Vo", "NIkyagP1AzDGImvyfrRhWneTEqqmK", "aXPRHAu0VDe5efXXlwPVbrYy41", "xYrm6yKJij65q9D2CisZETvgfz", "Fi2DTXQipqprJDEroL63LN5SWS4FAMqA", "8o6UBOAn3xAy4ZEKn0SjK2UR42QgxF0P"};
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public long A0E;
    public long A0F;
    public long A0G;
    public long A0H;
    public long A0I;
    public long A0J;
    public long A0K;
    public long A0L;
    public AudioTrack A0M;
    @Nullable
    public AudioTrack A0N;
    @Nullable
    public C02959a A0O;
    public C02959a A0P;
    public A6 A0Q;
    @Nullable
    public AP A0R;
    @Nullable
    public ByteBuffer A0S;
    @Nullable
    public ByteBuffer A0T;
    @Nullable
    public ByteBuffer A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public byte[] A0c;
    public AE[] A0d;
    public ByteBuffer[] A0e;
    public final ConditionVariable A0f;
    @Nullable
    public final A7 A0g;
    public final AX A0h;
    public final C0875Wq A0i;
    public final InterfaceC0320Aa A0j;
    public final C0866Wh A0k;
    public final ArrayDeque<C0322Ac> A0l;
    public final boolean A0m;
    public final AE[] A0n;
    public final AE[] A0o;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private AudioTrack A0F(int i) {
        return new AudioTrack(3, GamesStatusCodes.STATUS_SNAPSHOT_NOT_FOUND, 4, 2, 2, 0, i);
    }

    public static String A0I(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0r, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 10);
        }
        return new String(copyOfRange);
    }

    public static void A0O() {
        A0r = new byte[]{33, 45, airhockey.J_GAME_EXIT, airhockey.J_NATION, airhockey.J_WAIT, 45, 82, 102, 119, airhockey.J_PURCHASE, 124, airhockey.P_GAME_MYWIN, airhockey.J_SDKVER, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_GOO, airhockey.J_ACHIEVEMENTCALLBACK, 47, 2, 24, 8, 4, 5, 31, 2, 5, 30, 2, 31, 18, 75, 15, 14, 31, 14, 8, 31, 14, 15, 75, 48, 14, 19, 27, 14, 8, 31, 14, 15, 75, 33, 57, 38, 43, 38, 46, 78, airhockey.J_WAIT, 111, airhockey.J_WAIT, airhockey.J_ENEMYLOSE, airhockey.J_ENEMYLOSE, airhockey.J_ERROR, airhockey.J_SAVEDGAME_RELOAD, 123, 60, 111, airhockey.J_ENEMYLOSE, 125, airhockey.J_GOO, airhockey.J_GOO, airhockey.J_WAIT, airhockey.J_ACHIEVEMENTCALLBACK, 60, 125, airhockey.J_GAME_REMATCH, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_ERROR, airhockey.J_SAVEDGAME_SAVE, 60, airhockey.J_ENEMYLOSE, airhockey.J_INVITE, 125, ByteCompanionObject.MAX_VALUE, 119, 46, 21, 30, 3, 11, 30, 24, 15, 30, 31, 91, 26, 14, 31, 18, 20, 91, 30, 21, 24, 20, 31, 18, 21, 28, 65, 91, 58, 1, 28, 26, 31, 31, 0, 29, 27, 10, 11, 79, 12, 7, 14, 1, 1, 10, 3, 79, 12, 0, 26, 1, 27, 85, 79, 24, airhockey.J_WAIT, airhockey.J_GOO, airhockey.J_GAME_DISCONNECT, airhockey.J_GAME_ENEMYEXIT, airhockey.J_PURCHASE, 109, 41, 58, 40, 58};
    }

    /* JADX WARN: Code restructure failed: missing block: B:237:0x01f7, code lost:
        if (r5 != 5) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x01fa, code lost:
        if (r5 != 6) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x01fc, code lost:
        r10.A02 = 20480;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x020d, code lost:
        if (r5 != 5) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0211, code lost:
        if (r5 != 7) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x0213, code lost:
        r10.A02 = 49152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x021a, code lost:
        r10.A02 = 294912;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:?, code lost:
        return;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Removed duplicated region for block: B:202:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0221  */
    @Override // com.facebook.ads.redexgen.X.AR
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A49(int r11, int r12, int r13, int r14, @androidx.annotation.Nullable int[] r15, int r16, int r17) throws com.facebook.ads.redexgen.X.AN {
        /*
            Method dump skipped, instructions count: 568
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0872Wn.A49(int, int, int, int, int[], int, int):void");
    }

    static {
        A0O();
        A0p = false;
        A0q = false;
    }

    public C0872Wn(@Nullable A7 a7, InterfaceC0320Aa interfaceC0320Aa, boolean z) {
        this.A0g = a7;
        this.A0j = (InterfaceC0320Aa) HD.A01(interfaceC0320Aa);
        this.A0m = z;
        this.A0f = new ConditionVariable(true);
        this.A0h = new AX(new C0873Wo(this, null));
        this.A0i = new C0875Wq();
        this.A0k = new C0866Wh();
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new C0869Wk(), this.A0i, this.A0k);
        Collections.addAll(arrayList, interfaceC0320Aa.A5n());
        this.A0o = (AE[]) arrayList.toArray(new AE[arrayList.size()]);
        this.A0n = new AE[]{new C0871Wm()};
        this.A00 = 1.0f;
        this.A0D = 0;
        this.A0Q = A6.A04;
        this.A01 = 0;
        this.A0P = C02959a.A04;
        this.A04 = -1;
        this.A0d = new AE[0];
        this.A0e = new ByteBuffer[0];
        this.A0l = new ArrayDeque<>();
    }

    public C0872Wn(@Nullable A7 a7, AE[] aeArr) {
        this(a7, aeArr, false);
    }

    public C0872Wn(@Nullable A7 a7, AE[] aeArr, boolean z) {
        this(a7, new C0874Wp(aeArr), z);
    }

    public static int A00(int i, ByteBuffer byteBuffer) {
        if (i == 7 || i == 8) {
            return C0324Ae.A00(byteBuffer);
        }
        if (i == 5) {
            return A3.A00();
        }
        if (i == 6) {
            int A03 = A3.A03(byteBuffer);
            String[] strArr = A0s;
            if (strArr[2].charAt(5) != strArr[7].charAt(5)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0s;
            strArr2[4] = "kQJQgIYBfsXVI0BXiDfXFh8Y0v";
            strArr2[5] = "xmKGBElaJ1P1UFLQWjzE2KvoVx";
            return A03;
        } else if (i == 14) {
            int A02 = A3.A02(byteBuffer);
            if (A02 == -1) {
                return 0;
            }
            int syncframeOffset = A3.A04(byteBuffer, A02);
            return syncframeOffset * 16;
        } else {
            throw new IllegalStateException(A0I(84, 27, 113) + i);
        }
    }

    @TargetApi(21)
    public static int A01(AudioTrack audioTrack, ByteBuffer byteBuffer, int i) {
        return audioTrack.write(byteBuffer, i, 1);
    }

    @TargetApi(21)
    private int A02(AudioTrack audioTrack, ByteBuffer byteBuffer, int i, long j) {
        if (this.A0S == null) {
            this.A0S = ByteBuffer.allocate(16);
            this.A0S.order(ByteOrder.BIG_ENDIAN);
            this.A0S.putInt(1431633921);
        }
        if (this.A03 == 0) {
            this.A0S.putInt(4, i);
            this.A0S.putLong(8, 1000 * j);
            this.A0S.position(0);
            this.A03 = i;
        }
        int remaining = this.A0S.remaining();
        String[] strArr = A0s;
        if (strArr[4].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0s;
        strArr2[6] = "ZxHEhXNaRaOeicOuVS0y7eKtBmJV15x7";
        strArr2[0] = "lpmrRXkhPpBf5A8LovnLhyOg75mNhzFm";
        if (remaining > 0) {
            int avSyncHeaderBytesRemaining = audioTrack.write(this.A0S, remaining, 1);
            if (avSyncHeaderBytesRemaining < 0) {
                this.A03 = 0;
                return avSyncHeaderBytesRemaining;
            } else if (avSyncHeaderBytesRemaining < remaining) {
                return 0;
            }
        }
        int A01 = A01(audioTrack, byteBuffer, i);
        if (A01 < 0) {
            this.A03 = 0;
            String[] strArr3 = A0s;
            String str = strArr3[6];
            String str2 = strArr3[0];
            int charAt = str.charAt(5);
            int avSyncHeaderBytesRemaining2 = str2.charAt(5);
            if (charAt != avSyncHeaderBytesRemaining2) {
                throw new RuntimeException();
            }
            String[] strArr4 = A0s;
            strArr4[6] = "98oBXXwj84JUUigMvdtlS6TYqH9EDAiG";
            strArr4[0] = "VyAxkX5UR8Pe4wLdxiezRSIVcQQDizsa";
            return A01;
        }
        int avSyncHeaderBytesRemaining3 = this.A03;
        this.A03 = avSyncHeaderBytesRemaining3 - A01;
        return A01;
    }

    public long A03() {
        return this.A0X ? this.A0J / this.A0B : this.A0I;
    }

    public long A04() {
        return this.A0X ? this.A0L / this.A09 : this.A0K;
    }

    private long A05(long j) {
        return A08(this.A0j.A7h()) + j;
    }

    private long A06(long j) {
        C02959a c02959a;
        long j2;
        long j3;
        long j4;
        C0322Ac c0322Ac = null;
        while (!this.A0l.isEmpty()) {
            C0322Ac checkpoint = this.A0l.getFirst();
            j4 = checkpoint.A01;
            if (j < j4) {
                break;
            }
            C0322Ac remove = this.A0l.remove();
            String[] strArr = A0s;
            if (strArr[1].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0s;
            strArr2[1] = "EqLX22Mle1kVg1sX5ZT6YkRLc5f35";
            strArr2[3] = "gdY2b1urbXezKivfsFNrjnMWNzK4t";
            c0322Ac = remove;
        }
        if (c0322Ac != null) {
            c02959a = c0322Ac.A02;
            this.A0P = c02959a;
            j2 = c0322Ac.A01;
            this.A0G = j2;
            j3 = c0322Ac.A00;
            this.A0F = j3 - this.A0H;
        }
        if (this.A0P.A01 == 1.0f) {
            return (this.A0F + j) - this.A0G;
        }
        if (this.A0l.isEmpty()) {
            return this.A0F + this.A0j.A76(j - this.A0G);
        }
        return this.A0F + C0499Hs.A0C(j - this.A0G, this.A0P.A01);
    }

    private long A07(long j) {
        return (this.A0A * j) / 1000000;
    }

    private long A08(long j) {
        return (1000000 * j) / this.A0A;
    }

    private long A09(long j) {
        return (1000000 * j) / this.A06;
    }

    @TargetApi(21)
    private AudioTrack A0D() {
        AudioAttributes A00;
        if (this.A0b) {
            A00 = new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        } else {
            A00 = this.A0Q.A00();
        }
        AudioFormat build = new AudioFormat.Builder().setChannelMask(this.A07).setEncoding(this.A08).setSampleRate(this.A0A).build();
        int audioSessionId = this.A01;
        if (audioSessionId == 0) {
            audioSessionId = 0;
        }
        return new AudioTrack(A00, build, this.A02, 1, audioSessionId);
    }

    private AudioTrack A0E() throws AO {
        AudioTrack audioTrack;
        if (C0499Hs.A02 >= 21) {
            audioTrack = A0D();
        } else {
            int A03 = C0499Hs.A03(this.A0Q.A03);
            int i = this.A01;
            if (i == 0) {
                audioTrack = new AudioTrack(A03, this.A0A, this.A07, this.A08, this.A02, 1);
            } else {
                audioTrack = new AudioTrack(A03, this.A0A, this.A07, this.A08, this.A02, 1, i);
            }
        }
        int state = audioTrack.getState();
        if (state == 1) {
            return audioTrack;
        }
        try {
            audioTrack.release();
        } catch (Exception unused) {
        }
        throw new AO(state, this.A0A, this.A07, this.A02);
    }

    private void A0J() {
        int i = 0;
        while (true) {
            AE[] aeArr = this.A0d;
            int i2 = aeArr.length;
            if (i < i2) {
                AE ae = aeArr[i];
                ae.flush();
                this.A0e[i] = ae.A7D();
                i++;
            } else {
                return;
            }
        }
    }

    private void A0K() throws AO {
        C02959a c02959a;
        this.A0f.block();
        this.A0M = A0E();
        int audioSessionId = this.A0M.getAudioSessionId();
        if (A0p && C0499Hs.A02 < 21) {
            AudioTrack audioTrack = this.A0N;
            if (audioTrack != null) {
                int audioSessionId2 = audioTrack.getAudioSessionId();
                if (audioSessionId != audioSessionId2) {
                    A0L();
                }
            }
            if (this.A0N == null) {
                this.A0N = A0F(audioSessionId);
            }
        }
        int audioSessionId3 = this.A01;
        if (audioSessionId3 != audioSessionId) {
            this.A01 = audioSessionId;
            AP ap = this.A0R;
            if (ap != null) {
                ap.AAK(audioSessionId);
            }
        }
        if (this.A0V) {
            c02959a = this.A0j.A3R(this.A0P);
        } else {
            c02959a = C02959a.A04;
        }
        this.A0P = c02959a;
        A0N();
        AX ax = this.A0h;
        AudioTrack audioTrack2 = this.A0M;
        int i = this.A08;
        int i2 = this.A09;
        int audioSessionId4 = this.A02;
        ax.A0G(audioTrack2, i, i2, audioSessionId4);
        A0M();
    }

    private void A0L() {
        if (this.A0N == null) {
            return;
        }
        AudioTrack audioTrack = this.A0N;
        this.A0N = null;
        new AZ(this, audioTrack).start();
    }

    private void A0M() {
        if (!A0U()) {
            return;
        }
        if (C0499Hs.A02 >= 21) {
            A0Q(this.A0M, this.A00);
            return;
        }
        AudioTrack audioTrack = this.A0M;
        String[] strArr = A0s;
        if (strArr[4].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0s;
        strArr2[2] = "RUPACOvpiKp7bcWaTWyqVFSR7GtEantX";
        strArr2[7] = "RzQzoOWLdvYkkdkBCtRhC7yU7hWBsadG";
        A0R(audioTrack, this.A00);
    }

    private void A0N() {
        AE[] A0V;
        ArrayList arrayList = new ArrayList();
        for (AE ae : A0V()) {
            if (ae.A8c()) {
                arrayList.add(ae);
            } else {
                ae.flush();
            }
        }
        int count = arrayList.size();
        this.A0d = (AE[]) arrayList.toArray(new AE[count]);
        this.A0e = new ByteBuffer[count];
        A0J();
    }

    private void A0P(long j) throws AQ {
        ByteBuffer input;
        int length = this.A0d.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                int count = i - 1;
                input = this.A0e[count];
            } else {
                input = this.A0T;
                if (input == null) {
                    input = AE.A00;
                }
            }
            if (i == length) {
                A0S(input, j);
            } else {
                AE ae = this.A0d[i];
                ae.ADn(input);
                ByteBuffer A7D = ae.A7D();
                this.A0e[i] = A7D;
                if (A7D.hasRemaining()) {
                    i++;
                }
            }
            boolean hasRemaining = input.hasRemaining();
            String[] strArr = A0s;
            String str = strArr[4];
            String str2 = strArr[5];
            int index = str.length();
            int count2 = str2.length();
            if (index != count2) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0s;
            strArr2[2] = "GvJ2yOfBgit1iG3ukbpo3ztMvZtxyKui";
            strArr2[7] = "YNNwMOgGE9szKpvyLkHk1WmQlE5xjnt7";
            if (hasRemaining) {
                return;
            }
            i--;
        }
    }

    @TargetApi(21)
    public static void A0Q(AudioTrack audioTrack, float f) {
        audioTrack.setVolume(f);
    }

    public static void A0R(AudioTrack audioTrack, float f) {
        audioTrack.setStereoVolume(f, f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x0124, code lost:
        if (r0 < r4) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x013a, code lost:
        r2 = com.facebook.ads.redexgen.X.C0872Wn.A0s;
        r2[1] = "kN0r3XGSyaPXiD1vfn2KbuLuaogzQ";
        r2[3] = "5GR7LVehK4lLnlCMYxENCKp6B9195";
        r11.A0U = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0148, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x009f, code lost:
        if (r3 == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x00a1, code lost:
        r11.A0K += r11.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00a9, code lost:
        r2 = com.facebook.ads.redexgen.X.C0872Wn.A0s;
        r1 = r2[2];
        r2 = r2[7];
        r1 = r1.charAt(5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00bb, code lost:
        if (r1 == r2.charAt(5)) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x00cb, code lost:
        if (r3 == false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A0S(java.nio.ByteBuffer r12, long r13) throws com.facebook.ads.redexgen.X.AQ {
        /*
            Method dump skipped, instructions count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0872Wn.A0S(java.nio.ByteBuffer, long):void");
    }

    private boolean A0T() throws AQ {
        boolean z = false;
        if (this.A04 == -1) {
            boolean audioProcessorNeedsEndOfStream = this.A0Z;
            this.A04 = audioProcessorNeedsEndOfStream ? 0 : this.A0d.length;
            z = true;
        }
        while (true) {
            int i = this.A04;
            AE[] aeArr = this.A0d;
            if (i < aeArr.length) {
                AE ae = aeArr[i];
                if (z) {
                    ae.ADm();
                }
                A0P(-9223372036854775807L);
                boolean audioProcessorNeedsEndOfStream2 = ae.A8h();
                if (!audioProcessorNeedsEndOfStream2) {
                    return false;
                }
                z = true;
                this.A04++;
            } else {
                ByteBuffer byteBuffer = this.A0U;
                if (byteBuffer != null) {
                    A0S(byteBuffer, -9223372036854775807L);
                    if (this.A0U != null) {
                        return false;
                    }
                }
                this.A04 = -1;
                return true;
            }
        }
    }

    private boolean A0U() {
        return this.A0M != null;
    }

    private AE[] A0V() {
        if (this.A0a) {
            return this.A0n;
        }
        return this.A0o;
    }

    @Override // com.facebook.ads.redexgen.X.AR
    public final void A4r() {
        if (this.A0b) {
            this.A0b = false;
            this.A01 = 0;
            reset();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AR
    public final void A5E(int i) {
        HD.A04(C0499Hs.A02 >= 21);
        if (this.A0b) {
            int i2 = this.A01;
            String[] strArr = A0s;
            if (strArr[1].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0s;
            strArr2[2] = "PS7IBOM7NZDOoVGPPjdQOv1dv3IkizxK";
            strArr2[7] = "jjqtzOvKeeqNL4elNx3MZRV4owozeHXU";
            if (i2 == i) {
                return;
            }
        }
        this.A0b = true;
        this.A01 = i;
        reset();
    }

    @Override // com.facebook.ads.redexgen.X.AR
    public final long A6M(boolean z) {
        if (!A0U() || this.A0D == 0) {
            return Long.MIN_VALUE;
        }
        long A0C = this.A0h.A0C(z);
        long positionUs = A04();
        return this.A0H + A05(A06(Math.min(A0C, A08(positionUs))));
    }

    @Override // com.facebook.ads.redexgen.X.AR
    public final C02959a A7O() {
        return this.A0P;
    }

    @Override // com.facebook.ads.redexgen.X.AR
    public final boolean A88(ByteBuffer byteBuffer, long j) throws AO, AQ {
        ByteBuffer byteBuffer2 = this.A0T;
        HD.A03(byteBuffer2 == null || byteBuffer == byteBuffer2);
        boolean A0U = A0U();
        String[] strArr = A0s;
        if (strArr[4].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0s;
        strArr2[6] = "RcCB0XsFwDDOAw3euoH2B524NJP5PtQP";
        strArr2[0] = "S6sRDXDIUBrBns4w0IFsbKHJgfJaiswv";
        if (!A0U) {
            A0K();
            if (this.A0Y) {
                ADW();
            }
        }
        if (this.A0h.A0L(A04())) {
            ByteBuffer byteBuffer3 = this.A0T;
            String A0I = A0I(6, 10, 25);
            if (byteBuffer3 == null) {
                if (!byteBuffer.hasRemaining()) {
                    return true;
                }
                if (!this.A0X && this.A05 == 0) {
                    this.A05 = A00(this.A08, byteBuffer);
                    if (this.A05 == 0) {
                        return true;
                    }
                }
                if (this.A0O != null) {
                    if (!A0T()) {
                        return false;
                    }
                    C02959a c02959a = this.A0O;
                    this.A0O = null;
                    this.A0l.add(new C0322Ac(this.A0j.A3R(c02959a), Math.max(0L, j), A08(A04()), null));
                    A0N();
                }
                if (this.A0D == 0) {
                    this.A0H = Math.max(0L, j);
                    this.A0D = 1;
                } else {
                    long expectedPresentationTimeUs = this.A0H + A09(A03());
                    if (this.A0D == 1 && Math.abs(expectedPresentationTimeUs - j) > 200000) {
                        Log.e(A0I, A0I(16, 33, 97) + expectedPresentationTimeUs + A0I(0, 6, 7) + j + A0I(138, 1, 79));
                        this.A0D = 2;
                    }
                    if (this.A0D == 2) {
                        this.A0H += j - expectedPresentationTimeUs;
                        this.A0D = 1;
                        AP ap = this.A0R;
                        if (ap != null) {
                            ap.AC6();
                        }
                    }
                }
                if (this.A0X) {
                    this.A0J += byteBuffer.remaining();
                } else {
                    this.A0I += this.A05;
                }
                this.A0T = byteBuffer;
            }
            if (!this.A0Z) {
                A0S(this.A0T, j);
            } else {
                A0P(j);
            }
            if (!this.A0T.hasRemaining()) {
                this.A0T = null;
                return true;
            } else if (this.A0h.A0K(A04())) {
                Log.w(A0I, A0I(55, 29, 22));
                reset();
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.AR
    public final void A8B() {
        if (this.A0D == 1) {
            this.A0D = 2;
        }
    }

    @Override // com.facebook.ads.redexgen.X.AR
    public final boolean A8G() {
        if (A0U()) {
            boolean A0J = this.A0h.A0J(A04());
            String[] strArr = A0s;
            if (strArr[4].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0s;
            strArr2[4] = "9qaAbWK7Rz0EURQ8gVPoKZJ79p";
            strArr2[5] = "PQsLZF4zdgMsSCMdKk30KO6aPE";
            if (A0J) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.AR
    public final boolean A8g(int i) {
        if (C0499Hs.A0c(i)) {
            return i != 4 || C0499Hs.A02 >= 21;
        }
        A7 a7 = this.A0g;
        return a7 != null && a7.A04(i);
    }

    @Override // com.facebook.ads.redexgen.X.AR
    public final boolean A8h() {
        return !A0U() || (this.A0W && !A8G());
    }

    @Override // com.facebook.ads.redexgen.X.AR
    public final void ADW() {
        this.A0Y = true;
        if (A0U()) {
            this.A0h.A0E();
            this.A0M.play();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AR
    public final void ADX() throws AQ {
        if (!this.A0W && A0U() && A0T()) {
            this.A0h.A0F(A04());
            String[] strArr = A0s;
            if (strArr[4].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0s;
            strArr2[1] = "3Beu4rQqJml6K6p71ugtSnl6z4kve";
            strArr2[3] = "vTiWK9GhFZyDb3TQGI4eNztci47gx";
            this.A0M.stop();
            this.A03 = 0;
            this.A0W = true;
        }
    }

    @Override // com.facebook.ads.redexgen.X.AR
    public final void AE4() {
        reset();
        A0L();
        for (AE ae : this.A0o) {
            ae.reset();
        }
        for (AE ae2 : this.A0n) {
            ae2.reset();
        }
        this.A01 = 0;
        this.A0Y = false;
    }

    @Override // com.facebook.ads.redexgen.X.AR
    public final void AEo(A6 a6) {
        if (this.A0Q.equals(a6)) {
            return;
        }
        this.A0Q = a6;
        if (this.A0b) {
            return;
        }
        reset();
        this.A01 = 0;
    }

    @Override // com.facebook.ads.redexgen.X.AR
    public final void AEy(AP ap) {
        this.A0R = ap;
    }

    @Override // com.facebook.ads.redexgen.X.AR
    public final C02959a AF4(C02959a c02959a) {
        if (A0U() && !this.A0V) {
            this.A0P = C02959a.A04;
            return this.A0P;
        }
        C02959a c02959a2 = this.A0O;
        String[] strArr = A0s;
        if (strArr[6].charAt(5) != strArr[0].charAt(5)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0s;
        strArr2[1] = "qknQOXr2sfI1wZbS1fFTxKCHwtwOF";
        strArr2[3] = "6hx8Cx11JAWA8IEiphxLzKnZtiWJj";
        if (c02959a2 == null) {
            if (!this.A0l.isEmpty()) {
                c02959a2 = this.A0l.getLast().A02;
            } else {
                c02959a2 = this.A0P;
            }
        }
        boolean equals = c02959a.equals(c02959a2);
        String[] strArr3 = A0s;
        if (strArr3[6].charAt(5) != strArr3[0].charAt(5)) {
            throw new RuntimeException();
        }
        String[] strArr4 = A0s;
        strArr4[4] = "rapNwYGl5aH6wSWwsREtxqAYY9";
        strArr4[5] = "Swk5nrnVyktI66zCHmEiilSuas";
        if (!equals) {
            if (A0U()) {
                this.A0O = c02959a;
            } else {
                C02959a lastSetPlaybackParameters = this.A0j.A3R(c02959a);
                this.A0P = lastSetPlaybackParameters;
            }
        }
        C02959a lastSetPlaybackParameters2 = this.A0P;
        return lastSetPlaybackParameters2;
    }

    @Override // com.facebook.ads.redexgen.X.AR
    public final void pause() {
        this.A0Y = false;
        if (A0U() && this.A0h.A0I()) {
            AudioTrack audioTrack = this.A0M;
            String[] strArr = A0s;
            if (strArr[2].charAt(5) != strArr[7].charAt(5)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0s;
            strArr2[2] = "3LzsBOqgGe30i16a9NIVlDJcub4Z4Vvr";
            strArr2[7] = "hMaFPO8QBdBmzyeIOXtEGbbLXROtxATQ";
            audioTrack.pause();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AR
    public final void reset() {
        C02959a c02959a;
        if (A0U()) {
            this.A0J = 0L;
            this.A0I = 0L;
            this.A0L = 0L;
            this.A0K = 0L;
            this.A05 = 0;
            C02959a c02959a2 = this.A0O;
            if (c02959a2 != null) {
                this.A0P = c02959a2;
                String[] strArr = A0s;
                if (strArr[2].charAt(5) != strArr[7].charAt(5)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0s;
                strArr2[1] = "rnKZk3c8Taby0V4iUj7wGFJub43iz";
                strArr2[3] = "VEk4k7rPnS3kvq1QwagsAStWXQ6pG";
                this.A0O = null;
            } else if (!this.A0l.isEmpty()) {
                c02959a = this.A0l.getLast().A02;
                this.A0P = c02959a;
            }
            this.A0l.clear();
            this.A0F = 0L;
            this.A0G = 0L;
            this.A0T = null;
            this.A0U = null;
            A0J();
            this.A0W = false;
            this.A04 = -1;
            this.A0S = null;
            this.A03 = 0;
            this.A0D = 0;
            if (this.A0h.A0H()) {
                this.A0M.pause();
            }
            AudioTrack audioTrack = this.A0M;
            this.A0M = null;
            this.A0h.A0D();
            this.A0f.close();
            new AY(this, audioTrack).start();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AR
    public final void setVolume(float f) {
        if (this.A00 != f) {
            this.A00 = f;
            A0M();
        }
    }
}
