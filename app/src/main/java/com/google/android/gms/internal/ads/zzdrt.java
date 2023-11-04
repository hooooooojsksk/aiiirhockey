package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzdrt implements zzcur, zzcxj, zzcwg {
    private final zzdsf zza;
    private final String zzb;
    private final String zzc;
    private int zzd = 0;
    private zzdrs zze = zzdrs.AD_REQUESTED;
    private zzcuh zzf;
    private com.google.android.gms.ads.internal.client.zze zzg;
    private String zzh;
    private String zzi;
    private boolean zzj;
    private boolean zzk;

    public zzdrt(zzdsf zzdsfVar, zzeyx zzeyxVar, String str) {
        this.zza = zzdsfVar;
        this.zzc = str;
        this.zzb = zzeyxVar.zzf;
    }

    private static JSONObject zzh(com.google.android.gms.ads.internal.client.zze zzeVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorDomain", zzeVar.zzc);
        jSONObject.put("errorCode", zzeVar.zza);
        jSONObject.put("errorDescription", zzeVar.zzb);
        com.google.android.gms.ads.internal.client.zze zzeVar2 = zzeVar.zzd;
        jSONObject.put("underlyingError", zzeVar2 == null ? null : zzh(zzeVar2));
        return jSONObject;
    }

    private final JSONObject zzi(zzcuh zzcuhVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("winningAdapterClassName", zzcuhVar.zzg());
        jSONObject.put("responseSecsSinceEpoch", zzcuhVar.zzc());
        jSONObject.put("responseId", zzcuhVar.zzi());
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zziw)).booleanValue()) {
            String zzd = zzcuhVar.zzd();
            if (!TextUtils.isEmpty(zzd)) {
                zzbza.zze("Bidding data: ".concat(String.valueOf(zzd)));
                jSONObject.put("biddingData", new JSONObject(zzd));
            }
        }
        if (!TextUtils.isEmpty(this.zzh)) {
            jSONObject.put("adRequestUrl", this.zzh);
        }
        if (!TextUtils.isEmpty(this.zzi)) {
            jSONObject.put("postBody", this.zzi);
        }
        JSONArray jSONArray = new JSONArray();
        for (com.google.android.gms.ads.internal.client.zzu zzuVar : zzcuhVar.zzj()) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("adapterClassName", zzuVar.zza);
            jSONObject2.put("latencyMillis", zzuVar.zzb);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzix)).booleanValue()) {
                jSONObject2.put("credentials", com.google.android.gms.ads.internal.client.zzay.zzb().zzi(zzuVar.zzd));
            }
            com.google.android.gms.ads.internal.client.zze zzeVar = zzuVar.zzc;
            jSONObject2.put("error", zzeVar == null ? null : zzh(zzeVar));
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("adNetworks", jSONArray);
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzcur
    public final void zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.zze = zzdrs.AD_LOAD_FAILED;
        this.zzg = zzeVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zziB)).booleanValue()) {
            this.zza.zzf(this.zzb, this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxj
    public final void zzb(zzeyo zzeyoVar) {
        if (!zzeyoVar.zzb.zza.isEmpty()) {
            this.zzd = ((zzeyc) zzeyoVar.zzb.zza.get(0)).zzb;
        }
        if (!TextUtils.isEmpty(zzeyoVar.zzb.zzb.zzk)) {
            this.zzh = zzeyoVar.zzb.zzb.zzk;
        }
        if (TextUtils.isEmpty(zzeyoVar.zzb.zzb.zzl)) {
            return;
        }
        this.zzi = zzeyoVar.zzb.zzb.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzcxj
    public final void zzbA(zzbtn zzbtnVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zziB)).booleanValue()) {
            return;
        }
        this.zza.zzf(this.zzb, this);
    }

    @Override // com.google.android.gms.internal.ads.zzcwg
    public final void zzbD(zzcqm zzcqmVar) {
        this.zzf = zzcqmVar.zzl();
        this.zze = zzdrs.AD_LOADED;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zziB)).booleanValue()) {
            this.zza.zzf(this.zzb, this);
        }
    }

    public final String zzc() {
        return this.zzc;
    }

    public final JSONObject zzd() throws JSONException {
        IBinder iBinder;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("state", this.zze);
        jSONObject.put("format", zzeyc.zza(this.zzd));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zziB)).booleanValue()) {
            jSONObject.put("isOutOfContext", this.zzj);
            if (this.zzj) {
                jSONObject.put("shown", this.zzk);
            }
        }
        zzcuh zzcuhVar = this.zzf;
        JSONObject jSONObject2 = null;
        if (zzcuhVar != null) {
            jSONObject2 = zzi(zzcuhVar);
        } else {
            com.google.android.gms.ads.internal.client.zze zzeVar = this.zzg;
            if (zzeVar != null && (iBinder = zzeVar.zze) != null) {
                zzcuh zzcuhVar2 = (zzcuh) iBinder;
                jSONObject2 = zzi(zzcuhVar2);
                if (zzcuhVar2.zzj().isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(zzh(this.zzg));
                    jSONObject2.put("errors", jSONArray);
                }
            }
        }
        jSONObject.put("responseInfo", jSONObject2);
        return jSONObject;
    }

    public final void zze() {
        this.zzj = true;
    }

    public final void zzf() {
        this.zzk = true;
    }

    public final boolean zzg() {
        return this.zze != zzdrs.AD_REQUESTED;
    }
}
