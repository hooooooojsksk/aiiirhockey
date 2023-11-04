package com.google.android.gms.internal.ads;

import android.os.Build;
import android.webkit.WebView;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public class zzfgl {
    private zzfhj zza;
    private long zzb;
    private int zzc;

    public zzfgl() {
        zzb();
        this.zza = new zzfhj(null);
    }

    public final WebView zza() {
        return (WebView) this.zza.get();
    }

    public final void zzb() {
        this.zzb = System.nanoTime();
        this.zzc = 1;
    }

    public void zzc() {
        this.zza.clear();
    }

    public final void zzd(String str, long j) {
        if (j < this.zzb || this.zzc == 3) {
            return;
        }
        this.zzc = 3;
        zzfge.zza().zzf(zza(), str);
    }

    public final void zze(String str, long j) {
        if (j >= this.zzb) {
            this.zzc = 2;
            zzfge.zza().zzf(zza(), str);
        }
    }

    public void zzf(zzffo zzffoVar, zzffm zzffmVar) {
        zzg(zzffoVar, zzffmVar, null);
    }

    public final void zzg(zzffo zzffoVar, zzffm zzffmVar, JSONObject jSONObject) {
        String zzh = zzffoVar.zzh();
        JSONObject jSONObject2 = new JSONObject();
        zzfgp.zzh(jSONObject2, "environment", "app");
        zzfgp.zzh(jSONObject2, "adSessionType", zzffmVar.zzd());
        JSONObject jSONObject3 = new JSONObject();
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        zzfgp.zzh(jSONObject3, "deviceType", str + "; " + str2);
        zzfgp.zzh(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        zzfgp.zzh(jSONObject3, "os", "Android");
        zzfgp.zzh(jSONObject2, "deviceInfo", jSONObject3);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        zzfgp.zzh(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        zzfgp.zzh(jSONObject4, "partnerName", zzffmVar.zze().zzb());
        zzfgp.zzh(jSONObject4, "partnerVersion", zzffmVar.zze().zzc());
        zzfgp.zzh(jSONObject2, "omidNativeInfo", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        zzfgp.zzh(jSONObject5, "libraryVersion", "1.3.37-google_20220829");
        zzfgp.zzh(jSONObject5, "appId", zzfgc.zzb().zza().getApplicationContext().getPackageName());
        zzfgp.zzh(jSONObject2, "app", jSONObject5);
        if (zzffmVar.zzf() != null) {
            zzfgp.zzh(jSONObject2, "contentUrl", zzffmVar.zzf());
        }
        zzfgp.zzh(jSONObject2, "customReferenceData", zzffmVar.zzg());
        JSONObject jSONObject6 = new JSONObject();
        Iterator it = zzffmVar.zzh().iterator();
        if (it.hasNext()) {
            zzffu zzffuVar = (zzffu) it.next();
            throw null;
        } else {
            zzfge.zza().zzg(zza(), zzh, jSONObject2, jSONObject6, jSONObject);
        }
    }

    public final void zzh(float f) {
        zzfge.zza().zze(zza(), f);
    }

    public final void zzi(WebView webView) {
        this.zza = new zzfhj(webView);
    }

    public void zzj() {
    }

    public final boolean zzk() {
        return this.zza.get() != null;
    }
}
