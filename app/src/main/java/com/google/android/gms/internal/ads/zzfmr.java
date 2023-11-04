package com.google.android.gms.internal.ads;

import android.os.IBinder;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzfmr extends zzfml {
    final /* synthetic */ IBinder zza;
    final /* synthetic */ zzfmu zzb;

    public zzfmr(zzfmu zzfmuVar, IBinder iBinder) {
        this.zzb = zzfmuVar;
        this.zza = iBinder;
    }

    @Override // com.google.android.gms.internal.ads.zzfml
    public final void zza() {
        List<Runnable> list;
        List list2;
        this.zzb.zza.zzn = zzfmg.zzb(this.zza);
        zzfmv.zzq(this.zzb.zza);
        this.zzb.zza.zzh = false;
        list = this.zzb.zza.zze;
        for (Runnable runnable : list) {
            runnable.run();
        }
        list2 = this.zzb.zza.zze;
        list2.clear();
    }
}
