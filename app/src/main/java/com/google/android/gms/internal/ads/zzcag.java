package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzcag implements Runnable {
    final /* synthetic */ zzcan zza;

    public zzcag(zzcan zzcanVar) {
        this.zza = zzcanVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcao zzcaoVar;
        zzcao zzcaoVar2;
        zzcan zzcanVar = this.zza;
        zzcaoVar = zzcanVar.zzr;
        if (zzcaoVar != null) {
            zzcaoVar2 = zzcanVar.zzr;
            zzcaoVar2.zza();
        }
    }
}
