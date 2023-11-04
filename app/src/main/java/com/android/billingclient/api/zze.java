package com.android.billingclient.api;

import java.util.Arrays;
import org.json.JSONObject;

/* compiled from: com.android.billingclient:billing@@5.0.0 */
/* loaded from: classes.dex */
public final class zze {
    private final String zza;
    private final String zzb;

    public /* synthetic */ zze(JSONObject jSONObject, zzd zzdVar) {
        this.zza = jSONObject.optString("productId");
        this.zzb = jSONObject.optString("productType");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zze) {
            zze zzeVar = (zze) obj;
            return this.zza.equals(zzeVar.zza) && this.zzb.equals(zzeVar.zzb);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        return String.format("{id: %s, type: %s}", this.zza, this.zzb);
    }
}
