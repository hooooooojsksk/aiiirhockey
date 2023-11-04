package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public abstract class zzbsy extends zzasw implements zzbsz {
    public zzbsy() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    protected final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbtj zzbtjVar = null;
        if (i == 1) {
            zzbso zzbsoVar = (zzbso) zzasx.zza(parcel, zzbso.CREATOR);
            zzasx.zzc(parcel);
            parcel2.writeNoException();
            zzasx.zzf(parcel2, null);
        } else if (i == 2) {
            zzbso zzbsoVar2 = (zzbso) zzasx.zza(parcel, zzbso.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                if (queryLocalInterface instanceof zzbta) {
                    zzbta zzbtaVar = (zzbta) queryLocalInterface;
                }
            }
            zzasx.zzc(parcel);
            parcel2.writeNoException();
        } else if (i == 4) {
            zzbtn zzbtnVar = (zzbtn) zzasx.zza(parcel, zzbtn.CREATOR);
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                zzbtjVar = queryLocalInterface2 instanceof zzbtj ? (zzbtj) queryLocalInterface2 : new zzbth(readStrongBinder2);
            }
            zzasx.zzc(parcel);
            zzg(zzbtnVar, zzbtjVar);
            parcel2.writeNoException();
        } else if (i == 5) {
            zzbtn zzbtnVar2 = (zzbtn) zzasx.zza(parcel, zzbtn.CREATOR);
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                zzbtjVar = queryLocalInterface3 instanceof zzbtj ? (zzbtj) queryLocalInterface3 : new zzbth(readStrongBinder3);
            }
            zzasx.zzc(parcel);
            zzf(zzbtnVar2, zzbtjVar);
            parcel2.writeNoException();
        } else if (i == 6) {
            zzbtn zzbtnVar3 = (zzbtn) zzasx.zza(parcel, zzbtn.CREATOR);
            IBinder readStrongBinder4 = parcel.readStrongBinder();
            if (readStrongBinder4 != null) {
                IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                zzbtjVar = queryLocalInterface4 instanceof zzbtj ? (zzbtj) queryLocalInterface4 : new zzbth(readStrongBinder4);
            }
            zzasx.zzc(parcel);
            zze(zzbtnVar3, zzbtjVar);
            parcel2.writeNoException();
        } else if (i != 7) {
            return false;
        } else {
            String readString = parcel.readString();
            IBinder readStrongBinder5 = parcel.readStrongBinder();
            if (readStrongBinder5 != null) {
                IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                zzbtjVar = queryLocalInterface5 instanceof zzbtj ? (zzbtj) queryLocalInterface5 : new zzbth(readStrongBinder5);
            }
            zzasx.zzc(parcel);
            zzh(readString, zzbtjVar);
            parcel2.writeNoException();
        }
        return true;
    }
}
