package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzemy implements zzepm {
    public final Bundle zza;

    public zzemy(Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzepm
    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle zza = zzezi.zza(bundle, "device");
        zza.putBundle("android_mem_info", this.zza);
        bundle.putBundle("device", zza);
    }
}
