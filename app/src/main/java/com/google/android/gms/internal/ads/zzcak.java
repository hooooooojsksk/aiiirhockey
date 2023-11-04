package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzcak implements Runnable {
    final /* synthetic */ zzcan zza;

    public zzcak(zzcan zzcanVar) {
        this.zza = zzcanVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcao zzcaoVar;
        zzcao zzcaoVar2;
        zzcao zzcaoVar3;
        zzcan zzcanVar = this.zza;
        zzcaoVar = zzcanVar.zzr;
        if (zzcaoVar != null) {
            zzcaoVar2 = zzcanVar.zzr;
            zzcaoVar2.zzd();
            zzcaoVar3 = this.zza.zzr;
            zzcaoVar3.zzi();
        }
    }
}
