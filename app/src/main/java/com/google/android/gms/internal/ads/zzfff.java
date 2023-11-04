package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzfff {
    private final Context zza;
    private final Executor zzb;
    private final zzbzf zzc;
    private final zzfep zzd;

    public zzfff(Context context, Executor executor, zzbzf zzbzfVar, zzfep zzfepVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzbzfVar;
        this.zzd = zzfepVar;
    }

    public final /* synthetic */ void zza(String str) {
        this.zzc.zza(str);
    }

    public final /* synthetic */ void zzb(String str, zzfen zzfenVar) {
        zzfec zza = zzfeb.zza(this.zza, 14);
        zza.zzh();
        zza.zzf(this.zzc.zza(str));
        if (zzfenVar == null) {
            this.zzd.zzb(zza.zzl());
            return;
        }
        zzfenVar.zza(zza);
        zzfenVar.zzg();
    }

    public final void zzc(final String str, final zzfen zzfenVar) {
        if (!zzfep.zza() || !((Boolean) zzbcd.zzd.zze()).booleanValue()) {
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzffd
                @Override // java.lang.Runnable
                public final void run() {
                    zzfff.this.zza(str);
                }
            });
        } else {
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzffe
                @Override // java.lang.Runnable
                public final void run() {
                    zzfff.this.zzb(str, zzfenVar);
                }
            });
        }
    }

    public final void zzd(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzc((String) it.next(), null);
        }
    }
}
