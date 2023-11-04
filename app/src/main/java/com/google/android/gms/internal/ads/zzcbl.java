package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzcbl implements Runnable {
    private final zzcax zza;
    private boolean zzb = false;

    public zzcbl(zzcax zzcaxVar) {
        this.zza = zzcaxVar;
    }

    private final void zzc() {
        com.google.android.gms.ads.internal.util.zzs.zza.removeCallbacks(this);
        com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(this, 250L);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzb) {
            return;
        }
        this.zza.zzt();
        zzc();
    }

    public final void zza() {
        this.zzb = true;
        this.zza.zzt();
    }

    public final void zzb() {
        this.zzb = false;
        zzc();
    }
}
