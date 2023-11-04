package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeCustomFormatAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzbqo extends zzbfd {
    final /* synthetic */ zzbqp zza;

    public /* synthetic */ zzbqo(zzbqp zzbqpVar, zzbqn zzbqnVar) {
        this.zza = zzbqpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfe
    public final void zze(zzber zzberVar) {
        NativeCustomFormatAd.OnCustomFormatAdLoadedListener onCustomFormatAdLoadedListener;
        NativeCustomFormatAd zzf;
        zzbqp zzbqpVar = this.zza;
        onCustomFormatAdLoadedListener = zzbqpVar.zza;
        zzf = zzbqpVar.zzf(zzberVar);
        onCustomFormatAdLoadedListener.onCustomFormatAdLoaded(zzf);
    }
}
