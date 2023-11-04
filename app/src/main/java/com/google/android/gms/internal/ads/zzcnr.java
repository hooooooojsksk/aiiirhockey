package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzcnr implements zzgwy {
    private final zzgxl zza;

    public zzcnr(zzgxl zzgxlVar) {
        this.zza = zzgxlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    public final /* bridge */ /* synthetic */ Object zzb() {
        try {
            return new JSONObject(((zzcrc) this.zza).zza().zzA);
        } catch (JSONException unused) {
            return null;
        }
    }
}
