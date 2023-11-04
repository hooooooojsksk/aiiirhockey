package com.fyber.inneractive.sdk.flow;

import android.app.Application;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveError;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.measurement.a;
import com.fyber.inneractive.sdk.network.q;
import com.fyber.inneractive.sdk.ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.d;
import com.fyber.inneractive.sdk.web.i;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class l extends g<com.fyber.inneractive.sdk.response.f, z> {
    public IAmraidWebViewController h;
    public d.e i = new a();

    /* loaded from: classes.dex */
    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[UnitDisplayType.values().length];
            a = iArr;
            try {
                iArr[UnitDisplayType.INTERSTITIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[UnitDisplayType.REWARDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.g, com.fyber.inneractive.sdk.interfaces.a
    public void a() {
        IAmraidWebViewController iAmraidWebViewController;
        if (this.c != 0 && (iAmraidWebViewController = this.h) != null) {
            a.InterfaceC0020a interfaceC0020a = iAmraidWebViewController.L;
            if (interfaceC0020a != null) {
                ((com.fyber.inneractive.sdk.measurement.tracker.c) interfaceC0020a).d();
            }
            this.h.c();
            this.h = null;
        }
        super.a();
    }

    @Override // com.fyber.inneractive.sdk.flow.g
    public String b() {
        return "send_failed_display_creatives";
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Response extends com.fyber.inneractive.sdk.response.e, T extends com.fyber.inneractive.sdk.response.e] */
    @Override // com.fyber.inneractive.sdk.flow.g
    public void e() {
        i.d dVar;
        String str;
        String str2;
        z zVar = new z(c(), this.f);
        this.c = zVar;
        ?? r1 = this.b;
        zVar.b = r1;
        zVar.f = this.g;
        UnitDisplayType unitDisplayType = ((com.fyber.inneractive.sdk.response.f) r1).n;
        i.g gVar = i.g.INLINE;
        com.fyber.inneractive.sdk.measurement.a aVar = null;
        if (unitDisplayType == null) {
            this.i.a(null, new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, f.EMPTY_UNIT_DISPLAY_TYPE, new Exception("Unit display type was not found")));
            return;
        }
        int i = b.a[unitDisplayType.ordinal()];
        boolean z = false;
        if (i != 1 && i != 2) {
            dVar = i.d.ENABLED;
        } else {
            dVar = i.d.ENABLED;
            InneractiveAdRequest inneractiveAdRequest = this.a;
            if (inneractiveAdRequest == null || inneractiveAdRequest.getAllowFullscreen()) {
                gVar = i.g.INTERSTITIAL;
            }
        }
        i.g gVar2 = gVar;
        i.d dVar2 = dVar;
        boolean z2 = !((com.fyber.inneractive.sdk.response.f) this.b).I.contains("iaNotifyLoadFinished");
        IAConfigManager iAConfigManager = IAConfigManager.M;
        boolean a2 = com.fyber.inneractive.sdk.util.g.a(unitDisplayType, iAConfigManager.u.b);
        try {
            Application application = com.fyber.inneractive.sdk.util.l.a;
            i.h hVar = i.h.AD_CONTROLLED;
            com.fyber.inneractive.sdk.config.global.s sVar = this.f;
            if (sVar != null && ((com.fyber.inneractive.sdk.config.global.features.l) sVar.a(com.fyber.inneractive.sdk.config.global.features.l.class)).c()) {
                aVar = iAConfigManager.J;
            }
            IAmraidWebViewController iAmraidWebViewController = new IAmraidWebViewController(application, a2, gVar2, dVar2, hVar, z2, aVar);
            this.h = iAmraidWebViewController;
            iAmraidWebViewController.setAdContent(this.c);
            this.h.setAdRequest(this.a);
            InneractiveAdRequest inneractiveAdRequest2 = this.a;
            if (inneractiveAdRequest2 != null && inneractiveAdRequest2.getSelectedUnitConfig() != null && ((com.fyber.inneractive.sdk.config.a0) this.a.getSelectedUnitConfig()).c != null) {
                this.h.setMuteMraidVideo(((z) this.c).h() && ((com.fyber.inneractive.sdk.config.a0) this.a.getSelectedUnitConfig()).c.b != UnitDisplayType.REWARDED);
            }
            ((z) this.c).i = this.h;
            Response response = this.b;
            if (response != 0) {
                UnitDisplayType unitDisplayType2 = ((com.fyber.inneractive.sdk.response.f) response).n;
                InneractiveAdRequest inneractiveAdRequest3 = this.a;
                z = (inneractiveAdRequest3 == null || inneractiveAdRequest3.getAllowFullscreen()) ? true : true;
                StringBuilder sb = new StringBuilder();
                if (unitDisplayType2 != null && unitDisplayType2.isFullscreenUnit() && !z) {
                    sb.append("<script type=\"text/javascript\">  var IaCloseBtnHelper = (function initIaCloseBtnHelper(){    var styleContent = '.celtra-close-button {display:none !important;} .close-button {display:none !important;}';    function getStyle(doc){      var style = doc.createElement('style');      style.type = 'text/css';      if (style.styleSheet){        style.styleSheet.cssText = styleContent;      } else {        style.appendChild(doc.createTextNode(styleContent));      }      return style;    }    function onDomReady(){      var iframes = window.document.getElementsByTagName('iframe'),          i = 0,          len = iframes && iframes.length || 0;      for(; i < len; ++i){        if(!iframes[i].src){          try {            iframes[i].contentDocument.body.appendChild(getStyle(iframes[i].contentDocument));          }catch(e){          }}}}    function registerWindowEvents(){      window.addEventListener('load', function onWindowLoad(){        window.removeEventListener('load', onWindowLoad);        onDomReady();      });    }    return {      init: function init(){        if(window.document.readyState != 'complete'){          registerWindowEvents();        }else{          onDomReady();        }}}})();  IaCloseBtnHelper.init();</script>");
                }
                String sb2 = sb.toString();
                str2 = a(unitDisplayType2);
                str = sb2;
            } else {
                str = "";
                str2 = str;
            }
            this.h.setAutoplayMRAIDVideos(unitDisplayType.isFullscreenUnit());
            this.h.a(com.fyber.inneractive.sdk.config.a.a(), "" + ((com.fyber.inneractive.sdk.response.f) this.b).I, str, str2, this.i, TimeUnit.SECONDS.toMillis(iAConfigManager.w.a.b.a("DisplayAdLoadTimeOutInSeconds", 10, 3)));
        } catch (Throwable th) {
            a(new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, f.COULD_NOT_CREATE_WEBVIEW_CONTROLLER, th));
        }
    }

    public static String a(UnitDisplayType unitDisplayType) {
        StringBuilder sb = new StringBuilder();
        if (unitDisplayType != null && !unitDisplayType.isFullscreenUnit()) {
            if (unitDisplayType == UnitDisplayType.BANNER) {
                sb.append(" body {display: flex;} #iawrapper { position:unset !important; display: unset !important; } ");
            } else {
                sb.append(" #iawrapper { position:unset !important; display: unset !important; }");
            }
        }
        return sb.toString();
    }

    /* loaded from: classes.dex */
    public class a implements d.e {
        public a() {
            l.this = r1;
        }

        @Override // com.fyber.inneractive.sdk.web.d.e
        public void a(com.fyber.inneractive.sdk.web.d dVar) {
            l lVar = l.this;
            lVar.getClass();
            IAlog.a("%sweb view returned onReady!", IAlog.a(lVar));
            Response response = l.this.b;
            UnitDisplayType unitDisplayType = response != 0 ? ((com.fyber.inneractive.sdk.response.f) response).n : null;
            if (unitDisplayType != null && unitDisplayType.isFullscreenUnit()) {
                l lVar2 = l.this;
                lVar2.getClass();
                try {
                    com.fyber.inneractive.sdk.network.p pVar = com.fyber.inneractive.sdk.network.p.EVENT_READY_ON_CLIENT;
                    InneractiveAdRequest inneractiveAdRequest = lVar2.a;
                    Content content = lVar2.c;
                    new q.a(pVar, inneractiveAdRequest, content != 0 ? (com.fyber.inneractive.sdk.response.f) ((z) content).b : null, (JSONArray) null).a((String) null);
                } catch (Exception unused) {
                }
            }
            l.this.d();
        }

        @Override // com.fyber.inneractive.sdk.web.d.e
        public void a(com.fyber.inneractive.sdk.web.d dVar, InneractiveInfrastructureError inneractiveInfrastructureError) {
            l.this.a((InneractiveError) inneractiveInfrastructureError);
            l lVar = l.this;
            lVar.getClass();
            IAlog.a("%sweb view returned onFailedLoading!", IAlog.a(lVar));
            l.this.a(inneractiveInfrastructureError);
            if (inneractiveInfrastructureError.getErrorCode() == InneractiveErrorCode.NON_SECURE_CONTENT_DETECTED) {
                com.fyber.inneractive.sdk.network.o oVar = com.fyber.inneractive.sdk.network.o.MRAID_ERROR_UNSECURE_CONTENT;
                l lVar2 = l.this;
                new q.a(oVar, lVar2.a, lVar2.b, (JSONArray) null).a((String) null);
            }
        }
    }
}
