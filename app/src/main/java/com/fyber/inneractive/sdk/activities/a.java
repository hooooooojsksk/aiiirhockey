package com.fyber.inneractive.sdk.activities;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.fyber.inneractive.sdk.network.p;
import com.fyber.inneractive.sdk.network.q;
import com.fyber.inneractive.sdk.network.r;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.n0;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a extends WebViewClient {
    public final /* synthetic */ FyberReportAdActivity a;

    public a(FyberReportAdActivity fyberReportAdActivity) {
        this.a = fyberReportAdActivity;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        IAlog.e("Received Error on WebViewClient: Code: %d, Description: %s, failingUrl: %s", Integer.valueOf(i), str, str2);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        r.a("WebViewRendererProcessGone", "Web view renderer process has gone. Web view destroyed", null, null);
        this.a.finish();
        return true;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        com.fyber.inneractive.sdk.flow.e eVar;
        if (str == null) {
            return false;
        }
        if (n0.a(str)) {
            WebView webView2 = this.a.a;
            if (webView2 != null) {
                webView2.loadUrl("chrome://crash");
            }
            return true;
        } else if (!str.startsWith("fybermarketplace://reportAd?") || (eVar = FyberReportAdActivity.b) == null) {
            return false;
        } else {
            String substring = str.substring(28);
            com.fyber.inneractive.sdk.flow.d dVar = (com.fyber.inneractive.sdk.flow.d) eVar;
            q.a aVar = new q.a(p.FYBER_REPORT_AD, dVar.a, dVar.b, (JSONArray) null);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("message", substring);
            } catch (Exception unused) {
                IAlog.e("Got exception adding param to json object: %s, %s", "message", substring);
            }
            aVar.f.put(jSONObject);
            aVar.g = true;
            aVar.a((String) null);
            WebView webView3 = this.a.a;
            if (webView3 != null) {
                webView3.loadUrl("javascript:reportSent();");
            }
            return true;
        }
    }
}
