package com.fyber.inneractive.sdk.util;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class r0 {
    public volatile String a = null;
    public Context b = null;
    public AtomicBoolean c = new AtomicBoolean(false);
    public final Runnable d = new a();

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
            r0.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            r0.this.e();
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public final /* synthetic */ String a;

        public b(String str) {
            r0.this = r1;
            this.a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            r0.this.b.getSharedPreferences("fyber.ua", 0).edit().putString("ua", this.a).apply();
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
            r0.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            r0 r0Var = r0.this;
            Context context = r0Var.b;
            if (context != null) {
                String str = null;
                try {
                    str = WebSettings.getDefaultUserAgent(context);
                } catch (Throwable unused) {
                }
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                r0Var.a(str);
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements Runnable {
        public d() {
            r0.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            r0.this.b();
        }
    }

    public String a() {
        if (TextUtils.isEmpty(this.a)) {
            Runnable runnable = this.d;
            if (runnable != null) {
                Handler handler = m.b;
                handler.removeCallbacks(runnable);
                handler.postDelayed(this.d, 50L);
            }
            return System.getProperty("http.agent");
        }
        return this.a;
    }

    public final void b() {
        WebView webView;
        String str = null;
        try {
            webView = new WebView(this.b);
            try {
                str = webView.getSettings().getUserAgentString();
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            webView = null;
        }
        if (!TextUtils.isEmpty(str)) {
            a(str);
        }
        if (webView != null) {
            webView.destroy();
        }
    }

    public final void c() {
        if (this.b == null || !TextUtils.isEmpty(this.a)) {
            return;
        }
        this.a = this.b.getSharedPreferences("fyber.ua", 0).getString("ua", null);
        if (!TextUtils.isEmpty(this.a)) {
            IAlog.a("UserAgentProvider | populated user agent from shared prefs", new Object[0]);
            this.c.compareAndSet(false, true);
        }
        e();
    }

    public void d() {
        Context context;
        c();
        if (this.c.get() || Build.VERSION.SDK_INT < 17 || (context = this.b) == null) {
            return;
        }
        String str = null;
        try {
            str = WebSettings.getDefaultUserAgent(context);
        } catch (Throwable unused) {
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        a(str);
    }

    public final void e() {
        if (Build.VERSION.SDK_INT >= 17) {
            m.a(new c());
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            b();
        } else {
            m.b.post(new d());
        }
    }

    public final void a(String str) {
        this.a = str;
        if (!TextUtils.isEmpty(this.a)) {
            IAlog.a("UserAgentProvider | populated user agent form updateUserAgentIfPossible", new Object[0]);
            this.c.compareAndSet(false, true);
        }
        m.a(new b(str));
    }
}
