package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes.dex */
public final class zzdri implements zzfuf {
    final /* synthetic */ zzdrk zza;

    public zzdri(zzdrk zzdrkVar) {
        this.zza = zzdrkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final void zza(Throwable th) {
        long j;
        zzbzs zzbzsVar;
        synchronized (this) {
            this.zza.zzc = true;
            zzdrk zzdrkVar = this.zza;
            long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
            j = this.zza.zzd;
            zzdrkVar.zzv("com.google.android.gms.ads.MobileAds", false, "Internal Error.", (int) (elapsedRealtime - j));
            zzbzsVar = this.zza.zze;
            zzbzsVar.zze(new Exception());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final /* bridge */ /* synthetic */ void zzb(@Nullable Object obj) {
        long j;
        Executor executor;
        final String str = (String) obj;
        synchronized (this) {
            this.zza.zzc = true;
            zzdrk zzdrkVar = this.zza;
            long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
            j = this.zza.zzd;
            zzdrkVar.zzv("com.google.android.gms.ads.MobileAds", true, "", (int) (elapsedRealtime - j));
            executor = this.zza.zzi;
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdrh
                @Override // java.lang.Runnable
                public final void run() {
                    zzdri zzdriVar = zzdri.this;
                    zzdrk.zzj(zzdriVar.zza, str);
                }
            });
        }
    }
}
