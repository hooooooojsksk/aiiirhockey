package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzaua implements Runnable {
    final /* synthetic */ View zza;
    final /* synthetic */ zzaue zzb;

    public zzaua(zzaue zzaueVar, View view) {
        this.zzb = zzaueVar;
        this.zza = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzc(this.zza);
    }
}
