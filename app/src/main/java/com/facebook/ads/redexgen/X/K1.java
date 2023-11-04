package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import androidx.annotation.Nullable;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

@SuppressLint({"CatchGeneralException"})
/* loaded from: assets/audience_network.dex */
public abstract class K1 implements Runnable {
    public static byte[] A01;
    public static final AtomicBoolean A02;
    public static final AtomicBoolean A03;
    public static final AtomicReference<InterfaceC0546Jr> A04;
    @Nullable
    public final C0544Jp A00;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 116);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{124, 91, 64, 64, 79, 76, airhockey.P_NATION, 75, 14, 77, 92, 75, 79, 90, 75, airhockey.P_GAME_EXIT, 0, 14, airhockey.J_PURCHASE, airhockey.P_GAME_BREAKBALLCOUNT, 92, 75, 79, airhockey.P_GAME_EXIT, 20, 14};
    }

    public abstract void A06();

    static {
        A02();
        A02 = new AtomicBoolean();
        A03 = new AtomicBoolean(false);
        A04 = new AtomicReference<>();
    }

    public K1() {
        if (A03.get()) {
            this.A00 = K6.A01(new K5(A01(0, 26, 90) + Thread.currentThread().getName()));
            return;
        }
        this.A00 = null;
    }

    public static void A03(boolean z) {
        A03.set(z);
    }

    public static void A04(boolean z, InterfaceC0546Jr interfaceC0546Jr) {
        A02.set(z);
        A04.set(interfaceC0546Jr);
    }

    @Nullable
    public final C0544Jp A05() {
        return this.A00;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            if (A03.get()) {
                K6.A03(this);
            }
            A06();
            if (A03.get()) {
                K6.A04(this);
            }
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }
}
