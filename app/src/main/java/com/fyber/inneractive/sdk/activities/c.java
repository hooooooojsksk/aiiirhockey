package com.fyber.inneractive.sdk.activities;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.click.f;
import com.fyber.inneractive.sdk.click.l;
import com.fyber.inneractive.sdk.config.global.s;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.flow.o;
import com.fyber.inneractive.sdk.network.p;
import com.fyber.inneractive.sdk.network.q;
import com.fyber.inneractive.sdk.network.r;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.k0;
import com.fyber.inneractive.sdk.util.n0;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.analytics.FirebaseAnalytics;
import cz.msebera.android.httpclient.HttpHost;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c extends WebViewClient {
    public final /* synthetic */ InneractiveInternalBrowserActivity a;

    /* loaded from: classes.dex */
    public class a implements f.a {
        public a() {
            c.this = r1;
        }

        @Override // com.fyber.inneractive.sdk.click.f.a
        public void a(com.fyber.inneractive.sdk.click.b bVar, k0 k0Var, com.fyber.inneractive.sdk.util.e eVar) {
            c.a(c.this, bVar);
        }
    }

    /* loaded from: classes.dex */
    public class b implements l.b {
        public b() {
            c.this = r1;
        }

        @Override // com.fyber.inneractive.sdk.click.l.b
        public void a(com.fyber.inneractive.sdk.click.b bVar) {
            if (bVar == null || bVar.a == l.d.FAILED) {
                return;
            }
            c.a(c.this, bVar);
            c.this.a.finish();
        }
    }

    public c(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
        this.a = inneractiveInternalBrowserActivity;
    }

    public static void a(c cVar, com.fyber.inneractive.sdk.click.b bVar) {
        s sVar;
        o oVar = cVar.a.b;
        InneractiveAdRequest inneractiveAdRequest = oVar != null ? oVar.a : null;
        com.fyber.inneractive.sdk.response.e d = oVar != null ? oVar.d() : null;
        o oVar2 = cVar.a.b;
        q.a aVar = new q.a(p.FYBER_SUCCESS_CLICK, inneractiveAdRequest, d, (oVar2 == null || (sVar = oVar2.c) == null) ? null : sVar.c());
        JSONObject jSONObject = new JSONObject();
        long j = bVar.e;
        if (j != 0) {
            Object valueOf = Long.valueOf(j);
            try {
                jSONObject.put("time_passed", valueOf);
            } catch (Exception unused) {
                IAlog.e("Got exception adding param to json object: %s, %s", "time_passed", valueOf);
            }
        }
        JSONArray jSONArray = new JSONArray();
        for (com.fyber.inneractive.sdk.click.i iVar : bVar.f) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put(ImagesContract.URL, iVar.a);
                jSONObject2.put(FirebaseAnalytics.Param.SUCCESS, iVar.b);
                jSONObject2.put("opened_by", iVar.c);
                jSONObject2.put("reason", iVar.d);
            } catch (Exception unused2) {
            }
            jSONArray.put(jSONObject2);
        }
        try {
            jSONObject.put("urls", jSONArray);
        } catch (Exception unused3) {
            IAlog.e("Got exception adding param to json object: %s, %s", "urls", jSONArray);
        }
        Object obj = com.fyber.inneractive.sdk.util.e.VIDEO_CTA;
        try {
            jSONObject.put("origin", obj);
        } catch (Exception unused4) {
            IAlog.e("Got exception adding param to json object: %s, %s", "origin", obj);
        }
        aVar.f.put(jSONObject);
        aVar.a((String) null);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        Drawable d;
        Drawable d2;
        super.onPageFinished(webView, str);
        if (webView.canGoBack()) {
            d = com.fyber.inneractive.sdk.util.l.d(R.drawable.ia_ib_left_arrow);
        } else {
            d = com.fyber.inneractive.sdk.util.l.d(R.drawable.ia_ib_unleft_arrow);
        }
        this.a.f.setImageDrawable(d);
        if (webView.canGoForward()) {
            d2 = com.fyber.inneractive.sdk.util.l.d(R.drawable.ia_ib_right_arrow);
        } else {
            d2 = com.fyber.inneractive.sdk.util.l.d(R.drawable.ia_ib_unright_arrow);
        }
        this.a.g.setImageDrawable(d2);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.a.g.setImageDrawable(com.fyber.inneractive.sdk.util.l.d(R.drawable.ia_ib_unright_arrow));
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
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (n0.a(str)) {
            this.a.e.loadUrl("chrome://crash");
            return true;
        }
        com.fyber.inneractive.sdk.click.f fVar = new com.fyber.inneractive.sdk.click.f(new a(), null, com.fyber.inneractive.sdk.util.e.VIDEO_CTA);
        l lVar = new l(false);
        com.fyber.inneractive.sdk.click.a[] aVarArr = new com.fyber.inneractive.sdk.click.a[5];
        aVarArr[0] = fVar;
        aVarArr[1] = new com.fyber.inneractive.sdk.click.d();
        aVarArr[2] = new com.fyber.inneractive.sdk.click.g();
        aVarArr[3] = new com.fyber.inneractive.sdk.click.j();
        aVarArr[4] = new com.fyber.inneractive.sdk.click.h(TextUtils.isEmpty(str) ? null : Uri.parse(str).getScheme(), false);
        lVar.h.addAll(Arrays.asList(aVarArr));
        lVar.a(this.a.getApplicationContext(), str, new b(), null, false, com.fyber.inneractive.sdk.ignite.k.NONE, "");
        return !str.startsWith(HttpHost.DEFAULT_SCHEME_NAME);
    }
}
