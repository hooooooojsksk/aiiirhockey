package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzdtr implements zzgwy {
    private final zzgxl zza;

    public zzdtr(zzgxl zzgxlVar) {
        this.zza = zzgxlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    /* renamed from: zza */
    public final ApplicationInfo zzb() {
        ApplicationInfo applicationInfo = ((Context) this.zza.zzb()).getApplicationInfo();
        zzgxg.zzb(applicationInfo);
        return applicationInfo;
    }
}
