package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzasw;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* loaded from: classes.dex */
public abstract class zzcr extends zzasw implements zzcs {
    public zzcr() {
        super("com.google.android.gms.ads.internal.client.IMuteThisAdListener");
    }

    public static zzcs zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdListener");
        return queryLocalInterface instanceof zzcs ? (zzcs) queryLocalInterface : new zzcq(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    protected final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zze();
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
