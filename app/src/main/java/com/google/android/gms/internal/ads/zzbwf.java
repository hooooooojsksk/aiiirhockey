package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzbwf {
    private final Clock zza;
    private final com.google.android.gms.ads.internal.util.zzg zzb;
    private final zzbxf zzc;

    public zzbwf(Clock clock, com.google.android.gms.ads.internal.util.zzg zzgVar, zzbxf zzbxfVar) {
        this.zza = clock;
        this.zzb = zzgVar;
        this.zzc = zzbxfVar;
    }

    public final void zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzao)).booleanValue()) {
            this.zzc.zzt();
        }
    }

    public final void zzb(int i, long j) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzan)).booleanValue()) {
            return;
        }
        if (j - this.zzb.zzf() < 0) {
            com.google.android.gms.ads.internal.util.zze.zza("Receiving npa decision in the past, ignoring.");
            return;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzao)).booleanValue()) {
            this.zzb.zzK(-1);
            this.zzb.zzL(j);
        } else {
            this.zzb.zzK(i);
            this.zzb.zzL(j);
        }
        zza();
    }
}
