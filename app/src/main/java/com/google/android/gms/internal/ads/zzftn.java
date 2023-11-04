package com.google.android.gms.internal.ads;

import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes.dex */
final class zzftn extends zzftk {
    private zzftn() {
        super(null);
    }

    public /* synthetic */ zzftn(zzftm zzftmVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.zzftk
    public final int zza(zzfto zzftoVar) {
        int i;
        int i2;
        synchronized (zzftoVar) {
            i = zzftoVar.remaining;
            i2 = i - 1;
            zzftoVar.remaining = i2;
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.zzftk
    public final void zzb(zzfto zzftoVar, @CheckForNull Set set, Set set2) {
        Set set3;
        synchronized (zzftoVar) {
            set3 = zzftoVar.seenExceptions;
            if (set3 == null) {
                zzftoVar.seenExceptions = set2;
            }
        }
    }
}
