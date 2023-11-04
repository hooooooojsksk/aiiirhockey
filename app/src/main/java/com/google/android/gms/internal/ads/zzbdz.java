package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzbdz extends zzasv implements zzbeb {
    public zzbdz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    @Override // com.google.android.gms.internal.ads.zzbeb
    public final IObjectWrapper zzb(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzbg = zzbg(2, zza);
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzbg.readStrongBinder());
        zzbg.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbeb
    public final void zzbs(String str, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzasx.zzg(zza, iObjectWrapper);
        zzbh(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbeb
    public final void zzbt(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, iObjectWrapper);
        zzbh(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbeb
    public final void zzbu(zzbdu zzbduVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, zzbduVar);
        zzbh(8, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbeb
    public final void zzbv(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, iObjectWrapper);
        zzbh(9, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbeb
    public final void zzbw(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, iObjectWrapper);
        zzbh(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbeb
    public final void zzc() throws RemoteException {
        zzbh(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbeb
    public final void zzd(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, iObjectWrapper);
        zzbh(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbeb
    public final void zze(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, iObjectWrapper);
        zza.writeInt(i);
        zzbh(5, zza);
    }
}
