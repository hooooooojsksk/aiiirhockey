package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzpk implements zzof {
    final /* synthetic */ zzpl zza;

    public /* synthetic */ zzpk(zzpl zzplVar, zzpj zzpjVar) {
        this.zza = zzplVar;
    }

    @Override // com.google.android.gms.internal.ads.zzof
    public final void zza(Exception exc) {
        zzob zzobVar;
        zzee.zzc("MediaCodecAudioRenderer", "Audio sink error", exc);
        zzobVar = this.zza.zzc;
        zzobVar.zzb(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzof
    public final void zzb() {
        zzkm zzkmVar;
        zzkm zzkmVar2;
        zzpl zzplVar = this.zza;
        zzkmVar = zzplVar.zzl;
        if (zzkmVar != null) {
            zzkmVar2 = zzplVar.zzl;
            zzkmVar2.zzb();
        }
    }
}
