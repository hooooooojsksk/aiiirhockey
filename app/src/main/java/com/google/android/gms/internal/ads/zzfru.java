package com.google.android.gms.internal.ads;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.AbstractMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzfru extends zzfqk {
    final /* synthetic */ zzfrv zza;

    public zzfru(zzfrv zzfrvVar) {
        this.zza = zzfrvVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        int i2;
        Object[] objArr;
        Object[] objArr2;
        i2 = this.zza.zzc;
        zzfnu.zza(i, i2, FirebaseAnalytics.Param.INDEX);
        zzfrv zzfrvVar = this.zza;
        objArr = zzfrvVar.zzb;
        int i3 = i + i;
        Object obj = objArr[i3];
        obj.getClass();
        objArr2 = zzfrvVar.zzb;
        Object obj2 = objArr2[i3 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i;
        i = this.zza.zzc;
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzfqf
    public final boolean zzf() {
        return true;
    }
}
