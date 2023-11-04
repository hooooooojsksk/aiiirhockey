package com.fyber.inneractive.sdk.renderers;

import android.content.Context;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore;
import com.fyber.inneractive.sdk.config.a0;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.t;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.WebViewRendererProcessHasGoneError;
import com.fyber.inneractive.sdk.flow.z;
import com.fyber.inneractive.sdk.mraid.b0;
import com.fyber.inneractive.sdk.network.s;
import com.fyber.inneractive.sdk.ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.k0;
import com.fyber.inneractive.sdk.util.x;
import com.fyber.inneractive.sdk.web.b;
import com.fyber.inneractive.sdk.web.i;

/* loaded from: classes.dex */
public class e implements i.f {
    public final /* synthetic */ g a;

    public e(g gVar) {
        this.a = gVar;
    }

    @Override // com.fyber.inneractive.sdk.web.i.f
    public void a(com.fyber.inneractive.sdk.web.i iVar) {
        g gVar = this.a;
        gVar.getClass();
        IAlog.a("%sweb view callback: onExpand", IAlog.a(gVar));
        g gVar2 = this.a;
        EventsListener eventslistener = gVar2.c;
        if (eventslistener != 0) {
            ((InneractiveAdViewEventsListener) eventslistener).onAdExpanded(gVar2.a);
        }
        g gVar3 = this.a;
        gVar3.getClass();
        IAlog.a("%sweb view callback: onExpand", IAlog.a(gVar3));
        this.a.d(true);
    }

    @Override // com.fyber.inneractive.sdk.web.i.f
    public void a(com.fyber.inneractive.sdk.web.i iVar, boolean z) {
    }

    @Override // com.fyber.inneractive.sdk.web.i.f
    public void a(com.fyber.inneractive.sdk.web.i iVar, boolean z, Orientation orientation) {
    }

    @Override // com.fyber.inneractive.sdk.web.i.f
    public void b(com.fyber.inneractive.sdk.web.i iVar) {
        this.a.d(true);
        g gVar = this.a;
        gVar.getClass();
        IAlog.a("%sweb view callback: onResize", IAlog.a(gVar));
        g gVar2 = this.a;
        EventsListener eventslistener = gVar2.c;
        if (eventslistener != 0) {
            ((InneractiveAdViewEventsListener) eventslistener).onAdResized(gVar2.a);
        }
    }

    @Override // com.fyber.inneractive.sdk.web.i.f
    public void c() {
        this.a.D();
        this.a.G();
    }

    @Override // com.fyber.inneractive.sdk.web.d0
    public void b() {
        this.a.a(new WebViewRendererProcessHasGoneError());
    }

    @Override // com.fyber.inneractive.sdk.web.i.f
    public void a(com.fyber.inneractive.sdk.web.i iVar, b0 b0Var) {
        g gVar = this.a;
        gVar.getClass();
        IAlog.a("%sweb view callback: onClose", IAlog.a(gVar));
        g gVar2 = this.a;
        EventsListener eventslistener = gVar2.c;
        if (eventslistener != 0) {
            ((InneractiveAdViewEventsListener) eventslistener).onAdCollapsed(gVar2.a);
        }
        this.a.N();
        g gVar3 = this.a;
        gVar3.getClass();
        IAlog.a("%sweb view callback: onClose", IAlog.a(gVar3));
    }

    @Override // com.fyber.inneractive.sdk.web.d0
    public x.a a(String str, k0 k0Var, b.a aVar) {
        com.fyber.inneractive.sdk.cache.session.enums.b bVar;
        g gVar = this.a;
        gVar.getClass();
        IAlog.a("%sweb view callback: onClicked", IAlog.a(gVar));
        ViewGroup viewGroup = this.a.q;
        Context context = (viewGroup == null || viewGroup.getContext() == null) ? com.fyber.inneractive.sdk.util.l.a : this.a.q.getContext();
        if (context != null) {
            g gVar2 = this.a;
            if (gVar2.g) {
                AdContent adcontent = gVar2.b;
                com.fyber.inneractive.sdk.response.f fVar = adcontent != 0 ? (com.fyber.inneractive.sdk.response.f) ((z) adcontent).b : null;
                if (fVar != null) {
                    gVar2.a(fVar);
                }
                g gVar3 = this.a;
                AdContent adcontent2 = gVar3.b;
                if (adcontent2 != 0) {
                    z zVar = (z) adcontent2;
                    if (zVar.d != null && ((a0) zVar.d).c != null) {
                        com.fyber.inneractive.sdk.cache.session.enums.a aVar2 = com.fyber.inneractive.sdk.cache.session.enums.a.CLICK;
                        if (((a0) zVar.d).c.b == UnitDisplayType.MRECT) {
                            bVar = com.fyber.inneractive.sdk.cache.session.enums.b.RECTANGLE_DISPLAY;
                        } else {
                            bVar = com.fyber.inneractive.sdk.cache.session.enums.b.BANNER_DISPLAY;
                        }
                        gVar3.a(aVar2, bVar);
                    }
                }
                return this.a.a(context, str, k0Var, com.fyber.inneractive.sdk.util.e.DISPLAY);
            }
        }
        return new x.a(x.d.FAILED, new Exception("No context or no native click detected"), context == null ? "null" : context.getClass().getName());
    }

