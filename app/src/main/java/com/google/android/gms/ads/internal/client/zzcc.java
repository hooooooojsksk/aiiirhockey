package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzasv;
import com.google.android.gms.internal.ads.zzasx;
import com.google.android.gms.internal.ads.zzbea;
import com.google.android.gms.internal.ads.zzbeb;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzbeh;
import com.google.android.gms.internal.ads.zzbim;
import com.google.android.gms.internal.ads.zzbio;
import com.google.android.gms.internal.ads.zzbip;
import com.google.android.gms.internal.ads.zzbnf;
import com.google.android.gms.internal.ads.zzbqu;
import com.google.android.gms.internal.ads.zzbqv;
import com.google.android.gms.internal.ads.zzbrb;
import com.google.android.gms.internal.ads.zzbrc;
import com.google.android.gms.internal.ads.zzbug;
import com.google.android.gms.internal.ads.zzbuv;
import com.google.android.gms.internal.ads.zzbuw;
import com.google.android.gms.internal.ads.zzbxq;
import com.google.android.gms.internal.ads.zzbxr;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* loaded from: classes.dex */
public final class zzcc extends zzasv implements zzce {
    public zzcc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbq zzb(IObjectWrapper iObjectWrapper, String str, zzbnf zzbnfVar, int i) throws RemoteException {
        zzbq zzboVar;
        Parcel zza = zza();
        zzasx.zzg(zza, iObjectWrapper);
        zza.writeString(str);
        zzasx.zzg(zza, zzbnfVar);
        zza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel zzbg = zzbg(3, zza);
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzboVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            zzboVar = queryLocalInterface instanceof zzbq ? (zzbq) queryLocalInterface : new zzbo(readStrongBinder);
        }
        zzbg.recycle();
        return zzboVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzc(IObjectWrapper iObjectWrapper, zzq zzqVar, String str, zzbnf zzbnfVar, int i) throws RemoteException {
        zzbu zzbsVar;
        Parcel zza = zza();
        zzasx.zzg(zza, iObjectWrapper);
        zzasx.zze(zza, zzqVar);
        zza.writeString(str);
        zzasx.zzg(zza, zzbnfVar);
        zza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel zzbg = zzbg(13, zza);
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbsVar = queryLocalInterface instanceof zzbu ? (zzbu) queryLocalInterface : new zzbs(readStrongBinder);
        }
        zzbg.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzd(IObjectWrapper iObjectWrapper, zzq zzqVar, String str, zzbnf zzbnfVar, int i) throws RemoteException {
        zzbu zzbsVar;
        Parcel zza = zza();
        zzasx.zzg(zza, iObjectWrapper);
        zzasx.zze(zza, zzqVar);
        zza.writeString(str);
        zzasx.zzg(zza, zzbnfVar);
        zza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel zzbg = zzbg(1, zza);
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbsVar = queryLocalInterface instanceof zzbu ? (zzbu) queryLocalInterface : new zzbs(readStrongBinder);
        }
        zzbg.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zze(IObjectWrapper iObjectWrapper, zzq zzqVar, String str, zzbnf zzbnfVar, int i) throws RemoteException {
        zzbu zzbsVar;
        Parcel zza = zza();
        zzasx.zzg(zza, iObjectWrapper);
        zzasx.zze(zza, zzqVar);
        zza.writeString(str);
        zzasx.zzg(zza, zzbnfVar);
        zza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel zzbg = zzbg(2, zza);
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbsVar = queryLocalInterface instanceof zzbu ? (zzbu) queryLocalInterface : new zzbs(readStrongBinder);
        }
        zzbg.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzf(IObjectWrapper iObjectWrapper, zzq zzqVar, String str, int i) throws RemoteException {
        zzbu zzbsVar;
        Parcel zza = zza();
        zzasx.zzg(zza, iObjectWrapper);
        zzasx.zze(zza, zzqVar);
        zza.writeString(str);
        zza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel zzbg = zzbg(10, zza);
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbsVar = queryLocalInterface instanceof zzbu ? (zzbu) queryLocalInterface : new zzbs(readStrongBinder);
        }
        zzbg.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzco zzg(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        zzco zzcmVar;
        Parcel zza = zza();
        zzasx.zzg(zza, iObjectWrapper);
        zza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel zzbg = zzbg(9, zza);
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzcmVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            zzcmVar = queryLocalInterface instanceof zzco ? (zzco) queryLocalInterface : new zzcm(readStrongBinder);
        }
        zzbg.recycle();
        return zzcmVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzdj zzh(IObjectWrapper iObjectWrapper, zzbnf zzbnfVar, int i) throws RemoteException {
        zzdj zzdhVar;
        Parcel zza = zza();
        zzasx.zzg(zza, iObjectWrapper);
        zzasx.zzg(zza, zzbnfVar);
        zza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel zzbg = zzbg(17, zza);
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzdhVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            zzdhVar = queryLocalInterface instanceof zzdj ? (zzdj) queryLocalInterface : new zzdh(readStrongBinder);
        }
        zzbg.recycle();
        return zzdhVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbeb zzi(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, iObjectWrapper);
        zzasx.zzg(zza, iObjectWrapper2);
        Parcel zzbg = zzbg(5, zza);
        zzbeb zzbx = zzbea.zzbx(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzbx;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbeh zzj(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, iObjectWrapper);
        zzasx.zzg(zza, iObjectWrapper2);
        zzasx.zzg(zza, iObjectWrapper3);
        Parcel zzbg = zzbg(11, zza);
        zzbeh zze = zzbeg.zze(zzbg.readStrongBinder());
        zzbg.recycle();
        return zze;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbip zzk(IObjectWrapper iObjectWrapper, zzbnf zzbnfVar, int i, zzbim zzbimVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, iObjectWrapper);
        zzasx.zzg(zza, zzbnfVar);
        zza.writeInt(ModuleDescriptor.MODULE_VERSION);
        zzasx.zzg(zza, zzbimVar);
        Parcel zzbg = zzbg(16, zza);
        zzbip zzb = zzbio.zzb(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbqv zzl(IObjectWrapper iObjectWrapper, zzbnf zzbnfVar, int i) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, iObjectWrapper);
        zzasx.zzg(zza, zzbnfVar);
        zza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel zzbg = zzbg(15, zza);
        zzbqv zzb = zzbqu.zzb(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbrc zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, iObjectWrapper);
        Parcel zzbg = zzbg(8, zza);
        zzbrc zzF = zzbrb.zzF(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzF;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbug zzn(IObjectWrapper iObjectWrapper, zzbnf zzbnfVar, int i) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbuw zzo(IObjectWrapper iObjectWrapper, String str, zzbnf zzbnfVar, int i) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, iObjectWrapper);
        zza.writeString(str);
        zzasx.zzg(zza, zzbnfVar);
        zza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel zzbg = zzbg(12, zza);
        zzbuw zzq = zzbuv.zzq(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzq;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbxr zzp(IObjectWrapper iObjectWrapper, zzbnf zzbnfVar, int i) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, iObjectWrapper);
        zzasx.zzg(zza, zzbnfVar);
        zza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel zzbg = zzbg(14, zza);
        zzbxr zzb = zzbxq.zzb(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzb;
    }
}
