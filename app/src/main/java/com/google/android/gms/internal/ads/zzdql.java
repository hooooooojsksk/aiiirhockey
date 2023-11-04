package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzdql {
    private Long zza;
    private final String zzb;
    private String zzc;
    private Integer zzd;
    private String zze;
    private Integer zzf;

    public /* synthetic */ zzdql(String str, zzdqk zzdqkVar) {
        this.zzb = str;
    }

    public static /* bridge */ /* synthetic */ String zza(zzdql zzdqlVar) {
        String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zziR);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("objectId", zzdqlVar.zza);
            jSONObject.put("eventCategory", zzdqlVar.zzb);
            jSONObject.putOpt(NotificationCompat.CATEGORY_EVENT, zzdqlVar.zzc);
            jSONObject.putOpt("errorCode", zzdqlVar.zzd);
            jSONObject.putOpt("rewardType", zzdqlVar.zze);
            jSONObject.putOpt("rewardAmount", zzdqlVar.zzf);
        } catch (JSONException unused) {
            zzbza.zzj("Could not convert parameters to JSON.");
        }
        String jSONObject2 = jSONObject.toString();
        return str + "(\"h5adsEvent\"," + jSONObject2 + ");";
    }
}
