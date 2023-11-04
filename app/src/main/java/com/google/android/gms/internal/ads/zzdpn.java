package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
@Deprecated
/* loaded from: classes2.dex */
public final class zzdpn extends zzdpp {
    private final zzfds zzf;

    public zzdpn(Executor executor, zzbzf zzbzfVar, zzfds zzfdsVar, zzfdu zzfduVar) {
        super(executor, zzbzfVar, zzfduVar);
        this.zzf = zzfdsVar;
        zzfdsVar.zza(this.zzb);
    }

    public final Map zza() {
        return new HashMap(this.zzb);
    }
}
