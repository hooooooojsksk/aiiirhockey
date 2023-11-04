package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeCustomFormatAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzbqp {
    private final NativeCustomFormatAd.OnCustomFormatAdLoadedListener zza;
    private final NativeCustomFormatAd.OnCustomClickListener zzb;
    private NativeCustomFormatAd zzc;

    public zzbqp(NativeCustomFormatAd.OnCustomFormatAdLoadedListener onCustomFormatAdLoadedListener, NativeCustomFormatAd.OnCustomClickListener onCustomClickListener) {
        this.zza = onCustomFormatAdLoadedListener;
        this.zzb = onCustomClickListener;
    }

    public final synchronized NativeCustomFormatAd zzf(zzber zzberVar) {
        NativeCustomFormatAd nativeCustomFormatAd = this.zzc;
        if (nativeCustomFormatAd != null) {
            return nativeCustomFormatAd;
        }
        zzbqq zzbqqVar = new zzbqq(zzberVar);
        this.zzc = zzbqqVar;
        return zzbqqVar;
    }

    public final zzbfb zza() {
        if (this.zzb == null) {
            return null;
        }
        return new zzbqm(this, null);
    }

    public final zzbfe zzb() {
        return new zzbqo(this, null);
    }
}
