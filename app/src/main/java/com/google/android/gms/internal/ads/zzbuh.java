package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzbuh extends zzasv implements zzbuj {
    public zzbuh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbuj
    public final void zze(zzbud zzbudVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, zzbudVar);
        zzbh(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuj
    public final void zzf() throws RemoteException {
        zzbh(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbuj
    public final void zzg(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzbh(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuj
    public final void zzh() throws RemoteException {
        zzbh(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbuj
    public final void zzi() throws RemoteException {
        zzbh(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbuj
    public final void zzj() throws RemoteException {
        zzbh(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbuj
    public final void zzk() throws RemoteException {
        zzbh(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbuj
    public final void zzl() throws RemoteException {
        zzbh(3, zza());
    }
}
