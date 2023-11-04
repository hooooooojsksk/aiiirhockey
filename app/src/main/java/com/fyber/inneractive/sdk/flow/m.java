package com.fyber.inneractive.sdk.flow;

import android.webkit.WebView;
import com.fyber.inneractive.sdk.external.InneractiveError;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.player.a;
import com.fyber.inneractive.sdk.player.h;
import com.fyber.inneractive.sdk.util.IAlog;
import com.iab.omid.library.fyber.adsession.AdEvents;
import com.iab.omid.library.fyber.adsession.AdSession;
import com.iab.omid.library.fyber.adsession.AdSessionConfiguration;
import com.iab.omid.library.fyber.adsession.AdSessionContext;
import com.iab.omid.library.fyber.adsession.CreativeType;
import com.iab.omid.library.fyber.adsession.ImpressionType;
import com.iab.omid.library.fyber.adsession.Owner;
import com.iab.omid.library.fyber.adsession.VerificationScriptResource;
import com.iab.omid.library.fyber.adsession.media.MediaEvents;
import com.iab.omid.library.fyber.publisher.AdSessionStatePublisher;
import java.util.List;

/* loaded from: classes.dex */
public class m extends g<com.fyber.inneractive.sdk.response.g, d0> implements h.b {
    public com.fyber.inneractive.sdk.player.h h;

    public m(String str) {
    }

    @Override // com.fyber.inneractive.sdk.flow.g, com.fyber.inneractive.sdk.interfaces.a
    public void a() {
        this.h.a();
    }

    @Override // com.fyber.inneractive.sdk.flow.g
    public String b() {
        return "send_failed_vast_creatives";
    }

    @Override // com.fyber.inneractive.sdk.flow.g
    public void d() {
        super.d();
    }

    @Override // com.fyber.inneractive.sdk.flow.g
    public void e() {
        com.fyber.inneractive.sdk.model.vast.b bVar;
        com.fyber.inneractive.sdk.model.vast.b bVar2;
        IAlog.a(IAlog.a(this) + "start called", new Object[0]);
        com.fyber.inneractive.sdk.config.b0 c = c();
        Response response = this.b;
        AdSessionContext adSessionContext = null;
        com.fyber.inneractive.sdk.model.vast.b bVar3 = response == 0 ? null : ((com.fyber.inneractive.sdk.response.g) response).J;
        if (bVar3 != null && bVar3.d.size() < bVar3.i) {
            bVar3.d.clear();
            bVar3.g.clear();
            bVar3.d.addAll(bVar3.k);
            bVar3.g.addAll(bVar3.l);
        }
        d0 d0Var = new d0(c, this.f, (com.fyber.inneractive.sdk.response.g) this.b, this.a);
        this.c = d0Var;
        com.fyber.inneractive.sdk.response.g gVar = (com.fyber.inneractive.sdk.response.g) this.b;
        com.fyber.inneractive.sdk.player.h hVar = new com.fyber.inneractive.sdk.player.h(gVar, this.a, d0Var, this);
        this.h = hVar;
        d0 d0Var2 = (d0) this.c;
        d0Var2.i = hVar;
        d0Var2.f = this.g;
        hVar.e = null;
        if (gVar != null && (bVar2 = gVar.J) != null) {
            hVar.e = bVar2.d.poll();
        }
        if (hVar.e == null) {
            hVar.b();
            h.b bVar4 = hVar.d;
            InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, f.VAST_NO_MEDIA_FILES);
            m mVar = (m) bVar4;
            mVar.a((InneractiveError) inneractiveInfrastructureError);
            mVar.a(inneractiveInfrastructureError);
            return;
        }
        hVar.e();
        a.InterfaceC0024a interfaceC0024a = hVar.f;
        if (interfaceC0024a != null) {
            com.fyber.inneractive.sdk.player.e eVar = (com.fyber.inneractive.sdk.player.e) interfaceC0024a;
            if (eVar.h != null) {
                com.fyber.inneractive.sdk.measurement.d dVar = new com.fyber.inneractive.sdk.measurement.d();
                com.fyber.inneractive.sdk.measurement.a aVar = eVar.h;
                List<com.fyber.inneractive.sdk.measurement.f> list = eVar.x.e;
                d0 d0Var3 = eVar.f;
                try {
                    CreativeType creativeType = CreativeType.VIDEO;
                    ImpressionType impressionType = ImpressionType.UNSPECIFIED;
                    Owner owner = Owner.NATIVE;
                    AdSessionConfiguration createAdSessionConfiguration = AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, owner, false);
                    List<VerificationScriptResource> a = dVar.a(list);
                    if (((com.fyber.inneractive.sdk.measurement.b) aVar).e != null && ((com.fyber.inneractive.sdk.measurement.b) aVar).b != null) {
                        adSessionContext = AdSessionContext.createNativeAdSessionContext(((com.fyber.inneractive.sdk.measurement.b) aVar).e, ((com.fyber.inneractive.sdk.measurement.b) aVar).b, a, "", "");
                    }
                    AdSession createAdSession = AdSession.createAdSession(createAdSessionConfiguration, adSessionContext);
                    dVar.a = createAdSession;
                    AdSessionStatePublisher adSessionStatePublisher = createAdSession.getAdSessionStatePublisher();
                    if (adSessionStatePublisher != null) {
                        adSessionStatePublisher.getWebView();
                        WebView webView = adSessionStatePublisher.getWebView();
                        if (webView != null) {
                            webView.setWebViewClient(dVar.g);
                        }
                    }
                    dVar.b = AdEvents.createAdEvents(dVar.a);
                    dVar.c = MediaEvents.createMediaEvents(dVar.a);
                    dVar.a.start();
                    dVar.f = d0Var3;
                    eVar.i = dVar;
                    eVar.j = new com.fyber.inneractive.sdk.player.f(dVar);
                }
            }
            if (eVar.i == null && (bVar = eVar.x) != null) {
                for (com.fyber.inneractive.sdk.measurement.f fVar : bVar.e) {
                    com.fyber.inneractive.sdk.measurement.g gVar2 = com.fyber.inneractive.sdk.measurement.g.ERROR_DURING_RESOURCE_LOAD;
                    com.fyber.inneractive.sdk.model.vast.s sVar = com.fyber.inneractive.sdk.model.vast.s.EVENT_VERIFICATION_NOT_EXECUTED;
                    com.fyber.inneractive.sdk.player.e.a(new com.fyber.inneractive.sdk.measurement.e(fVar, fVar.a(sVar), gVar2), sVar);
                }
            }
        }
        hVar.d();
    }
}
