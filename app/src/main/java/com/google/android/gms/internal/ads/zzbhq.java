package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzbhq implements zzbhp {
    private final zzbhr zza;

    public zzbhq(zzbhr zzbhrVar, byte[] bArr) {
        this.zza = zzbhrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbhp
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcei zzceiVar = (zzcei) obj;
        boolean equals = "1".equals(map.get("transparentBackground"));
        boolean equals2 = "1".equals(map.get("blur"));
        float f = 0.0f;
        try {
            if (map.get("blurRadius") != null) {
                f = Float.parseFloat((String) map.get("blurRadius"));
            }
        } catch (NumberFormatException e) {
            zzbza.zzh("Fail to parse float", e);
        }
        this.zza.zzc(equals);
        this.zza.zzb(equals2, f);
        zzceiVar.zzat(equals);
    }
}
