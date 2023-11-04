package com.facebook.ads.redexgen.X;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.51 */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass51 extends Thread {
    public static byte[] A07;
    public static String[] A08 = {"22scehDHoaCOvZMprlsBZA8XDImDmfKB", "weKghC0VptQmI5ngiGaEXX", "Hf9H6", "FJiPG4ANJnN6", "MZm2fX9OE1lWAQp9g7i9e16yKVjr6LaO", "qv5p39sFFmKE2Upe5HhwzyNbLjT31UC6", "BSHanWyHkNGNXcGKwO9o06mFf", "6OihQTIk4xH7HyNYKpu4LMiaEL1fh7ec"};
    public static final String A09;
    public final int A00;
    public final Handler A01;
    public final AnonymousClass53 A02;
    public final C0887Xc A03;
    public final Runnable A04;
    public volatile long A05;
    public volatile boolean A06;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 116);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A07 = new byte[]{airhockey.J_SDKVER, airhockey.J_GAME_STANDBY, 10, 102, airhockey.J_GAME_REMATCH, airhockey.J_ERROR, 10, 99, airhockey.P_NATION, 83, airhockey.P_NATION, airhockey.P_GAME_SELECTMAP, 83, airhockey.P_GAME_MYLOSE, 85, airhockey.J_ENEMYWIN, airhockey.J_GAME_STANDBY, airhockey.J_INVITE, airhockey.J_GAME_STANDBY, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_GAME_REMATCH, 99};
    }

    static {
        A02();
        A09 = AnonymousClass51.class.getName();
    }

    public AnonymousClass51(C0887Xc c0887Xc, AnonymousClass53 anonymousClass53) {
        this(c0887Xc, anonymousClass53, IK.A07(c0887Xc));
    }

    public AnonymousClass51(C0887Xc c0887Xc, AnonymousClass53 anonymousClass53, int i) {
        this.A01 = new Handler(Looper.getMainLooper());
        this.A04 = new Runnable() { // from class: com.facebook.ads.redexgen.X.50
            @Override // java.lang.Runnable
            public final void run() {
                if (C0548Jt.A02(this)) {
                    return;
                }
                try {
                    AnonymousClass51.this.A05 = 0L;
                    AnonymousClass51.this.A06 = false;
                } catch (Throwable th) {
                    C0548Jt.A00(th, this);
                }
            }
        };
        this.A05 = 0L;
        this.A06 = false;
        setName(A01(0, 15, 83));
        this.A00 = i;
        this.A03 = c0887Xc;
        this.A02 = anonymousClass53;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            long j = this.A00;
            while (!isInterrupted()) {
                long interval = this.A05;
                String[] strArr = A08;
                if (strArr[1].length() != strArr[2].length()) {
                    String[] strArr2 = A08;
                    strArr2[3] = "QDJRY7exkP3l";
                    strArr2[6] = "zyOVtGNErBmKt3HrtbWcAlOC0";
                    boolean z = interval == 0;
                    this.A05 = j;
                    if (z) {
                        this.A01.post(this.A04);
                    }
                    try {
                        Thread.sleep(j);
                        long interval2 = this.A05;
                        if (interval2 != 0 && !this.A06 && !Debug.isDebuggerConnected()) {
                            if (this.A02.A05()) {
                                this.A03.A07().A9C(A01(15, 7, 116), C02627s.A1D, new C02637t(this.A02.A04()));
                            }
                            this.A06 = true;
                        }
                    } catch (InterruptedException unused) {
                        BuildConfigApi.isDebug();
                        return;
                    }
                } else {
                    throw new RuntimeException();
                }
            }
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }
}
