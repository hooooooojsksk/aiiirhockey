package com.fyber.inneractive.sdk.measurement.tracker;

import android.webkit.WebView;
import com.fyber.inneractive.sdk.flow.o;
import com.iab.omid.library.fyber.adsession.AdSessionConfiguration;
import com.iab.omid.library.fyber.adsession.CreativeType;
import com.iab.omid.library.fyber.adsession.ImpressionType;
import com.iab.omid.library.fyber.adsession.Owner;
import com.iab.omid.library.fyber.adsession.Partner;

/* loaded from: classes.dex */
public class b extends c {
    public b(Partner partner, WebView webView, o oVar) {
        super(partner, webView, oVar);
    }

    @Override // com.fyber.inneractive.sdk.measurement.tracker.c
    public void a(WebView webView) {
        super.a(webView);
        webView.loadUrl("javascript:FyberMraidVideoTracker.initOmid(\"" + this.e.getName() + "\",\"" + this.e.getVersion() + "\");");
    }

    @Override // com.fyber.inneractive.sdk.measurement.a.InterfaceC0020a
    public void b() {
        this.f.loadUrl("javascript:FyberMraidVideoTracker.adUserInteraction();");
    }

    @Override // com.fyber.inneractive.sdk.measurement.tracker.c
    public AdSessionConfiguration c() {
        try {
            CreativeType creativeType = CreativeType.DEFINED_BY_JAVASCRIPT;
            ImpressionType impressionType = ImpressionType.DEFINED_BY_JAVASCRIPT;
            Owner owner = Owner.JAVASCRIPT;
            return AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, owner, false);
        } catch (Throwable th) {
            a(th);
            return null;
        }
    }

    @Override // com.fyber.inneractive.sdk.measurement.a.InterfaceC0020a
    public void a() {
        if (this.d || this.a == null) {
            return;
        }
        this.d = true;
        this.f.loadUrl("javascript:FyberMraidVideoTracker.impression();");
    }
}
