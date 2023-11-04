package com.fyber.inneractive.sdk.web;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI;
import com.fyber.inneractive.sdk.activities.InternalStoreWebpageActivity;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.flow.n;
import com.fyber.inneractive.sdk.ignite.c;
import com.fyber.inneractive.sdk.ignite.g;
import com.fyber.inneractive.sdk.util.IAlog;
import com.google.android.gms.drive.DriveFile;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class t implements com.fyber.inneractive.sdk.ignite.n {
    public boolean B;
    public final WebView a;
    public final com.fyber.inneractive.sdk.ignite.c b;
    public final String c;
    public com.fyber.inneractive.sdk.ignite.k d;
    public final String e;
    public final String f;
    public final String g;
    public final com.fyber.inneractive.sdk.ignite.j h;
    public g i;
    public String k;
    public com.fyber.inneractive.sdk.config.global.s m;
    public long o;
    public Runnable p;
    public WeakReference<InternalStoreWebpageActivity> q;
    public String j = "invalid_task_id";
    public boolean l = false;
    public long n = 10;
    public boolean r = false;
    public boolean s = false;
    public final AtomicInteger t = new AtomicInteger(0);
    public final AtomicBoolean u = new AtomicBoolean(false);
    public final AtomicBoolean v = new AtomicBoolean(false);
    public boolean w = false;
    public boolean x = false;
    public boolean y = false;
    public boolean z = false;
    public boolean A = false;
    public boolean C = false;
    public boolean D = false;
    public final WebViewClient E = new a();

    /* loaded from: classes.dex */
    public class a extends WebViewClient {

        /* renamed from: com.fyber.inneractive.sdk.web.t$a$a */
        /* loaded from: classes.dex */
        public class RunnableC0059a implements Runnable {
            public RunnableC0059a() {
                a.this = r1;
            }

            @Override // java.lang.Runnable
            public void run() {
                t tVar = t.this;
                if (tVar.y) {
                    return;
                }
                tVar.g(tVar.k);
            }
        }

        public a() {
            t.this = r1;
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Activity activity = (Activity) com.fyber.inneractive.sdk.util.q.a(t.this.q);
            if (activity != null) {
                activity.finish();
            }
            com.fyber.inneractive.sdk.util.m.b.postDelayed(new RunnableC0059a(), 1000L);
            return true;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (str.endsWith(FirebaseAnalytics.Param.SUCCESS)) {
                t tVar = t.this;
                Runnable runnable = tVar.p;
                if (runnable != null) {
                    com.fyber.inneractive.sdk.util.m.b.removeCallbacks(runnable);
                    tVar.p = null;
                }
                t tVar2 = t.this;
                tVar2.getClass();
                IAlog.a("%sInternalStoreWebpageController: onWebviewLoaded - load took %d msec", IAlog.a(tVar2), Long.valueOf(System.currentTimeMillis() - t.this.o));
                t.this.l = true;
                return true;
            } else if (str.startsWith("exit")) {
                Activity activity = (Activity) com.fyber.inneractive.sdk.util.q.a(t.this.q);
                if (activity == null) {
                    return true;
                }
                try {
                    Uri parse = Uri.parse(str);
                    String queryParameter = parse.getQueryParameter("target");
                    boolean equals = TextUtils.equals("mail", parse.getAuthority());
                    Intent intent = new Intent(equals ? "android.intent.action.SENDTO" : "android.intent.action.VIEW", Uri.parse(queryParameter));
                    if (equals) {
                        intent = Intent.createChooser(intent, "Choose an application");
                    }
                    com.fyber.inneractive.sdk.util.x.a(activity, intent);
                } catch (Throwable th) {
                    com.fyber.inneractive.sdk.network.r.a(th, null, null);
                }
                return true;
            } else {
                return false;
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public final /* synthetic */ String a;

        public b(String str) {
            t.this = r1;
            this.a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IAlog.a("injecting JS: %s", this.a);
            try {
                if (this.a != null) {
                    WebView webView = t.this.a;
                    webView.loadUrl("javascript:" + this.a);
                }
            } catch (Exception unused) {
                IAlog.a("Failed to inject JS", new Object[0]);
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements com.fyber.inneractive.sdk.ignite.h {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;

        public c(String str, String str2) {
            t.this = r1;
            this.a = str;
            this.b = str2;
        }

        @Override // com.fyber.inneractive.sdk.ignite.h
        public void a() {
            t.this.b();
            t tVar = t.this;
            ((n.a) tVar.h).a(com.fyber.inneractive.sdk.network.o.IGNITE_FLOW_FAILED_TO_INSTALL_APP, this.a, this.b, tVar.d);
        }

        @Override // com.fyber.inneractive.sdk.ignite.h
        public void b() {
            t tVar = t.this;
            tVar.b.a(tVar.c, new c.d(tVar.f, tVar.d, com.fyber.inneractive.sdk.flow.n.this));
            t.this.f("onShowInstallStarted();");
        }
    }

    /* loaded from: classes.dex */
    public class d implements com.fyber.inneractive.sdk.ignite.h {
        public final /* synthetic */ String a;

        public d(String str) {
            t.this = r1;
            this.a = str;
        }

        @Override // com.fyber.inneractive.sdk.ignite.h
        public void a() {
        }

        @Override // com.fyber.inneractive.sdk.ignite.h
        public void b() {
            t.this.e(this.a);
        }
    }

    /* loaded from: classes.dex */
    public class e implements g.b {
        public e() {
            t.this = r1;
        }

        public void a(boolean z) {
            if (t.this.u.compareAndSet(false, true)) {
                t tVar = t.this;
                tVar.f("onCancelResult(" + z + ");");
                t.this.v.set(false);
            }
        }
    }

    /* loaded from: classes.dex */
    public class f implements Runnable {
        public f() {
            t.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (t.this.u.compareAndSet(false, true)) {
                t.this.f("onCancelResult(true);");
                t.this.v.set(false);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface g {
    }

    /* loaded from: classes.dex */
    public class h {
        public h() {
            t.this = r1;
        }

        @JavascriptInterface
        public void onBackButtonPressed() {
            WeakReference<InternalStoreWebpageActivity> weakReference = t.this.q;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            t.this.q.get().finish();
        }

        @JavascriptInterface
        public void onCancelButtonPressed() {
            t tVar = t.this;
            tVar.d = tVar.B ? com.fyber.inneractive.sdk.ignite.k.TRUE_SINGLE_TAP : com.fyber.inneractive.sdk.ignite.k.SINGLE_TAP;
            tVar.e(tVar.j);
            t tVar2 = t.this;
            if (tVar2.h == null || tVar2.r || tVar2.d == null) {
                return;
            }
            tVar2.r = true;
            t tVar3 = t.this;
            ((n.a) tVar3.h).a(com.fyber.inneractive.sdk.network.p.IGNITE_FLOW_CANCEL_INSTALL_CLICKED, tVar3.d);
        }

        @JavascriptInterface
        public void onInstallButtonPressed() {
            t tVar = t.this;
            com.fyber.inneractive.sdk.ignite.k kVar = tVar.B ? com.fyber.inneractive.sdk.ignite.k.TRUE_SINGLE_TAP : com.fyber.inneractive.sdk.ignite.k.SINGLE_TAP;
            tVar.d = kVar;
            tVar.b.a(tVar.c, new c.d(tVar.f, kVar, com.fyber.inneractive.sdk.flow.n.this));
            t tVar2 = t.this;
            if (tVar2.h == null || tVar2.s || tVar2.d == null) {
                return;
            }
            tVar2.s = true;
            t tVar3 = t.this;
            ((n.a) tVar3.h).a(com.fyber.inneractive.sdk.network.p.IGNITE_FLOW_INSTALL_CLICKED, tVar3.d);
        }

        @JavascriptInterface
        public void onNavigatedInsideStorePage() {
            t.this.w = true;
        }

        @JavascriptInterface
        public void onNavigatedToMainPage() {
            t.this.w = false;
        }

        @JavascriptInterface
        public void onOpenButtonPressed() {
            Intent launchIntentForPackage;
            if (!TextUtils.isEmpty(t.this.c)) {
                if (!TextUtils.isEmpty(t.this.g)) {
                    launchIntentForPackage = new Intent("android.intent.action.MAIN");
                    t tVar = t.this;
                    launchIntentForPackage.setClassName(tVar.c, tVar.g);
                } else {
                    launchIntentForPackage = com.fyber.inneractive.sdk.util.l.a.getPackageManager().getLaunchIntentForPackage(t.this.c);
                }
                if (launchIntentForPackage != null) {
                    launchIntentForPackage.setFlags(DriveFile.MODE_READ_ONLY);
                    try {
                        com.fyber.inneractive.sdk.util.l.a.startActivity(launchIntentForPackage);
                        return;
                    } catch (Exception e) {
                        com.fyber.inneractive.sdk.ignite.j jVar = t.this.h;
                        if (jVar != null) {
                            String simpleName = e.getClass().getSimpleName();
                            String message = e.getMessage();
                            com.fyber.inneractive.sdk.flow.n nVar = com.fyber.inneractive.sdk.flow.n.this;
                            com.fyber.inneractive.sdk.network.r.a(simpleName, message, nVar.a, nVar.b);
                            return;
                        }
                        return;
                    }
                }
                t tVar2 = t.this;
                tVar2.getClass();
                IAlog.e("%sPackage %s not found", IAlog.a(tVar2), t.this.c);
                return;
            }
            t tVar3 = t.this;
            tVar3.getClass();
            IAlog.e("%smPackageName is null", IAlog.a(tVar3));
        }

        @JavascriptInterface
        public void onTransitionEnded() {
            t.this.x = false;
        }

        @JavascriptInterface
        public void onTransitionStarting() {
            t.this.x = true;
        }
    }

    public t(v vVar) {
        this.c = vVar.a;
        this.d = vVar.b;
        this.e = vVar.c;
        this.m = vVar.d;
        this.f = vVar.e;
        this.g = vVar.f;
        this.h = vVar.g;
        com.fyber.inneractive.sdk.ignite.c d2 = IAConfigManager.d();
        this.b = d2;
        d2.a(this);
        this.a = new WebView(com.fyber.inneractive.sdk.util.l.a());
    }

    @Override // com.fyber.inneractive.sdk.ignite.n
    public void b(String str) {
    }

    @Override // com.fyber.inneractive.sdk.ignite.n
    public void d(String str) {
    }

    public void f(String str) {
        com.fyber.inneractive.sdk.util.m.b.post(new b(str));
    }

    public void g(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.k = str;
        WebSettings settings = this.a.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setUseWideViewPort(true);
        this.a.setInitialScale(1);
        this.a.setBackgroundColor(-1);
        this.a.setWebViewClient(this.E);
        WebView webView = this.a;
        webView.setLongClickable(false);
        webView.setOnLongClickListener(new com.fyber.inneractive.sdk.util.a0());
        this.a.addJavascriptInterface(new h(), "nativeInterface");
        this.a.loadUrl(str);
        com.fyber.inneractive.sdk.config.global.s sVar = this.m;
        if (sVar != null) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            Integer b2 = ((com.fyber.inneractive.sdk.config.global.features.p) sVar.a(com.fyber.inneractive.sdk.config.global.features.p.class)).b("load_timeout");
            int i = 10;
            int intValue = b2 != null ? b2.intValue() : 10;
            if (intValue < 30 && intValue > 2) {
                i = intValue;
            }
            long millis = timeUnit.toMillis(i);
            this.n = millis;
            IAlog.a("InternalStoreWebpageController: Starting load timeout with %d", Long.valueOf(millis));
        }
        this.o = System.currentTimeMillis();
        u uVar = new u(this);
        this.p = uVar;
        com.fyber.inneractive.sdk.util.m.b.postDelayed(uVar, this.n);
    }

    @Override // com.fyber.inneractive.sdk.ignite.n
    public void a(String str, String str2) {
        if (str == null || str2 == null || !str2.equals(this.c)) {
            return;
        }
        this.j = str;
    }

    @Override // com.fyber.inneractive.sdk.ignite.n
    public void b(String str, String str2, String str3) {
        com.fyber.inneractive.sdk.ignite.k kVar;
        if (this.D) {
            boolean z = false;
            this.z = false;
            if (this.j.equals(str)) {
                this.b.b();
                if (!this.v.get() && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str2) && str2.equals("App already installed")) {
                    f("onInstallationSuccess();");
                    this.A = true;
                    return;
                }
            }
            if ((str2 != null && (str2.equals(com.fyber.inneractive.sdk.ignite.i.NOT_CONNECTED.e()) || str2.equals(com.fyber.inneractive.sdk.ignite.i.SESSION_EXPIRED.e()))) || !this.b.d()) {
                if (this.t.getAndIncrement() < 2) {
                    this.b.a(new c(str2, str3));
                    if (z || (kVar = this.d) == null) {
                    }
                    ((n.a) this.h).a(com.fyber.inneractive.sdk.network.o.IGNITE_FLOW_FAILED_TO_INSTALL_APP, str2, str3, kVar);
                    return;
                }
                b();
                if (!this.b.e()) {
                    a((String) null, com.fyber.inneractive.sdk.ignite.i.FAILED_TO_BIND_SERVICE);
                }
            } else if (!TextUtils.equals(str2, com.fyber.inneractive.sdk.ignite.i.DOWNLOAD_IS_CANCELLED.e())) {
                b();
            }
            z = true;
            if (z) {
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.ignite.n
    public void c(String str) {
        this.z = false;
        this.A = true;
        if (this.j.equals(str)) {
            this.b.b();
            f("onInstallationSuccess();");
        }
    }

    public void e(String str) {
        com.fyber.inneractive.sdk.ignite.k kVar;
        if (str != null) {
            this.v.set(true);
            this.u.set(false);
            com.fyber.inneractive.sdk.ignite.c cVar = this.b;
            e eVar = new e();
            if (cVar.d() && !cVar.f()) {
                try {
                    IIgniteServiceAPI iIgniteServiceAPI = cVar.b;
                    Bundle bundle = cVar.g;
                    cVar.h.getClass();
                    iIgniteServiceAPI.cancel(str, bundle, new com.fyber.inneractive.sdk.ignite.b(eVar));
                } catch (Exception unused) {
                    IAlog.a("Failed to cancel task", new Object[0]);
                    eVar.a(false);
                }
            } else {
                for (com.fyber.inneractive.sdk.ignite.n nVar : cVar.i) {
                    if (nVar != null) {
                        nVar.a((String) null, (cVar.f() ? com.fyber.inneractive.sdk.ignite.i.SESSION_EXPIRED : com.fyber.inneractive.sdk.ignite.i.NOT_CONNECTED).e(), (String) null);
                    }
                }
            }
            com.fyber.inneractive.sdk.util.m.b.postDelayed(new f(), 2500L);
            com.fyber.inneractive.sdk.ignite.j jVar = this.h;
            if (jVar == null || this.r || (kVar = this.d) == null) {
                return;
            }
            this.r = true;
            ((n.a) jVar).a(com.fyber.inneractive.sdk.network.p.IGNITE_FLOW_CANCEL_INSTALL_CLICKED, kVar);
        }
    }

    @Override // com.fyber.inneractive.sdk.ignite.n
    public void a(String str) {
        this.z = true;
        if (this.j.equals(str)) {
            this.b.b();
            f("onInstallStart();");
        }
    }

    @Override // com.fyber.inneractive.sdk.ignite.n
    public void a(String str, int i, double d2) {
        if (this.j.equals(str)) {
            if (i == 0) {
                f(String.format("onDownloadProgress(%f);", Double.valueOf(d2)));
            } else if (i != 1) {
            } else {
                f("onInstallationProgress();");
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.ignite.n
    public void a(String str, String str2, String str3) {
        if (this.v.get() && str2 != null) {
            if (str2.equals(com.fyber.inneractive.sdk.ignite.i.NOT_CONNECTED.e()) || str2.equals(com.fyber.inneractive.sdk.ignite.i.SESSION_EXPIRED.e())) {
                if (this.t.getAndIncrement() < 2) {
                    this.b.a(new d(str));
                } else if (this.b.e()) {
                } else {
                    a((String) null, com.fyber.inneractive.sdk.ignite.i.FAILED_TO_BIND_SERVICE);
                }
            }
        }
    }

    public void a(String str, com.fyber.inneractive.sdk.ignite.i iVar) {
        com.fyber.inneractive.sdk.ignite.j jVar;
        com.fyber.inneractive.sdk.ignite.c cVar = this.b;
        if (cVar.j || (jVar = this.h) == null) {
            return;
        }
        cVar.j = true;
        ((n.a) jVar).a(com.fyber.inneractive.sdk.network.o.IGNITE_FLOW_FAILED_TO_START, null, iVar.e(), null);
    }

    public void a() {
        this.y = true;
        this.D = false;
        this.b.i.remove(this);
        this.i = null;
        IAlog.a("destroy internalStoreWebpageController", new Object[0]);
    }

    public final void b() {
        this.b.b();
        f("onInstallationFailed();");
    }
}
