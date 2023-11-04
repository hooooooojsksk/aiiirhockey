package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzfca implements zzgwy {
    private final zzgxl zza;

    public zzfca(zzgxl zzgxlVar) {
        this.zza = zzgxlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfkq.zza();
        ScheduledExecutorService unconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, (ThreadFactory) this.zza.zzb()));
        zzgxg.zzb(unconfigurableScheduledExecutorService);
        return unconfigurableScheduledExecutorService;
    }
}
