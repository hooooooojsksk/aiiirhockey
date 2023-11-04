package com.google.android.gms.internal.ads;

import java.util.Iterator;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes.dex */
final class zzfqr extends zzfon {
    final /* synthetic */ Iterator zza;
    final /* synthetic */ zzfnv zzb;

    public zzfqr(Iterator it, zzfnv zzfnvVar) {
        this.zza = it;
        this.zzb = zzfnvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfon
    @CheckForNull
    protected final Object zza() {
        while (this.zza.hasNext()) {
            Object next = this.zza.next();
            if (this.zzb.zza(next)) {
                return next;
            }
        }
        zzb();
        return null;
    }
}
