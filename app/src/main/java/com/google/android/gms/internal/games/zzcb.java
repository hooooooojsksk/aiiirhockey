package com.google.android.gms.internal.games;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.leaderboard.LeaderboardBuffer;
import com.google.android.gms.games.leaderboard.Leaderboards;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes2.dex */
final class zzcb implements Leaderboards.LeaderboardMetadataResult {
    final /* synthetic */ Status zza;

    public zzcb(zzcd zzcdVar, Status status) {
        this.zza = status;
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboards.LeaderboardMetadataResult
    public final LeaderboardBuffer getLeaderboards() {
        return new LeaderboardBuffer(DataHolder.empty(14));
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.zza;
    }

    @Override // com.google.android.gms.common.api.Releasable
    public final void release() {
    }
}
