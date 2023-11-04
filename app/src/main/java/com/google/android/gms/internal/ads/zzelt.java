package com.google.android.gms.internal.ads;

import androidx.work.WorkRequest;
import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzelt implements zzgwy {
    private final zzgxl zza;
    private final zzgxl zzb;

    public zzelt(zzgxl zzgxlVar, zzgxl zzgxlVar2) {
        this.zza = zzgxlVar;
        this.zzb = zzgxlVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzelk(((zzelf) this.zza).zzb(), WorkRequest.MIN_BACKOFF_MILLIS, (Clock) this.zzb.zzb());
    }
}
