package com.google.android.gms.internal.games;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.video.VideoCapabilities;
import com.google.android.gms.games.video.Videos;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes2.dex */
final class zzfe implements Videos.CaptureCapabilitiesResult {
    final /* synthetic */ Status zza;

    public zzfe(zzfg zzfgVar, Status status) {
        this.zza = status;
    }

    @Override // com.google.android.gms.games.video.Videos.CaptureCapabilitiesResult
    public final VideoCapabilities getCapabilities() {
        return null;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.zza;
    }
}
