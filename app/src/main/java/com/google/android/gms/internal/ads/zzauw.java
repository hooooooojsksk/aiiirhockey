package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzauw extends zzasv implements zzauy {
    public zzauw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.zzauy
    public final com.google.android.gms.ads.internal.client.zzbu zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzauy
    public final com.google.android.gms.ads.internal.client.zzdn zzf() throws RemoteException {
        Parcel zzbg = zzbg(5, zza());
        com.google.android.gms.ads.internal.client.zzdn zzb = com.google.android.gms.ads.internal.client.zzdm.zzb(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzauy
    public final void zzg(boolean z) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzd(zza, z);
        zzbh(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzauy
    public final void zzh(com.google.android.gms.ads.internal.client.zzdg zzdgVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, zzdgVar);
        zzbh(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzauy
    public final void zzi(IObjectWrapper iObjectWrapper, zzavf zzavfVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, iObjectWrapper);
        zzasx.zzg(zza, zzavfVar);
        zzbh(4, zza);
    }
}
