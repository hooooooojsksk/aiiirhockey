package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzasv;
import com.google.android.gms.internal.ads.zzasx;
import com.google.android.gms.internal.ads.zzavb;
import com.google.android.gms.internal.ads.zzbbp;
import com.google.android.gms.internal.ads.zzbrl;
import com.google.android.gms.internal.ads.zzbro;
import com.google.android.gms.internal.ads.zzbuj;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* loaded from: classes.dex */
public final class zzbs extends zzasv implements zzbu {
    public zzbs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzA() throws RemoteException {
        zzbh(11, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzB() throws RemoteException {
        zzbh(6, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzC(zzbe zzbeVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, zzbeVar);
        zzbh(20, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzD(zzbh zzbhVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, zzbhVar);
        zzbh(7, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzE(zzby zzbyVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzF(zzq zzqVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zze(zza, zzqVar);
        zzbh(13, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzG(zzcb zzcbVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, zzcbVar);
        zzbh(8, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzH(zzavb zzavbVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, zzavbVar);
        zzbh(40, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzI(zzw zzwVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zze(zza, zzwVar);
        zzbh(39, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzJ(zzci zzciVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, zzciVar);
        zzbh(45, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzK(zzdu zzduVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzL(boolean z) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzd(zza, z);
        zzbh(34, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzM(zzbrl zzbrlVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzN(boolean z) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzd(zza, z);
        zzbh(22, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzO(zzbbp zzbbpVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzP(zzdg zzdgVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, zzdgVar);
        zzbh(42, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzQ(zzbro zzbroVar, String str) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzR(String str) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzS(zzbuj zzbujVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzT(String str) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzU(zzfl zzflVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zze(zza, zzflVar);
        zzbh(29, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzW(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, iObjectWrapper);
        zzbh(44, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzX() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzY() throws RemoteException {
        Parcel zzbg = zzbg(23, zza());
        boolean zzh = zzasx.zzh(zzbg);
        zzbg.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzZ() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzaa(zzl zzlVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zze(zza, zzlVar);
        Parcel zzbg = zzbg(4, zza);
        boolean zzh = zzasx.zzh(zzbg);
        zzbg.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzab(zzcf zzcfVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final Bundle zzd() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzq zzg() throws RemoteException {
        Parcel zzbg = zzbg(12, zza());
        zzq zzqVar = (zzq) zzasx.zza(zzbg, zzq.CREATOR);
        zzbg.recycle();
        return zzqVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzbh zzi() throws RemoteException {
        zzbh zzbfVar;
        Parcel zzbg = zzbg(33, zza());
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzbfVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
            zzbfVar = queryLocalInterface instanceof zzbh ? (zzbh) queryLocalInterface : new zzbf(readStrongBinder);
        }
        zzbg.recycle();
        return zzbfVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzcb zzj() throws RemoteException {
        zzcb zzbzVar;
        Parcel zzbg = zzbg(32, zza());
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzbzVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
            zzbzVar = queryLocalInterface instanceof zzcb ? (zzcb) queryLocalInterface : new zzbz(readStrongBinder);
        }
        zzbg.recycle();
        return zzbzVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzdn zzk() throws RemoteException {
        zzdn zzdlVar;
        Parcel zzbg = zzbg(41, zza());
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzdlVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            zzdlVar = queryLocalInterface instanceof zzdn ? (zzdn) queryLocalInterface : new zzdl(readStrongBinder);
        }
        zzbg.recycle();
        return zzdlVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzdq zzl() throws RemoteException {
        zzdq zzdoVar;
        Parcel zzbg = zzbg(26, zza());
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzdoVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            zzdoVar = queryLocalInterface instanceof zzdq ? (zzdq) queryLocalInterface : new zzdo(readStrongBinder);
        }
        zzbg.recycle();
        return zzdoVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final IObjectWrapper zzn() throws RemoteException {
        Parcel zzbg = zzbg(1, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzbg.readStrongBinder());
        zzbg.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final String zzr() throws RemoteException {
        Parcel zzbg = zzbg(31, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final String zzs() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final String zzt() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzx() throws RemoteException {
        zzbh(2, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzy(zzl zzlVar, zzbk zzbkVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zze(zza, zzlVar);
        zzasx.zzg(zza, zzbkVar);
        zzbh(43, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzz() throws RemoteException {
        zzbh(5, zza());
    }
}
