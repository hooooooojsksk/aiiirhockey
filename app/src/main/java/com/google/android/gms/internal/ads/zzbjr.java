package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* loaded from: classes2.dex */
public abstract class zzbjr extends zzasw implements zzbjs {
    public zzbjr() {
        super("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    public static zzbjs zzc(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
        return queryLocalInterface instanceof zzbjs ? (zzbjs) queryLocalInterface : new zzbjq(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    protected final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            ArrayList createTypedArrayList = parcel.createTypedArrayList(zzbjl.CREATOR);
            zzasx.zzc(parcel);
            zzb(createTypedArrayList);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
