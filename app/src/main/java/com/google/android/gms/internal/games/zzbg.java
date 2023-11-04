package com.google.android.gms.internal.games;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.GamesMetadata;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes2.dex */
public final class zzbg implements GamesMetadata {
    @Override // com.google.android.gms.games.GamesMetadata
    public final Game getCurrentGame(GoogleApiClient googleApiClient) {
        return Games.zzd(googleApiClient, true).zzE();
    }

    @Override // com.google.android.gms.games.GamesMetadata
    public final PendingResult<GamesMetadata.LoadGamesResult> loadGame(GoogleApiClient googleApiClient) {
        return googleApiClient.enqueue(new zzbc(this, googleApiClient));
    }
}
