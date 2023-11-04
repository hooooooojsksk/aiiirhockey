package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* loaded from: classes2.dex */
public abstract class zzbuv extends zzasw implements zzbuw {
    public zzbuv() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    public static zzbuw zzq(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
        return queryLocalInterface instanceof zzbuw ? (zzbuw) queryLocalInterface : new zzbuu(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    protected final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbvd zzbvdVar = null;
        zzbvd zzbvdVar2 = null;
        zzbve zzbveVar = null;
        zzbuz zzbuzVar = null;
        switch (i) {
            case 1:
                com.google.android.gms.ads.internal.client.zzl zzlVar = (com.google.android.gms.ads.internal.client.zzl) zzasx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    zzbvdVar = queryLocalInterface instanceof zzbvd ? (zzbvd) queryLocalInterface : new zzbvb(readStrongBinder);
                }
                zzasx.zzc(parcel);
                zzf(zzlVar, zzbvdVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    zzbuzVar = queryLocalInterface2 instanceof zzbuz ? (zzbuz) queryLocalInterface2 : new zzbux(readStrongBinder2);
                }
                zzasx.zzc(parcel);
                zzk(zzbuzVar);
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zzo = zzo();
                parcel2.writeNoException();
                zzasx.zzd(parcel2, zzo);
                return true;
            case 4:
                String zze = zze();
                parcel2.writeNoException();
                parcel2.writeString(zze);
                return true;
            case 5:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                zzm(asInterface);
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    zzbveVar = queryLocalInterface3 instanceof zzbve ? (zzbve) queryLocalInterface3 : new zzbve(readStrongBinder3);
                }
                zzasx.zzc(parcel);
                zzp(zzbveVar);
                parcel2.writeNoException();
                return true;
            case 7:
                zzasx.zzc(parcel);
                zzl((zzbvk) zzasx.zza(parcel, zzbvk.CREATOR));
                parcel2.writeNoException();
                return true;
            case 8:
                com.google.android.gms.ads.internal.client.zzdd zzb = com.google.android.gms.ads.internal.client.zzdc.zzb(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                zzi(zzb);
                parcel2.writeNoException();
                return true;
            case 9:
                Bundle zzb2 = zzb();
                parcel2.writeNoException();
                zzasx.zzf(parcel2, zzb2);
                return true;
            case 10:
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                boolean zzh = zzasx.zzh(parcel);
                zzasx.zzc(parcel);
                zzn(asInterface2, zzh);
                parcel2.writeNoException();
                return true;
            case 11:
                zzbut zzd = zzd();
                parcel2.writeNoException();
                zzasx.zzg(parcel2, zzd);
                return true;
            case 12:
                com.google.android.gms.ads.internal.client.zzdn zzc = zzc();
                parcel2.writeNoException();
                zzasx.zzg(parcel2, zzc);
                return true;
            case 13:
                com.google.android.gms.ads.internal.client.zzdg zzb3 = com.google.android.gms.ads.internal.client.zzdf.zzb(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                zzj(zzb3);
                parcel2.writeNoException();
                return true;
            case 14:
                com.google.android.gms.ads.internal.client.zzl zzlVar2 = (com.google.android.gms.ads.internal.client.zzl) zzasx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    zzbvdVar2 = queryLocalInterface4 instanceof zzbvd ? (zzbvd) queryLocalInterface4 : new zzbvb(readStrongBinder4);
                }
                zzasx.zzc(parcel);
                zzg(zzlVar2, zzbvdVar2);
                parcel2.writeNoException();
                return true;
            case 15:
                boolean zzh2 = zzasx.zzh(parcel);
                zzasx.zzc(parcel);
                zzh(zzh2);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
