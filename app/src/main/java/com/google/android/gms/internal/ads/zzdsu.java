package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzdsu extends RewardedAdLoadCallback {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzdsz zzc;

    public zzdsu(zzdsz zzdszVar, String str, String str2) {
        this.zzc = zzdszVar;
        this.zza = str;
        this.zzb = str2;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        String zzk;
        zzdsz zzdszVar = this.zzc;
        zzk = zzdsz.zzk(loadAdError);
        zzdszVar.zzl(zzk, this.zzb);
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final /* bridge */ /* synthetic */ void onAdLoaded(RewardedAd rewardedAd) {
        this.zzc.zzg(this.zza, rewardedAd, this.zzb);
    }
}
