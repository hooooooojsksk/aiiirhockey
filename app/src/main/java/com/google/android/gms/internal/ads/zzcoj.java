package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzcoj implements zzgwy {
    private final zzgxl zza;
    private final zzgxl zzb;

    public zzcoj(zzgxl zzgxlVar, zzgxl zzgxlVar2) {
        this.zza = zzgxlVar;
        this.zzb = zzgxlVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    /* renamed from: zza */
    public final zzcxd zzb() {
        return new zzcxd((ScheduledExecutorService) this.zza.zzb(), (Clock) this.zzb.zzb());
    }
}
