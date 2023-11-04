package com.fyber.inneractive.sdk.network;

import android.util.Log;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.factories.b;
import com.fyber.inneractive.sdk.network.a0;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public abstract class d0<T> implements a0<T> {
    public volatile boolean a;
    public final u<T> b;
    public g c;
    public a0.a d;
    public j e;
    public volatile n0 f;
    public final String g;
    public final com.fyber.inneractive.sdk.config.global.s h;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ Object a;
        public final /* synthetic */ Exception b;
        public final /* synthetic */ boolean c;

        public a(Object obj, Exception exc, boolean z) {
            d0.this = r1;
            this.a = obj;
            this.b = exc;
            this.c = z;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            d0.this.b.a(this.a, this.b, this.c);
        }
    }

    public d0(u<T> uVar, g gVar) {
        this(uVar, gVar, null);
    }

    @Override // com.fyber.inneractive.sdk.network.a0
    public void a(z zVar, String str, String str2) {
    }

    @Override // com.fyber.inneractive.sdk.network.a0
    public void b() {
        try {
            j jVar = this.e;
            if (jVar != null) {
                jVar.a();
            }
            this.c.b();
        } catch (Exception unused) {
        }
    }

    @Override // com.fyber.inneractive.sdk.network.a0
    public String c() {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.network.a0
    public String e() {
        return this.g;
    }

    @Override // com.fyber.inneractive.sdk.network.a0
    public boolean f() {
        return this.a;
    }

    @Override // com.fyber.inneractive.sdk.network.a0
    public com.fyber.inneractive.sdk.network.a<T> h() {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.network.a0
    public boolean i() {
        return !(this instanceof m0);
    }

    @Override // com.fyber.inneractive.sdk.network.a0
    public com.fyber.inneractive.sdk.config.global.s j() {
        return this.h;
    }

    @Override // com.fyber.inneractive.sdk.network.a0
    public q0 k() {
        IAConfigManager iAConfigManager = IAConfigManager.M;
        return new q0(iAConfigManager.u.b.a("connect_timeout", 5000, 1), iAConfigManager.u.b.a("read_timeout", 5000, 1));
    }

    @Override // com.fyber.inneractive.sdk.network.a0
    public n0 m() {
        return this.f;
    }

    @Override // com.fyber.inneractive.sdk.network.a0
    public String n() {
        return "application/json; charset=utf-8";
    }

    @Override // com.fyber.inneractive.sdk.network.a0
    public byte[] q() {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.network.a0
    public Map<String, String> s() {
        return null;
    }

    public d0(u<T> uVar, g gVar, com.fyber.inneractive.sdk.config.global.s sVar) {
        this.a = false;
        this.f = n0.INITIAL;
        this.b = uVar;
        this.c = gVar;
        this.g = UUID.randomUUID().toString();
        this.h = sVar;
    }

    @Override // com.fyber.inneractive.sdk.network.a0
    public j a(String str) throws Exception {
        try {
            a0.a aVar = this.d;
            if (aVar != null) {
                aVar.a("sdkInitNetworkRequest");
            }
            this.e = this.c.a(this, com.fyber.inneractive.sdk.util.l.f(), str);
            a0.a aVar2 = this.d;
            if (aVar2 != null) {
                aVar2.a("sdkGotServerResponse");
            }
            return this.e;
        } catch (b e) {
            IAlog.a("failed start network request", e, new Object[0]);
            throw e;
        } catch (t0 e2) {
            IAlog.a("failed read network response", e2, new Object[0]);
            throw e2;
        } catch (Exception e3) {
            IAlog.a("failed start network request", e3, new Object[0]);
            throw e3;
        }
    }

    @Override // com.fyber.inneractive.sdk.network.a0
    public void a(T t, Exception exc, boolean z) {
        if (!z) {
            a(n0.RESOLVED);
        }
        com.fyber.inneractive.sdk.util.m.b.post(new a(t, exc, z));
    }

    @Override // com.fyber.inneractive.sdk.network.a0
    public void a(n0 n0Var) {
        a0.a aVar;
        this.f = n0Var;
        if (n0Var != n0.QUEUED_FOR_RETRY || (aVar = this.d) == null) {
            return;
        }
        aVar.a("sdkRequestEndedButWillBeRetried");
    }

    public com.fyber.inneractive.sdk.response.e a(int i, m mVar, com.fyber.inneractive.sdk.response.j jVar, com.fyber.inneractive.sdk.dv.g gVar) throws Exception {
        try {
            com.fyber.inneractive.sdk.response.a a2 = com.fyber.inneractive.sdk.response.a.a(i);
            if (a2 == null) {
                a2 = com.fyber.inneractive.sdk.response.a.RETURNED_ADTYPE_MRAID;
            }
            com.fyber.inneractive.sdk.response.b a3 = b.a.a.a(a2);
            if (a3 == null) {
                IAlog.e("Received ad type %s does not have an appropriate parser!", Integer.valueOf(i));
                if (b.a.a.a.size() == 0) {
                    Log.e("Inneractive_error", "Critical error raised while fetching an ad - please make sure you have added all the required fyber libraries (ia-mraid-kit, ia-video-kit) to your project");
                }
                throw new y("Could not find parser for ad type " + i);
            }
            IAlog.a("Received ad type %s - Got parser! %s", Integer.valueOf(i), a3);
            if (jVar != null) {
                a3.c = jVar;
            }
            a3.a = a3.a();
            if (mVar != null) {
                a3.c = new com.fyber.inneractive.sdk.response.k(mVar);
            }
            com.fyber.inneractive.sdk.response.e a4 = a3.a((String) null);
            if (gVar != null) {
                a4.s = gVar;
            }
            a0.a aVar = this.d;
            if (aVar != null) {
                aVar.a("sdkParsedResponse");
            }
            return a4;
        } catch (Exception e) {
            IAlog.a("failed parse ad network request", e, new Object[0]);
            throw new y(e);
        }
    }
}
