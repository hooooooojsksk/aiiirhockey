package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: assets/audience_network.dex */
public final class N6 {
    public static byte[] A00;
    public static String[] A01 = {"y0bG", "5JZfgaaWSogkW6CLjfjWUpC4SZDBnyft", "n2Gy4uoDZ6R42oJOJFciNGvUDpuCFsrY", "5ngtkuzSlt3rkDwwAmiTxWGxDtSc3Osy", "THEbbJWzjj3eFDlXZnSzsYrmSmbq8w3u", "z1FkhoLSx5iYuLnsFM", "3teRnM8c4jgHocWnqrQSqB4Xqv7CtSGf", "kWJrKkGk49E8x2kcQZmrso6J6ECpLyYL"};

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A01;
            if (strArr[2].charAt(11) == strArr[3].charAt(11)) {
                throw new RuntimeException();
            }
            A01[0] = "y3Jx6HlNhV60F8H6sy5VNq1urpo6ww";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 46);
            i4++;
        }
    }

    public static void A02() {
        A00 = new byte[]{-4, -3, 10, 16, 15, -43, -3, 7, -4, 9, 6, -81, -69, -69, -73, -70, -127, airhockey.J_REWARD, airhockey.J_REWARD, -66, -66, -66, airhockey.J_ERROR, airhockey.J_GAME_DISCONNECT, -70, airhockey.J_ERROR, -83, -88, -86, -84, -87, -74, -74, -78, airhockey.J_ERROR, -86, -74, -76, -70, -58, -58, -62, -59, -116, -127, -127, -55, -55, -55, ByteCompanionObject.MIN_VALUE, -72, -77, -75, -73, -76, -63, -63, -67, ByteCompanionObject.MIN_VALUE, -75, -63, -65, -127, -48, -62, -47, -86, -58, -43, -62, -63, -96, -52, -53, -47, -62, -53, -47, -86, -52, -63, -62};
    }

    static {
        A02();
    }

    public static String A01(@Nullable String str) {
        return TextUtils.isEmpty(str) ? A00(38, 25, 36) : String.format(Locale.US, A00(11, 27, 25), str);
    }

    public static void A03(WebView webView) {
        webView.loadUrl(A00(0, 11, 109));
        webView.clearCache(true);
    }

    @TargetApi(21)
    public static void A04(WebView webView) {
        WebSettings settings = webView.getSettings();
        if (Build.VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(0);
            return;
        }
        try {
            WebSettings.class.getMethod(A00(63, 19, 47), new Class[0]).invoke(settings, 0);
        } catch (Exception unused) {
        }
    }
}
