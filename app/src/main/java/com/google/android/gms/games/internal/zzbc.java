package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.leaderboard.LeaderboardScore;
import com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer;
import com.google.android.gms.games.leaderboard.LeaderboardScoreEntity;
import com.google.android.gms.games.leaderboard.Leaderboards;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
final class zzbc extends zzao implements Leaderboards.LoadPlayerScoreResult {
    private final LeaderboardScoreEntity zza;

    public zzbc(DataHolder dataHolder) {
        super(dataHolder);
        LeaderboardScoreBuffer leaderboardScoreBuffer = new LeaderboardScoreBuffer(dataHolder);
        try {
            if (leaderboardScoreBuffer.getCount() > 0) {
                this.zza = new LeaderboardScoreEntity(leaderboardScoreBuffer.get(0));
            } else {
                this.zza = null;
            }
        } finally {
            leaderboardScoreBuffer.release();
        }
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboards.LoadPlayerScoreResult
    public final LeaderboardScore getScore() {
        return this.zza;
    }
}
