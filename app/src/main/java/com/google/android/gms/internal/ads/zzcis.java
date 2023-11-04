package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzcis implements zzeur {
    private final Context zza;
    private final com.google.android.gms.ads.internal.client.zzq zzb;
    private final String zzc;
    private final zzchy zzd;
    private final zzcis zze = this;
    private final zzgxl zzf;
    private final zzgxl zzg;
    private final zzgxl zzh;
    private final zzgxl zzi;
    private final zzgxl zzj;
    private final zzgxl zzk;

    public /* synthetic */ zzcis(zzchy zzchyVar, Context context, String str, com.google.android.gms.ads.internal.client.zzq zzqVar, zzcir zzcirVar) {
        zzgxl zzgxlVar;
        zzgxl zzgxlVar2;
        zzgxl zzgxlVar3;
        this.zzd = zzchyVar;
        this.zza = context;
        this.zzb = zzqVar;
        this.zzc = str;
        zzgwy zza = zzgwz.zza(context);
        this.zzf = zza;
        zzgwy zza2 = zzgwz.zza(zzqVar);
        this.zzg = zza2;
        zzgxlVar = zzchyVar.zzo;
        zzgxl zzc = zzgwx.zzc(new zzeic(zzgxlVar));
        this.zzh = zzc;
        zzgxl zzc2 = zzgwx.zzc(zzeih.zza());
        this.zzi = zzc2;
        zzgxl zzc3 = zzgwx.zzc(zzczm.zza());
        this.zzj = zzc3;
        zzgxlVar2 = zzchyVar.zzp;
        zzgxlVar3 = zzchyVar.zzU;
        this.zzk = zzgwx.zzc(new zzeup(zza, zzgxlVar2, zza2, zzgxlVar3, zzc, zzc2, zzeyz.zza(), zzc3));
    }

    @Override // com.google.android.gms.internal.ads.zzeur
    public final zzehh zza() {
        zzcgg zzcggVar;
        Context context = this.zza;
        com.google.android.gms.ads.internal.client.zzq zzqVar = this.zzb;
        String str = this.zzc;
        zzeuo zzeuoVar = (zzeuo) this.zzk.zzb();
        zzeib zzeibVar = (zzeib) this.zzh.zzb();
        zzcggVar = this.zzd.zza;
        zzbzg zzd = zzcggVar.zzd();
        zzgxg.zzb(zzd);
        return new zzehh(context, zzqVar, str, zzeuoVar, zzeibVar, zzd);
    }
}
