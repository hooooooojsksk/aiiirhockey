package com.google.android.gms.drive.metadata;

import com.google.android.gms.common.data.DataHolder;
import java.util.Collection;

/* loaded from: classes.dex */
public abstract class zzb<T> extends zza<Collection<T>> {
    public zzb(String str, Collection<String> collection, Collection<String> collection2, int i) {
        super(str, collection, collection2, i);
    }

    @Override // com.google.android.gms.drive.metadata.zza
    /* renamed from: zzd */
    public Collection<T> zzc(DataHolder dataHolder, int i, int i2) {
        throw new UnsupportedOperationException("Cannot read collections from a dataHolder.");
    }
}
