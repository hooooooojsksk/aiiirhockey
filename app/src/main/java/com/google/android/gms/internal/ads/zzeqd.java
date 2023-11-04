package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzeqd implements zzepm {
    private final AdvertisingIdClient.Info zza;
    private final String zzb;
    private final zzfks zzc;

    public zzeqd(AdvertisingIdClient.Info info, String str, zzfks zzfksVar) {
        this.zza = info;
        this.zzb = str;
        this.zzc = zzfksVar;
    }

    @Override // com.google.android.gms.internal.ads.zzepm
    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        try {
            JSONObject zzf = com.google.android.gms.ads.internal.util.zzbu.zzf((JSONObject) obj, "pii");
            AdvertisingIdClient.Info info = this.zza;
            if (info == null || TextUtils.isEmpty(info.getId())) {
                String str = this.zzb;
                if (str != null) {
                    zzf.put("pdid", str);
                    zzf.put("pdidtype", "ssaid");
                    return;
                }
                return;
            }
            zzf.put("rdid", this.zza.getId());
            zzf.put("is_lat", this.zza.isLimitAdTrackingEnabled());
            zzf.put("idtype", "adid");
            zzfks zzfksVar = this.zzc;
            if (zzfksVar.zzc()) {
                zzf.put("paidv1_id_android_3p", zzfksVar.zzb());
                zzf.put("paidv1_creation_time_android_3p", this.zzc.zza());
            }
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed putting Ad ID.", e);
        }
    }
}
