package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzbmi implements zzbic {
    final /* synthetic */ zzbmj zza;
    private final zzbll zzb;
    private final zzbzs zzc;

    public zzbmi(zzbmj zzbmjVar, zzbll zzbllVar, zzbzs zzbzsVar) {
        this.zza = zzbmjVar;
        this.zzb = zzbllVar;
        this.zzc = zzbzsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbic
    public final void zza(String str) {
        zzbll zzbllVar;
        try {
            if (str == null) {
                this.zzc.zze(new zzblu());
            } else {
                this.zzc.zze(new zzblu(str));
            }
            zzbllVar = this.zzb;
        } catch (IllegalStateException unused) {
            zzbllVar = this.zzb;
        } catch (Throwable th) {
            this.zzb.zzb();
            throw th;
        }
        zzbllVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbic
    public final void zzb(JSONObject jSONObject) {
        zzbll zzbllVar;
        zzblx zzblxVar;
        try {
            try {
                zzbzs zzbzsVar = this.zzc;
                zzblxVar = this.zza.zza;
                zzbzsVar.zzd(zzblxVar.zza(jSONObject));
                zzbllVar = this.zzb;
            } catch (IllegalStateException unused) {
                zzbllVar = this.zzb;
            } catch (JSONException e) {
                this.zzc.zze(e);
                zzbllVar = this.zzb;
            }
            zzbllVar.zzb();
        } catch (Throwable th) {
            this.zzb.zzb();
            throw th;
        }
    }
}
