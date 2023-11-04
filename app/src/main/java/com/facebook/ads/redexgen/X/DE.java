package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class DE implements WG {
    public static byte[] A03;
    public static String[] A04 = {"xRROEGdAUCAudeqcJX0caVC", "RDpao2hkrR6ziaViz3g3BPe5hbb4l2e8", "Ed7dYiwxF6JAh1fdxaorqpYaLnkoS8WW", "Xbh7mQj6Yl76z6fGuBw3MVdSfIRc8xO0", "JfNfbo", "kPoVrOTPOM", "yNEpniBOJkiFBdNkOj3ydJ5", "nAMwe50fIcxJ3aJSfb4K9HE8NaHgqVAu"};
    public final long A00;
    public final long[] A01;
    public final long[] A02;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 1);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{airhockey.P_GAME_MYWIN, 75, 29, 9, 25, 2, airhockey.J_GAME_ENEMYEXIT, 47, 42, 63, 42, airhockey.J_GAME_ENEMYEXIT, 56, 34, 49, 46, airhockey.J_GAME_ENEMYEXIT, 38, 34, 56, 38, 42, 63, 40, 35, airhockey.J_BACK, airhockey.J_GAME_ENEMYEXIT, 0, 52, 36, 63, 5, 51, 51, 61, 51, 36};
    }

    static {
        A02();
    }

    public DE(long[] jArr, long[] jArr2, long j) {
        this.A02 = jArr;
        this.A01 = jArr2;
        this.A00 = j;
    }

    public static DE A00(long durationUs, long j, Bb bb, C0483Hc c0483Hc) {
        int A0E;
        long position = j;
        c0483Hc.A0Z(10);
        int numFrames = c0483Hc.A08();
        if (numFrames <= 0) {
            return null;
        }
        int sampleRate = bb.A03;
        long A0F = C0499Hs.A0F(numFrames, 1000000 * (sampleRate >= 32000 ? 1152 : 576), sampleRate);
        int A0I = c0483Hc.A0I();
        int sampleRate2 = c0483Hc.A0I();
        int index = c0483Hc.A0I();
        c0483Hc.A0Z(2);
        long j2 = position + bb.A02;
        long[] jArr = new long[A0I];
        long[] jArr2 = new long[A0I];
        for (int scale = 0; scale < A0I; scale++) {
            jArr[scale] = (scale * A0F) / A0I;
            jArr2[scale] = Math.max(position, j2);
            if (index == 1) {
                A0E = c0483Hc.A0E();
            } else if (index == 2) {
                A0E = c0483Hc.A0I();
            } else if (index == 3) {
                A0E = c0483Hc.A0G();
            } else if (index != 4) {
                String[] strArr = A04;
                if (strArr[6].length() != strArr[0].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A04;
                strArr2[3] = "shzBCu6iNjpu9oAeJ3X3cqRaPh16FJGu";
                strArr2[1] = "4tLpe6sFHaeg4HGZmZj3jIz6GaNzZHiC";
                return null;
            } else {
                A0E = c0483Hc.A0H();
            }
            position += A0E * sampleRate2;
        }
        if (durationUs != -1 && durationUs != position) {
            Log.w(A01(27, 10, 87), A01(2, 25, 74) + durationUs + A01(0, 2, 106) + position);
        }
        return new DE(jArr, jArr2, A0F);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0348Be
    public final long A6Y() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0348Be
    public final C0347Bd A7a(long j) {
        int A0B = C0499Hs.A0B(this.A02, j, true, true);
        C0349Bf c0349Bf = new C0349Bf(this.A02[A0B], this.A01[A0B]);
        int tableIndex = (c0349Bf.A01 > j ? 1 : (c0349Bf.A01 == j ? 0 : -1));
        if (tableIndex < 0) {
            long[] jArr = this.A02;
            int tableIndex2 = jArr.length;
            if (A0B != tableIndex2 - 1) {
                int tableIndex3 = A0B + 1;
                long j2 = jArr[tableIndex3];
                int tableIndex4 = A0B + 1;
                C0349Bf nextSeekPoint = new C0349Bf(j2, this.A01[tableIndex4]);
                return new C0347Bd(c0349Bf, nextSeekPoint);
            }
        }
        return new C0347Bd(c0349Bf);
    }

    @Override // com.facebook.ads.redexgen.X.WG
    public final long A7q(long j) {
        return this.A02[C0499Hs.A0B(this.A01, j, true, true)];
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0348Be
    public final boolean A8v() {
        return true;
    }
}
