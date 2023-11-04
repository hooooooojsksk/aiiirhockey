package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzbth extends zzasv implements zzbtj {
    public zzbth(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbtj
    public final void zze(com.google.android.gms.ads.internal.util.zzaz zzazVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zze(zza, zzazVar);
        zzbh(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtj
    public final void zzf(ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
        Parcel zza = zza();
        zzasx.zze(zza, parcelFileDescriptor);
        zzbh(1, zza);
    }
}
