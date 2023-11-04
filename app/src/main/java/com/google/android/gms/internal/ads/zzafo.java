package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzafo implements zzafm {
    private final int zza;
    private final int zzb;
    private final zzen zzc;

    public zzafo(zzafi zzafiVar, zzaf zzafVar) {
        zzen zzenVar = zzafiVar.zza;
        this.zzc = zzenVar;
        zzenVar.zzF(12);
        int zzn = zzenVar.zzn();
        if ("audio/raw".equals(zzafVar.zzm)) {
            int zzo = zzew.zzo(zzafVar.zzB, zzafVar.zzz);
            if (zzn == 0 || zzn % zzo != 0) {
                zzee.zze("AtomParsers", "Audio sample size mismatch. stsd sample size: " + zzo + ", stsz sample size: " + zzn);
                zzn = zzo;
            }
        }
        this.zza = zzn == 0 ? -1 : zzn;
        this.zzb = zzenVar.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzafm
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzafm
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzafm
    public final int zzc() {
        int i = this.zza;
        return i == -1 ? this.zzc.zzn() : i;
    }
}
