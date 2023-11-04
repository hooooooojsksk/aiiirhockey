package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;
import android.util.SparseIntArray;
import androidx.annotation.Nullable;
import com.mobirix.airhockey.airhockey;
import cz.msebera.android.httpclient.HttpStatus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

@SuppressLint({"InlinedApi"})
@TargetApi(16)
/* loaded from: assets/audience_network.dex */
public final class D4 {
    public static int A00;
    public static byte[] A01;
    public static String[] A02 = {"BAY", "ymxL57jYYv0jjQRcHQbZ4WAbO", "V4mYndI5uaXc7arEQ3TceizUtwuJpZsP", "bZ", "bvLsrur7DOWvoKolroRaEPylJxsC8CBw", "pPHP1LRPBsm50pfT1", "f9saOCuwOfCGSEN51CDIZYerwD3UjJFW", "NB4ZEOXNx"};
    public static final SparseIntArray A03;
    public static final SparseIntArray A04;
    public static final C0379Ct A05;
    public static final HashMap<D1, List<C0379Ct>> A06;
    public static final Map<String, Integer> A07;
    public static final Pattern A08;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static int A00() throws D2 {
        if (A00 == -1) {
            int i = 0;
            C0379Ct A062 = A06(A07(1006, 9, 38), false);
            if (A062 != null) {
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : A062.A0J()) {
                    i = Math.max(A01(codecProfileLevel.level), i);
                }
                i = Math.max(i, C0499Hs.A02 >= 21 ? 345600 : 172800);
            }
            A00 = i;
        }
        return A00;
    }

    public static String A07(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 109);
        }
        return new String(copyOfRange);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x005f, code lost:
        if (r15 != r14) goto L17;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00d6 A[Catch: Exception -> 0x0147, TRY_ENTER, TryCatch #1 {Exception -> 0x0147, blocks: (B:87:0x0022, B:89:0x002a, B:92:0x0036, B:120:0x00c6, B:123:0x00d6, B:125:0x00dc, B:129:0x010d, B:130:0x0143, B:126:0x0104, B:127:0x0108), top: B:139:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x010d A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList<com.facebook.ads.redexgen.X.C0379Ct> A08(com.facebook.ads.redexgen.X.D1 r18, com.facebook.ads.redexgen.X.D3 r19, java.lang.String r20) throws com.facebook.ads.redexgen.X.D2 {
        /*
            Method dump skipped, instructions count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.D4.A08(com.facebook.ads.redexgen.X.D1, com.facebook.ads.redexgen.X.D3, java.lang.String):java.util.ArrayList");
    }

    public static void A0A() {
        if (A02[4].charAt(9) != 'O') {
            throw new RuntimeException();
        }
        A02[1] = "WfhNiOeVQzQSnYcncz46tqnXb";
        A01 = new byte[]{-57, -49, 3, 11, airhockey.P_GAME_REMATCH, airhockey.P_GAME_SELECTMAP, 76, 79, airhockey.P_GAME_MYLOSE, airhockey.P_GAME_MYWIN, 3, 87, 82, 3, 84, 88, airhockey.P_GAME_MYLOSE, 85, 92, 3, airhockey.P_GAME_BREAKBALLCOUNT, airhockey.P_GAME_SELECTMAP, 83, airhockey.P_GAME_SELECTMAP, airhockey.P_GAME_STANDBY, 76, 79, 76, 87, 76, airhockey.P_GAME_MYLOSE, 86, 12, -9, -92, -106, -73, -23, -23, -21, -29, -33, -28, -35, -80, -106, -101, -32, -46, -48, -30, -33, -46, -1, -28, 30, 26, 30, 61, 45, 13, 13, 15, 16, 49, 47, 59, 48, 49, 62, -29, -47, -43, -48, -44, 10, -8, -4, -9, -4, -44, -62, -57, -63, -59, -31, -49, -44, -50, -45, -73, -86, -86, -92, -90, -65, -78, -78, -84, -81, -13, -26, -26, -32, -26, -72, -85, -85, -90, -85, -61, -55, -48, -63, -63, -61, -60, -27, -29, -17, -28, -27, -14, -45, -39, -32, -47, -35, -30, -34, -46, -44, -11, -13, -1, -12, -11, 2, 43, 49, 56, 53, 56, 27, 44, 77, 75, 87, 76, 77, 90, -36, -30, -23, -17, 8, 11, -5, 2, 12, -35, -2, -4, 8, -3, -2, 11, -68, -41, -33, -30, -37, -38, -106, -22, -27, -106, -25, -21, -37, -24, -17, -106, -39, -27, -38, -37, -39, -106, -67, -90, -89, -91, 49, 26, 27, 28, 25, 2, 6, 1, 48, 25, 29, 27, -31, -54, -50, -49, -64, -87, -80, -88, -60, -83, -76, -81, 18, -5, 2, 0, -3, -24, -27, -5, -23, -29, 44, 26, 23, -75, -90, -99, 18, 3, -3, 19, 24, -20, 10, 17, 18, 21, 12, 17, 10, -61, 16, 4, 15, 9, 18, 21, 16, 8, 7, -61, -28, -7, -26, -61, 6, 18, 7, 8, 6, -61, 22, 23, 21, 12, 17, 10, -35, -61, -18, 12, 19, 20, 23, 14, 19, 12, -59, 18, 6, 17, 11, 20, 23, 18, 10, 9, -59, -19, -22, -5, -24, -59, 8, 20, 9, 10, 8, -59, 24, 25, 23, 14, 19, 12, -33, -59, 8, -19, -18, -20, -35, -62, -61, -60, -17, -44, -40, -45, 6, -21, -17, -19, 3, -24, -20, -19, -61, -88, -81, -89, -5, -32, -25, -30, -50, -77, -70, -72, 5, -20, -23, -20, -45, -42, 8, -6, -28, -34, -62, -84, -87, 28, 9, 0, -1, -20, -26, 32, 35, 6, 23, 56, 54, airhockey.P_NATION, 55, 56, airhockey.P_GAME_STANDBY, 10, 34, 33, 38, 30, 0, 44, 33, 34, 32, 9, 38, 48, 49, -35, -2, 13, 6, -35, 33, 38, 33, 43, -28, 49, -35, 41, 38, 48, 49, -35, 48, 34, 32, 50, 47, 34, -35, 33, 34, 32, 44, 33, 34, 47, -35, 35, 44, 47, -9, -35, -32, -8, -9, -4, -12, -42, 2, -9, -8, -10, -24, 7, -4, -1, -58, -35, -16, -19, -21, -104, -87, -88, 48, 37, 51, 48, 42, 37, 14, 57, 54, 20, 6, 4, 15, -27, -4, 47, 48, 37, 38, 42, -27, -8, -8, -6, -27, -5, 28, 26, 38, 27, 28, 41, 1, -1, 10, -32, -9, 42, 43, 32, 33, 37, -32, -13, 8, -11, -32, -10, 23, 21, 33, 22, 23, 36, 12, 10, 21, -21, 2, 53, 54, 43, 44, 48, -21, -2, 19, 0, -21, 1, 34, 32, 44, 33, 34, 47, -21, 48, 34, 32, 50, 47, 34, -54, -56, -45, -87, -56, -49, -58, -87, -68, -48, -65, -60, -54, -87, -65, -64, -66, -54, -65, -64, -51, -87, -68, -68, -66, 8, 6, 17, -25, 6, 13, 4, -25, -6, 14, -3, 2, 8, -25, -3, -2, -4, 8, -3, -2, 11, -25, -3, 12, 9, -6, -4, -20, 43, 41, 52, 10, 41, 48, 39, 10, 29, 49, 32, 37, 43, 10, 32, 33, 31, 43, 32, 33, 46, 10, 46, 29, 51, -38, -40, -29, -71, -34, -48, -50, -71, -40, -37, -66, -71, -49, -16, -18, -6, -17, -16, -3, -15, -17, -6, -48, -11, -25, -27, -48, 3, 3, 5, -48, 6, 7, 5, -62, -64, -53, -95, -58, -72, -74, -95, -23, -29, -85, -95, -41, -40, -42, -7, -9, 2, -40, 17, 25, 25, 17, 22, 15, -40, 28, 11, 33, -40, 14, 15, 13, 25, 14, 15, 28, 11, 9, 20, -22, 45, 31, 43, 41, -22, 29, 49, 32, 37, 43, -22, 32, 33, 31, 43, 32, 33, 46, -22, 29, 29, 31, 14, 12, 23, -19, 48, 34, 46, 44, -19, 32, 52, 35, 40, 46, -19, 35, 36, 34, 46, 35, 36, 49, -19, 44, 47, -14, 24, 22, 33, -9, 58, 44, 56, 54, -9, 63, 50, 45, 46, 56, -9, 45, 46, 44, 56, 45, 46, 59, -9, 63, 57, 1, 63, 47, 25, 28, 32, 51, -32, -48, -70, -67, -62, -44, 49, 33, 52, 17, 15, 56, 52, 18, 21, 23, 42, 51, 75, airhockey.P_GAME_REMATCH, 80, 80, airhockey.P_GAME_REMATCH, 78, airhockey.P_GAME_MYWIN, 0, airhockey.P_GAME_MYSCORE, 79, airhockey.P_GAME_SELECTMAP, airhockey.P_GAME_STANDBY, airhockey.P_GAME_MYSCORE, 0, -23, 2, -1, 2, 3, 11, 2, -76, -43, -22, -41, -76, 0, -7, 10, -7, 0, -50, -76, 44, airhockey.P_GAME_STANDBY, airhockey.P_NATION, airhockey.P_GAME_STANDBY, airhockey.P_GAME_BREAKBALLCOUNT, 78, airhockey.P_GAME_STANDBY, -9, 24, 45, 26, -9, airhockey.P_GAME_MYWIN, airhockey.P_GAME_REMATCH, airhockey.P_GAME_BREAKBALLCOUNT, 61, 64, airhockey.P_GAME_MYSCORE, 60, 17, -9, 12, 37, 34, 37, 38, 46, 37, -41, -1, -4, 13, -6, -41, 35, 28, 45, 28, 35, -41, 42, 43, 41, 32, 37, 30, -15, -41, 50, 75, airhockey.P_GAME_MYLOSE, 75, 76, 84, 75, -3, 37, 34, 51, 32, -3, 77, 79, 76, airhockey.P_GAME_MYSCORE, airhockey.P_GAME_BREAKBALLCOUNT, airhockey.P_GAME_REMATCH, airhockey.P_NATION, -3, 80, 81, 79, airhockey.P_GAME_BREAKBALLCOUNT, 75, airhockey.P_GAME_SELECTMAP, 23, -3, -7, 10, 2, 16, 14, 10, 30, -16, -34, -36, -60, -65, -88, -36, -28, -85, -87, -92, 62, 20, 13, 25, 45, 28, 33, 39, -25, 29, 25, 27, -21, 0, 20, 3, 8, 14, -50, 4, 0, 2, -46, -52, 9, 14, 2, -25, -4, -23, -73, airhockey.P_NATION, 87, airhockey.P_GAME_SELECTMAP, 19, airhockey.P_GAME_REMATCH, 23, 4, 12, 24, 21, 42, 40, 40, -18, -21, -4, -73, -9, 5, -14, -64, 17, 13, 19, 27, 12, -8, -20, -3, -12, -7, -16, -9, -1, -16, -20, -1, -1, 12, 14, 11, 16, 11, 17, -20, -38, -26, -20, -18, -25, -32, -29, -47, -34, -28, -33, -29, -6, -20, -7, 
        -7, -24, -11, -10, -3, -71, 9, -4, -9, -8, 2, -62, -12, 9, -10, 43, 30, 33, 33, 26, 42, 29, 32, 32, 25, 23, -26, 53, 40, 43, 43, 36, 47, 43, 52, 50, 2, -19, -10, -12, -4, -19, 96, 75, 88, 85, 76, 82, 90, 75, 2, -19, -6, -9, -12, -4, -19};
    }

    static {
        A0A();
        A05 = C0379Ct.A01(A07(657, 22, 61));
        A08 = Pattern.compile(A07(899, 10, 19));
        A06 = new HashMap<>();
        A00 = -1;
        A04 = new SparseIntArray();
        A04.put(66, 1);
        A04.put(77, 2);
        A04.put(88, 4);
        A04.put(100, 8);
        A03 = new SparseIntArray();
        A03.put(10, 1);
        A03.put(11, 4);
        A03.put(12, 8);
        A03.put(13, 16);
        A03.put(20, 32);
        A03.put(21, 64);
        A03.put(22, 128);
        A03.put(30, 256);
        A03.put(31, 512);
        A03.put(32, 1024);
        A03.put(40, 2048);
        A03.put(41, 4096);
        A03.put(42, 8192);
        A03.put(50, 16384);
        A03.put(51, 32768);
        A03.put(52, 65536);
        A07 = new HashMap();
        A07.put(A07(345, 3, 76), 1);
        A07.put(A07(352, 3, 65), 4);
        A07.put(A07(355, 3, 9), 16);
        A07.put(A07(358, 3, 99), 64);
        A07.put(A07(361, 3, 70), 256);
        A07.put(A07(313, 4, 79), 1024);
        A07.put(A07(317, 4, 36), 4096);
        A07.put(A07(321, 4, 54), 16384);
        A07.put(A07(325, 4, 77), 65536);
        A07.put(A07(329, 4, 74), 262144);
        A07.put(A07(333, 4, 10), 1048576);
        A07.put(A07(337, 4, 66), 4194304);
        A07.put(A07(341, 4, 21), 16777216);
        A07.put(A07(221, 3, 72), 2);
        A07.put(A07(224, 3, 70), 8);
        A07.put(A07(227, 3, 119), 32);
        A07.put(A07(230, 3, 0), 128);
        A07.put(A07(233, 3, 93), 512);
        A07.put(A07(189, 4, 8), 2048);
        A07.put(A07(193, 4, 124), 8192);
        A07.put(A07(197, 4, 100), 32768);
        A07.put(A07(HttpStatus.SC_CREATED, 4, 123), 131072);
        A07.put(A07(HttpStatus.SC_RESET_CONTENT, 4, 44), 524288);
        A07.put(A07(209, 4, 11), 2097152);
        A07.put(A07(213, 4, 15), 8388608);
        A07.put(A07(217, 4, 93), 33554432);
    }

    public static int A01(int i) {
        if (i == 1 || i == 2) {
            return 25344;
        }
        switch (i) {
            case 8:
                return 101376;
            case 16:
                return 101376;
            case 32:
                return 101376;
            case 64:
                return 202752;
            case 128:
                return 414720;
            case 256:
                return 414720;
            case 512:
                return 921600;
            case 1024:
                return 1310720;
            case 2048:
                return 2097152;
            case 4096:
                return 2097152;
            case 8192:
                return 2228224;
            case 16384:
                return 5652480;
            case 32768:
                return 9437184;
            case 65536:
                return 9437184;
            default:
                return -1;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0057, code lost:
        if (r7.equals(A07(953, 4, 25)) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> A02(java.lang.String r10) {
        /*
            r9 = 0
            if (r10 != 0) goto L4
            return r9
        L4:
            r2 = 897(0x381, float:1.257E-42)
            r1 = 2
            r0 = 85
            java.lang.String r0 = A07(r2, r1, r0)
            java.lang.String[] r6 = r10.split(r0)
            r8 = 0
            r7 = r6[r8]
            int r0 = r7.hashCode()
            r5 = 3
            r4 = 2
            r3 = 1
            switch(r0) {
                case 3006243: goto L28;
                case 3006244: goto L39;
                case 3199032: goto L4a;
                case 3214780: goto L5a;
                default: goto L1e;
            }
        L1e:
            r8 = -1
        L1f:
            if (r8 == 0) goto L70
            if (r8 == r3) goto L70
            if (r8 == r4) goto L6b
            if (r8 == r5) goto L6b
            return r9
        L28:
            r2 = 936(0x3a8, float:1.312E-42)
            r1 = 4
            r0 = 25
            java.lang.String r0 = A07(r2, r1, r0)
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L1e
            r8 = 2
            goto L1f
        L39:
            r2 = 940(0x3ac, float:1.317E-42)
            r1 = 4
            r0 = 116(0x74, float:1.63E-43)
            java.lang.String r0 = A07(r2, r1, r0)
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L1e
            r8 = 3
            goto L1f
        L4a:
            r2 = 953(0x3b9, float:1.335E-42)
            r1 = 4
            r0 = 25
            java.lang.String r0 = A07(r2, r1, r0)
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L1e
            goto L1f
        L5a:
            r2 = 957(0x3bd, float:1.341E-42)
            r1 = 4
            r0 = 34
            java.lang.String r0 = A07(r2, r1, r0)
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L1e
            r8 = 1
            goto L1f
        L6b:
            android.util.Pair r0 = A03(r10, r6)
            return r0
        L70:
            android.util.Pair r0 = A04(r10, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.D4.A02(java.lang.String):android.util.Pair");
    }

    public static Pair<Integer, Integer> A03(String str, String[] strArr) {
        Integer valueOf;
        Integer valueOf2;
        int length = strArr.length;
        String A072 = A07(238, 37, 54);
        String A073 = A07(425, 14, 38);
        if (length < 2) {
            Log.w(A073, A072 + str);
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                valueOf = Integer.valueOf(Integer.parseInt(strArr[1].substring(0, 2), 16));
                valueOf2 = Integer.valueOf(Integer.parseInt(strArr[1].substring(4), 16));
            } else if (strArr.length >= 3) {
                valueOf = Integer.valueOf(Integer.parseInt(strArr[1]));
                valueOf2 = Integer.valueOf(Integer.parseInt(strArr[2]));
            } else {
                Log.w(A073, A072 + str);
                return null;
            }
            int profile = A04.get(valueOf.intValue(), -1);
            if (profile == -1) {
                Log.w(A073, A07(814, 21, 106) + valueOf);
                return null;
            }
            int i = A03.get(valueOf2.intValue(), -1);
            if (i == -1) {
                Log.w(A073, A07(795, 19, 39) + valueOf2);
                return null;
            }
            Integer valueOf3 = Integer.valueOf(profile);
            Integer levelInteger = Integer.valueOf(i);
            return new Pair<>(valueOf3, levelInteger);
        } catch (NumberFormatException unused) {
            Log.w(A073, A072 + str);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a5, code lost:
        if (r6 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a7, code lost:
        android.util.Log.w(r4, A07(835, 27, 74) + r3.group(1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c7, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d1, code lost:
        if (r6 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ee, code lost:
        return new android.util.Pair<>(java.lang.Integer.valueOf(r7), r6);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> A04(java.lang.String r9, java.lang.String[] r10) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.D4.A04(java.lang.String, java.lang.String[]):android.util.Pair");
    }

    public static C0379Ct A05() {
        return A05;
    }

    @Nullable
    public static C0379Ct A06(String str, boolean z) throws D2 {
        List<C0379Ct> A09 = A09(str, z);
        if (A09.isEmpty()) {
            return null;
        }
        return A09.get(0);
    }

    public static synchronized List<C0379Ct> A09(String str, boolean z) throws D2 {
        synchronized (D4.class) {
            D1 d1 = new D1(str, z);
            List<C0379Ct> list = A06.get(d1);
            if (list != null) {
                return list;
            }
            D3 vt = C0499Hs.A02 >= 21 ? new VT(z) : new VU();
            ArrayList<C0379Ct> A082 = A08(d1, vt, str);
            if (z && A082.isEmpty() && 21 <= C0499Hs.A02 && C0499Hs.A02 <= 23) {
                vt = new VU();
                A082 = A08(d1, vt, str);
                if (!A082.isEmpty()) {
                    String A072 = A07(425, 14, 38);
                    Log.w(A072, A07(374, 51, 80) + str + A07(34, 12, 9) + A082.get(0).A02);
                }
            }
            if (A07(922, 14, 50).equals(str)) {
                A082.addAll(A08(new D1(A07(912, 10, 75), d1.A01), vt, str));
            }
            A0B(A082);
            List<C0379Ct> unmodifiableList = Collections.unmodifiableList(A082);
            A06.put(d1, unmodifiableList);
            return unmodifiableList;
        }
    }

    public static void A0B(List<C0379Ct> list) {
        if (C0499Hs.A02 < 26 && list.size() > 1) {
            if (A07(583, 25, 111).equals(list.get(0).A02)) {
                for (int i = 1; i < list.size(); i++) {
                    C0379Ct c0379Ct = list.get(i);
                    if (A07(657, 22, 61).equals(c0379Ct.A02)) {
                        list.remove(i);
                        list.add(0, c0379Ct);
                        return;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:205:0x0085, code lost:
        if (A07(123, 15, 35).equals(r8) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0095, code lost:
        if (A07(60, 10, 95).equals(r8) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x00a5, code lost:
        if (A07(364, 10, 102).equals(r8) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x00bc, code lost:
        if (A07(123, 15, 35).equals(r8) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x00fc, code lost:
        if (r3.equals(r8) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x010d, code lost:
        if (A07(909, 3, 112).equals(com.facebook.ads.redexgen.X.C0499Hs.A03) != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x010f, code lost:
        r3 = A07(891, 6, 52).equals(com.facebook.ads.redexgen.X.C0499Hs.A05);
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0129, code lost:
        if (com.facebook.ads.redexgen.X.D4.A02[7].length() == 9) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0130, code lost:
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x013c, code lost:
        if (r3.equals(r8) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x013f, code lost:
        com.facebook.ads.redexgen.X.D4.A02[1] = "ikTWzPZnBqNKNF5U8hE3rEiIh";
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0146, code lost:
        if (r3 == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0157, code lost:
        if (com.facebook.ads.redexgen.X.C0499Hs.A03.startsWith(A07(236, 2, 94)) == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0159, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x023a, code lost:
        if (A07(774, 6, 120).equals(com.facebook.ads.redexgen.X.C0499Hs.A03) != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x02b0, code lost:
        if (A07(80, 3, 3).equals(r3) == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x02c1, code lost:
        if (A07(85, 5, 49).equals(com.facebook.ads.redexgen.X.C0499Hs.A03) == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x02d6, code lost:
        if (A07(80, 5, 36).equals(r3) == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x0327, code lost:
        if (r3 == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x0337, code lost:
        if (A07(457, 22, 74).equals(r8) == false) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x0339, code lost:
        r3 = com.facebook.ads.redexgen.X.C0499Hs.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x0346, code lost:
        if (com.facebook.ads.redexgen.X.D4.A02[1].length() == 25) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x034c, code lost:
        if (r6.equals(r3) == false) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x035e, code lost:
        if (com.facebook.ads.redexgen.X.C0499Hs.A03.startsWith(A07(1042, 8, 121)) != false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x036f, code lost:
        if (com.facebook.ads.redexgen.X.C0499Hs.A03.startsWith(A07(1050, 7, 27)) != false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x0380, code lost:
        if (com.facebook.ads.redexgen.X.C0499Hs.A03.startsWith(A07(1036, 6, 27)) != false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x0391, code lost:
        if (A07(763, 6, 32).equals(com.facebook.ads.redexgen.X.C0499Hs.A03) != false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x03a3, code lost:
        if (A07(966, 12, 30).equals(com.facebook.ads.redexgen.X.C0499Hs.A03) != false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x03b4, code lost:
        if (A07(55, 5, 125).equals(com.facebook.ads.redexgen.X.C0499Hs.A03) != false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x03c5, code lost:
        if (A07(757, 6, 127).equals(com.facebook.ads.redexgen.X.C0499Hs.A03) != false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x03d6, code lost:
        if (A07(769, 5, 113).equals(com.facebook.ads.redexgen.X.C0499Hs.A03) == false) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x03d8, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x03d9, code lost:
        com.facebook.ads.redexgen.X.D4.A02[7] = "xnGQuYocR";
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x03e4, code lost:
        if (r6.equals(r3) == false) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x03ef, code lost:
        if (r3 == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x0424, code lost:
        if (r6.equals(r3) != false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x0435, code lost:
        if (com.facebook.ads.redexgen.X.C0499Hs.A03.startsWith(A07(944, 2, 120)) != false) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x0446, code lost:
        if (com.facebook.ads.redexgen.X.C0499Hs.A03.startsWith(A07(997, 7, 26)) != false) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x044e, code lost:
        if (com.facebook.ads.redexgen.X.C0499Hs.A03.startsWith(r4) != false) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x045e, code lost:
        if (com.facebook.ads.redexgen.X.C0499Hs.A03.startsWith(A07(991, 6, 3)) != false) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x046f, code lost:
        if (com.facebook.ads.redexgen.X.C0499Hs.A03.startsWith(A07(1004, 2, 28)) == false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x0471, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x047d, code lost:
        if (r6.equals(r3) != false) goto L145;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0C(android.media.MediaCodecInfo r7, java.lang.String r8, boolean r9, java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 1216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.D4.A0C(android.media.MediaCodecInfo, java.lang.String, boolean, java.lang.String):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0028, code lost:
        if (A07(439, 8, 11).equals(com.facebook.ads.redexgen.X.C0499Hs.A06) != false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0D(java.lang.String r4) {
        /*
            int r1 = com.facebook.ads.redexgen.X.C0499Hs.A02
            r0 = 22
            if (r1 > r0) goto L4c
            java.lang.String r3 = com.facebook.ads.redexgen.X.C0499Hs.A06
            r2 = 447(0x1bf, float:6.26E-43)
            r1 = 10
            r0 = 116(0x74, float:1.63E-43)
            java.lang.String r0 = A07(r2, r1, r0)
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L2a
            java.lang.String r3 = com.facebook.ads.redexgen.X.C0499Hs.A06
            r2 = 439(0x1b7, float:6.15E-43)
            r1 = 8
            r0 = 11
            java.lang.String r0 = A07(r2, r1, r0)
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L4c
        L2a:
            r2 = 479(0x1df, float:6.71E-43)
            r1 = 22
            r0 = 69
            java.lang.String r0 = A07(r2, r1, r0)
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L4a
            r2 = 501(0x1f5, float:7.02E-43)
            r1 = 29
            r0 = 80
            java.lang.String r0 = A07(r2, r1, r0)
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L4c
        L4a:
            r0 = 1
        L4b:
            return r0
        L4c:
            r0 = 0
            goto L4b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.D4.A0D(java.lang.String):boolean");
    }
}
