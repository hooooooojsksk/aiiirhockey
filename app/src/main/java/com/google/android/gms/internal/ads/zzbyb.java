package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzbyb {
    final /* synthetic */ zzbyc zza;
    private long zzb = -1;
    private long zzc = -1;

    public zzbyb(zzbyc zzbycVar) {
        this.zza = zzbycVar;
    }

    public final long zza() {
        return this.zzc;
    }

    public final Bundle zzb() {
        Bundle bundle = new Bundle();
        bundle.putLong("topen", this.zzb);
        bundle.putLong("tclose", this.zzc);
        return bundle;
    }

    public final void zzc() {
        Clock clock;
        clock = this.zza.zza;
        this.zzc = clock.elapsedRealtime();
    }

    public final void zzd() {
        Clock clock;
        clock = this.zza.zza;
        this.zzb = clock.elapsedRealtime();
    }
}
