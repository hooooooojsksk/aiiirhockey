package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzabc {
    private final byte[] zza = new byte[10];
    private boolean zzb;
    private int zzc;
    private long zzd;
    private int zze;
    private int zzf;
    private int zzg;

    public final void zza(zzabb zzabbVar, zzaba zzabaVar) {
        if (this.zzc > 0) {
            zzabbVar.zzs(this.zzd, this.zze, this.zzf, this.zzg, zzabaVar);
            this.zzc = 0;
        }
    }

    public final void zzb() {
        this.zzb = false;
        this.zzc = 0;
    }

    public final void zzc(zzabb zzabbVar, long j, int i, int i2, int i3, zzaba zzabaVar) {
        if (this.zzg > i2 + i3) {
            throw new IllegalStateException("TrueHD chunk samples must be contiguous in the sample queue.");
        }
        if (this.zzb) {
            int i4 = this.zzc;
            int i5 = i4 + 1;
            this.zzc = i5;
            if (i4 == 0) {
                this.zzd = j;
                this.zze = i;
                this.zzf = 0;
            }
            this.zzf += i2;
            this.zzg = i3;
            if (i5 >= 16) {
                zza(zzabbVar, zzabaVar);
            }
        }
    }

    public final void zzd(zzzv zzzvVar) throws IOException {
        if (this.zzb) {
            return;
        }
        zzzvVar.zzh(this.zza, 0, 10);
        zzzvVar.zzj();
        byte[] bArr = this.zza;
        int i = zzyv.zza;
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            this.zzb = true;
        }
    }
}
