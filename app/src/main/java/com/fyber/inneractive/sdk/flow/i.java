package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.factories.b;
import com.fyber.inneractive.sdk.flow.r;
import com.fyber.inneractive.sdk.interfaces.a;
import com.fyber.inneractive.sdk.network.n;
import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes.dex */
public abstract class i implements n.c, a.InterfaceC0019a {
    public com.fyber.inneractive.sdk.interfaces.a c;
    public b d;
    public InneractiveAdRequest e;
    public com.fyber.inneractive.sdk.config.global.s f;
    public com.fyber.inneractive.sdk.network.n g;
    public final String h;
    public long b = 0;
    public final Runnable a = new a();

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
            i.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            i.this.f();
        }
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    public i(String str) {
        this.h = str;
    }

    public void a(InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.e eVar) {
        com.fyber.inneractive.sdk.response.a a2 = com.fyber.inneractive.sdk.response.a.a(eVar.g);
        b.InterfaceC0016b interfaceC0016b = b.a.a.a.get(a2);
        com.fyber.inneractive.sdk.interfaces.a a3 = interfaceC0016b != null ? interfaceC0016b.a() : null;
        this.c = a3;
        if (a3 != null) {
            IAlog.d("%sonAdDataAvailable: found response loader: %s", d(), this.c);
            return;
        }
        IAlog.e("%sonAdDataAvailable: Cannot find content handler for ad type: %s", d(), a2);
        b bVar = this.d;
        if (bVar != null) {
            ((s) bVar).a(inneractiveAdRequest, eVar, new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, f.NO_CONTENT_LOADER_AVAILABLE));
        }
    }

    public void a(com.fyber.inneractive.sdk.response.e eVar, InneractiveAdRequest inneractiveAdRequest) {
    }

    public void b() {
        if (this.b > 0) {
            IAlog.a("%scancel in flight timeout after %d millis", d(), Long.valueOf(System.currentTimeMillis() - this.b));
            com.fyber.inneractive.sdk.util.m.b.removeCallbacks(this.a);
            this.b = 0L;
        }
    }

    public com.fyber.inneractive.sdk.response.e c() {
        com.fyber.inneractive.sdk.interfaces.a aVar = this.c;
        if (aVar != null) {
            g gVar = (g) aVar;
            if (gVar.c != 0) {
                return gVar.c.d();
            }
            return null;
        }
        return null;
    }

    public String d() {
        return IAlog.a(this);
    }

    public void e() {
    }

    public void f() {
        IAlog.a("%sin flight timeout reached after %d millis", d(), Long.valueOf(System.currentTimeMillis() - this.b));
        a(true);
    }

    public void b(InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.e eVar, InneractiveInfrastructureError inneractiveInfrastructureError) {
        b();
        if (IAlog.a <= 3) {
            Thread.dumpStack();
        }
        IAlog.d("%sgot onAdRequestFailed! with: %s", d(), inneractiveInfrastructureError.getErrorCode());
        if (this.d != null) {
            if (eVar != null && eVar.i != null) {
                inneractiveInfrastructureError.setCause(new Exception(eVar.i + ": " + eVar.j));
            }
            ((s) this.d).a(inneractiveAdRequest, eVar, inneractiveInfrastructureError);
        }
    }

    public void a(InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.e eVar, com.fyber.inneractive.sdk.config.global.s sVar, i iVar) {
        ((g) this.c).a(inneractiveAdRequest, eVar, sVar, this);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.a.InterfaceC0019a
    public void a() {
        T t;
        c0 c0Var;
        b();
        IAlog.d("%sgot onAdLoaded!", d());
        com.fyber.inneractive.sdk.interfaces.a aVar = this.c;
        if (aVar != null) {
            b bVar = this.d;
            if (bVar != null) {
                InneractiveAdRequest inneractiveAdRequest = this.e;
                Content content = ((g) aVar).c;
                s sVar = (s) bVar;
                r rVar = sVar.a;
                if (rVar.j || (c0Var = rVar.f) == null || !c0Var.supportsRefresh()) {
                    sVar.a.j = false;
                    r rVar2 = sVar.a;
                    rVar2.e = content;
                    content.a = inneractiveAdRequest;
                    if (!rVar2.e()) {
                        r rVar3 = sVar.a;
                        rVar3.getClass();
                        IAlog.a("%sCannot find appropriate unit controller for unit: %s", IAlog.a(rVar3), sVar.a.e.d);
                        h hVar = sVar.a.h;
                        com.fyber.inneractive.sdk.response.e c = hVar != null ? hVar.c() : null;
                        InneractiveErrorCode inneractiveErrorCode = InneractiveErrorCode.INVALID_INPUT;
                        f fVar = f.COULD_NOT_SELECT_UNIT_CONTROLLER;
                        sVar.a(inneractiveAdRequest, c, new InneractiveInfrastructureError(inneractiveErrorCode, fVar, new Exception("Cannot find appropriate unit controller for unit: " + sVar.a.e.d)));
                        sVar.a.e = null;
                    } else {
                        r rVar4 = sVar.a;
                        InneractiveAdSpot.RequestListener requestListener = rVar4.b;
                        if (requestListener != null) {
                            requestListener.onInneractiveSuccessfulAdRequest(rVar4);
                        }
                    }
                } else if (sVar.a.f.canRefreshAd()) {
                    r rVar5 = sVar.a;
                    rVar5.e = content;
                    content.a = inneractiveAdRequest;
                    r.c cVar = rVar5.i;
                    if (cVar != null) {
                        cVar.onAdRefreshed(rVar5);
                    } else {
                        c0 c0Var2 = rVar5.f;
                        if (c0Var2 instanceof InneractiveAdViewUnitController) {
                            ((InneractiveAdViewUnitController) c0Var2).onAdRefreshed(rVar5);
                        }
                    }
                } else {
                    r rVar6 = sVar.a;
                    rVar6.getClass();
                    IAlog.a("%sad loaded successfully, but the selected unit controller has rejected the refresh!", IAlog.a(rVar6));
                    r rVar7 = sVar.a;
                    rVar7.i.onAdRefreshFailed(rVar7, InneractiveErrorCode.CANCELLED);
                }
                String str = sVar.a.a;
                com.fyber.inneractive.sdk.metrics.c cVar2 = com.fyber.inneractive.sdk.metrics.c.d;
                cVar2.a(str).e();
                cVar2.a(str).b();
                r rVar8 = sVar.a;
                o oVar = rVar8.e;
                if (oVar != null && (t = oVar.b) != 0 && t.n != null) {
                    o oVar2 = rVar8.e;
                    T t2 = oVar2.b;
                    new com.fyber.inneractive.sdk.metrics.b(t2, rVar8.c, rVar8.a, t2.n, oVar2.c.c()).a();
                }
            }
            this.c = null;
        }
        e();
    }

    @Override // com.fyber.inneractive.sdk.interfaces.a.InterfaceC0019a
    public void a(InneractiveInfrastructureError inneractiveInfrastructureError) {
        IAlog.d("%sgot onFailedLoading! with: %s", d(), inneractiveInfrastructureError);
        a(this.e, c(), inneractiveInfrastructureError);
    }

    public void a(InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.e eVar, InneractiveInfrastructureError inneractiveInfrastructureError) {
        b();
        IAlog.d("%sgot handleFailedLoading! with: %s", d(), inneractiveInfrastructureError);
        b bVar = this.d;
        if (bVar != null) {
            ((s) bVar).a(inneractiveAdRequest, eVar, inneractiveInfrastructureError);
        }
        a(eVar, inneractiveAdRequest);
    }

    public void a(boolean z) {
        com.fyber.inneractive.sdk.interfaces.a aVar = this.c;
        if (aVar == null || !z) {
            return;
        }
        aVar.a();
        this.c = null;
    }
}
