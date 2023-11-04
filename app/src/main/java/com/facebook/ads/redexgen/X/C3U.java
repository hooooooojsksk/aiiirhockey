package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;

/* renamed from: com.facebook.ads.redexgen.X.3U */
/* loaded from: assets/audience_network.dex */
public final class C3U {
    public static byte[] A00;
    public static final C3T A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 64);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{airhockey.J_SAVEDGAME_SAVE, airhockey.J_SAVEDGAME_RELOAD, 82, airhockey.J_WAIT, 111, airhockey.J_ENEMYLOSE, airhockey.J_WAIT, airhockey.J_ACHIEVEMENTCALLBACK, 76, airhockey.J_INVITE, airhockey.J_WAIT, 79, ByteCompanionObject.MAX_VALUE, airhockey.J_INVITE, airhockey.J_SAVEDGAME_SAVE, airhockey.J_GOO, airhockey.J_GOO, 6, 7, 39, 12, 26, 29, 12, 13, 58, 10, 27, 6, 5, 5, 119, airhockey.J_REWARD, 86, 125, airhockey.J_GAME_ENEMYEXIT, airhockey.J_GAME_DISCONNECT, 125, 124, 75, 123, airhockey.J_GAME_EXIT, 119, airhockey.J_DISCONNECT, airhockey.J_DISCONNECT, 89, 123, 123, 125, airhockey.J_ENEMYLOSE, airhockey.J_GAME_DISCONNECT, 125, 124, 126, ByteCompanionObject.MAX_VALUE, airhockey.P_NATION, airhockey.J_GAME_STANDBY, 126, airhockey.J_SDKVER, 95, airhockey.J_DISCONNECT, airhockey.J_NATION, airhockey.J_GAME_STANDBY, airhockey.J_DISCONNECT, airhockey.J_ERROR, airhockey.P_NATION, airhockey.J_SAVEDGAME_RELOAD, 99, 126, 125, 125};
    }

    static {
        A01();
        if (Build.VERSION.SDK_INT >= 21) {
            A01 = new EH();
        } else if (Build.VERSION.SDK_INT >= 19) {
            A01 = new C0924Yn();
        } else {
            A01 = new C3T();
        }
    }

    public static void A02(ViewParent viewParent, View view, int i) {
        if (viewParent instanceof InterfaceC0928Ys) {
            throw new NullPointerException(A00(53, 18, 81));
        }
        if (i == 0) {
            A01.A03(viewParent, view);
        }
    }

    public static void A03(ViewParent viewParent, View view, int i, int i2, int i3, int i4, int i5) {
        if (viewParent instanceof InterfaceC0928Ys) {
            throw new NullPointerException(A00(17, 14, 41));
        }
        if (i5 == 0) {
            A01.A04(viewParent, view, i, i2, i3, i4);
        }
    }

    public static void A04(ViewParent viewParent, View view, int i, int i2, int[] iArr, int i3) {
        if (viewParent instanceof InterfaceC0928Ys) {
            throw new NullPointerException(A00(0, 17, 92));
        }
        if (i3 == 0) {
            A01.A05(viewParent, view, i, i2, iArr);
        }
    }

    public static void A05(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof InterfaceC0928Ys) {
            throw new NullPointerException(A00(31, 22, 88));
        }
        if (i2 == 0) {
            A01.A06(viewParent, view, view2, i);
        }
    }

    public static boolean A06(ViewParent viewParent, View view, float f, float f2) {
        return A01.A07(viewParent, view, f, f2);
    }

    public static boolean A07(ViewParent viewParent, View view, float f, float f2, boolean z) {
        return A01.A08(viewParent, view, f, f2, z);
    }

    public static boolean A08(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof InterfaceC0928Ys) {
            return ((InterfaceC0928Ys) viewParent).onStartNestedScroll(view, view2, i, i2);
        }
        if (i2 == 0) {
            return A01.A09(viewParent, view, view2, i);
        }
        return false;
    }
}
