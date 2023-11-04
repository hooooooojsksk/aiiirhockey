package com.fyber.inneractive.sdk.web;

import android.content.Context;
import android.graphics.Rect;
import android.os.AsyncTask;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.measurement.a;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.k0;
import com.fyber.inneractive.sdk.util.n0;
import com.fyber.inneractive.sdk.util.x;
import com.fyber.inneractive.sdk.util.z;
import com.fyber.inneractive.sdk.web.d0;
import com.fyber.inneractive.sdk.web.g;
import com.fyber.inneractive.sdk.web.w;
import cz.msebera.android.httpclient.HttpStatus;

/* loaded from: classes.dex */
public abstract class d<L extends d0> implements com.fyber.inneractive.sdk.web.f, z.e, g.a, w.a {
    public g b;
    public r c;
    public s d;
    public boolean e;
    public e f;
    public L g;
    public boolean j;
    public boolean k;
    public InterfaceC0057d l;
    public Runnable o;
    public long p;
    public long q;
    public AsyncTask<Void, Void, String> r;
    public String s;
    public String t;
    public InneractiveAdRequest u;
    public com.fyber.inneractive.sdk.flow.o v;
    public boolean a = false;
    public float h = 0.0f;
    public Rect i = new Rect();
    public final Runnable n = new a();
    public final Runnable m = new b();

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
            d.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            IAlog.d("Removing clicked state after timeout", new Object[0]);
            d.this.j();
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
            d.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            d dVar = d.this;
            if (dVar.k) {
                IAlog.a("No user web action detected for : %s blocking.", dVar.l);
                d dVar2 = d.this;
                String c = dVar2.l.c();
                String a = d.this.l.a();
                L l = dVar2.g;
                if (l != null) {
                    l.a(c, a);
                }
                int i = IAlog.a;
                IAlog.a(1, null, "AD_AUTO_CLICK_DETECTED", new Object[0]);
                d.this.l.b();
                d.this.j();
            } else {
                IAlog.a("User web action detected for: %s", dVar.l);
                d.this.l.d();
            }
            d.this.l = null;
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
            d.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            d dVar = d.this;
            AsyncTask<Void, Void, String> asyncTask = dVar.r;
            if (asyncTask != null) {
                asyncTask.cancel(true);
                dVar.r = null;
            }
            IAlog.a("%sonLoadTimeout after %d msec", IAlog.a(dVar), Long.valueOf(dVar.p));
            InneractiveErrorCode inneractiveErrorCode = InneractiveErrorCode.LOAD_TIMEOUT;
            com.fyber.inneractive.sdk.flow.f fVar = com.fyber.inneractive.sdk.flow.f.WEBVIEW_LOAD_TIMEOUT;
            InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(inneractiveErrorCode, fVar, new Exception("LoadTimeout after " + dVar.p + "ms"));
            e eVar = dVar.f;
            if (eVar != null) {
                eVar.a(dVar, inneractiveInfrastructureError);
            }
            dVar.b(true);
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.web.d$d */
    /* loaded from: classes.dex */
    public interface InterfaceC0057d {
        String a();

        void b();

        String c();

        void d();
    }

    /* loaded from: classes.dex */
    public interface e {
        void a(d dVar);

        void a(d dVar, InneractiveInfrastructureError inneractiveInfrastructureError);
    }

    /* loaded from: classes.dex */
    public class f implements InterfaceC0057d {
        public String a;
        public k0 b;

        public f(String str, k0 k0Var) {
            d.this = r1;
            this.b = k0Var;
            this.a = str;
        }

        @Override // com.fyber.inneractive.sdk.web.d.InterfaceC0057d
        public String a() {
            return null;
        }

        @Override // com.fyber.inneractive.sdk.web.d.InterfaceC0057d
        public void b() {
        }

        @Override // com.fyber.inneractive.sdk.web.d.InterfaceC0057d
        public String c() {
            return "open";
        }

        @Override // com.fyber.inneractive.sdk.web.d.InterfaceC0057d
        public void d() {
            d dVar = d.this;
            String str = this.a;
            k0 k0Var = this.b;
            L l = dVar.g;
            if (l != null) {
                x.d dVar2 = l.a(str, k0Var, null).a;
            }
        }

        public String toString() {
            return "action: open url: " + this.a;
        }
    }

    public d(Context context, boolean z, boolean z2) {
        this.k = z;
        this.b = a(context);
        this.e = z2;
    }

    @Override // com.fyber.inneractive.sdk.web.f
    public void a(int i) {
    }

    @Override // com.fyber.inneractive.sdk.web.f
    public void a(WebView webView) {
    }

