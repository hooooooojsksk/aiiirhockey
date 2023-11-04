package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzeks implements zzepn {
    final zzbyj zza;
    AppSetIdClient zzb;
    private final ScheduledExecutorService zzc;
    private final zzfuu zzd;
    private final Context zze;

    public zzeks(Context context, zzbyj zzbyjVar, ScheduledExecutorService scheduledExecutorService, zzfuu zzfuuVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzcu)).booleanValue()) {
            this.zzb = AppSet.getClient(context);
        }
        this.zze = context;
        this.zza = zzbyjVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzfuuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final int zza() {
        return 11;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final zzfut zzb() {
        Task<AppSetIdInfo> appSetIdInfo;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzcq)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzcv)).booleanValue()) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzcr)).booleanValue()) {
                    return zzfuj.zzl(zzfkz.zza(this.zzb.getAppSetIdInfo()), new zzfnj() { // from class: com.google.android.gms.internal.ads.zzekp
                        @Override // com.google.android.gms.internal.ads.zzfnj
                        public final Object apply(Object obj) {
                            AppSetIdInfo appSetIdInfo2 = (AppSetIdInfo) obj;
                            return new zzekt(appSetIdInfo2.getId(), appSetIdInfo2.getScope());
                        }
                    }, zzbzn.zzf);
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzcu)).booleanValue()) {
                    appSetIdInfo = zzfaa.zza(this.zze);
                } else {
                    appSetIdInfo = this.zzb.getAppSetIdInfo();
                }
                if (appSetIdInfo == null) {
                    return zzfuj.zzh(new zzekt(null, -1));
                }
                zzfut zzm = zzfuj.zzm(zzfkz.zza(appSetIdInfo), new zzftq() { // from class: com.google.android.gms.internal.ads.zzekq
                    @Override // com.google.android.gms.internal.ads.zzftq
                    public final zzfut zza(Object obj) {
                        AppSetIdInfo appSetIdInfo2 = (AppSetIdInfo) obj;
                        if (appSetIdInfo2 == null) {
                            return zzfuj.zzh(new zzekt(null, -1));
                        }
                        return zzfuj.zzh(new zzekt(appSetIdInfo2.getId(), appSetIdInfo2.getScope()));
                    }
                }, zzbzn.zzf);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzcs)).booleanValue()) {
                    zzm = zzfuj.zzn(zzm, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzct)).longValue(), TimeUnit.MILLISECONDS, this.zzc);
                }
                return zzfuj.zze(zzm, Exception.class, new zzfnj() { // from class: com.google.android.gms.internal.ads.zzekr
                    @Override // com.google.android.gms.internal.ads.zzfnj
                    public final Object apply(Object obj) {
                        zzeks.this.zza.zzu((Exception) obj, "AppSetIdInfoSignal");
                        return new zzekt(null, -1);
                    }
                }, this.zzd);
            }
        }
        return zzfuj.zzh(new zzekt(null, -1));
    }
}
