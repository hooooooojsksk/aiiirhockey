package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzbuu extends zzasv implements zzbuw {
    public zzbuu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final Bundle zzb() throws RemoteException {
        Parcel zzbg = zzbg(9, zza());
        Bundle bundle = (Bundle) zzasx.zza(zzbg, Bundle.CREATOR);
        zzbg.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final com.google.android.gms.ads.internal.client.zzdn zzc() throws RemoteException {
        Parcel zzbg = zzbg(12, zza());
        com.google.android.gms.ads.internal.client.zzdn zzb = com.google.android.gms.ads.internal.client.zzdm.zzb(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final zzbut zzd() throws RemoteException {
        zzbut zzburVar;
        Parcel zzbg = zzbg(11, zza());
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzburVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
            zzburVar = queryLocalInterface instanceof zzbut ? (zzbut) queryLocalInterface : new zzbur(readStrongBinder);
        }
        zzbg.recycle();
        return zzburVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final String zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final void zzf(com.google.android.gms.ads.internal.client.zzl zzlVar, zzbvd zzbvdVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zze(zza, zzlVar);
        zzasx.zzg(zza, zzbvdVar);
        zzbh(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final void zzg(com.google.android.gms.ads.internal.client.zzl zzlVar, zzbvd zzbvdVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zze(zza, zzlVar);
        zzasx.zzg(zza, zzbvdVar);
        zzbh(14, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final void zzh(boolean z) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzd(zza, z);
        zzbh(15, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final void zzi(com.google.android.gms.ads.internal.client.zzdd zzddVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, zzddVar);
        zzbh(8, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final void zzj(com.google.android.gms.ads.internal.client.zzdg zzdgVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, zzdgVar);
        zzbh(13, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final void zzk(zzbuz zzbuzVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, zzbuzVar);
        zzbh(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final void zzl(zzbvk zzbvkVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zze(zza, zzbvkVar);
        zzbh(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final void zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, iObjectWrapper);
        zzbh(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final void zzn(IObjectWrapper iObjectWrapper, boolean z) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final boolean zzo() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final void zzp(zzbve zzbveVar) throws RemoteException {
        throw null;
    }
}
