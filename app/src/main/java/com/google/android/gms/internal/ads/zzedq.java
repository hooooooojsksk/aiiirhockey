package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzedq implements zzeba {
    private final Context zza;
    private final zzdes zzb;
    private final Executor zzc;

    public zzedq(Context context, zzdes zzdesVar, Executor executor) {
        this.zza = context;
        this.zzb = zzdesVar;
        this.zzc = executor;
    }

    private static final boolean zzc(zzeyo zzeyoVar, int i) {
        return zzeyoVar.zza.zza.zzg.contains(Integer.toString(i));
    }

    @Override // com.google.android.gms.internal.ads.zzeba
    public final /* bridge */ /* synthetic */ Object zza(zzeyo zzeyoVar, zzeyc zzeycVar, zzeaw zzeawVar) throws zzezc, zzeek {
        zzdgi zzae;
        zzbnq zzD = ((zzezs) zzeawVar.zzb).zzD();
        zzbnr zzE = ((zzezs) zzeawVar.zzb).zzE();
        zzbnu zzd = ((zzezs) zzeawVar.zzb).zzd();
        if (zzd == null || !zzc(zzeyoVar, 6)) {
            if (zzD == null || !zzc(zzeyoVar, 6)) {
                if (zzD == null || !zzc(zzeyoVar, 2)) {
                    if (zzE == null || !zzc(zzeyoVar, 6)) {
                        if (zzE == null || !zzc(zzeyoVar, 1)) {
                            throw new zzeek(1, "No native ad mappers");
                        }
                        zzae = zzdgi.zzae(zzE);
                    } else {
                        zzae = zzdgi.zzag(zzE);
                    }
                } else {
                    zzae = zzdgi.zzad(zzD);
                }
            } else {
                zzae = zzdgi.zzaf(zzD);
            }
        } else {
            zzae = zzdgi.zzs(zzd);
        }
        if (!zzeyoVar.zza.zza.zzg.contains(Integer.toString(zzae.zzc()))) {
            throw new zzeek(1, "No corresponding native ad listener");
        }
        zzdgk zze = this.zzb.zze(new zzcrb(zzeyoVar, zzeycVar, zzeawVar.zza), new zzdgu(zzae), new zzdij(zzE, zzD, zzd, null));
        ((zzecq) zzeawVar.zzc).zzc(zze.zzj());
        zze.zzd().zzm(new zzcmm((zzezs) zzeawVar.zzb), this.zzc);
        return zze.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzeba
    public final void zzb(zzeyo zzeyoVar, zzeyc zzeycVar, zzeaw zzeawVar) throws zzezc {
        zzeyx zzeyxVar = zzeyoVar.zza.zza;
        ((zzezs) zzeawVar.zzb).zzp(this.zza, zzeyoVar.zza.zza.zzd, zzeycVar.zzw.toString(), com.google.android.gms.ads.internal.util.zzbu.zzl(zzeycVar.zzt), (zzbnl) zzeawVar.zzc, zzeyxVar.zzi, zzeyxVar.zzg);
    }
}
