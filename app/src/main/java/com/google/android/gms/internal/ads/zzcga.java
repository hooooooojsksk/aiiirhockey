package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzcga extends zzasv implements zzcgc {
    public zzcga(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.measurement.IMeasurementManager");
    }

    @Override // com.google.android.gms.internal.ads.zzcgc
    public final void zze(IObjectWrapper iObjectWrapper, zzcfz zzcfzVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, iObjectWrapper);
        zzasx.zzg(zza, zzcfzVar);
        zzbh(2, zza);
    }
}
