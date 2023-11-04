package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzbqw extends zzasv implements zzbqy {
    public zzbqw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbqy
    public final zzbqv zze(IObjectWrapper iObjectWrapper, zzbnf zzbnfVar, int i) throws RemoteException {
        zzbqv zzbqtVar;
        Parcel zza = zza();
        zzasx.zzg(zza, iObjectWrapper);
        zzasx.zzg(zza, zzbnfVar);
        zza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel zzbg = zzbg(1, zza);
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzbqtVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            zzbqtVar = queryLocalInterface instanceof zzbqv ? (zzbqv) queryLocalInterface : new zzbqt(readStrongBinder);
        }
        zzbg.recycle();
        return zzbqtVar;
    }
}
