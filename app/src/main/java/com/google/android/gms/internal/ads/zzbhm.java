package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzbhm implements zzbhp {
    @Override // com.google.android.gms.internal.ads.zzbhp
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcei zzceiVar = (zzcei) obj;
        if (map.keySet().contains("start")) {
            zzceiVar.zzN().zzl();
        } else if (map.keySet().contains("stop")) {
            zzceiVar.zzN().zzm();
        } else if (map.keySet().contains("cancel")) {
            zzceiVar.zzN().zzk();
        }
    }
}
