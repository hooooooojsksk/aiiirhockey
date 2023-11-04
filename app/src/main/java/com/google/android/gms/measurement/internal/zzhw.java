package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: classes2.dex */
public final class zzhw implements Runnable {
    final /* synthetic */ Boolean zza;
    final /* synthetic */ zzid zzb;

    public zzhw(zzid zzidVar, Boolean bool) {
        this.zzb = zzidVar;
        this.zza = bool;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzaa(this.zza, true);
    }
}
