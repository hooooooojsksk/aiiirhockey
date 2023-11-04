package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzdrj extends zzbjo {
    final /* synthetic */ Object zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzfec zzd;
    final /* synthetic */ zzbzs zze;
    final /* synthetic */ zzdrk zzf;

    public zzdrj(zzdrk zzdrkVar, Object obj, String str, long j, zzfec zzfecVar, zzbzs zzbzsVar) {
        this.zzf = zzdrkVar;
        this.zza = obj;
        this.zzb = str;
        this.zzc = j;
        this.zzd = zzfecVar;
        this.zze = zzbzsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjp
    public final void zze(String str) {
        zzdpr zzdprVar;
        zzdbf zzdbfVar;
        zzfep zzfepVar;
        synchronized (this.zza) {
            this.zzf.zzv(this.zzb, false, str, (int) (com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - this.zzc));
            zzdprVar = this.zzf.zzl;
            zzdprVar.zzb(this.zzb, "error");
            zzdbfVar = this.zzf.zzo;
            zzdbfVar.zzb(this.zzb, "error");
            zzfepVar = this.zzf.zzp;
            zzfec zzfecVar = this.zzd;
            zzfecVar.zzc(str);
            zzfecVar.zzf(false);
            zzfepVar.zzb(zzfecVar.zzl());
            this.zze.zzd(false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbjp
    public final void zzf() {
        zzdpr zzdprVar;
        zzdbf zzdbfVar;
        zzfep zzfepVar;
        synchronized (this.zza) {
            this.zzf.zzv(this.zzb, true, "", (int) (com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - this.zzc));
            zzdprVar = this.zzf.zzl;
            zzdprVar.zzd(this.zzb);
            zzdbfVar = this.zzf.zzo;
            zzdbfVar.zzd(this.zzb);
            zzfepVar = this.zzf.zzp;
            zzfec zzfecVar = this.zzd;
            zzfecVar.zzf(true);
            zzfepVar.zzb(zzfecVar.zzl());
            this.zze.zzd(true);
        }
    }
}
