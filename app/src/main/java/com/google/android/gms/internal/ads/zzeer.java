package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzeer implements zzeba {
    private final Context zza;
    private final Executor zzb;
    private final zzdlz zzc;

    public zzeer(Context context, Executor executor, zzdlz zzdlzVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzdlzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeba
    public final /* bridge */ /* synthetic */ Object zza(zzeyo zzeyoVar, zzeyc zzeycVar, final zzeaw zzeawVar) throws zzezc, zzeek {
        zzdlv zze = this.zzc.zze(new zzcrb(zzeyoVar, zzeycVar, zzeawVar.zza), new zzdlw(new zzdee() { // from class: com.google.android.gms.internal.ads.zzeeq
            @Override // com.google.android.gms.internal.ads.zzdee
            public final void zza(boolean z, Context context, zzcvb zzcvbVar) {
                zzeaw zzeawVar2 = zzeaw.this;
                try {
                    ((zzezs) zzeawVar2.zzb).zzv(z);
                    ((zzezs) zzeawVar2.zzb).zzz(context);
                } catch (zzezc e) {
                    throw new zzded(e.getCause());
                }
            }
        }));
        zze.zzd().zzm(new zzcmm((zzezs) zzeawVar.zzb), this.zzb);
        ((zzecq) zzeawVar.zzc).zzc(zze.zzm());
        return zze.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzeba
    public final void zzb(zzeyo zzeyoVar, zzeyc zzeycVar, zzeaw zzeawVar) throws zzezc {
        try {
            zzeyx zzeyxVar = zzeyoVar.zza.zza;
            if (zzeyxVar.zzo.zza == 3) {
                ((zzezs) zzeawVar.zzb).zzr(this.zza, zzeyxVar.zzd, zzeycVar.zzw.toString(), (zzbnl) zzeawVar.zzc);
            } else {
                ((zzezs) zzeawVar.zzb).zzq(this.zza, zzeyxVar.zzd, zzeycVar.zzw.toString(), (zzbnl) zzeawVar.zzc);
            }
        } catch (Exception e) {
            zzbza.zzk("Fail to load ad from adapter ".concat(String.valueOf(zzeawVar.zza)), e);
        }
    }
}
