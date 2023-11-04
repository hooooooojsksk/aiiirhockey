package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.games.video.VideoCapabilities;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public final class zzj extends zzbr {
    public zzj(BaseImplementation.ResultHolder resultHolder) {
        super(resultHolder);
    }

    @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzcb
    public final void zzv(int i, VideoCapabilities videoCapabilities) {
        zzw(new zzae(new Status(i), videoCapabilities));
    }
}
