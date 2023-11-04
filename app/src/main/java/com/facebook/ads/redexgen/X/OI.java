package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public class OI extends WebViewClient {
    public static byte[] A01;
    public static String[] A02 = {"hfMJ0frXuRQdVVGg5HhbkedMp84qvG2m", "353suYezQm1X4xGGmKd", "JSegO1TQToLz4SD5sG2", "wzs2neDsiDlXGMSMfb3", "O6PuLNBrYuNMqKQgURK12L6N", "9iUPqfJGnhoj94eJuJeS1Wm6njk1Rmvr", "BdwoSzPq3MvWa04biSMwYNzp8DFOBLqT", "enVVpEgx3aC4K8YdK2hdvlOQVko"};
    public final /* synthetic */ OM A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 124);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{3, 4, 18, 2, 17, 8, 15, 19, 8, 14, 13, -11, -6, -11, -44, 3, -14, 4, -7, 13, 26, 26, 23, 26, -21, 23, 12, 13, 48, 43, 64, 51, 45, 57, 56, -8, 51, 45, 57, 39, 51, 51, 47, 30, 36, 49, 49, 46, 49, airhockey.P_GAME_MYWIN, airhockey.P_GAME_REMATCH, 64, airhockey.P_GAME_BREAKBALLCOUNT, airhockey.P_GAME_REMATCH, 64, 75, 80, -4, -7, -13};
    }

    static {
        A01();
    }

    public OI(OM om) {
        this.A00 = om;
    }

    private void A02(int i, String str, String str2, boolean z) {
        C0513Ii c0513Ii;
        C0887Xc c0887Xc;
        O9 o9;
        if (z) {
            this.A00.A0S();
        }
        c0513Ii = this.A00.A0D;
        c0513Ii.A04(EnumC0512Ih.A0Q, null);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A00(19, 9, 44), i);
            jSONObject.put(A00(0, 11, 35), str);
            jSONObject.put(A00(57, 3, 11), str2);
        } catch (JSONException unused) {
        }
        String jSONObject2 = jSONObject.toString();
        c0887Xc = this.A00.A0B;
        c0887Xc.A0E().A57(jSONObject2);
        o9 = this.A00.A0E;
        o9.A04(C02627s.A16, jSONObject2);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        C0513Ii c0513Ii;
        C0887Xc c0887Xc;
        long j;
        OK ok;
        OK ok2;
        c0513Ii = this.A00.A0D;
        c0513Ii.A04(EnumC0512Ih.A0R, null);
        c0887Xc = this.A00.A0B;
        C0R A0E = c0887Xc.A0E();
        j = this.A00.A00;
        A0E.A58(LC.A01(j));
        this.A00.A0S();
        this.A00.A06 = true;
        this.A00.A0E();
        ok = this.A00.A03;
        if (ok == null) {
            return;
        }
        ok2 = this.A00.A03;
        ok2.ADE();
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        if (Build.VERSION.SDK_INT < 23) {
            A02(i, str, str2, true);
        }
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 23)
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        int errorCode = webResourceError.getErrorCode();
        StringBuilder sb = new StringBuilder();
        String A00 = A00(0, 0, 48);
        sb.append(A00);
        sb.append((Object) webResourceError.getDescription());
        String sb2 = sb.toString();
        A02(errorCode, sb2, A00 + webResourceRequest.getUrl(), true);
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 21)
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        int i;
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        if (webResourceRequest.getUrl().toString().toLowerCase(Locale.US).contains(A00(28, 11, 78))) {
            return;
        }
        if (webResourceResponse != null) {
            i = webResourceResponse.getStatusCode();
        } else {
            i = -1;
        }
        A02(i, A00(39, 10, 67), A00(0, 0, 48) + webResourceRequest.getUrl(), false);
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 26)
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        C0887Xc c0887Xc;
        AbstractC0952Zs abstractC0952Zs;
        OL ol;
        OL ol2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A00(11, 8, 21), renderProcessGoneDetail.didCrash());
            jSONObject.put(A00(49, 8, 91), renderProcessGoneDetail.rendererPriorityAtExit());
        } catch (JSONException unused) {
        }
        String message = jSONObject.toString();
        c0887Xc = this.A00.A0B;
        c0887Xc.A0E().A53(message);
        abstractC0952Zs = this.A00.A09;
        ON.A04(abstractC0952Zs.A0L());
        ol = this.A00.A04;
        if (ol == null) {
            return true;
        }
        ol2 = this.A00.A04;
        String[] strArr = A02;
        String message2 = strArr[1];
        if (message2.length() != strArr[2].length()) {
            throw new RuntimeException();
        }
        A02[0] = "kv0KfCNN1XAdbICEJBZwu3dTiw7XNBbg";
        ol2.ACB();
        return true;
    }

    @Override // android.webkit.WebViewClient
    @Nullable
    @RequiresApi(api = 21)
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        C0887Xc c0887Xc;
        C6M c6m;
        OY oy;
        AbstractC0952Zs abstractC0952Zs;
        c0887Xc = this.A00.A0B;
        c6m = this.A00.A0A;
        oy = this.A00.A0H;
        abstractC0952Zs = this.A00.A09;
        return C0656Oa.A00(c0887Xc, c6m, webResourceRequest, oy, abstractC0952Zs.A0V());
    }
}
