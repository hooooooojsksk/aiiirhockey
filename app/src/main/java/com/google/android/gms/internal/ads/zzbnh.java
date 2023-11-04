package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* loaded from: classes2.dex */
public abstract class zzbnh extends zzasw implements zzbni {
    public zzbnh() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    protected final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbnl zzbnlVar = null;
        switch (i) {
            case 1:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzq zzqVar = (com.google.android.gms.ads.internal.client.zzq) zzasx.zza(parcel, com.google.android.gms.ads.internal.client.zzq.CREATOR);
                com.google.android.gms.ads.internal.client.zzl zzlVar = (com.google.android.gms.ads.internal.client.zzl) zzasx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String readString = parcel.readString();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbnlVar = queryLocalInterface instanceof zzbnl ? (zzbnl) queryLocalInterface : new zzbnj(readStrongBinder);
                }
                zzbnl zzbnlVar2 = zzbnlVar;
                zzasx.zzc(parcel);
                zzu(asInterface, zzqVar, zzlVar, readString, zzbnlVar2);
                parcel2.writeNoException();
                return true;
            case 2:
                IObjectWrapper zzn = zzn();
                parcel2.writeNoException();
                zzasx.zzg(parcel2, zzn);
                return true;
            case 3:
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzl zzlVar2 = (com.google.android.gms.ads.internal.client.zzl) zzasx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String readString2 = parcel.readString();
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbnlVar = queryLocalInterface2 instanceof zzbnl ? (zzbnl) queryLocalInterface2 : new zzbnj(readStrongBinder2);
                }
                zzasx.zzc(parcel);
                zzx(asInterface2, zzlVar2, readString2, zzbnlVar);
                parcel2.writeNoException();
                return true;
            case 4:
                zzI();
                parcel2.writeNoException();
                return true;
            case 5:
                zzo();
                parcel2.writeNoException();
                return true;
            case 6:
                IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzq zzqVar2 = (com.google.android.gms.ads.internal.client.zzq) zzasx.zza(parcel, com.google.android.gms.ads.internal.client.zzq.CREATOR);
                com.google.android.gms.ads.internal.client.zzl zzlVar3 = (com.google.android.gms.ads.internal.client.zzl) zzasx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbnlVar = queryLocalInterface3 instanceof zzbnl ? (zzbnl) queryLocalInterface3 : new zzbnj(readStrongBinder3);
                }
                zzbnl zzbnlVar3 = zzbnlVar;
                zzasx.zzc(parcel);
                zzv(asInterface3, zzqVar2, zzlVar3, readString3, readString4, zzbnlVar3);
                parcel2.writeNoException();
                return true;
            case 7:
                IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzl zzlVar4 = (com.google.android.gms.ads.internal.client.zzl) zzasx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbnlVar = queryLocalInterface4 instanceof zzbnl ? (zzbnl) queryLocalInterface4 : new zzbnj(readStrongBinder4);
                }
                zzbnl zzbnlVar4 = zzbnlVar;
                zzasx.zzc(parcel);
                zzy(asInterface4, zzlVar4, readString5, readString6, zzbnlVar4);
                parcel2.writeNoException();
                return true;
            case 8:
                zzE();
                parcel2.writeNoException();
                return true;
            case 9:
                zzF();
                parcel2.writeNoException();
                return true;
            case 10:
                IObjectWrapper asInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzl zzlVar5 = (com.google.android.gms.ads.internal.client.zzl) zzasx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String readString7 = parcel.readString();
                zzbuo zzb = zzbun.zzb(parcel.readStrongBinder());
                String readString8 = parcel.readString();
                zzasx.zzc(parcel);
                zzp(asInterface5, zzlVar5, readString7, zzb, readString8);
                parcel2.writeNoException();
                return true;
            case 11:
                String readString9 = parcel.readString();
                zzasx.zzc(parcel);
                zzs((com.google.android.gms.ads.internal.client.zzl) zzasx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR), readString9);
                parcel2.writeNoException();
                return true;
            case 12:
                zzL();
                parcel2.writeNoException();
                return true;
            case 13:
                boolean zzN = zzN();
                parcel2.writeNoException();
                zzasx.zzd(parcel2, zzN);
                return true;
            case 14:
                IObjectWrapper asInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzl zzlVar6 = (com.google.android.gms.ads.internal.client.zzl) zzasx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbnlVar = queryLocalInterface5 instanceof zzbnl ? (zzbnl) queryLocalInterface5 : new zzbnj(readStrongBinder5);
                }
                zzbnl zzbnlVar5 = zzbnlVar;
                ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                zzasx.zzc(parcel);
                zzz(asInterface6, zzlVar6, readString10, readString11, zzbnlVar5, (zzbdl) zzasx.zza(parcel, zzbdl.CREATOR), createStringArrayList);
                parcel2.writeNoException();
                return true;
            case 15:
                parcel2.writeNoException();
                zzasx.zzg(parcel2, null);
                return true;
            case 16:
                parcel2.writeNoException();
                zzasx.zzg(parcel2, null);
                return true;
            case 17:
                Bundle zze = zze();
                parcel2.writeNoException();
                zzasx.zzf(parcel2, zze);
                return true;
            case 18:
                Bundle zzf = zzf();
                parcel2.writeNoException();
                zzasx.zzf(parcel2, zzf);
                return true;
            case 19:
                Bundle zzg = zzg();
                parcel2.writeNoException();
                zzasx.zzf(parcel2, zzg);
                return true;
            case 20:
                String readString12 = parcel.readString();
                String readString13 = parcel.readString();
                zzasx.zzc(parcel);
                zzB((com.google.android.gms.ads.internal.client.zzl) zzasx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR), readString12, readString13);
                parcel2.writeNoException();
                return true;
            case 21:
                IObjectWrapper asInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                zzD(asInterface7);
                parcel2.writeNoException();
                return true;
            case 22:
                parcel2.writeNoException();
                zzasx.zzd(parcel2, false);
                return true;
            case 23:
                IObjectWrapper asInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbuo zzb2 = zzbun.zzb(parcel.readStrongBinder());
                ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
                zzasx.zzc(parcel);
                zzr(asInterface8, zzb2, createStringArrayList2);
                parcel2.writeNoException();
                return true;
            case 24:
                zzber zzi = zzi();
                parcel2.writeNoException();
                zzasx.zzg(parcel2, zzi);
                return true;
            case 25:
                boolean zzh = zzasx.zzh(parcel);
                zzasx.zzc(parcel);
                zzG(zzh);
                parcel2.writeNoException();
                return true;
            case 26:
                com.google.android.gms.ads.internal.client.zzdq zzh2 = zzh();
                parcel2.writeNoException();
                zzasx.zzg(parcel2, zzh2);
                return true;
            case 27:
                zzbnu zzk = zzk();
                parcel2.writeNoException();
                zzasx.zzg(parcel2, zzk);
                return true;
            case 28:
                IObjectWrapper asInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzl zzlVar7 = (com.google.android.gms.ads.internal.client.zzl) zzasx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String readString14 = parcel.readString();
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbnlVar = queryLocalInterface6 instanceof zzbnl ? (zzbnl) queryLocalInterface6 : new zzbnj(readStrongBinder6);
                }
                zzasx.zzc(parcel);
                zzA(asInterface9, zzlVar7, readString14, zzbnlVar);
                parcel2.writeNoException();
                return true;
            case 29:
            default:
                return false;
            case 30:
                IObjectWrapper asInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                zzK(asInterface10);
                parcel2.writeNoException();
                return true;
            case 31:
                IObjectWrapper asInterface11 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbjp zzb3 = zzbjo.zzb(parcel.readStrongBinder());
                ArrayList createTypedArrayList = parcel.createTypedArrayList(zzbjv.CREATOR);
                zzasx.zzc(parcel);
                zzq(asInterface11, zzb3, createTypedArrayList);
                parcel2.writeNoException();
                return true;
            case 32:
                IObjectWrapper asInterface12 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzl zzlVar8 = (com.google.android.gms.ads.internal.client.zzl) zzasx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String readString15 = parcel.readString();
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbnlVar = queryLocalInterface7 instanceof zzbnl ? (zzbnl) queryLocalInterface7 : new zzbnj(readStrongBinder7);
                }
                zzasx.zzc(parcel);
                zzC(asInterface12, zzlVar8, readString15, zzbnlVar);
                parcel2.writeNoException();
                return true;
            case 33:
                zzbpq zzl = zzl();
                parcel2.writeNoException();
                zzasx.zzf(parcel2, zzl);
                return true;
            case 34:
                zzbpq zzm = zzm();
                parcel2.writeNoException();
                zzasx.zzf(parcel2, zzm);
                return true;
            case 35:
                IObjectWrapper asInterface13 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzq zzqVar3 = (com.google.android.gms.ads.internal.client.zzq) zzasx.zza(parcel, com.google.android.gms.ads.internal.client.zzq.CREATOR);
                com.google.android.gms.ads.internal.client.zzl zzlVar9 = (com.google.android.gms.ads.internal.client.zzl) zzasx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String readString16 = parcel.readString();
                String readString17 = parcel.readString();
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbnlVar = queryLocalInterface8 instanceof zzbnl ? (zzbnl) queryLocalInterface8 : new zzbnj(readStrongBinder8);
                }
                zzbnl zzbnlVar6 = zzbnlVar;
                zzasx.zzc(parcel);
                zzw(asInterface13, zzqVar3, zzlVar9, readString16, readString17, zzbnlVar6);
                parcel2.writeNoException();
                return true;
            case 36:
                zzbno zzj = zzj();
                parcel2.writeNoException();
                zzasx.zzg(parcel2, zzj);
                return true;
            case 37:
                IObjectWrapper asInterface14 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                zzJ(asInterface14);
                parcel2.writeNoException();
                return true;
            case 38:
                IObjectWrapper asInterface15 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzl zzlVar10 = (com.google.android.gms.ads.internal.client.zzl) zzasx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String readString18 = parcel.readString();
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbnlVar = queryLocalInterface9 instanceof zzbnl ? (zzbnl) queryLocalInterface9 : new zzbnj(readStrongBinder9);
                }
                zzasx.zzc(parcel);
                zzt(asInterface15, zzlVar10, readString18, zzbnlVar);
                parcel2.writeNoException();
                return true;
            case 39:
                IObjectWrapper asInterface16 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                zzH(asInterface16);
                parcel2.writeNoException();
                return true;
        }
    }
}
