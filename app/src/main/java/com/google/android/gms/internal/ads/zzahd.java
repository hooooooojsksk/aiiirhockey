package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzahd implements zzahn {
    private final zzem zza;
    private final zzen zzb;
    private final String zzc;
    private String zzd;
    private zzabb zze;
    private int zzf;
    private int zzg;
    private boolean zzh;
    private long zzi;
    private zzaf zzj;
    private int zzk;
    private long zzl;

    public zzahd() {
        this(null);
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zza(zzen zzenVar) {
        zzdl.zzb(this.zze);
        while (zzenVar.zza() > 0) {
            int i = this.zzf;
            if (i == 0) {
                while (true) {
                    if (zzenVar.zza() <= 0) {
                        break;
                    } else if (!this.zzh) {
                        this.zzh = zzenVar.zzk() == 11;
                    } else {
                        int zzk = zzenVar.zzk();
                        if (zzk == 119) {
                            this.zzh = false;
                            this.zzf = 1;
                            zzen zzenVar2 = this.zzb;
                            zzenVar2.zzH()[0] = 11;
                            zzenVar2.zzH()[1] = 119;
                            this.zzg = 2;
                            break;
                        }
                        this.zzh = zzk == 11;
                    }
                }
            } else if (i == 1) {
                byte[] zzH = this.zzb.zzH();
                int min = Math.min(zzenVar.zza(), 128 - this.zzg);
                zzenVar.zzB(zzH, this.zzg, min);
                int i2 = this.zzg + min;
                this.zzg = i2;
                if (i2 == 128) {
                    this.zza.zzj(0);
                    zzyu zze = zzyv.zze(this.zza);
                    zzaf zzafVar = this.zzj;
                    if (zzafVar == null || zze.zzc != zzafVar.zzz || zze.zzb != zzafVar.zzA || !zzew.zzU(zze.zza, zzafVar.zzm)) {
                        zzad zzadVar = new zzad();
                        zzadVar.zzH(this.zzd);
                        zzadVar.zzS(zze.zza);
                        zzadVar.zzw(zze.zzc);
                        zzadVar.zzT(zze.zzb);
                        zzadVar.zzK(this.zzc);
                        zzadVar.zzO(zze.zzf);
                        if ("audio/ac3".equals(zze.zza)) {
                            zzadVar.zzv(zze.zzf);
                        }
                        zzaf zzY = zzadVar.zzY();
                        this.zzj = zzY;
                        this.zze.zzk(zzY);
                    }
                    this.zzk = zze.zzd;
                    this.zzi = (zze.zze * 1000000) / this.zzj.zzA;
                    this.zzb.zzF(0);
                    this.zze.zzq(this.zzb, 128);
                    this.zzf = 2;
                }
            } else {
                int min2 = Math.min(zzenVar.zza(), this.zzk - this.zzg);
                this.zze.zzq(zzenVar, min2);
                int i3 = this.zzg + min2;
                this.zzg = i3;
                int i4 = this.zzk;
                if (i3 == i4) {
                    long j = this.zzl;
                    if (j != -9223372036854775807L) {
                        this.zze.zzs(j, 1, i4, 0, null);
                        this.zzl += this.zzi;
                    }
                    this.zzf = 0;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zzb(zzzx zzzxVar, zzaiz zzaizVar) {
        zzaizVar.zzc();
        this.zzd = zzaizVar.zzb();
        this.zze = zzzxVar.zzv(zzaizVar.zza(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zzd(long j, int i) {
        if (j != -9223372036854775807L) {
            this.zzl = j;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zze() {
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = false;
        this.zzl = -9223372036854775807L;
    }

    public zzahd(String str) {
        zzem zzemVar = new zzem(new byte[128], 128);
        this.zza = zzemVar;
        this.zzb = new zzen(zzemVar.zza);
        this.zzf = 0;
        this.zzl = -9223372036854775807L;
        this.zzc = str;
    }
}
