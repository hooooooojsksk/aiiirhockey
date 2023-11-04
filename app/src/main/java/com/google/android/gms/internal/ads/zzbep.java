package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzbep extends zzasv implements zzber {
    public zzbep(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    @Override // com.google.android.gms.internal.ads.zzber
    public final com.google.android.gms.ads.internal.client.zzdq zze() throws RemoteException {
        Parcel zzbg = zzbg(7, zza());
        com.google.android.gms.ads.internal.client.zzdq zzb = com.google.android.gms.ads.internal.client.zzdp.zzb(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzber
    public final zzbdu zzf() throws RemoteException {
        zzbdu zzbdsVar;
        Parcel zzbg = zzbg(16, zza());
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

    @Override // com.google.android.gms.internal.ads.zzber
    public final zzbdx zzg(String str) throws RemoteException {
        zzbdx zzbdvVar;
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzbg = zzbg(2, zza);
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

    @Override // com.google.android.gms.internal.ads.zzber
    public final IObjectWrapper zzh() throws RemoteException {
        Parcel zzbg = zzbg(9, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzbg.readStrongBinder());
        zzbg.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzber
    public final String zzi() throws RemoteException {
        Parcel zzbg = zzbg(4, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzber
    public final String zzj(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzbg = zzbg(1, zza);
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzber
    public final List zzk() throws RemoteException {
        Parcel zzbg = zzbg(3, zza());
        ArrayList<String> createStringArrayList = zzbg.createStringArrayList();
        zzbg.recycle();
        return createStringArrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzber
    public final void zzl() throws RemoteException {
        zzbh(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzber
    public final void zzm() throws RemoteException {
        zzbh(15, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzber
    public final void zzn(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzbh(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzber
    public final void zzo() throws RemoteException {
        zzbh(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzber
    public final void zzp(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, iObjectWrapper);
        zzbh(14, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzber
    public final boolean zzq() throws RemoteException {
        Parcel zzbg = zzbg(12, zza());
        boolean zzh = zzasx.zzh(zzbg);
        zzbg.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzber
    public final boolean zzr(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, iObjectWrapper);
        Parcel zzbg = zzbg(10, zza);
        boolean zzh = zzasx.zzh(zzbg);
        zzbg.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzber
    public final boolean zzs() throws RemoteException {
        Parcel zzbg = zzbg(13, zza());
        boolean zzh = zzasx.zzh(zzbg);
        zzbg.recycle();
        return zzh;
    }
}
