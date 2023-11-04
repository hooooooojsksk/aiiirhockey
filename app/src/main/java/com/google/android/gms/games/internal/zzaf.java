package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.video.CaptureState;
import com.google.android.gms.games.video.Videos;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
final class zzaf implements Videos.CaptureStateResult {
    private final Status zza;
    private final CaptureState zzb;

    public zzaf(Status status, CaptureState captureState) {
        this.zza = status;
        this.zzb = captureState;
    }

    @Override // com.google.android.gms.games.video.Videos.CaptureStateResult
    public final CaptureState getCaptureState() {
        return this.zzb;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.zza;
    }
}
