package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.Jh */
/* loaded from: assets/audience_network.dex */
public final class C0537Jh {
    public static byte[] A00;
    public static String[] A01 = {"DRlsPwjpEwtNoZv5ySnxf", "lqEqsXUgP0JMZJfgrKxewN2wIWHzYKcc", "dBjDOWAGvP7mSKAaP52zl", "ype", "mP5mKraLiX8XnVkHST8LkS5AYOMnukgh", "WxiRHArz5NNbCsZRJT7jzOWIY3Iz", "jBZrwNF22PwjCa8Ii6ulb8rFZ5hC5AS6", "qRbUwr6kgq5VO8gbp3xyKAMHfEJZ"};
    public static final AtomicReference<String> A02;
    public static final AtomicReference<String> A03;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 88);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        A00 = new byte[]{airhockey.J_REWARD, airhockey.J_NATION, 123, airhockey.J_DISCONNECT, 126, airhockey.J_DISCONNECT, airhockey.J_ACHIEVEMENTCALLBACK, 126, airhockey.J_DISCONNECT, airhockey.J_WAIT, 125, airhockey.J_DISCONNECT, airhockey.J_DISCONNECT, airhockey.J_PURCHASE, airhockey.J_DISCONNECT, 125, 124, airhockey.J_NATION, 47, 56, 42, 62, airhockey.P_GAME_MYLOSE, 6, 3, 9, 16, 56, 11, 8, 0, 0, 14, 9, 0, airhockey.P_GAME_MYLOSE, 12, airhockey.P_NATION, airhockey.P_GAME_MYWIN, 77, 84, 124, 80, 90, 77, 64, 17, 111, 46, 37, 52, 55, 47, 50, 43, 31, 33, 36, 51, 31, 35, 47, 45, 45, 47, 46, 88, airhockey.P_GAME_SELECTMAP, airhockey.P_GAME_SELECTMAP, 64, airhockey.P_GAME_MYSCORE, 10, 31, 31, 87, airhockey.P_NATION, 81, 64, 88, 21, airhockey.P_GAME_MYSCORE, 30, 86, 81, 83, 85, 82, 95, 95, 91, 30, 83, 95, 93, 4, 24, 24, 28, 31, 86, airhockey.P_GAME_MYSCORE, airhockey.P_GAME_MYSCORE, 27, 27, 27, airhockey.P_GAME_REMATCH, 31, airhockey.P_NATION, 10, 13, 15, 9, 14, 3, 3, 7, airhockey.P_NATION, 15, 3, 1, 83, 83, 83};
    }

    static {
        A09();
        A02 = new AtomicReference<>();
        A03 = new AtomicReference<>();
    }

    public static String A01(C7N c7n) {
        return A05(c7n) + A00(47, 19, 24);
    }

    public static String A02(C7N c7n) {
        String loggingEndpointPrefix = IK.A0R(c7n);
        StringBuilder sb = new StringBuilder();
        sb.append(A07(c7n, loggingEndpointPrefix));
        String loggingEndpointPrefix2 = A00(22, 14, 63);
        sb.append(loggingEndpointPrefix2);
        String loggingEndpointPrefix3 = sb.toString();
        return loggingEndpointPrefix3;
    }

    public static String A03(C7N c7n) {
        return A05(c7n) + A00(1, 21, 21);
    }

    public static String A04(C7N c7n) {
        String syncEndpointPrefix = IK.A0S(c7n);
        StringBuilder sb = new StringBuilder();
        sb.append(A07(c7n, syncEndpointPrefix));
        String syncEndpointPrefix2 = A00(36, 11, 123);
        sb.append(syncEndpointPrefix2);
        String syncEndpointPrefix3 = sb.toString();
        return syncEndpointPrefix3;
    }

    public static String A05(C7N c7n) {
        String str = A02.get();
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String urlOverride = A00(66, 28, 104);
        return A06(c7n, urlOverride);
    }

    public static String A06(C7N c7n, String str) {
        String sb;
        String A7x = c7n.A04().A7x();
        Locale locale = Locale.US;
        Object[] objArr = new Object[1];
        if (TextUtils.isEmpty(A7x)) {
            sb = A00(0, 0, 29);
        } else {
            StringBuilder sb2 = new StringBuilder();
            String prefix = A00(0, 1, 0);
            sb2.append(prefix);
            sb2.append(A7x);
            sb = sb2.toString();
        }
        objArr[0] = sb;
        if (A01[4].charAt(27) != 'a') {
            A01[1] = "Rtsd39h1DjNUt9rd7OM3RjcgvmtBKqBR";
            String prefix2 = String.format(locale, str, objArr);
            return prefix2;
        }
        throw new RuntimeException();
    }

    public static String A07(C7N c7n, String str) {
        String str2 = A03.get();
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        String urlOverride = A00(94, 26, 52);
        return A08(A06(c7n, urlOverride), str);
    }

    public static String A08(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        return str.replace(A00(120, 3, 124), str2);
    }
}
