package com.fyber.inneractive.sdk.measurement;

import android.content.Context;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.network.e0;
import com.fyber.inneractive.sdk.network.n0;
import com.fyber.inneractive.sdk.network.u;
import com.iab.omid.library.fyber.Omid;
import com.iab.omid.library.fyber.adsession.Partner;

/* loaded from: classes.dex */
public class b extends com.fyber.inneractive.sdk.measurement.a {
    public String b;
    public String c;
    public String d;
    public Partner e;
    public final com.fyber.inneractive.sdk.measurement.tracker.d f = new com.fyber.inneractive.sdk.measurement.tracker.d();
    public u<String> g = new a();
    public u<String> h = new C0021b();
    public u<String> i = new c();

    /* loaded from: classes.dex */
    public class a implements u<String> {
        public a() {
            b.this = r1;
        }

        @Override // com.fyber.inneractive.sdk.network.u
        public void a(String str, Exception exc, boolean z) {
            String str2 = str;
            if (str2 != null) {
                b.this.b = str2;
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.measurement.b$b */
    /* loaded from: classes.dex */
    public class C0021b implements u<String> {
        public C0021b() {
            b.this = r1;
        }

        @Override // com.fyber.inneractive.sdk.network.u
        public void a(String str, Exception exc, boolean z) {
            String str2 = str;
            if (str2 != null) {
                b.this.c = str2;
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements u<String> {
        public c() {
            b.this = r1;
        }

        @Override // com.fyber.inneractive.sdk.network.u
        public void a(String str, Exception exc, boolean z) {
            String str2 = str;
            if (str2 != null) {
                b.this.d = str2;
            }
        }
    }

    public static void a(b bVar, Context context) {
        bVar.getClass();
        bVar.a(context, String.format("https://cdn2.inner-active.mobi/client/ia-js-tags/omsdk/%s.js", Omid.getVersion()), "omid-latest.js", bVar.g);
        bVar.a(context, String.format("https://cdn2.inner-active.mobi/client/ia-js-tags/omsdk/omid-session-client-%s.js", Omid.getVersion()), "omid-session-client-latest.js", bVar.h);
        bVar.a(context, "https://cdn2.inner-active.mobi/client/ia-js-tags/omsdk/dt-omsdk-mraid-video-tracker.js", "dt-omsdk-mraid-video-tracker.js", bVar.i);
    }

    public final void a(Context context, String str, String str2, u<String> uVar) {
        e0 e0Var = new e0(uVar, context, new com.fyber.inneractive.sdk.cache.d(str, str2));
        IAConfigManager.M.s.a.offer(e0Var);
        e0Var.a(n0.QUEUED);
    }
}
