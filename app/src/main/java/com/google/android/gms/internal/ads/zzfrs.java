package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public abstract class zzfrs implements Comparator {
    public static zzfrs zzb(Comparator comparator) {
        if (comparator instanceof zzfrs) {
            return (zzfrs) comparator;
        }
        return new zzfpw(comparator);
    }

    public static zzfrs zzc() {
        return zzfrq.zza;
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);

    public zzfrs zza() {
        return new zzfsb(this);
    }
}
