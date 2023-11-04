package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzefh implements zzeat {
    private final Context zza;
    private final zzdmq zzb;
    private final zzdlz zzc;
    private final zzeyx zzd;
    private final Executor zze;
    private final zzbzg zzf;
    private final zzbhr zzg;
    private final boolean zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzie)).booleanValue();

    public zzefh(Context context, zzbzg zzbzgVar, zzeyx zzeyxVar, Executor executor, zzdlz zzdlzVar, zzdmq zzdmqVar, zzbhr zzbhrVar) {
        this.zza = context;
        this.zzd = zzeyxVar;
        this.zzc = zzdlzVar;
        this.zze = executor;
        this.zzf = zzbzgVar;
        this.zzb = zzdmqVar;
        this.zzg = zzbhrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeat
    public final zzfut zza(final zzeyo zzeyoVar, final zzeyc zzeycVar) {
        final zzdmu zzdmuVar = new zzdmu();
        zzfut zzm = zzfuj.zzm(zzfuj.zzh(null), new zzftq() { // from class: com.google.android.gms.internal.ads.zzefa
            @Override // com.google.android.gms.internal.ads.zzftq
            public final zzfut zza(Object obj) {
                return zzefh.this.zzc(zzeycVar, zzeyoVar, zzdmuVar, obj);
            }
        }, this.zze);
        zzm.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzefb
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
        final zzcei zza = this.zzb.zza(this.zzd.zze, zzeycVar, zzeyoVar.zzb.zzb);
        zza.zzZ(zzeycVar.zzX);
        zzdmuVar.zza(this.zza, (View) zza);
        zzbzs zzbzsVar = new zzbzs();
        final zzdlv zze = this.zzc.zze(new zzcrb(zzeyoVar, zzeycVar, null), new zzdlw(new zzefg(this.zza, this.zzb, this.zzd, this.zzf, zzeycVar, zzbzsVar, zza, this.zzg, this.zzh), zza));
        zzbzsVar.zzd(zze);
        zzbif.zzb(zza, zze.zzg());
        zze.zzc().zzm(new zzcvi() { // from class: com.google.android.gms.internal.ads.zzefc
            @Override // com.google.android.gms.internal.ads.zzcvi
            public final void zzl() {
                zzcei zzceiVar = zzcei.this;
                if (zzceiVar.zzN() != null) {
                    zzceiVar.zzN().zzq();
                }
            }
        }, zzbzn.zzf);
        zze.zzl().zzi(zza, true, this.zzh ? this.zzg : null);
        zze.zzl();
        zzeyh zzeyhVar = zzeycVar.zzt;
        return zzfuj.zzl(zzdmp.zzj(zza, zzeyhVar.zzb, zzeyhVar.zza), new zzfnj() { // from class: com.google.android.gms.internal.ads.zzefd
            @Override // com.google.android.gms.internal.ads.zzfnj
            public final Object apply(Object obj2) {
                zzcei zzceiVar = zza;
                zzeyc zzeycVar2 = zzeycVar;
                zzdlv zzdlvVar = zze;
                if (zzeycVar2.zzN) {
                    zzceiVar.zzae();
                }
                zzceiVar.zzY();
                zzceiVar.onPause();
                return zzdlvVar.zzk();
            }
        }, this.zze);
    }
}
