package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzdss extends AdListener {
    final /* synthetic */ String zza;
    final /* synthetic */ AdView zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzdsz zzd;

    public zzdss(zzdsz zzdszVar, String str, AdView adView, String str2) {
        this.zzd = zzdszVar;
        this.zza = str;
        this.zzb = adView;
        this.zzc = str2;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        String zzk;
        zzdsz zzdszVar = this.zzd;
        zzk = zzdsz.zzk(loadAdError);
        zzdszVar.zzl(zzk, this.zzc);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        this.zzd.zzg(this.zza, this.zzb, this.zzc);
    }
}
