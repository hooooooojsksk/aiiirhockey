package com.fyber.inneractive.sdk.renderers;

import android.content.Context;
import android.os.Build;
import com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.WebViewRendererProcessHasGoneError;
import com.fyber.inneractive.sdk.flow.z;
import com.fyber.inneractive.sdk.interfaces.c;
import com.fyber.inneractive.sdk.mraid.b0;
import com.fyber.inneractive.sdk.network.g0;
import com.fyber.inneractive.sdk.network.s;
import com.fyber.inneractive.sdk.ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.k0;
import com.fyber.inneractive.sdk.util.x;
import com.fyber.inneractive.sdk.web.b;
import com.fyber.inneractive.sdk.web.i;

/* loaded from: classes.dex */
public class l implements i.k {
    public final /* synthetic */ k a;

    public l(k kVar) {
        this.a = kVar;
    }

    @Override // com.fyber.inneractive.sdk.web.i.f
    public void a(com.fyber.inneractive.sdk.web.i iVar) {
        k kVar = this.a;
        kVar.getClass();
        IAlog.a("%sweb view callback: onExpand", IAlog.a(kVar));
        this.a.D = true;
        this.a.S();
    }

    @Override // com.fyber.inneractive.sdk.web.i.f
    public void b(com.fyber.inneractive.sdk.web.i iVar) {
        k kVar = this.a;
        kVar.getClass();
        IAlog.a("%sweb view callback: onResize", IAlog.a(kVar));
    }

    @Override // com.fyber.inneractive.sdk.web.i.f
    public void c() {
        this.a.D();
    }

    @Override // com.fyber.inneractive.sdk.web.d0
    public void b() {
        this.a.a(new WebViewRendererProcessHasGoneError());
        this.a.destroy();
    }

    @Override // com.fyber.inneractive.sdk.web.i.f
    public void a(com.fyber.inneractive.sdk.web.i iVar, b0 b0Var) {
        k kVar = this.a;
        kVar.getClass();
        IAlog.a("%sweb view callback: onClose", IAlog.a(kVar));
        k kVar2 = this.a;
        if (kVar2.D) {
            kVar2.D = false;
            this.a.S();
            return;
        }
        if (kVar2.G == UnitDisplayType.REWARDED) {
            kVar2.R();
        }
        c.a aVar = this.a.l;
        if (aVar != null) {
            aVar.dismissAd(true);
        }
    }

    @Override // com.fyber.inneractive.sdk.web.d0
    public x.a a(String str, k0 k0Var, b.a aVar) {
        com.fyber.inneractive.sdk.cache.session.enums.b bVar;
        k kVar = this.a;
        kVar.getClass();
        IAlog.a("%sweb view callback: onClicked", IAlog.a(kVar));
        Context context = com.fyber.inneractive.sdk.util.l.a;
        c.a aVar2 = this.a.l;
        if (aVar2 != null && aVar2.getLayout() != null && this.a.l.getLayout().getContext() != null) {
            context = this.a.l.getLayout().getContext();
        }
        if (context != null) {
            k kVar2 = this.a;
            if (kVar2.g) {
                AdContent adcontent = kVar2.b;
                com.fyber.inneractive.sdk.response.f fVar = adcontent == 0 ? null : (com.fyber.inneractive.sdk.response.f) ((z) adcontent).b;
                if (fVar != null) {
                    kVar2.a(fVar);
                }
                k kVar3 = this.a;
                com.fyber.inneractive.sdk.cache.session.enums.a aVar3 = com.fyber.inneractive.sdk.cache.session.enums.a.CLICK;
                if (kVar3.G == UnitDisplayType.REWARDED) {
                    bVar = com.fyber.inneractive.sdk.cache.session.enums.b.REWARDED_DISPLAY;
                } else {
                    bVar = com.fyber.inneractive.sdk.cache.session.enums.b.INTERSTITIAL_DISPLAY;
                }
                kVar3.a(aVar3, bVar);
                return this.a.a(context, str, k0Var, com.fyber.inneractive.sdk.util.e.DISPLAY);
            }
        }
        return new x.a(x.d.FAILED, new Exception("No context or no native click detected"), context == null ? "null" : context.getClass().getName());
    }

