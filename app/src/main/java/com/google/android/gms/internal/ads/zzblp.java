package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzblp implements zzbzw {
    final /* synthetic */ zzblq zza;

    public zzblp(zzblq zzblqVar) {
        this.zza = zzblqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbzw
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        final zzbkm zzbkmVar = (zzbkm) obj;
        zzbzn.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzblo
            @Override // java.lang.Runnable
            public final void run() {
                zzbkm zzbkmVar2 = zzbkmVar;
                zzbkmVar2.zzr("/result", zzbho.zzo);
                zzbkmVar2.zzc();
            }
        });
    }
}
