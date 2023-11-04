package com.fyber.inneractive.sdk.flow;

import android.os.Looper;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.bidder.adm.f;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.external.InneractiveMediationName;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.flow.i;
import com.fyber.inneractive.sdk.network.p0;
import com.fyber.inneractive.sdk.network.q;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class r implements u, a0 {
    public final String a;
    public InneractiveAdSpot.RequestListener b;
    public InneractiveAdRequest c;
    public i.b d;
    public o e;
    public c0 f;
    public Set<c0> g;
    public h h;
    public c i;
    public boolean j = true;
    public boolean k = false;
    public j l;

    /* loaded from: classes.dex */
    public class a implements f.a {
        public final /* synthetic */ com.fyber.inneractive.sdk.bidder.adm.f a;
        public final /* synthetic */ long b;
        public final /* synthetic */ String c;

        public a(com.fyber.inneractive.sdk.bidder.adm.f fVar, long j, String str) {
            r.this = r1;
            this.a = fVar;
            this.b = j;
            this.c = str;
        }

        public void a(Exception exc, InneractiveErrorCode inneractiveErrorCode, com.fyber.inneractive.sdk.response.e... eVarArr) {
            com.fyber.inneractive.sdk.network.o oVar;
            com.fyber.inneractive.sdk.response.e eVar = eVarArr.length > 0 ? eVarArr[0] : null;
            InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(inneractiveErrorCode, f.ADM_FETCH_FAILED);
            i.b bVar = r.this.d;
            if (bVar != null) {
                ((s) bVar).a(null, eVar, inneractiveInfrastructureError);
            }
            r.this.l.a(null, eVar, inneractiveInfrastructureError);
            r rVar = r.this;
            String str = this.c;
            rVar.getClass();
            if (!inneractiveErrorCode.equals(InneractiveErrorCode.CONNECTION_ERROR) && !inneractiveErrorCode.equals(InneractiveErrorCode.NO_FILL)) {
                oVar = com.fyber.inneractive.sdk.network.o.FATAL_ADM_PARSING_ERROR;
            } else {
                oVar = com.fyber.inneractive.sdk.network.o.FATAL_ADM_MARKUP_FETCHING_ERROR;
            }
            if (eVar != null) {
                eVar.B = false;
            }
            String name = exc.getClass().getName();
            if (exc instanceof p0) {
                p0 p0Var = (p0) exc;
                name = "NetworkStackException";
            }
            q.a aVar = new q.a(oVar, (InneractiveAdRequest) null, eVar, (JSONArray) null);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("exception", name);
            } catch (Exception unused) {
                IAlog.e("Got exception adding param to json object: %s, %s", "exception", name);
            }
            String localizedMessage = exc.getLocalizedMessage();
            String str2 = exc;
            if (localizedMessage != null) {
                str2 = exc.getLocalizedMessage();
            }
            try {
                jSONObject.put("message", str2);
            } catch (Exception unused2) {
                IAlog.e("Got exception adding param to json object: %s, %s", "message", str2);
            }
            try {
                jSONObject.put("admPayload", str);
            } catch (Exception unused3) {
                IAlog.e("Got exception adding param to json object: %s, %s", "admPayload", str);
            }
            aVar.f.put(jSONObject);
            aVar.a((String) null);
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
            r.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            r.this.c();
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void onAdRefreshFailed(InneractiveAdSpot inneractiveAdSpot, InneractiveErrorCode inneractiveErrorCode);

        void onAdRefreshed(InneractiveAdSpot inneractiveAdSpot);
    }

    public r() {
        String uuid = UUID.randomUUID().toString();
        this.a = uuid;
        this.g = new HashSet();
        IAlog.a("%sInneractiveAdSpotImpl created with UID: %s", d(), uuid);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public void addUnitController(InneractiveUnitController inneractiveUnitController) {
        if (inneractiveUnitController != null) {
            c0 c0Var = (c0) inneractiveUnitController;
            c0Var.setAdSpot(this);
            if (this.g.size() > 0) {
                Iterator it = new HashSet(this.g).iterator();
                while (it.hasNext()) {
                    InneractiveUnitController inneractiveUnitController2 = (InneractiveUnitController) it.next();
                    if (inneractiveUnitController2.getClass().equals(inneractiveUnitController.getClass())) {
                        c0 c0Var2 = this.f;
                        if (c0Var2 != null && c0Var2.equals(inneractiveUnitController2)) {
                            this.f.destroy();
                            this.f = null;
                        }
                        this.g.remove(inneractiveUnitController2);
                    }
                }
            }
            this.g.add(c0Var);
            if (this.e != null) {
                e();
            }
        }
    }

    public final void b() {
        IAConfigManager iAConfigManager = IAConfigManager.M;
        com.fyber.inneractive.sdk.measurement.a aVar = iAConfigManager.J;
        if (aVar == null || !aVar.a) {
            IAlog.a("%sinitOmidSdk", IAlog.a(this));
            com.fyber.inneractive.sdk.util.m.a(new com.fyber.inneractive.sdk.config.n(iAConfigManager, com.fyber.inneractive.sdk.util.l.a));
        }
    }

    public final void c() {
        for (c0 c0Var : this.g) {
            c0Var.destroy();
        }
        this.g.clear();
        h hVar = this.h;
        if (hVar != null) {
            hVar.g();
            hVar.a(true);
            hVar.b();
            hVar.d = null;
            this.h = null;
        }
        this.b = null;
        a();
        InneractiveAdSpotManager.get().removeSpot(this);
    }

    public final String d() {
        return IAlog.a(this);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public void destroy() {
        if (Looper.myLooper() != null && Looper.getMainLooper() == Looper.myLooper()) {
            c();
        } else {
            com.fyber.inneractive.sdk.util.m.b.post(new b());
        }
    }

    public final boolean e() {
        for (c0 c0Var : this.g) {
            if (c0Var.supports(this)) {
                this.f = c0Var;
                return true;
            }
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public o getAdContent() {
        return this.e;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public InneractiveAdRequest getCurrentProcessedRequest() {
        return this.c;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public String getLocalUniqueId() {
        return this.a;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public InneractiveMediationName getMediationName() {
        return IAConfigManager.M.n;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public String getMediationNameString() {
        return IAConfigManager.M.m;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public String getMediationVersion() {
        return IAConfigManager.M.o;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public String getRequestedSpotId() {
        InneractiveAdRequest inneractiveAdRequest = this.c;
        return inneractiveAdRequest != null ? inneractiveAdRequest.getSpotId() : "";
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public InneractiveUnitController getSelectedUnitController() {
        return this.f;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public boolean isReady() {
        o oVar;
        o oVar2 = this.e;
        if (oVar2 == null) {
            return false;
        }
        boolean z = oVar2.d() != null && this.e.d().c();
        if (z && (oVar = this.e) != null) {
            com.fyber.inneractive.sdk.response.e d = oVar.d();
            if (!this.k && d != null) {
                long minutes = TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis() - d.c);
                long j = d.b;
                long j2 = minutes - j;
                IAlog.a(String.format("Firing Event 802 - AdExpired - time passed- %s, sessionTimeOut - %s", Long.valueOf(j2), Long.valueOf(j)), new Object[0]);
                q.a aVar = new q.a(com.fyber.inneractive.sdk.network.o.IA_AD_EXPIRED, oVar.a, d, oVar.c.c());
                JSONObject jSONObject = new JSONObject();
                Long valueOf = Long.valueOf(j2);
                try {
                    jSONObject.put("time_passed", valueOf);
                } catch (Exception unused) {
                    IAlog.e("Got exception adding param to json object: %s, %s", "time_passed", valueOf);
                }
                Long valueOf2 = Long.valueOf(j);
                try {
                    jSONObject.put("timeout", valueOf2);
                } catch (Exception unused2) {
                    IAlog.e("Got exception adding param to json object: %s, %s", "timeout", valueOf2);
                }
                aVar.f.put(jSONObject);
                aVar.a((String) null);
                this.k = true;
            }
        }
        return !z && this.e.g();
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public void loadAd(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        if (str != null && !TextUtils.isEmpty(str)) {
            if (!InneractiveAdManager.wasInitialized()) {
                InneractiveAdSpot.RequestListener requestListener = this.b;
                if (requestListener != null) {
                    requestListener.onInneractiveFailedAdRequest(this, InneractiveErrorCode.SDK_NOT_INITIALIZED);
                    return;
                }
                return;
            }
            com.fyber.inneractive.sdk.metrics.c.d.a(this.a).c();
            this.l = new j(this.a);
            if (this.d == null) {
                this.d = new s(this);
            }
            com.fyber.inneractive.sdk.bidder.adm.f fVar = new com.fyber.inneractive.sdk.bidder.adm.f(str, this.a);
            a aVar = new a(fVar, currentTimeMillis, str);
            b();
            com.fyber.inneractive.sdk.util.m.a(new com.fyber.inneractive.sdk.bidder.adm.b(fVar, aVar));
            return;
        }
        InneractiveAdSpot.RequestListener requestListener2 = this.b;
        if (requestListener2 != null) {
            requestListener2.onInneractiveFailedAdRequest(this, InneractiveErrorCode.INVALID_INPUT);
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public void removeUnitController(InneractiveUnitController inneractiveUnitController) {
        if (inneractiveUnitController != null) {
            c0 c0Var = this.f;
            if (c0Var != null && c0Var.equals(inneractiveUnitController)) {
                this.f.destroy();
                this.f = null;
            }
            this.g.remove(inneractiveUnitController);
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public void setMediationName(InneractiveMediationName inneractiveMediationName) {
        InneractiveAdManager.setMediationName(inneractiveMediationName);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public void setMediationVersion(String str) {
        InneractiveAdManager.setMediationVersion(str);
    }

    @Override // com.fyber.inneractive.sdk.flow.a0
    public void a(c cVar) {
        this.i = cVar;
        IAlog.a("%srequestAd called with request: %s", IAlog.a(this), null);
        if (this.c == null) {
            IAlog.b("%srequestAd called with a null request, but no previous request is available! Cannot continue", IAlog.a(this));
            InneractiveAdSpot.RequestListener requestListener = this.b;
            if (requestListener != null) {
                requestListener.onInneractiveFailedAdRequest(this, InneractiveErrorCode.INVALID_INPUT);
            }
        } else if (!InneractiveAdManager.wasInitialized()) {
            InneractiveAdSpot.RequestListener requestListener2 = this.b;
            if (requestListener2 != null) {
                requestListener2.onInneractiveFailedAdRequest(this, InneractiveErrorCode.SDK_NOT_INITIALIZED);
            }
        } else {
            InneractiveAdRequest inneractiveAdRequest = this.c;
            String str = this.a;
            inneractiveAdRequest.b = str;
            com.fyber.inneractive.sdk.metrics.c.d.a(str).c();
            if (this.g.isEmpty()) {
                IAlog.b("%srequestAd called but no AdUnitControllers exist! Cannot continue", IAlog.a(this));
                if (this.b != null) {
                    a(this.c, (com.fyber.inneractive.sdk.response.e) null);
                    this.b.onInneractiveFailedAdRequest(this, InneractiveErrorCode.INVALID_INPUT);
                    return;
                }
                return;
            }
            h hVar = this.h;
            if (hVar != null) {
                boolean z = this.c == null;
                hVar.g();
                hVar.a(z);
                hVar.b();
                hVar.d = null;
            }
            this.h = new h(this.a);
            if (this.d == null) {
                this.d = new s(this);
            }
            IAlog.a("%sFound ad source for request! %s", IAlog.a(this), this.h);
            b();
            h hVar2 = this.h;
            InneractiveAdRequest inneractiveAdRequest2 = this.c;
            i.b bVar = this.d;
            hVar2.e = inneractiveAdRequest2;
            hVar2.d = bVar;
            if (IAConfigManager.j()) {
                hVar2.h();
                return;
            }
            IAConfigManager.addListener(hVar2);
            IAConfigManager.a();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public void requestAd(InneractiveAdRequest inneractiveAdRequest) {
        boolean z;
        IAlog.a("%srequestAd called with request: %s", IAlog.a(this), inneractiveAdRequest);
        if (inneractiveAdRequest == null && this.c == null) {
            IAlog.b("%srequestAd called with a null request, but no previous request is available! Cannot continue", IAlog.a(this));
            InneractiveAdSpot.RequestListener requestListener = this.b;
            if (requestListener != null) {
                requestListener.onInneractiveFailedAdRequest(this, InneractiveErrorCode.INVALID_INPUT);
            }
        } else if (!InneractiveAdManager.wasInitialized()) {
            InneractiveAdSpot.RequestListener requestListener2 = this.b;
            if (requestListener2 != null) {
                requestListener2.onInneractiveFailedAdRequest(this, InneractiveErrorCode.SDK_NOT_INITIALIZED);
            }
        } else {
            InneractiveAdRequest inneractiveAdRequest2 = inneractiveAdRequest != null ? inneractiveAdRequest : this.c;
            String str = this.a;
            inneractiveAdRequest2.b = str;
            com.fyber.inneractive.sdk.metrics.c.d.a(str).c();
            if (this.g.isEmpty()) {
                IAlog.b("%srequestAd called but no AdUnitControllers exist! Cannot continue", IAlog.a(this));
                if (this.b != null) {
                    if (inneractiveAdRequest == null) {
                        inneractiveAdRequest = this.c;
                    }
                    a(inneractiveAdRequest, (com.fyber.inneractive.sdk.response.e) null);
                    this.b.onInneractiveFailedAdRequest(this, InneractiveErrorCode.INVALID_INPUT);
                    return;
                }
                return;
            }
            h hVar = this.h;
            if (hVar != null) {
                boolean z2 = inneractiveAdRequest != null || this.c == null;
                hVar.g();
                hVar.a(z2);
                hVar.b();
                hVar.d = null;
            }
            if (inneractiveAdRequest != null) {
                InneractiveAdRequest inneractiveAdRequest3 = this.c;
                if (inneractiveAdRequest3 != null) {
                    inneractiveAdRequest.setSelectedUnitConfig(inneractiveAdRequest3.getSelectedUnitConfig());
                }
                this.c = inneractiveAdRequest;
                o oVar = this.e;
                if (oVar != null) {
                    oVar.a();
                    this.j = true;
                }
                Iterator<c0> it = this.g.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    } else if (it.next() instanceof InneractiveFullscreenUnitController) {
                        z = true;
                        break;
                    }
                }
                if (!z) {
                    this.c.a = false;
                }
            }
            this.h = new h(this.a);
            if (this.d == null) {
                this.d = new s(this);
            }
            IAlog.a("%sFound ad source for request! %s", IAlog.a(this), this.h);
            b();
            h hVar2 = this.h;
            InneractiveAdRequest inneractiveAdRequest4 = this.c;
            i.b bVar = this.d;
            hVar2.e = inneractiveAdRequest4;
            hVar2.d = bVar;
            if (IAConfigManager.j()) {
                hVar2.h();
                return;
            }
            IAConfigManager.addListener(hVar2);
            IAConfigManager.a();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public void setMediationName(String str) {
        InneractiveAdManager.setMediationName(str);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public void setRequestListener(InneractiveAdSpot.RequestListener requestListener) {
        IAlog.a("%ssetRequestListener called with: %s", IAlog.a(this), requestListener);
        this.b = requestListener;
    }

    @Override // com.fyber.inneractive.sdk.flow.u
    public void a() {
        o oVar;
        o oVar2 = this.e;
        if (oVar2 != null) {
            if (oVar2.e() && (oVar = this.e) != null && !oVar.e) {
                com.fyber.inneractive.sdk.response.e d = oVar.d();
                com.fyber.inneractive.sdk.util.m.b.post(new t(this, Arrays.toString(Thread.currentThread().getStackTrace()), this.e.a, d));
            }
            this.e.a();
            this.e = null;
        }
        this.f = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.fyber.inneractive.sdk.external.InneractiveAdRequest r10, com.fyber.inneractive.sdk.response.e r11) {
        /*
            r9 = this;
            r0 = 0
            if (r10 == 0) goto L33
            com.fyber.inneractive.sdk.config.b0 r1 = r10.getSelectedUnitConfig()
            if (r1 == 0) goto L33
            com.fyber.inneractive.sdk.config.b0 r1 = r10.getSelectedUnitConfig()
            com.fyber.inneractive.sdk.config.a0 r1 = (com.fyber.inneractive.sdk.config.a0) r1
            com.fyber.inneractive.sdk.config.t r1 = r1.c
            if (r1 == 0) goto L1e
            com.fyber.inneractive.sdk.config.b0 r1 = r10.getSelectedUnitConfig()
            com.fyber.inneractive.sdk.config.a0 r1 = (com.fyber.inneractive.sdk.config.a0) r1
            com.fyber.inneractive.sdk.config.t r1 = r1.c
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = r1.b
            goto L34
        L1e:
            com.fyber.inneractive.sdk.config.b0 r1 = r10.getSelectedUnitConfig()
            com.fyber.inneractive.sdk.config.a0 r1 = (com.fyber.inneractive.sdk.config.a0) r1
            com.fyber.inneractive.sdk.config.c0 r1 = r1.f
            if (r1 == 0) goto L33
            com.fyber.inneractive.sdk.config.b0 r1 = r10.getSelectedUnitConfig()
            com.fyber.inneractive.sdk.config.a0 r1 = (com.fyber.inneractive.sdk.config.a0) r1
            com.fyber.inneractive.sdk.config.c0 r1 = r1.f
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = r1.j
            goto L34
        L33:
            r1 = r0
        L34:
            com.fyber.inneractive.sdk.flow.o r2 = r9.e
            if (r2 == 0) goto L3e
            T extends com.fyber.inneractive.sdk.response.e r2 = r2.b
            if (r2 == 0) goto L3e
            r4 = r2
            goto L3f
        L3e:
            r4 = r11
        L3f:
            java.lang.String r6 = r9.a
            if (r1 != 0) goto L47
            if (r4 == 0) goto L47
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = r4.n
        L47:
            r7 = r1
            com.fyber.inneractive.sdk.metrics.b r11 = new com.fyber.inneractive.sdk.metrics.b
            com.fyber.inneractive.sdk.flow.o r1 = r9.e
            if (r1 != 0) goto L4f
            goto L55
        L4f:
            com.fyber.inneractive.sdk.config.global.s r0 = r1.c
            org.json.JSONArray r0 = r0.c()
        L55:
            r8 = r0
            r3 = r11
            r5 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            r11.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.flow.r.a(com.fyber.inneractive.sdk.external.InneractiveAdRequest, com.fyber.inneractive.sdk.response.e):void");
    }
}
