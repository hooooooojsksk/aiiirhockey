package com.google.android.gms.internal.games;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.stats.PlayerStats;
import com.google.android.gms.games.stats.Stats;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes2.dex */
final class zzem implements Stats.LoadPlayerStatsResult {
    final /* synthetic */ Status zza;

    public zzem(zzeo zzeoVar, Status status) {
        this.zza = status;
    }

    @Override // com.google.android.gms.games.stats.Stats.LoadPlayerStatsResult
    public final PlayerStats getPlayerStats() {
        return null;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.zza;
    }

    @Override // com.google.android.gms.common.api.Releasable
    public final void release() {
    }
}
