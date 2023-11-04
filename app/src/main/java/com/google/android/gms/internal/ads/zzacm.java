package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzacm implements zzaax {
    final /* synthetic */ zzaax zza;
    final /* synthetic */ zzacn zzb;

    public zzacm(zzacn zzacnVar, zzaax zzaaxVar) {
        this.zzb = zzacnVar;
        this.zza = zzaaxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final long zze() {
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final zzaav zzg(long j) {
        long j2;
        long j3;
        zzaav zzg = this.zza.zzg(j);
        zzaay zzaayVar = zzg.zza;
        long j4 = zzaayVar.zzb;
        long j5 = zzaayVar.zzc;
        j2 = this.zzb.zzb;
        zzaay zzaayVar2 = new zzaay(j4, j5 + j2);
        zzaay zzaayVar3 = zzg.zzb;
        long j6 = zzaayVar3.zzb;
        long j7 = zzaayVar3.zzc;
        j3 = this.zzb.zzb;
        return new zzaav(zzaayVar2, new zzaay(j6, j7 + j3));
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final boolean zzh() {
        return this.zza.zzh();
    }
}
