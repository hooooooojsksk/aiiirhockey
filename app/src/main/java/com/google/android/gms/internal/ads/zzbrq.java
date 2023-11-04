package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* loaded from: classes2.dex */
public abstract class zzbrq extends zzasw implements zzbrr {
    public zzbrq() {
        super("com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
    }

    public static zzbrr zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
        return queryLocalInterface instanceof zzbrr ? (zzbrr) queryLocalInterface : new zzbrp(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    protected final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            ArrayList createTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
            zzasx.zzc(parcel);
            zzf(createTypedArrayList);
        } else if (i != 2) {
            return false;
        } else {
            String readString = parcel.readString();
            zzasx.zzc(parcel);
            zze(readString);
        }
        parcel2.writeNoException();
        return true;
    }
}
