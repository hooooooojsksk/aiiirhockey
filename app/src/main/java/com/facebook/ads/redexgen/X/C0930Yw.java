package com.facebook.ads.redexgen.X;

import com.mobirix.airhockey.airhockey;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Yw */
/* loaded from: assets/audience_network.dex */
public class C0930Yw<T> implements InterfaceC01372k<T> {
    public static byte[] A02;
    public static String[] A03 = {"pRcBA4OWefysSNzvRxIkpBVTVwfc3AVE", "RPn4qv0f1UarsEXGS1XogTnrbpEJEmnV", "xmsaI0t9E", "ZcBN", "DIlRoYRb", "oKMZSswBXiC", "UEhtJ1eDnORTZ2wzgc9obnj9WqOhgFHK", "4xQT2X5Ea9Pr"};
    public int A00;
    public final Object[] A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = copyOfRange[i4];
            String[] strArr = A03;
            if (strArr[4].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            A03[5] = "P1E265Ge3cQ";
            copyOfRange[i4] = (byte) ((b ^ i3) ^ 106);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{44, 1, 31, 8, 12, 9, 20, 77, 4, 3, 77, 25, 5, 8, 77, 29, 2, 2, 1, 76, 76, airhockey.J_GOO, 125, 56, airhockey.J_ERROR, airhockey.J_WAIT, 96, 56, airhockey.J_ENEMYLOSE, 119, 119, airhockey.J_DISCONNECT, 56, airhockey.J_GAME_ENEMYEXIT, airhockey.J_BACK, airhockey.J_NATION, 125, 56, airhockey.J_ERROR, 109, airhockey.J_GAME_ENEMYEXIT, airhockey.J_GAME_DISCONNECT, 56, airhockey.J_PURCHASE, 125, 56, 38, 56, 40};
    }

    static {
        A01();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Yw != com.facebook.ads.internal.androidx.support.v4.util.Pools$SimplePool<T> */
    public C0930Yw(int i) {
        if (i > 0) {
            this.A01 = new Object[i];
            return;
        }
        throw new IllegalArgumentException(A00(20, 29, 114));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Yw != com.facebook.ads.internal.androidx.support.v4.util.Pools$SimplePool<T> */
    /* JADX WARN: Incorrect condition in loop: B:23:0x0003 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A02(T r6) {
        /*
            r5 = this;
            r4 = 0
        L1:
            int r0 = r5.A00
            if (r4 >= r0) goto L34
            java.lang.Object[] r0 = r5.A01
            r3 = r0[r4]
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0930Yw.A03
            r0 = 2
            r1 = r2[r0]
            r0 = 3
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L2e
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0930Yw.A03
            java.lang.String r1 = "IsiBXNP8"
            r0 = 4
            r2[r0] = r1
            java.lang.String r1 = "yZIlFrLQCuaZ"
            r0 = 7
            r2[r0] = r1
            if (r3 != r6) goto L2b
            r0 = 1
            return r0
        L2b:
            int r4 = r4 + 1
            goto L1
        L2e:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L34:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0930Yw.A02(java.lang.Object):boolean");
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Yw != com.facebook.ads.internal.androidx.support.v4.util.Pools$SimplePool<T> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC01372k
    public T A2P() {
        int i = this.A00;
        if (i > 0) {
            int lastPooledIndex = i - 1;
            Object[] objArr = this.A01;
            T t = (T) objArr[lastPooledIndex];
            objArr[lastPooledIndex] = null;
            this.A00 = i - 1;
            return t;
        }
        return null;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Yw != com.facebook.ads.internal.androidx.support.v4.util.Pools$SimplePool<T> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC01372k
    public boolean AE7(T instance) {
        if (!A02(instance)) {
            int i = this.A00;
            Object[] objArr = this.A01;
            if (i < objArr.length) {
                objArr[i] = instance;
                this.A00 = i + 1;
                return true;
            }
            return false;
        }
        throw new IllegalStateException(A00(0, 20, 7));
    }
}
