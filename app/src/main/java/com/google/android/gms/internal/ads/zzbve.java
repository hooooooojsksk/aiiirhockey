package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzbve extends zzasv implements IInterface {
    public zzbve(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
    }

    public final void zze(zzbut zzbutVar, String str, String str2) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, zzbutVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzbh(2, zza);
    }
}
