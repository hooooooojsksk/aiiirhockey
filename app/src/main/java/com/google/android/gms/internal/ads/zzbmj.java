package com.google.android.gms.internal.ads;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.UUID;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzbmj implements zzblv {
    private final zzblx zza;
    private final zzbly zzb;
    private final zzblr zzc;
    private final String zzd;

    public zzbmj(zzblr zzblrVar, String str, zzbly zzblyVar, zzblx zzblxVar) {
        this.zzc = zzblrVar;
        this.zzd = str;
        this.zzb = zzblyVar;
        this.zza = zzblxVar;
    }

    public static /* bridge */ /* synthetic */ void zzd(zzbmj zzbmjVar, zzbll zzbllVar, zzbls zzblsVar, Object obj, zzbzs zzbzsVar) {
        try {
            com.google.android.gms.ads.internal.zzt.zzp();
            String uuid = UUID.randomUUID().toString();
            zzbho.zzo.zzc(uuid, new zzbmi(zzbmjVar, zzbllVar, zzbzsVar));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(FacebookMediationAdapter.KEY_ID, uuid);
            jSONObject.put("args", zzbmjVar.zzb.zzb(obj));
            zzblsVar.zzl(zzbmjVar.zzd, jSONObject);
        } catch (Exception e) {
            try {
                zzbzsVar.zze(e);
                zzbza.zzh("Unable to invokeJavascript", e);
            } finally {
                zzbllVar.zzb();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzftq
    public final zzfut zza(Object obj) throws Exception {
        return zzb(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzblv
    public final zzfut zzb(Object obj) {
        zzbzs zzbzsVar = new zzbzs();
        zzbll zzb = this.zzc.zzb(null);
        zzb.zzi(new zzbmg(this, zzb, obj, zzbzsVar), new zzbmh(this, zzbzsVar, zzb));
        return zzbzsVar;
    }
}
