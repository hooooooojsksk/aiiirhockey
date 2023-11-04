package com.fyber.inneractive.sdk.flow;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.network.q;
import com.fyber.inneractive.sdk.response.e;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class n<T extends com.fyber.inneractive.sdk.response.e> extends o<T> {
    public com.fyber.inneractive.sdk.web.t g;
    public final com.fyber.inneractive.sdk.ignite.j h;

    public n(com.fyber.inneractive.sdk.config.b0 b0Var, com.fyber.inneractive.sdk.config.global.s sVar) {
        super(b0Var, sVar);
        this.h = new a();
    }

    @Override // com.fyber.inneractive.sdk.flow.o
    public void a(String str) {
        com.fyber.inneractive.sdk.ignite.k kVar;
        com.fyber.inneractive.sdk.ignite.k kVar2 = com.fyber.inneractive.sdk.ignite.k.NONE;
        T t = this.b;
        if (t != null) {
            com.fyber.inneractive.sdk.ignite.k kVar3 = t.F;
            kVar3.getClass();
            kVar = com.fyber.inneractive.sdk.ignite.k.SINGLE_TAP;
            if (!(kVar3 == kVar)) {
                if (this.b.F.e() && !isVideoAd()) {
                    ((a) this.h).a(com.fyber.inneractive.sdk.network.o.IGNITE_FLOW_MODE_NOT_COMPATIBLE, null, null, null);
                } else {
                    kVar = this.b.F;
                }
            }
        } else {
            kVar = kVar2;
        }
        if (j()) {
            T t2 = this.b;
            String str2 = t2 != null ? t2.y : null;
            com.fyber.inneractive.sdk.web.v vVar = new com.fyber.inneractive.sdk.web.v();
            vVar.a = str2;
            vVar.b = kVar;
            vVar.c = str;
            vVar.d = this.c;
            vVar.e = t2 != null ? t2.E : null;
            vVar.f = t2 != null ? t2.G : null;
            vVar.g = this.h;
            com.fyber.inneractive.sdk.web.t tVar = new com.fyber.inneractive.sdk.web.t(vVar);
            this.g = tVar;
            com.fyber.inneractive.sdk.config.global.features.p pVar = (com.fyber.inneractive.sdk.config.global.features.p) this.c.a(com.fyber.inneractive.sdk.config.global.features.p.class);
            if (pVar == null || str2 == null) {
                return;
            }
            String a2 = pVar.a("detail_url", "https://cdn2.inner-active.mobi/app-detail-page-v0/[BUNDLE_ID].html");
            tVar.g(a2 == null ? "" : a2.replace("[BUNDLE_ID]", str2));
            return;
        }
        T t3 = this.b;
        if (t3 != null) {
            t3.a(kVar2);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.o
    public com.fyber.inneractive.sdk.web.t c() {
        return this.g;
    }

    @Override // com.fyber.inneractive.sdk.flow.o
    public boolean f() {
        com.fyber.inneractive.sdk.web.t tVar = this.g;
        return tVar != null && tVar.l;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x001d, code lost:
        if (r0.F != com.fyber.inneractive.sdk.ignite.k.NONE) goto L13;
     */
    @Override // com.fyber.inneractive.sdk.flow.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void i() {
        /*
            r5 = this;
            boolean r0 = r5.j()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L20
            com.fyber.inneractive.sdk.web.t r0 = r5.g
            if (r0 == 0) goto L12
            boolean r0 = r0.l
            if (r0 == 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            if (r0 != 0) goto L20
            T extends com.fyber.inneractive.sdk.response.e r0 = r5.b
            if (r0 == 0) goto L20
            com.fyber.inneractive.sdk.ignite.k r0 = r0.F
            com.fyber.inneractive.sdk.ignite.k r3 = com.fyber.inneractive.sdk.ignite.k.NONE
            if (r0 == r3) goto L20
            goto L21
        L20:
            r1 = 0
        L21:
            if (r1 == 0) goto L61
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r1 = "ignite webpage was not loaded yet, stopping the loading process"
            com.fyber.inneractive.sdk.util.IAlog.a(r1, r0)
            T extends com.fyber.inneractive.sdk.response.e r0 = r5.b
            com.fyber.inneractive.sdk.ignite.k r1 = com.fyber.inneractive.sdk.ignite.k.NONE
            r0.a(r1)
            com.fyber.inneractive.sdk.web.t r0 = r5.g
            if (r0 == 0) goto L61
            java.lang.Runnable r1 = r0.p
            if (r1 == 0) goto L41
            android.os.Handler r2 = com.fyber.inneractive.sdk.util.m.b
            r2.removeCallbacks(r1)
            r1 = 0
            r0.p = r1
        L41:
            boolean r1 = r0.y
            if (r1 != 0) goto L4a
            android.webkit.WebView r0 = r0.a
            r0.stopLoading()
        L4a:
            com.fyber.inneractive.sdk.ignite.j r0 = r5.h
            com.fyber.inneractive.sdk.network.o r1 = com.fyber.inneractive.sdk.network.o.IGNITE_FLOW_FAILED_TO_LOAD_WEBPAGE
            com.fyber.inneractive.sdk.web.t r2 = r5.g
            java.lang.String r2 = r2.k
            com.fyber.inneractive.sdk.ignite.i r3 = com.fyber.inneractive.sdk.ignite.i.WEBPAGE_NOT_LOADED_BEFORE_SHOW
            java.lang.String r3 = r3.e()
            T extends com.fyber.inneractive.sdk.response.e r4 = r5.b
            com.fyber.inneractive.sdk.ignite.k r4 = r4.F
            com.fyber.inneractive.sdk.flow.n$a r0 = (com.fyber.inneractive.sdk.flow.n.a) r0
            r0.a(r1, r2, r3, r4)
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.flow.n.i():void");
    }

    public final boolean j() {
        com.fyber.inneractive.sdk.ignite.c cVar = IAConfigManager.M.E;
        T t = this.b;
        return t != null && t.b() && cVar != null && cVar.d();
    }

    /* loaded from: classes.dex */
    public class a implements com.fyber.inneractive.sdk.ignite.j {
        public a() {
            n.this = r1;
        }

        public void a(com.fyber.inneractive.sdk.network.p pVar, com.fyber.inneractive.sdk.ignite.k kVar) {
            n nVar = n.this;
            InneractiveAdRequest inneractiveAdRequest = nVar.a;
            T t = nVar.b;
            com.fyber.inneractive.sdk.config.global.s sVar = nVar.c;
            JSONArray c = sVar != null ? sVar.c() : null;
            q.a aVar = new q.a(t);
            aVar.c = pVar;
            aVar.a = inneractiveAdRequest;
            aVar.d = c;
            JSONObject jSONObject = new JSONObject();
            String f = kVar.f();
            try {
                jSONObject.put("ignitem", f);
            } catch (Exception unused) {
                IAlog.e("Got exception adding param to json object: %s, %s", "ignitem", f);
            }
            aVar.f.put(jSONObject);
            aVar.a((String) null);
        }

        public void a(com.fyber.inneractive.sdk.network.o oVar, String str, String str2, com.fyber.inneractive.sdk.ignite.k kVar) {
            n nVar = n.this;
            InneractiveAdRequest inneractiveAdRequest = nVar.a;
            T t = nVar.b;
            com.fyber.inneractive.sdk.config.global.s sVar = nVar.c;
            JSONArray c = sVar != null ? sVar.c() : null;
            q.a aVar = new q.a(t);
            aVar.b = oVar;
            aVar.a = inneractiveAdRequest;
            aVar.d = c;
            JSONObject jSONObject = new JSONObject();
            if (kVar != null) {
                String f = kVar.f();
                try {
                    jSONObject.put("ignitem", f);
                } catch (Exception unused) {
                    IAlog.e("Got exception adding param to json object: %s, %s", "ignitem", f);
                }
            }
            if (!TextUtils.isEmpty(str)) {
                try {
                    jSONObject.put("message", str);
                } catch (Exception unused2) {
                    IAlog.e("Got exception adding param to json object: %s, %s", "message", str);
                }
            }
            if (!TextUtils.isEmpty(str2)) {
                try {
                    jSONObject.put("error_code", str2);
                } catch (Exception unused3) {
                    IAlog.e("Got exception adding param to json object: %s, %s", "error_code", str2);
                }
            }
            aVar.f.put(jSONObject);
            aVar.a((String) null);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.o
    public boolean a(boolean z, com.fyber.inneractive.sdk.util.e eVar) {
        com.fyber.inneractive.sdk.ignite.k kVar;
        T t = this.b;
        if (t != null) {
            kVar = t.F;
        } else {
            kVar = com.fyber.inneractive.sdk.ignite.k.NONE;
        }
        return !z && kVar != null && kVar.e() && (eVar == com.fyber.inneractive.sdk.util.e.VIDEO_CTA || eVar == com.fyber.inneractive.sdk.util.e.DEFAULT_ENDCARD);
    }
}
