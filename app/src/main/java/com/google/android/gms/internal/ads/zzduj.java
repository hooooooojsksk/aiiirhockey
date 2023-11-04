package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzduj implements zzdvh {
    private static final Pattern zza = Pattern.compile("Received error HTTP response code: (.*)");
    private final zzdtj zzb;
    private final zzfuu zzc;
    private final zzeyx zzd;
    private final ScheduledExecutorService zze;
    private final zzdzf zzf;
    private final zzfen zzg;
    private final Context zzh;

    public zzduj(Context context, zzeyx zzeyxVar, zzdtj zzdtjVar, zzfuu zzfuuVar, ScheduledExecutorService scheduledExecutorService, zzdzf zzdzfVar, zzfen zzfenVar) {
        this.zzh = context;
        this.zzd = zzeyxVar;
        this.zzb = zzdtjVar;
        this.zzc = zzfuuVar;
        this.zze = scheduledExecutorService;
        this.zzf = zzdzfVar;
        this.zzg = zzfenVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdvh
    public final zzfut zzb(zzbtn zzbtnVar) {
        zzfut zzb = this.zzb.zzb(zzbtnVar);
        zzfec zza2 = zzfeb.zza(this.zzh, 11);
        zzfem.zzd(zzb, zza2);
        zzfut zzm = zzfuj.zzm(zzb, new zzftq() { // from class: com.google.android.gms.internal.ads.zzdug
            @Override // com.google.android.gms.internal.ads.zzftq
            public final zzfut zza(Object obj) {
                return zzduj.this.zzc((InputStream) obj);
            }
        }, this.zzc);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzfb)).booleanValue()) {
            zzm = zzfuj.zzf(zzfuj.zzn(zzm, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzfc)).intValue(), TimeUnit.SECONDS, this.zze), TimeoutException.class, new zzftq() { // from class: com.google.android.gms.internal.ads.zzduh
                @Override // com.google.android.gms.internal.ads.zzftq
                public final zzfut zza(Object obj) {
                    TimeoutException timeoutException = (TimeoutException) obj;
                    return zzfuj.zzg(new zzdtf(5));
                }
            }, zzbzn.zzf);
        }
        zzfem.zza(zzm, this.zzg, zza2);
        zzfuj.zzq(zzm, new zzdui(this), zzbzn.zzf);
        return zzm;
    }

    public final /* synthetic */ zzfut zzc(InputStream inputStream) throws Exception {
        return zzfuj.zzh(new zzeyo(new zzeyl(this.zzd), zzeyn.zza(new InputStreamReader(inputStream))));
    }
}
