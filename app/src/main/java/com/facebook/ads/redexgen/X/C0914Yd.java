package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.annotation.Nullable;
import com.loopj.android.http.AsyncHttpClient;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Yd */
/* loaded from: assets/audience_network.dex */
public class C0914Yd extends AbstractC01884m {
    public static byte[] A06;
    public static String[] A07 = {"vpHxNEEeQqkPH9sKp8BAFlo", "ddQd8aXmX57TCv5syYSnMf6Vla22KopM", "0YXj", "UC9R5IJXbgu82zo5LhenPlKKwn23Fltm", "uFeOec4n0AGL9Kfrmk6ECW0KKbKvD", "RgZAHFrUyN4TqtmKiyvyL8Y", "g7LT7F9fn5p79lPzLzvRECTowfucfQY3", "UaBPk1errz52kF5dIu80Mei9ciV9Nkpb"};
    public PointF A02;
    public final float A03;
    public final LinearInterpolator A05 = new LinearInterpolator();
    public final DecelerateInterpolator A04 = new DecelerateInterpolator();
    public int A00 = 0;
    public int A01 = 0;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final int A03(View view, int i) {
        C4Z A08 = A08();
        if (A08 == null || !A08.A25()) {
            return 0;
        }
        C01774a c01774a = (C01774a) view.getLayoutParams();
        return A0N(A08.A0o(view) - c01774a.topMargin, A08.A0j(view) + c01774a.bottomMargin, A08.A0g(), A08.A0X() - A08.A0d(), i);
    }

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 35);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A06 = new byte[]{41, 12, 11, 0, 4, 23, 54, 8, 10, 10, 17, 13, 54, 6, 23, 10, 9, 9, 0, 23, 21, 35, 57, airhockey.J_GAME_DISCONNECT, 63, 36, 35, 57, 32, 40, airhockey.J_GAME_DISCONNECT, 35, 58, 41, 62, 62, 37, 40, 41, airhockey.J_GAME_DISCONNECT, 47, 35, 33, 60, 57, 56, 41, 31, 47, 62, 35, 32, 32, 26, 41, 47, 56, 35, 62, 10, 35, 62, 28, 35, 63, 37, 56, 37, 35, 34, airhockey.J_GAME_DISCONNECT, 59, 36, 41, 34, airhockey.J_GAME_DISCONNECT, 56, 36, 41, airhockey.J_GAME_DISCONNECT, 0, 45, 53, 35, 57, 56, 1, 45, 34, 45, 43, 41, 62, airhockey.J_GAME_DISCONNECT, 40, 35, 41, 63, airhockey.J_GAME_DISCONNECT, 34, 35, 56, airhockey.J_GAME_DISCONNECT, 37, 33, 60, 32, 41, 33, 41, 34, 56, airhockey.J_GAME_DISCONNECT, 42, 55, 56, 41, airhockey.J_WAIT, 41, 43, 60, 63, 60, 43, 60, 55, 58, 60, airhockey.J_WAIT, 42, 49, 54, 44, 53, 61, airhockey.J_WAIT, 59, 60, airhockey.J_WAIT, 54, 55, 60, airhockey.J_WAIT, 54, 63, airhockey.J_WAIT, 45, 49, 60, airhockey.J_WAIT, 58, 54, 55, 42, 45, 56, 55, 45, 42, airhockey.J_WAIT, 61, 60, 63, 48, 55, 60, 61, airhockey.J_WAIT, 48, 55, airhockey.J_WAIT, 10, 52, 54, 54, 45, 49, 10, 58, 43, 54, 53, 53, 60, 43, airhockey.J_ERROR, airhockey.J_WAIT, 42, 45, 56, 43, 45, 48, 55, 62, airhockey.J_WAIT, 46, 48, 45, 49, airhockey.J_WAIT, 10, 23, 24, 9, 6};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public int A0O(View view, int i) {
        C4Z A08 = A08();
        if (A08 == null || !A08.A24()) {
            return 0;
        }
        C01774a c01774a = (C01774a) view.getLayoutParams();
        return A0N(A08.A0k(view) - c01774a.leftMargin, A08.A0n(view) + c01774a.rightMargin, A08.A0e(), A08.A0h() - A08.A0f(), i);
    }

    static {
        A06();
    }

    public C0914Yd(Context context) {
        this.A03 = A0J(context.getResources().getDisplayMetrics());
    }

    private final int A00() {
        PointF pointF = this.A02;
        if (pointF == null || pointF.y == 0.0f) {
            return 0;
        }
        return this.A02.y > 0.0f ? 1 : -1;
    }

    private int A01(int i, int i2) {
        int before = i - i2;
        if (i * before <= 0) {
            return 0;
        }
        return before;
    }

    private final void A07(C01864k c01864k) {
        PointF A0P = A0P(A07());
        if (A0P == null || (A0P.x == 0.0f && A0P.y == 0.0f)) {
            c01864k.A03(A07());
            A09();
            return;
        }
        A0B(A0P);
        this.A02 = A0P;
        this.A00 = (int) (A0P.x * 10000.0f);
        this.A01 = (int) (A0P.y * 10000.0f);
        int A0L = A0L(AsyncHttpClient.DEFAULT_SOCKET_TIMEOUT);
        int time = (int) (A0L * 1.2f);
        c01864k.A04((int) (this.A00 * 1.2f), (int) (this.A01 * 1.2f), time, this.A05);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01884m
    public final void A0G() {
        this.A01 = 0;
        this.A00 = 0;
        this.A02 = null;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01884m
    public final void A0H(int i, int i2, C01904o c01904o, C01864k c01864k) {
        if (A06() == 0) {
            A09();
            return;
        }
        this.A00 = A01(this.A00, i);
        this.A01 = A01(this.A01, i2);
        if (this.A00 == 0 && this.A01 == 0) {
            A07(c01864k);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01884m
    public void A0I(View view, C01904o c01904o, C01864k c01864k) {
        int A0O = A0O(view, A0K());
        int dx = A00();
        int A03 = A03(view, dx);
        int dy = A0O * A0O;
        int dx2 = A03 * A03;
        int time = A0M((int) Math.sqrt(dy + dx2));
        if (time > 0) {
            int distance = -A0O;
            int dy2 = -A03;
            c01864k.A04(distance, dy2, time, this.A04);
        }
    }

    public float A0J(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int A0K() {
        PointF pointF = this.A02;
        if (pointF == null || pointF.x == 0.0f) {
            return 0;
        }
        return this.A02.x > 0.0f ? 1 : -1;
    }

    public int A0L(int i) {
        return (int) Math.ceil(Math.abs(i) * this.A03);
    }

    public final int A0M(int i) {
        return (int) Math.ceil(A0L(i) / 0.3356d);
    }

    public final int A0N(int i, int i2, int i3, int i4, int i5) {
        if (i5 != -1) {
            if (i5 != 0) {
                if (i5 == 1) {
                    return i4 - i2;
                }
                throw new IllegalArgumentException(A04(113, 93, 122));
            }
            int i6 = i3 - i;
            if (i6 > 0) {
                return i6;
            }
            int i7 = i4 - i2;
            if (i7 < 0) {
                return i7;
            }
            String[] strArr = A07;
            if (strArr[3].charAt(24) != strArr[6].charAt(24)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[7] = "99CH8cQKDxQi0SdQwcjuhFHBueIBqbiA";
            strArr2[4] = "Y2Wuw9nWVBLC0K9LHKlenTQ1gtNyD";
            return 0;
        }
        return i3 - i;
    }

    @Nullable
    public PointF A0P(int i) {
        C4Z A08 = A08();
        if (A08 instanceof InterfaceC01874l) {
            return ((InterfaceC01874l) A08).A48(i);
        }
        Log.w(A04(0, 20, 70), A04(20, 93, 111) + InterfaceC01874l.class.getCanonicalName());
        return null;
    }
}
