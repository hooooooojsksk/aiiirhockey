package com.google.android.gms.internal.ads;

import com.google.firebase.analytics.FirebaseAnalytics;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzcnt {
    private final zzfdk zza;
    private final zzdpi zzb;
    private final zzeyo zzc;

    public zzcnt(zzdpi zzdpiVar, zzeyo zzeyoVar, zzfdk zzfdkVar) {
        this.zza = zzfdkVar;
        this.zzb = zzdpiVar;
        this.zzc = zzeyoVar;
    }

    private static String zzb(int i) {
        int i2 = i - 1;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "u" : "ac" : "cb" : "cc" : "bb" : "h";
    }

    public final void zza(long j, int i) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhS)).booleanValue()) {
            zzfdk zzfdkVar = this.zza;
            zzfdj zzb = zzfdj.zzb("ad_closed");
            zzb.zzg(this.zzc.zzb.zzb);
            zzb.zza("show_time", String.valueOf(j));
            zzb.zza(FirebaseAnalytics.Param.AD_FORMAT, "app_open_ad");
            zzb.zza("acr", zzb(i));
            zzfdkVar.zzb(zzb);
            return;
        }
        zzdph zza = this.zzb.zza();
        zza.zze(this.zzc.zzb.zzb);
        zza.zzb("action", "ad_closed");
        zza.zzb("show_time", String.valueOf(j));
        zza.zzb(FirebaseAnalytics.Param.AD_FORMAT, "app_open_ad");
        zza.zzb("acr", zzb(i));
        zza.zzg();
    }
}
