package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzbvi {
    public static final zzbuw zza(Context context, String str, zzbnf zzbnfVar) {
        try {
            IBinder zze = ((zzbva) zzbze.zzb(context, "com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl", new zzbzc() { // from class: com.google.android.gms.internal.ads.zzbvh
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.zzbzc
                public final Object zza(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
                    return queryLocalInterface instanceof zzbva ? (zzbva) queryLocalInterface : new zzbva(obj);
                }
            })).zze(ObjectWrapper.wrap(context), str, zzbnfVar, ModuleDescriptor.MODULE_VERSION);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            return queryLocalInterface instanceof zzbuw ? (zzbuw) queryLocalInterface : new zzbuu(zze);
        } catch (RemoteException | zzbzd e) {
            zzbza.zzl("#007 Could not call remote method.", e);
            return null;
        }
    }
}
