package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Handler;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.mobirix.airhockey.airhockey;
import cz.msebera.android.httpclient.HttpStatus;
import java.io.ByteArrayInputStream;
import java.lang.ref.WeakReference;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.ByteCompanionObject;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public class N5 extends WebViewClient {
    public static byte[] A0B;
    public static String[] A0C = {"dutFbLT0SJ7F8tp2omMpyLiOAYVHs", "eQZAVGISCoayl61p0XGnY6zF77MwgQ", "oGFUl4XXjxY0ysGh9uHTM5Bs0jmGzYfS", "nw1FzUJk4sGWtK2y2h7dLK31U1IoYOTN", "MQohGS04hBsrr", "rz5lEB2hDVgjaI0SM6Y5mQ12Lmz2ba", "Gakm8d7sZsS0Gn2hVSl3GYNL92Z8TRo6", "Ty7sQNcmLenaFb4R0BQbvtPuiVx7Fgst"};
    public Date A00;
    public boolean A01 = false;
    public final C0887Xc A02;
    public final WeakReference<C0766Sh> A03;
    public final WeakReference<N3> A04;
    public final WeakReference<AtomicBoolean> A05;
    public final WeakReference<LD> A06;
    public final WeakReference<QA> A07;
    public final AtomicInteger A08;
    public final AtomicReference<String> A09;
    public final boolean A0A;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0B, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 74);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A0B = new byte[]{92, 126, 124, 119, airhockey.J_PURCHASE, 50, 92, airhockey.J_GOO, airhockey.J_BACK, airhockey.J_GAME_ENEMYEXIT, 109, airhockey.J_GOO, airhockey.J_SAVEDGAME_SAVE, 83, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_WAIT, 126, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_SAVEDGAME_SAVE, 55, 4, 19, 30, 7, 19, 6, 27, 28, 21, 82, 39, 32, 59, 82, 34, 19, 6, 26, 82, 20, 29, 0, 82, 52, 27, 30, 23, 82, 51, 17, 17, 23, 1, 1, 82, airhockey.P_GAME_MYWIN, airhockey.J_PURCHASE, airhockey.J_REWARD, airhockey.J_GOO, 99, 34, 102, 99, airhockey.J_REWARD, 99, 56, 34, 53, 41, 41, 45, 93, 56, 15, 15, 18, 15, 53, 14, 19, 1, 6, 5, 64, 50, 5, 17, 21, 5, 19, 20, 64, 6, 15, 18, 64, 38, 9, 12, 5, 64, 33, 3, 3, 5, 19, 19, 64, 49, 10, 23, 5, 2, 1, airhockey.P_GAME_SELECTMAP, 54, 1, 21, 17, 1, 23, 16, airhockey.P_GAME_SELECTMAP, 2, 11, 22, airhockey.P_GAME_SELECTMAP, 34, 13, 8, 1, airhockey.P_GAME_SELECTMAP, 37, 7, 7, 1, 23, 23, airhockey.P_GAME_SELECTMAP, 0, 1, 10, 13, 1, 0, airhockey.J_NATION, 99, airhockey.J_ENEMYLOSE, 111, 99, airhockey.J_NATION, 89, airhockey.J_SAVEDGAME_SAVE, airhockey.J_DISCONNECT, 111, 89, airhockey.J_REWARD, airhockey.J_ENEMYWIN, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_INVITE, 33, 54, 54, 43, 54, 27, 39, 43, 32, 33, 16, 7, 7, 26, 7, 42, 17, 16, 6, 22, 7, 28, 5, 1, 28, 26, 27, 40, 47, 56, 39, 45, 33, 32, 96, 39, 45, 33, 126, airhockey.J_BACK, airhockey.J_DISCONNECT, 125, 99, airhockey.J_WAIT, 85, 125, 111, airhockey.J_ENEMYLOSE, 85, airhockey.J_ACHIEVEMENTCALLBACK, 111, airhockey.J_WAIT, airhockey.J_GAME_STANDBY, ByteCompanionObject.MAX_VALUE, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_GAME_REMATCH, 111, 85, 111, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_GAME_STANDBY, airhockey.J_ACHIEVEMENTCALLBACK, 102, airhockey.J_GAME_STANDBY, airhockey.J_GAME_ENEMYEXIT, airhockey.J_INVITE, 99, airhockey.J_ONREWARDED, 109, 85, 126, 99, airhockey.J_ENEMYWIN, 111, 85, 99, airhockey.J_ONREWARDED, 85, airhockey.J_ENEMYWIN, 99, 102, 102, 99, airhockey.J_WAIT, 18, 25, 8, airhockey.P_GAME_BREAKBALLCOUNT, airhockey.P_GAME_BREAKBALLCOUNT, 57, 46, 46, 35, 57, 49, 44, 40, 37, 35, 46, 57, 47, 44, 51, 50, 47, 57, 2, 3, 65, 31, 24, 3, 30, 9, 58, 45, 57, 61, 45, 59, 60, 23, 33, 44, 29, 12, 17, 29, airhockey.P_GAME_BREAKBALLCOUNT, 25, 5, 8, 0, 7, 6, 17, 28, 25, 20, 47, 0, 17, 4, 24, 29, 15, 8, 53, 28, 3, 15, 29};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static boolean A0A(String str, List<String> list) {
        String lowerCase = str.toLowerCase(Locale.getDefault());
        for (String str2 : list) {
            if (lowerCase.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    static {
        A02();
    }

    public N5(C0887Xc c0887Xc, WeakReference<N3> weakReference, WeakReference<QA> weakReference2, WeakReference<LD> weakReference3, WeakReference<AtomicBoolean> checkAssetsByJavascriptBridge, WeakReference<C0766Sh> weakReference4, AtomicInteger atomicInteger, AtomicReference<String> requestId, boolean z) {
        this.A02 = c0887Xc;
        this.A04 = weakReference;
        this.A07 = weakReference2;
        this.A06 = weakReference3;
        this.A05 = checkAssetsByJavascriptBridge;
        this.A03 = weakReference4;
        this.A08 = atomicInteger;
        this.A09 = requestId;
        this.A0A = z;
    }

    @RequiresApi(api = 21)
    private WebResourceResponse A00() {
        return new WebResourceResponse(A01(286, 10, 35), StandardCharsets.UTF_8.name(), HttpStatus.SC_FORBIDDEN, A01(13, 6, 93), Collections.singletonMap(A01(0, 13, 85), A01(268, 8, 38)), new ByteArrayInputStream(A01(13, 6, 93).getBytes()));
    }

    private void A03(int i, CharSequence charSequence, long j) {
        JSONObject jSONObject = new JSONObject();
        boolean z = charSequence != null;
        try {
            jSONObject.put(A01(160, 10, 14), i);
            jSONObject.put(A01(170, 17, 63), charSequence);
            jSONObject.put(A01(HttpStatus.SC_ACCEPTED, 21, 64), z);
            jSONObject.put(A01(223, 22, 64), j);
            jSONObject.put(A01(276, 10, 2), this.A09.get());
        } catch (JSONException unused) {
        }
        InterfaceC02617r A07 = this.A02.A07();
        int i2 = C02627s.A2c;
        String defaultErrorMessage = AdErrorType.WEB_VIEW_FAILED_TO_LOAD.getDefaultErrorMessage();
        A07.A9C(A01(306, 8, 32), i2, new C02637t(defaultErrorMessage, A01(55, 12, 72) + jSONObject.toString()));
    }

    public void A04(int i, @Nullable String str) {
        if (A01(245, 23, 54).equals(str)) {
            this.A02.A0E().AFz();
            return;
        }
        this.A02.A0E().AG0(i, str);
        Date finishTime = new Date();
        long time = finishTime.getTime();
        Date finishTime2 = this.A00;
        A03(i, str, time - finishTime2.getTime());
        if (this.A04.get() != null) {
            this.A04.get().AB0(i, str);
        }
    }

    @RequiresApi(api = 21)
    private final void A05(WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        if (webResourceRequest.getUrl().toString().toLowerCase(Locale.US).contains(A01(187, 11, 4))) {
            return;
        }
        int statusCode = webResourceResponse.getStatusCode();
        this.A02.A0E().AG4(webResourceResponse.getStatusCode(), C0566Ko.A01(statusCode, A01(67, 10, 55), A01(0, 0, 49) + webResourceRequest.getUrl()));
    }

    private void A07(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A01(145, 15, 76), str);
            jSONObject.put(A01(296, 10, 58), str2);
            jSONObject.put(A01(276, 10, 2), this.A09.get());
        } catch (JSONException unused) {
        }
        C0887Xc c0887Xc = this.A02;
        if (c0887Xc != null) {
            InterfaceC02617r A07 = c0887Xc.A07();
            int i = C02627s.A2Z;
            String defaultErrorMessage = AdErrorType.WEB_VIEW_CACHE_FILE_WAS_DENIED.getDefaultErrorMessage();
            A07.A9C(A01(306, 8, 32), i, new C02637t(defaultErrorMessage, A01(55, 12, 72) + jSONObject.toString()));
        }
    }

    private boolean A08(Uri uri) {
        String str;
        String path = uri.getPath();
        String scheme = uri.getScheme();
        if (path != null && scheme != null) {
            String A01 = A01(198, 4, 82);
            String path2 = A0C[4];
            if (path2.length() != 8) {
                A0C[6] = "e0NZ0IpncKNbspdHVbaE77hYKi1pXgCT";
                if (scheme.equals(A01)) {
                    if (BuildConfigApi.isDebug()) {
                        StringBuilder sb = new StringBuilder();
                        String path3 = A01(19, 36, 56);
                        sb.append(path3);
                        sb.append(path);
                        sb.toString();
                    }
                    List<String> A09 = C6M.A09(this.A02);
                    boolean A0A = A0A(path, A09);
                    if (!A0A) {
                        if (BuildConfigApi.isDebug()) {
                            StringBuilder sb2 = new StringBuilder();
                            String path4 = A01(77, 31, 42);
                            sb2.append(path4);
                            sb2.append(path);
                            sb2.toString();
                        }
                        str = C0766Sh.A0H;
                        String path5 = A01(108, 37, 46);
                        Log.w(str, path5);
                        String path6 = A09.toString();
                        A07(path, path6);
                    }
                    return A0A;
                }
            }
            throw new RuntimeException();
        }
        String scheme2 = A0C[7];
        if (scheme2.charAt(29) != 'S') {
            A0C[2] = "yXDUwGubOAV6buqiBYARa4GXiUTiAdtJ";
            return true;
        }
        throw new RuntimeException();
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        this.A02.A0E().AG1(this.A03.get() != null);
        if (this.A03.get() != null && this.A05.get() != null && !this.A05.get().get()) {
            this.A03.get().A0F();
        }
        this.A01 = true;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.A02.A0E().AG2();
        this.A00 = new Date();
        new Handler().postDelayed(new C0767Si(this), this.A08.get());
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        this.A01 = true;
        A04(i, str);
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 23)
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        boolean A0u = IK.A0u(this.A02);
        String A01 = A01(0, 0, 49);
        if (A0u || webResourceRequest.isForMainFrame()) {
            this.A01 = true;
            A04(webResourceError.getErrorCode(), A01 + ((Object) webResourceError.getDescription()));
            return;
        }
        this.A02.A0E().AG3(C0566Ko.A01(webResourceError.getErrorCode(), A01 + ((Object) webResourceError.getDescription()), A01 + webResourceRequest.getUrl()));
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 23)
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        A05(webResourceRequest, webResourceResponse);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        this.A02.A0E().AG5();
        sslErrorHandler.cancel();
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 26)
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        N0.A02(C02627s.A2Y);
        N3 adWebViewListener = this.A04.get();
        if (adWebViewListener != null) {
            adWebViewListener.ADD();
            return true;
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    @Nullable
    @RequiresApi(api = 21)
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url = webResourceRequest.getUrl();
        if (this.A0A && !A08(url)) {
            WebResourceResponse A00 = A00();
            A05(webResourceRequest, A00);
            return A00;
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (this.A04.get() != null) {
            this.A04.get().AAV(str, new NA().A03(this.A07.get()).A02(this.A06.get()).A05());
            return true;
        }
        return true;
    }
}
