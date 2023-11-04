package com.google.android.gms.internal.ads;

import java.io.IOException;
import kotlin.UByte;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzabx implements zzzf {
    private final zzaah zza;
    private final int zzb;
    private final zzaac zzc = new zzaac();

    public /* synthetic */ zzabx(zzaah zzaahVar, int i, zzabw zzabwVar) {
        this.zza = zzaahVar;
        this.zzb = i;
    }

    private final long zzc(zzzv zzzvVar) throws IOException {
        while (zzzvVar.zze() < zzzvVar.zzd() - 6) {
            zzaah zzaahVar = this.zza;
            int i = this.zzb;
            zzaac zzaacVar = this.zzc;
            long zze = zzzvVar.zze();
            byte[] bArr = new byte[2];
            zzzk zzzkVar = (zzzk) zzzvVar;
            zzzkVar.zzm(bArr, 0, 2, false);
            if ((((bArr[0] & UByte.MAX_VALUE) << 8) | (bArr[1] & UByte.MAX_VALUE)) != i) {
                zzzvVar.zzj();
                zzzkVar.zzl((int) (zze - zzzvVar.zzf()), false);
            } else {
                zzen zzenVar = new zzen(16);
                System.arraycopy(bArr, 0, zzenVar.zzH(), 0, 2);
                zzenVar.zzE(zzzy.zza(zzzvVar, zzenVar.zzH(), 2, 14));
                zzzvVar.zzj();
                zzzkVar.zzl((int) (zze - zzzvVar.zzf()), false);
                if (zzaad.zzc(zzenVar, zzaahVar, i, zzaacVar)) {
                    break;
                }
            }
            zzzkVar.zzl(1, false);
        }
        if (zzzvVar.zze() >= zzzvVar.zzd() - 6) {
            ((zzzk) zzzvVar).zzl((int) (zzzvVar.zzd() - zzzvVar.zze()), false);
            return this.zza.zzj;
        }
        return this.zzc.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final zzze zza(zzzv zzzvVar, long j) throws IOException {
        long zzf = zzzvVar.zzf();
        long zzc = zzc(zzzvVar);
        long zze = zzzvVar.zze();
        ((zzzk) zzzvVar).zzl(Math.max(6, this.zza.zzc), false);
        int i = (zzc > j ? 1 : (zzc == j ? 0 : -1));
        long zzc2 = zzc(zzzvVar);
        return (i > 0 || zzc2 <= j) ? zzc2 <= j ? zzze.zzf(zzc2, zzzvVar.zze()) : zzze.zzd(zzc, zzf) : zzze.zze(zze);
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final /* synthetic */ void zzb() {
    }
}
