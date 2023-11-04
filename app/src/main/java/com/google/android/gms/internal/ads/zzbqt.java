package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzbqt extends zzasv implements zzbqv {
    public zzbqt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    @Override // com.google.android.gms.internal.ads.zzbqv
    public final void zze(Intent intent) throws RemoteException {
        Parcel zza = zza();
        zzasx.zze(zza, intent);
        zzbh(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqv
    public final void zzf() throws RemoteException {
        zzbh(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbqv
    public final void zzg(IObjectWrapper iObjectWrapper, String str, String str2) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeString(str2);
        zzbh(2, zza);
    }
}
