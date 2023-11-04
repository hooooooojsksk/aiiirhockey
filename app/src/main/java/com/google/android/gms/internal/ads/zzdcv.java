package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes.dex */
public final class zzdcv extends zzcqm {
    private final Context zzc;
    private final WeakReference zzd;
    private final zzdbk zze;
    private final zzdee zzf;
    private final zzcrg zzg;
    private final zzfia zzh;
    private final zzcvb zzi;
    private boolean zzj;

    public zzdcv(zzcql zzcqlVar, Context context, @Nullable zzcei zzceiVar, zzdbk zzdbkVar, zzdee zzdeeVar, zzcrg zzcrgVar, zzfia zzfiaVar, zzcvb zzcvbVar) {
        super(zzcqlVar);
        this.zzj = false;
        this.zzc = context;
        this.zzd = new WeakReference(zzceiVar);
        this.zze = zzdbkVar;
        this.zzf = zzdeeVar;
        this.zzg = zzcrgVar;
        this.zzh = zzfiaVar;
        this.zzi = zzcvbVar;
    }

    public final void finalize() throws Throwable {
        try {
            final zzcei zzceiVar = (zzcei) this.zzd.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzgn)).booleanValue()) {
                if (!this.zzj && zzceiVar != null) {
                    zzbzn.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdcu
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzcei.this.destroy();
                        }
                    });
                }
            } else if (zzceiVar != null) {
                zzceiVar.destroy();
            }
        } finally {
            super.finalize();
        }
    }

    public final boolean zza() {
        return this.zzg.zzg();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.content.Context] */
    public final boolean zzc(boolean z, @Nullable Activity activity) {
        this.zze.zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzay)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzp();
            if (com.google.android.gms.ads.internal.util.zzs.zzC(this.zzc)) {
                zzbza.zzj("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.zzi.zzb();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzaz)).booleanValue()) {
                    this.zzh.zza(this.zza.zzb.zzb.zzb);
                }
                return false;
            }
        }
        if (this.zzj) {
            zzbza.zzj("The interstitial ad has been showed.");
            this.zzi.zza(zzezx.zzd(10, null, null));
        }
        Activity activity2 = activity;
        if (!this.zzj) {
            if (activity == null) {
                activity2 = this.zzc;
            }
            try {
                this.zzf.zza(z, activity2, this.zzi);
                this.zze.zza();
                this.zzj = true;
                return true;
            } catch (zzded e) {
                this.zzi.zzc(e);
            }
        }
        return false;
    }
}
