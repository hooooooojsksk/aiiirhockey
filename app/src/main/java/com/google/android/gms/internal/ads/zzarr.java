package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzarr implements Callable {
    private final zzaqx zza;
    private final zzamv zzb;

    public zzarr(zzaqx zzaqxVar, zzamv zzamvVar) {
        this.zza = zzaqxVar;
        this.zzb = zzamvVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        if (this.zza.zzl() != null) {
            this.zza.zzl().get();
        }
        zzans zzc = this.zza.zzc();
        if (zzc != null) {
            try {
                synchronized (this.zzb) {
                    zzamv zzamvVar = this.zzb;
                    byte[] zzax = zzc.zzax();
                    zzamvVar.zzak(zzax, 0, zzax.length, zzgpy.zza());
                }
                return null;
            } catch (zzgqy | NullPointerException unused) {
                return null;
            }
        }
        return null;
    }
}
