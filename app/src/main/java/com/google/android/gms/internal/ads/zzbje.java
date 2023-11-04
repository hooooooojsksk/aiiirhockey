package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzbje extends zzasv implements IInterface {
    public zzbje(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    public final void zze(zzbiy zzbiyVar, zzbjd zzbjdVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zze(zza, zzbiyVar);
        zzasx.zzg(zza, zzbjdVar);
        zzbi(2, zza);
    }
}
