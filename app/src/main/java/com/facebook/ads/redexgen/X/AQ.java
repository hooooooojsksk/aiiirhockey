package com.facebook.ads.redexgen.X;

import com.mobirix.airhockey.airhockey;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: assets/audience_network.dex */
public final class AQ extends Exception {
    public static byte[] A01;
    public static String[] A02 = {"9U3wPdJIU", "2LGp", "pJySrIerQ92A61C", "DThvYGttjE9j20qDJ6yVSrG4WY8ID38s", "4d1rNabt9wBbosJplZDA5yWTcQ5bg7DE", "S2Er", "uH", "phkxp1nklLcjNUB8"};
    public final int A00;

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0049, code lost:
        throw new java.lang.RuntimeException();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String A00(int r4, int r5, int r6) {
        /*
            byte[] r1 = com.facebook.ads.redexgen.X.AQ.A01
            int r0 = r4 + r5
            byte[] r3 = java.util.Arrays.copyOfRange(r1, r4, r0)
            r4 = 0
        L9:
            int r5 = r3.length
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.AQ.A02
            r0 = 0
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 2
            if (r1 == r0) goto L44
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.AQ.A02
            java.lang.String r1 = "mthCjCtxSYf9ojX"
            r0 = 2
            r2[r0] = r1
            if (r4 >= r5) goto L3e
            r0 = r3[r4]
            r0 = r0 ^ r6
            r0 = r0 ^ 76
            byte r0 = (byte) r0
            r3[r4] = r0
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.AQ.A02
            r0 = 6
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 24
            if (r1 == r0) goto L44
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.AQ.A02
            java.lang.String r1 = "k"
            r0 = 0
            r2[r0] = r1
            int r4 = r4 + 1
            goto L9
        L3e:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3)
            return r0
        L44:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AQ.A00(int, int, int):java.lang.String");
    }

    public static void A01() {
        A01 = new byte[]{76, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_GAME_REMATCH, airhockey.J_ONREWARDED, airhockey.J_NATION, 89, ByteCompanionObject.MAX_VALUE, airhockey.J_GAME_DISCONNECT, airhockey.J_INVITE, 102, 45, airhockey.J_PURCHASE, ByteCompanionObject.MAX_VALUE, airhockey.J_ONREWARDED, airhockey.J_WAIT, airhockey.J_ENEMYLOSE, 45, airhockey.J_GAME_ENEMYEXIT, airhockey.J_GAME_DISCONNECT, airhockey.J_ONREWARDED, airhockey.J_SDKVER, airhockey.J_ENEMYLOSE, airhockey.J_GAME_REMATCH, 55, 45};
    }

    static {
        A01();
    }

    public AQ(int i) {
        super(A00(0, 25, 65) + i);
        this.A00 = i;
    }
}
