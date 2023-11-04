package com.fyber.inneractive.sdk.measurement.tracker;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.fyber.inneractive.sdk.flow.o;
import com.fyber.inneractive.sdk.measurement.a;
import com.fyber.inneractive.sdk.network.r;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.m;
import com.iab.omid.library.fyber.adsession.AdEvents;
import com.iab.omid.library.fyber.adsession.AdSession;
import com.iab.omid.library.fyber.adsession.AdSessionConfiguration;
import com.iab.omid.library.fyber.adsession.AdSessionContext;
import com.iab.omid.library.fyber.adsession.Partner;
import com.iab.omid.library.fyber.publisher.AdSessionStatePublisher;

/* loaded from: classes.dex */
public abstract class c implements a.InterfaceC0020a {
    public AdSession a;
    public AdEvents b;
    public o c;
    public final Partner e;
    public WebView f;
    public boolean d = false;
    public WebViewClient g = new a();

    /* loaded from: classes.dex */
    public class a extends WebViewClient {
        public a() {
            c.this = r1;
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            c.this.d();
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
            c.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            IAlog.a("clearing webview", new Object[0]);
            WebView webView = c.this.f;
            if (webView != null) {
                webView.destroy();
                c.this.f = null;
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.measurement.tracker.c$c */
    /* loaded from: classes.dex */
    public enum EnumC0022c {
        CloseButton,
        ProgressOverlay,
        IdentifierView
    }

    public c(Partner partner, WebView webView, o<?> oVar) {
        this.e = partner;
        this.f = webView;
        this.c = oVar;
    }

    public void a(Throwable th) {
        String format = String.format("%s - %s", "OpenMeasurementTracker", th.getMessage());
        String simpleName = th.getClass().getSimpleName();
        o oVar = this.c;
        r.a(simpleName, format, oVar != null ? oVar.a : null, oVar != null ? oVar.d() : null);
    }

    public abstract AdSessionConfiguration c();

    public void d() {
        AdSession adSession = this.a;
        if (adSession != null) {
            try {
                adSession.finish();
            } catch (Throwable th) {
                a(th);
            }
            m.b.postDelayed(new b(), 2000L);
            this.a = null;
            this.b = null;
        }
    }

    public void a(WebView webView) {
        WebView webView2;
        try {
            AdSession createAdSession = AdSession.createAdSession(c(), AdSessionContext.createHtmlAdSessionContext(this.e, webView, "", ""));
            this.a = createAdSession;
            AdSessionStatePublisher adSessionStatePublisher = createAdSession.getAdSessionStatePublisher();
            if (adSessionStatePublisher != null && (webView2 = adSessionStatePublisher.getWebView()) != null && webView2 != webView) {
                webView2.setWebViewClient(this.g);
            }
            this.a.registerAdView(webView);
            this.a.start();
        } catch (Throwable th) {
            a(th);
        }
    }
}
