package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzagl implements zzaax {
    final /* synthetic */ zzagm zza;

    public /* synthetic */ zzagl(zzagm zzagmVar, zzagk zzagkVar) {
        this.zza = zzagmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final long zze() {
        zzagy zzagyVar;
        long j;
        zzagm zzagmVar = this.zza;
        zzagyVar = zzagmVar.zzd;
        j = zzagmVar.zzf;
        return zzagyVar.zzf(j);
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final zzaav zzg(long j) {
        zzagy zzagyVar;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        zzagm zzagmVar = this.zza;
        zzagyVar = zzagmVar.zzd;
        long zzg = zzagyVar.zzg(j);
        j2 = zzagmVar.zzb;
        j3 = zzagmVar.zzc;
        j4 = zzagmVar.zzb;
        long j8 = zzg * (j3 - j4);
        j5 = zzagmVar.zzf;
        j6 = zzagmVar.zzb;
        j7 = zzagmVar.zzc;
        zzaay zzaayVar = new zzaay(j, zzew.zzr((j2 + (j8 / j5)) - 30000, j6, j7 - 1));
        return new zzaav(zzaayVar, zzaayVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final boolean zzh() {
        return true;
    }
}
