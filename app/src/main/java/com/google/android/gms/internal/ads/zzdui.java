package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzdui implements zzfuf {
    final /* synthetic */ zzduj zza;

    public zzdui(zzduj zzdujVar) {
        this.zza = zzdujVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final void zza(Throwable th) {
        Pattern pattern;
        zzdzf zzdzfVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzfL)).booleanValue()) {
            pattern = zzduj.zza;
            Matcher matcher = pattern.matcher(th.getMessage());
            if (matcher.matches()) {
                String group = matcher.group(1);
                zzdzfVar = this.zza.zzf;
                zzdzfVar.zzi(Integer.parseInt(group));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdzf zzdzfVar;
        zzdzf zzdzfVar2;
        zzeyo zzeyoVar = (zzeyo) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzfL)).booleanValue()) {
            zzdzfVar = this.zza.zzf;
            zzdzfVar.zzi(zzeyoVar.zzb.zzb.zze);
            zzdzfVar2 = this.zza.zzf;
            zzdzfVar2.zzj(zzeyoVar.zzb.zzb.zzf);
        }
    }
}
