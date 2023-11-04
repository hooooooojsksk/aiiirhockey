package com.google.android.gms.internal.games;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.games.AnnotatedData;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.GamesMetadataClient;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes2.dex */
public final class zzbb extends zzad implements GamesMetadataClient {
    public static final /* synthetic */ int zza = 0;

    public zzbb(Activity activity, Games.GamesOptions gamesOptions) {
        super(activity, gamesOptions);
    }

    @Override // com.google.android.gms.games.GamesMetadataClient
    public final Task<Game> getCurrentGame() {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.games.zzaz
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                int i = zzbb.zza;
                ((TaskCompletionSource) obj2).setResult(((com.google.android.gms.games.internal.zzbz) obj).zzD());
            }
        }).setMethodKey(6628).build());
    }

    @Override // com.google.android.gms.games.GamesMetadataClient
    public final Task<AnnotatedData<Game>> loadGame() {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.games.zzba
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                int i = zzbb.zza;
                ((com.google.android.gms.games.internal.zzbz) obj).zzan((TaskCompletionSource) obj2);
            }
        }).setMethodKey(6629).build());
    }

    public zzbb(Context context, Games.GamesOptions gamesOptions) {
        super(context, gamesOptions);
    }
}
