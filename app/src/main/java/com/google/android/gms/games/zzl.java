package com.google.android.gms.games;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.internal.zzbz;
import com.google.android.gms.games.internal.zzcg;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public class zzl extends Api.AbstractClientBuilder {
    public /* synthetic */ zzl(zzk zzkVar) {
    }

    @Override // com.google.android.gms.common.api.Api.AbstractClientBuilder
    public final /* bridge */ /* synthetic */ Api.Client buildClient(Context context, Looper looper, ClientSettings clientSettings, Object obj, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Games.GamesOptions gamesOptions = (Games.GamesOptions) obj;
        if (gamesOptions == null) {
            gamesOptions = new Games.GamesOptions.Builder(null).build();
        }
        return new zzbz(context, looper, clientSettings, gamesOptions, connectionCallbacks, onConnectionFailedListener, zzcg.zza());
    }

    @Override // com.google.android.gms.common.api.Api.BaseClientBuilder
    public final int getPriority() {
        return 1;
    }
}
