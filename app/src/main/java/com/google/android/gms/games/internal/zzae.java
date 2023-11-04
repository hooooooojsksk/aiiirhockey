package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.video.VideoCapabilities;
import com.google.android.gms.games.video.Videos;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
final class zzae implements Videos.CaptureCapabilitiesResult {
    private final Status zza;
    private final VideoCapabilities zzb;

    public zzae(Status status, VideoCapabilities videoCapabilities) {
        this.zza = status;
        this.zzb = videoCapabilities;
    }

    @Override // com.google.android.gms.games.video.Videos.CaptureCapabilitiesResult
    public final VideoCapabilities getCapabilities() {
        return this.zzb;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.zza;
    }
}
