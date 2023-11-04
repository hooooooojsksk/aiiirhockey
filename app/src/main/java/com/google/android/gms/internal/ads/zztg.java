package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zztg implements zzsq, zzsp {
    private final zzsq zza;
    private final long zzb;
    private zzsp zzc;

    public zztg(zzsq zzsqVar, long j) {
        this.zza = zzsqVar;
        this.zzb = j;
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final long zza(long j, zzkq zzkqVar) {
        return this.zza.zza(j - this.zzb, zzkqVar) + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzsq, com.google.android.gms.internal.ads.zzul
    public final long zzb() {
        long zzb = this.zza.zzb();
        if (zzb == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return zzb + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzsq, com.google.android.gms.internal.ads.zzul
    public final long zzc() {
        long zzc = this.zza.zzc();
        if (zzc == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return zzc + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final long zzd() {
        long zzd = this.zza.zzd();
        if (zzd == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return zzd + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final long zze(long j) {
        return this.zza.zze(j - this.zzb) + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final long zzf(zzwe[] zzweVarArr, boolean[] zArr, zzuj[] zzujVarArr, boolean[] zArr2, long j) {
        zzuj[] zzujVarArr2 = new zzuj[zzujVarArr.length];
        int i = 0;
        while (true) {
            zzuj zzujVar = null;
            if (i >= zzujVarArr.length) {
                break;
            }
            zzth zzthVar = (zzth) zzujVarArr[i];
            if (zzthVar != null) {
                zzujVar = zzthVar.zzc();
            }
            zzujVarArr2[i] = zzujVar;
            i++;
        }
        long zzf = this.zza.zzf(zzweVarArr, zArr, zzujVarArr2, zArr2, j - this.zzb);
        for (int i2 = 0; i2 < zzujVarArr.length; i2++) {
            zzuj zzujVar2 = zzujVarArr2[i2];
            if (zzujVar2 == null) {
                zzujVarArr[i2] = null;
            } else {
                zzuj zzujVar3 = zzujVarArr[i2];
                if (zzujVar3 == null || ((zzth) zzujVar3).zzc() != zzujVar2) {
                    zzujVarArr[i2] = new zzth(zzujVar2, this.zzb);
                }
            }
        }
        return zzf + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    public final /* bridge */ /* synthetic */ void zzg(zzul zzulVar) {
        zzsq zzsqVar = (zzsq) zzulVar;
        zzsp zzspVar = this.zzc;
        Objects.requireNonNull(zzspVar);
        zzspVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final zzur zzh() {
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final void zzj(long j, boolean z) {
        this.zza.zzj(j - this.zzb, false);
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final void zzk() throws IOException {
        this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final void zzl(zzsp zzspVar, long j) {
        this.zzc = zzspVar;
        this.zza.zzl(this, j - this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzsq, com.google.android.gms.internal.ads.zzul
    public final void zzm(long j) {
        this.zza.zzm(j - this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzsq, com.google.android.gms.internal.ads.zzul
    public final boolean zzo(long j) {
        return this.zza.zzo(j - this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzsq, com.google.android.gms.internal.ads.zzul
    public final boolean zzp() {
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzsp
    public final void zzi(zzsq zzsqVar) {
        zzsp zzspVar = this.zzc;
        Objects.requireNonNull(zzspVar);
        zzspVar.zzi(this);
    }
}
