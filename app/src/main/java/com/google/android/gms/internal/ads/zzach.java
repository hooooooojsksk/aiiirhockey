package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzach extends zzacg {
    private final zzen zzb;
    private final zzen zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    public zzach(zzabb zzabbVar) {
        super(zzabbVar);
        this.zzb = new zzen(zzaar.zza);
        this.zzc = new zzen(4);
    }

    @Override // com.google.android.gms.internal.ads.zzacg
    protected final boolean zza(zzen zzenVar) throws zzacf {
        int zzk = zzenVar.zzk();
        int i = zzk >> 4;
        int i2 = zzk & 15;
        if (i2 == 7) {
            this.zzg = i;
            return i != 5;
        }
        throw new zzacf("Video format not supported: " + i2);
    }

    @Override // com.google.android.gms.internal.ads.zzacg
    protected final boolean zzb(zzen zzenVar, long j) throws zzbu {
        int zzk = zzenVar.zzk();
        long zzf = zzenVar.zzf();
        if (zzk == 0) {
            if (!this.zze) {
                zzen zzenVar2 = new zzen(new byte[zzenVar.zza()]);
                zzenVar.zzB(zzenVar2.zzH(), 0, zzenVar.zza());
                zzyz zza = zzyz.zza(zzenVar2);
                this.zzd = zza.zzb;
                zzad zzadVar = new zzad();
                zzadVar.zzS("video/avc");
                zzadVar.zzx(zza.zzf);
                zzadVar.zzX(zza.zzc);
                zzadVar.zzF(zza.zzd);
                zzadVar.zzP(zza.zze);
                zzadVar.zzI(zza.zza);
                this.zza.zzk(zzadVar.zzY());
                this.zze = true;
                return false;
            }
        } else if (zzk == 1 && this.zze) {
            int i = this.zzg == 1 ? 1 : 0;
            if (this.zzf || i != 0) {
                byte[] zzH = this.zzc.zzH();
                zzH[0] = 0;
                zzH[1] = 0;
                zzH[2] = 0;
                int i2 = 4 - this.zzd;
                int i3 = 0;
                while (zzenVar.zza() > 0) {
                    zzenVar.zzB(this.zzc.zzH(), i2, this.zzd);
                    this.zzc.zzF(0);
                    int zzn = this.zzc.zzn();
                    this.zzb.zzF(0);
                    this.zza.zzq(this.zzb, 4);
                    this.zza.zzq(zzenVar, zzn);
                    i3 = i3 + 4 + zzn;
                }
                this.zza.zzs(j + (zzf * 1000), i, i3, 0, null);
                this.zzf = true;
                return true;
            }
            return false;
        }
        return false;
    }
}
