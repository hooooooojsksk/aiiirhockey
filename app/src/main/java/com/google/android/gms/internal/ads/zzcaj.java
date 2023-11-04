package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzcaj implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ zzcan zzc;

    public zzcaj(zzcan zzcanVar, int i, int i2) {
        this.zzc = zzcanVar;
        this.zza = i;
        this.zzb = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcao zzcaoVar;
        zzcao zzcaoVar2;
        zzcan zzcanVar = this.zzc;
        zzcaoVar = zzcanVar.zzr;
        if (zzcaoVar != null) {
            zzcaoVar2 = zzcanVar.zzr;
            zzcaoVar2.zzj(this.zza, this.zzb);
        }
    }
}
