package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* loaded from: classes2.dex */
public abstract class zzava extends zzasw implements zzavb {
    public zzava() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    public static zzavb zze(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
        return queryLocalInterface instanceof zzavb ? (zzavb) queryLocalInterface : new zzauz(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    protected final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzauy zzauwVar;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                zzauwVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
                zzauwVar = queryLocalInterface instanceof zzauy ? (zzauy) queryLocalInterface : new zzauw(readStrongBinder);
            }
            zzasx.zzc(parcel);
            zzd(zzauwVar);
        } else if (i == 2) {
            parcel.readInt();
            zzasx.zzc(parcel);
        } else if (i != 3) {
            return false;
        } else {
            zzasx.zzc(parcel);
            zzc((com.google.android.gms.ads.internal.client.zze) zzasx.zza(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
