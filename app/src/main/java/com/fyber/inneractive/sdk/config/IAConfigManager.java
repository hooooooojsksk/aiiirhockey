package com.fyber.inneractive.sdk.config;

import android.content.Context;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.fyber.inneractive.sdk.config.enums.Vendor;
import com.fyber.inneractive.sdk.external.InneractiveMediationName;
import com.fyber.inneractive.sdk.external.InneractiveUserConfig;
import com.fyber.inneractive.sdk.network.n0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.r0;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class IAConfigManager {
    public static long N;
    public final com.fyber.inneractive.sdk.util.e0 A;
    public com.fyber.inneractive.sdk.network.a0<c> B;
    public com.fyber.inneractive.sdk.network.a0<com.fyber.inneractive.sdk.config.global.l> C;
    public com.fyber.inneractive.sdk.config.d D;
    public final com.fyber.inneractive.sdk.ignite.c E;
    public final com.fyber.inneractive.sdk.dv.handler.a F;
    public final com.fyber.inneractive.sdk.cache.h G;
    public final com.fyber.inneractive.sdk.network.c H;
    public final Map<com.fyber.inneractive.sdk.util.t, com.fyber.inneractive.sdk.util.s> I;
    public com.fyber.inneractive.sdk.measurement.a J;
    public WebView K;
    public final com.fyber.inneractive.sdk.config.global.s L;
    public Map<String, z> a = new HashMap();
    public Map<String, a0> b = new HashMap();
    public String c;
    public String d;
    public String e;
    public Context f;
    public List<OnConfigurationReadyAndValidListener> g;
    public boolean h;
    public final s i;
    public InneractiveUserConfig j;
    public String k;
    public boolean l;
    public String m;
    public InneractiveMediationName n;
    public String o;
    public String p;
    public List<String> q;
    public boolean r;
    public final com.fyber.inneractive.sdk.network.w s;
    public String t;
    public j u;
    public com.fyber.inneractive.sdk.config.e v;
    public k w;
    public final f0 x;
    public r0 y;
    public com.fyber.inneractive.sdk.config.global.a z;
    public static final IAConfigManager M = new IAConfigManager();
    public static final Runnable O = new b();

    /* loaded from: classes.dex */
    public interface OnConfigurationReadyAndValidListener {
        void onConfigurationReadyAndValid(IAConfigManager iAConfigManager, boolean z, Exception exc);
    }

    /* loaded from: classes.dex */
    public class a extends WebViewClient {
        public a(IAConfigManager iAConfigManager) {
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            IAConfigManager iAConfigManager = IAConfigManager.M;
            WebView webView = iAConfigManager.K;
            if (webView == null || iAConfigManager.f == null) {
                return;
            }
            webView.destroy();
            iAConfigManager.K = iAConfigManager.a(iAConfigManager.f);
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public String a;
        public String b;
        public String c;
        public Map<String, z> d = new HashMap();
        public Map<String, a0> e = new HashMap();
        public e f = new e();
    }

    /* loaded from: classes.dex */
    public static class d extends Exception {
    }

    /* loaded from: classes.dex */
    public static class e {
        public Set<Vendor> a = new HashSet();
    }

    public IAConfigManager() {
        com.fyber.inneractive.sdk.dv.handler.a dVar;
        new HashSet();
        this.h = false;
        this.i = new s();
        this.l = false;
        this.r = false;
        this.s = new com.fyber.inneractive.sdk.network.w();
        this.t = "";
        this.x = new f0();
        this.A = new com.fyber.inneractive.sdk.util.e0();
        this.E = new com.fyber.inneractive.sdk.ignite.c();
        if (com.fyber.inneractive.sdk.util.l.a("com.google.android.gms.ads.MobileAds", "com.google.android.gms.ads.query.QueryInfoGenerationCallback")) {
            dVar = new com.fyber.inneractive.sdk.dv.handler.c();
        } else {
            dVar = new com.fyber.inneractive.sdk.dv.handler.d();
        }
        this.F = dVar;
        this.G = new com.fyber.inneractive.sdk.cache.h();
        this.H = new com.fyber.inneractive.sdk.network.c();
        this.I = new HashMap();
        this.L = com.fyber.inneractive.sdk.config.global.s.b();
        this.g = new CopyOnWriteArrayList();
    }

    public static void a(String str, String str2) {
        com.fyber.inneractive.sdk.util.m.b.post(new r(str, str2));
    }

    public static void addListener(OnConfigurationReadyAndValidListener onConfigurationReadyAndValidListener) {
        M.g.add(onConfigurationReadyAndValidListener);
    }

    public static com.fyber.inneractive.sdk.config.e b() {
        return M.v;
    }

    public static j c() {
        return M.u;
    }

    public static com.fyber.inneractive.sdk.ignite.c d() {
        return M.E;
    }

    public static com.fyber.inneractive.sdk.config.global.s e() {
        return M.L;
    }

    public static f0 f() {
        return M.x;
    }

    public static r0 g() {
        return M.y;
    }

    public static String h() {
        return M.D.d;
    }

    public static boolean i() {
        return M.e != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x002c, code lost:
        if ((java.lang.System.currentTimeMillis() - com.fyber.inneractive.sdk.config.IAConfigManager.N <= 3600000) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002e, code lost:
        if (r2 != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0030, code lost:
        if (r2 == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0032, code lost:
        r2 = com.fyber.inneractive.sdk.config.IAConfigManager.M.u;
        r2.d = false;
        com.fyber.inneractive.sdk.util.m.a(new com.fyber.inneractive.sdk.util.k(r2.e));
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0042, code lost:
        a();
        com.fyber.inneractive.sdk.config.IAConfigManager.M.G.a();
        r1 = com.fyber.inneractive.sdk.web.z.c;
        r1.getClass();
        com.fyber.inneractive.sdk.util.m.a(new com.fyber.inneractive.sdk.web.y(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0059, code lost:
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean j() {
        /*
            boolean r0 = i()
            int r1 = com.fyber.inneractive.sdk.config.f.a
            r1 = 0
            java.lang.String r2 = java.lang.Boolean.toString(r1)
            java.lang.String r3 = "ia.testEnvironmentConfiguration.forceConfigRefresh"
            java.lang.String r2 = java.lang.System.getProperty(r3, r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            boolean r2 = r2.booleanValue()
            if (r0 == 0) goto L2e
            long r3 = java.lang.System.currentTimeMillis()
            long r5 = com.fyber.inneractive.sdk.config.IAConfigManager.N
            long r3 = r3 - r5
            r5 = 3600000(0x36ee80, double:1.7786363E-317)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 > 0) goto L2b
            r3 = 1
            goto L2c
        L2b:
            r3 = 0
        L2c:
            if (r3 == 0) goto L30
        L2e:
            if (r2 == 0) goto L59
        L30:
            if (r2 == 0) goto L42
            com.fyber.inneractive.sdk.config.IAConfigManager r2 = com.fyber.inneractive.sdk.config.IAConfigManager.M
            com.fyber.inneractive.sdk.config.j r2 = r2.u
            r2.d = r1
            com.fyber.inneractive.sdk.cache.c r1 = r2.e
            com.fyber.inneractive.sdk.util.k r2 = new com.fyber.inneractive.sdk.util.k
            r2.<init>(r1)
            com.fyber.inneractive.sdk.util.m.a(r2)
        L42:
            a()
            com.fyber.inneractive.sdk.config.IAConfigManager r1 = com.fyber.inneractive.sdk.config.IAConfigManager.M
            com.fyber.inneractive.sdk.cache.h r1 = r1.G
            r1.a()
            com.fyber.inneractive.sdk.web.z r1 = com.fyber.inneractive.sdk.web.z.c
            r1.getClass()
            com.fyber.inneractive.sdk.web.y r2 = new com.fyber.inneractive.sdk.web.y
            r2.<init>(r1)
            com.fyber.inneractive.sdk.util.m.a(r2)
        L59:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.config.IAConfigManager.j():boolean");
    }

    public static void removeListener(OnConfigurationReadyAndValidListener onConfigurationReadyAndValidListener) {
        M.g.remove(onConfigurationReadyAndValidListener);
    }

    public final WebView a(Context context) {
        try {
            WebView webView = new WebView(context);
            webView.setWebViewClient(new a(this));
            return webView;
        } catch (Throwable unused) {
            IAlog.a("failed to create a new webview", new Object[0]);
            return null;
        }
    }

    public final void a(Exception exc) {
        for (OnConfigurationReadyAndValidListener onConfigurationReadyAndValidListener : this.g) {
            if (onConfigurationReadyAndValidListener != null) {
                boolean i = i();
                IAlog.d("notifying listener configuration state has been resolved", new Object[0]);
                onConfigurationReadyAndValidListener.onConfigurationReadyAndValid(this, i, !i ? exc : null);
            }
        }
    }

    public static void a() {
        IAConfigManager iAConfigManager = M;
        com.fyber.inneractive.sdk.network.a0<c> a0Var = iAConfigManager.B;
        if (a0Var != null) {
            iAConfigManager.s.a.offer(a0Var);
            a0Var.a(n0.QUEUED);
        }
        j jVar = iAConfigManager.u;
        if (jVar.d) {
            return;
        }
        jVar.b();
    }
}
