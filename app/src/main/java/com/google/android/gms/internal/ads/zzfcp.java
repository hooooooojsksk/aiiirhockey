package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzfcp implements zzfuf {
    final /* synthetic */ zzfcf zza;
    final /* synthetic */ zzfcr zzb;

    public zzfcp(zzfcr zzfcrVar, zzfcf zzfcfVar) {
        this.zzb = zzfcrVar;
        this.zza = zzfcfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final void zza(Throwable th) {
        zzfct zzfctVar;
        zzfctVar = this.zzb.zza.zzd;
        zzfctVar.zzb(this.zza, th);
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final void zzb(Object obj) {
        zzfct zzfctVar;
        zzfctVar = this.zzb.zza.zzd;
        zzfctVar.zzd(this.zza);
    }
}
