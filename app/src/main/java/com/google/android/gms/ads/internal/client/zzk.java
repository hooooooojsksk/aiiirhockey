package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbnf;
import com.google.android.gms.internal.ads.zzbsf;
import com.google.android.gms.internal.ads.zzbsh;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzbzc;
import com.google.android.gms.internal.ads.zzbzd;
import com.google.android.gms.internal.ads.zzbze;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* loaded from: classes.dex */
public final class zzk extends RemoteCreator {
    private zzbsh zza;

    public zzk() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return queryLocalInterface instanceof zzbv ? (zzbv) queryLocalInterface : new zzbv(iBinder);
    }

    public final zzbu zza(Context context, zzq zzqVar, String str, zzbnf zzbnfVar, int i) {
        zzbar.zzc(context);
        if (((Boolean) zzba.zzc().zzb(zzbar.zzjb)).booleanValue()) {
            try {
                IBinder zze = ((zzbv) zzbze.zzb(context, "com.google.android.gms.ads.ChimeraAdManagerCreatorImpl", new zzbzc() { // from class: com.google.android.gms.ads.internal.client.zzj
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.google.android.gms.internal.ads.zzbzc
                    public final Object zza(Object obj) {
                        if (obj == 0) {
                            return null;
                        }
                        IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                        return queryLocalInterface instanceof zzbv ? (zzbv) queryLocalInterface : new zzbv(obj);
                    }
                })).zze(ObjectWrapper.wrap(context), zzqVar, str, zzbnfVar, ModuleDescriptor.MODULE_VERSION, i);
                if (zze == null) {
                    return null;
                }
                IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                return queryLocalInterface instanceof zzbu ? (zzbu) queryLocalInterface : new zzbs(zze);
            } catch (RemoteException | zzbzd | NullPointerException e) {
                zzbsh zza = zzbsf.zza(context);
                this.zza = zza;
                zza.zzf(e, "AdManagerCreator.newAdManagerByDynamiteLoader");
                zzbza.zzl("#007 Could not call remote method.", e);
                return null;
            }
        }
        try {
            IBinder zze2 = ((zzbv) getRemoteCreatorInstance(context)).zze(ObjectWrapper.wrap(context), zzqVar, str, zzbnfVar, ModuleDescriptor.MODULE_VERSION, i);
            if (zze2 == null) {
                return null;
            }
            IInterface queryLocalInterface2 = zze2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            return queryLocalInterface2 instanceof zzbu ? (zzbu) queryLocalInterface2 : new zzbs(zze2);
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e2) {
            zzbza.zzf("Could not create remote AdManager.", e2);
            return null;
        }
    }
}
