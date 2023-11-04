package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzebf implements zzeat {
    private final zzcny zza;
    private final Context zzb;
    private final zzdmq zzc;
    private final zzeyx zzd;
    private final Executor zze;
    private final zzbzg zzf;
    private final zzbhr zzg;
    private final boolean zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzie)).booleanValue();

    public zzebf(zzcny zzcnyVar, Context context, Executor executor, zzdmq zzdmqVar, zzeyx zzeyxVar, zzbzg zzbzgVar, zzbhr zzbhrVar) {
        this.zzb = context;
        this.zza = zzcnyVar;
        this.zze = executor;
        this.zzc = zzdmqVar;
        this.zzd = zzeyxVar;
        this.zzf = zzbzgVar;
        this.zzg = zzbhrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeat
    public final zzfut zza(final zzeyo zzeyoVar, final zzeyc zzeycVar) {
        final zzdmu zzdmuVar = new zzdmu();
        zzfut zzm = zzfuj.zzm(zzfuj.zzh(null), new zzftq() { // from class: com.google.android.gms.internal.ads.zzebd
            @Override // com.google.android.gms.internal.ads.zzftq
            public final zzfut zza(Object obj) {
                return zzebf.this.zzc(zzeycVar, zzeyoVar, zzdmuVar, obj);
            }
        }, this.zze);
        zzm.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzebe
            @Override // java.lang.Runnable
            public final void run() {
                zzdmu.this.zzb();
            }
        }, this.zze);
        return zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzeat
    public final boolean zzb(zzeyo zzeyoVar, zzeyc zzeycVar) {
        zzeyh zzeyhVar = zzeycVar.zzt;
        return (zzeyhVar == null || zzeyhVar.zza == null) ? false : true;
    }

    public final /* synthetic */ zzfut zzc(final zzeyc zzeycVar, zzeyo zzeyoVar, zzdmu zzdmuVar, Object obj) throws Exception {
        final zzcei zza = this.zzc.zza(this.zzd.zze, zzeycVar, zzeyoVar.zzb.zzb);
        zza.zzZ(zzeycVar.zzX);
        zzdmuVar.zza(this.zzb, (View) zza);
        zzbzs zzbzsVar = new zzbzs();
        final zzcnv zza2 = this.zza.zza(new zzcrb(zzeyoVar, zzeycVar, null), new zzdcz(new zzebh(this.zzf, zzbzsVar, zzeycVar, zza, this.zzd, this.zzh, this.zzg), zza), new zzcnw(zzeycVar.zzab));
        zza2.zzh().zzi(zza, false, this.zzh ? this.zzg : null);
        zzbzsVar.zzd(zza2);
        zza2.zzc().zzm(new zzcvi() { // from class: com.google.android.gms.internal.ads.zzebb
            @Override // com.google.android.gms.internal.ads.zzcvi
            public final void zzl() {
                zzcei zzceiVar = zzcei.this;
                if (zzceiVar.zzN() != null) {
                    zzceiVar.zzN().zzq();
                }
            }
        }, zzbzn.zzf);
        zza2.zzh();
        zzeyh zzeyhVar = zzeycVar.zzt;
        return zzfuj.zzl(zzdmp.zzj(zza, zzeyhVar.zzb, zzeyhVar.zza), new zzfnj() { // from class: com.google.android.gms.internal.ads.zzebc
            @Override // com.google.android.gms.internal.ads.zzfnj
            public final Object apply(Object obj2) {
                zzcei zzceiVar = zza;
                zzeyc zzeycVar2 = zzeycVar;
                zzcnv zzcnvVar = zza2;
                if (zzeycVar2.zzN) {
                    zzceiVar.zzae();
                }
                zzceiVar.zzY();
                zzceiVar.onPause();
                return zzcnvVar.zza();
            }
        }, this.zze);
    }
}
