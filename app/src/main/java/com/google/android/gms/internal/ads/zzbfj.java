package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzbfj extends zzasv implements zzbfl {
    public zzbfj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbfl
    public final void zze(zzbfu zzbfuVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, zzbfuVar);
        zzbh(1, zza);
    }
}
