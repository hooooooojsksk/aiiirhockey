package com.fyber.inneractive.sdk.measurement;

import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.fyber.inneractive.sdk.flow.d0;
import com.fyber.inneractive.sdk.network.r;
import com.fyber.inneractive.sdk.util.IAlog;
import com.iab.omid.library.fyber.adsession.AdEvents;
import com.iab.omid.library.fyber.adsession.AdSession;
import com.iab.omid.library.fyber.adsession.VerificationScriptResource;
import com.iab.omid.library.fyber.adsession.media.MediaEvents;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class d {
    public AdSession a;
    public AdEvents b;
    public MediaEvents c;
    public d0 f;
    public boolean d = false;
    public boolean e = false;
    public WebViewClient g = new a();

    /* loaded from: classes.dex */
    public class a extends WebViewClient {
        public a() {
            d.this = r1;
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            d.this.a();
            return true;
        }
    }

    public final void a(Throwable th) {
        String simpleName = th.getClass().getSimpleName();
        String format = String.format("%s - %s", "OpenMeasurementNativeVideoTracker", th.getMessage());
        d0 d0Var = this.f;
        r.a(simpleName, format, d0Var != null ? d0Var.a : null, d0Var != null ? (com.fyber.inneractive.sdk.response.g) d0Var.b : null);
    }

    public final List<VerificationScriptResource> a(List<f> list) {
        VerificationScriptResource createVerificationScriptResourceWithoutParameters;
        ArrayList arrayList = new ArrayList();
        for (f fVar : list) {
            VerificationScriptResource verificationScriptResource = null;
            try {
                if (fVar.a != null) {
                    if (!TextUtils.isEmpty(fVar.e) && !TextUtils.isEmpty(fVar.d)) {
                        createVerificationScriptResourceWithoutParameters = VerificationScriptResource.createVerificationScriptResourceWithParameters(fVar.e, fVar.a, fVar.d);
                    } else {
                        createVerificationScriptResourceWithoutParameters = VerificationScriptResource.createVerificationScriptResourceWithoutParameters(fVar.a);
                    }
                    verificationScriptResource = createVerificationScriptResourceWithoutParameters;
                }
            } catch (Throwable th) {
                a(th);
            }
            if (verificationScriptResource != null) {
                arrayList.add(verificationScriptResource);
            }
        }
        return arrayList;
    }

    public void a() {
        if (this.a != null) {
            IAlog.a("%s destroy", "OMVideo");
            try {
                this.a.finish();
            } catch (Throwable th) {
                a(th);
            }
        }
        this.b = null;
        this.a = null;
        this.c = null;
    }
}
