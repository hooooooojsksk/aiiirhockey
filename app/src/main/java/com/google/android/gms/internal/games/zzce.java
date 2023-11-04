package com.google.android.gms.internal.games;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.leaderboard.LeaderboardScore;
import com.google.android.gms.games.leaderboard.Leaderboards;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes2.dex */
final class zzce implements Leaderboards.LoadPlayerScoreResult {
    final /* synthetic */ Status zza;

    public zzce(zzcg zzcgVar, Status status) {
        this.zza = status;
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboards.LoadPlayerScoreResult
    public final LeaderboardScore getScore() {
        return null;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.zza;
    }
}
