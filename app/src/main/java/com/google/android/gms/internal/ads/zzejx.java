package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzejx implements zzepn {
    private final Set zza;

    public zzejx(Set set) {
        this.zza = set;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final int zza() {
        return 8;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final zzfut zzb() {
        final ArrayList arrayList = new ArrayList();
        for (String str : this.zza) {
            arrayList.add(str);
        }
        return zzfuj.zzh(new zzepm() { // from class: com.google.android.gms.internal.ads.zzejw
            @Override // com.google.android.gms.internal.ads.zzepm
            public final void zzh(Object obj) {
                ((Bundle) obj).putStringArrayList("ad_types", arrayList);
            }
        });
    }
}
