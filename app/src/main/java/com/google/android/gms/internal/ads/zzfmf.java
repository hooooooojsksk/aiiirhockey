package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzfmf extends zzasv implements zzfmh {
    public zzfmf(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.lmd.protocol.ILmdOverlayService");
    }

    @Override // com.google.android.gms.internal.ads.zzfmh
    public final void zze(Bundle bundle, zzfmj zzfmjVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zze(zza, bundle);
        zzasx.zzg(zza, zzfmjVar);
        zzbi(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfmh
    public final void zzf(String str, Bundle bundle, zzfmj zzfmjVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzasx.zze(zza, bundle);
        zzasx.zzg(zza, zzfmjVar);
        zzbi(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfmh
    public final void zzg(Bundle bundle, zzfmj zzfmjVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zze(zza, bundle);
        zzasx.zzg(zza, zzfmjVar);
        zzbi(3, zza);
    }
}
