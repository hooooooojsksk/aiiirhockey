package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.PlayerBuffer;
import com.google.android.gms.games.Players;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
final class zzbe extends zzao implements Players.LoadPlayersResult {
    private final PlayerBuffer zza;

    public zzbe(DataHolder dataHolder) {
        super(dataHolder);
        this.zza = new PlayerBuffer(dataHolder);
    }

    @Override // com.google.android.gms.games.Players.LoadPlayersResult
    public final PlayerBuffer getPlayers() {
        return this.zza;
    }
}
