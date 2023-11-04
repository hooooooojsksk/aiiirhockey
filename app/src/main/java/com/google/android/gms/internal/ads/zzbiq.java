package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzbiq extends zzasv implements zzbis {
    public zzbiq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsManagerCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbis
    public final zzbip zze(IObjectWrapper iObjectWrapper, zzbnf zzbnfVar, int i, zzbim zzbimVar) throws RemoteException {
        zzbip zzbinVar;
        Parcel zza = zza();
        zzasx.zzg(zza, iObjectWrapper);
        zzasx.zzg(zza, zzbnfVar);
        zza.writeInt(ModuleDescriptor.MODULE_VERSION);
        zzasx.zzg(zza, zzbimVar);
        Parcel zzbg = zzbg(1, zza);
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzbinVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
            zzbinVar = queryLocalInterface instanceof zzbip ? (zzbip) queryLocalInterface : new zzbin(readStrongBinder);
        }
        zzbg.recycle();
        return zzbinVar;
    }
}
