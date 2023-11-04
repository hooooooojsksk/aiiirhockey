package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzasv;
import com.google.android.gms.internal.ads.zzasx;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* loaded from: classes.dex */
public final class zzdo extends zzasv implements zzdq {
    public zzdo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final float zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final float zzf() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final float zzg() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final int zzh() throws RemoteException {
        Parcel zzbg = zzbg(5, zza());
        int readInt = zzbg.readInt();
        zzbg.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final zzdt zzi() throws RemoteException {
        zzdt zzdrVar;
        Parcel zzbg = zzbg(11, zza());
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzdrVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
            zzdrVar = queryLocalInterface instanceof zzdt ? (zzdt) queryLocalInterface : new zzdr(readStrongBinder);
        }
        zzbg.recycle();
        return zzdrVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzj(boolean z) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzd(zza, z);
        zzbh(3, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzk() throws RemoteException {
        zzbh(2, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzl() throws RemoteException {
        zzbh(1, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzm(zzdt zzdtVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, zzdtVar);
        zzbh(8, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzn() throws RemoteException {
        zzbh(13, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final boolean zzo() throws RemoteException {
        Parcel zzbg = zzbg(12, zza());
        boolean zzh = zzasx.zzh(zzbg);
        zzbg.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final boolean zzp() throws RemoteException {
        Parcel zzbg = zzbg(10, zza());
        boolean zzh = zzasx.zzh(zzbg);
        zzbg.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final boolean zzq() throws RemoteException {
        Parcel zzbg = zzbg(4, zza());
        boolean zzh = zzasx.zzh(zzbg);
        zzbg.recycle();
        return zzh;
    }
}
