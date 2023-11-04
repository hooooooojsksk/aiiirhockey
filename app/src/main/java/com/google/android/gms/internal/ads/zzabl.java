package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzabl implements zzaax {
    final /* synthetic */ zzabo zza;
    private final long zzb;

    public zzabl(zzabo zzaboVar, long j) {
        this.zza = zzaboVar;
        this.zzb = j;
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final long zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final zzaav zzg(long j) {
        zzabr[] zzabrVarArr;
        zzabr[] zzabrVarArr2;
        zzabr[] zzabrVarArr3;
        zzabrVarArr = this.zza.zzg;
        zzaav zza = zzabrVarArr[0].zza(j);
        int i = 1;
        while (true) {
            zzabo zzaboVar = this.zza;
            zzabrVarArr2 = zzaboVar.zzg;
            if (i >= zzabrVarArr2.length) {
                return zza;
            }
            zzabrVarArr3 = zzaboVar.zzg;
            zzaav zza2 = zzabrVarArr3[i].zza(j);
            if (zza2.zza.zzc < zza.zza.zzc) {
                zza = zza2;
            }
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final boolean zzh() {
        return true;
    }
}
