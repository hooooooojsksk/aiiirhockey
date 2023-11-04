package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzfjb extends zzasv implements IInterface {
    public zzfjb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    public final zzfiz zze(zzfix zzfixVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zze(zza, zzfixVar);
        Parcel zzbg = zzbg(1, zza);
        zzfiz zzfizVar = (zzfiz) zzasx.zza(zzbg, zzfiz.CREATOR);
        zzbg.recycle();
        return zzfizVar;
    }

    public final zzfji zzf(zzfjg zzfjgVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zze(zza, zzfjgVar);
        Parcel zzbg = zzbg(3, zza);
        zzfji zzfjiVar = (zzfji) zzasx.zza(zzbg, zzfji.CREATOR);
        zzbg.recycle();
        return zzfjiVar;
    }

    public final void zzg(zzfiu zzfiuVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zze(zza, zzfiuVar);
        zzbh(2, zza);
    }
}
