package com.fyber.inneractive.sdk.web;

import android.os.AsyncTask;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.d;
import com.iab.omid.library.fyber.ScriptInjector;

/* loaded from: classes.dex */
public class e extends AsyncTask<Void, Void, String> {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ d e;

    public e(d dVar, String str, String str2, String str3, String str4) {
        this.e = dVar;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    @Override // android.os.AsyncTask
    public String doInBackground(Void[] voidArr) {
        long currentTimeMillis = System.currentTimeMillis();
        d dVar = this.e;
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        c0 c0Var = (c0) dVar;
        c0Var.getClass();
        StringBuilder sb = new StringBuilder();
        String str4 = null;
        if (TextUtils.isEmpty(str)) {
            IAlog.a("loadHtml called with an empty HTML!", new Object[0]);
        } else {
            sb.append("<html><head>");
            sb.append("<link rel=\"icon\" href=\"data:,\">");
            if (c0Var.H) {
                String c = com.fyber.inneractive.sdk.util.l.c("ia_js_load_monitor.txt");
                if (!TextUtils.isEmpty(c)) {
                    sb.append(c);
                }
            }
            sb.append("<script> window.iaPreCachedAd = true; </script>");
            IAConfigManager iAConfigManager = IAConfigManager.M;
            boolean a = iAConfigManager.u.b.a("use_js_inline", false);
            if (a && iAConfigManager.G.b != null) {
                sb.append("<script type=\"text/javascript\">");
                sb.append(iAConfigManager.G.b);
                sb.append("</script>");
            } else {
                sb.append("<script src=\"https://cdn2.inner-active.mobi/client/ia-js-tags/dt-mraid-video-controller.js\"></script>");
            }
            if (!TextUtils.isEmpty(str2)) {
                sb.append(str2);
            }
            sb.append("<script>var prevWindowOnError = window.onerror; window.onerror = function(err) {if (typeof prevWindowOnError === 'function') {prevWindowOnError.apply();} console.log('WINDOW.ONERROR Javascript Error: ' + err);};</script>");
            sb.append("</head>");
            sb.append("<style>body{text-align:center !important;margin:0;padding:0;}");
            if (!TextUtils.isEmpty(str3)) {
                sb.append(str3);
            }
            sb.append("</style>");
            sb.append("<body id=\"iaBody\">");
            if (c0Var.D && c0Var.q()) {
                if (a && iAConfigManager.G.c != null) {
                    sb.append("<style type=\"text/css\">");
                    sb.append(iAConfigManager.G.c);
                    sb.append("</style>");
                } else {
                    sb.append("<link rel=\"stylesheet\" href=\"https://cdn2.inner-active.mobi/IA-JSTag/Production/centering_v1.css\">");
                }
                if (a && iAConfigManager.G.d != null) {
                    sb.append("<script type=\"text/javascript\">");
                    sb.append(iAConfigManager.G.d);
                    sb.append("</script>");
                } else {
                    sb.append("<script src=\"https://cdn2.inner-active.mobi/IA-JSTag/Production/centering_v1.js\"></script>");
                }
            }
            String c2 = com.fyber.inneractive.sdk.util.l.c("ia_mraid_bridge.txt");
            if (!TextUtils.isEmpty(c2)) {
                sb.append("<div id='iaScriptBr' style='display:none;'>");
                sb.append(c2);
                sb.append("</div>");
                if (IAlog.a >= 2) {
                    sb.append("<script type=\"text/javascript\">window.mraidbridge.loggingEnabled = true;</script>");
                }
            }
            sb.append(str);
            sb.append("</body></html>");
            if (c0Var.K != null) {
                com.fyber.inneractive.sdk.response.e d = c0Var.v.d();
                boolean z = d != null && d.H;
                com.fyber.inneractive.sdk.measurement.a aVar = c0Var.K;
                String sb2 = sb.toString();
                com.fyber.inneractive.sdk.measurement.b bVar = (com.fyber.inneractive.sdk.measurement.b) aVar;
                if (z) {
                    StringBuilder sb3 = new StringBuilder();
                    if (!TextUtils.isEmpty(bVar.c)) {
                        sb3.append(bVar.c);
                    }
                    if (!TextUtils.isEmpty(bVar.d)) {
                        sb3.append(bVar.d);
                    }
                    str4 = ScriptInjector.injectScriptContentIntoHtml(sb3.toString(), sb2);
                } else {
                    str4 = sb2;
                }
                if (!TextUtils.isEmpty(bVar.b)) {
                    str4 = ScriptInjector.injectScriptContentIntoHtml(bVar.b, str4);
                }
            } else {
                str4 = sb.toString();
            }
        }
        d dVar2 = this.e;
        dVar2.getClass();
        IAlog.a("%sbuild html string took %d msec", IAlog.a(dVar2), Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        return str4;
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(String str) {
        String str2 = str;
        String str3 = com.fyber.inneractive.sdk.util.p.a() ? "http://" : "https://";
        if (!TextUtils.isEmpty(str2) && !isCancelled()) {
            this.e.r = null;
            if (!TextUtils.isEmpty(this.d)) {
                d dVar = this.e;
                dVar.s = str3 + this.d;
            } else {
                d dVar2 = this.e;
                dVar2.s = str3 + "wv.inner-active.mobi/";
            }
            d dVar3 = this.e;
            g gVar = dVar3.b;
            if (gVar != null) {
                gVar.loadDataWithBaseURL(dVar3.s, str2, "text/html", "utf-8", null);
                this.e.t = str2;
                return;
            }
            InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, com.fyber.inneractive.sdk.flow.f.COULD_NOT_LOAD_TO_WEBVIEW);
            d.e eVar = dVar3.f;
            if (eVar != null) {
                eVar.a(dVar3, inneractiveInfrastructureError);
            }
            dVar3.b(true);
        } else if (isCancelled()) {
        } else {
            d dVar4 = this.e;
            InneractiveInfrastructureError inneractiveInfrastructureError2 = new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, com.fyber.inneractive.sdk.flow.f.EMPTY_FINAL_HTML);
            d.e eVar2 = dVar4.f;
            if (eVar2 != null) {
                eVar2.a(dVar4, inneractiveInfrastructureError2);
            }
            dVar4.b(true);
        }
    }
}
