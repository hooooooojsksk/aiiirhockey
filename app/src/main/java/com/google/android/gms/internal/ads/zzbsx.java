package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzbsx extends zzasv implements zzbsz {
    public zzbsx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzbsz
    public final void zze(zzbtn zzbtnVar, zzbtj zzbtjVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zze(zza, zzbtnVar);
        zzasx.zzg(zza, zzbtjVar);
        zzbh(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsz
    public final void zzf(zzbtn zzbtnVar, zzbtj zzbtjVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zze(zza, zzbtnVar);
        zzasx.zzg(zza, zzbtjVar);
        zzbh(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsz
    public final void zzg(zzbtn zzbtnVar, zzbtj zzbtjVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zze(zza, zzbtnVar);
        zzasx.zzg(zza, zzbtjVar);
        zzbh(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsz
    public final void zzh(String str, zzbtj zzbtjVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzasx.zzg(zza, zzbtjVar);
        zzbh(7, zza);
    }
}
