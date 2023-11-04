package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData;
import com.google.android.gms.games.GamesStatusCodes;
import com.mobirix.airhockey.airhockey;
import java.nio.ByteBuffer;
import java.util.Arrays;
import kotlin.UByte;

/* renamed from: com.facebook.ads.redexgen.X.Ae */
/* loaded from: assets/audience_network.dex */
public final class C0324Ae {
    public static byte[] A00;
    public static String[] A01 = {"LgmYw98W3bgowMYQY6Q3BawqAxXNUuUl", "GpzgTRDYOaIyAt6xSJRYAk3b6rAdzkZ0", "RtCZFOI40BGARGfB2sOg6MLybkAs9Fzf", "Gx3YqKVlWhsXJsTGKtjglmBlxW0pOlYg", "tq174XAFZe", "aVWuh4A2S2MgQagwT", "vwD2gnTxyUihDEDfn", "xhuYGO7iBGvSpDZMcS9LxFC"};
    public static final int[] A02;
    public static final int[] A03;
    public static final int[] A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static Format A03(byte[] bArr, String str, String str2, DrmInitData drmInitData) {
        C0482Hb A042 = A04(bArr);
        A042.A08(60);
        int i = A02[A042.A04(6)];
        int i2 = A03[A042.A04(4)];
        int A043 = A042.A04(5);
        int[] iArr = A04;
        int i3 = A043 >= iArr.length ? -1 : (iArr[A043] * 1000) / 2;
        A042.A08(10);
        return Format.A07(str, A05(0, 13, 102), null, i3, -1, i + (A042.A04(2) > 0 ? 1 : 0), i2, null, drmInitData, 0, str2);
    }

    public static String A05(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 70);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A00 = new byte[]{65, 85, airhockey.P_GAME_SELECTMAP, airhockey.P_GAME_REMATCH, 79, 15, 86, 78, airhockey.P_GAME_SELECTMAP, 14, airhockey.P_GAME_SELECTMAP, 84, 83};
    }

    static {
        A06();
        A02 = new int[]{1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
        A03 = new int[]{-1, GamesStatusCodes.STATUS_MILESTONE_CLAIMED_PREVIOUSLY, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
        A04 = new int[]{64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    }

    public static int A00(ByteBuffer byteBuffer) {
        int nblks;
        int position = byteBuffer.position();
        byte b = byteBuffer.get(position);
        if (b == -2) {
            int position2 = position + 5;
            int i = (byteBuffer.get(position2) & 1) << 6;
            int position3 = position + 4;
            nblks = i | ((byteBuffer.get(position3) & 252) >> 2);
        } else if (b == -1) {
            int position4 = position + 4;
            int i2 = (byteBuffer.get(position4) & 7) << 4;
            int position5 = position + 7;
            nblks = i2 | ((byteBuffer.get(position5) & 60) >> 2);
        } else if (b != 31) {
            int position6 = position + 4;
            int i3 = (byteBuffer.get(position6) & 1) << 6;
            int position7 = position + 5;
            nblks = i3 | ((byteBuffer.get(position7) & 252) >> 2);
        } else {
            int position8 = position + 5;
            int i4 = (byteBuffer.get(position8) & 7) << 4;
            int position9 = position + 6;
            nblks = i4 | ((byteBuffer.get(position9) & 60) >> 2);
        }
        int position10 = nblks + 1;
        return position10 * 32;
    }

    public static int A01(byte[] bArr) {
        int i;
        boolean z = false;
        byte b = bArr[0];
        if (b == -2) {
            i = (((bArr[4] & 3) << 12) | ((bArr[7] & UByte.MAX_VALUE) << 4) | ((bArr[6] & 240) >> 4)) + 1;
        } else if (b == -1) {
            i = (((bArr[7] & 3) << 12) | ((bArr[6] & UByte.MAX_VALUE) << 4) | ((bArr[9] & 60) >> 2)) + 1;
            z = true;
        } else if (b != 31) {
            i = (((bArr[5] & 3) << 12) | ((bArr[6] & UByte.MAX_VALUE) << 4) | ((bArr[7] & 240) >> 4)) + 1;
        } else {
            i = (((bArr[6] & 3) << 12) | ((bArr[7] & UByte.MAX_VALUE) << 4) | ((bArr[8] & 60) >> 2)) + 1;
            z = true;
        }
        if (z) {
            int i2 = i * 16;
            int fsize = A01[2].charAt(14);
            if (fsize != 102) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[5] = "zmeKDaeVMRSRS1vVc";
            strArr[6] = "wwYXxolxpiaSq7NW4";
            return i2 / 14;
        }
        return i;
    }

    public static int A02(byte[] bArr) {
        int i;
        byte b = bArr[0];
        if (b != -2) {
            String[] strArr = A01;
            if (strArr[5].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[5] = "0rS52mmndmktv37b0";
            strArr2[6] = "cQepkBNQqnKQzzIfS";
            if (b == -1) {
                i = ((bArr[4] & 7) << 4) | ((bArr[7] & 60) >> 2);
            } else if (b != 31) {
                i = ((bArr[4] & 1) << 6) | ((bArr[5] & 252) >> 2);
            } else {
                i = ((bArr[5] & 7) << 4) | ((bArr[6] & 60) >> 2);
            }
        } else {
            int nblks = bArr[5];
            int i2 = (nblks & 1) << 6;
            int i3 = bArr[4] & 252;
            if (A01[1].charAt(17) != 'C') {
                A01[0] = "064LRLLV5eCmS2dxU3YWMvBMPqR4OumZ";
                i = i2 | (i3 >> 2);
            } else {
                String[] strArr3 = A01;
                strArr3[7] = "ufFeDyoqPfXnlewDGUYN9Li";
                strArr3[4] = "t0yClXIcFw";
                int nblks2 = i3 >> 2;
                i = i2 | nblks2;
            }
        }
        int nblks3 = i + 1;
        return nblks3 * 32;
    }

    public static C0482Hb A04(byte[] bArr) {
        if (bArr[0] == Byte.MAX_VALUE) {
            return new C0482Hb(bArr);
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        if (A08(copyOf)) {
            for (int i = 0; i < copyOf.length - 1; i += 2) {
                byte b = copyOf[i];
                copyOf[i] = copyOf[i + 1];
                copyOf[i + 1] = b;
            }
        }
        C0482Hb c0482Hb = new C0482Hb(copyOf);
        if (copyOf[0] == 31) {
            C0482Hb c0482Hb2 = new C0482Hb(copyOf);
            while (c0482Hb2.A01() >= 16) {
                c0482Hb2.A08(2);
                c0482Hb.A0A(c0482Hb2.A04(14), 14);
            }
        }
        c0482Hb.A0B(copyOf);
        return c0482Hb;
    }

    public static boolean A07(int i) {
        return i == 2147385345 || i == -25230976 || i == 536864768 || i == -14745368;
    }

    public static boolean A08(byte[] bArr) {
        return bArr[0] == -2 || bArr[0] == -1;
    }
}
