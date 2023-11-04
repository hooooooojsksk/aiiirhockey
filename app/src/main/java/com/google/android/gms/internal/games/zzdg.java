package com.google.android.gms.internal.games;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.PlayerBuffer;
import com.google.android.gms.games.Players;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes2.dex */
final class zzdg implements Players.LoadPlayersResult {
    final /* synthetic */ Status zza;

    public zzdg(zzdh zzdhVar, Status status) {
        this.zza = status;
    }

    @Override // com.google.android.gms.games.Players.LoadPlayersResult
    public final PlayerBuffer getPlayers() {
        return new PlayerBuffer(DataHolder.empty(14));
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.zza;
    }

    @Override // com.google.android.gms.common.api.Releasable
    public final void release() {
    }
}
