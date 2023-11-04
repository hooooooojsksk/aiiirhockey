package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Build;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzfep implements Runnable {
    public static Boolean zza;
    private final Context zzb;
    private final zzbzg zzc;
    private String zze;
    private int zzf;
    private final zzdna zzg;
    private final zzdye zzi;
    private final zzbtz zzj;
    private final zzfeu zzd = zzfex.zzc();
    private boolean zzh = false;

    public zzfep(Context context, zzbzg zzbzgVar, zzdna zzdnaVar, zzdye zzdyeVar, zzbtz zzbtzVar, byte[] bArr) {
        this.zzb = context;
        this.zzc = zzbzgVar;
        this.zzg = zzdnaVar;
        this.zzi = zzdyeVar;
        this.zzj = zzbtzVar;
    }

    public static synchronized boolean zza() {
        boolean booleanValue;
        synchronized (zzfep.class) {
            if (zza == null) {
                if (((Boolean) zzbcd.zzb.zze()).booleanValue()) {
                    zza = Boolean.valueOf(Math.random() < ((Double) zzbcd.zza.zze()).doubleValue());
                } else {
                    zza = false;
                }
            }
            booleanValue = zza.booleanValue();
        }
        return booleanValue;
    }

    private final synchronized void zzc() {
        if (this.zzh) {
            return;
        }
        this.zzh = true;
        if (zza()) {
            com.google.android.gms.ads.internal.zzt.zzp();
            this.zze = com.google.android.gms.ads.internal.util.zzs.zzn(this.zzb);
            this.zzf = GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zzb);
            long intValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhX)).intValue();
            zzbzn.zzd.scheduleAtFixedRate(this, intValue, intValue, TimeUnit.MILLISECONDS);
        }
    }

    private final synchronized void zzd() {
        try {
            new zzdyd(this.zzb, this.zzc.zza, this.zzj, Binder.getCallingUid(), null).zza(new zzdyb((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhW), 60000, new HashMap(), ((zzfex) this.zzd.zzal()).zzax(), "application/x-protobuf", false));
            this.zzd.zzc();
        } catch (Exception e) {
            if (!(e instanceof zzdtf) || ((zzdtf) e).zza() != 3) {
                com.google.android.gms.ads.internal.zzt.zzo().zzt(e, "CuiMonitor.sendCuiPing");
            } else {
                this.zzd.zzc();
            }
        }
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        if (zza()) {
            if (this.zzd.zza() == 0) {
                return;
            }
            zzd();
        }
    }

    public final synchronized void zzb(zzfeg zzfegVar) {
        if (!this.zzh) {
            zzc();
        }
        if (zza()) {
            if (zzfegVar == null) {
                return;
            }
            if (this.zzd.zza() >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhY)).intValue()) {
                return;
            }
            zzfeu zzfeuVar = this.zzd;
            zzfev zza2 = zzfew.zza();
            zzfer zza3 = zzfes.zza();
            zza3.zzr(zzfegVar.zzk());
            zza3.zzn(zzfegVar.zzj());
            zza3.zzf(zzfegVar.zzb());
            zza3.zzt(3);
            zza3.zzl(this.zzc.zza);
            zza3.zza(this.zze);
            zza3.zzj(Build.VERSION.RELEASE);
            zza3.zzo(Build.VERSION.SDK_INT);
            zza3.zzs(zzfegVar.zzm());
            zza3.zzi(zzfegVar.zza());
            zza3.zzd(this.zzf);
            zza3.zzq(zzfegVar.zzl());
            zza3.zzb(zzfegVar.zzc());
            zza3.zze(zzfegVar.zze());
            zza3.zzg(zzfegVar.zzf());
            zza3.zzh(this.zzg.zzc(zzfegVar.zzf()));
            zza3.zzk(zzfegVar.zzg());
            zza3.zzc(zzfegVar.zzd());
            zza3.zzp(zzfegVar.zzi());
            zza3.zzm(zzfegVar.zzh());
            zza2.zza(zza3);
            zzfeuVar.zzb(zza2);
        }
    }
}
