package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzbew extends zzasv implements zzbey {
    public zzbew(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbey
    public final void zze(zzbeo zzbeoVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, zzbeoVar);
        zzbh(1, zza);
    }
}
