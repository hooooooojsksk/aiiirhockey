package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzbns extends zzasv implements zzbnu {
    public zzbns(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    @Override // com.google.android.gms.internal.ads.zzbnu
    public final boolean zzA() throws RemoteException {
        Parcel zzbg = zzbg(18, zza());
        boolean zzh = zzasx.zzh(zzbg);
        zzbg.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzbnu
    public final boolean zzB() throws RemoteException {
        Parcel zzbg = zzbg(17, zza());
        boolean zzh = zzasx.zzh(zzbg);
        zzbg.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzbnu
    public final double zze() throws RemoteException {
        Parcel zzbg = zzbg(8, zza());
        double readDouble = zzbg.readDouble();
        zzbg.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.zzbnu
    public final float zzf() throws RemoteException {
        Parcel zzbg = zzbg(23, zza());
        float readFloat = zzbg.readFloat();
        zzbg.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbnu
    public final float zzg() throws RemoteException {
        Parcel zzbg = zzbg(25, zza());
        float readFloat = zzbg.readFloat();
        zzbg.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbnu
    public final float zzh() throws RemoteException {
        Parcel zzbg = zzbg(24, zza());
        float readFloat = zzbg.readFloat();
        zzbg.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbnu
    public final Bundle zzi() throws RemoteException {
        Parcel zzbg = zzbg(16, zza());
        Bundle bundle = (Bundle) zzasx.zza(zzbg, Bundle.CREATOR);
        zzbg.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbnu
    public final com.google.android.gms.ads.internal.client.zzdq zzj() throws RemoteException {
        Parcel zzbg = zzbg(11, zza());
        com.google.android.gms.ads.internal.client.zzdq zzb = com.google.android.gms.ads.internal.client.zzdp.zzb(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbnu
    public final zzbdp zzk() throws RemoteException {
        Parcel zzbg = zzbg(12, zza());
        zzbdp zzj = zzbdo.zzj(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzbnu
    public final zzbdx zzl() throws RemoteException {
        Parcel zzbg = zzbg(5, zza());
        zzbdx zzg = zzbdw.zzg(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbnu
    public final IObjectWrapper zzm() throws RemoteException {
        Parcel zzbg = zzbg(13, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzbg.readStrongBinder());
        zzbg.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbnu
    public final IObjectWrapper zzn() throws RemoteException {
        Parcel zzbg = zzbg(14, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzbg.readStrongBinder());
        zzbg.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbnu
    public final IObjectWrapper zzo() throws RemoteException {
        Parcel zzbg = zzbg(15, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzbg.readStrongBinder());
        zzbg.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbnu
    public final String zzp() throws RemoteException {
        Parcel zzbg = zzbg(7, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbnu
    public final String zzq() throws RemoteException {
        Parcel zzbg = zzbg(4, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbnu
    public final String zzr() throws RemoteException {
        Parcel zzbg = zzbg(6, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbnu
    public final String zzs() throws RemoteException {
        Parcel zzbg = zzbg(2, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbnu
    public final String zzt() throws RemoteException {
        Parcel zzbg = zzbg(10, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbnu
    public final String zzu() throws RemoteException {
        Parcel zzbg = zzbg(9, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbnu
    public final List zzv() throws RemoteException {
        Parcel zzbg = zzbg(3, zza());
        ArrayList zzb = zzasx.zzb(zzbg);
        zzbg.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbnu
    public final void zzw(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, iObjectWrapper);
        zzbh(20, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbnu
    public final void zzx() throws RemoteException {
        zzbh(19, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbnu
    public final void zzy(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, iObjectWrapper);
        zzasx.zzg(zza, iObjectWrapper2);
        zzasx.zzg(zza, iObjectWrapper3);
        zzbh(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbnu
    public final void zzz(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, iObjectWrapper);
        zzbh(22, zza);
    }
}
