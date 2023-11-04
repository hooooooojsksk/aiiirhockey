package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzefp implements zzeav {
    private final zzegt zza;

    public zzefp(zzegt zzegtVar) {
        this.zza = zzegtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeav
    public final zzeaw zza(String str, JSONObject jSONObject) throws zzezc {
        zzbpc zza = this.zza.zza(str);
        if (zza == null) {
            return null;
        }
        return new zzeaw(zza, new zzecq(), str);
    }
}
