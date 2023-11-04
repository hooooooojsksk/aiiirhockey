package com.facebook.ads.redexgen.X;

import android.view.View;
import android.webkit.WebView;

/* renamed from: com.facebook.ads.redexgen.X.Mj */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC0613Mj implements View.OnClickListener {
    public final /* synthetic */ C0616Mm A00;

    public View$OnClickListenerC0613Mj(C0616Mm c0616Mm) {
        this.A00 = c0616Mm;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WebView webView;
        WebView webView2;
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            webView = this.A00.A08;
            if (!webView.canGoForward()) {
                return;
            }
            webView2 = this.A00.A08;
            webView2.goForward();
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }
}
