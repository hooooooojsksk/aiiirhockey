package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: assets/audience_network.dex */
public final class LQ implements Executor {
    public static int A03;
    public static byte[] A04;
    public static String[] A05 = {"dqRa11pwCIxD9G", "Prl4kldBaiKkX", "x63WXgOLaV3", "ISgeAY0wdrDCT1ale0N91K8aXfWfv0tW", "LCKhovWaUpSA3noBlHvNtEEMnkYTagBf", "4iBL7X4rSmnE5Q6mVAm5IE9McxSQzo1J", "Gaojjwe04e5jqq3nowZJFAyYK", "ekobvqODjhkADWqsAO3q6OJDBrcRvo3h"};
    public static final Executor A06;
    public static final Executor A07;
    public static final Executor A08;
    public static final Executor A09;
    public static final ExecutorService A0A;
    public static final ExecutorService A0B;
    public static final ExecutorService A0C;
    public static final AtomicBoolean A0D;
    public static final AtomicBoolean A0E;
    @Nullable
    public Executor A00;
    public ThreadPoolExecutor A01;
    public final int A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 58);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A04 = new byte[]{32, 50, 56, 47, 34, 125, 123, 124, 119, 102, airhockey.J_GAME_STANDBY, 125, 96, airhockey.J_WAIT, airhockey.J_GOO, airhockey.P_GAME_EXIT, 89, airhockey.P_GAME_BREAKBALLCOUNT, 3, 30, 3, 64, airhockey.J_ERROR, airhockey.J_ENEMYWIN, ByteCompanionObject.MAX_VALUE, airhockey.J_ENEMYWIN, 52, airhockey.J_GAME_STANDBY, airhockey.J_SDKVER, airhockey.J_BACK, airhockey.J_SDKVER, airhockey.J_BACK, 52, 96, 123, 123, 52, airhockey.J_ACHIEVEMENTCALLBACK, 123, airhockey.J_PURCHASE, airhockey.J_SAVEDGAME_SAVE, 58, airhockey.P_GAME_BREAKBALLCOUNT, airhockey.P_GAME_SELECTMAP, 79, airhockey.P_GAME_SELECTMAP, 83, airhockey.P_GAME_MYLOSE, airhockey.P_NATION};
    }

    static {
        A04();
        A08 = new LQ(A00(7, 7, 8), 0);
        A06 = new LQ(A00(0, 5, 91), 0);
        A07 = new LQ(A00(5, 2, 3), 0);
        A03 = 32;
        A0C = Executors.newSingleThreadExecutor();
        A0B = Executors.newFixedThreadPool(5);
        A0D = new AtomicBoolean();
        A0E = new AtomicBoolean();
        A0A = Executors.newCachedThreadPool(new LO());
        A09 = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
    }

    @VisibleForTesting
    public LQ(String str, int i) {
        this.A02 = i;
        int CPU_COUNT = Runtime.getRuntime().availableProcessors();
        this.A01 = new ThreadPoolExecutor(Math.max(2, Math.min(CPU_COUNT - 1, 4)), (CPU_COUNT * 2) + 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new LP(this, str));
        this.A01.allowCoreThreadTimeOut(true);
    }

    public static Executor A01() {
        AtomicBoolean atomicBoolean = A0E;
        if (A05[6].length() != 10) {
            A05[7] = "uTbwdcOZXJtEr7HfAL7lQlSS6oe88jWw";
            if (atomicBoolean.get()) {
                return A0A;
            }
            return A09;
        }
        throw new RuntimeException();
    }

    public static ExecutorService A02() {
        if (A0D.get()) {
            return A0A;
        }
        ExecutorService executorService = A0B;
        if (A05[7].charAt(6) != 'O') {
            throw new RuntimeException();
        }
        A05[1] = "2M7uNo";
        return executorService;
    }

    public static ExecutorService A03() {
        if (A0D.get()) {
            return A0A;
        }
        return A0C;
    }

    public static void A05(Context context) {
        A0D.set(IK.A29(context));
        A0E.set(IK.A28(context));
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (this.A00 == null && Looper.myLooper() == Looper.getMainLooper()) {
            this.A00 = AsyncTask.THREAD_POOL_EXECUTOR;
        }
        Executor executor = this.A00;
        if ((executor instanceof ThreadPoolExecutor) && ((ThreadPoolExecutor) executor).getQueue().size() < this.A02) {
            this.A00.execute(runnable);
            return;
        }
        int size = this.A01.getQueue().size();
        synchronized (LQ.class) {
            int i = A03;
            int reservedExecutorQueueSize = A03;
            if (size == reservedExecutorQueueSize) {
                int reservedExecutorQueueSize2 = A03;
                A03 = reservedExecutorQueueSize2 * 2;
                C0886Xb A00 = C7M.A00();
                if (A00 != null) {
                    InterfaceC02617r A072 = A00.A07();
                    String A002 = A00(42, 7, 27);
                    int i2 = C02627s.A1c;
                    String A003 = A00(21, 21, 46);
                    A072.A9C(A002, i2, new C02637t(A003, A00(14, 7, 25) + i));
                }
            }
        }
        this.A01.execute(runnable);
    }
}
