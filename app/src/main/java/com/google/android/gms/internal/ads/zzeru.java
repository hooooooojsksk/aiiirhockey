package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzeru implements zzepn {
    final zzfuu zza;
    final String zzb;
    final zzbxx zzc;

    public zzeru(zzbxx zzbxxVar, zzfuu zzfuuVar, String str, byte[] bArr) {
        this.zzc = zzbxxVar;
        this.zza = zzfuuVar;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final int zza() {
        return 47;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final zzfut zzb() {
        final zzfut zzh = zzfuj.zzh(null);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzfr)).booleanValue()) {
            zzh = zzfuj.zzh(null);
        }
        final zzfut zzh2 = zzfuj.zzh(null);
        return zzfuj.zzc(zzh, zzh2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzert
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzerv((String) zzfut.this.get(), (String) zzh2.get());
            }
        }, zzbzn.zza);
    }
}
