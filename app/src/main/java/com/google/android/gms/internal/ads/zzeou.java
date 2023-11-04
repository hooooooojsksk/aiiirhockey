package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzeou implements zzepn {
    private final String zza;
    private final zzfuu zzb;
    private final ScheduledExecutorService zzc;
    private final Context zzd;
    private final zzeyx zze;
    private final zzcgd zzf;

    public zzeou(zzfuu zzfuuVar, ScheduledExecutorService scheduledExecutorService, String str, Context context, zzeyx zzeyxVar, zzcgd zzcgdVar) {
        this.zzb = zzfuuVar;
        this.zzc = scheduledExecutorService;
        this.zza = str;
        this.zzd = context;
        this.zze = zzeyxVar;
        this.zzf = zzcgdVar;
    }

    public static /* synthetic */ zzfut zzc(zzeou zzeouVar) {
        String str = zzeouVar.zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzgI)).booleanValue()) {
            str = AdFormat.UNKNOWN.name();
        }
        com.google.android.gms.ads.nonagon.signalgeneration.zzg zzn = zzeouVar.zzf.zzn();
        zzctx zzctxVar = new zzctx();
        zzctxVar.zzd(zzeouVar.zzd);
        zzeyv zzeyvVar = new zzeyv();
        zzeyvVar.zzs("adUnitId");
        zzeyvVar.zzE(zzeouVar.zze.zzd);
        zzeyvVar.zzr(new com.google.android.gms.ads.internal.client.zzq());
        zzctxVar.zzh(zzeyvVar.zzG());
        zzn.zza(zzctxVar.zzi());
        com.google.android.gms.ads.nonagon.signalgeneration.zzae zzaeVar = new com.google.android.gms.ads.nonagon.signalgeneration.zzae();
        zzaeVar.zza(str);
        zzn.zzb(zzaeVar.zzb());
        new zzczz();
        return zzfuj.zze(zzfuj.zzl((zzfua) zzfuj.zzn(zzfua.zzv(zzn.zzc().zzc()), ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzgJ)).longValue(), TimeUnit.MILLISECONDS, zzeouVar.zzc), new zzfnj() { // from class: com.google.android.gms.internal.ads.zzeos
            @Override // com.google.android.gms.internal.ads.zzfnj
            public final Object apply(Object obj) {
                com.google.android.gms.ads.nonagon.signalgeneration.zzao zzaoVar = (com.google.android.gms.ads.nonagon.signalgeneration.zzao) obj;
                return zzaoVar != null ? new zzeov(zzaoVar.zza) : new zzeov(null);
            }
        }, zzeouVar.zzb), Exception.class, new zzfnj() { // from class: com.google.android.gms.internal.ads.zzeot
            @Override // com.google.android.gms.internal.ads.zzfnj
            public final Object apply(Object obj) {
                zzbza.zzh("", (Exception) obj);
                return new zzeov(null);
            }
        }, zzeouVar.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final int zza() {
        return 33;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final zzfut zzb() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzgH)).booleanValue() || "adUnitId".equals(this.zze.zzf)) {
            return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeoq
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new zzeov(null);
                }
            });
        }
        return zzfuj.zzk(new zzftp() { // from class: com.google.android.gms.internal.ads.zzeor
            @Override // com.google.android.gms.internal.ads.zzftp
            public final zzfut zza() {
                return zzeou.zzc(zzeou.this);
            }
        }, this.zzb);
    }
}
