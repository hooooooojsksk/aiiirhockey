package com.fyber.marketplace.fairbid.impl;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.external.InneractiveMediationName;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.flow.a0;
import com.fyber.inneractive.sdk.flow.o;
import com.fyber.inneractive.sdk.flow.r;
import com.fyber.inneractive.sdk.flow.u;
import com.fyber.inneractive.sdk.network.q;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e implements u, a0 {
    public InneractiveUnitController<?> a;
    public o b;
    public boolean d = false;
    public final String c = UUID.randomUUID().toString();

    public e(InneractiveUnitController<?> inneractiveUnitController, o oVar) {
        this.a = inneractiveUnitController;
        this.b = oVar;
    }

    @Override // com.fyber.inneractive.sdk.flow.u
    public void a() {
        o oVar = this.b;
        if (oVar != null) {
            oVar.a();
        }
        this.b = null;
        this.a = null;
        InneractiveAdSpotManager.get().removeSpot(this);
    }

    @Override // com.fyber.inneractive.sdk.flow.a0
    public void a(r.c cVar) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public void addUnitController(InneractiveUnitController inneractiveUnitController) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public void destroy() {
        InneractiveUnitController<?> inneractiveUnitController = this.a;
        if (inneractiveUnitController != null) {
            inneractiveUnitController.destroy();
        }
        a();
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public o getAdContent() {
        return this.b;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public InneractiveAdRequest getCurrentProcessedRequest() {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public String getLocalUniqueId() {
        return this.c;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public InneractiveMediationName getMediationName() {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public String getMediationNameString() {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public String getMediationVersion() {
        return "";
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public String getRequestedSpotId() {
        return "";
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public InneractiveUnitController getSelectedUnitController() {
        return this.a;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public boolean isReady() {
        o oVar = this.b;
        if (oVar == null) {
            return false;
        }
        boolean z = oVar.d() != null && this.b.d().c();
        if (z) {
            o oVar2 = this.b;
            com.fyber.inneractive.sdk.response.e d = oVar2.d();
            if (!this.d && d != null && d.c != 0 && d.c()) {
                long minutes = TimeUnit.MILLISECONDS.toMinutes(d.a - System.currentTimeMillis());
                long j = d.b;
                IAlog.a(String.format("Firing Event 802 - AdExpired - time passed- %s, sessionTimeOut - %s", Long.valueOf(minutes), Long.valueOf(j)), new Object[0]);
                q.a aVar = new q.a(com.fyber.inneractive.sdk.network.o.IA_AD_EXPIRED, oVar2.a, d, oVar2.c.c());
                JSONObject jSONObject = new JSONObject();
                Long valueOf = Long.valueOf(minutes);
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
                this.d = true;
            }
        }
        return !z;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public void loadAd(String str) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public void removeUnitController(InneractiveUnitController inneractiveUnitController) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public void requestAd(InneractiveAdRequest inneractiveAdRequest) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public void setMediationName(InneractiveMediationName inneractiveMediationName) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public void setMediationName(String str) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public void setMediationVersion(String str) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public void setRequestListener(InneractiveAdSpot.RequestListener requestListener) {
    }
}
