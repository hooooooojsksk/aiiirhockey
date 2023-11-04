package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzdsw extends AdListener {
    final /* synthetic */ String zza;
    final /* synthetic */ zzdsz zzb;

    public zzdsw(zzdsz zzdszVar, String str) {
        this.zzb = zzdszVar;
        this.zza = str;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        String zzk;
        zzdsz zzdszVar = this.zzb;
        zzk = zzdsz.zzk(loadAdError);
        zzdszVar.zzl(zzk, this.zza);
    }
}
