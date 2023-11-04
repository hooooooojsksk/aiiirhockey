package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzasw;
import com.google.android.gms.internal.ads.zzasx;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* loaded from: classes.dex */
public abstract class zzdp extends zzasw implements zzdq {
    public zzdp() {
        super("com.google.android.gms.ads.internal.client.IVideoController");
    }

    public static zzdq zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
        return queryLocalInterface instanceof zzdq ? (zzdq) queryLocalInterface : new zzdo(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    protected final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzdt zzdrVar;
        switch (i) {
            case 1:
                zzl();
                parcel2.writeNoException();
                return true;
            case 2:
                zzk();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zzh = zzasx.zzh(parcel);
                zzasx.zzc(parcel);
                zzj(zzh);
                parcel2.writeNoException();
                return true;
            case 4:
                boolean zzq = zzq();
                parcel2.writeNoException();
                zzasx.zzd(parcel2, zzq);
                return true;
            case 5:
                int zzh2 = zzh();
                parcel2.writeNoException();
                parcel2.writeInt(zzh2);
                return true;
            case 6:
                float zzg = zzg();
                parcel2.writeNoException();
                parcel2.writeFloat(zzg);
                return true;
            case 7:
                float zzf = zzf();
                parcel2.writeNoException();
                parcel2.writeFloat(zzf);
                return true;
            case 8:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzdrVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
                    zzdrVar = queryLocalInterface instanceof zzdt ? (zzdt) queryLocalInterface : new zzdr(readStrongBinder);
                }
                zzasx.zzc(parcel);
                zzm(zzdrVar);
                parcel2.writeNoException();
                return true;
            case 9:
                float zze = zze();
                parcel2.writeNoException();
                parcel2.writeFloat(zze);
                return true;
            case 10:
                boolean zzp = zzp();
                parcel2.writeNoException();
                zzasx.zzd(parcel2, zzp);
                return true;
            case 11:
                zzdt zzi = zzi();
                parcel2.writeNoException();
                zzasx.zzg(parcel2, zzi);
                return true;
            case 12:
                boolean zzo = zzo();
                parcel2.writeNoException();
                zzasx.zzd(parcel2, zzo);
                return true;
            case 13:
                zzn();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
