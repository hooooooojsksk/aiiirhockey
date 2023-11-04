package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzbyf extends com.google.android.gms.ads.internal.util.zzb {
    final /* synthetic */ zzbyj zza;

    public zzbyf(zzbyj zzbyjVar) {
        this.zza = zzbyjVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        Context context;
        zzbzg zzbzgVar;
        Object obj;
        zzbaz zzbazVar;
        zzbyj zzbyjVar = this.zza;
        context = zzbyjVar.zze;
        zzbzgVar = zzbyjVar.zzf;
        zzbax zzbaxVar = new zzbax(context, zzbzgVar.zza);
        obj = this.zza.zza;
        synchronized (obj) {
            try {
                com.google.android.gms.ads.internal.zzt.zze();
                zzbazVar = this.zza.zzh;
                zzbba.zza(zzbazVar, zzbaxVar);
            } catch (IllegalArgumentException e) {
                zzbza.zzk("Cannot config CSI reporter.", e);
            }
        }
    }
}
