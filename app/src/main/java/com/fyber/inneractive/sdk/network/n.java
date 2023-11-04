package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.network.a0;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.FileNotFoundException;

/* loaded from: classes.dex */
public class n {
    public InneractiveAdRequest a;
    public com.fyber.inneractive.sdk.config.global.s b;
    public c c;
    public final String d;
    public volatile boolean e = false;
    public final b0 f;

    /* loaded from: classes.dex */
    public class a implements u<com.fyber.inneractive.sdk.response.e> {
        public a() {
            n.this = r1;
        }

        @Override // com.fyber.inneractive.sdk.network.u
        public void a(com.fyber.inneractive.sdk.response.e eVar, Exception exc, boolean z) {
            InneractiveErrorCode inneractiveErrorCode;
            com.fyber.inneractive.sdk.response.e eVar2 = eVar;
            if (exc == null) {
                n.this.a(eVar2);
                return;
            }
            n.this.getClass();
            if (exc instanceof p0) {
                if (((p0) exc).a == 204) {
                    inneractiveErrorCode = InneractiveErrorCode.NO_FILL;
                } else {
                    inneractiveErrorCode = InneractiveErrorCode.SERVER_INTERNAL_ERROR;
                }
            } else if (exc instanceof FileNotFoundException) {
                inneractiveErrorCode = InneractiveErrorCode.CONNECTION_ERROR;
            } else if (exc instanceof y) {
                inneractiveErrorCode = InneractiveErrorCode.SERVER_INVALID_RESPONSE;
            } else {
                inneractiveErrorCode = InneractiveErrorCode.CONNECTION_ERROR;
            }
            n nVar = n.this;
            InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(inneractiveErrorCode, com.fyber.inneractive.sdk.flow.f.NETWORK_ERROR, exc);
            if (nVar.c == null) {
                return;
            }
            if (nVar.e) {
                IAlog.d("IARemoteAdFetcher: ignoring response. Previous request was cancelled", new Object[0]);
            } else {
                nVar.a(inneractiveInfrastructureError, eVar2);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements a0.a {
        public b() {
            n.this = r1;
        }

        @Override // com.fyber.inneractive.sdk.network.a0.a
        public void a(String str) {
            str.getClass();
            str.hashCode();
            char c = 65535;
            switch (str.hashCode()) {
                case -1392135285:
                    if (str.equals("sdkInitNetworkRequest")) {
                        c = 0;
                        break;
                    }
                    break;
                case 740780854:
                    if (str.equals("sdkGotServerResponse")) {
                        c = 1;
                        break;
                    }
                    break;
                case 1745989196:
                    if (str.equals("sdkParsedResponse")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    com.fyber.inneractive.sdk.metrics.c.d.a(n.this.d).f();
                    return;
                case 1:
                    com.fyber.inneractive.sdk.metrics.c.d.a(n.this.d).g();
                    return;
                case 2:
                    com.fyber.inneractive.sdk.metrics.c.d.a(n.this.d).d();
                    return;
                default:
                    return;
            }
        }
    }

    /* loaded from: classes.dex */
    public interface c {
    }

    public n(InneractiveAdRequest inneractiveAdRequest, String str, com.fyber.inneractive.sdk.config.global.s sVar, c cVar) {
        this.a = inneractiveAdRequest;
        this.d = str;
        this.c = cVar;
        this.b = sVar;
        this.f = new b0(new a(), inneractiveAdRequest, sVar);
        a();
    }

    public void a() {
        this.f.d = new b();
    }

    public void a(InneractiveInfrastructureError inneractiveInfrastructureError, com.fyber.inneractive.sdk.response.e eVar) {
        c cVar;
        if (this.e || (cVar = this.c) == null) {
            return;
        }
        ((com.fyber.inneractive.sdk.flow.i) cVar).b(this.a, eVar, inneractiveInfrastructureError);
    }

    public void a(com.fyber.inneractive.sdk.response.e eVar) {
        InneractiveErrorCode a2;
        if (this.c == null) {
            return;
        }
        if (this.e) {
            IAlog.d("IARemoteAdFetcher: ignoring response. Previous request was cancelled", new Object[0]);
            return;
        }
        com.fyber.inneractive.sdk.config.a0 b2 = com.fyber.inneractive.sdk.config.a.b(eVar.m);
        InneractiveAdRequest inneractiveAdRequest = this.a;
        if (inneractiveAdRequest != null) {
            inneractiveAdRequest.setSelectedUnitConfig(b2);
        }
        com.fyber.inneractive.sdk.config.global.e eVar2 = new com.fyber.inneractive.sdk.config.global.e();
        ImpressionData impressionData = eVar.r;
        eVar2.a = impressionData != null ? impressionData.getDemandId() : null;
        try {
            eVar2.b = Long.valueOf(IAConfigManager.M.d);
        } catch (NumberFormatException unused) {
            IAlog.a("invalid publisherId", new Object[0]);
        }
        com.fyber.inneractive.sdk.config.global.s sVar = this.b;
        if (sVar != null) {
            sVar.a(eVar2);
        }
        if (b2 == null) {
            a2 = InneractiveErrorCode.ERROR_CONFIGURATION_MISMATCH;
        } else {
            a2 = eVar.a(this.a, this.b);
        }
        if (a2 == null) {
            c cVar = this.c;
            InneractiveAdRequest inneractiveAdRequest2 = this.a;
            com.fyber.inneractive.sdk.flow.i iVar = (com.fyber.inneractive.sdk.flow.i) cVar;
            com.fyber.inneractive.sdk.config.global.s sVar2 = iVar.f;
            IAlog.d("%sonAdDataAvailable: got response data: %s", iVar.d(), eVar);
            IAConfigManager iAConfigManager = IAConfigManager.M;
            if (iAConfigManager.E != null && eVar.b()) {
                iAConfigManager.E.a((com.fyber.inneractive.sdk.ignite.h) null);
            }
            iVar.a(inneractiveAdRequest2, eVar);
            iVar.a(inneractiveAdRequest2, eVar, sVar2, iVar);
            return;
        }
        com.fyber.inneractive.sdk.flow.f fVar = com.fyber.inneractive.sdk.flow.f.CONTENT_ERROR_UNSPECIFIED;
        if (b2 == null || a2 == InneractiveErrorCode.ERROR_CONFIGURATION_MISMATCH) {
            fVar = com.fyber.inneractive.sdk.flow.f.NO_APP_CONFIG_AVAILABLE;
            IAlog.b("%sGot configuration mismatch!", IAlog.a(this));
            IAConfigManager.a();
        }
        InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(a2, fVar);
        Exception exc = eVar.x;
        if (exc != null) {
            inneractiveInfrastructureError.setCause(exc);
        }
        com.fyber.inneractive.sdk.response.a a3 = com.fyber.inneractive.sdk.response.a.a(eVar.g);
        if (a3 != null) {
            Exception exc2 = eVar.x;
            if (exc2 != null) {
                inneractiveInfrastructureError.setCause(exc2);
            }
            com.fyber.inneractive.sdk.util.m.a(new com.fyber.inneractive.sdk.flow.b(new com.fyber.inneractive.sdk.flow.c(eVar, this.a, a3 == com.fyber.inneractive.sdk.response.a.RETURNED_ADTYPE_HTML ? "send_failed_display_creatives" : "send_failed_vast_creatives", this.b.c()), inneractiveInfrastructureError));
        }
        InneractiveAdRequest inneractiveAdRequest3 = this.a;
        com.fyber.inneractive.sdk.config.global.s sVar3 = this.b;
        if (sVar3 == null) {
            InneractiveAdSpot spot = InneractiveAdSpotManager.get().getSpot(this.d);
            sVar3 = (spot == null || spot.getAdContent() == null) ? null : spot.getAdContent().c;
        }
        com.fyber.inneractive.sdk.flow.a.a(inneractiveAdRequest3, inneractiveInfrastructureError, null, eVar, sVar3 != null ? sVar3.c() : null);
        a(inneractiveInfrastructureError, eVar);
    }
}
