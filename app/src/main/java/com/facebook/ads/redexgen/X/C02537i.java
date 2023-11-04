package com.facebook.ads.redexgen.X;

import android.os.Process;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.mobirix.airhockey.airhockey;
import java.lang.Thread;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.7i */
/* loaded from: assets/audience_network.dex */
public final class C02537i implements Thread.UncaughtExceptionHandler {
    public static byte[] A04;
    public final C0886Xb A00;
    public final InterfaceC02597p A01;
    public final Thread.UncaughtExceptionHandler A02;
    public final Map<String, String> A03;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 65);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{42, 28, 94, airhockey.J_PURCHASE, 96, 96, airhockey.J_PURCHASE, 125, airhockey.J_DISCONNECT, 51, 80, 124, 125, airhockey.J_ENEMYWIN, airhockey.J_REWARD, airhockey.J_GAME_ENEMYEXIT, airhockey.J_ENEMYWIN, 11, 7, 5, airhockey.P_GAME_BREAKBALLCOUNT, 14, 9, 11, 13, 10, 7, 7, 3, airhockey.P_GAME_BREAKBALLCOUNT, 9, 12, 27, airhockey.P_GAME_MYWIN, 86, airhockey.P_GAME_STANDBY, 87, 76, 20, 18, 5, 19, 30, 23, 2, 80, 86, 65, 87, 90, 83, airhockey.P_GAME_BREAKBALLCOUNT, 124, 64, 76, airhockey.P_GAME_MYWIN, airhockey.P_GAME_BREAKBALLCOUNT};
    }

    public C02537i(@Nullable Thread.UncaughtExceptionHandler uncaughtExceptionHandler, C0886Xb c0886Xb, InterfaceC02527h interfaceC02527h) {
        this(uncaughtExceptionHandler, c0886Xb, interfaceC02527h, C02607q.A00());
    }

    public C02537i(@Nullable Thread.UncaughtExceptionHandler uncaughtExceptionHandler, C0886Xb c0886Xb, InterfaceC02527h interfaceC02527h, InterfaceC02597p interfaceC02597p) {
        this.A02 = uncaughtExceptionHandler;
        if (c0886Xb != null) {
            this.A00 = c0886Xb;
            this.A03 = interfaceC02527h.A7g(c0886Xb);
            this.A01 = interfaceC02597p;
            return;
        }
        throw new IllegalArgumentException(A00(2, 15, 82));
    }

    public static void A02() {
        try {
            Process.killProcess(Process.myPid());
        } catch (Throwable unused) {
        }
        try {
            System.exit(10);
        } catch (Throwable unused2) {
        }
    }

    private void A03(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.A02;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        } else {
            A02();
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            String A03 = L3.A03(this.A00, th);
            if (!TextUtils.isEmpty(A03)) {
                String stackTraceString = A00(17, 16, 41);
                if (A03.contains(stackTraceString)) {
                    Map<String, String> A02 = new C02517g(A03, this.A03).A02();
                    String A00 = A00(38, 7, 38);
                    String stackTraceString2 = A00(33, 5, 101);
                    A02.put(A00, stackTraceString2);
                    Throwable A002 = AbstractRunnableC0543Jo.A00();
                    String A003 = A00(45, 12, 98);
                    if (A002 != th) {
                        String stackTraceString3 = A00(0, 1, 91);
                        A02.put(A003, stackTraceString3);
                    } else {
                        String stackTraceString4 = A00(1, 1, 108);
                        A02.put(A003, stackTraceString4);
                    }
                    this.A01.AG9(new C02667w(this.A00.A08().A01(), this.A00.A08().A02(), A02), this.A00);
                    if (IK.A1Z(this.A00)) {
                        IK.A0c(this.A00);
                    }
                }
            }
        } catch (Exception unused) {
        }
        A03(thread, th);
    }
}
