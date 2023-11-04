package com.facebook.ads.redexgen.X;

import android.content.Context;
import androidx.annotation.Nullable;
import com.mobirix.airhockey.airhockey;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: assets/audience_network.dex */
public final class L3 {
    public static byte[] A00;
    public static final Pattern A01;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 124);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A00 = new byte[]{89, 45, 2, 90, 16, 5, 45, 2, 90, 42, 16, 92, 11, 95, 44, 90, 88, 42, 48, 92, 43, 44, 95, 91, airhockey.J_ACHIEVEMENTCALLBACK, 78, airhockey.P_GAME_REMATCH, airhockey.P_GAME_REMATCH, 94, 85, 79, 27, airhockey.P_GAME_MYLOSE, 79, 90, 88, 80, 27, 79, airhockey.P_GAME_REMATCH, 90, 88, 94, 33, 45, 47, airhockey.J_GAME_DISCONNECT, 36, 35, 33, 39, 32, 45, 45, 41, airhockey.J_GAME_DISCONNECT, 35, 38, 49};
    }

    static {
        A07();
        A01 = Pattern.compile(A02(0, 24, 13));
    }

    public static String A00() {
        return A06(new Exception(A02(24, 19, 71)), -1, -1, false);
    }

    public static String A01(int i) {
        if (i <= 0) {
            return null;
        }
        float rate = new Random().nextFloat();
        if (rate >= 1.0f / i) {
            return null;
        }
        return A00();
    }

    public static String A03(Context context, @Nullable Throwable th) {
        int A0H = IK.A0H(context);
        int maxStacktraceLines = IK.A02(context);
        return A06(th, A0H, maxStacktraceLines, IK.A1A(context));
    }

    public static String A04(String str) {
        Matcher matcher = A01.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return str;
    }

    public static String A06(@Nullable Throwable th, int i, int i2, boolean z) {
        String A02 = A02(0, 0, 122);
        if (th == null) {
            return A02;
        }
        try {
            TU tu = new TU();
            L1 l1 = tu;
            if (i2 >= 0) {
                l1 = new TS(l1, i2);
            }
            if (i >= 0) {
                l1 = new TR(l1, i, i);
            }
            if (z) {
                l1 = new TT(l1);
            }
            L1 input = new TV(tu, 1, l1);
            th.printStackTrace(new PrintWriter(new L2(input)));
            input.flush();
            return tu.toString();
        } catch (Exception unused) {
            return A02;
        }
    }

    public static boolean A08(L0 l0) {
        String middle = l0.A02();
        if (middle == null) {
            return false;
        }
        if (A0A(middle)) {
            return true;
        }
        for (String middle2 : l0.A01()) {
            if (A0A(middle2)) {
                return true;
            }
        }
        for (String middle3 : l0.A00()) {
            if (A0A(middle3)) {
                return true;
            }
        }
        return false;
    }

    public static boolean A0A(String str) {
        return str.contains(A02(43, 16, 62));
    }
}
