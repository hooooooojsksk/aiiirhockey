package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes.dex */
public final class zzcrs implements zzfuf {
    final /* synthetic */ zzcrt zza;

    public zzcrs(zzcrt zzcrtVar) {
        this.zza = zzcrtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final void zza(Throwable th) {
        zzczt zzcztVar;
        zzcztVar = this.zza.zzf;
        zzcztVar.zzh(false);
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final /* bridge */ /* synthetic */ void zzb(@NullableDecl Object obj) {
        zzczt zzcztVar;
        Void r2 = (Void) obj;
        zzcztVar = this.zza.zzf;
        zzcztVar.zzh(true);
    }
}
