package com.fyber.inneractive.sdk.flow;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity;
import com.fyber.inneractive.sdk.click.f;
import com.fyber.inneractive.sdk.click.l;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdRenderer;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListenerWithImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerWithImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener;
import com.fyber.inneractive.sdk.external.OnGlobalImpressionDataListener;
import com.fyber.inneractive.sdk.flow.o;
import com.fyber.inneractive.sdk.network.g0;
import com.fyber.inneractive.sdk.network.m0;
import com.fyber.inneractive.sdk.network.q;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.k0;
import com.fyber.inneractive.sdk.web.t;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class p<AdContent extends o, EventsListener extends InneractiveUnitController.EventsListener> implements InneractiveAdRenderer, InneractiveInternalBrowserActivity.InternalBrowserListener, f.a, t.g {
    public InneractiveAdSpot a;
    public AdContent b;
    public EventsListener c;
    public boolean d = false;
    public boolean e = false;
    public boolean f = false;
    public boolean g = true;
    public Runnable h;
    public com.fyber.inneractive.sdk.click.l i;
    public l.b j;
    public View k;

    /* loaded from: classes.dex */
    public class a implements l.b {
        public final /* synthetic */ k0 a;
        public final /* synthetic */ com.fyber.inneractive.sdk.util.e b;

        public a(k0 k0Var, com.fyber.inneractive.sdk.util.e eVar) {
            p.this = r1;
            this.a = k0Var;
            this.b = eVar;
        }

        @Override // com.fyber.inneractive.sdk.click.l.b
        public void a(com.fyber.inneractive.sdk.click.b bVar) {
            p pVar = p.this;
            pVar.getClass();
            IAlog.a("%s super click result: %s", IAlog.a(pVar), bVar);
            p pVar2 = p.this;
            if (pVar2.i == null) {
                pVar2.getClass();
                IAlog.a("%s click handler is null. Probably cancelled", IAlog.a(pVar2));
                return;
            }
            pVar2.i = null;
            pVar2.j = null;
            pVar2.H();
            if (bVar != null) {
                p pVar3 = p.this;
                k0 k0Var = this.a;
                com.fyber.inneractive.sdk.util.e eVar = this.b;
                pVar3.getClass();
                l.d dVar = bVar.a;
                if (dVar != l.d.OPEN_IN_EXTERNAL_APPLICATION && dVar != l.d.OPEN_GOOGLE_STORE) {
                    if (dVar == l.d.OPENED_IN_INTERNAL_BROWSER) {
                        IAlog.a("InneractiveAdRendererImpl: handleOpenResult - opened in internal browser", new Object[0]);
                        pVar3.d = true;
                        InneractiveInternalBrowserActivity.setInternalBrowserListener(pVar3);
                    } else if (dVar == l.d.OPENED_USING_CHROME_NAVIGATE || dVar == l.d.OPENED_IN_EXTERNAL_BROWSER) {
                        IAlog.a("InneractiveAdRendererImpl: handleOpenResult - opened in external browser", new Object[0]);
                        pVar3.a(bVar.d, bVar.a);
                        if (pVar3.c != null) {
                            pVar3.G();
                        }
                    }
                } else {
                    IAlog.a("InneractiveAdRendererImpl: handleOpenResult - opened in external application", new Object[0]);
                    List<com.fyber.inneractive.sdk.click.i> list = bVar.f;
                    com.fyber.inneractive.sdk.click.i iVar = list.get(list.size() - 1);
                    l.d dVar2 = iVar.c;
                    if (dVar2 == l.d.OPENED_IN_EXTERNAL_BROWSER) {
                        pVar3.a(iVar.a, dVar2);
                    }
                    if (pVar3.c != null) {
                        pVar3.G();
                    }
                }
                if (pVar3.q() == com.fyber.inneractive.sdk.ignite.k.NONE || !(TextUtils.isEmpty(bVar.c) || bVar.c.equals("IgniteGooglePlay"))) {
                    pVar3.b(bVar, k0Var, eVar);
                }
            }
        }
    }

    public int A() {
        return -1;
    }

    public boolean B() {
        com.fyber.inneractive.sdk.config.global.s sVar;
        AdContent adcontent = this.b;
        return (adcontent == null || (sVar = adcontent.c) == null || sVar.a(com.fyber.inneractive.sdk.config.global.features.c.class) == null || ((com.fyber.inneractive.sdk.config.global.features.c) this.b.c.a(com.fyber.inneractive.sdk.config.global.features.c.class)).c.size() <= 0) ? false : true;
    }

    public boolean C() {
        AdContent adcontent = this.b;
        if (adcontent != null) {
            return adcontent.e();
        }
        return true;
    }

    public void D() {
        com.fyber.inneractive.sdk.response.e d;
        if (this.c != null) {
            IAlog.a("%sCalling external interface onAdClicked", IAlog.a(this));
            this.c.onAdClicked(this.a);
        }
        AdContent adcontent = this.b;
        if (adcontent == null || (d = adcontent.d()) == null) {
            return;
        }
        IAConfigManager.M.x.a(d.n, "LAST_CLICKED", "1");
    }

    public void E() {
        com.fyber.inneractive.sdk.response.e d;
        OnGlobalImpressionDataListener onGlobalImpressionDataListener;
        if (this.e || this.c == null) {
            return;
        }
        IAlog.a("%sCalling external interface onAdImpression", IAlog.a(this));
        this.c.onAdImpression(this.a);
        AdContent adcontent = this.b;
        if (adcontent != null && (d = adcontent.d()) != null) {
            IAConfigManager iAConfigManager = IAConfigManager.M;
            com.fyber.inneractive.sdk.config.f0 f0Var = iAConfigManager.x;
            if (f0Var != null) {
                UnitDisplayType unitDisplayType = d.n;
                ImpressionData impressionData = d.r;
                f0Var.a(unitDisplayType, "LAST_DOMAIN_SHOWED", impressionData != null ? impressionData.getAdvertiserDomain() : null);
                f0Var.a(unitDisplayType, "LAST_APP_BUNDLE_ID", d.y);
                if (this.b.isVideoAd()) {
                    f0Var.a(unitDisplayType, "LAST_VAST_SKIPED");
                    f0Var.a(unitDisplayType, "LAST_VAST_CLICKED_TYPE");
                }
                f0Var.a(unitDisplayType, "LAST_CLICKED");
            }
            com.fyber.inneractive.sdk.util.e0 e0Var = iAConfigManager.A;
            com.fyber.inneractive.sdk.config.b0 b0Var = this.b.d;
            ImpressionData impressionData2 = d.r;
            e0Var.getClass();
            if (b0Var != null && (onGlobalImpressionDataListener = e0Var.a) != null) {
                com.fyber.inneractive.sdk.config.a0 a0Var = (com.fyber.inneractive.sdk.config.a0) b0Var;
                onGlobalImpressionDataListener.onImpression(a0Var.b, a0Var.a, impressionData2);
            }
            EventsListener eventslistener = this.c;
            if (eventslistener instanceof InneractiveFullscreenAdEventsListenerWithImpressionData) {
                ((InneractiveFullscreenAdEventsListenerWithImpressionData) eventslistener).onAdImpression(this.a, d.r);
            } else if (eventslistener instanceof InneractiveAdViewEventsListenerWithImpressionData) {
                ((InneractiveAdViewEventsListenerWithImpressionData) eventslistener).onAdImpression(this.a, d.r);
            }
        }
        this.e = true;
    }

    public void F() {
        if (this.c != null) {
            IAlog.a("%sCalling external interface onAdWillCloseInternalBrowser", IAlog.a(this));
            this.c.onAdWillCloseInternalBrowser(this.a);
        }
    }

    public void G() {
        if (this.c != null) {
            IAlog.a("%sCalling external interface onAdWillOpenExternalApp", IAlog.a(this));
            this.c.onAdWillOpenExternalApp(this.a);
        }
        this.f = false;
    }

    public void H() {
        View y = y();
        if (y == null || this.k == null || y.getParent() == null || !(y.getParent() instanceof ViewGroup)) {
            return;
        }
        y.getLayoutParams();
        ((ViewGroup) y.getParent()).removeView(this.k);
        c(this.k);
        this.k = null;
    }

    public void I() {
        AdContent adcontent = this.b;
        if (adcontent == null || adcontent.d() == null) {
            return;
        }
        String str = this.b.d().o;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        IAlog.d("%sfiring rewarded completion!", IAlog.a(this));
        int i = IAlog.a;
        IAlog.a(1, null, "AD_REWARDED_COMPLETION", new Object[0]);
        g0.b(str);
    }

    public void b(View view) {
    }

    public void b(com.fyber.inneractive.sdk.response.e eVar) {
        String str = eVar.k;
        if (str == null || str.trim().length() <= 0) {
            return;
        }
        IAlog.d("%sfiring impression!", IAlog.a(this));
        int i = IAlog.a;
        IAlog.a(1, null, "AD_IMPRESSION", new Object[0]);
        g0.b(str);
    }

    public void c(View view) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public boolean canRefreshAd() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public void destroy() {
        if (this.d) {
            InneractiveInternalBrowserActivity.setInternalBrowserListener(null);
            this.d = false;
        }
        Runnable runnable = this.h;
        if (runnable != null) {
            com.fyber.inneractive.sdk.util.m.b.removeCallbacks(runnable);
            this.h = null;
        }
        this.b = null;
        this.c = null;
        this.a = null;
        if (this.i != null) {
            H();
            m0 m0Var = this.i.g;
            if (m0Var != null) {
                m0Var.a = true;
            }
            this.i = null;
            this.j = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public void initialize(InneractiveAdSpot inneractiveAdSpot) {
        this.a = inneractiveAdSpot;
        this.b = (AdContent) inneractiveAdSpot.getAdContent();
        this.c = (EventsListener) inneractiveAdSpot.getSelectedUnitController().getEventsListener();
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity.InternalBrowserListener
    public void onApplicationInBackground() {
        G();
        this.f = false;
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity.InternalBrowserListener
    public void onInternalBrowserDismissed() {
        IAlog.a("onInternalBrowserDismissed callback called", new Object[0]);
        if (this.d) {
            this.d = false;
            InneractiveInternalBrowserActivity.setInternalBrowserListener(null);
        }
        F();
        this.f = false;
    }

    public com.fyber.inneractive.sdk.ignite.k q() {
        AdContent adcontent = this.b;
        if (adcontent != null && adcontent.f() && this.b.d() != null) {
            return this.b.d().F;
        }
        return com.fyber.inneractive.sdk.ignite.k.NONE;
    }

    public void x() {
        View y = y();
        if (y == null || y.getParent() == null || !(y.getParent() instanceof ViewGroup) || this.k != null) {
            return;
        }
        View inflate = ViewGroup.inflate(y.getContext(), R.layout.ia_click_overlay, null);
        this.k = inflate;
        if (inflate != null) {
            ((ViewGroup) y.getParent()).addView(this.k, y.getLayoutParams());
            b(this.k);
        }
    }

    public abstract View y();

    public int z() {
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.fyber.inneractive.sdk.util.x.a a(android.content.Context r17, java.lang.String r18, com.fyber.inneractive.sdk.util.k0 r19, com.fyber.inneractive.sdk.util.e r20) {
        /*
            Method dump skipped, instructions count: 417
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.flow.p.a(android.content.Context, java.lang.String, com.fyber.inneractive.sdk.util.k0, com.fyber.inneractive.sdk.util.e):com.fyber.inneractive.sdk.util.x$a");
    }

    /* JADX WARN: Code restructure failed: missing block: B:201:0x01ac, code lost:
        if ((r10 != null && r10.a("show_cta", true)) != false) goto L89;
     */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x01b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(com.fyber.inneractive.sdk.click.b r9, com.fyber.inneractive.sdk.util.k0 r10, com.fyber.inneractive.sdk.util.e r11) {
        /*
            Method dump skipped, instructions count: 453
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.flow.p.b(com.fyber.inneractive.sdk.click.b, com.fyber.inneractive.sdk.util.k0, com.fyber.inneractive.sdk.util.e):void");
    }

    public void a(com.fyber.inneractive.sdk.response.e eVar) {
        String str = eVar.l;
        if (str == null || str.trim().length() <= 0) {
            return;
        }
        int i = IAlog.a;
        IAlog.a(1, null, "AD_CLICKED", new Object[0]);
        g0.b(str);
    }

    @Override // com.fyber.inneractive.sdk.click.f.a
    public void a(com.fyber.inneractive.sdk.click.b bVar, k0 k0Var, com.fyber.inneractive.sdk.util.e eVar) {
        b(bVar, k0Var, eVar);
    }

    public final void a(String str, l.d dVar) {
        com.fyber.inneractive.sdk.response.e eVar;
        JSONArray jSONArray;
        InneractiveAdRequest inneractiveAdRequest;
        AdContent adcontent = this.b;
        if (adcontent != null) {
            eVar = adcontent.d();
            AdContent adcontent2 = this.b;
            inneractiveAdRequest = adcontent2.a;
            com.fyber.inneractive.sdk.config.global.s sVar = adcontent2.c;
            jSONArray = sVar != null ? sVar.c() : null;
        } else {
            eVar = null;
            jSONArray = null;
            inneractiveAdRequest = null;
        }
        q.a a2 = new q.a(com.fyber.inneractive.sdk.network.p.EXTERNAL_BROWSER_OPENED, inneractiveAdRequest, eVar, jSONArray).a(ImagesContract.URL, str);
        Object[] objArr = new Object[2];
        objArr[0] = "fallback";
        objArr[1] = (dVar == l.d.OPENED_USING_CHROME_NAVIGATE || dVar == l.d.OPENED_IN_EXTERNAL_BROWSER) ? "chrome" : "na";
        a2.a(objArr).a((String) null);
    }

    public void a(String str) {
        if (this.f) {
            return;
        }
        this.f = true;
        com.fyber.inneractive.sdk.network.p pVar = com.fyber.inneractive.sdk.network.p.VAST_EVENT_COMPANION_CLICKED;
        AdContent adcontent = this.b;
        InneractiveAdRequest inneractiveAdRequest = adcontent != null ? adcontent.a : null;
        com.fyber.inneractive.sdk.response.e d = adcontent != null ? adcontent.d() : null;
        AdContent adcontent2 = this.b;
        q.a aVar = new q.a(pVar, inneractiveAdRequest, d, adcontent2 != null ? adcontent2.c.c() : null);
        JSONObject jSONObject = new JSONObject();
        if (str == null) {
            str = "na";
        }
        try {
            jSONObject.put("mime", str);
        } catch (Exception unused) {
            IAlog.e("Got exception adding param to json object: %s, %s", "mime", str);
        }
        aVar.f.put(jSONObject);
        aVar.a((String) null);
    }

    public void a(InneractiveUnitController.AdDisplayError adDisplayError) {
        String simpleName = adDisplayError.getClass().getSimpleName();
        String message = adDisplayError.getMessage();
        AdContent adcontent = this.b;
        com.fyber.inneractive.sdk.network.r.a(simpleName, message, adcontent != null ? adcontent.a : null, adcontent != null ? adcontent.d() : null);
        if (this.c != null) {
            IAlog.a("%sCalling external interface onAdEnteredErrorState: %s", IAlog.a(this), adDisplayError.getMessage());
            this.c.onAdEnteredErrorState(this.a, adDisplayError);
        }
    }

    public void a(com.fyber.inneractive.sdk.cache.session.enums.a aVar, com.fyber.inneractive.sdk.cache.session.enums.b bVar) {
        com.fyber.inneractive.sdk.cache.session.d dVar = IAConfigManager.M.x.a;
        if (dVar != null) {
            com.fyber.inneractive.sdk.util.m.a(new com.fyber.inneractive.sdk.cache.session.c(dVar, aVar, bVar));
        }
    }
}
