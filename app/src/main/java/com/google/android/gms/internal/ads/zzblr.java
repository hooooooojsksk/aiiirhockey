package com.google.android.gms.internal.ads;

import android.content.Context;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzblr {
    private final Context zzb;
    private final String zzc;
    private final zzbzg zzd;
    private final zzfep zze;
    private final com.google.android.gms.ads.internal.util.zzbb zzf;
    private final com.google.android.gms.ads.internal.util.zzbb zzg;
    private zzblq zzh;
    private final Object zza = new Object();
    private int zzi = 1;

    public zzblr(Context context, zzbzg zzbzgVar, String str, com.google.android.gms.ads.internal.util.zzbb zzbbVar, com.google.android.gms.ads.internal.util.zzbb zzbbVar2, zzfep zzfepVar) {
        this.zzc = str;
        this.zzb = context.getApplicationContext();
        this.zzd = zzbzgVar;
        this.zze = zzfepVar;
        this.zzf = zzbbVar;
        this.zzg = zzbbVar2;
    }

    public final zzbll zzb(zzapw zzapwVar) {
        synchronized (this.zza) {
            synchronized (this.zza) {
                zzblq zzblqVar = this.zzh;
                if (zzblqVar != null && this.zzi == 0) {
                    zzblqVar.zzi(new zzbzw() { // from class: com.google.android.gms.internal.ads.zzbkw
                        @Override // com.google.android.gms.internal.ads.zzbzw
                        public final void zza(Object obj) {
                            zzblr.this.zzk((zzbkm) obj);
                        }
                    }, new zzbzu() { // from class: com.google.android.gms.internal.ads.zzbkx
                        @Override // com.google.android.gms.internal.ads.zzbzu
                        public final void zza() {
                        }
                    });
                }
            }
            zzblq zzblqVar2 = this.zzh;
            if (zzblqVar2 != null && zzblqVar2.zze() != -1) {
                int i = this.zzi;
                if (i == 0) {
                    return this.zzh.zza();
                } else if (i != 1) {
                    return this.zzh.zza();
                } else {
                    this.zzi = 2;
                    zzd(null);
                    return this.zzh.zza();
                }
            }
            this.zzi = 2;
            zzblq zzd = zzd(null);
            this.zzh = zzd;
            return zzd.zza();
        }
    }

    public final zzblq zzd(zzapw zzapwVar) {
        zzfec zza = zzfeb.zza(this.zzb, 6);
        zza.zzh();
        zzblq zzblqVar = new zzblq(this.zzg);
        zzbzn.zze.execute(new Runnable(null, zzblqVar) { // from class: com.google.android.gms.internal.ads.zzbky
            public final /* synthetic */ zzblq zzb;

            {
                this.zzb = zzblqVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzblr.this.zzj(null, this.zzb);
            }
        });
        zzblqVar.zzi(new zzblg(this, zzblqVar, zza), new zzblh(this, zzblqVar, zza));
        return zzblqVar;
    }

    public final /* synthetic */ void zzi(zzblq zzblqVar, final zzbkm zzbkmVar) {
        synchronized (this.zza) {
            if (zzblqVar.zze() != -1 && zzblqVar.zze() != 1) {
                zzblqVar.zzg();
                zzbzn.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzblb
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzbkm.this.zzc();
                    }
                });
                com.google.android.gms.ads.internal.util.zze.zza("Could not receive loaded message in a timely manner. Rejecting.");
            }
        }
    }

    public final /* synthetic */ void zzj(zzapw zzapwVar, zzblq zzblqVar) {
        try {
            zzbku zzbkuVar = new zzbku(this.zzb, this.zzd, null, null);
            zzbkuVar.zzk(new zzbla(this, zzblqVar, zzbkuVar));
            zzbkuVar.zzq("/jsLoaded", new zzblc(this, zzblqVar, zzbkuVar));
            com.google.android.gms.ads.internal.util.zzca zzcaVar = new com.google.android.gms.ads.internal.util.zzca();
            zzbld zzbldVar = new zzbld(this, null, zzbkuVar, zzcaVar);
            zzcaVar.zzb(zzbldVar);
            zzbkuVar.zzq("/requestReload", zzbldVar);
            if (this.zzc.endsWith(".js")) {
                zzbkuVar.zzh(this.zzc);
            } else if (this.zzc.startsWith("<html>")) {
                zzbkuVar.zzf(this.zzc);
            } else {
                zzbkuVar.zzg(this.zzc);
            }
            com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new zzblf(this, zzblqVar, zzbkuVar), 60000L);
        } catch (Throwable th) {
            zzbza.zzh("Error creating webview.", th);
            com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "SdkJavascriptFactory.loadJavascriptEngine");
            zzblqVar.zzg();
        }
    }

    public final /* synthetic */ void zzk(zzbkm zzbkmVar) {
        if (zzbkmVar.zzi()) {
            this.zzi = 1;
        }
    }
}
