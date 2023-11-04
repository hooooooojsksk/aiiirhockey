package com.facebook.ads.redexgen.X;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.RequiresApi;

/* renamed from: com.facebook.ads.redexgen.X.Mz */
/* loaded from: assets/audience_network.dex */
public class C0629Mz extends WebViewClient {
    public final /* synthetic */ N0 A00;

    public C0629Mz(N0 n0) {
        this.A00 = n0;
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 26)
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        N0.A02(C02627s.A2e);
        return true;
    }
}
