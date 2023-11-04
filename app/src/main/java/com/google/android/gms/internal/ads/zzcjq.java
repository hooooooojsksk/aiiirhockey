package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzcjq implements zzewi {
    private final zzchy zza;
    private final zzcjq zzb = this;
    private final zzgxl zzc;
    private final zzgxl zzd;
    private final zzgxl zze;
    private final zzgxl zzf;
    private final zzgxl zzg;
    private final zzgxl zzh;
    private final zzgxl zzi;

    public /* synthetic */ zzcjq(zzchy zzchyVar, Context context, String str, com.google.android.gms.ads.internal.client.zzq zzqVar, zzcjp zzcjpVar) {
        zzgxl zzgxlVar;
        zzgxl zzgxlVar2;
        zzgxl zzgxlVar3;
        zzgxl zzgxlVar4;
        zzgxl zzgxlVar5;
        zzgxl zzgxlVar6;
        this.zza = zzchyVar;
        zzgwy zza = zzgwz.zza(context);
        this.zzc = zza;
        zzgwy zza2 = zzgwz.zza(zzqVar);
        this.zzd = zza2;
        zzgwy zza3 = zzgwz.zza(str);
        this.zze = zza3;
        zzgxlVar = zzchyVar.zzo;
        zzgxl zzc = zzgwx.zzc(new zzeic(zzgxlVar));
        this.zzf = zzc;
        zzgxlVar2 = zzchyVar.zzaE;
        zzgxl zzc2 = zzgwx.zzc(new zzexg(zzgxlVar2));
        this.zzg = zzc2;
        zzgxlVar3 = zzchyVar.zzp;
        zzgxlVar4 = zzchyVar.zzU;
        zzgxl zzc3 = zzgwx.zzc(new zzewg(zza, zzgxlVar3, zzgxlVar4, zzc, zzc2, zzeyz.zza()));
        this.zzh = zzc3;
        zzgxlVar5 = zzchyVar.zzi;
        zzgxlVar6 = zzchyVar.zzV;
        this.zzi = zzgwx.zzc(new zzeik(zza, zza2, zza3, zzc3, zzc, zzc2, zzgxlVar5, zzgxlVar6));
    }

    @Override // com.google.android.gms.internal.ads.zzewi
    public final zzeij zza() {
        return (zzeij) this.zzi.zzb();
    }
}
