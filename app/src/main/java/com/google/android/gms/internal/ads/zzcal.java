package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzcal implements Runnable {
    final /* synthetic */ zzcan zza;

    public zzcal(zzcan zzcanVar) {
        this.zza = zzcanVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcao zzcaoVar;
        boolean z;
        zzcao zzcaoVar2;
        zzcao zzcaoVar3;
        zzcan zzcanVar = this.zza;
        zzcaoVar = zzcanVar.zzr;
        if (zzcaoVar != null) {
            z = zzcanVar.zzs;
            if (!z) {
                zzcaoVar3 = zzcanVar.zzr;
                zzcaoVar3.zzg();
                this.zza.zzs = true;
            }
            zzcaoVar2 = this.zza.zzr;
            zzcaoVar2.zze();
        }
    }
}
