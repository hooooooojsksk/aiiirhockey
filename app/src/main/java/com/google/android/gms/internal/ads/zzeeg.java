package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzeeg implements zzfuf {
    final /* synthetic */ long zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzeyc zzc;
    final /* synthetic */ zzeyf zzd;
    final /* synthetic */ zzffb zze;
    final /* synthetic */ zzeyo zzf;
    final /* synthetic */ zzeeh zzg;

    public zzeeg(zzeeh zzeehVar, long j, String str, zzeyc zzeycVar, zzeyf zzeyfVar, zzffb zzffbVar, zzeyo zzeyoVar) {
        this.zzg = zzeehVar;
        this.zza = j;
        this.zzb = str;
        this.zzc = zzeycVar;
        this.zzd = zzeyfVar;
        this.zze = zzffbVar;
        this.zzf = zzeyoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final void zza(Throwable th) {
        Clock clock;
        Integer num;
        com.google.android.gms.ads.internal.client.zze zzb;
        boolean z;
        com.google.android.gms.ads.internal.client.zze zzeVar;
        zzeay zzeayVar;
        zzfff zzfffVar;
        zzeei zzeeiVar;
        clock = this.zzg.zza;
        long elapsedRealtime = clock.elapsedRealtime() - this.zza;
        if (th instanceof TimeoutException) {
            num = null;
            r3 = 2;
        } else if (th instanceof zzedw) {
            num = null;
            r3 = 3;
        } else if (th instanceof CancellationException) {
            num = null;
            r3 = 4;
        } else if (th instanceof zzezc) {
            num = null;
            r3 = 5;
        } else {
            if (th instanceof zzdtf) {
                r3 = zzezx.zza(th).zza == 3 ? 1 : 6;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzbv)).booleanValue() && (th instanceof zzeax) && (zzb = ((zzeax) th).zzb()) != null) {
                    num = Integer.valueOf(zzb.zza);
                }
            }
            num = null;
        }
        zzeeh.zzg(this.zzg, this.zzb, r3, elapsedRealtime, this.zzc.zzag, num);
        zzeeh zzeehVar = this.zzg;
        z = zzeehVar.zze;
        if (z) {
            zzeeiVar = zzeehVar.zzb;
            zzeeiVar.zza(this.zzd, this.zzc, r3, th instanceof zzeax ? (zzeax) th : null, elapsedRealtime);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhI)).booleanValue()) {
            zzfffVar = this.zzg.zzc;
            zzffb zzffbVar = this.zze;
            zzeyo zzeyoVar = this.zzf;
            zzeyc zzeycVar = this.zzc;
            zzfffVar.zzd(zzffbVar.zzc(zzeyoVar, zzeycVar, zzeycVar.zzo));
        }
        com.google.android.gms.ads.internal.client.zze zza = zzezx.zza(th);
        int i = zza.zza;
        if ((i == 3 || i == 0) && (zzeVar = zza.zzd) != null && !zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN)) {
            zza = zzezx.zza(new zzeax(13, zza.zzd));
        }
        zzeayVar = this.zzg.zzf;
        zzeayVar.zze(this.zzc, elapsedRealtime, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final void zzb(Object obj) {
        Clock clock;
        boolean z;
        zzeay zzeayVar;
        zzeei zzeeiVar;
        clock = this.zzg.zza;
        long elapsedRealtime = clock.elapsedRealtime() - this.zza;
        zzeeh.zzg(this.zzg, this.zzb, 0, elapsedRealtime, this.zzc.zzag, null);
        zzeeh zzeehVar = this.zzg;
        z = zzeehVar.zze;
        if (z) {
            zzeeiVar = zzeehVar.zzb;
            zzeeiVar.zza(this.zzd, this.zzc, 0, null, elapsedRealtime);
        }
        zzeayVar = this.zzg.zzf;
        zzeayVar.zzf(this.zzc, elapsedRealtime, null);
    }
}
