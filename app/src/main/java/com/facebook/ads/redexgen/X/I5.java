package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class I5 implements Choreographer.FrameCallback, Handler.Callback {
    public static byte[] A05;
    public static String[] A06 = {"L0xICluY", "YyqJkLEow6IpGdDAcJTIFuORNDEj98sW", "JrGolTruxktIU3jCjKgpkMNOgzAemigl", "lnMR", "Uem1", "dhrVPEv6", "OHOp8E3R", "YRgnGRfNPhnRlIW3Svm0"};
    public static final I5 A07;
    public int A00;
    public Choreographer A01;
    public final Handler A02;
    public volatile long A04 = -9223372036854775807L;
    public final HandlerThread A03 = new HandlerThread(A01(0, 26, 113));

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 91);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A05 = new byte[]{airhockey.J_GAME_REMATCH, airhockey.P_NATION, airhockey.P_GAME_STANDBY, 88, 79, airhockey.P_GAME_STANDBY, 77, 88, 75, 90, airhockey.P_NATION, 79, 88, airhockey.J_GAME_STANDBY, 93, airhockey.P_GAME_SELECTMAP, 79, 88, 16, airhockey.J_NATION, 75, airhockey.P_GAME_SELECTMAP, 78, airhockey.P_GAME_BREAKBALLCOUNT, 79, 88};
    }

    static {
        A05();
        A07 = new I5();
    }

    public I5() {
        this.A03.start();
        this.A02 = new Handler(this.A03.getLooper(), this);
        this.A02.sendEmptyMessage(0);
    }

    public static I5 A00() {
        return A07;
    }

    private void A02() {
        this.A00++;
        if (this.A00 == 1) {
            this.A01.postFrameCallback(this);
        }
    }

    private void A03() {
        this.A01 = Choreographer.getInstance();
    }

    private void A04() {
        this.A00--;
        if (this.A00 == 0) {
            this.A01.removeFrameCallback(this);
            this.A04 = -9223372036854775807L;
        }
    }

    public final void A06() {
        this.A02.sendEmptyMessage(1);
    }

    public final void A07() {
        this.A02.sendEmptyMessage(2);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.A04 = j;
        this.A01.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            A03();
            if (A06[7].length() != 30) {
                A06[7] = "7gxKFzGBfIFRzt2a";
                return true;
            }
            throw new RuntimeException();
        } else if (i == 1) {
            A02();
            return true;
        } else if (i != 2) {
            return false;
        } else {
            A04();
            return true;
        }
    }
}
