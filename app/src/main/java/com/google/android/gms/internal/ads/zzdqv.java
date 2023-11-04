package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzdqv extends zzbvc {
    final /* synthetic */ zzdqx zza;

    public zzdqv(zzdqx zzdqxVar) {
        this.zza = zzdqxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvd
    public final void zze(int i) throws RemoteException {
        zzdqm zzdqmVar;
        long j;
        zzdqx zzdqxVar = this.zza;
        zzdqmVar = zzdqxVar.zzb;
        j = zzdqxVar.zza;
        zzdqmVar.zzm(j, i);
    }

    @Override // com.google.android.gms.internal.ads.zzbvd
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        zzdqm zzdqmVar;
        long j;
        zzdqx zzdqxVar = this.zza;
        zzdqmVar = zzdqxVar.zzb;
        j = zzdqxVar.zza;
        zzdqmVar.zzm(j, zzeVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvd
    public final void zzg() throws RemoteException {
        zzdqm zzdqmVar;
        long j;
        zzdqx zzdqxVar = this.zza;
        zzdqmVar = zzdqxVar.zzb;
        j = zzdqxVar.zza;
        zzdqmVar.zzp(j);
    }
}
