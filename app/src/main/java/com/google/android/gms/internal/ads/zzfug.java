package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzfug implements Runnable {
    final Future zza;
    final zzfuf zzb;

    public zzfug(Future future, zzfuf zzfufVar) {
        this.zza = future;
        this.zzb = zzfufVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable zza;
        Future future = this.zza;
        if (!(future instanceof zzfvm) || (zza = zzfvn.zza((zzfvm) future)) == null) {
            try {
                this.zzb.zzb(zzfuj.zzo(this.zza));
                return;
            } catch (Error e) {
                e = e;
                this.zzb.zza(e);
                return;
            } catch (RuntimeException e2) {
                e = e2;
                this.zzb.zza(e);
                return;
            } catch (ExecutionException e3) {
                this.zzb.zza(e3.getCause());
                return;
            }
        }
        this.zzb.zza(zza);
    }

    public final String toString() {
        zzfnn zza = zzfno.zza(this);
        zza.zza(this.zzb);
        return zza.toString();
    }
}
