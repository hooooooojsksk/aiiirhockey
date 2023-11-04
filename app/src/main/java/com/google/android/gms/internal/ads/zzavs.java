package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzavs extends zzasv implements IInterface {
    public zzavs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    public final long zze(zzavq zzavqVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zze(zza, zzavqVar);
        Parcel zzbg = zzbg(3, zza);
        long readLong = zzbg.readLong();
        zzbg.recycle();
        return readLong;
    }

    public final zzavn zzf(zzavq zzavqVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zze(zza, zzavqVar);
        Parcel zzbg = zzbg(1, zza);
        zzavn zzavnVar = (zzavn) zzasx.zza(zzbg, zzavn.CREATOR);
        zzbg.recycle();
        return zzavnVar;
    }

    public final zzavn zzg(zzavq zzavqVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zze(zza, zzavqVar);
        Parcel zzbg = zzbg(2, zza);
        zzavn zzavnVar = (zzavn) zzasx.zza(zzbg, zzavn.CREATOR);
        zzbg.recycle();
        return zzavnVar;
    }
}
