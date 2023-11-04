package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzbtb extends zzasv implements zzbtd {
    public zzbtb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdsService");
    }

    @Override // com.google.android.gms.internal.ads.zzbtd
    public final void zze(zzbsv zzbsvVar, zzbtg zzbtgVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zze(zza, zzbsvVar);
        zzasx.zzg(zza, zzbtgVar);
        zzbh(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtd
    public final void zzf(zzbsr zzbsrVar, zzbtg zzbtgVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zze(zza, zzbsrVar);
        zzasx.zzg(zza, zzbtgVar);
        zzbh(1, zza);
    }
}
