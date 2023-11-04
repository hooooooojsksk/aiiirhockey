package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.mobirix.airhockey.airhockey;
import cz.msebera.android.httpclient.HttpStatus;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class CY {
    public static byte[] A00;
    public static String[] A01 = {"7VlHbmI4sHauhoCWaFlUZM9mZRV70mzp", "LqGkn09UNvdqUAgssIpSCyoRJ1iI6QKK", "ZmFU8Mfu7g0bs6JKYNiQ5l9NQyV6", "IM1BduvbFOrOx4pkelis2wS2axXVXfJJ", "7P5Q", "68Q2Pgf", "FTYWHoYlDOl1N68V4e618z2hAoSaWMYg", "QxGNaBvq4MkZwy6AnQRq9NbnhINTK41p"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static CX A04(C0483Hc c0483Hc) throws C9Y {
        A0A(1, c0483Hc, false);
        long A0K = c0483Hc.A0K();
        int A0E = c0483Hc.A0E();
        long A0K2 = c0483Hc.A0K();
        int A0A = c0483Hc.A0A();
        int A0A2 = c0483Hc.A0A();
        int A0A3 = c0483Hc.A0A();
        int A0E2 = c0483Hc.A0E();
        return new CX(A0K, A0E, A0K2, A0A, A0A2, A0A3, (int) Math.pow(2.0d, A0E2 & 15), (int) Math.pow(2.0d, (A0E2 & 240) >> 4), (c0483Hc.A0E() & 1) > 0, Arrays.copyOf(c0483Hc.A00, c0483Hc.A07()));
    }

    public static String A05(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 2);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A00 = new byte[]{airhockey.J_DISCONNECT, 77, 80, 64, 75, 81, 119, 86, 75, 78, 28, 1, 9, 28, 26, 13, 28, 29, 89, 26, 17, 24, 11, 24, 26, 13, 28, 11, 10, 89, 94, 15, 22, 11, 27, 16, 10, 94, 87, airhockey.P_GAME_EXIT, airhockey.P_NATION, 87, 81, airhockey.P_GAME_BREAKBALLCOUNT, 87, 86, 18, 81, 93, 86, 87, 18, 80, 93, 93, 89, 18, airhockey.P_GAME_BREAKBALLCOUNT, 93, 18, 65, airhockey.P_GAME_BREAKBALLCOUNT, 83, 64, airhockey.P_GAME_BREAKBALLCOUNT, 18, airhockey.P_GAME_STANDBY, 91, airhockey.P_GAME_BREAKBALLCOUNT, 90, 18, airhockey.J_GAME_REMATCH, 2, airhockey.P_GAME_EXIT, 7, 4, 30, 18, 2, airhockey.P_GAME_EXIT, 6, 1, 30, 18, 2, airhockey.P_GAME_EXIT, 6, 0, 111, 18, 83, airhockey.P_GAME_BREAKBALLCOUNT, 18, 78, 83, 91, 78, airhockey.P_GAME_MYLOSE, 95, 78, 79, 11, airhockey.P_GAME_MYSCORE, 78, airhockey.P_GAME_EXIT, 79, 78, 89, 11, 95, 82, 91, 78, 11, airhockey.P_GAME_BREAKBALLCOUNT, 76, 79, 79, 82, 0, 84, 89, 80, airhockey.P_GAME_STANDBY, 0, airhockey.P_GAME_MYWIN, 82, airhockey.P_GAME_STANDBY, 65, 84, airhockey.P_GAME_STANDBY, 82, 0, 84, airhockey.P_GAME_MYLOSE, 65, 78, 0, 17, 0, 78, 79, 84, 0, airhockey.P_GAME_SELECTMAP, airhockey.P_GAME_STANDBY, airhockey.P_GAME_MYSCORE, 79, airhockey.P_GAME_SELECTMAP, 65, airhockey.P_NATION, 76, airhockey.P_GAME_STANDBY, 26, 0, 49, 37, 54, 58, 62, 57, 48, 119, 53, 62, 35, 119, 54, 49, 35, 50, 37, 119, 58, 56, 51, 50, 36, 119, 57, 56, 35, 119, 36, 50, 35, 119, 54, 36, 119, 50, 47, 39, 50, 52, 35, 50, 51, 48, 36, 55, 59, 63, 56, 49, airhockey.J_REWARD, 52, 63, 34, airhockey.J_REWARD, 51, 46, 38, 51, 53, 34, 51, 50, airhockey.J_REWARD, 34, 57, airhockey.J_REWARD, 52, 51, airhockey.J_REWARD, 37, 51, 34, 16, 19, 19, 23, 9, 12, 92, 8, 5, 12, 25, 92, 27, 14, 25, 29, 8, 25, 14, 92, 8, 20, 29, 18, 92, 78, 92, 18, 19, 8, 92, 24, 25, 31, 19, 24, 29, 30, 16, 25, airhockey.P_GAME_BREAKBALLCOUNT, 92, airhockey.J_ENEMYLOSE, airhockey.J_ONREWARDED, airhockey.J_ERROR, airhockey.J_ERROR, airhockey.J_GAME_DISCONNECT, airhockey.J_GAME_ENEMYEXIT, airhockey.J_NATION, 37, airhockey.J_BACK, 124, airhockey.J_ERROR, 96, 37, airhockey.J_GAME_EXIT, airhockey.J_BACK, 109, 96, 119, 37, airhockey.J_BACK, 109, airhockey.J_ONREWARDED, airhockey.J_GAME_ENEMYEXIT, 37, 53, 37, airhockey.J_GAME_ENEMYEXIT, airhockey.J_GAME_EXIT, airhockey.J_BACK, 37, airhockey.J_REWARD, airhockey.J_GOO, airhockey.J_ERROR, airhockey.J_ERROR, airhockey.J_GAME_EXIT, 119, airhockey.J_BACK, 96, airhockey.J_SDKVER, 63, 37, 93, 65, 76, 78, airhockey.P_GAME_MYLOSE, airhockey.P_GAME_STANDBY, airhockey.P_NATION, 65, airhockey.P_GAME_REMATCH, airhockey.P_GAME_MYLOSE, 95, 13, airhockey.P_NATION, 75, 13, 89, airhockey.P_GAME_SELECTMAP, 64, airhockey.P_GAME_MYLOSE, 13, airhockey.P_GAME_REMATCH, airhockey.P_NATION, 64, 76, airhockey.P_GAME_SELECTMAP, airhockey.P_GAME_MYSCORE, 13, 89, 95, 76, airhockey.P_GAME_MYSCORE, 94, 75, airhockey.P_NATION, 95, 64, 94, 13, airhockey.P_GAME_MYSCORE, airhockey.P_NATION, 89, 13, 87, airhockey.P_GAME_MYLOSE, 95, airhockey.P_NATION, airhockey.P_GAME_MYLOSE, airhockey.P_GAME_REMATCH, 13, airhockey.P_NATION, 88, 89, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_GAME_STANDBY, airhockey.J_SAVEDGAME_SAVE, airhockey.J_GAME_REMATCH, airhockey.J_ONREWARDED, airhockey.J_ERROR, airhockey.J_GAME_STANDBY, 84, airhockey.J_WAIT, airhockey.J_GOO, airhockey.J_GAME_STANDBY, 32, airhockey.J_ENEMYWIN, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_GAME_STANDBY, airhockey.J_SDKVER, airhockey.J_DISCONNECT, airhockey.J_GAME_STANDBY, airhockey.J_SAVEDGAME_RELOAD, 32, airhockey.J_DISCONNECT, airhockey.J_ENEMYLOSE, airhockey.J_SDKVER, airhockey.J_INVITE, 32, 50, 32, airhockey.J_GAME_REMATCH, airhockey.J_SAVEDGAME_SAVE, 32, airhockey.J_INVITE, 111, airhockey.J_DISCONNECT, 32, airhockey.J_ONREWARDED, airhockey.J_GAME_STANDBY, 99, 111, airhockey.J_ONREWARDED, airhockey.J_SDKVER, airhockey.J_NATION, airhockey.J_GAME_DISCONNECT, airhockey.J_GAME_STANDBY, airhockey.J_GAME_ENEMYEXIT, airhockey.J_GOO, 63, 109, airhockey.J_PURCHASE, airhockey.J_GAME_DISCONNECT, airhockey.J_PURCHASE, 109, airhockey.J_GAME_REMATCH, airhockey.J_PURCHASE, 123, 63, 125, airhockey.J_REWARD, airhockey.J_GAME_ENEMYEXIT, airhockey.J_GAME_DISCONNECT, 63, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_GAME_EXIT, airhockey.J_GAME_DISCONNECT, airhockey.J_GAME_ENEMYEXIT, 63, 125, airhockey.J_PURCHASE, 63, airhockey.J_GAME_STANDBY, airhockey.J_PURCHASE, 109, airhockey.J_GOO, 63, 126, airhockey.J_WAIT, airhockey.J_GAME_ENEMYEXIT, airhockey.J_PURCHASE, 109, 63, airhockey.J_SAVEDGAME_RELOAD, 126, 111, 111, airhockey.J_REWARD, airhockey.J_BACK, airhockey.J_ACHIEVEMENTCALLBACK, 63, 124, airhockey.J_GOO, airhockey.J_GAME_EXIT, 111, airhockey.J_SAVEDGAME_SAVE, airhockey.J_REWARD, airhockey.J_BACK, airhockey.J_ACHIEVEMENTCALLBACK, 63, airhockey.J_GAME_DISCONNECT, airhockey.J_GAME_ENEMYEXIT, airhockey.J_PURCHASE, 111, airhockey.J_GAME_DISCONNECT, 82, airhockey.P_GAME_REMATCH, airhockey.P_GAME_REMATCH, 6, 85, 78, airhockey.P_GAME_REMATCH, 84, 82, 6, 78, airhockey.P_GAME_MYSCORE, airhockey.P_GAME_MYWIN, airhockey.P_NATION, airhockey.P_GAME_MYSCORE, 84, 28, 6};
        if (A01[2].length() != 28) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[6] = "mgdhOJqoKNbrHZTmAlzuBC741swozh2A";
        strArr[0] = "We2DdWBOrlseFOiGq0myNglhwb5nF2sN";
    }

    static {
        A06();
    }

    public static int A00(int i) {
        int val = 0;
        while (i > 0) {
            val++;
            i >>>= 1;
        }
        return val;
    }

    public static long A01(long j, long j2) {
        return (long) Math.floor(Math.pow(j, 1.0d / j2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x00c5, code lost:
        r14.A03(32);
        r14.A03(32);
        r4 = r14.A02(4) + 1;
        r14.A03(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x00d5, code lost:
        if (r12 != 1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x00d7, code lost:
        if (r9 == 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x00d9, code lost:
        r0 = A01(r10, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x00df, code lost:
        r0 = (int) (r4 * r0);
        r14.A03(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x00ea, code lost:
        return new com.facebook.ads.redexgen.X.CU(r9, r10, r11, r12, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x00eb, code lost:
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x00ee, code lost:
        r0 = r10 * r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x00f3, code lost:
        if (r12 <= 2) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0114, code lost:
        throw new com.facebook.ads.redexgen.X.C9Y(A05(228, 42, 126) + r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x00bf, code lost:
        if (r12 <= 2) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x00c1, code lost:
        if (r12 == 1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x00c3, code lost:
        if (r12 != r0) goto L31;
     */
    /* JADX WARN: Incorrect condition in loop: B:70:0x0025 */
    /* JADX WARN: Incorrect condition in loop: B:87:0x0083 */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.ads.redexgen.X.CU A02(com.facebook.ads.redexgen.X.CS r14) throws com.facebook.ads.redexgen.X.C9Y {
        /*
            Method dump skipped, instructions count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.CY.A02(com.facebook.ads.redexgen.X.CS):com.facebook.ads.redexgen.X.CU");
    }

    public static CV A03(C0483Hc c0483Hc) throws C9Y {
        A0A(3, c0483Hc, false);
        int length = (int) c0483Hc.A0K();
        String A0S = c0483Hc.A0S(length);
        int length2 = A0S.length();
        int i = 7 + 4 + length2;
        long A0K = c0483Hc.A0K();
        int length3 = (int) A0K;
        String[] strArr = new String[length3];
        int i2 = i + 4;
        int i3 = 0;
        while (true) {
            long j = i3;
            if (A01[3].charAt(18) != 'i') {
                throw new RuntimeException();
            }
            A01[5] = "ziwCMa4";
            int length4 = (j > A0K ? 1 : (j == A0K ? 0 : -1));
            if (length4 < 0) {
                int length5 = (int) c0483Hc.A0K();
                strArr[i3] = c0483Hc.A0S(length5);
                int length6 = strArr[i3].length();
                i2 = i2 + 4 + length6;
                i3++;
            } else {
                int length7 = c0483Hc.A0E();
                if ((length7 & 1) != 0) {
                    return new CV(A0S, strArr, i2 + 1);
                }
                String vendor = A05(198, 30, 84);
                throw new C9Y(vendor);
            }
        }
    }

    public static void A07(int i, CS cs) throws C9Y {
        int j;
        int A02 = cs.A02(6) + 1;
        for (int i2 = 0; i2 < A02; i2++) {
            int A022 = cs.A02(16);
            if (A022 != 0) {
                Log.e(A05(0, 10, 32), A05(270, 41, 7) + A022);
            } else {
                if (cs.A04()) {
                    j = cs.A02(4) + 1;
                } else {
                    j = 1;
                }
                if (cs.A04()) {
                    int i3 = cs.A02(8);
                    int i4 = i3 + 1;
                    for (int i5 = 0; i5 < i4; i5++) {
                        int mappingsCount = i - 1;
                        cs.A03(A00(mappingsCount));
                        int mappingsCount2 = i - 1;
                        cs.A03(A00(mappingsCount2));
                    }
                }
                int mappingsCount3 = cs.A02(2);
                if (mappingsCount3 == 0) {
                    if (j > 1) {
                        for (int i6 = 0; i6 < i; i6++) {
                            cs.A03(4);
                            String[] strArr = A01;
                            String str = strArr[6];
                            String str2 = strArr[0];
                            int charAt = str.charAt(31);
                            int mappingsCount4 = str2.charAt(31);
                            if (charAt == mappingsCount4) {
                                throw new RuntimeException();
                            }
                            String[] strArr2 = A01;
                            strArr2[6] = "Wlyx46da0LhUJCMQF7d9pJYsMbXYpIdM";
                            strArr2[0] = "HglI0wxUFDuveiNJ2qiTiY5BYhneBiG1";
                        }
                    }
                    for (int mappingsCount5 = 0; mappingsCount5 < j; mappingsCount5++) {
                        cs.A03(8);
                        cs.A03(8);
                        cs.A03(8);
                    }
                } else {
                    throw new C9Y(A05(HttpStatus.SC_NOT_ACCEPTABLE, 58, 29));
                }
            }
        }
    }

    public static void A08(CS cs) throws C9Y {
        int A02 = cs.A02(6) + 1;
        for (int j = 0; j < A02; j++) {
            int A022 = cs.A02(16);
            if (A022 == 0) {
                cs.A03(8);
                cs.A03(16);
                cs.A03(16);
                cs.A03(6);
                cs.A03(8);
                int floorCount = cs.A02(4);
                int floorCount2 = floorCount + 1;
                for (int i = 0; i < floorCount2; i++) {
                    cs.A03(8);
                }
            } else if (A022 != 1) {
                throw new C9Y(A05(114, 41, 34) + A022);
            } else {
                int j2 = cs.A02(5);
                int i2 = -1;
                int[] classDimensions = new int[j2];
                for (int floorCount3 = 0; floorCount3 < j2; floorCount3++) {
                    classDimensions[floorCount3] = cs.A02(4);
                    if (classDimensions[floorCount3] > i2) {
                        i2 = classDimensions[floorCount3];
                    }
                }
                int[] iArr = new int[i2 + 1];
                for (int partitions = 0; partitions < iArr.length; partitions++) {
                    iArr[partitions] = cs.A02(3) + 1;
                    int A023 = cs.A02(2);
                    if (A023 > 0) {
                        cs.A03(8);
                    }
                    for (int floorCount4 = 0; floorCount4 < (1 << A023); floorCount4++) {
                        cs.A03(8);
                    }
                }
                cs.A03(2);
                int partitions2 = cs.A02(4);
                int i3 = 0;
                int floorCount5 = 0;
                for (int i4 = 0; i4 < j2; i4++) {
                    i3 += iArr[classDimensions[i4]];
                    while (floorCount5 < i3) {
                        cs.A03(partitions2);
                        floorCount5++;
                    }
                }
            }
        }
    }

    public static void A09(CS cs) throws C9Y {
        int A02 = cs.A02(6) + 1;
        for (int i = 0; i < A02; i++) {
            int residueCount = cs.A02(16);
            if (residueCount <= 2) {
                cs.A03(24);
                cs.A03(24);
                cs.A03(24);
                int A022 = cs.A02(6) + 1;
                cs.A03(8);
                int[] iArr = new int[A022];
                for (int i2 = 0; i2 < A022; i2++) {
                    int i3 = 0;
                    int residueCount2 = cs.A02(3);
                    if (cs.A04()) {
                        i3 = cs.A02(5);
                    }
                    iArr[i2] = (i3 * 8) + residueCount2;
                }
                for (int i4 = 0; i4 < A022; i4++) {
                    for (int i5 = 0; i5 < 8; i5++) {
                        int residueCount3 = iArr[i4];
                        if ((residueCount3 & (1 << i5)) != 0) {
                            cs.A03(8);
                        }
                    }
                }
            } else {
                throw new C9Y(A05(363, 43, 2));
            }
        }
    }

    public static boolean A0A(int i, C0483Hc c0483Hc, boolean z) throws C9Y {
        if (c0483Hc.A04() < 7) {
            if (z) {
                return false;
            }
            throw new C9Y(A05(464, 18, 36) + c0483Hc.A04());
        } else if (c0483Hc.A0E() != i) {
            if (z) {
                return false;
            }
            throw new C9Y(A05(93, 21, 41) + Integer.toHexString(i));
        } else if (c0483Hc.A0E() != 118 || c0483Hc.A0E() != 111 || c0483Hc.A0E() != 114 || c0483Hc.A0E() != 98 || c0483Hc.A0E() != 105 || c0483Hc.A0E() != 115) {
            if (z) {
                return false;
            }
            throw new C9Y(A05(10, 28, 123));
        } else {
            return true;
        }
    }

    public static CW[] A0B(CS cs) {
        int A02 = cs.A02(6) + 1;
        CW[] cwArr = new CW[A02];
        for (int windowType = 0; windowType < A02; windowType++) {
            boolean A04 = cs.A04();
            int A022 = cs.A02(16);
            int i = cs.A02(16);
            cwArr[windowType] = new CW(A04, A022, i, cs.A02(8));
        }
        return cwArr;
    }

    public static CW[] A0C(C0483Hc c0483Hc, int i) throws C9Y {
        A0A(5, c0483Hc, false);
        int A0E = c0483Hc.A0E() + 1;
        CS cs = new CS(c0483Hc.A00);
        int numberOfBooks = c0483Hc.A06();
        cs.A03(numberOfBooks * 8);
        for (int numberOfBooks2 = 0; numberOfBooks2 < A0E; numberOfBooks2++) {
            A02(cs);
        }
        int numberOfBooks3 = cs.A02(6);
        int timeCount = numberOfBooks3 + 1;
        for (int i2 = 0; i2 < timeCount; i2++) {
            int numberOfBooks4 = cs.A02(16);
            if (numberOfBooks4 != 0) {
                throw new C9Y(A05(311, 52, 47));
            }
        }
        A08(cs);
        A09(cs);
        A07(i, cs);
        CW[] A0B = A0B(cs);
        if (cs.A04()) {
            return A0B;
        }
        throw new C9Y(A05(155, 43, 85));
    }
}
