package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzcju implements zzexw {
    private final zzchy zza;
    private final zzcju zzb = this;
    private final zzgxl zzc;
    private final zzgxl zzd;
    private final zzgxl zze;
    private final zzgxl zzf;
    private final zzgxl zzg;
    private final zzgxl zzh;
    private final zzgxl zzi;
    private final zzgxl zzj;

    public /* synthetic */ zzcju(zzchy zzchyVar, Context context, String str, zzcjt zzcjtVar) {
        zzgxl zzgxlVar;
        zzgxl zzgxlVar2;
        zzgxl zzgxlVar3;
        zzgxl zzgxlVar4;
        zzgxl zzgxlVar5;
        zzgxl zzgxlVar6;
        zzgxl zzgxlVar7;
        this.zza = zzchyVar;
        zzgwy zza = zzgwz.zza(context);
        this.zzc = zza;
        zzgxlVar = zzchyVar.zzaE;
        zzgxlVar2 = zzchyVar.zzaF;
        zzevw zzevwVar = new zzevw(zza, zzgxlVar, zzgxlVar2);
        this.zzd = zzevwVar;
        zzgxlVar3 = zzchyVar.zzaE;
        zzgxl zzc = zzgwx.zzc(new zzexg(zzgxlVar3));
        this.zze = zzc;
        zzgxl zzc2 = zzgwx.zzc(zzeyu.zza());
        this.zzf = zzc2;
        zzgxlVar4 = zzchyVar.zzp;
        zzgxlVar5 = zzchyVar.zzU;
        zzgxl zzc3 = zzgwx.zzc(new zzexq(zza, zzgxlVar4, zzgxlVar5, zzevwVar, zzc, zzeyz.zza(), zzc2));
        this.zzg = zzc3;
        this.zzh = zzgwx.zzc(new zzeya(zzc3, zzc, zzc2));
        zzgwy zzc4 = zzgwz.zzc(str);
        this.zzi = zzc4;
        zzgxlVar6 = zzchyVar.zzi;
        zzgxlVar7 = zzchyVar.zzV;
        this.zzj = zzgwx.zzc(new zzexu(zzc4, zzc3, zza, zzc, zzc2, zzgxlVar6, zzgxlVar7));
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final zzext zza() {
        return (zzext) this.zzj.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final zzexz zzb() {
        return (zzexz) this.zzh.zzb();
    }
}
