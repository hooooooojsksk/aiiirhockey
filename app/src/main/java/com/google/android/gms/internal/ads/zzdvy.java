package com.google.android.gms.internal.ads;

import android.os.Binder;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzdvy {
    private final zzfuu zza;
    private final zzfuu zzb;
    private final zzdwt zzc;
    private final zzgws zzd;

    public zzdvy(zzfuu zzfuuVar, zzfuu zzfuuVar2, zzdwt zzdwtVar, zzgws zzgwsVar) {
        this.zza = zzfuuVar;
        this.zzb = zzfuuVar2;
        this.zzc = zzdwtVar;
        this.zzd = zzgwsVar;
    }

    public final /* synthetic */ zzfut zza(zzbsv zzbsvVar) throws Exception {
        return this.zzc.zza(zzbsvVar, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzjI)).longValue());
    }

    public final /* synthetic */ zzfut zzb(zzbsv zzbsvVar, int i, zzdvi zzdviVar) throws Exception {
        return ((zzdxz) this.zzd.zzb()).zzb(zzbsvVar, i);
    }

    public final zzfut zzc(final zzbsv zzbsvVar) {
        zzfut zzf;
        String str = zzbsvVar.zzf;
        com.google.android.gms.ads.internal.zzt.zzp();
        if (com.google.android.gms.ads.internal.util.zzs.zzy(str)) {
            zzf = zzfuj.zzg(new zzdvi(1, "Ads service proxy force local"));
        } else {
            zzf = zzfuj.zzf(zzfuj.zzk(new zzftp() { // from class: com.google.android.gms.internal.ads.zzdvv
                @Override // com.google.android.gms.internal.ads.zzftp
                public final zzfut zza() {
                    return zzdvy.this.zza(zzbsvVar);
                }
            }, this.zza), ExecutionException.class, new zzftq() { // from class: com.google.android.gms.internal.ads.zzdvw
                @Override // com.google.android.gms.internal.ads.zzftq
                public final zzfut zza(Object obj) {
                    ExecutionException executionException = (ExecutionException) obj;
                    Throwable cause = executionException.getCause();
                    Throwable th = executionException;
                    if (cause != null) {
                        th = executionException.getCause();
                    }
                    return zzfuj.zzg(th);
                }
            }, this.zzb);
        }
        final int callingUid = Binder.getCallingUid();
        return zzfuj.zzf(zzf, zzdvi.class, new zzftq() { // from class: com.google.android.gms.internal.ads.zzdvx
            @Override // com.google.android.gms.internal.ads.zzftq
            public final zzfut zza(Object obj) {
                return zzdvy.this.zzb(zzbsvVar, callingUid, (zzdvi) obj);
            }
        }, this.zzb);
    }
}