    @Override // com.fyber.inneractive.sdk.web.d0
    public void a(String str, String str2) {
        k kVar = this.a;
        kVar.getClass();
        IAlog.a("%sweb view callback: onSuspiciousNoUserWebActionDetected", IAlog.a(kVar));
        c.a aVar = this.a.l;
        if (aVar == null || aVar.getLayout() == null) {
            return;
        }
        k kVar2 = this.a;
        if (!kVar2.E) {
            s.a(kVar2.l.getLayout().getContext(), str, str2, this.a.b);
            this.a.E = true;
            k kVar3 = this.a;
            kVar3.getClass();
            IAlog.a("%sreporting auto redirect", IAlog.a(kVar3));
            return;
        }
        kVar2.getClass();
        IAlog.a("%sredirect already reported for this ad", IAlog.a(kVar2));
    }

    @Override // com.fyber.inneractive.sdk.web.d0
    public void a(boolean z) {
        com.fyber.inneractive.sdk.web.g gVar;
        String str;
        if (z) {
            k kVar = this.a;
            if (!kVar.y) {
                kVar.y = true;
                if (kVar.b != 0) {
                    IAmraidWebViewController iAmraidWebViewController = kVar.z;
                    if (iAmraidWebViewController != null) {
                        iAmraidWebViewController.o();
                    }
                    T t = ((z) kVar.b).b;
                    if (t != 0 && (str = t.k) != null && str.trim().length() > 0) {
                        IAlog.d("%sfiring impression!", IAlog.a(kVar));
                        int i = IAlog.a;
                        IAlog.a(1, null, "AD_IMPRESSION", new Object[0]);
                        g0.b(str);
                    }
                    if (Build.VERSION.SDK_INT >= 19 && (gVar = kVar.z.b) != null) {
                        gVar.a("var forceReflow = function(elem){ elem = elem || document.documentElement; elem.style.zIndex = 2147483646; var width = elem.style.width, px = elem.offsetWidth+1; elem.style.width = px+'px'; setTimeout(function(){ elem.style.zIndex = 2147483646; elem.style.width = width; elem = null; }, 0); }; forceReflow(document.documentElement);");
                    }
                    kVar.a(com.fyber.inneractive.sdk.cache.session.enums.a.IMPRESSION, kVar.G == UnitDisplayType.REWARDED ? com.fyber.inneractive.sdk.cache.session.enums.b.REWARDED_DISPLAY : com.fyber.inneractive.sdk.cache.session.enums.b.INTERSTITIAL_DISPLAY);
                    kVar.E();
                    kVar.K();
                }
            }
        }
        k kVar2 = this.a;
        kVar2.getClass();
        IAlog.a("%sweb view callback: onVisibilityChanged: %s", IAlog.a(kVar2), Boolean.valueOf(z));
    }

    @Override // com.fyber.inneractive.sdk.web.i.f
    public void a(com.fyber.inneractive.sdk.web.i iVar, boolean z, Orientation orientation) {
        c.a aVar = this.a.l;
        if (aVar != null) {
            aVar.setActivityOrientation(z, orientation);
        }
    }

    @Override // com.fyber.inneractive.sdk.web.i.f
    public boolean a(String str) {
        c.a aVar = this.a.l;
        if (aVar == null || aVar.getLayout() == null) {
            return false;
        }
        boolean startRichMediaIntent = InneractiveRichMediaVideoPlayerActivityCore.startRichMediaIntent(this.a.l.getLayout().getContext(), str);
        if (startRichMediaIntent) {
            this.a.D();
            return startRichMediaIntent;
        }
        return startRichMediaIntent;
    }

    @Override // com.fyber.inneractive.sdk.web.i.f
    public void a(com.fyber.inneractive.sdk.web.i iVar, boolean z) {
        if (z) {
            k kVar = this.a;
            if (!kVar.t) {
                kVar.t = true;
                k kVar2 = this.a;
                c.a aVar = kVar2.l;
                if (aVar != null) {
                    kVar2.d(aVar.isCloseButtonDisplay());
                }
            }
            this.a.Q();
            c.a aVar2 = this.a.l;
            if (aVar2 == null || !aVar2.isCloseButtonDisplay()) {
                return;
            }
            k kVar3 = this.a;
            kVar3.q = false;
            c.a aVar3 = kVar3.l;
            if (aVar3 != null) {
                aVar3.disableCloseButton();
            }
            kVar3.v.a();
        }
    }

    @Override // com.fyber.inneractive.sdk.web.i.f
    public void a(InneractiveUnitController.AdDisplayError adDisplayError) {
        this.a.e(false);
        k kVar = this.a;
        EventsListener eventslistener = kVar.c;
        if (eventslistener != 0) {
            ((InneractiveFullscreenAdEventsListener) eventslistener).onAdEnteredErrorState(kVar.a, adDisplayError);
        }
    }

    @Override // com.fyber.inneractive.sdk.web.i.k
    public void a() {
        this.a.I();
    }
}
