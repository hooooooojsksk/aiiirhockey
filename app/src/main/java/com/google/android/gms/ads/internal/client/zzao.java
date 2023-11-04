package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbnf;
import com.google.android.gms.internal.ads.zzbsf;
import com.google.android.gms.internal.ads.zzbsh;
import com.google.android.gms.internal.ads.zzbzc;
import com.google.android.gms.internal.ads.zzbzd;
import com.google.android.gms.internal.ads.zzbze;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* loaded from: classes.dex */
public final class zzao extends zzax {
    final /* synthetic */ Context zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzbnf zzc;
    final /* synthetic */ zzaw zzd;

    public zzao(zzaw zzawVar, Context context, String str, zzbnf zzbnfVar) {
        this.zzd = zzawVar;
        this.zza = context;
        this.zzb = str;
        this.zzc = zzbnfVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    protected final /* bridge */ /* synthetic */ Object zza() {
        zzaw.zzt(this.zza, "native_ad");
        return new zzeu();
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzb(zzce zzceVar) throws RemoteException {
        return zzceVar.zzb(ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, ModuleDescriptor.MODULE_VERSION);
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        zzbsh zzbshVar;
        zzi zziVar;
        zzbar.zzc(this.zza);
        if (((Boolean) zzba.zzc().zzb(zzbar.zzjb)).booleanValue()) {
            try {
                IBinder zze = ((zzbr) zzbze.zzb(this.zza, "com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl", new zzbzc() { // from class: com.google.android.gms.ads.internal.client.zzan
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.google.android.gms.internal.ads.zzbzc
                    public final Object zza(Object obj) {
                        if (obj == 0) {
                            return null;
                        }
                        IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
                        return queryLocalInterface instanceof zzbr ? (zzbr) queryLocalInterface : new zzbr(obj);
                    }
                })).zze(ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, ModuleDescriptor.MODULE_VERSION);
                if (zze == null) {
                    return null;
                }
                IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                return queryLocalInterface instanceof zzbq ? (zzbq) queryLocalInterface : new zzbo(zze);
            } catch (RemoteException | zzbzd | NullPointerException e) {
                this.zzd.zzh = zzbsf.zza(this.zza);
                zzbshVar = this.zzd.zzh;
                zzbshVar.zzf(e, "ClientApiBroker.createAdLoaderBuilder");
                return null;
            }
        }
        zziVar = this.zzd.zzb;
        return zziVar.zza(this.zza, this.zzb, this.zzc);
    }
}
