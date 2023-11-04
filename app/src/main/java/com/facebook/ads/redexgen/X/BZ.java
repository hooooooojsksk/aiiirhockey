package com.facebook.ads.redexgen.X;

import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: assets/audience_network.dex */
public final class BZ {
    public static byte[] A02;
    public static String[] A03 = {"I7u5SMwnia1LjR8q2dDSZ1ZxyvAUDNjZ", "lA52iG6YY0NJNsRtQCweAmt1bj2X", "2qXiYNq9KlAFUySgaSTQYzQ4aWQihc1C", "j3GaPat5F4JzB2k2u38FDmanRSccFQ7x", "Rgx4knYMi3WRjmVXMYvkXYj", "jdUpLioS3ej7GnR7zzwjeYlHhGFO", "z8YFUav71iIZ039OmPtsZmkN2j2dK8kW", "CjGTtkLliNi5lySdeHdx4jpczrbS9nvg"};
    public static final DL A04;
    public static final Pattern A05;
    public int A00 = -1;
    public int A01 = -1;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 38);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{87, 41, 82, 57, 36, 48, airhockey.J_ENEMYLOSE, 36, 111, airhockey.P_GAME_MYLOSE, 36, 79, 84, airhockey.J_SAVEDGAME_RELOAD, 49, airhockey.J_DISCONNECT, 41, 33, 82, 57, 36, 48, airhockey.J_ENEMYLOSE, 36, 111, airhockey.P_GAME_MYLOSE, 36, 79, 84, airhockey.J_SAVEDGAME_RELOAD, 49, airhockey.J_DISCONNECT, 32, 41, 33, 82, 57, 36, 48, airhockey.J_ENEMYLOSE, 36, 111, airhockey.P_GAME_MYLOSE, 36, 79, 84, airhockey.J_SAVEDGAME_RELOAD, 49, airhockey.J_DISCONNECT, 32, airhockey.P_GAME_EXIT, airhockey.P_GAME_BREAKBALLCOUNT, airhockey.P_GAME_SELECTMAP, 7, airhockey.P_GAME_MYLOSE, 89, 89, airhockey.P_GAME_STANDBY, 76, 7, 64, 125, 92, airhockey.P_GAME_MYWIN, 76, 90, 43, 22, 55, 44, 17, 15, 18, 0};
    }

    static {
        A01();
        A04 = new WV();
        A05 = Pattern.compile(A00(0, 50, 47));
    }

    private boolean A02(String str) {
        Matcher matcher = A05.matcher(str);
        if (matcher.find()) {
            try {
                int parseInt = Integer.parseInt(matcher.group(1), 16);
                int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                if (parseInt > 0 || parseInt2 > 0) {
                    this.A00 = parseInt;
                    this.A01 = parseInt2;
                    return true;
                }
                return false;
            } catch (NumberFormatException unused) {
                return false;
            }
        }
        return false;
    }

    public final boolean A03() {
        return (this.A00 == -1 || this.A01 == -1) ? false : true;
    }

    public final boolean A04(int i) {
        int encoderPadding = i >> 12;
        int encoderDelay = i & 4095;
        if (encoderPadding > 0 || encoderDelay > 0) {
            this.A00 = encoderPadding;
            this.A01 = encoderDelay;
            return true;
        }
        return false;
    }

    /* JADX WARN: Incorrect condition in loop: B:42:0x0005 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A05(com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata r9) {
        /*
            r8 = this;
            r4 = 0
        L1:
            int r0 = r9.A00()
            if (r4 >= r0) goto L7a
            com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata$Entry r5 = r9.A01(r4)
            boolean r3 = r5 instanceof com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.CommentFrame
            r2 = 66
            r1 = 8
            r0 = 100
            java.lang.String r6 = A00(r2, r1, r0)
            r7 = 1
            if (r3 == 0) goto L4e
            com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.CommentFrame r5 = (com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.CommentFrame) r5
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.BZ.A03
            r0 = 6
            r1 = r2[r0]
            r0 = 3
            r2 = r2[r0]
            r0 = 21
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L36
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L36:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.BZ.A03
            java.lang.String r1 = "qNstZA7UFnX3Ahz0Wj5J3oCW9XwBWpVm"
            r0 = 2
            r2[r0] = r1
            java.lang.String r0 = r5.A00
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L77
            java.lang.String r0 = r5.A02
            boolean r0 = r8.A02(r0)
            if (r0 == 0) goto L77
            return r7
        L4e:
            boolean r0 = r5 instanceof com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.InternalFrame
            if (r0 == 0) goto L77
            com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.InternalFrame r5 = (com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.InternalFrame) r5
            java.lang.String r3 = r5.A01
            r2 = 50
            r1 = 16
            r0 = 15
            java.lang.String r0 = A00(r2, r1, r0)
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L77
            java.lang.String r0 = r5.A00
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L77
            java.lang.String r0 = r5.A02
            boolean r0 = r8.A02(r0)
            if (r0 == 0) goto L77
            return r7
        L77:
            int r4 = r4 + 1
            goto L1
        L7a:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.BZ.A05(com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata):boolean");
    }
}
