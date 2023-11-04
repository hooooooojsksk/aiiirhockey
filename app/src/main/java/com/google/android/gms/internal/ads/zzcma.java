package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzcma implements zzclt {
    private final zzdsf zza;

    public zzcma(zzdsf zzdsfVar) {
        this.zza = zzdsfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzclt
    public final void zza(JSONObject jSONObject) {
        if (jSONObject != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zziv)).booleanValue()) {
                this.zza.zzl(jSONObject);
            }
        }
    }
}
