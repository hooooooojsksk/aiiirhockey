package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzauz extends zzasv implements zzavb {
    public zzauz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzavb
    public final void zzb(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzbh(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzavb
    public final void zzc(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zze(zza, zzeVar);
        zzbh(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzavb
    public final void zzd(zzauy zzauyVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, zzauyVar);
        zzbh(1, zza);
    }
}
