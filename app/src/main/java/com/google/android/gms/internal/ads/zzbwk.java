package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzbwk {
    private Context zza;
    private Clock zzb;
    private com.google.android.gms.ads.internal.util.zzg zzc;
    private zzbxf zzd;

    private zzbwk() {
    }

    public /* synthetic */ zzbwk(zzbwj zzbwjVar) {
    }

    public final zzbwk zza(com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zzc = zzgVar;
        return this;
    }

    public final zzbwk zzb(Context context) {
        Objects.requireNonNull(context);
        this.zza = context;
        return this;
    }

    public final zzbwk zzc(Clock clock) {
        Objects.requireNonNull(clock);
        this.zzb = clock;
        return this;
    }

    public final zzbwk zzd(zzbxf zzbxfVar) {
        this.zzd = zzbxfVar;
        return this;
    }

    public final zzbxg zze() {
        zzgxg.zzc(this.zza, Context.class);
        zzgxg.zzc(this.zzb, Clock.class);
        zzgxg.zzc(this.zzc, com.google.android.gms.ads.internal.util.zzg.class);
        zzgxg.zzc(this.zzd, zzbxf.class);
        return new zzbwm(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
