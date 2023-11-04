package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.flow.i;
import com.fyber.inneractive.sdk.flow.r;

/* loaded from: classes.dex */
public class s implements i.b {
    public final /* synthetic */ r a;

    public s(r rVar) {
        this.a = rVar;
    }

    public void a(InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.e eVar, InneractiveInfrastructureError inneractiveInfrastructureError) {
        if (this.a.b != null) {
            if (inneractiveInfrastructureError.getErrorCode().shouldSendTimeMetric()) {
                this.a.a(inneractiveAdRequest, eVar);
            }
            r rVar = this.a;
            if (rVar.j) {
                if (eVar == null) {
                    a.a(inneractiveAdRequest, inneractiveInfrastructureError, rVar.e, null, com.fyber.inneractive.sdk.config.global.s.a(rVar.h, rVar.e));
                }
                r rVar2 = this.a;
                rVar2.b.onInneractiveFailedAdRequest(rVar2, inneractiveInfrastructureError.getErrorCode());
                return;
            }
            r.c cVar = rVar.i;
            if (cVar != null) {
                cVar.onAdRefreshFailed(rVar, inneractiveInfrastructureError.getErrorCode());
            }
        }
    }
}
