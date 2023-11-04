package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzgse {
    private static final zzgse zza = new zzgse();
    private final ConcurrentMap zzc = new ConcurrentHashMap();
    private final zzgsq zzb = new zzgro();

    private zzgse() {
    }

    public static zzgse zza() {
        return zza;
    }

    public final zzgsp zzb(Class cls) {
        zzgqw.zzf(cls, "messageType");
        zzgsp zzgspVar = (zzgsp) this.zzc.get(cls);
        if (zzgspVar == null) {
            zzgspVar = this.zzb.zza(cls);
            zzgqw.zzf(cls, "messageType");
            zzgqw.zzf(zzgspVar, "schema");
            zzgsp zzgspVar2 = (zzgsp) this.zzc.putIfAbsent(cls, zzgspVar);
            if (zzgspVar2 != null) {
                return zzgspVar2;
            }
        }
        return zzgspVar;
    }
}
