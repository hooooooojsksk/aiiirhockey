package com.google.android.gms.internal.ads;

import kotlin.UByte;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzafw {
    public final zzabb zza;
    public zzagj zzd;
    public zzafs zze;
    public int zzf;
    public int zzg;
    public int zzh;
    public int zzi;
    private boolean zzl;
    public final zzagi zzb = new zzagi();
    public final zzen zzc = new zzen();
    private final zzen zzj = new zzen(1);
    private final zzen zzk = new zzen();

    public zzafw(zzabb zzabbVar, zzagj zzagjVar, zzafs zzafsVar) {
        this.zza = zzabbVar;
        this.zzd = zzagjVar;
        this.zze = zzafsVar;
        zzh(zzagjVar, zzafsVar);
    }

    public final int zza() {
        int i;
        if (this.zzl) {
            i = this.zzb.zzj[this.zzf] ? 1 : 0;
        } else {
            i = this.zzd.zzg[this.zzf];
        }
        return zzf() != null ? i | 1073741824 : i;
    }

    public final int zzb() {
        return !this.zzl ? this.zzd.zzd[this.zzf] : this.zzb.zzh[this.zzf];
    }

    public final int zzc(int i, int i2) {
        zzen zzenVar;
        zzagh zzf = zzf();
        if (zzf == null) {
            return 0;
        }
        int i3 = zzf.zzd;
        if (i3 != 0) {
            zzenVar = this.zzb.zzn;
        } else {
            byte[] bArr = (byte[]) zzew.zzH(zzf.zze);
            zzen zzenVar2 = this.zzk;
            int length = bArr.length;
            zzenVar2.zzD(bArr, length);
            zzenVar = this.zzk;
            i3 = length;
        }
        boolean zzb = this.zzb.zzb(this.zzf);
        boolean z = zzb || i2 != 0;
        zzen zzenVar3 = this.zzj;
        zzenVar3.zzH()[0] = (byte) ((true != z ? 0 : 128) | i3);
        zzenVar3.zzF(0);
        this.zza.zzr(this.zzj, 1, 1);
        this.zza.zzr(zzenVar, i3, 1);
        if (z) {
            if (!zzb) {
                this.zzc.zzC(8);
                zzen zzenVar4 = this.zzc;
                byte[] zzH = zzenVar4.zzH();
                zzH[0] = 0;
                zzH[1] = 1;
                zzH[2] = 0;
                zzH[3] = (byte) i2;
                zzH[4] = (byte) ((i >> 24) & 255);
                zzH[5] = (byte) ((i >> 16) & 255);
                zzH[6] = (byte) ((i >> 8) & 255);
                zzH[7] = (byte) (i & 255);
                this.zza.zzr(zzenVar4, 8, 1);
                return i3 + 9;
            }
            zzen zzenVar5 = this.zzb.zzn;
            int zzo = zzenVar5.zzo();
            zzenVar5.zzG(-2);
            int i4 = (zzo * 6) + 2;
            if (i2 != 0) {
                this.zzc.zzC(i4);
                byte[] zzH2 = this.zzc.zzH();
                zzenVar5.zzB(zzH2, 0, i4);
                int i5 = (((zzH2[2] & UByte.MAX_VALUE) << 8) | (zzH2[3] & UByte.MAX_VALUE)) + i2;
                zzH2[2] = (byte) ((i5 >> 8) & 255);
                zzH2[3] = (byte) (i5 & 255);
                zzenVar5 = this.zzc;
            }
            this.zza.zzr(zzenVar5, i4, 1);
            return i3 + 1 + i4;
        }
        return i3 + 1;
    }

    public final long zzd() {
        return !this.zzl ? this.zzd.zzc[this.zzf] : this.zzb.zzf[this.zzh];
    }

    public final long zze() {
        if (this.zzl) {
            zzagi zzagiVar = this.zzb;
            return zzagiVar.zzi[this.zzf];
        }
        return this.zzd.zzf[this.zzf];
    }

    public final zzagh zzf() {
        if (this.zzl) {
            zzafs zzafsVar = this.zzb.zza;
            int i = zzew.zza;
            int i2 = zzafsVar.zza;
            zzagh zzaghVar = this.zzb.zzm;
            if (zzaghVar == null) {
                zzaghVar = this.zzd.zza.zza(i2);
            }
            if (zzaghVar == null || !zzaghVar.zza) {
                return null;
            }
            return zzaghVar;
        }
        return null;
    }

    public final void zzh(zzagj zzagjVar, zzafs zzafsVar) {
        this.zzd = zzagjVar;
        this.zze = zzafsVar;
        this.zza.zzk(zzagjVar.zza.zzf);
        zzi();
    }

    public final void zzi() {
        zzagi zzagiVar = this.zzb;
        zzagiVar.zzd = 0;
        zzagiVar.zzp = 0L;
        zzagiVar.zzq = false;
        zzagiVar.zzk = false;
        zzagiVar.zzo = false;
        zzagiVar.zzm = null;
        this.zzf = 0;
        this.zzh = 0;
        this.zzg = 0;
        this.zzi = 0;
        this.zzl = false;
    }

    public final boolean zzk() {
        this.zzf++;
        if (this.zzl) {
            int i = this.zzg + 1;
            this.zzg = i;
            int[] iArr = this.zzb.zzg;
            int i2 = this.zzh;
            if (i == iArr[i2]) {
                this.zzh = i2 + 1;
                this.zzg = 0;
                return false;
            }
            return true;
        }
        return false;
    }
}
