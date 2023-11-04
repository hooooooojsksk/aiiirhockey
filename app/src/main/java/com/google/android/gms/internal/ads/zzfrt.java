package com.google.android.gms.internal.ads;

import com.google.firebase.analytics.FirebaseAnalytics;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzfrt extends zzfqk {
    static final zzfqk zza = new zzfrt(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    public zzfrt(Object[] objArr, int i) {
        this.zzb = objArr;
        this.zzc = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzfnu.zza(i, this.zzc, FirebaseAnalytics.Param.INDEX);
        Object obj = this.zzb[i];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfqk, com.google.android.gms.internal.ads.zzfqf
    public final int zza(Object[] objArr, int i) {
        System.arraycopy(this.zzb, 0, objArr, i, this.zzc);
        return i + this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfqf
    final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfqf
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfqf
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfqf
    public final Object[] zzg() {
        return this.zzb;
    }
}
