package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import com.mobirix.airhockey.airhockey;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;

@Deprecated
/* renamed from: com.facebook.ads.redexgen.X.3F */
/* loaded from: assets/audience_network.dex */
public final class C3F {
    public static Method A00;
    public static byte[] A01;
    public static String[] A02 = {"AQLjxK2FjJRwwoaJIN65VrZWNOsgzmXU", "Ge4igKMki", "nbNH2vhK9", "Sw9TLHolawUN9KVNZQEO3EMAiDKtc0hD", "dGfRjiYjSJpbyPiyGtO7b0cAlrZw4Mrv", "qM6uisHAC1V1e", "EjRY7zjKRQHhcQeKklTfg54KjcLoHLDU", "3qjUfSEuwtGBq6iLvq5s4uOmi"};

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = copyOfRange[i4];
            if (A02[7].length() != 25) {
                throw new RuntimeException();
            }
            A02[5] = "REfXy77BkkgR1";
            copyOfRange[i4] = (byte) ((b ^ i3) ^ 54);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A01 = new byte[]{125, 81, 75, 82, 90, 30, 80, 81, airhockey.P_GAME_EXIT, 30, 88, 87, 80, 90, 30, 83, 91, airhockey.P_GAME_EXIT, 86, 81, 90, 30, 89, 91, airhockey.P_GAME_EXIT, 109, 93, 95, 82, 91, 90, 109, 93, 76, 81, 82, 82, airhockey.J_ACHIEVEMENTCALLBACK, 95, 93, airhockey.P_GAME_EXIT, 81, 76, 22, 23, 30, 81, 80, 30, airhockey.J_ENEMYLOSE, 87, 91, airhockey.P_GAME_REMATCH, 125, 81, 80, 88, 87, 89, 75, 76, 95, airhockey.P_GAME_EXIT, 87, 81, 80, airhockey.J_SDKVER, 94, 82, 64, airhockey.J_DISCONNECT, 88, 89, 81, 94, 80, airhockey.J_DISCONNECT, 88, 90, airhockey.P_GAME_MYWIN, 86, airhockey.P_GAME_MYSCORE, 124, 126, 111, airhockey.P_GAME_MYLOSE, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_PURCHASE, 119, 126, ByteCompanionObject.MAX_VALUE, airhockey.P_GAME_MYLOSE, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_GAME_REMATCH, airhockey.J_DISCONNECT, 119, 119, 93, airhockey.J_PURCHASE, airhockey.J_ACHIEVEMENTCALLBACK, 111, airhockey.J_DISCONNECT, airhockey.J_GAME_REMATCH};
    }

    static {
        A04();
        if (Build.VERSION.SDK_INT == 25) {
            try {
                A00 = ViewConfiguration.class.getDeclaredMethod(A03(82, 21, 45), new Class[0]);
            } catch (Exception unused) {
                Log.i(A03(66, 16, 1), A03(0, 66, 8));
            }
        }
    }

    public static float A00(@NonNull ViewConfiguration viewConfiguration, @NonNull Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return viewConfiguration.getScaledHorizontalScrollFactor();
        }
        return A02(viewConfiguration, context);
    }

    public static float A01(@NonNull ViewConfiguration viewConfiguration, @NonNull Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return viewConfiguration.getScaledVerticalScrollFactor();
        }
        return A02(viewConfiguration, context);
    }

    public static float A02(ViewConfiguration viewConfiguration, Context context) {
        Method method;
        if (Build.VERSION.SDK_INT >= 25 && (method = A00) != null) {
            try {
                return ((Integer) method.invoke(viewConfiguration, new Object[0])).intValue();
            } catch (Exception unused) {
                Log.i(A03(66, 16, 1), A03(0, 66, 8));
            }
        }
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
            return typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return 0.0f;
    }
}
