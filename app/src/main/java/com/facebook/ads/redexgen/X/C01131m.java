package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.os.Handler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.RequiresApi;
import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.1m */
/* loaded from: assets/audience_network.dex */
public class C01131m extends WebViewClient {
    public boolean A00 = false;
    public final C1X A01;
    public final InterfaceC01121l A02;
    public final boolean A03;

    public C01131m(C1X c1x, InterfaceC01121l interfaceC01121l, boolean z) {
        this.A01 = c1x;
        this.A02 = interfaceC01121l;
        this.A03 = z;
    }

    private void A00() {
        if (this.A03) {
            this.A02.ABz(AdError.CACHE_ERROR);
        } else {
            A01();
        }
    }

    private void A01() {
        InterfaceC01121l interfaceC01121l = this.A02;
        if (interfaceC01121l != null) {
            interfaceC01121l.AC0();
        }
    }

    public void A02() {
        A00();
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        this.A00 = true;
        A01();
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        new Handler().postDelayed(new C0939Zf(this), this.A01.A08());
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        this.A00 = true;
        A02();
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 26)
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        N0.A02(C02627s.A2d);
        A00();
        return true;
    }
}
