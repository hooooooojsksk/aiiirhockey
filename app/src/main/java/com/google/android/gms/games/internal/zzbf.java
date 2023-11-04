package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.leaderboard.Leaderboard;
import com.google.android.gms.games.leaderboard.LeaderboardBuffer;
import com.google.android.gms.games.leaderboard.LeaderboardEntity;
import com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer;
import com.google.android.gms.games.leaderboard.Leaderboards;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
final class zzbf extends zzao implements Leaderboards.LoadScoresResult {
    private final LeaderboardEntity zza;
    private final LeaderboardScoreBuffer zzb;

    public zzbf(DataHolder dataHolder, DataHolder dataHolder2) {
        super(dataHolder2);
        LeaderboardBuffer leaderboardBuffer = new LeaderboardBuffer(dataHolder);
        try {
            if (leaderboardBuffer.getCount() > 0) {
                this.zza = (LeaderboardEntity) leaderboardBuffer.get(0).freeze();
            } else {
                this.zza = null;
            }
            leaderboardBuffer.release();
            this.zzb = new LeaderboardScoreBuffer(dataHolder2);
        } catch (Throwable th) {
            leaderboardBuffer.release();
            throw th;
        }
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboards.LoadScoresResult
    public final Leaderboard getLeaderboard() {
        return this.zza;
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboards.LoadScoresResult
    public final LeaderboardScoreBuffer getScores() {
        return this.zzb;
    }
}
