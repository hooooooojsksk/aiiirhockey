package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzbng extends zzasv implements zzbni {
    public zzbng(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final void zzA(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbnl zzbnlVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, iObjectWrapper);
        zzasx.zze(zza, zzlVar);
        zza.writeString(str);
        zzasx.zzg(zza, zzbnlVar);
        zzbh(28, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final void zzB(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final void zzC(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbnl zzbnlVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, iObjectWrapper);
        zzasx.zze(zza, zzlVar);
        zza.writeString(str);
        zzasx.zzg(zza, zzbnlVar);
        zzbh(32, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final void zzD(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, iObjectWrapper);
        zzbh(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final void zzE() throws RemoteException {
        zzbh(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final void zzF() throws RemoteException {
        zzbh(9, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final void zzG(boolean z) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzd(zza, z);
        zzbh(25, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final void zzH(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, iObjectWrapper);
        zzbh(39, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final void zzI() throws RemoteException {
        zzbh(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final void zzJ(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, iObjectWrapper);
        zzbh(37, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final void zzK(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, iObjectWrapper);
        zzbh(30, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final void zzL() throws RemoteException {
        zzbh(12, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final boolean zzM() throws RemoteException {
        Parcel zzbg = zzbg(22, zza());
        boolean zzh = zzasx.zzh(zzbg);
        zzbg.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final boolean zzN() throws RemoteException {
        Parcel zzbg = zzbg(13, zza());
        boolean zzh = zzasx.zzh(zzbg);
        zzbg.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final zzbnq zzO() throws RemoteException {
        zzbnq zzbnqVar;
        Parcel zzbg = zzbg(15, zza());
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzbnqVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            zzbnqVar = queryLocalInterface instanceof zzbnq ? (zzbnq) queryLocalInterface : new zzbnq(readStrongBinder);
        }
        zzbg.recycle();
        return zzbnqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final zzbnr zzP() throws RemoteException {
        zzbnr zzbnrVar;
        Parcel zzbg = zzbg(16, zza());
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzbnrVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            zzbnrVar = queryLocalInterface instanceof zzbnr ? (zzbnr) queryLocalInterface : new zzbnr(readStrongBinder);
        }
        zzbg.recycle();
        return zzbnrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final Bundle zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final Bundle zzf() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final Bundle zzg() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final com.google.android.gms.ads.internal.client.zzdq zzh() throws RemoteException {
        Parcel zzbg = zzbg(26, zza());
        com.google.android.gms.ads.internal.client.zzdq zzb = com.google.android.gms.ads.internal.client.zzdp.zzb(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final zzber zzi() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final zzbno zzj() throws RemoteException {
        zzbno zzbnmVar;
        Parcel zzbg = zzbg(36, zza());
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzbnmVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
            zzbnmVar = queryLocalInterface instanceof zzbno ? (zzbno) queryLocalInterface : new zzbnm(readStrongBinder);
        }
        zzbg.recycle();
        return zzbnmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final zzbnu zzk() throws RemoteException {
        zzbnu zzbnsVar;
        Parcel zzbg = zzbg(27, zza());
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzbnsVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            zzbnsVar = queryLocalInterface instanceof zzbnu ? (zzbnu) queryLocalInterface : new zzbns(readStrongBinder);
        }
        zzbg.recycle();
        return zzbnsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final zzbpq zzl() throws RemoteException {
        Parcel zzbg = zzbg(33, zza());
        zzbpq zzbpqVar = (zzbpq) zzasx.zza(zzbg, zzbpq.CREATOR);
        zzbg.recycle();
        return zzbpqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final zzbpq zzm() throws RemoteException {
        Parcel zzbg = zzbg(34, zza());
        zzbpq zzbpqVar = (zzbpq) zzasx.zza(zzbg, zzbpq.CREATOR);
        zzbg.recycle();
        return zzbpqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final IObjectWrapper zzn() throws RemoteException {
        Parcel zzbg = zzbg(2, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzbg.readStrongBinder());
        zzbg.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final void zzo() throws RemoteException {
        zzbh(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final void zzp(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbuo zzbuoVar, String str2) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, iObjectWrapper);
        zzasx.zze(zza, zzlVar);
        zza.writeString(null);
        zzasx.zzg(zza, zzbuoVar);
        zza.writeString(str2);
        zzbh(10, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final void zzq(IObjectWrapper iObjectWrapper, zzbjp zzbjpVar, List list) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, iObjectWrapper);
        zzasx.zzg(zza, zzbjpVar);
        zza.writeTypedList(list);
        zzbh(31, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final void zzr(IObjectWrapper iObjectWrapper, zzbuo zzbuoVar, List list) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, iObjectWrapper);
        zzasx.zzg(zza, zzbuoVar);
        zza.writeStringList(list);
        zzbh(23, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final void zzs(com.google.android.gms.ads.internal.client.zzl zzlVar, String str) throws RemoteException {
        Parcel zza = zza();
        zzasx.zze(zza, zzlVar);
        zza.writeString(str);
        zzbh(11, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final void zzt(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbnl zzbnlVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, iObjectWrapper);
        zzasx.zze(zza, zzlVar);
        zza.writeString(str);
        zzasx.zzg(zza, zzbnlVar);
        zzbh(38, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final void zzu(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbnl zzbnlVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final void zzv(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbnl zzbnlVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, iObjectWrapper);
        zzasx.zze(zza, zzqVar);
        zzasx.zze(zza, zzlVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzasx.zzg(zza, zzbnlVar);
        zzbh(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final void zzw(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbnl zzbnlVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, iObjectWrapper);
        zzasx.zze(zza, zzqVar);
        zzasx.zze(zza, zzlVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzasx.zzg(zza, zzbnlVar);
        zzbh(35, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final void zzx(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbnl zzbnlVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final void zzy(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbnl zzbnlVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, iObjectWrapper);
        zzasx.zze(zza, zzlVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzasx.zzg(zza, zzbnlVar);
        zzbh(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final void zzz(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbnl zzbnlVar, zzbdl zzbdlVar, List list) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, iObjectWrapper);
        zzasx.zze(zza, zzlVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzasx.zzg(zza, zzbnlVar);
        zzasx.zze(zza, zzbdlVar);
        zza.writeStringList(list);
        zzbh(14, zza);
    }
}
