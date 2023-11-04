package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public abstract class zzm implements zzcg {
    protected final zzcm zza = new zzcm();

    public abstract void zza(int i, long j, int i2, boolean z);

    @Override // com.google.android.gms.internal.ads.zzcg
    public final boolean zzb() {
        zzcn zzq = zzq();
        return !zzq.zzo() && zzq.zze(zzg(), this.zza, 0L).zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final boolean zzc() {
        zzcn zzq = zzq();
        return !zzq.zzo() && zzq.zze(zzg(), this.zza, 0L).zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final boolean zzd() {
        zzcn zzq = zzq();
        return !zzq.zzo() && zzq.zze(zzg(), this.zza, 0L).zzh;
    }
}
