package com.google.android.gms.internal.ads;

import android.app.Activity;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzbpt implements Runnable {
    final /* synthetic */ AdOverlayInfoParcel zza;
    final /* synthetic */ zzbpu zzb;

    public zzbpt(zzbpu zzbpuVar, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.zzb = zzbpuVar;
        this.zza = adOverlayInfoParcel;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Activity activity;
        com.google.android.gms.ads.internal.zzt.zzi();
        activity = this.zzb.zza;
        com.google.android.gms.ads.internal.overlay.zzm.zza(activity, this.zza, true);
    }
}
