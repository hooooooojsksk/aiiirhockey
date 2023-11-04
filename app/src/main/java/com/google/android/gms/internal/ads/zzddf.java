package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzddf implements zzgwy {
    private final zzdcz zza;
    private final zzgxl zzb;
    private final zzgxl zzc;
    private final zzgxl zzd;
    private final zzgxl zze;

    public zzddf(zzdcz zzdczVar, zzgxl zzgxlVar, zzgxl zzgxlVar2, zzgxl zzgxlVar3, zzgxl zzgxlVar4) {
        this.zza = zzdczVar;
        this.zzb = zzgxlVar;
        this.zzc = zzgxlVar2;
        this.zzd = zzgxlVar3;
        this.zze = zzgxlVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context context = (Context) this.zzb.zzb();
        final zzbzg zza = ((zzcgu) this.zzc).zza();
        final zzeyc zza2 = ((zzcrc) this.zzd).zza();
        final zzeyx zza3 = ((zzcuf) this.zze).zza();
        return new zzdbu(new zzcwc() { // from class: com.google.android.gms.internal.ads.zzdcy
            @Override // com.google.android.gms.internal.ads.zzcwc
            public final void zzn() {
                com.google.android.gms.ads.internal.zzt.zzs().zzn(context, zza.zza, zza2.zzD.toString(), zza3.zzf);
            }
        }, zzbzn.zzf);
    }
}
