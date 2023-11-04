package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzcmu implements zzfuf {
    final /* synthetic */ String zza;
    final /* synthetic */ zzcmv zzb;

    public zzcmu(zzcmv zzcmvVar, String str) {
        this.zzb = zzcmvVar;
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final void zza(Throwable th) {
        zzezg zzezgVar;
        zzffb zzffbVar;
        zzeyo zzeyoVar;
        zzeyc zzeycVar;
        zzeyc zzeycVar2;
        zzcmv zzcmvVar = this.zzb;
        zzezgVar = zzcmvVar.zzh;
        zzffbVar = zzcmvVar.zzg;
        zzeyoVar = zzcmvVar.zze;
        zzeycVar = zzcmvVar.zzf;
        String str = this.zza;
        zzeycVar2 = zzcmvVar.zzf;
        zzezgVar.zza(zzffbVar.zzd(zzeyoVar, zzeycVar, false, str, null, zzeycVar2.zzd));
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzezg zzezgVar;
        zzffb zzffbVar;
        zzeyo zzeyoVar;
        zzeyc zzeycVar;
        zzeyc zzeycVar2;
        String str = (String) obj;
        zzcmv zzcmvVar = this.zzb;
        zzezgVar = zzcmvVar.zzh;
        zzffbVar = zzcmvVar.zzg;
        zzeyoVar = zzcmvVar.zze;
        zzeycVar = zzcmvVar.zzf;
        String str2 = this.zza;
        zzeycVar2 = zzcmvVar.zzf;
        zzezgVar.zza(zzffbVar.zzd(zzeyoVar, zzeycVar, false, str2, str, zzeycVar2.zzd));
    }
}
