package com.facebook.ads.redexgen.X;

import android.view.animation.Interpolator;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.4k */
/* loaded from: assets/audience_network.dex */
public class C01864k {
    public static byte[] A07;
    public static String[] A08 = {"mhxsSpCIE", "HPHd8ajTElCt4xjey", "7Zb31Oi", "DD", "BNYok10xEf4gIs6uNCWHihSbJqoYG9kt", "IDmLc2m45tKSy5LkWISCl9o5476O0eoP", "nkkzGeiOD1wUj3jYejs7CProiVmlcOmv", "T15Acsoxou"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public Interpolator A05;
    public boolean A06;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 35);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A07 = new byte[]{111, 64, 6, 95, airhockey.P_GAME_REMATCH, 83, 6, 86, 84, airhockey.P_GAME_REMATCH, 80, 79, airhockey.P_NATION, airhockey.P_GAME_MYSCORE, 6, airhockey.P_GAME_MYWIN, airhockey.P_GAME_MYLOSE, 6, 79, airhockey.P_GAME_MYLOSE, 82, airhockey.P_GAME_MYSCORE, 84, 86, airhockey.P_GAME_REMATCH, airhockey.P_GAME_EXIT, airhockey.P_GAME_MYWIN, 82, airhockey.P_GAME_REMATCH, 84, 10, 6, 95, airhockey.P_GAME_REMATCH, 83, 6, 75, 83, 85, 82, 6, 85, airhockey.P_GAME_MYSCORE, 82, 6, airhockey.P_GAME_MYWIN, 6, 86, airhockey.P_GAME_REMATCH, 85, 79, 82, 79, 80, airhockey.P_GAME_MYSCORE, 6, airhockey.P_NATION, 83, 84, airhockey.P_GAME_MYWIN, 82, 79, airhockey.P_GAME_REMATCH, airhockey.P_GAME_MYLOSE, 8, 63, 57, 35, 57, 54, 63, 40, 12, 51, 63, 45, 30, 46, 63, 34, 33, 33, 109, 41, 56, 63, 44, 57, 36, 34, 35, 109, 32, 56, 62, 57, 109, 47, 40, 109, 44, 109, 61, 34, 62, 36, 57, 36, 59, 40, 109, 35, 56, 32, 47, 40, 63, 102, 88, 90, 90, 65, 93, 21, 102, 86, airhockey.P_GAME_MYWIN, 90, 89, 89, 21, 84, 86, 65, 92, 90, 91, 21, 92, airhockey.P_GAME_BREAKBALLCOUNT, 21, 87, 80, 92, 91, 82, 21, 64, airhockey.P_GAME_STANDBY, 81, 84, 65, 80, 81, 21, 65, 90, 90, 21, 83, airhockey.P_GAME_MYWIN, 80, airhockey.P_GAME_SELECTMAP, 64, 80, 91, 65, 89, 76, 27, 21, airhockey.J_ACHIEVEMENTCALLBACK, 84, 94, 80, 21, airhockey.P_GAME_BREAKBALLCOUNT, 64, airhockey.P_GAME_MYWIN, 80, 21, 76, 90, 64, 21, 84, airhockey.P_GAME_MYWIN, 80, 21, 91, 90, 65, 21, 86, 93, 84, 91, 82, 92, 91, 82, 21, 92, 65, 21, 64, 91, 89, 80, airhockey.P_GAME_BREAKBALLCOUNT, airhockey.P_GAME_BREAKBALLCOUNT, 21, 91, 80, 86, 80, airhockey.P_GAME_BREAKBALLCOUNT, airhockey.P_GAME_BREAKBALLCOUNT, 84, airhockey.P_GAME_MYWIN, 76};
    }

    static {
        A02();
    }

    public C01864k(int i, int i2) {
        this(i, i2, Integer.MIN_VALUE, null);
    }

    public C01864k(int i, int i2, int i3, Interpolator interpolator) {
        this.A04 = -1;
        this.A06 = false;
        this.A00 = 0;
        this.A02 = i;
        this.A03 = i2;
        this.A01 = i3;
        this.A05 = interpolator;
    }

    private void A01() {
        if (this.A05 == null || this.A01 >= 1) {
            if (this.A01 >= 1) {
                return;
            }
            throw new IllegalStateException(A00(76, 41, 110));
        }
        throw new IllegalStateException(A00(0, 64, 5));
    }

    public final void A03(int i) {
        this.A04 = i;
    }

    public final void A04(int i, int i2, int i3, Interpolator interpolator) {
        this.A02 = i;
        this.A03 = i2;
        this.A01 = i3;
        this.A05 = interpolator;
        this.A06 = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0057, code lost:
        if (r4 == Integer.MIN_VALUE) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0059, code lost:
        r7.A08.A0A(r6.A02, r6.A03);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0094, code lost:
        if (r4 == Integer.MIN_VALUE) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0097, code lost:
        r7.A08.A0B(r6.A02, r6.A03, r6.A01);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A05(com.facebook.ads.redexgen.X.E9 r7) {
        /*
            r6 = this;
            int r0 = r6.A04
            r5 = 0
            if (r0 < 0) goto L10
            int r1 = r6.A04
            r0 = -1
            r6.A04 = r0
            r7.A1T(r1)
            r6.A06 = r5
            return
        L10:
            boolean r3 = r6.A06
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C01864k.A08
            r0 = 0
            r1 = r2[r0]
            r0 = 7
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto Lb4
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C01864k.A08
            java.lang.String r1 = "212KLvw"
            r0 = 2
            r2[r0] = r1
            java.lang.String r1 = "ScHRjLy9POjuhpXgs"
            r0 = 1
            r2[r0] = r1
            if (r3 == 0) goto Lb1
            r6.A01()
            android.view.animation.Interpolator r0 = r6.A05
            if (r0 != 0) goto La3
            int r4 = r6.A01
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C01864k.A08
            r0 = 5
            r1 = r1[r0]
            r0 = 7
            char r1 = r1.charAt(r0)
            r0 = 109(0x6d, float:1.53E-43)
            if (r1 == r0) goto L88
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C01864k.A08
            java.lang.String r1 = "zRXbG2Pg2WQl47tw6BDwFwXd2KU4dPOe"
            r0 = 6
            r2[r0] = r1
            java.lang.String r1 = "nOulwAzWUzM6mtcilc92MTdFBYoxfopf"
            r0 = 4
            r2[r0] = r1
            if (r4 != r3) goto L97
        L59:
            com.facebook.ads.redexgen.X.4q r2 = r7.A08
            int r1 = r6.A02
            int r0 = r6.A03
            r2.A0A(r1, r0)
        L62:
            int r0 = r6.A00
            int r0 = r0 + 1
            r6.A00 = r0
            int r1 = r6.A00
            r0 = 10
            if (r1 <= r0) goto L85
            r2 = 64
            r1 = 12
            r0 = 121(0x79, float:1.7E-43)
            java.lang.String r3 = A00(r2, r1, r0)
            r2 = 117(0x75, float:1.64E-43)
            r1 = 104(0x68, float:1.46E-43)
            r0 = 22
            java.lang.String r0 = A00(r2, r1, r0)
            android.util.Log.e(r3, r0)
        L85:
            r6.A06 = r5
        L87:
            return
        L88:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C01864k.A08
            java.lang.String r1 = "ZgMLwAgsg"
            r0 = 0
            r2[r0] = r1
            java.lang.String r1 = "4bf8d9ADjt"
            r0 = 7
            r2[r0] = r1
            if (r4 != r3) goto L97
            goto L59
        L97:
            com.facebook.ads.redexgen.X.4q r3 = r7.A08
            int r2 = r6.A02
            int r1 = r6.A03
            int r0 = r6.A01
            r3.A0B(r2, r1, r0)
            goto L62
        La3:
            com.facebook.ads.redexgen.X.4q r4 = r7.A08
            int r3 = r6.A02
            int r2 = r6.A03
            int r1 = r6.A01
            android.view.animation.Interpolator r0 = r6.A05
            r4.A0C(r3, r2, r1, r0)
            goto L62
        Lb1:
            r6.A00 = r5
            goto L87
        Lb4:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C01864k.A05(com.facebook.ads.redexgen.X.E9):void");
    }

    public final boolean A06() {
        return this.A04 >= 0;
    }
}
