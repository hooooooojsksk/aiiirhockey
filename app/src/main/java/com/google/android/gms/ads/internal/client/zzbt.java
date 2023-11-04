package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzasw;
import com.google.android.gms.internal.ads.zzasx;
import com.google.android.gms.internal.ads.zzava;
import com.google.android.gms.internal.ads.zzavb;
import com.google.android.gms.internal.ads.zzbbo;
import com.google.android.gms.internal.ads.zzbbp;
import com.google.android.gms.internal.ads.zzbrk;
import com.google.android.gms.internal.ads.zzbrl;
import com.google.android.gms.internal.ads.zzbrn;
import com.google.android.gms.internal.ads.zzbro;
import com.google.android.gms.internal.ads.zzbui;
import com.google.android.gms.internal.ads.zzbuj;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* loaded from: classes.dex */
public abstract class zzbt extends zzasw implements zzbu {
    public zzbt() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    public static zzbu zzac(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
        return queryLocalInterface instanceof zzbu ? (zzbu) queryLocalInterface : new zzbs(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    protected final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbh zzbhVar = null;
        zzci zzciVar = null;
        zzbk zzbkVar = null;
        zzdg zzdgVar = null;
        zzby zzbyVar = null;
        zzcf zzcfVar = null;
        zzbe zzbeVar = null;
        zzcb zzcbVar = null;
        switch (i) {
            case 1:
                IObjectWrapper zzn = zzn();
                parcel2.writeNoException();
                zzasx.zzg(parcel2, zzn);
                return true;
            case 2:
                zzx();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zzZ = zzZ();
                parcel2.writeNoException();
                zzasx.zzd(parcel2, zzZ);
                return true;
            case 4:
                zzasx.zzc(parcel);
                boolean zzaa = zzaa((zzl) zzasx.zza(parcel, zzl.CREATOR));
                parcel2.writeNoException();
                zzasx.zzd(parcel2, zzaa);
                return true;
            case 5:
                zzz();
                parcel2.writeNoException();
                return true;
            case 6:
                zzB();
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    zzbhVar = queryLocalInterface instanceof zzbh ? (zzbh) queryLocalInterface : new zzbf(readStrongBinder);
                }
                zzasx.zzc(parcel);
                zzD(zzbhVar);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    zzcbVar = queryLocalInterface2 instanceof zzcb ? (zzcb) queryLocalInterface2 : new zzbz(readStrongBinder2);
                }
                zzasx.zzc(parcel);
                zzG(zzcbVar);
                parcel2.writeNoException();
                return true;
            case 9:
                zzX();
                parcel2.writeNoException();
                return true;
            case 10:
                parcel2.writeNoException();
                return true;
            case 11:
                zzA();
                parcel2.writeNoException();
                return true;
            case 12:
                zzq zzg = zzg();
                parcel2.writeNoException();
                zzasx.zzf(parcel2, zzg);
                return true;
            case 13:
                zzasx.zzc(parcel);
                zzF((zzq) zzasx.zza(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                zzbrl zzb = zzbrk.zzb(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                zzM(zzb);
                parcel2.writeNoException();
                return true;
            case 15:
                zzbro zzb2 = zzbrn.zzb(parcel.readStrongBinder());
                String readString = parcel.readString();
                zzasx.zzc(parcel);
                zzQ(zzb2, readString);
                parcel2.writeNoException();
                return true;
            case 16:
            case 17:
            case 27:
            case 28:
            default:
                return false;
            case 18:
                String zzs = zzs();
                parcel2.writeNoException();
                parcel2.writeString(zzs);
                return true;
            case 19:
                zzbbp zzb3 = zzbbo.zzb(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                zzO(zzb3);
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    zzbeVar = queryLocalInterface3 instanceof zzbe ? (zzbe) queryLocalInterface3 : new zzbc(readStrongBinder3);
                }
                zzasx.zzc(parcel);
                zzC(zzbeVar);
                parcel2.writeNoException();
                return true;
            case 21:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    zzcfVar = queryLocalInterface4 instanceof zzcf ? (zzcf) queryLocalInterface4 : new zzcf(readStrongBinder4);
                }
                zzasx.zzc(parcel);
                zzab(zzcfVar);
                parcel2.writeNoException();
                return true;
            case 22:
                boolean zzh = zzasx.zzh(parcel);
                zzasx.zzc(parcel);
                zzN(zzh);
                parcel2.writeNoException();
                return true;
            case 23:
                boolean zzY = zzY();
                parcel2.writeNoException();
                zzasx.zzd(parcel2, zzY);
                return true;
            case 24:
                zzbuj zzb4 = zzbui.zzb(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                zzS(zzb4);
                parcel2.writeNoException();
                return true;
            case 25:
                String readString2 = parcel.readString();
                zzasx.zzc(parcel);
                zzT(readString2);
                parcel2.writeNoException();
                return true;
            case 26:
                zzdq zzl = zzl();
                parcel2.writeNoException();
                zzasx.zzg(parcel2, zzl);
                return true;
            case 29:
                zzasx.zzc(parcel);
                zzU((zzfl) zzasx.zza(parcel, zzfl.CREATOR));
                parcel2.writeNoException();
                return true;
            case 30:
                zzasx.zzc(parcel);
                zzK((zzdu) zzasx.zza(parcel, zzdu.CREATOR));
                parcel2.writeNoException();
                return true;
            case 31:
                String zzr = zzr();
                parcel2.writeNoException();
                parcel2.writeString(zzr);
                return true;
            case 32:
                zzcb zzj = zzj();
                parcel2.writeNoException();
                zzasx.zzg(parcel2, zzj);
                return true;
            case 33:
                zzbh zzi = zzi();
                parcel2.writeNoException();
                zzasx.zzg(parcel2, zzi);
                return true;
            case 34:
                boolean zzh2 = zzasx.zzh(parcel);
                zzasx.zzc(parcel);
                zzL(zzh2);
                parcel2.writeNoException();
                return true;
            case 35:
                String zzt = zzt();
                parcel2.writeNoException();
                parcel2.writeString(zzt);
                return true;
            case 36:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    zzbyVar = queryLocalInterface5 instanceof zzby ? (zzby) queryLocalInterface5 : new zzbw(readStrongBinder5);
                }
                zzasx.zzc(parcel);
                zzE(zzbyVar);
                parcel2.writeNoException();
                return true;
            case 37:
                Bundle zzd = zzd();
                parcel2.writeNoException();
                zzasx.zzf(parcel2, zzd);
                return true;
            case 38:
                String readString3 = parcel.readString();
                zzasx.zzc(parcel);
                zzR(readString3);
                parcel2.writeNoException();
                return true;
            case 39:
                zzasx.zzc(parcel);
                zzI((zzw) zzasx.zza(parcel, zzw.CREATOR));
                parcel2.writeNoException();
                return true;
            case 40:
                zzavb zze = zzava.zze(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                zzH(zze);
                parcel2.writeNoException();
                return true;
            case 41:
                zzdn zzk = zzk();
                parcel2.writeNoException();
                zzasx.zzg(parcel2, zzk);
                return true;
            case 42:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
                    zzdgVar = queryLocalInterface6 instanceof zzdg ? (zzdg) queryLocalInterface6 : new zzde(readStrongBinder6);
                }
                zzasx.zzc(parcel);
                zzP(zzdgVar);
                parcel2.writeNoException();
                return true;
            case 43:
                zzl zzlVar = (zzl) zzasx.zza(parcel, zzl.CREATOR);
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoadCallback");
                    zzbkVar = queryLocalInterface7 instanceof zzbk ? (zzbk) queryLocalInterface7 : new zzbi(readStrongBinder7);
                }
                zzasx.zzc(parcel);
                zzy(zzlVar, zzbkVar);
                parcel2.writeNoException();
                return true;
            case 44:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                zzW(asInterface);
                parcel2.writeNoException();
                return true;
            case 45:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                    zzciVar = queryLocalInterface8 instanceof zzci ? (zzci) queryLocalInterface8 : new zzcg(readStrongBinder8);
                }
                zzasx.zzc(parcel);
                zzJ(zzciVar);
                parcel2.writeNoException();
                return true;
        }
    }
}
