package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* loaded from: classes2.dex */
public abstract class zzbuy extends zzasw implements zzbuz {
    public zzbuy() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    protected final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbut zzburVar;
        switch (i) {
            case 1:
                zzj();
                break;
            case 2:
                zzg();
                break;
            case 3:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzburVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
                    zzburVar = queryLocalInterface instanceof zzbut ? (zzbut) queryLocalInterface : new zzbur(readStrongBinder);
                }
                zzasx.zzc(parcel);
                zzk(zzburVar);
                break;
            case 4:
                int readInt = parcel.readInt();
                zzasx.zzc(parcel);
                zzh(readInt);
                break;
            case 5:
                zzasx.zzc(parcel);
                zzi((com.google.android.gms.ads.internal.client.zze) zzasx.zza(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR));
                break;
            case 6:
                zzf();
                break;
            case 7:
                zze();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
