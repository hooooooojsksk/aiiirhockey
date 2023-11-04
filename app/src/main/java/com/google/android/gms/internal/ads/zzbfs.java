package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzbfs extends zzasv implements zzbfu {
    public zzbfs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final void zzA() throws RemoteException {
        zzbh(28, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final void zzB(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zzasx.zze(zza, bundle);
        zzbh(17, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final void zzC() throws RemoteException {
        zzbh(27, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final void zzD(com.google.android.gms.ads.internal.client.zzcs zzcsVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, zzcsVar);
        zzbh(26, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final void zzE(com.google.android.gms.ads.internal.client.zzdg zzdgVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, zzdgVar);
        zzbh(32, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final void zzF(zzbfr zzbfrVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, zzbfrVar);
        zzbh(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final boolean zzG() throws RemoteException {
        Parcel zzbg = zzbg(30, zza());
        boolean zzh = zzasx.zzh(zzbg);
        zzbg.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final boolean zzH() throws RemoteException {
        Parcel zzbg = zzbg(24, zza());
        boolean zzh = zzasx.zzh(zzbg);
        zzbg.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final boolean zzI(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zzasx.zze(zza, bundle);
        Parcel zzbg = zzbg(16, zza);
        boolean zzh = zzasx.zzh(zzbg);
        zzbg.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final double zze() throws RemoteException {
        Parcel zzbg = zzbg(8, zza());
        double readDouble = zzbg.readDouble();
        zzbg.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final Bundle zzf() throws RemoteException {
        Parcel zzbg = zzbg(20, zza());
        Bundle bundle = (Bundle) zzasx.zza(zzbg, Bundle.CREATOR);
        zzbg.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final com.google.android.gms.ads.internal.client.zzdn zzg() throws RemoteException {
        Parcel zzbg = zzbg(31, zza());
        com.google.android.gms.ads.internal.client.zzdn zzb = com.google.android.gms.ads.internal.client.zzdm.zzb(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final com.google.android.gms.ads.internal.client.zzdq zzh() throws RemoteException {
        Parcel zzbg = zzbg(11, zza());
        com.google.android.gms.ads.internal.client.zzdq zzb = com.google.android.gms.ads.internal.client.zzdp.zzb(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final zzbdp zzi() throws RemoteException {
        zzbdp zzbdnVar;
        Parcel zzbg = zzbg(14, zza());
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzbdnVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            zzbdnVar = queryLocalInterface instanceof zzbdp ? (zzbdp) queryLocalInterface : new zzbdn(readStrongBinder);
        }
        zzbg.recycle();
        return zzbdnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final zzbdu zzj() throws RemoteException {
        zzbdu zzbdsVar;
        Parcel zzbg = zzbg(29, zza());
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzbdsVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
            zzbdsVar = queryLocalInterface instanceof zzbdu ? (zzbdu) queryLocalInterface : new zzbds(readStrongBinder);
        }
        zzbg.recycle();
        return zzbdsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final zzbdx zzk() throws RemoteException {
        zzbdx zzbdvVar;
        Parcel zzbg = zzbg(5, zza());
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzbdvVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            zzbdvVar = queryLocalInterface instanceof zzbdx ? (zzbdx) queryLocalInterface : new zzbdv(readStrongBinder);
        }
        zzbg.recycle();
        return zzbdvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final IObjectWrapper zzl() throws RemoteException {
        Parcel zzbg = zzbg(19, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzbg.readStrongBinder());
        zzbg.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final IObjectWrapper zzm() throws RemoteException {
        Parcel zzbg = zzbg(18, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzbg.readStrongBinder());
        zzbg.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final String zzn() throws RemoteException {
        Parcel zzbg = zzbg(7, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final String zzo() throws RemoteException {
        Parcel zzbg = zzbg(4, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final String zzp() throws RemoteException {
        Parcel zzbg = zzbg(6, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final String zzq() throws RemoteException {
        Parcel zzbg = zzbg(2, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final String zzr() throws RemoteException {
        Parcel zzbg = zzbg(12, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final String zzs() throws RemoteException {
        Parcel zzbg = zzbg(10, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final String zzt() throws RemoteException {
        Parcel zzbg = zzbg(9, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final List zzu() throws RemoteException {
        Parcel zzbg = zzbg(3, zza());
        ArrayList zzb = zzasx.zzb(zzbg);
        zzbg.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final List zzv() throws RemoteException {
        Parcel zzbg = zzbg(23, zza());
        ArrayList zzb = zzasx.zzb(zzbg);
        zzbg.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final void zzw() throws RemoteException {
        zzbh(22, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final void zzx() throws RemoteException {
        zzbh(13, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final void zzy(com.google.android.gms.ads.internal.client.zzcw zzcwVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, zzcwVar);
        zzbh(25, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final void zzz(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zzasx.zze(zza, bundle);
        zzbh(15, zza);
    }
}
