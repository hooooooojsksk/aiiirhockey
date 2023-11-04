package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzbpa extends zzasv implements zzbpc {
    public zzbpa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbpc
    public final com.google.android.gms.ads.internal.client.zzdq zze() throws RemoteException {
        Parcel zzbg = zzbg(5, zza());
        com.google.android.gms.ads.internal.client.zzdq zzb = com.google.android.gms.ads.internal.client.zzdp.zzb(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbpc
    public final zzbpq zzf() throws RemoteException {
        Parcel zzbg = zzbg(2, zza());
        zzbpq zzbpqVar = (zzbpq) zzasx.zza(zzbg, zzbpq.CREATOR);
        zzbg.recycle();
        return zzbpqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpc
    public final zzbpq zzg() throws RemoteException {
        Parcel zzbg = zzbg(3, zza());
        zzbpq zzbpqVar = (zzbpq) zzasx.zza(zzbg, zzbpq.CREATOR);
        zzbg.recycle();
        return zzbpqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpc
    public final void zzh(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, com.google.android.gms.ads.internal.client.zzq zzqVar, zzbpf zzbpfVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, iObjectWrapper);
        zza.writeString(str);
        zzasx.zze(zza, bundle);
        zzasx.zze(zza, bundle2);
        zzasx.zze(zza, zzqVar);
        zzasx.zzg(zza, zzbpfVar);
        zzbh(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpc
    public final void zzi(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbon zzbonVar, zzbnl zzbnlVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzasx.zze(zza, zzlVar);
        zzasx.zzg(zza, iObjectWrapper);
        zzasx.zzg(zza, zzbonVar);
        zzasx.zzg(zza, zzbnlVar);
        zzbh(23, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpc
    public final void zzj(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzboq zzboqVar, zzbnl zzbnlVar, com.google.android.gms.ads.internal.client.zzq zzqVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzasx.zze(zza, zzlVar);
        zzasx.zzg(zza, iObjectWrapper);
        zzasx.zzg(zza, zzboqVar);
        zzasx.zzg(zza, zzbnlVar);
        zzasx.zze(zza, zzqVar);
        zzbh(13, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpc
    public final void zzk(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzboq zzboqVar, zzbnl zzbnlVar, com.google.android.gms.ads.internal.client.zzq zzqVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzasx.zze(zza, zzlVar);
        zzasx.zzg(zza, iObjectWrapper);
        zzasx.zzg(zza, zzboqVar);
        zzasx.zzg(zza, zzbnlVar);
        zzasx.zze(zza, zzqVar);
        zzbh(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpc
    public final void zzl(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbot zzbotVar, zzbnl zzbnlVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzasx.zze(zza, zzlVar);
        zzasx.zzg(zza, iObjectWrapper);
        zzasx.zzg(zza, zzbotVar);
        zzasx.zzg(zza, zzbnlVar);
        zzbh(14, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpc
    public final void zzm(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbow zzbowVar, zzbnl zzbnlVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzasx.zze(zza, zzlVar);
        zzasx.zzg(zza, iObjectWrapper);
        zzasx.zzg(zza, zzbowVar);
        zzasx.zzg(zza, zzbnlVar);
        zzbh(18, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpc
    public final void zzn(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbow zzbowVar, zzbnl zzbnlVar, zzbdl zzbdlVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzasx.zze(zza, zzlVar);
        zzasx.zzg(zza, iObjectWrapper);
        zzasx.zzg(zza, zzbowVar);
        zzasx.zzg(zza, zzbnlVar);
        zzasx.zze(zza, zzbdlVar);
        zzbh(22, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpc
    public final void zzo(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzboz zzbozVar, zzbnl zzbnlVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzasx.zze(zza, zzlVar);
        zzasx.zzg(zza, iObjectWrapper);
        zzasx.zzg(zza, zzbozVar);
        zzasx.zzg(zza, zzbnlVar);
        zzbh(20, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpc
    public final void zzp(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzboz zzbozVar, zzbnl zzbnlVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzasx.zze(zza, zzlVar);
        zzasx.zzg(zza, iObjectWrapper);
        zzasx.zzg(zza, zzbozVar);
        zzasx.zzg(zza, zzbnlVar);
        zzbh(16, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpc
    public final void zzq(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzbh(19, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpc
    public final boolean zzr(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, iObjectWrapper);
        Parcel zzbg = zzbg(24, zza);
        boolean zzh = zzasx.zzh(zzbg);
        zzbg.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzbpc
    public final boolean zzs(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, iObjectWrapper);
        Parcel zzbg = zzbg(15, zza);
        boolean zzh = zzasx.zzh(zzbg);
        zzbg.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzbpc
    public final boolean zzt(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, iObjectWrapper);
        Parcel zzbg = zzbg(17, zza);
        boolean zzh = zzasx.zzh(zzbg);
        zzbg.recycle();
        return zzh;
    }
}
