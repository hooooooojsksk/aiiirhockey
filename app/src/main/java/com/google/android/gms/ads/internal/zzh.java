package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzfhp;
import com.google.android.gms.internal.ads.zzfis;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes.dex */
public final class zzh implements zzfis {
    final /* synthetic */ zzi zza;

    public zzh(zzi zziVar) {
        this.zza = zziVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfis
    public final void zza(int i, long j) {
        zzfhp zzfhpVar;
        zzfhpVar = this.zza.zzi;
        zzfhpVar.zzd(i, System.currentTimeMillis() - j);
    }

    @Override // com.google.android.gms.internal.ads.zzfis
    public final void zzb(int i, long j, String str) {
        zzfhp zzfhpVar;
        zzfhpVar = this.zza.zzi;
        zzfhpVar.zze(i, System.currentTimeMillis() - j, str);
    }
}
