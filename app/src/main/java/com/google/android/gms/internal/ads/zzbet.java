package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzbet extends zzasv implements zzbev {
    public zzbet(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    public final void zze(zzbem zzbemVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, zzbemVar);
        zzbh(1, zza);
    }
}
