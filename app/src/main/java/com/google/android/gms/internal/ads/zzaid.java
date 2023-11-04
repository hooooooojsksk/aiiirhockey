package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzaid implements zzaim {
    private zzaf zza;
    private zzeu zzb;
    private zzabb zzc;

    public zzaid(String str) {
        zzad zzadVar = new zzad();
        zzadVar.zzS(str);
        this.zza = zzadVar.zzY();
    }

    @Override // com.google.android.gms.internal.ads.zzaim
    public final void zza(zzen zzenVar) {
        zzdl.zzb(this.zzb);
        int i = zzew.zza;
        long zzd = this.zzb.zzd();
        long zze = this.zzb.zze();
        if (zzd == -9223372036854775807L || zze == -9223372036854775807L) {
            return;
        }
        zzaf zzafVar = this.zza;
        if (zze != zzafVar.zzq) {
            zzad zzb = zzafVar.zzb();
            zzb.zzW(zze);
            zzaf zzY = zzb.zzY();
            this.zza = zzY;
            this.zzc.zzk(zzY);
        }
        int zza = zzenVar.zza();
        this.zzc.zzq(zzenVar, zza);
        this.zzc.zzs(zzd, 1, zza, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaim
    public final void zzb(zzeu zzeuVar, zzzx zzzxVar, zzaiz zzaizVar) {
        this.zzb = zzeuVar;
        zzaizVar.zzc();
        zzabb zzv = zzzxVar.zzv(zzaizVar.zza(), 5);
        this.zzc = zzv;
        zzv.zzk(this.zza);
    }
}
