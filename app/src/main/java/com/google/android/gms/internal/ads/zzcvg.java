package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzcvg extends zzczy {
    private boolean zzb;

    public zzcvg(Set set) {
        super(set);
        this.zzb = false;
    }

    public final synchronized void zza() {
        if (this.zzb) {
            return;
        }
        zzp(new zzczx() { // from class: com.google.android.gms.internal.ads.zzcvf
            @Override // com.google.android.gms.internal.ads.zzczx
            public final void zza(Object obj) {
                ((zzcvi) obj).zzl();
            }
        });
        this.zzb = true;
    }
}
