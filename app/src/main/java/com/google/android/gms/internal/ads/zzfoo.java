package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
class zzfoo extends zzfpf implements zzfqv {
    public zzfoo(Map map) {
        super(map);
    }

    @Override // com.google.android.gms.internal.ads.zzfpf
    public /* bridge */ /* synthetic */ Collection zza() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzfpf
    public final Collection zzb(Collection collection) {
        return Collections.unmodifiableList(collection);
    }

    @Override // com.google.android.gms.internal.ads.zzfpf
    public final Collection zzc(Object obj, Collection collection) {
        return zzk(obj, (List) collection, null);
    }
}
