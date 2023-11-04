package com.google.android.gms.internal.games;

import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer;
import com.google.android.gms.games.leaderboard.Leaderboards;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes2.dex */
public final class zzcm implements Leaderboards {
    @Override // com.google.android.gms.games.leaderboard.Leaderboards
    public final Intent getAllLeaderboardsIntent(GoogleApiClient googleApiClient) {
        return Games.zzd(googleApiClient, true).zzu();
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboards
    public final Intent getLeaderboardIntent(GoogleApiClient googleApiClient, String str) {
        return Games.zzd(googleApiClient, true).zzy(str, -1, -1);
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboards
    public final PendingResult<Leaderboards.LoadPlayerScoreResult> loadCurrentPlayerLeaderboardScore(GoogleApiClient googleApiClient, String str, int i, int i2) {
        return googleApiClient.enqueue(new zzbw(this, googleApiClient, str, i, i2));
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboards
    public final PendingResult<Leaderboards.LeaderboardMetadataResult> loadLeaderboardMetadata(GoogleApiClient googleApiClient, String str, boolean z) {
        return googleApiClient.enqueue(new zzbv(this, googleApiClient, str, z));
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboards
    public final PendingResult<Leaderboards.LoadScoresResult> loadMoreScores(GoogleApiClient googleApiClient, LeaderboardScoreBuffer leaderboardScoreBuffer, int i, int i2) {
        return googleApiClient.enqueue(new zzbz(this, googleApiClient, leaderboardScoreBuffer, i, i2));
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboards
    public final PendingResult<Leaderboards.LoadScoresResult> loadPlayerCenteredScores(GoogleApiClient googleApiClient, String str, int i, int i2, int i3) {
        return googleApiClient.enqueue(new zzby(this, googleApiClient, str, i, i2, i3, false));
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboards
    public final PendingResult<Leaderboards.LoadScoresResult> loadTopScores(GoogleApiClient googleApiClient, String str, int i, int i2, int i3) {
        return googleApiClient.enqueue(new zzbx(this, googleApiClient, str, i, i2, i3, false));
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboards
    public final void submitScore(GoogleApiClient googleApiClient, String str, long j) {
        com.google.android.gms.games.internal.zzbz zzd = Games.zzd(googleApiClient, false);
        if (zzd != null) {
            try {
                zzd.zzaX(null, str, j, null);
            } catch (RemoteException unused) {
                zzft.zzd("LeaderboardsImpl", "service died");
            }
        }
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboards
    public final PendingResult<Leaderboards.SubmitScoreResult> submitScoreImmediate(GoogleApiClient googleApiClient, String str, long j) {
        return googleApiClient.execute(new zzca(this, googleApiClient, str, j, null));
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboards
    public final PendingResult<Leaderboards.LeaderboardMetadataResult> loadLeaderboardMetadata(GoogleApiClient googleApiClient, boolean z) {
        return googleApiClient.enqueue(new zzbu(this, googleApiClient, z));
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboards
    public final PendingResult<Leaderboards.LoadScoresResult> loadPlayerCenteredScores(GoogleApiClient googleApiClient, String str, int i, int i2, int i3, boolean z) {
        return googleApiClient.enqueue(new zzby(this, googleApiClient, str, i, i2, i3, z));
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboards
    public final PendingResult<Leaderboards.LoadScoresResult> loadTopScores(GoogleApiClient googleApiClient, String str, int i, int i2, int i3, boolean z) {
        return googleApiClient.enqueue(new zzbx(this, googleApiClient, str, i, i2, i3, z));
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboards
    public final PendingResult<Leaderboards.SubmitScoreResult> submitScoreImmediate(GoogleApiClient googleApiClient, String str, long j, String str2) {
        return googleApiClient.execute(new zzca(this, googleApiClient, str, j, str2));
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboards
    public final Intent getLeaderboardIntent(GoogleApiClient googleApiClient, String str, int i) {
        return Games.zzd(googleApiClient, true).zzy(str, i, -1);
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboards
    public final void submitScore(GoogleApiClient googleApiClient, String str, long j, String str2) {
        com.google.android.gms.games.internal.zzbz zzd = Games.zzd(googleApiClient, false);
        if (zzd != null) {
            try {
                zzd.zzaX(null, str, j, str2);
            } catch (RemoteException unused) {
                zzft.zzd("LeaderboardsImpl", "service died");
            }
        }
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboards
    public final Intent getLeaderboardIntent(GoogleApiClient googleApiClient, String str, int i, int i2) {
        return Games.zzd(googleApiClient, true).zzy(str, i, i2);
    }
}
