package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzfge {
    private static final zzfge zza = new zzfge();

    private zzfge() {
    }

    public static final zzfge zza() {
        return zza;
    }

    public final void zzc(WebView webView) {
        zzb(webView, "finishSession", new Object[0]);
    }

    public final void zzd(WebView webView, JSONObject jSONObject) {
        zzb(webView, "init", jSONObject);
    }

    public final void zze(WebView webView, float f) {
        zzb(webView, "setDeviceVolume", Float.valueOf(f));
    }

    public final void zzf(WebView webView, String str) {
        zzb(webView, "setNativeViewHierarchy", str);
    }

    public final void zzg(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        zzb(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    public final void zzb(WebView webView, String str, Object... objArr) {
        if (webView == null) {
            zzffh.zza.booleanValue();
            return;
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
        sb.append(str);
        sb.append("(");
        if (objArr.length > 0) {
            for (Object obj : objArr) {
                if (obj == null) {
                    sb.append("\"\"");
                } else if (obj instanceof String) {
                    String obj2 = obj.toString();
                    if (obj2.startsWith("{")) {
                        sb.append(obj2);
                    } else {
                        sb.append('\"');
                        sb.append(obj2);
                        sb.append('\"');
                    }
                } else {
                    sb.append(obj);
                }
                sb.append(",");
            }
            sb.setLength(sb.length() - 1);
        }
        sb.append(")}");
        String sb2 = sb.toString();
        Handler handler = webView.getHandler();
        if (handler == null || Looper.myLooper() == handler.getLooper()) {
            webView.loadUrl(sb2);
        } else {
            handler.post(new zzfgd(this, webView, sb2));
        }
    }
}
