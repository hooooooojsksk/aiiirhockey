package com.google.android.gms.internal.games;

import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.video.Videos;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes2.dex */
public final class zzfk implements Videos {
    @Override // com.google.android.gms.games.video.Videos
    public final PendingResult<Videos.CaptureCapabilitiesResult> getCaptureCapabilities(GoogleApiClient googleApiClient) {
        return googleApiClient.enqueue(new zzey(this, googleApiClient));
    }

    @Override // com.google.android.gms.games.video.Videos
    public final Intent getCaptureOverlayIntent(GoogleApiClient googleApiClient) {
        return Games.zzd(googleApiClient, true).zzw();
    }

    @Override // com.google.android.gms.games.video.Videos
    public final PendingResult<Videos.CaptureStateResult> getCaptureState(GoogleApiClient googleApiClient) {
        return googleApiClient.enqueue(new zzez(this, googleApiClient));
    }

    @Override // com.google.android.gms.games.video.Videos
    public final PendingResult<Videos.CaptureAvailableResult> isCaptureAvailable(GoogleApiClient googleApiClient, int i) {
        return googleApiClient.enqueue(new zzfa(this, googleApiClient, i));
    }

    @Override // com.google.android.gms.games.video.Videos
    public final boolean isCaptureSupported(GoogleApiClient googleApiClient) {
        return Games.zzd(googleApiClient, true).zzbe();
    }

    @Override // com.google.android.gms.games.video.Videos
    public final void registerCaptureOverlayStateChangedListener(GoogleApiClient googleApiClient, Videos.CaptureOverlayStateListener captureOverlayStateListener) {
        com.google.android.gms.games.internal.zzbz zzd = Games.zzd(googleApiClient, false);
        if (zzd != null) {
            zzd.zzaK(googleApiClient.registerListener(captureOverlayStateListener));
        }
    }

    @Override // com.google.android.gms.games.video.Videos
    public final void unregisterCaptureOverlayStateChangedListener(GoogleApiClient googleApiClient) {
        com.google.android.gms.games.internal.zzbz zzd = Games.zzd(googleApiClient, false);
        if (zzd != null) {
            zzd.zzbc();
        }
    }
}
