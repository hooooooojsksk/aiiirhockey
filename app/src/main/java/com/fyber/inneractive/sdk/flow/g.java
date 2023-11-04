package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveError;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.flow.o;
import com.fyber.inneractive.sdk.interfaces.a;
import com.fyber.inneractive.sdk.response.e;
import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes.dex */
public abstract class g<Response extends com.fyber.inneractive.sdk.response.e, Content extends o> implements com.fyber.inneractive.sdk.interfaces.a {
    public InneractiveAdRequest a;
    public Response b;
    public Content c;
    public a.InterfaceC0019a d;
    public com.fyber.inneractive.sdk.config.b0 e;
    public com.fyber.inneractive.sdk.config.global.s f;
    public boolean g = false;

    @Override // com.fyber.inneractive.sdk.interfaces.a
    public void a() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
    }

    public abstract String b();

    public com.fyber.inneractive.sdk.config.b0 c() {
        InneractiveAdRequest inneractiveAdRequest = this.a;
        return inneractiveAdRequest == null ? this.e : inneractiveAdRequest.getSelectedUnitConfig();
    }

    public void d() {
        String str;
        InneractiveAdRequest inneractiveAdRequest = this.a;
        if (inneractiveAdRequest != null) {
            str = inneractiveAdRequest.b;
            com.fyber.inneractive.sdk.metrics.c.d.a(str).i();
        } else {
            Response response = this.b;
            if (response == null || (str = response.z) == null) {
                str = null;
            } else {
                com.fyber.inneractive.sdk.metrics.c.d.a(str).i();
            }
        }
        Content content = this.c;
        if (content != null) {
            content.a(str);
        }
        a.InterfaceC0019a interfaceC0019a = this.d;
        if (interfaceC0019a != null) {
            interfaceC0019a.a();
        }
    }

    public abstract void e();

    /* JADX WARN: Multi-variable type inference failed */
    public void a(InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.e eVar, com.fyber.inneractive.sdk.config.global.s sVar, a.InterfaceC0019a interfaceC0019a) {
        this.a = inneractiveAdRequest;
        this.b = eVar;
        this.d = interfaceC0019a;
        this.f = sVar;
        if (inneractiveAdRequest == null) {
            this.e = com.fyber.inneractive.sdk.config.a.b(eVar.m);
        }
        try {
            e();
        } catch (Throwable th) {
            IAlog.e("Failed to start ContentLoader", IAlog.a(this));
            com.fyber.inneractive.sdk.network.r.a(th, inneractiveAdRequest, eVar);
            a(new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, f.CONTENT_LOADER_START_FAILED));
        }
    }

    public void a(InneractiveError inneractiveError) {
        com.fyber.inneractive.sdk.util.m.a(new b(new c(this.b, this.a, b(), this.f.c()), inneractiveError));
    }

    public void a(InneractiveInfrastructureError inneractiveInfrastructureError) {
        if (this.d != null) {
            InneractiveAdRequest inneractiveAdRequest = this.a;
            Response response = this.b;
            com.fyber.inneractive.sdk.config.global.s sVar = this.f;
            a.a(inneractiveAdRequest, inneractiveInfrastructureError, this.c, response, sVar == null ? null : sVar.c());
            this.d.a(inneractiveInfrastructureError);
        }
    }
}
