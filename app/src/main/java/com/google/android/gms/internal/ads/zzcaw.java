package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzcaw implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzcax zzb;

    public zzcaw(zzcax zzcaxVar, boolean z) {
        this.zzb = zzcaxVar;
        this.zza = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzK("windowVisibilityChanged", "isVisible", String.valueOf(this.zza));
    }
}
