package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public final class zzl extends zzbr {
    public zzl(BaseImplementation.ResultHolder resultHolder) {
        super(resultHolder);
    }

    @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzcb
    public final void zzu(int i, boolean z) {
        zzw(new zzad(new Status(i), z));
    }
}
