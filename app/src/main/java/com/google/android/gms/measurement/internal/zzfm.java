package com.google.android.gms.measurement.internal;

import androidx.collection.LruCache;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement@@21.1.1 */
/* loaded from: classes2.dex */
public final class zzfm extends LruCache {
    final /* synthetic */ zzfp zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfm(zzfp zzfpVar, int i) {
        super(20);
        this.zza = zzfpVar;
    }

    @Override // androidx.collection.LruCache
    protected final /* bridge */ /* synthetic */ Object create(Object obj) {
        String str = (String) obj;
        Preconditions.checkNotEmpty(str);
        return zzfp.zzd(this.zza, str);
    }
}
