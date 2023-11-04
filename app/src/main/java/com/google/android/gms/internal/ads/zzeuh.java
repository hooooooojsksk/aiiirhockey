package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzeuh implements zzeiq {
    final /* synthetic */ zzeui zza;

    public zzeuh(zzeui zzeuiVar) {
        this.zza = zzeuiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeiq
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zza = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeiq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzeua zzeuaVar;
        zzeua zzeuaVar2;
        zzcoe zzcoeVar = (zzcoe) obj;
        synchronized (this.zza) {
            zzcoe zzcoeVar2 = this.zza.zza;
            if (zzcoeVar2 != null) {
                zzcoeVar2.zzb();
            }
            zzeui zzeuiVar = this.zza;
            zzeuiVar.zza = zzcoeVar;
            zzcoeVar.zzc(zzeuiVar);
            zzeui zzeuiVar2 = this.zza;
            zzeuaVar = zzeuiVar2.zzg;
            zzeuaVar2 = zzeuiVar2.zzg;
            zzeuaVar.zzl(new zzcof(zzcoeVar, zzeuiVar2, zzeuaVar2));
            zzcoeVar.zzj();
        }
    }
}
