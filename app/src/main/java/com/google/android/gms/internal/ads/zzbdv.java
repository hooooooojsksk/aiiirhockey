package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzbdv extends zzasv implements zzbdx {
    public zzbdv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    @Override // com.google.android.gms.internal.ads.zzbdx
    public final double zzb() throws RemoteException {
        Parcel zzbg = zzbg(3, zza());
        double readDouble = zzbg.readDouble();
        zzbg.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.zzbdx
    public final int zzc() throws RemoteException {
        Parcel zzbg = zzbg(5, zza());
        int readInt = zzbg.readInt();
        zzbg.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.ads.zzbdx
    public final int zzd() throws RemoteException {
        Parcel zzbg = zzbg(4, zza());
        int readInt = zzbg.readInt();
        zzbg.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.ads.zzbdx
    public final Uri zze() throws RemoteException {
        Parcel zzbg = zzbg(2, zza());
        Uri uri = (Uri) zzasx.zza(zzbg, Uri.CREATOR);
        zzbg.recycle();
        return uri;
    }

    @Override // com.google.android.gms.internal.ads.zzbdx
    public final IObjectWrapper zzf() throws RemoteException {
        Parcel zzbg = zzbg(1, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzbg.readStrongBinder());
        zzbg.recycle();
        return asInterface;
    }
}
