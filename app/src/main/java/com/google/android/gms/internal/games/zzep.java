package com.google.android.gms.internal.games;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.games.stats.Stats;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes2.dex */
public final class zzep implements Stats {
    @Override // com.google.android.gms.games.stats.Stats
    public final PendingResult<Stats.LoadPlayerStatsResult> loadPlayerStats(GoogleApiClient googleApiClient, boolean z) {
        return googleApiClient.enqueue(new zzel(this, googleApiClient, z));
    }
}
