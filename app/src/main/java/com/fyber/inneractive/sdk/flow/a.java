package com.fyber.inneractive.sdk.flow;

import android.util.Log;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.network.q;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {
    public static void a(InneractiveAdRequest inneractiveAdRequest, InneractiveInfrastructureError inneractiveInfrastructureError, o oVar, com.fyber.inneractive.sdk.response.e eVar, JSONArray jSONArray) {
        String sb;
        if (inneractiveInfrastructureError.getErrorCode().getMetricable() == InneractiveErrorCode.Metricable.INCLUDED_IN_FAILED_METRICS && (oVar == null || oVar.e() || oVar.isVideoAd()) && !inneractiveInfrastructureError.isErrorAlreadyReported(com.fyber.inneractive.sdk.network.o.IA_AD_LOAD_FAILED)) {
            IAlog.a("Firing Event 801 - AdLoadFailed - errorCode - %s", inneractiveInfrastructureError.getErrorCode());
            if (inneractiveInfrastructureError.getCause() != null) {
                sb = Arrays.toString(inneractiveInfrastructureError.getCause().getStackTrace());
            } else {
                StringBuilder sb2 = new StringBuilder();
                StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
                for (int i = 7; i >= 0 && i < 13 && i < stackTrace.length; i++) {
                    sb2.append(stackTrace[i].toString());
                    sb2.append(",");
                }
                Log.d("stack trace:", sb2.toString());
                sb = sb2.toString();
            }
            com.fyber.inneractive.sdk.network.o oVar2 = com.fyber.inneractive.sdk.network.o.IA_AD_LOAD_FAILED;
            q.a aVar = new q.a(oVar2, inneractiveAdRequest, eVar, jSONArray);
            JSONObject jSONObject = new JSONObject();
            String str = inneractiveInfrastructureError.getFyberMarketplaceAdLoadFailureReason().toString();
            try {
                jSONObject.put("message", str);
            } catch (Exception unused) {
                IAlog.e("Got exception adding param to json object: %s, %s", "message", str);
            }
            try {
                jSONObject.put("description", sb);
            } catch (Exception unused2) {
                IAlog.e("Got exception adding param to json object: %s, %s", "description", sb);
            }
            String description = inneractiveInfrastructureError.description();
            try {
                jSONObject.put("extra_description", description);
            } catch (Exception unused3) {
                IAlog.e("Got exception adding param to json object: %s, %s", "extra_description", description);
            }
            aVar.f.put(jSONObject);
            aVar.a((String) null);
            inneractiveInfrastructureError.addReportedError(oVar2);
        }
    }
}
