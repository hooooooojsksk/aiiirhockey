package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.leaderboard.LeaderboardBuffer;
import com.google.android.gms.games.leaderboard.Leaderboards;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
final class zzaq extends zzao implements Leaderboards.LeaderboardMetadataResult {
    private final LeaderboardBuffer zza;

    public zzaq(DataHolder dataHolder) {
        super(dataHolder);
        this.zza = new LeaderboardBuffer(dataHolder);
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboards.LeaderboardMetadataResult
    public final LeaderboardBuffer getLeaderboards() {
        return this.zza;
    }
}
