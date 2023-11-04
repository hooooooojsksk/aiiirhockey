package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzcmg implements zzclt {
    private final zzbwh zza;

    public zzcmg(zzbwh zzbwhVar) {
        this.zza = zzbwhVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.google.android.gms.internal.ads.zzbwh] */
    /* JADX WARN: Type inference failed for: r4v2, types: [int] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    @Override // com.google.android.gms.internal.ads.zzclt
    public final void zza(JSONObject jSONObject) {
        this.zza.zzb(jSONObject.optBoolean("npa_reset") ? -1 : jSONObject.optBoolean("npa"), jSONObject.optLong("timestamp"));
    }
}
