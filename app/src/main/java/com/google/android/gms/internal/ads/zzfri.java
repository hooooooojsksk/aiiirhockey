package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzfri extends zzfrm {
    final /* synthetic */ Comparator zza;

    public zzfri(Comparator comparator) {
        this.zza = comparator;
    }

    @Override // com.google.android.gms.internal.ads.zzfrm
    public final Map zza() {
        return new TreeMap(this.zza);
    }
}
