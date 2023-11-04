package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzcii implements zzetd {
    private final zzchy zza;
    private final zzcii zzb = this;
    private final zzgxl zzc;
    private final zzgxl zzd;
    private final zzgxl zze;
    private final zzgxl zzf;
    private final zzgxl zzg;
    private final zzgxl zzh;

    public /* synthetic */ zzcii(zzchy zzchyVar, Context context, String str, zzcih zzcihVar) {
        zzgxl zzgxlVar;
        zzgxl zzgxlVar2;
        zzgxl zzgxlVar3;
        zzgxl zzgxlVar4;
        zzgxl zzgxlVar5;
        zzgxl zzgxlVar6;
        zzgxl zzgxlVar7;
        zzgxl zzgxlVar8;
        this.zza = zzchyVar;
        zzgwy zza = zzgwz.zza(context);
        this.zzc = zza;
        zzgwy zza2 = zzgwz.zza(str);
        this.zzd = zza2;
        zzgxlVar = zzchyVar.zzaE;
        zzgxlVar2 = zzchyVar.zzaF;
        zzevv zzevvVar = new zzevv(zza, zzgxlVar, zzgxlVar2);
        this.zze = zzevvVar;
        zzgxlVar3 = zzchyVar.zzaE;
        zzgxl zzc = zzgwx.zzc(new zzeub(zzgxlVar3));
        this.zzf = zzc;
        zzgxlVar4 = zzchyVar.zzp;
        zzgxlVar5 = zzchyVar.zzU;
        zzeyz zza3 = zzeyz.zza();
        zzgxlVar6 = zzchyVar.zzi;
        zzgxl zzc2 = zzgwx.zzc(new zzeud(zza, zzgxlVar4, zzgxlVar5, zzevvVar, zzc, zza3, zzgxlVar6));
        this.zzg = zzc2;
        zzgxlVar7 = zzchyVar.zzU;
        zzgxlVar8 = zzchyVar.zzi;
        this.zzh = zzgwx.zzc(new zzeuj(zzgxlVar7, zza, zza2, zzc2, zzc, zzgxlVar8));
    }

    @Override // com.google.android.gms.internal.ads.zzetd
    public final zzeui zza() {
        return (zzeui) this.zzh.zzb();
    }
}
