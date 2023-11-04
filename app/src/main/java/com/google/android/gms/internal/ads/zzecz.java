package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzecz implements zzdee {
    private final zzeyc zza;
    private final zzbpc zzb;
    private final AdFormat zzc;
    private zzcvg zzd = null;

    public zzecz(zzeyc zzeycVar, zzbpc zzbpcVar, AdFormat adFormat) {
        this.zza = zzeycVar;
        this.zzb = zzbpcVar;
        this.zzc = adFormat;
    }

    @Override // com.google.android.gms.internal.ads.zzdee
    public final void zza(boolean z, Context context, zzcvb zzcvbVar) throws zzded {
        boolean zzs;
        try {
            AdFormat adFormat = AdFormat.BANNER;
            int ordinal = this.zzc.ordinal();
            if (ordinal == 1) {
                zzs = this.zzb.zzs(ObjectWrapper.wrap(context));
            } else if (ordinal == 2) {
                zzs = this.zzb.zzt(ObjectWrapper.wrap(context));
            } else {
                if (ordinal == 6) {
                    zzs = this.zzb.zzr(ObjectWrapper.wrap(context));
                }
                throw new zzded("Adapter failed to show.");
            }
            if (zzs) {
                if (this.zzd == null) {
                    return;
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzbp)).booleanValue() || this.zza.zzZ != 2) {
                    return;
                }
                this.zzd.zza();
                return;
            }
            throw new zzded("Adapter failed to show.");
        } catch (Throwable th) {
            throw new zzded(th);
        }
    }

    public final void zzb(zzcvg zzcvgVar) {
        this.zzd = zzcvgVar;
    }
}
