package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzcah implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzcan zzc;

    public zzcah(zzcan zzcanVar, String str, String str2) {
        this.zzc = zzcanVar;
        this.zza = str;
        this.zzb = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcao zzcaoVar;
        zzcao zzcaoVar2;
        zzcan zzcanVar = this.zzc;
        zzcaoVar = zzcanVar.zzr;
        if (zzcaoVar != null) {
            zzcaoVar2 = zzcanVar.zzr;
            zzcaoVar2.zzb(this.zza, this.zzb);
        }
    }
}
