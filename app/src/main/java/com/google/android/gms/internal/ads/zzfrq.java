package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzfrq extends zzfrs implements Serializable {
    static final zzfrq zza = new zzfrq();

    private zzfrq() {
    }

    @Override // com.google.android.gms.internal.ads.zzfrs, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        Objects.requireNonNull(comparable);
        Objects.requireNonNull(comparable2);
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }

    @Override // com.google.android.gms.internal.ads.zzfrs
    public final zzfrs zza() {
        return zzfsa.zza;
    }
}
