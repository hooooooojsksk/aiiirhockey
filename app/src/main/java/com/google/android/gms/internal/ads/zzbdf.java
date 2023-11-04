package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzbdf extends zzasv implements IInterface {
    public zzbdf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
    }

    public final void zze(zzbsm zzbsmVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, zzbsmVar);
        zzbh(1, zza);
    }
}
