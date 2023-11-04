package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.Nullable;
import com.facebook.ads.redexgen.X.InterfaceC0466Gl;
import com.mobirix.airhockey.airhockey;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;

@SuppressLint({"HandlerLeak"})
/* renamed from: com.facebook.ads.redexgen.X.Gk */
/* loaded from: assets/audience_network.dex */
public final class HandlerC0465Gk<T extends InterfaceC0466Gl> extends Handler implements Runnable {
    public static byte[] A0A;
    public int A00;
    @Nullable
    public InterfaceC0464Gj<T> A01;
    public IOException A02;
    public final int A03;
    public final long A04;
    public final T A05;
    public volatile Thread A06;
    public volatile boolean A07;
    public volatile boolean A08;
    public final /* synthetic */ C0810Ua A09;

    static {
        A04();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 25);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A0A = new byte[]{-124, 119, -85, -76, -69, -122, -70, -35, -49, -46, -62, -49, -31, -39, -80, -42, -43, -80, -57, -82, -58, -50, -48, -45, -38, -127, -58, -45, -45, -48, -45, -127, -51, -48, -62, -59, -54, -49, -56, -127, -44, -43, -45, -58, -62, -50, -29, -4, -13, 6, -2, -13, -15, 2, -13, -14, -82, -13, 0, 0, -3, 0, -82, -6, -3, -17, -14, -9, -4, -11, -82, 1, 2, 0, -13, -17, -5, airhockey.J_REWARD, -113, -122, -103, -111, -122, -124, -107, -122, -123, 65, -122, -103, -124, -122, -111, -107, -118, -112, -113, 65, -119, -126, -113, -123, -115, -118, -113, -120, 65, -115, -112, -126, -123, 65, -124, -112, -114, -111, -115, -122, -107, -122, -123, airhockey.J_ACHIEVEMENTCALLBACK, -111, -120, -101, -109, -120, -122, -105, -120, -121, airhockey.P_GAME_MYSCORE, -120, -101, -122, -120, -109, -105, -116, -110, -111, airhockey.P_GAME_MYSCORE, -113, -110, -124, -121, -116, -111, -118, airhockey.P_GAME_MYSCORE, -106, -105, -107, -120, -124, -112, -4, -1, -15, -12, -54, -52, -13, -4, 3, -50};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Gj != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.Loader$Callback<T extends com.facebook.ads.redexgen.X.Gl> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Gk != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.Gl> */
    public HandlerC0465Gk(C0810Ua c0810Ua, Looper looper, T loadable, InterfaceC0464Gj<T> interfaceC0464Gj, int i, long j) {
        super(looper);
        this.A09 = c0810Ua;
        this.A05 = loadable;
        this.A01 = interfaceC0464Gj;
        this.A03 = i;
        this.A04 = j;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Gk != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.Gl> */
    private long A00() {
        return Math.min((this.A00 - 1) * 1000, 5000);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Gk != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.Gl> */
    private void A02() {
        ExecutorService executorService;
        HandlerC0465Gk handlerC0465Gk;
        this.A02 = null;
        executorService = this.A09.A02;
        handlerC0465Gk = this.A09.A00;
        executorService.execute(handlerC0465Gk);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Gk != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.Gl> */
    private void A03() {
        this.A09.A00 = null;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Gk != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.Gl> */
    public final void A05(int i) throws IOException {
        IOException iOException = this.A02;
        if (iOException == null || this.A00 <= i) {
            return;
        }
        throw iOException;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Gk != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.Gl> */
    public final void A06(long j) {
        HandlerC0465Gk handlerC0465Gk;
        handlerC0465Gk = this.A09.A00;
        HD.A04(handlerC0465Gk == null);
        this.A09.A00 = this;
        if (j > 0) {
            sendEmptyMessageDelayed(0, j);
        } else {
            A02();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Gk != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.Gl> */
    public final void A07(boolean z) {
        this.A08 = z;
        this.A02 = null;
        if (hasMessages(0)) {
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
            }
        } else {
            this.A07 = true;
            this.A05.A3z();
            if (this.A06 != null) {
                this.A06.interrupt();
            }
        }
        if (z) {
            A03();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.A01.ABS(this.A05, elapsedRealtime, elapsedRealtime - this.A04, true);
            this.A01 = null;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Gk != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.Gl> */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            if (this.A08) {
                return;
            }
            if (message.what == 0) {
                A02();
            } else if (message.what != 4) {
                A03();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = elapsedRealtime - this.A04;
                if (this.A07) {
                    this.A01.ABS(this.A05, elapsedRealtime, j, false);
                    return;
                }
                int i = message.what;
                if (i == 1) {
                    this.A01.ABS(this.A05, elapsedRealtime, j, false);
                } else if (i == 2) {
                    try {
                        this.A01.ABU(this.A05, elapsedRealtime, j);
                    } catch (RuntimeException e) {
                        Log.e(A01(6, 8, 85), A01(77, 44, 8), e);
                        this.A09.A01 = new C0470Gp(e);
                    }
                } else if (i != 3) {
                } else {
                    this.A02 = (IOException) message.obj;
                    int ABV = this.A01.ABV(this.A05, elapsedRealtime, j, this.A02);
                    if (ABV != 3) {
                        if (ABV == 2) {
                            return;
                        }
                        this.A00 = ABV == 1 ? 1 : this.A00 + 1;
                        A06(A00());
                        return;
                    }
                    this.A09.A01 = this.A02;
                }
            } else {
                throw ((Error) message.obj);
            }
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Gk != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.Gl> */
    @Override // java.lang.Runnable
    public final void run() {
        String A01 = A01(6, 8, 85);
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            try {
                try {
                    try {
                        try {
                            this.A06 = Thread.currentThread();
                            if (!this.A07) {
                                C0496Hp.A02(A01(156, 10, 119) + this.A05.getClass().getSimpleName() + A01(0, 6, 47));
                                try {
                                    this.A05.A91();
                                } finally {
                                    C0496Hp.A00();
                                }
                            }
                            if (!this.A08) {
                                sendEmptyMessage(2);
                            }
                        } catch (IOException e) {
                            if (!this.A08) {
                                obtainMessage(3, e).sendToTarget();
                            }
                        } catch (Exception e2) {
                            Log.e(A01, A01(121, 35, 10), e2);
                            if (!this.A08) {
                                obtainMessage(3, new C0470Gp(e2)).sendToTarget();
                            }
                        }
                    } catch (Error e3) {
                        Log.e(A01, A01(46, 31, 117), e3);
                        if (!this.A08) {
                            obtainMessage(4, e3).sendToTarget();
                        }
                        throw e3;
                    }
                } catch (OutOfMemoryError e4) {
                    Log.e(A01, A01(14, 32, 72), e4);
                    if (!this.A08) {
                        obtainMessage(3, new C0470Gp(e4)).sendToTarget();
                    }
                }
            } catch (InterruptedException unused) {
                HD.A04(this.A07);
                if (!this.A08) {
                    sendEmptyMessage(2);
                }
            }
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }
}