    @Override // com.fyber.inneractive.sdk.web.d0
    public void a(String str, String str2) {
        g gVar = this.a;
        gVar.getClass();
        IAlog.a("%sweb view callback: onSuspiciousNoUserWebActionDetected", IAlog.a(gVar));
        ViewGroup viewGroup = this.a.q;
        if (viewGroup == null || viewGroup.getContext() == null) {
            return;
        }
        g gVar2 = this.a;
        if (!gVar2.w) {
            s.a(gVar2.q.getContext(), str, str2, this.a.b);
            this.a.w = true;
            g gVar3 = this.a;
            gVar3.getClass();
            IAlog.a("%sreporting auto redirect", IAlog.a(gVar3));
            return;
        }
        gVar2.getClass();
        IAlog.a("%sredirect already reported for this ad", IAlog.a(gVar2));
    }

    @Override // com.fyber.inneractive.sdk.web.d0
    public void a(boolean z) {
        com.fyber.inneractive.sdk.config.b0 b0Var;
        t tVar;
        com.fyber.inneractive.sdk.cache.session.enums.b bVar;
        g gVar = this.a;
        gVar.getClass();
        IAlog.a("%sweb view callback: onVisibilityChanged: %s", IAlog.a(gVar), Boolean.valueOf(z));
        if (z) {
            g gVar2 = this.a;
            if (!gVar2.p) {
                IAlog.a("%sonShownForTheFirstTime called", IAlog.a(gVar2));
                AdContent adcontent = gVar2.b;
                com.fyber.inneractive.sdk.response.f fVar = adcontent != 0 ? (com.fyber.inneractive.sdk.response.f) ((z) adcontent).b : null;
                if (fVar != null) {
                    IAmraidWebViewController iAmraidWebViewController = gVar2.n;
                    if (iAmraidWebViewController != null) {
                        iAmraidWebViewController.o();
                    }
                    gVar2.b(fVar);
                }
                long L = gVar2.L();
                gVar2.l = L;
                if (L != 0) {
                    gVar2.a(L, true);
                }
                AdContent adcontent2 = gVar2.b;
                if (adcontent2 != 0 && (b0Var = ((z) adcontent2).d) != null && (tVar = ((a0) b0Var).c) != null) {
                    com.fyber.inneractive.sdk.cache.session.enums.a aVar = com.fyber.inneractive.sdk.cache.session.enums.a.IMPRESSION;
                    if (tVar.b == UnitDisplayType.MRECT) {
                        bVar = com.fyber.inneractive.sdk.cache.session.enums.b.RECTANGLE_DISPLAY;
                    } else {
                        bVar = com.fyber.inneractive.sdk.cache.session.enums.b.BANNER_DISPLAY;
                    }
                    gVar2.a(aVar, bVar);
                }
                gVar2.E();
                this.a.p = true;
                return;
            }
            b bVar2 = gVar2.z;
            if (bVar2 != null) {
                bVar2.b();
            }
            this.a.N();
            return;
        }
        b bVar3 = this.a.z;
        if (bVar3 != null && bVar3.h) {
            bVar3.c();
        }
        this.a.d(false);
    }

    @Override // com.fyber.inneractive.sdk.web.i.f
    public boolean a(String str) {
        ViewGroup viewGroup = this.a.q;
        if (viewGroup == null || viewGroup.getContext() == null) {
            return false;
        }
        boolean startRichMediaIntent = InneractiveRichMediaVideoPlayerActivityCore.startRichMediaIntent(this.a.q.getContext(), str);
        if (startRichMediaIntent) {
            g gVar = this.a;
            if (gVar.c != 0) {
                gVar.D();
                return startRichMediaIntent;
            }
            return startRichMediaIntent;
        }
        return startRichMediaIntent;
    }

    @Override // com.fyber.inneractive.sdk.web.i.f
    public void a(InneractiveUnitController.AdDisplayError adDisplayError) {
        g gVar = this.a;
        EventsListener eventslistener = gVar.c;
        if (eventslistener != 0) {
            ((InneractiveAdViewEventsListener) eventslistener).onAdEnteredErrorState(gVar.a, adDisplayError);
        }
    }
}
