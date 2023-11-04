package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzebj implements zzeba {
    private final Context zza;
    private final zzcny zzb;
    private final Executor zzc;

    public zzebj(Context context, zzcny zzcnyVar, Executor executor) {
        this.zza = context;
        this.zzb = zzcnyVar;
        this.zzc = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzeba
    public final /* bridge */ /* synthetic */ Object zza(zzeyo zzeyoVar, zzeyc zzeycVar, final zzeaw zzeawVar) throws zzezc, zzeek {
        zzcnv zza = this.zzb.zza(new zzcrb(zzeyoVar, zzeycVar, zzeawVar.zza), new zzdcz(new zzdee() { // from class: com.google.android.gms.internal.ads.zzebi
            @Override // com.google.android.gms.internal.ads.zzdee
            public final void zza(boolean z, Context context, zzcvb zzcvbVar) {
                zzeaw zzeawVar2 = zzeaw.this;
                try {
                    ((zzezs) zzeawVar2.zzb).zzv(z);
                    ((zzezs) zzeawVar2.zzb).zzw(context);
                } catch (zzezc e) {
                    throw new zzded(e.getCause());
                }
            }
        }, null), new zzcnw(zzeycVar.zzab));
        zza.zzd().zzm(new zzcmm((zzezs) zzeawVar.zzb), this.zzc);
        ((zzecq) zzeawVar.zzc).zzc(zza.zzj());
        return zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzeba
    public final void zzb(zzeyo zzeyoVar, zzeyc zzeycVar, zzeaw zzeawVar) throws zzezc {
        ((zzezs) zzeawVar.zzb).zzl(this.zza, zzeyoVar.zza.zza.zzd, zzeycVar.zzw.toString(), (zzbnl) zzeawVar.zzc);
    }
}
