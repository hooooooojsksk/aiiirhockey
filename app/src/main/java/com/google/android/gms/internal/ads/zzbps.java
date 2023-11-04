package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.mediation.MediationInterstitialListener;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzbps implements com.google.android.gms.ads.internal.overlay.zzo {
    final /* synthetic */ zzbpu zza;

    public zzbps(zzbpu zzbpuVar) {
        this.zza = zzbpuVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzb() {
        MediationInterstitialListener mediationInterstitialListener;
        zzbza.zze("Opening AdMobCustomTabsAdapter overlay.");
        zzbpu zzbpuVar = this.zza;
        mediationInterstitialListener = zzbpuVar.zzb;
        mediationInterstitialListener.onAdOpened(zzbpuVar);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbF() {
        zzbza.zze("AdMobCustomTabsAdapter overlay is resumed.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbo() {
        zzbza.zze("AdMobCustomTabsAdapter overlay is paused.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzby() {
        zzbza.zze("Delay close AdMobCustomTabsAdapter overlay.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zze() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzf(int i) {
        MediationInterstitialListener mediationInterstitialListener;
        zzbza.zze("AdMobCustomTabsAdapter overlay is closed.");
        zzbpu zzbpuVar = this.zza;
        mediationInterstitialListener = zzbpuVar.zzb;
        mediationInterstitialListener.onAdClosed(zzbpuVar);
    }
}
