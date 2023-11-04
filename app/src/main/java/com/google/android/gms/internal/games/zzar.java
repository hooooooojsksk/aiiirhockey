package com.google.android.gms.internal.games;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.event.Events;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes2.dex */
public final class zzar implements Events {
    @Override // com.google.android.gms.games.event.Events
    public final void increment(GoogleApiClient googleApiClient, String str, int i) {
        com.google.android.gms.games.internal.zzbz zzc = Games.zzc(googleApiClient, false);
        if (zzc == null) {
            return;
        }
        if (zzc.isConnected()) {
            zzc.zzab(str, i);
        } else {
            googleApiClient.execute(new zzak(this, googleApiClient, str, i));
        }
    }

    @Override // com.google.android.gms.games.event.Events
    public final PendingResult<Events.LoadEventsResult> load(GoogleApiClient googleApiClient, boolean z) {
        return googleApiClient.enqueue(new zzaj(this, googleApiClient, z));
    }

    @Override // com.google.android.gms.games.event.Events
    public final PendingResult<Events.LoadEventsResult> loadByIds(GoogleApiClient googleApiClient, boolean z, String... strArr) {
        return googleApiClient.enqueue(new zzai(this, googleApiClient, z, strArr));
    }
}
