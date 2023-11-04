package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzasv;
import com.google.android.gms.internal.ads.zzasx;
import com.google.android.gms.internal.ads.zzbne;
import com.google.android.gms.internal.ads.zzbnf;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* loaded from: classes.dex */
public final class zzcj extends zzasv implements zzcl {
    public zzcj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcl
    public final zzbnf getAdapterCreator() throws RemoteException {
        Parcel zzbg = zzbg(2, zza());
        zzbnf zzf = zzbne.zzf(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzf;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcl
    public final zzen getLiteSdkVersion() throws RemoteException {
        Parcel zzbg = zzbg(1, zza());
        zzen zzenVar = (zzen) zzasx.zza(zzbg, zzen.CREATOR);
        zzbg.recycle();
        return zzenVar;
    }
}
