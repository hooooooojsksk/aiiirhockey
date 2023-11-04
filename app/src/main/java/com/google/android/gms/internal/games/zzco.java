package com.google.android.gms.internal.games;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.games.AnnotatedData;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.PlayerStatsClient;
import com.google.android.gms.games.stats.PlayerStats;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes2.dex */
public final class zzco extends zzad implements PlayerStatsClient {
    public static final /* synthetic */ int zza = 0;

    public zzco(Activity activity, Games.GamesOptions gamesOptions) {
        super(activity, gamesOptions);
    }

    @Override // com.google.android.gms.games.PlayerStatsClient
    public final Task<AnnotatedData<PlayerStats>> loadPlayerStats(final boolean z) {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.games.zzcn
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                boolean z2 = z;
                int i = zzco.zza;
                ((com.google.android.gms.games.internal.zzbz) obj).zzaB((TaskCompletionSource) obj2, z2);
            }
        }).setMethodKey(6639).build());
    }

    public zzco(Context context, Games.GamesOptions gamesOptions) {
        super(context, gamesOptions);
    }
}
