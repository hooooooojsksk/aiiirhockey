package com.facebook.ads.redexgen.X;

import android.webkit.WebResourceResponse;
import androidx.annotation.RequiresApi;
import com.mobirix.airhockey.airhockey;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Oa */
/* loaded from: assets/audience_network.dex */
public final class C0656Oa {
    public static byte[] A00;
    public static String[] A01 = {"qzld4Qy39Azn7KYrj1sXbPZPr2qv6GgB", "1yyYiWnNu", "Zg1voNH89a01plQdKkVOTIE3hJJ00If9", "AO", "oO", "LhD7lTYtuMCYkgD1PnemOg5ERT23PX0", "YB3LukNHUN2DaV56yaS9yy46zwl6QYin", "pfYbPlfLNAe5pcAyURRpn9lPUi7k7Z7a"};
    public static final String A02;

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 105);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        byte[] bArr = {21, 51, 53, 58, 55, -14, 63, 59, airhockey.P_GAME_STANDBY, airhockey.P_GAME_STANDBY, -14, 56, 65, airhockey.P_GAME_SELECTMAP, -14, 56, 59, 62, 55, -14, airhockey.P_GAME_MYWIN, airhockey.P_GAME_SELECTMAP, 62, 12, -14, -61, -31, -29, -24, -27, -96, -19, -23, -13, -13, -96, -26, -17, -14, -96, -23, -19, -31, -25, -27, -96, -11, -14, -20, -70, -96, 33, 37, 48, -46, -1, -1, -4, -1, -83, -4, -3, -14, -5, -10, -5, -12, -83, -16, -18, -16, -11, -14, -15, -83, -13, -10, -7, -14, -83, -13, -4, -1, -83, 2, -1, -7, -57, -83, -26, -30, -31, 21, 4, 9, 5, 14, 3, 5, -18, 5, 20, 23, 15, 18, 11, -61, -65, -56, -22, -25, -37, -35, -21, -21, -31, -26, -33, -104, -34, -31, -28, -35, -104, -19, -22, -28, -78, -104, -2, 32, 29, 17, 19, 33, 33, 23, 28, 21, -50, 23, 27, 15, 21, 19, -50, 35, 32, 26, -24, -50, -7, 27, 24, 12, 14, 28, 28, 18, 23, 16, -55, 31, 18, 13, 14, 24, -55, 30, 27, 21, -29, -55, airhockey.P_GAME_REMATCH, 88, 81, -16, -5, -6, -9, -15};
        String[] strArr = A01;
        if (strArr[7].charAt(12) != strArr[2].charAt(12)) {
            throw new RuntimeException();
        }
        A01[1] = "7l6kM9ADseoG9RLfCJpKjz7J";
        A00 = bArr;
    }

    static {
        A04();
        A02 = C0656Oa.class.getSimpleName();
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x004d, code lost:
        if (r5.equals(r0) != false) goto L15;
     */
    @androidx.annotation.Nullable
    @androidx.annotation.RequiresApi(api = 21)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.webkit.WebResourceResponse A00(com.facebook.ads.redexgen.X.C0887Xc r8, com.facebook.ads.redexgen.X.C6M r9, android.webkit.WebResourceRequest r10, com.facebook.ads.redexgen.X.OY r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0656Oa.A00(com.facebook.ads.redexgen.X.Xc, com.facebook.ads.redexgen.X.6M, android.webkit.WebResourceRequest, com.facebook.ads.redexgen.X.OY, boolean):android.webkit.WebResourceResponse");
    }

    @RequiresApi(api = 21)
    public static WebResourceResponse A01(HashMap<String, String> responseHeaders, String str, File file) throws FileNotFoundException {
        return A02(responseHeaders, str, new FileInputStream(file));
    }

    @RequiresApi(api = 21)
    public static WebResourceResponse A02(HashMap<String, String> responseHeaders, String str, InputStream inputStream) {
        return new WebResourceResponse(str, null, 200, A03(106, 2, 11), responseHeaders, inputStream);
    }

    public static void A05(C7N c7n, String str, String str2) {
        C02637t c02637t = new C02637t(A03(51, 3, 116));
        c02637t.A03(1);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(A03(176, 2, 31), str);
            jSONObject.put(A03(178, 3, 28), str2);
            c02637t.A05(jSONObject);
        } catch (JSONException unused) {
        }
        c7n.A07().A9D(A03(173, 3, 124), C02627s.A12, c02637t);
    }
}
