package com.facebook.ads.redexgen.X;

import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: assets/audience_network.dex */
public class LP implements ThreadFactory {
    public static byte[] A03;
    public final AtomicInteger A00 = new AtomicInteger(1);
    public final /* synthetic */ LQ A01;
    public final /* synthetic */ String A02;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 41);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{96, airhockey.J_ENEMYWIN, airhockey.J_ENEMYLOSE, 28, 3, 85, 6, 5, 3, airhockey.P_NATION};
    }

    public LP(LQ lq, String str) {
        this.A01 = lq;
        this.A02 = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, String.format(Locale.US, A00(0, 10, 15), this.A02, Integer.valueOf(this.A00.getAndIncrement())));
    }
}
