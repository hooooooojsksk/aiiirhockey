package com.facebook.ads.redexgen.X;

import android.util.Pair;
import com.google.android.gms.games.GamesStatusCodes;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class HH {
    public static byte[] A00;
    public static String[] A01 = {"hLuAeVo", "xAd", "BycTw1zmUt42SK9Tl7PmiYbTXOv2h", "PsetfG6yciY5a2BvCaZ", "D9JCYa2SYwqlcDmoI8QxkPMLQh1jrwYx", "z42CWN0IsG1EBL", "CLFdSzfEbp5p3IaxEHP", "w1O1Tcjq0FMnxE"};
    public static final byte[] A02;
    public static final int[] A03;
    public static final int[] A04;

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 120);
            String[] strArr = A01;
            if (strArr[6].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[1] = "Dt6";
            strArr2[2] = "OnDLvfdZPAa4wnGN2lHsysDkDPPP1";
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A00 = new byte[]{56, 81, 86, 88, 83, 83, 82, 85, 87, airhockey.P_GAME_MYLOSE, airhockey.P_GAME_MYWIN, 3, airhockey.P_GAME_SELECTMAP, 88, airhockey.P_GAME_MYWIN, 76, 82, 3, 82, airhockey.P_GAME_STANDBY, 77, airhockey.P_GAME_MYLOSE, airhockey.P_GAME_BREAKBALLCOUNT, 87, 3, 87, 92, 83, airhockey.P_GAME_MYLOSE, 29, 3, 53, 78, 83, 85, 80, 80, 79, 82, 84, airhockey.P_GAME_STANDBY, airhockey.P_GAME_SELECTMAP, 0, airhockey.P_GAME_STANDBY, 80, 35, 79, 78, airhockey.P_GAME_BREAKBALLCOUNT, airhockey.P_GAME_REMATCH, airhockey.P_GAME_MYWIN, 26, 0};
        String[] strArr = A01;
        if (strArr[0].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[1] = "c3c";
        strArr2[2] = "iYeoIjHtwrae0f23gr6EBkw9G0Kfv";
    }

    static {
        A05();
        A02 = new byte[]{0, 0, 0, 1};
        A04 = new int[]{96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, GamesStatusCodes.STATUS_MILESTONE_CLAIMED_PREVIOUSLY, 7350};
        A03 = new int[]{0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};
    }

    public static int A00(C0482Hb c0482Hb) {
        int A042 = c0482Hb.A04(5);
        if (A042 == 31) {
            int audioObjectType = c0482Hb.A04(6);
            return audioObjectType + 32;
        }
        return A042;
    }

    public static int A01(C0482Hb c0482Hb) {
        int A042 = c0482Hb.A04(4);
        if (A042 == 15) {
            int frequencyIndex = c0482Hb.A04(24);
            return frequencyIndex;
        }
        HD.A03(A042 < 13);
        int frequencyIndex2 = A04[A042];
        return frequencyIndex2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0061, code lost:
        if (r9 != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0065, code lost:
        if (r4 == 1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0067, code lost:
        if (r4 == 2) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0069, code lost:
        if (r4 == 3) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x006b, code lost:
        if (r4 == 4) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x006e, code lost:
        if (r4 == 6) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0071, code lost:
        if (r4 == 7) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0075, code lost:
        if (r4 == 17) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0077, code lost:
        switch(r4) {
            case 19: goto L24;
            case 20: goto L24;
            case 21: goto L24;
            case 22: goto L24;
            case 23: goto L24;
            default: goto L21;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0097, code lost:
        throw new com.facebook.ads.redexgen.X.C9Y(A04(0, 31, 107) + r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00a4, code lost:
        if (r9 != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00a7, code lost:
        A06(r8, r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00aa, code lost:
        switch(r4) {
            case 17: goto L26;
            case 18: goto L31;
            case 19: goto L26;
            case 20: goto L26;
            case 21: goto L26;
            case 22: goto L26;
            case 23: goto L26;
            default: goto L31;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00ad, code lost:
        r2 = com.facebook.ads.redexgen.X.HH.A03[r5];
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00b2, code lost:
        if (r2 == (-1)) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00b4, code lost:
        com.facebook.ads.redexgen.X.HD.A03(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00c3, code lost:
        return android.util.Pair.create(java.lang.Integer.valueOf(r7), java.lang.Integer.valueOf(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00c4, code lost:
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00c6, code lost:
        r4 = r8.A04(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00ca, code lost:
        if (r4 == 2) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00cc, code lost:
        if (r4 == 3) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x00ed, code lost:
        throw new com.facebook.ads.redexgen.X.C9Y(A04(31, 22, 104) + r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> A02(com.facebook.ads.redexgen.X.C0482Hb r8, boolean r9) throws com.facebook.ads.redexgen.X.C9Y {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.HH.A02(com.facebook.ads.redexgen.X.Hb, boolean):android.util.Pair");
    }

    public static Pair<Integer, Integer> A03(byte[] bArr) throws C9Y {
        return A02(new C0482Hb(bArr), false);
    }

    public static void A06(C0482Hb c0482Hb, int i, int i2) {
        c0482Hb.A08(1);
        if (c0482Hb.A0F()) {
            c0482Hb.A08(14);
        }
        boolean A0F = c0482Hb.A0F();
        String[] strArr = A01;
        if (strArr[7].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[1] = "nlb";
        strArr2[2] = "S8LKkeIYdF4OoMAzerSloF9wgi0dm";
        if (i2 != 0) {
            if (i == 6 || i == 20) {
                c0482Hb.A08(3);
            }
            if (A0F) {
                if (i == 22) {
                    String[] strArr3 = A01;
                    if (strArr3[0].length() != strArr3[4].length()) {
                        String[] strArr4 = A01;
                        strArr4[6] = "BiS0DBnBbJBeAmhr68B";
                        strArr4[3] = "FFiJeWYvMIC9W9Y4RTY";
                        c0482Hb.A08(16);
                    } else {
                        String[] strArr5 = A01;
                        strArr5[7] = "qOSfS5LOAo7Xl2";
                        strArr5[5] = "vocqRDobCtB3dP";
                        c0482Hb.A08(16);
                    }
                }
                if (i == 17 || i == 19 || i == 20 || i == 23) {
                    c0482Hb.A08(3);
                }
                c0482Hb.A08(1);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException();
    }

    public static byte[] A07(int i, int i2, int i3) {
        return new byte[]{(byte) (((i << 3) & 248) | ((i2 >> 1) & 7)), (byte) (((i2 << 7) & 128) | ((i3 << 3) & 120))};
    }

    public static byte[] A08(byte[] bArr, int i, int i2) {
        byte[] bArr2 = A02;
        byte[] bArr3 = new byte[bArr2.length + i2];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i, bArr3, A02.length, i2);
        return bArr3;
    }
}
