package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzbib implements zzbic {
    final /* synthetic */ zzbzs zza;

    public zzbib(zzbid zzbidVar, zzbzs zzbzsVar) {
        this.zza = zzbzsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbic
    public final void zza(String str) {
        this.zza.zze(new zzblu(str));
    }

    @Override // com.google.android.gms.internal.ads.zzbic
    public final void zzb(JSONObject jSONObject) {
        this.zza.zzd(jSONObject);
    }
}
