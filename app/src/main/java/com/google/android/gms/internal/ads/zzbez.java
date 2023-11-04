package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzbez extends zzasv implements zzbfb {
    public zzbez(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbfb
    public final void zze(zzber zzberVar, String str) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, zzberVar);
        zza.writeString(str);
        zzbh(1, zza);
    }
}
