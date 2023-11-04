package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzbux extends zzasv implements zzbuz {
    public zzbux(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbuz
    public final void zze() throws RemoteException {
        zzbh(7, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbuz
    public final void zzf() throws RemoteException {
        zzbh(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbuz
    public final void zzg() throws RemoteException {
        zzbh(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbuz
    public final void zzh(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzbh(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuz
    public final void zzi(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zze(zza, zzeVar);
        zzbh(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuz
    public final void zzj() throws RemoteException {
        zzbh(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbuz
    public final void zzk(zzbut zzbutVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, zzbutVar);
        zzbh(3, zza);
    }
}
