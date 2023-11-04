package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzenp implements zzepn {
    private final zzfuu zza;
    private final Context zzb;
    private final Set zzc;

    public zzenp(zzfuu zzfuuVar, Context context, Set set) {
        this.zza = zzfuuVar;
        this.zzb = context;
        this.zzc = set;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final int zza() {
        return 27;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final zzfut zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeno
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzenp.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzenq zzc() throws Exception {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzeC)).booleanValue()) {
            Set set = this.zzc;
            if (set.contains("rewarded") || set.contains("interstitial") || set.contains("native") || set.contains("banner")) {
                com.google.android.gms.ads.internal.zzt.zzA();
                return new zzenq(true == ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzeC)).booleanValue() ? "a.1.3.37-google_20220829" : null);
            }
        }
        return new zzenq(null);
    }
}
