package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* loaded from: classes2.dex */
public abstract class zzbea extends zzasw implements zzbeb {
    public zzbea() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    public static zzbeb zzbx(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
        return queryLocalInterface instanceof zzbeb ? (zzbeb) queryLocalInterface : new zzbdz(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    protected final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbdu zzbdsVar;
        switch (i) {
            case 1:
                String readString = parcel.readString();
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                zzbs(readString, asInterface);
                parcel2.writeNoException();
                return true;
            case 2:
                String readString2 = parcel.readString();
                zzasx.zzc(parcel);
                IObjectWrapper zzb = zzb(readString2);
                parcel2.writeNoException();
                zzasx.zzg(parcel2, zzb);
                return true;
            case 3:
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                zzbw(asInterface2);
                parcel2.writeNoException();
                return true;
            case 4:
                zzc();
                parcel2.writeNoException();
                return true;
            case 5:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                parcel.readInt();
                zzasx.zzc(parcel);
                parcel2.writeNoException();
                return true;
            case 6:
                IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                zzbt(asInterface3);
                parcel2.writeNoException();
                return true;
            case 7:
                IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                zzd(asInterface4);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzbdsVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
                    zzbdsVar = queryLocalInterface instanceof zzbdu ? (zzbdu) queryLocalInterface : new zzbds(readStrongBinder);
                }
                zzasx.zzc(parcel);
                zzbu(zzbdsVar);
                parcel2.writeNoException();
                return true;
            case 9:
                IObjectWrapper asInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                zzbv(asInterface5);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