    public void a(String str, String str2, String str3, String str4, e eVar, long j) {
        this.f = eVar;
        this.p = j;
        try {
            h();
            com.fyber.inneractive.sdk.web.e eVar2 = new com.fyber.inneractive.sdk.web.e(this, str2, str3, str4, str);
            this.r = eVar2;
            eVar2.executeOnExecutor(com.fyber.inneractive.sdk.util.m.a, new Void[0]);
            k();
        } catch (Throwable th) {
            InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, com.fyber.inneractive.sdk.flow.f.COULD_NOT_CONFIGURE_WEBVIEW, th);
            e eVar3 = this.f;
            if (eVar3 != null) {
                eVar3.a(this, inneractiveInfrastructureError);
            }
            b(true);
        }
    }

    public abstract boolean a(String str, k0 k0Var);

    public void b(boolean z) {
        AsyncTask<Void, Void, String> asyncTask = this.r;
        if (asyncTask != null) {
            asyncTask.cancel(true);
        }
        g gVar = this.b;
        if (gVar != null) {
            z.d.a.a(gVar);
            com.fyber.inneractive.sdk.util.q.a(this.b);
            this.b.setWebChromeClient(null);
            this.b.setWebViewClient(null);
            if (d() == null) {
                this.b.destroy();
            }
        }
        s sVar = this.d;
        if (sVar != null) {
            sVar.e = null;
        }
        Runnable runnable = this.n;
        if (runnable != null) {
            com.fyber.inneractive.sdk.util.m.b.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.m;
        if (runnable2 != null) {
            com.fyber.inneractive.sdk.util.m.b.removeCallbacks(runnable2);
        }
        Runnable runnable3 = this.o;
        if (runnable3 != null) {
            com.fyber.inneractive.sdk.util.m.b.removeCallbacks(runnable3);
        }
        this.g = null;
        if (!z) {
            this.f = null;
        }
        this.b = null;
        this.c = null;
        this.d = null;
        this.v = null;
        this.u = null;
    }

    public void c() {
        b(false);
    }

    public abstract a.InterfaceC0020a d();

    public g e() {
        return this.b;
    }

    public k0 f() {
        g gVar = this.b;
        return gVar != null ? gVar.getLastClickedLocation() : k0.a();
    }

    public void h() {
        boolean z;
        int i;
        int i2;
        int i3;
        com.fyber.inneractive.sdk.config.global.s sVar;
        com.fyber.inneractive.sdk.config.global.features.f fVar;
        WebSettings settings = this.b.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setLoadsImagesAutomatically(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (!IAConfigManager.M.r && com.fyber.inneractive.sdk.util.p.a() && Build.VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(2);
        }
        if (this.e && Build.VERSION.SDK_INT >= 17) {
            settings.setMediaPlaybackRequiresUserGesture(false);
        }
        g gVar = this.b;
        gVar.setHorizontalScrollBarEnabled(false);
        gVar.setHorizontalScrollbarOverlay(false);
        gVar.setVerticalScrollBarEnabled(false);
        gVar.setVerticalScrollbarOverlay(false);
        gVar.getSettings().setSupportZoom(false);
        g gVar2 = this.b;
        gVar2.getClass();
        if (Build.VERSION.SDK_INT < 18) {
            try {
                gVar2.getSettings().setPluginState(WebSettings.PluginState.ON);
            } catch (Exception unused) {
                IAlog.a("Failed to modify WebView plugin state.", new Object[0]);
            }
        }
        this.b.setFocusable(true);
        this.b.setBackgroundColor(0);
        r rVar = new r();
        this.c = rVar;
        this.b.setWebChromeClient(rVar);
        com.fyber.inneractive.sdk.flow.o oVar = this.v;
        int i4 = HttpStatus.SC_INTERNAL_SERVER_ERROR;
        if (oVar == null || (sVar = oVar.c) == null || (fVar = (com.fyber.inneractive.sdk.config.global.features.f) sVar.a(com.fyber.inneractive.sdk.config.global.features.f.class)) == null) {
            z = false;
            i = HttpStatus.SC_INTERNAL_SERVER_ERROR;
            i2 = HttpStatus.SC_INTERNAL_SERVER_ERROR;
            i3 = 2;
        } else {
            boolean a2 = fVar.a("agg_res", false);
            Integer b2 = fVar.b("agg_res_ct");
            int max = Math.max(b2 != null ? b2.intValue() : HttpStatus.SC_INTERNAL_SERVER_ERROR, 50);
            Integer b3 = fVar.b("agg_res_rt");
            if (b3 != null) {
                i4 = b3.intValue();
            }
            int max2 = Math.max(i4, 50);
            Integer b4 = fVar.b("agg_res_retries");
            i2 = max2;
            i3 = Math.max(b4 != null ? b4.intValue() : 2, 1);
            z = a2;
            i = max;
        }
        s sVar2 = new s(this, z, i, i2, i3);
        this.d = sVar2;
        this.b.setWebViewClient(sVar2);
        try {
            if (Build.VERSION.SDK_INT >= 19) {
                WebView.setWebContentsDebuggingEnabled(true);
            }
        } catch (Exception unused2) {
            IAlog.a("Could not set web contents debugging flag", new Object[0]);
        }
        this.b.setListener(this);
    }

    public void i() {
        this.b.setTapListener(this);
    }

    public void j() {
        IAlog.a("IAWebViewController resetClick()", new Object[0]);
        Runnable runnable = this.n;
        if (runnable != null) {
            com.fyber.inneractive.sdk.util.m.b.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.m;
        if (runnable2 != null) {
            com.fyber.inneractive.sdk.util.m.b.removeCallbacks(runnable2);
        }
        this.j = false;
    }

    public final void k() {
        IAlog.a("IAWebViewController: Starting load timeout with %d", Long.valueOf(this.p));
        this.q = System.currentTimeMillis();
        c cVar = new c();
        this.o = cVar;
        com.fyber.inneractive.sdk.util.m.b.postDelayed(cVar, this.p);
    }

    public void setAdContent(com.fyber.inneractive.sdk.flow.o oVar) {
        this.v = oVar;
    }

    public void setAdRequest(InneractiveAdRequest inneractiveAdRequest) {
        this.u = inneractiveAdRequest;
    }

    public void setListener(L l) {
        this.g = l;
    }

    public void g() {
        IAlog.a("%sIAWebViewController: onWebviewLoaded - load took %d msec", IAlog.a(this), Long.valueOf(System.currentTimeMillis() - this.q));
        Runnable runnable = this.o;
        if (runnable != null) {
            com.fyber.inneractive.sdk.util.m.b.removeCallbacks(runnable);
            this.o = null;
        }
        e eVar = this.f;
        if (eVar != null) {
            eVar.a(this);
        }
    }

    public void a(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        g gVar = this.b;
        if (gVar != null) {
            if (layoutParams != null) {
                viewGroup.addView(gVar, layoutParams);
            } else {
                viewGroup.addView(gVar);
            }
            z.d.a.a(viewGroup.getContext(), this.b, this);
            this.b.setTapListener(this);
        }
    }

    public g a(Context context) {
        return new g(context);
    }

    @Override // com.fyber.inneractive.sdk.util.z.e
    public void a(View view, float f2, Rect rect) {
        if (f2 == this.h && rect.equals(this.i)) {
            return;
        }
        this.h = f2;
        this.i.set(rect);
        g gVar = this.b;
        if (gVar != null) {
            gVar.a();
        }
    }

    @Override // com.fyber.inneractive.sdk.web.f
    public boolean a(WebView webView, String str) {
        IAlog.a("%shandleUrl called with: %s", IAlog.a(this), str);
        if (this.b == null) {
            IAlog.a("handleUrl: web view already destroyed. Cannot handle url", new Object[0]);
            return false;
        } else if (n0.a(str)) {
            this.b.loadUrl("chrome://crash");
            return true;
        } else {
            k0 f2 = f();
            if (a(str, f2)) {
                return true;
            }
            a(new f(str, f2));
            return true;
        }
    }

    public void a(boolean z) {
        IAlog.a("%sonWebViewVisibilityChanged called with: %s", IAlog.a(this), Boolean.valueOf(z));
        L l = this.g;
        if (l != null) {
            l.a(z);
        }
    }

    public boolean a(InterfaceC0057d interfaceC0057d) {
        IAlog.d("IAWebViewController Web view click detected", new Object[0]);
        if (this.j) {
            IAlog.d("IAWebViewController Native click detected before web view request. Processing click", new Object[0]);
            interfaceC0057d.d();
            j();
            return true;
        }
        if (this.k) {
            IAlog.d("IAWebViewController Native click was not detected yet. Caching click request and waiting", new Object[0]);
            Runnable runnable = this.m;
            if (runnable != null) {
                com.fyber.inneractive.sdk.util.m.b.removeCallbacks(runnable);
            }
            this.l = interfaceC0057d;
            if (this.m != null) {
                com.fyber.inneractive.sdk.util.m.b.postDelayed(this.m, IAConfigManager.M.u.b.a("click_timeout", 1000, 1000));
            }
        } else {
            Runnable runnable2 = this.m;
            if (runnable2 != null) {
                com.fyber.inneractive.sdk.util.m.b.removeCallbacks(runnable2);
            }
            this.l = null;
            interfaceC0057d.d();
        }
        return false;
    }
}
