package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzdnm implements zzgwy {
    private final zzgxl zza;
    private final zzgxl zzb;
    private final zzgxl zzc;
    private final zzgxl zzd;
    private final zzgxl zze;

    public zzdnm(zzgxl zzgxlVar, zzgxl zzgxlVar2, zzgxl zzgxlVar3, zzgxl zzgxlVar4, zzgxl zzgxlVar5) {
        this.zza = zzgxlVar;
        this.zzb = zzgxlVar2;
        this.zzc = zzgxlVar3;
        this.zzd = zzgxlVar4;
        this.zze = zzgxlVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza = ((zzcgj) this.zza).zza();
        final String zzb = ((zzdtx) this.zzb).zzb();
        zzbzg zza2 = ((zzcgu) this.zzc).zza();
        final zzawo zzawoVar = (zzawo) this.zzd.zzb();
        final String str = (String) this.zze.zzb();
        zzawe zzaweVar = new zzawe(new zzawk(zza));
        zzazd zza3 = zzaze.zza();
        zza3.zza(zza2.zzb);
        zza3.zzc(zza2.zzc);
        zza3.zzb(true != zza2.zzd ? 2 : 0);
        final zzaze zzazeVar = (zzaze) zza3.zzal();
        zzaweVar.zzb(new zzawd() { // from class: com.google.android.gms.internal.ads.zzdnl
            @Override // com.google.android.gms.internal.ads.zzawd
            public final void zza(zzaxt zzaxtVar) {
                zzawo zzawoVar2 = zzawo.this;
                String str2 = zzb;
                zzaze zzazeVar2 = zzazeVar;
                String str3 = str;
                zzawp zzawpVar = (zzawp) zzaxtVar.zza().zzaB();
                zzawpVar.zza(zzawoVar2);
                zzaxtVar.zze(zzawpVar);
                zzaxl zzaxlVar = (zzaxl) zzaxtVar.zzb().zzaB();
                zzaxlVar.zza(str2);
                zzaxlVar.zzb(zzazeVar2);
                zzaxtVar.zzg(zzaxlVar);
                zzaxtVar.zzh(str3);
            }
        });
        return zzaweVar;
    }
}
