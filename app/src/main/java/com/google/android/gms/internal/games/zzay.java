package com.google.android.gms.internal.games;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.GamesClient;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes2.dex */
public final class zzay extends zzad implements GamesClient {
    public static final /* synthetic */ int zza = 0;

    public zzay(Activity activity, Games.GamesOptions gamesOptions) {
        super(activity, gamesOptions);
    }

    @Override // com.google.android.gms.games.GamesClient
    public final Task<Bundle> getActivationHint() {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.games.zzav
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                com.google.android.gms.games.internal.zzbz zzbzVar = (com.google.android.gms.games.internal.zzbz) obj;
                int i = zzay.zza;
                ((TaskCompletionSource) obj2).setResult(null);
            }
        }).setMethodKey(6622).build());
    }

    @Override // com.google.android.gms.games.GamesClient
    public final Task<String> getAppId() {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.games.zzaw
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                int i = zzay.zza;
                ((TaskCompletionSource) obj2).setResult(((com.google.android.gms.games.internal.zzce) ((com.google.android.gms.games.internal.zzbz) obj).getService()).zzr());
            }
        }).setMethodKey(6620).build());
    }

    @Override // com.google.android.gms.games.GamesClient
    public final Task<String> getCurrentAccountName() {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.games.zzax
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                int i = zzay.zza;
                ((TaskCompletionSource) obj2).setResult(((com.google.android.gms.games.internal.zzbz) obj).zzH());
            }
        }).setMethodKey(6618).build());
    }

    @Override // com.google.android.gms.games.GamesClient
    public final Task<Intent> getSettingsIntent() {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.games.zzat
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                int i = zzay.zza;
                ((TaskCompletionSource) obj2).setResult(((com.google.android.gms.games.internal.zzce) ((com.google.android.gms.games.internal.zzbz) obj).getService()).zzn());
            }
        }).setMethodKey(6621).build());
    }

    @Override // com.google.android.gms.games.GamesClient
    public final Task<Void> setGravityForPopups(final int i) {
        return doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.games.zzas
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                int i2 = i;
                int i3 = zzay.zza;
                ((com.google.android.gms.games.internal.zzbz) obj).zzaS(i2);
                ((TaskCompletionSource) obj2).setResult(null);
            }
        }).setMethodKey(6616).build());
    }

    @Override // com.google.android.gms.games.GamesClient
    public final Task<Void> setViewForPopups(final View view) {
        return doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.games.zzau
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                View view2 = view;
                int i = zzay.zza;
                ((com.google.android.gms.games.internal.zzbz) obj).zzaT(view2);
                ((TaskCompletionSource) obj2).setResult(null);
            }
        }).setMethodKey(6617).build());
    }

    public zzay(Context context, Games.GamesOptions gamesOptions) {
        super(context, gamesOptions);
    }
}
