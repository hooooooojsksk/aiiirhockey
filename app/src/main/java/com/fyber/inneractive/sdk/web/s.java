package com.fyber.inneractive.sdk.web;

import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.fyber.inneractive.sdk.util.IAlog;
import cz.msebera.android.httpclient.HttpHost;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class s extends WebViewClient {
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public f e;

    public s(f fVar, boolean z, int i, int i2, int i3) {
        this.e = fVar;
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
        IAlog.d("Resources to load: %s", str);
        int i = IAlog.a;
        IAlog.a(1, null, "%s %s", "RESOURCES", str);
        f fVar = this.e;
        if (fVar != null) {
            d dVar = (d) fVar;
            dVar.getClass();
            if (TextUtils.isEmpty(str) || !str.startsWith("http://") || com.fyber.inneractive.sdk.util.p.a()) {
                return;
            }
            IAlog.a("%s Found a portential unsecure resource url: %s", IAlog.a(dVar), str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        IAlog.d("onPageFinished - url: %s", str);
        f fVar = this.e;
        if (fVar != null) {
            fVar.a(webView);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        IAlog.d("onPageStarted - url: %s", str);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        IAlog.a("onWebViewRenderProcessGone called for web view! %s", webView);
        if (renderProcessGoneDetail != null) {
            renderProcessGoneDetail.didCrash();
        }
        Object[] objArr = new Object[1];
        objArr[0] = Boolean.valueOf(renderProcessGoneDetail != null && renderProcessGoneDetail.didCrash());
        IAlog.a("onWebViewRenderProcessGone detail: did crash = %s", objArr);
        d dVar = (d) this.e;
        L l = dVar.g;
        if (l != 0) {
            l.b();
        }
        dVar.b(true);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        URL url;
        HttpURLConnection httpURLConnection;
        if (this.a && Build.VERSION.SDK_INT >= 21 && webResourceRequest != null) {
            IAlog.d("shouldInterceptRequest, method = %s", webResourceRequest.getMethod());
            z zVar = z.c;
            int i = this.b;
            int i2 = this.c;
            int i3 = this.d;
            zVar.getClass();
            WebResourceResponse webResourceResponse = null;
            if (webResourceRequest.getUrl() != null && webResourceRequest.getUrl().getScheme() != null && webResourceRequest.getUrl().getScheme().startsWith(HttpHost.DEFAULT_SCHEME_NAME) && TextUtils.equals(webResourceRequest.getMethod(), "GET")) {
                a0 a0Var = zVar.a.get(new b0(webResourceRequest));
                if (a0Var != null) {
                    webResourceResponse = a0Var.b();
                } else {
                    try {
                        url = new URL(webResourceRequest.getUrl().toString());
                    } catch (MalformedURLException unused) {
                        url = null;
                    }
                    if (url != null) {
                        ByteBuffer b = com.fyber.inneractive.sdk.util.d.b.b();
                        try {
                            httpURLConnection = (HttpURLConnection) url.openConnection();
                            try {
                                httpURLConnection.setRequestMethod(webResourceRequest.getMethod());
                                httpURLConnection.setInstanceFollowRedirects(false);
                                z.a(webResourceRequest, httpURLConnection);
                            } catch (Throwable unused2) {
                            }
                        } catch (Throwable unused3) {
                            httpURLConnection = null;
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.setConnectTimeout(i);
                            httpURLConnection.setReadTimeout(i2);
                            a0 a0Var2 = null;
                            while (i3 > 0) {
                                try {
                                    a0Var2 = z.a(httpURLConnection, b);
                                } catch (SocketTimeoutException | UnknownHostException unused4) {
                                } catch (Throwable unused5) {
                                    i3 = 0;
                                }
                                if (a0Var2 != null) {
                                    break;
                                }
                                i3--;
                            }
                            if (a0Var2 != null) {
                                try {
                                    if (a0Var2.a()) {
                                        zVar.a.put(new b0(webResourceRequest), a0Var2);
                                    }
                                    webResourceResponse = a0Var2.b();
                                    httpURLConnection.disconnect();
                                    com.fyber.inneractive.sdk.util.d.b.a.offer(b);
                                } catch (Throwable unused6) {
                                }
                            }
                            httpURLConnection.disconnect();
                            com.fyber.inneractive.sdk.util.d.b.a.offer(b);
                        }
                    }
                }
            }
            if (webResourceResponse != null) {
                return webResourceResponse;
            }
            IAlog.d("shouldInterceptRequest did not intercept %s", webResourceRequest.getUrl());
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        super.shouldOverrideUrlLoading(webView, str);
        f fVar = this.e;
        return fVar != null && fVar.a(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        IAlog.d("%sError: code = %d text = %s WebView = %s", IAlog.a(this), Integer.valueOf(i), str, webView);
        super.onReceivedError(webView, i, str, str2);
        f fVar = this.e;
        if (fVar != null) {
            fVar.a(i);
        }
    }
}
