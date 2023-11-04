package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzbmh implements zzbzu {
    final /* synthetic */ zzbzs zza;
    final /* synthetic */ zzbll zzb;

    public zzbmh(zzbmj zzbmjVar, zzbzs zzbzsVar, zzbll zzbllVar) {
        this.zza = zzbzsVar;
        this.zzb = zzbllVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbzu
    public final void zza() {
        this.zza.zze(new zzblu("Unable to obtain a JavascriptEngine."));
        this.zzb.zzb();
    }
}
