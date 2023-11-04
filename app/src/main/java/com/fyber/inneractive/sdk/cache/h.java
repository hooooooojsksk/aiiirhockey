package com.fyber.inneractive.sdk.cache;

import android.app.Application;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.network.e0;
import com.fyber.inneractive.sdk.network.n0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.l;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class h {
    public long a;
    public String b;
    public String c;
    public String d;

    public void a() {
        if (TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis() - this.a) >= 60) {
            IAConfigManager iAConfigManager = IAConfigManager.M;
            if (iAConfigManager.u.b.a("use_js_inline", false)) {
                Application application = l.a;
                if (application == null) {
                    IAlog.e("fetchJS() failed context null", new Object[0]);
                    return;
                }
                this.a = System.currentTimeMillis();
                e0 e0Var = new e0(new e(this), application, new d("https://cdn2.inner-active.mobi/client/ia-js-tags/dt-mraid-video-controller.js", "dt-mraid-video-controller.js"));
                iAConfigManager.s.a.offer(e0Var);
                n0 n0Var = n0.QUEUED;
                e0Var.a(n0Var);
                e0 e0Var2 = new e0(new f(this), application, new d("https://cdn2.inner-active.mobi/IA-JSTag/Production/centering_v1.css", "centering_v1.css"));
                iAConfigManager.s.a.offer(e0Var2);
                e0Var2.a(n0Var);
                e0 e0Var3 = new e0(new g(this), application, new d("https://cdn2.inner-active.mobi/IA-JSTag/Production/centering_v1.js", "centering_v1.js"));
                iAConfigManager.s.a.offer(e0Var3);
                e0Var3.a(n0Var);
            }
        }
    }
}
