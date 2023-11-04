package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzbbn extends zzasv implements zzbbp {
    public zzbbn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbbp
    public final void zze(zzbbm zzbbmVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, zzbbmVar);
        zzbh(1, zza);
    }
}
