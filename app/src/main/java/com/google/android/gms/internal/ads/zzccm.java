package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzccm extends com.google.android.gms.ads.internal.util.zzb {
    final zzcbj zza;
    final zzccu zzb;
    private final String zzc;
    private final String[] zzd;

    public zzccm(zzcbj zzcbjVar, zzccu zzccuVar, String str, String[] strArr) {
        this.zza = zzcbjVar;
        this.zzb = zzccuVar;
        this.zzc = str;
        this.zzd = strArr;
        com.google.android.gms.ads.internal.zzt.zzy().zzb(this);
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        try {
            this.zzb.zzu(this.zzc, this.zzd);
        } finally {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new zzccl(this));
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final zzfut zzb() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzbM)).booleanValue() || !(this.zzb instanceof zzcdd)) {
            return super.zzb();
        }
        return zzbzn.zze.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzcck
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzccm.this.zzd();
            }
        });
    }

    public final /* synthetic */ Boolean zzd() throws Exception {
        return Boolean.valueOf(this.zzb.zzw(this.zzc, this.zzd, this));
    }

    public final String zze() {
        return this.zzc;
    }
}
