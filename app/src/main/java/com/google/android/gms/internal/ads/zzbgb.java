package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzbgb extends zzbfd {
    final /* synthetic */ zzbgc zza;

    public /* synthetic */ zzbgb(zzbgc zzbgcVar, zzbga zzbgaVar) {
        this.zza = zzbgcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfe
    public final void zze(zzber zzberVar) {
        zzbgc zzbgcVar = this.zza;
        zzbgcVar.zza.onCustomTemplateAdLoaded(zzbgcVar.zzf(zzberVar));
    }
}
