package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzbgx implements zzbhp {
    @Override // com.google.android.gms.internal.ads.zzbhp
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        JSONObject zzb;
        zzcei zzceiVar = (zzcei) obj;
        zzbdk zzK = zzceiVar.zzK();
        if (zzK == null || (zzb = zzK.zzb()) == null) {
            zzceiVar.zze("nativeClickMetaReady", new JSONObject());
        } else {
            zzceiVar.zze("nativeClickMetaReady", zzb);
        }
    }
}
