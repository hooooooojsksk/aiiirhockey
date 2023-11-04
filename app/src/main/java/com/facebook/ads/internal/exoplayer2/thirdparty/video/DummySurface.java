package com.facebook.ads.internal.exoplayer2.thirdparty.video;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.facebook.ads.redexgen.X.C0499Hs;
import com.facebook.ads.redexgen.X.HD;
import com.facebook.ads.redexgen.X.HandlerThreadC0504Hy;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;

@TargetApi(17)
/* loaded from: assets/audience_network.dex */
public final class DummySurface extends Surface {
    public static int A03;
    public static boolean A04;
    public static byte[] A05;
    public boolean A00;
    public final boolean A01;
    public final HandlerThreadC0504Hy A02;

    static {
        A04();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 19);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A05 = new byte[]{75, airhockey.P_GAME_REMATCH, airhockey.P_NATION, 81, 75, 86, 90, 81, 126, 124, airhockey.J_SDKVER, airhockey.J_PURCHASE, airhockey.J_GAME_ENEMYEXIT, 109, airhockey.J_PURCHASE, airhockey.J_GAME_ENEMYEXIT, airhockey.J_GAME_EXIT, 81, 109, airhockey.J_SDKVER, 96, airhockey.J_PURCHASE, airhockey.J_GAME_ENEMYEXIT, 96, airhockey.J_PURCHASE, 9, 11, 0, 19, 7, 4, 30, 19, 63, 57, 62, 42, 45, 47, 41, 32, 41, 63, 63, 19, 47, 35, 34, 56, 41, 52, 56, 46, 21, 8, 14, 11, 11, 20, 9, 15, 30, 31, 91, 11, 9, 18, 20, 9, 91, 15, 20, 91, 58, 43, 50, 91, 23, 30, 13, 30, 23, 91, airhockey.P_GAME_EXIT, 76, 51, 63, 90, 93, 94, 91, 19, 28, 22, 0, 29, 27, 22, 92, 26, 19, 0, 22, 5, 19, 0, 23, 92, 4, 0, 92, 26, 27, 21, 26, 45, 2, 23, 0, 20, 29, 0, 31, 19, 28, 17, 23, airhockey.J_ERROR, airhockey.J_ENEMYWIN, airhockey.J_GAME_ENEMYEXIT, airhockey.J_ERROR, airhockey.J_SAVEDGAME_SAVE, airhockey.J_ENEMYLOSE, airhockey.J_SDKVER};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static synchronized boolean A05(Context context) {
        boolean z;
        synchronized (DummySurface.class) {
            z = true;
            if (!A04) {
                A03 = C0499Hs.A02 < 24 ? 0 : A00(context);
                A04 = true;
            }
            if (A03 == 0) {
                z = false;
            }
        }
        return z;
    }

    public DummySurface(HandlerThreadC0504Hy handlerThreadC0504Hy, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.A02 = handlerThreadC0504Hy;
        this.A01 = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0027, code lost:
        if (A02(85, 6, 120).equals(com.facebook.ads.redexgen.X.C0499Hs.A06) != false) goto L7;
     */
    @android.annotation.TargetApi(24)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A00(android.content.Context r6) {
        /*
            int r0 = com.facebook.ads.redexgen.X.C0499Hs.A02
            r5 = 26
            r4 = 0
            if (r0 >= r5) goto L2a
            java.lang.String r3 = com.facebook.ads.redexgen.X.C0499Hs.A05
            r2 = 127(0x7f, float:1.78E-43)
            r1 = 7
            r0 = 21
            java.lang.String r0 = A02(r2, r1, r0)
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L29
            java.lang.String r3 = com.facebook.ads.redexgen.X.C0499Hs.A06
            r2 = 85
            r1 = 6
            r0 = 120(0x78, float:1.68E-43)
            java.lang.String r0 = A02(r2, r1, r0)
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L2a
        L29:
            return r4
        L2a:
            int r0 = com.facebook.ads.redexgen.X.C0499Hs.A02
            if (r0 >= r5) goto L43
            android.content.pm.PackageManager r3 = r6.getPackageManager()
            r2 = 91
            r1 = 36
            r0 = 97
            java.lang.String r0 = A02(r2, r1, r0)
            boolean r0 = r3.hasSystemFeature(r0)
            if (r0 != 0) goto L43
            return r4
        L43:
            android.opengl.EGLDisplay r1 = android.opengl.EGL14.eglGetDisplay(r4)
            r0 = 12373(0x3055, float:1.7338E-41)
            java.lang.String r3 = android.opengl.EGL14.eglQueryString(r1, r0)
            if (r3 != 0) goto L50
            return r4
        L50:
            r2 = 0
            r1 = 25
            r0 = 29
            java.lang.String r0 = A02(r2, r1, r0)
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L60
            return r4
        L60:
            r2 = 25
            r1 = 27
            r0 = 95
            java.lang.String r0 = A02(r2, r1, r0)
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto L72
            r0 = 1
        L71:
            return r0
        L72:
            r0 = 2
            goto L71
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.exoplayer2.thirdparty.video.DummySurface.A00(android.content.Context):int");
    }

    public static DummySurface A01(Context context, boolean z) {
        A03();
        HD.A04(!z || A05(context));
        return new HandlerThreadC0504Hy().A04(z ? A03 : 0);
    }

    public static void A03() {
        if (C0499Hs.A02 >= 17) {
            return;
        }
        throw new UnsupportedOperationException(A02(52, 33, 104));
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.A02) {
            if (!this.A00) {
                this.A02.A05();
                this.A00 = true;
            }
        }
    }
}
