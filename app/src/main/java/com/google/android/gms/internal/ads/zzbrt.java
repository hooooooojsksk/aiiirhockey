package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzbrt {
    private static zzbxr zza;
    private final Context zzb;
    private final AdFormat zzc;
    private final com.google.android.gms.ads.internal.client.zzdx zzd;

    public zzbrt(Context context, AdFormat adFormat, com.google.android.gms.ads.internal.client.zzdx zzdxVar) {
        this.zzb = context;
        this.zzc = adFormat;
        this.zzd = zzdxVar;
    }

    public static zzbxr zza(Context context) {
        zzbxr zzbxrVar;
        synchronized (zzbrt.class) {
            if (zza == null) {
                zza = com.google.android.gms.ads.internal.client.zzay.zza().zzr(context, new zzbnc());
            }
            zzbxrVar = zza;
        }
        return zzbxrVar;
    }

    public final void zzb(QueryInfoGenerationCallback queryInfoGenerationCallback) {
        com.google.android.gms.ads.internal.client.zzl zza2;
        zzbxr zza3 = zza(this.zzb);
        if (zza3 == null) {
            queryInfoGenerationCallback.onFailure("Internal Error, query info generator is null.");
            return;
        }
        IObjectWrapper wrap = ObjectWrapper.wrap(this.zzb);
        com.google.android.gms.ads.internal.client.zzdx zzdxVar = this.zzd;
        if (zzdxVar != null) {
            zza2 = com.google.android.gms.ads.internal.client.zzp.zza.zza(this.zzb, zzdxVar);
        } else {
            zza2 = new com.google.android.gms.ads.internal.client.zzm().zza();
        }
        try {
            zza3.zze(wrap, new zzbxv(null, this.zzc.name(), null, zza2), new zzbrs(this, queryInfoGenerationCallback));
        } catch (RemoteException unused) {
            queryInfoGenerationCallback.onFailure("Internal Error.");
        }
    }
}
