package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzbgc {
    private final NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener zza;
    private final NativeCustomTemplateAd.OnCustomClickListener zzb;
    private NativeCustomTemplateAd zzc;

    public zzbgc(NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener onCustomTemplateAdLoadedListener, NativeCustomTemplateAd.OnCustomClickListener onCustomClickListener) {
        this.zza = onCustomTemplateAdLoadedListener;
        this.zzb = onCustomClickListener;
    }

    public final synchronized NativeCustomTemplateAd zzf(zzber zzberVar) {
        NativeCustomTemplateAd nativeCustomTemplateAd = this.zzc;
        if (nativeCustomTemplateAd != null) {
            return nativeCustomTemplateAd;
        }
        zzbes zzbesVar = new zzbes(zzberVar);
        this.zzc = zzbesVar;
        return zzbesVar;
    }

    public final zzbfb zzd() {
        if (this.zzb == null) {
            return null;
        }
        return new zzbfz(this, null);
    }

    public final zzbfe zze() {
        return new zzbgb(this, null);
    }
}
