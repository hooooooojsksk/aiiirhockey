package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* loaded from: classes2.dex */
public abstract class zzbpb extends zzasw implements zzbpc {
    public zzbpb() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public static zzbpc zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        return queryLocalInterface instanceof zzbpc ? (zzbpc) queryLocalInterface : new zzbpa(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    protected final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbpf zzbpfVar = null;
        zzbon zzbolVar = null;
        zzbow zzbouVar = null;
        zzboq zzbooVar = null;
        zzboz zzboxVar = null;
        zzbow zzbouVar2 = null;
        zzboz zzboxVar2 = null;
        zzbot zzborVar = null;
        zzboq zzbooVar2 = null;
        if (i == 1) {
            IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            String readString = parcel.readString();
            Bundle bundle = (Bundle) zzasx.zza(parcel, Bundle.CREATOR);
            Bundle bundle2 = (Bundle) zzasx.zza(parcel, Bundle.CREATOR);
            com.google.android.gms.ads.internal.client.zzq zzqVar = (com.google.android.gms.ads.internal.client.zzq) zzasx.zza(parcel, com.google.android.gms.ads.internal.client.zzq.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
                zzbpfVar = queryLocalInterface instanceof zzbpf ? (zzbpf) queryLocalInterface : new zzbpd(readStrongBinder);
            }
            zzbpf zzbpfVar2 = zzbpfVar;
            zzasx.zzc(parcel);
            zzh(asInterface, readString, bundle, bundle2, zzqVar, zzbpfVar2);
            parcel2.writeNoException();
        } else if (i == 2) {
            zzbpq zzf = zzf();
            parcel2.writeNoException();
            zzasx.zzf(parcel2, zzf);
        } else if (i == 3) {
            zzbpq zzg = zzg();
            parcel2.writeNoException();
            zzasx.zzf(parcel2, zzg);
        } else if (i == 5) {
            com.google.android.gms.ads.internal.client.zzdq zze = zze();
            parcel2.writeNoException();
            zzasx.zzg(parcel2, zze);
        } else if (i == 10) {
            IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzasx.zzc(parcel);
            parcel2.writeNoException();
        } else if (i != 11) {
            switch (i) {
                case 13:
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzl zzlVar = (com.google.android.gms.ads.internal.client.zzl) zzasx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                    IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder2 = parcel.readStrongBinder();
                    if (readStrongBinder2 != null) {
                        IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        zzbooVar2 = queryLocalInterface2 instanceof zzboq ? (zzboq) queryLocalInterface2 : new zzboo(readStrongBinder2);
                    }
                    zzboq zzboqVar = zzbooVar2;
                    zzasx.zzc(parcel);
                    zzj(readString2, readString3, zzlVar, asInterface2, zzboqVar, zzbnk.zzb(parcel.readStrongBinder()), (com.google.android.gms.ads.internal.client.zzq) zzasx.zza(parcel, com.google.android.gms.ads.internal.client.zzq.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 14:
                    String readString4 = parcel.readString();
                    String readString5 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzl zzlVar2 = (com.google.android.gms.ads.internal.client.zzl) zzasx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                    IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder3 = parcel.readStrongBinder();
                    if (readStrongBinder3 != null) {
                        IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                        zzborVar = queryLocalInterface3 instanceof zzbot ? (zzbot) queryLocalInterface3 : new zzbor(readStrongBinder3);
                    }
                    zzbot zzbotVar = zzborVar;
                    zzbnl zzb = zzbnk.zzb(parcel.readStrongBinder());
                    zzasx.zzc(parcel);
                    zzl(readString4, readString5, zzlVar2, asInterface3, zzbotVar, zzb);
                    parcel2.writeNoException();
                    break;
                case 15:
                    IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    zzasx.zzc(parcel);
                    boolean zzs = zzs(asInterface4);
                    parcel2.writeNoException();
                    zzasx.zzd(parcel2, zzs);
                    break;
                case 16:
                    String readString6 = parcel.readString();
                    String readString7 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzl zzlVar3 = (com.google.android.gms.ads.internal.client.zzl) zzasx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                    IObjectWrapper asInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder4 = parcel.readStrongBinder();
                    if (readStrongBinder4 != null) {
                        IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        zzboxVar2 = queryLocalInterface4 instanceof zzboz ? (zzboz) queryLocalInterface4 : new zzbox(readStrongBinder4);
                    }
                    zzboz zzbozVar = zzboxVar2;
                    zzbnl zzb2 = zzbnk.zzb(parcel.readStrongBinder());
                    zzasx.zzc(parcel);
                    zzp(readString6, readString7, zzlVar3, asInterface5, zzbozVar, zzb2);
                    parcel2.writeNoException();
                    break;
                case 17:
                    IObjectWrapper asInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    zzasx.zzc(parcel);
                    boolean zzt = zzt(asInterface6);
                    parcel2.writeNoException();
                    zzasx.zzd(parcel2, zzt);
                    break;
                case 18:
                    String readString8 = parcel.readString();
                    String readString9 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzl zzlVar4 = (com.google.android.gms.ads.internal.client.zzl) zzasx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                    IObjectWrapper asInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder5 = parcel.readStrongBinder();
                    if (readStrongBinder5 != null) {
                        IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        zzbouVar2 = queryLocalInterface5 instanceof zzbow ? (zzbow) queryLocalInterface5 : new zzbou(readStrongBinder5);
                    }
                    zzbow zzbowVar = zzbouVar2;
                    zzbnl zzb3 = zzbnk.zzb(parcel.readStrongBinder());
                    zzasx.zzc(parcel);
                    zzm(readString8, readString9, zzlVar4, asInterface7, zzbowVar, zzb3);
                    parcel2.writeNoException();
                    break;
                case 19:
                    String readString10 = parcel.readString();
                    zzasx.zzc(parcel);
                    zzq(readString10);
                    parcel2.writeNoException();
                    break;
                case 20:
                    String readString11 = parcel.readString();
                    String readString12 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzl zzlVar5 = (com.google.android.gms.ads.internal.client.zzl) zzasx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                    IObjectWrapper asInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder6 = parcel.readStrongBinder();
                    if (readStrongBinder6 != null) {
                        IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        zzboxVar = queryLocalInterface6 instanceof zzboz ? (zzboz) queryLocalInterface6 : new zzbox(readStrongBinder6);
                    }
                    zzboz zzbozVar2 = zzboxVar;
                    zzbnl zzb4 = zzbnk.zzb(parcel.readStrongBinder());
                    zzasx.zzc(parcel);
                    zzo(readString11, readString12, zzlVar5, asInterface8, zzbozVar2, zzb4);
                    parcel2.writeNoException();
                    break;
                case 21:
                    String readString13 = parcel.readString();
                    String readString14 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzl zzlVar6 = (com.google.android.gms.ads.internal.client.zzl) zzasx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                    IObjectWrapper asInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder7 = parcel.readStrongBinder();
                    if (readStrongBinder7 != null) {
                        IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        zzbooVar = queryLocalInterface7 instanceof zzboq ? (zzboq) queryLocalInterface7 : new zzboo(readStrongBinder7);
                    }
                    zzboq zzboqVar2 = zzbooVar;
                    zzasx.zzc(parcel);
                    zzk(readString13, readString14, zzlVar6, asInterface9, zzboqVar2, zzbnk.zzb(parcel.readStrongBinder()), (com.google.android.gms.ads.internal.client.zzq) zzasx.zza(parcel, com.google.android.gms.ads.internal.client.zzq.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 22:
                    String readString15 = parcel.readString();
                    String readString16 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzl zzlVar7 = (com.google.android.gms.ads.internal.client.zzl) zzasx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                    IObjectWrapper asInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder8 = parcel.readStrongBinder();
                    if (readStrongBinder8 != null) {
                        IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        zzbouVar = queryLocalInterface8 instanceof zzbow ? (zzbow) queryLocalInterface8 : new zzbou(readStrongBinder8);
                    }
                    zzbow zzbowVar2 = zzbouVar;
                    zzasx.zzc(parcel);
                    zzn(readString15, readString16, zzlVar7, asInterface10, zzbowVar2, zzbnk.zzb(parcel.readStrongBinder()), (zzbdl) zzasx.zza(parcel, zzbdl.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 23:
                    String readString17 = parcel.readString();
                    String readString18 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzl zzlVar8 = (com.google.android.gms.ads.internal.client.zzl) zzasx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                    IObjectWrapper asInterface11 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder9 = parcel.readStrongBinder();
                    if (readStrongBinder9 != null) {
                        IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
                        zzbolVar = queryLocalInterface9 instanceof zzbon ? (zzbon) queryLocalInterface9 : new zzbol(readStrongBinder9);
                    }
                    zzbon zzbonVar = zzbolVar;
                    zzbnl zzb5 = zzbnk.zzb(parcel.readStrongBinder());
                    zzasx.zzc(parcel);
                    zzi(readString17, readString18, zzlVar8, asInterface11, zzbonVar, zzb5);
                    parcel2.writeNoException();
                    break;
                case 24:
                    IObjectWrapper asInterface12 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    zzasx.zzc(parcel);
                    boolean zzr = zzr(asInterface12);
                    parcel2.writeNoException();
                    zzasx.zzd(parcel2, zzr);
                    break;
                default:
                    return false;
            }
        } else {
            parcel.createStringArray();
            Bundle[] bundleArr = (Bundle[]) parcel.createTypedArray(Bundle.CREATOR);
            zzasx.zzc(parcel);
            parcel2.writeNoException();
        }
        return true;
    }
}
