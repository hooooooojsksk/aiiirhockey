package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.GameBuffer;
import com.google.android.gms.games.GamesMetadata;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
final class zzbb extends zzao implements GamesMetadata.LoadGamesResult {
    private final GameBuffer zza;

    public zzbb(DataHolder dataHolder) {
        super(dataHolder);
        this.zza = new GameBuffer(dataHolder);
    }

    @Override // com.google.android.gms.games.GamesMetadata.LoadGamesResult
    public final GameBuffer getGames() {
        return this.zza;
    }
}
