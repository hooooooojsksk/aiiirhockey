package com.iab.omid.library.fyber.publisher;

import android.os.Handler;
import android.webkit.WebView;
import com.iab.omid.library.fyber.adsession.AdSessionContext;
import com.iab.omid.library.fyber.adsession.VerificationScriptResource;
import com.iab.omid.library.fyber.internal.g;
import com.iab.omid.library.fyber.utils.c;
import com.iab.omid.library.fyber.utils.f;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class b extends AdSessionStatePublisher {
    private WebView f;
    private Long g = null;
    private final Map<String, VerificationScriptResource> h;
    private final String i;

    /* loaded from: classes2.dex */
    class a implements Runnable {
        private final WebView a;

        a() {
            b.this = r1;
            this.a = r1.f;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.destroy();
        }
    }

    public b(Map<String, VerificationScriptResource> map, String str) {
        this.h = map;
        this.i = str;
    }

    @Override // com.iab.omid.library.fyber.publisher.AdSessionStatePublisher
    public void a(com.iab.omid.library.fyber.adsession.a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String str : injectedResourcesMap.keySet()) {
            c.a(jSONObject, str, injectedResourcesMap.get(str).toJsonObject());
        }
        a(aVar, adSessionContext, jSONObject);
    }

    @Override // com.iab.omid.library.fyber.publisher.AdSessionStatePublisher
    public void b() {
        super.b();
        new Handler().postDelayed(new a(), Math.max(4000 - (this.g == null ? 4000L : TimeUnit.MILLISECONDS.convert(f.b() - this.g.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f = null;
    }

    @Override // com.iab.omid.library.fyber.publisher.AdSessionStatePublisher
    public void i() {
        super.i();
        j();
    }

    void j() {
        WebView webView = new WebView(com.iab.omid.library.fyber.internal.f.b().a());
        this.f = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f.getSettings().setAllowContentAccess(false);
        a(this.f);
        g.a().c(this.f, this.i);
        for (String str : this.h.keySet()) {
            g.a().a(this.f, this.h.get(str).getResourceUrl().toExternalForm(), str);
        }
        this.g = Long.valueOf(f.b());
    }
}
