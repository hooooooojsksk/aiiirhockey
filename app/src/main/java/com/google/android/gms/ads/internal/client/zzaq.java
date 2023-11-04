package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbsf;
import com.google.android.gms.internal.ads.zzbsh;
import com.google.android.gms.internal.ads.zzbzc;
import com.google.android.gms.internal.ads.zzbzd;
import com.google.android.gms.internal.ads.zzbze;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* loaded from: classes.dex */
public final class zzaq extends zzax {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzaw zzb;

    public zzaq(zzaw zzawVar, Context context) {
        this.zzb = zzawVar;
        this.zza = context;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    protected final /* bridge */ /* synthetic */ Object zza() {
        zzaw.zzt(this.zza, "mobile_ads_settings");
        return new zzey();
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzb(zzce zzceVar) throws RemoteException {
        return zzceVar.zzg(ObjectWrapper.wrap(this.zza), ModuleDescriptor.MODULE_VERSION);
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        zzbsh zzbshVar;
        zzeq zzeqVar;
        zzbar.zzc(this.zza);
        if (((Boolean) zzba.zzc().zzb(zzbar.zzjb)).booleanValue()) {
            try {
                IBinder zze = ((zzcp) zzbze.zzb(this.zza, "com.google.android.gms.ads.ChimeraMobileAdsSettingManagerCreatorImpl", new zzbzc() { // from class: com.google.android.gms.ads.internal.client.zzap
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.google.android.gms.internal.ads.zzbzc
                    public final Object zza(Object obj) {
                        if (obj == 0) {
                            return null;
                        }
                        IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
                        return queryLocalInterface instanceof zzcp ? (zzcp) queryLocalInterface : new zzcp(obj);
                    }
                })).zze(ObjectWrapper.wrap(this.zza), ModuleDescriptor.MODULE_VERSION);
                if (zze == null) {
                    return null;
                }
                IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
                return queryLocalInterface instanceof zzco ? (zzco) queryLocalInterface : new zzcm(zze);
            } catch (RemoteException | zzbzd | NullPointerException e) {
                this.zzb.zzh = zzbsf.zza(this.zza);
                zzbshVar = this.zzb.zzh;
                zzbshVar.zzf(e, "ClientApiBroker.getMobileAdsSettingsManager");
                return null;
            }
        }
        zzeqVar = this.zzb.zzc;
        return zzeqVar.zza(this.zza);
    }
}
