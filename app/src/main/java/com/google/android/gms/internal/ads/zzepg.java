package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzepg implements zzepn {
    private final boolean zza;

    public zzepg(zzevx zzevxVar) {
        this.zza = zzevxVar != null;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final int zza() {
        return 36;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final zzfut zzb() {
        return zzfuj.zzh(this.zza ? new zzepm() { // from class: com.google.android.gms.internal.ads.zzepf
            @Override // com.google.android.gms.internal.ads.zzepm
            public final void zzh(Object obj) {
                ((Bundle) obj).putBoolean("sdk_prefetch", true);
            }
        } : null);
    }
}
