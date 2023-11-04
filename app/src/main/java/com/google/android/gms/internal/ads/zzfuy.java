package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfsx;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzfuy extends zzfsx.zzi implements Runnable {
    private final Runnable zza;

    public zzfuy(Runnable runnable) {
        Objects.requireNonNull(runnable);
        this.zza = runnable;
    }

    @Override // com.google.android.gms.internal.ads.zzfsx
    public final String zza() {
        String obj = this.zza.toString();
        return "task=[" + obj + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zza.run();
        } catch (Error | RuntimeException e) {
            zze(e);
            throw e;
        }
    }
}
