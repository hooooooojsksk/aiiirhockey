package com.google.android.gms.internal.ads;

import android.media.MediaPlayer;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzcaf implements Runnable {
    final /* synthetic */ MediaPlayer zza;
    final /* synthetic */ zzcan zzb;

    public zzcaf(zzcan zzcanVar, MediaPlayer mediaPlayer) {
        this.zzb = zzcanVar;
        this.zza = mediaPlayer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcao zzcaoVar;
        zzcao zzcaoVar2;
        zzcan.zzl(this.zzb, this.zza);
        zzcan zzcanVar = this.zzb;
        zzcaoVar = zzcanVar.zzr;
        if (zzcaoVar != null) {
            zzcaoVar2 = zzcanVar.zzr;
            zzcaoVar2.zzf();
        }
    }
}
