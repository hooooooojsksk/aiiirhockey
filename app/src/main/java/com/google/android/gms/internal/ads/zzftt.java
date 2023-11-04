package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes.dex */
abstract class zzftt extends zzfti {
    @CheckForNull
    private List zza;

    public zzftt(zzfqf zzfqfVar, boolean z) {
        super(zzfqfVar, true, true);
        List zza;
        if (zzfqfVar.isEmpty()) {
            zza = Collections.emptyList();
        } else {
            zza = zzfqy.zza(zzfqfVar.size());
        }
        for (int i = 0; i < zzfqfVar.size(); i++) {
            zza.add(null);
        }
        this.zza = zza;
    }

    abstract Object zzH(List list);

    @Override // com.google.android.gms.internal.ads.zzfti
    final void zzg(int i, Object obj) {
        List list = this.zza;
        if (list != null) {
            list.set(i, new zzfts(obj));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfti
    final void zzv() {
        List list = this.zza;
        if (list != null) {
            zzd(zzH(list));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfti
    public final void zzz(int i) {
        super.zzz(i);
        this.zza = null;
    }
}
