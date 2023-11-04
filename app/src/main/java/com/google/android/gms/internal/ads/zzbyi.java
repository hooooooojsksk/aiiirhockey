package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzbyi {
    private final Object zza = new Object();
    private volatile int zzc = 1;
    private volatile long zzb = 0;

    private zzbyi() {
    }

    public /* synthetic */ zzbyi(zzbyh zzbyhVar) {
    }

    public final void zza() {
        long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis();
        synchronized (this.zza) {
            if (this.zzc == 3) {
                if (this.zzb + ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzfz)).longValue() <= currentTimeMillis) {
                    this.zzc = 1;
                }
            }
        }
        long currentTimeMillis2 = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis();
        synchronized (this.zza) {
            if (this.zzc != 2) {
                return;
            }
            this.zzc = 3;
            if (this.zzc == 3) {
                this.zzb = currentTimeMillis2;
            }
        }
    }
}
