package com.google.android.gms.internal.games;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.GameBuffer;
import com.google.android.gms.games.GamesMetadata;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes2.dex */
final class zzbd implements GamesMetadata.LoadGamesResult {
    final /* synthetic */ Status zza;

    public zzbd(zzbf zzbfVar, Status status) {
        this.zza = status;
    }

    @Override // com.google.android.gms.games.GamesMetadata.LoadGamesResult
    public final GameBuffer getGames() {
        return new GameBuffer(DataHolder.empty(14));
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.zza;
    }

    @Override // com.google.android.gms.common.api.Releasable
    public final void release() {
    }
}
