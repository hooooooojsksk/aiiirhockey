package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzcuk implements zzgwy {
    private final zzcuj zza;
    private final zzgxl zzb;
    private final zzgxl zzc;
    private final zzgxl zzd;
    private final zzgxl zze;

    public zzcuk(zzcuj zzcujVar, zzgxl zzgxlVar, zzgxl zzgxlVar2, zzgxl zzgxlVar3, zzgxl zzgxlVar4) {
        this.zza = zzcujVar;
        this.zzb = zzgxlVar;
        this.zzc = zzgxlVar2;
        this.zzd = zzgxlVar3;
        this.zze = zzgxlVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    public final /* synthetic */ Object zzb() {
        Context context = (Context) this.zzb.zzb();
        zzbzg zza = ((zzcgu) this.zzc).zza();
        zzeyc zza2 = ((zzcrc) this.zzd).zza();
        zzbvx zzbvxVar = new zzbvx();
        if (zza2.zzB != null) {
            zzeyh zzeyhVar = zza2.zzt;
            return new zzbvw(context, zza, zza2.zzB, zzeyhVar == null ? null : zzeyhVar.zzb, zzbvxVar, null);
        }
        return null;
    }
}
