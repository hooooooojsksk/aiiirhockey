package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzasw;
import com.google.android.gms.internal.ads.zzasx;
import com.google.android.gms.internal.ads.zzbjr;
import com.google.android.gms.internal.ads.zzbjs;
import com.google.android.gms.internal.ads.zzbne;
import com.google.android.gms.internal.ads.zzbnf;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* loaded from: classes.dex */
public abstract class zzcn extends zzasw implements zzco {
    public zzcn() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    protected final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzda zzcyVar;
        switch (i) {
            case 1:
                zzk();
                parcel2.writeNoException();
                return true;
            case 2:
                float readFloat = parcel.readFloat();
                zzasx.zzc(parcel);
                zzq(readFloat);
                parcel2.writeNoException();
                return true;
            case 3:
                String readString = parcel.readString();
                zzasx.zzc(parcel);
                zzr(readString);
                parcel2.writeNoException();
                return true;
            case 4:
                boolean zzh = zzasx.zzh(parcel);
                zzasx.zzc(parcel);
                zzp(zzh);
                parcel2.writeNoException();
                return true;
            case 5:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String readString2 = parcel.readString();
                zzasx.zzc(parcel);
                zzn(asInterface, readString2);
                parcel2.writeNoException();
                return true;
            case 6:
                String readString3 = parcel.readString();
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                zzl(readString3, asInterface2);
                parcel2.writeNoException();
                return true;
            case 7:
                float zze = zze();
                parcel2.writeNoException();
                parcel2.writeFloat(zze);
                return true;
            case 8:
                boolean zzv = zzv();
                parcel2.writeNoException();
                zzasx.zzd(parcel2, zzv);
                return true;
            case 9:
                String zzf = zzf();
                parcel2.writeNoException();
                parcel2.writeString(zzf);
                return true;
            case 10:
                String readString4 = parcel.readString();
                zzasx.zzc(parcel);
                zzh(readString4);
                parcel2.writeNoException();
                return true;
            case 11:
                zzbnf zzf2 = zzbne.zzf(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                zzo(zzf2);
                parcel2.writeNoException();
                return true;
            case 12:
                zzbjs zzc = zzbjr.zzc(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                zzs(zzc);
                parcel2.writeNoException();
                return true;
            case 13:
                List zzg = zzg();
                parcel2.writeNoException();
                parcel2.writeTypedList(zzg);
                return true;
            case 14:
                zzasx.zzc(parcel);
                zzu((zzff) zzasx.zza(parcel, zzff.CREATOR));
                parcel2.writeNoException();
                return true;
            case 15:
                zzi();
                parcel2.writeNoException();
                return true;
            case 16:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzcyVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
                    zzcyVar = queryLocalInterface instanceof zzda ? (zzda) queryLocalInterface : new zzcy(readStrongBinder);
                }
                zzasx.zzc(parcel);
                zzm(zzcyVar);
                parcel2.writeNoException();
                return true;
            case 17:
                boolean zzh2 = zzasx.zzh(parcel);
                zzasx.zzc(parcel);
                zzj(zzh2);
                parcel2.writeNoException();
                return true;
            case 18:
                String readString5 = parcel.readString();
                zzasx.zzc(parcel);
                zzt(readString5);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
