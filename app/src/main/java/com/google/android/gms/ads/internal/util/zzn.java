package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import androidx.browser.customtabs.CustomTabsIntent;
import com.google.android.gms.internal.ads.zzbbq;
import com.google.android.gms.internal.ads.zzbbs;
import com.google.android.gms.internal.ads.zzgxm;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes.dex */
public final class zzn implements zzbbq {
    final /* synthetic */ zzbbs zza;
    final /* synthetic */ Context zzb;
    final /* synthetic */ Uri zzc;

    public zzn(zzs zzsVar, zzbbs zzbbsVar, Context context, Uri uri) {
        this.zza = zzbbsVar;
        this.zzb = context;
        this.zzc = uri;
    }

    @Override // com.google.android.gms.internal.ads.zzbbq
    public final void zza() {
        CustomTabsIntent build = new CustomTabsIntent.Builder(this.zza.zza()).build();
        build.intent.setPackage(zzgxm.zza(this.zzb));
        build.launchUrl(this.zzb, this.zzc);
        this.zza.zzf((Activity) this.zzb);
    }
}
