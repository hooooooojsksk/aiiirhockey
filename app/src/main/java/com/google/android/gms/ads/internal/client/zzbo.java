package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzasv;
import com.google.android.gms.internal.ads.zzasx;
import com.google.android.gms.internal.ads.zzbdl;
import com.google.android.gms.internal.ads.zzbev;
import com.google.android.gms.internal.ads.zzbey;
import com.google.android.gms.internal.ads.zzbfb;
import com.google.android.gms.internal.ads.zzbfe;
import com.google.android.gms.internal.ads.zzbfi;
import com.google.android.gms.internal.ads.zzbfl;
import com.google.android.gms.internal.ads.zzbjx;
import com.google.android.gms.internal.ads.zzbkg;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* loaded from: classes.dex */
public final class zzbo extends zzasv implements zzbq {
    public zzbo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final zzbn zze() throws RemoteException {
        zzbn zzblVar;
        Parcel zzbg = zzbg(1, zza());
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzblVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            zzblVar = queryLocalInterface instanceof zzbn ? (zzbn) queryLocalInterface : new zzbl(readStrongBinder);
        }
        zzbg.recycle();
        return zzblVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzf(zzbev zzbevVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzg(zzbey zzbeyVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzh(String str, zzbfe zzbfeVar, zzbfb zzbfbVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzasx.zzg(zza, zzbfeVar);
        zzasx.zzg(zza, zzbfbVar);
        zzbh(5, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzi(zzbkg zzbkgVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzj(zzbfi zzbfiVar, zzq zzqVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, zzbfiVar);
        zzasx.zze(zza, zzqVar);
        zzbh(8, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzk(zzbfl zzbflVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, zzbflVar);
        zzbh(10, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzl(zzbh zzbhVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, zzbhVar);
        zzbh(2, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzm(AdManagerAdViewOptions adManagerAdViewOptions) throws RemoteException {
        Parcel zza = zza();
        zzasx.zze(zza, adManagerAdViewOptions);
        zzbh(15, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzn(zzbjx zzbjxVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzo(zzbdl zzbdlVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zze(zza, zzbdlVar);
        zzbh(6, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzp(PublisherAdViewOptions publisherAdViewOptions) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzq(zzcf zzcfVar) throws RemoteException {
        throw null;
    }
}
