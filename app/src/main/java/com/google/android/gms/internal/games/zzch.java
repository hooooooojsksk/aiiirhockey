package com.google.android.gms.internal.games;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.leaderboard.Leaderboard;
import com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer;
import com.google.android.gms.games.leaderboard.Leaderboards;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes2.dex */
final class zzch implements Leaderboards.LoadScoresResult {
    final /* synthetic */ Status zza;

    public zzch(zzcj zzcjVar, Status status) {
        this.zza = status;
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboards.LoadScoresResult
    public final Leaderboard getLeaderboard() {
        return null;
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboards.LoadScoresResult
    public final LeaderboardScoreBuffer getScores() {
        return new LeaderboardScoreBuffer(DataHolder.empty(14));
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.zza;
    }

    @Override // com.google.android.gms.common.api.Releasable
    public final void release() {
    }
}
