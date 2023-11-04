package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.RequiresApi;
import com.mobirix.airhockey.airhockey;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Mx */
/* loaded from: assets/audience_network.dex */
public class C0627Mx extends WebViewClient {
    public static byte[] A04;
    public WeakReference<InterfaceC0625Mv> A00 = new WeakReference<>(null);
    public final WeakReference<C0887Xc> A01;
    public final WeakReference<InterfaceC0624Mu> A02;
    public final WeakReference<C0621Mr> A03;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 97);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{54, 55, airhockey.P_GAME_SELECTMAP, airhockey.P_GAME_EXIT, airhockey.P_GAME_REMATCH, 15, 55, 65, 54, airhockey.P_GAME_MYSCORE, 64, 39, 52, 37, 39, 41, 58, 47, 60, 47, 58, 63, 51, 64, 54, airhockey.P_GAME_SELECTMAP, 65, 59, 54, 0, 59, 64, airhockey.P_GAME_BREAKBALLCOUNT, 55, 64, airhockey.P_GAME_BREAKBALLCOUNT, 0, 51, 53, airhockey.P_GAME_BREAKBALLCOUNT, 59, 65, 64, 0, 40, 27, 23, 41, 9, 22, 12, 26, 23, 17, 12, -42, 17, 22, 28, 13, 22, 28, -42, 11, 9, 28, 13, 15, 23, 26, 33, -42, -22, -6, -9, -1, -5, -23, -22, -12, -19, 7, 23, 20, 28, 24, 10, 23, 4, 11, 6, 17, 17, 7, 6, 8, 16, 4, 26, 23, 17, -54, -57, -38, -57, 49, 54, 60, 45, 54, 60, -36, -39, -45, -95, -121, -30, -48, -51, -54, -31, -44, -48, -30};
    }

    public C0627Mx(WeakReference<C0887Xc> weakReference, WeakReference<InterfaceC0624Mu> weakReference2, WeakReference<C0621Mr> weakReference3) {
        this.A01 = weakReference;
        this.A02 = weakReference2;
        this.A03 = weakReference3;
    }

    private void A02(String str, C0887Xc c0887Xc) {
        InterfaceC02617r A07 = c0887Xc.A07();
        int i = C02627s.A09;
        A07.A9C(A00(11, 11, 101), i, new C02637t(A00(111, 5, 6) + str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x0152, code lost:
        if (r0.contains(r1) == false) goto L64;
     */
    @android.annotation.SuppressLint({"CatchGeneralException"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A03(android.webkit.WebView r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0627Mx.A03(android.webkit.WebView, java.lang.String):boolean");
    }

    public final void A04(WeakReference<InterfaceC0625Mv> weakReference) {
        this.A00 = weakReference;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        C0621Mr timingLogger = this.A03.get();
        if (timingLogger != null) {
            timingLogger.A03();
        }
        InterfaceC0624Mu interfaceC0624Mu = this.A02.get();
        if (interfaceC0624Mu != null) {
            interfaceC0624Mu.ABt(str);
        }
        InterfaceC0625Mv interfaceC0625Mv = this.A00.get();
        if (interfaceC0625Mv != null) {
            interfaceC0625Mv.AAM(webView.canGoBack());
            interfaceC0625Mv.AB2(webView.canGoForward());
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        InterfaceC0624Mu listener = this.A02.get();
        if (listener != null) {
            listener.ABv(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        C0887Xc c0887Xc = this.A01.get();
        if (c0887Xc != null) {
            StringBuilder sb = new StringBuilder();
            String A00 = A00(0, 0, 27);
            sb.append(A00);
            sb.append(str);
            String sb2 = sb.toString();
            String errorMessage = C0566Ko.A01(i, sb2, A00 + str2);
            c0887Xc.A0E().A8O(errorMessage);
        }
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 23)
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        C0887Xc c0887Xc = this.A01.get();
        if (c0887Xc != null) {
            int errorCode = webResourceError.getErrorCode();
            StringBuilder sb = new StringBuilder();
            String A00 = A00(0, 0, 27);
            sb.append(A00);
            sb.append((Object) webResourceError.getDescription());
            String sb2 = sb.toString();
            String errorMessage = C0566Ko.A01(errorCode, sb2, A00 + webResourceRequest.getUrl());
            c0887Xc.A0E().A8O(errorMessage);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        C0887Xc context = this.A01.get();
        if (context != null) {
            context.A0E().A8P();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        C0887Xc context = this.A01.get();
        if (context != null) {
            context.A0E().A8Q();
        }
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 26)
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        N0.A02(C02627s.A2b);
        InterfaceC0624Mu listener = this.A02.get();
        if (listener != null) {
            listener.ACK();
            return true;
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 21)
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return A03(webView, webResourceRequest.getUrl().toString());
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return A03(webView, str);
    }
}
