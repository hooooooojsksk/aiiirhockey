package com.google.android.gms.internal.games;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.video.Videos;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes2.dex */
final class zzfb implements Videos.CaptureAvailableResult {
    final /* synthetic */ Status zza;

    public zzfb(zzfd zzfdVar, Status status) {
        this.zza = status;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.zza;
    }

    @Override // com.google.android.gms.games.video.Videos.CaptureAvailableResult
    public final boolean isAvailable() {
        return false;
    }
}
