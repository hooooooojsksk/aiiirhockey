package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzeii implements zzeiq {
    final /* synthetic */ zzeij zza;

    public zzeii(zzeij zzeijVar) {
        this.zza = zzeijVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeiq
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzi = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeiq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdcv zzdcvVar;
        zzdcv zzdcvVar2 = (zzdcv) obj;
        synchronized (this.zza) {
            this.zza.zzi = zzdcvVar2;
            zzdcvVar = this.zza.zzi;
            zzdcvVar.zzj();
        }
    }
}
