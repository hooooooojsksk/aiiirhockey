package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzfbb implements zzfuf {
    final /* synthetic */ zzfbe zza;
    final /* synthetic */ zzfbf zzb;

    public zzfbb(zzfbf zzfbfVar, zzfbe zzfbeVar) {
        this.zzb = zzfbfVar;
        this.zza = zzfbeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final void zza(Throwable th) {
        synchronized (this.zzb) {
            this.zzb.zze = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ArrayDeque arrayDeque;
        int i;
        Void r4 = (Void) obj;
        synchronized (this.zzb) {
            this.zzb.zze = null;
            arrayDeque = this.zzb.zzd;
            arrayDeque.addFirst(this.zza);
            zzfbf zzfbfVar = this.zzb;
            i = zzfbfVar.zzf;
            if (i == 1) {
                zzfbfVar.zzh();
            }
        }
    }
}
