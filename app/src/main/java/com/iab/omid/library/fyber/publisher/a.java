package com.iab.omid.library.fyber.publisher;

import android.webkit.WebView;

/* loaded from: classes2.dex */
public class a extends AdSessionStatePublisher {
    public a(WebView webView) {
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        a(webView);
    }
}
