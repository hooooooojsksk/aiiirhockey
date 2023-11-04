package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzebv implements zzeat {
    private final zzcph zza;
    private final Context zzb;
    private final zzdmq zzc;
    private final zzeyx zzd;
    private final Executor zze;
    private final zzfnj zzf;

    public zzebv(zzcph zzcphVar, Context context, Executor executor, zzdmq zzdmqVar, zzeyx zzeyxVar, zzfnj zzfnjVar) {
        this.zzb = context;
        this.zza = zzcphVar;
        this.zze = executor;
        this.zzc = zzdmqVar;
        this.zzd = zzeyxVar;
        this.zzf = zzfnjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeat
    public final zzfut zza(final zzeyo zzeyoVar, final zzeyc zzeycVar) {
        return zzfuj.zzm(zzfuj.zzh(null), new zzftq() { // from class: com.google.android.gms.internal.ads.zzebp
            @Override // com.google.android.gms.internal.ads.zzftq
            public final zzfut zza(Object obj) {
                return zzebv.this.zzc(zzeyoVar, zzeycVar, obj);
            }
        }, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzeat
    public final boolean zzb(zzeyo zzeyoVar, zzeyc zzeycVar) {
        zzeyh zzeyhVar = zzeycVar.zzt;
        return (zzeyhVar == null || zzeyhVar.zza == null) ? false : true;
    }

    public final /* synthetic */ zzfut zzc(zzeyo zzeyoVar, zzeyc zzeycVar, Object obj) throws Exception {
        View zzdmtVar;
        com.google.android.gms.ads.internal.client.zzq zza = zzezb.zza(this.zzb, zzeycVar.zzv);
        final zzcei zza2 = this.zzc.zza(zza, zzeycVar, zzeyoVar.zzb.zzb);
        zza2.zzZ(zzeycVar.zzX);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhh)).booleanValue() || !zzeycVar.zzah) {
            zzdmtVar = new zzdmt(this.zzb, (View) zza2, (com.google.android.gms.ads.internal.util.zzas) this.zzf.apply(zzeycVar));
        } else {
            zzdmtVar = zzcpy.zza(this.zzb, (View) zza2, zzeycVar);
        }
        final zzcol zza3 = this.zza.zza(new zzcrb(zzeyoVar, zzeycVar, null), new zzcor(zzdmtVar, zza2, new zzcqk() { // from class: com.google.android.gms.internal.ads.zzebq
            @Override // com.google.android.gms.internal.ads.zzcqk
            public final com.google.android.gms.ads.internal.client.zzdq zza() {
                return zzcei.this.zzq();
            }
        }, zzezb.zzb(zza)));
        zza3.zzh().zzi(zza2, false, null);
        zza3.zzc().zzm(new zzcvi() { // from class: com.google.android.gms.internal.ads.zzebr
            @Override // com.google.android.gms.internal.ads.zzcvi
            public final void zzl() {
                zzcei zzceiVar = zzcei.this;
                if (zzceiVar.zzN() != null) {
                    zzceiVar.zzN().zzq();
                }
            }
        }, zzbzn.zzf);
        zza3.zzh();
        zzeyh zzeyhVar = zzeycVar.zzt;
        zzfut zzj = zzdmp.zzj(zza2, zzeyhVar.zzb, zzeyhVar.zza);
        if (zzeycVar.zzN) {
            zzj.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzebs
                @Override // java.lang.Runnable
                public final void run() {
                    zzcei.this.zzae();
                }
            }, this.zze);
        }
        zzj.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzebt
            @Override // java.lang.Runnable
            public final void run() {
                zzebv.this.zzd(zza2);
            }
        }, this.zze);
        return zzfuj.zzl(zzj, new zzfnj() { // from class: com.google.android.gms.internal.ads.zzebu
            @Override // com.google.android.gms.internal.ads.zzfnj
            public final Object apply(Object obj2) {
                return zzcol.this.zza();
            }
        }, zzbzn.zzf);
    }

    public final /* synthetic */ void zzd(zzcei zzceiVar) {
        zzceiVar.zzY();
        zzcfe zzq = zzceiVar.zzq();
        com.google.android.gms.ads.internal.client.zzfl zzflVar = this.zzd.zza;
        if (zzflVar == null || zzq == null) {
            return;
        }
        zzq.zzs(zzflVar);
    }
}
