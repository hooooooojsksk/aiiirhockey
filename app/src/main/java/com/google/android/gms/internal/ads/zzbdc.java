package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzbdc {
    private static final AtomicReference zzb = new AtomicReference();
    private static final AtomicReference zzc = new AtomicReference();
    static final AtomicBoolean zza = new AtomicBoolean();

    public static zzbda zza() {
        return (zzbda) zzb.get();
    }

    public static zzbdb zzb() {
        return (zzbdb) zzc.get();
    }

    public static void zzc(zzbda zzbdaVar) {
        zzb.set(zzbdaVar);
    }
}
