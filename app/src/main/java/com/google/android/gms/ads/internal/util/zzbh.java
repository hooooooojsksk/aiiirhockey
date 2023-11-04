package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzaks;
import com.google.android.gms.internal.ads.zzakx;
import com.google.android.gms.internal.ads.zzbza;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes.dex */
public final class zzbh implements zzaks {
    final /* synthetic */ String zza;
    final /* synthetic */ zzbl zzb;

    public zzbh(zzbo zzboVar, String str, zzbl zzblVar) {
        this.zza = str;
        this.zzb = zzblVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaks
    public final void zza(zzakx zzakxVar) {
        String str = this.zza;
        String zzakxVar2 = zzakxVar.toString();
        zzbza.zzj("Failed to load URL: " + str + "\n" + zzakxVar2);
        this.zzb.zza((Object) null);
    }
}
