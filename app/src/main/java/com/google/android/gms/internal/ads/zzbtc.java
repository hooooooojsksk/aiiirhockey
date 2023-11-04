package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public abstract class zzbtc extends zzasw implements zzbtd {
    public zzbtc() {
        super("com.google.android.gms.ads.internal.request.IAdsService");
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    protected final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbtg zzbtgVar = null;
        if (i == 1) {
            zzbsr zzbsrVar = (zzbsr) zzasx.zza(parcel, zzbsr.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                zzbtgVar = queryLocalInterface instanceof zzbtg ? (zzbtg) queryLocalInterface : new zzbte(readStrongBinder);
            }
            zzasx.zzc(parcel);
            zzf(zzbsrVar, zzbtgVar);
        } else if (i == 2) {
            zzbsr zzbsrVar2 = (zzbsr) zzasx.zza(parcel, zzbsr.CREATOR);
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                if (queryLocalInterface2 instanceof zzbtg) {
                    zzbtg zzbtgVar2 = (zzbtg) queryLocalInterface2;
                }
            }
            zzasx.zzc(parcel);
        } else if (i != 3) {
            return false;
        } else {
            zzbsv zzbsvVar = (zzbsv) zzasx.zza(parcel, zzbsv.CREATOR);
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                zzbtgVar = queryLocalInterface3 instanceof zzbtg ? (zzbtg) queryLocalInterface3 : new zzbte(readStrongBinder3);
            }
            zzasx.zzc(parcel);
            zze(zzbsvVar, zzbtgVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
