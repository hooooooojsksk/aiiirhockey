package com.google.android.gms.internal.games;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes2.dex */
final class zzbz extends zzcj {
    final /* synthetic */ LeaderboardScoreBuffer zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbz(zzcm zzcmVar, GoogleApiClient googleApiClient, LeaderboardScoreBuffer leaderboardScoreBuffer, int i, int i2) {
        super(googleApiClient, null);
        this.zza = leaderboardScoreBuffer;
        this.zzb = i;
        this.zzc = i2;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((com.google.android.gms.games.internal.zzbz) anyClient).zzat(this, this.zza, this.zzb, this.zzc);
    }
}
