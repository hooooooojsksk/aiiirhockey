package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzeie implements zzcwz {
    private final AtomicReference zza = new AtomicReference();

    public final void zza(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        this.zza.set(zzdgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcwz
    public final void zzh(final com.google.android.gms.ads.internal.client.zzs zzsVar) {
        zzevh.zza(this.zza, new zzevg() { // from class: com.google.android.gms.internal.ads.zzeid
            @Override // com.google.android.gms.internal.ads.zzevg
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzdg) obj).zze(com.google.android.gms.ads.internal.client.zzs.this);
            }
        });
    }
}
