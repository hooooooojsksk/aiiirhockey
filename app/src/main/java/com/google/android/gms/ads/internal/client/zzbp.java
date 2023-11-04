package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzasw;
import com.google.android.gms.internal.ads.zzasx;
import com.google.android.gms.internal.ads.zzbdl;
import com.google.android.gms.internal.ads.zzbeu;
import com.google.android.gms.internal.ads.zzbev;
import com.google.android.gms.internal.ads.zzbex;
import com.google.android.gms.internal.ads.zzbey;
import com.google.android.gms.internal.ads.zzbfa;
import com.google.android.gms.internal.ads.zzbfb;
import com.google.android.gms.internal.ads.zzbfd;
import com.google.android.gms.internal.ads.zzbfe;
import com.google.android.gms.internal.ads.zzbfh;
import com.google.android.gms.internal.ads.zzbfk;
import com.google.android.gms.internal.ads.zzbfl;
import com.google.android.gms.internal.ads.zzbjx;
import com.google.android.gms.internal.ads.zzbkf;
import com.google.android.gms.internal.ads.zzbkg;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* loaded from: classes.dex */
public abstract class zzbp extends zzasw implements zzbq {
    public zzbp() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    protected final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbh zzbhVar = null;
        zzcf zzcfVar = null;
        switch (i) {
            case 1:
                zzbn zze = zze();
                parcel2.writeNoException();
                zzasx.zzg(parcel2, zze);
                return true;
            case 2:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    zzbhVar = queryLocalInterface instanceof zzbh ? (zzbh) queryLocalInterface : new zzbf(readStrongBinder);
                }
                zzasx.zzc(parcel);
                zzl(zzbhVar);
                parcel2.writeNoException();
                return true;
            case 3:
                zzbev zzb = zzbeu.zzb(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                zzf(zzb);
                parcel2.writeNoException();
                return true;
            case 4:
                zzbey zzb2 = zzbex.zzb(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                zzg(zzb2);
                parcel2.writeNoException();
                return true;
            case 5:
                String readString = parcel.readString();
                zzbfe zzb3 = zzbfd.zzb(parcel.readStrongBinder());
                zzbfb zzb4 = zzbfa.zzb(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                zzh(readString, zzb3, zzb4);
                parcel2.writeNoException();
                return true;
            case 6:
                zzasx.zzc(parcel);
                zzo((zzbdl) zzasx.zza(parcel, zzbdl.CREATOR));
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    zzcfVar = queryLocalInterface2 instanceof zzcf ? (zzcf) queryLocalInterface2 : new zzcf(readStrongBinder2);
                }
                zzasx.zzc(parcel);
                zzq(zzcfVar);
                parcel2.writeNoException();
                return true;
            case 8:
                zzasx.zzc(parcel);
                zzj(zzbfh.zzb(parcel.readStrongBinder()), (zzq) zzasx.zza(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                return true;
            case 9:
                zzasx.zzc(parcel);
                zzp((PublisherAdViewOptions) zzasx.zza(parcel, PublisherAdViewOptions.CREATOR));
                parcel2.writeNoException();
                return true;
            case 10:
                zzbfl zzb5 = zzbfk.zzb(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                zzk(zzb5);
                parcel2.writeNoException();
                return true;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                zzasx.zzc(parcel);
                zzn((zzbjx) zzasx.zza(parcel, zzbjx.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                zzbkg zzb6 = zzbkf.zzb(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                zzi(zzb6);
                parcel2.writeNoException();
                return true;
            case 15:
                zzasx.zzc(parcel);
                zzm((AdManagerAdViewOptions) zzasx.zza(parcel, AdManagerAdViewOptions.CREATOR));
                parcel2.writeNoException();
                return true;
        }
    }
}
