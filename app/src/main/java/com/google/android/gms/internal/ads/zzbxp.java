package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzbxp extends zzasv implements zzbxr {
    public zzbxp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    @Override // com.google.android.gms.internal.ads.zzbxr
    public final void zze(IObjectWrapper iObjectWrapper, zzbxv zzbxvVar, zzbxo zzbxoVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, iObjectWrapper);
        zzasx.zze(zza, zzbxvVar);
        zzasx.zzg(zza, zzbxoVar);
        zzbh(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxr
    public final void zzf(zzbsa zzbsaVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zze(zza, zzbsaVar);
        zzbh(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxr
    public final void zzg(List list, IObjectWrapper iObjectWrapper, zzbrr zzbrrVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzasx.zzg(zza, iObjectWrapper);
        zzasx.zzg(zza, zzbrrVar);
        zzbh(10, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxr
    public final void zzh(List list, IObjectWrapper iObjectWrapper, zzbrr zzbrrVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzasx.zzg(zza, iObjectWrapper);
        zzasx.zzg(zza, zzbrrVar);
        zzbh(9, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxr
    public final void zzi(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, iObjectWrapper);
        zzbh(8, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxr
    public final void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, iObjectWrapper);
        zzbh(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxr
    public final void zzk(List list, IObjectWrapper iObjectWrapper, zzbrr zzbrrVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzasx.zzg(zza, iObjectWrapper);
        zzasx.zzg(zza, zzbrrVar);
        zzbh(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxr
    public final void zzl(List list, IObjectWrapper iObjectWrapper, zzbrr zzbrrVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzasx.zzg(zza, iObjectWrapper);
        zzasx.zzg(zza, zzbrrVar);
        zzbh(5, zza);
    }
}
