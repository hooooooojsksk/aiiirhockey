package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzflw extends zzfmi {
    final /* synthetic */ zzflx zza;
    private final zzfmc zzb;

    public zzflw(zzflx zzflxVar, zzfmc zzfmcVar) {
        this.zza = zzflxVar;
        this.zzb = zzfmcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfmj
    public final void zzb(Bundle bundle) {
        int i = bundle.getInt("statusCode", 8150);
        String string = bundle.getString("sessionToken");
        zzfma zzc = zzfmb.zzc();
        zzc.zzb(i);
        if (string != null) {
            zzc.zza(string);
        }
        this.zzb.zza(zzc.zzc());
        if (i == 8157) {
            this.zza.zzc();
        }
    }
}
