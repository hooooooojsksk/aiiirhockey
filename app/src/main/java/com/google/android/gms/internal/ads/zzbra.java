package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzbra extends zzasv implements zzbrc {
    public zzbra(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    @Override // com.google.android.gms.internal.ads.zzbrc
    public final boolean zzE() throws RemoteException {
        Parcel zzbg = zzbg(11, zza());
        boolean zzh = zzasx.zzh(zzbg);
        zzbg.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzbrc
    public final void zzg(int i, int i2, Intent intent) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zza.writeInt(i2);
        zzasx.zze(zza, intent);
        zzbh(12, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrc
    public final void zzh() throws RemoteException {
        zzbh(10, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbrc
    public final void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, iObjectWrapper);
        zzbh(13, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrc
    public final void zzk(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zzasx.zze(zza, bundle);
        zzbh(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrc
    public final void zzl() throws RemoteException {
        zzbh(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbrc
    public final void zzn() throws RemoteException {
        zzbh(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbrc
    public final void zzo() throws RemoteException {
        zzbh(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbrc
    public final void zzp() throws RemoteException {
        zzbh(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbrc
    public final void zzq(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zzasx.zze(zza, bundle);
        Parcel zzbg = zzbg(6, zza);
        if (zzbg.readInt() != 0) {
            bundle.readFromParcel(zzbg);
        }
        zzbg.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzbrc
    public final void zzr() throws RemoteException {
        zzbh(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbrc
    public final void zzs() throws RemoteException {
        zzbh(7, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbrc
    public final void zzt() throws RemoteException {
        zzbh(14, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbrc
    public final void zzv() throws RemoteException {
        zzbh(9, zza());
    }
}
