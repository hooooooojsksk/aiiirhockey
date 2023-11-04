package com.google.android.gms.internal.games;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.VideosClient;
import com.google.android.gms.games.video.CaptureState;
import com.google.android.gms.games.video.VideoCapabilities;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes2.dex */
public final class zzex extends zzad implements VideosClient {
    public static final /* synthetic */ int zza = 0;

    public zzex(Activity activity, Games.GamesOptions gamesOptions) {
        super(activity, gamesOptions);
    }

    @Override // com.google.android.gms.games.VideosClient
    public final Task<VideoCapabilities> getCaptureCapabilities() {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.games.zzeu
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                int i = zzex.zza;
                ((com.google.android.gms.games.internal.zzbz) obj).zzV((TaskCompletionSource) obj2);
            }
        }).setMethodKey(6677).build());
    }

    @Override // com.google.android.gms.games.VideosClient
    public final Task<Intent> getCaptureOverlayIntent() {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.games.zzer
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                int i = zzex.zza;
                ((TaskCompletionSource) obj2).setResult(((com.google.android.gms.games.internal.zzbz) obj).zzv());
            }
        }).setMethodKey(6678).build());
    }

    @Override // com.google.android.gms.games.VideosClient
    public final Task<CaptureState> getCaptureState() {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.games.zzew
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                int i = zzex.zza;
                ((com.google.android.gms.games.internal.zzbz) obj).zzX((TaskCompletionSource) obj2);
            }
        }).setMethodKey(6679).build());
    }

    @Override // com.google.android.gms.games.VideosClient
    public final Task<Boolean> isCaptureAvailable(final int i) {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.games.zzev
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                int i2 = i;
                int i3 = zzex.zza;
                ((com.google.android.gms.games.internal.zzbz) obj).zzad((TaskCompletionSource) obj2, i2);
            }
        }).setMethodKey(6680).build());
    }

    @Override // com.google.android.gms.games.VideosClient
    public final Task<Boolean> isCaptureSupported() {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.games.zzeq
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                int i = zzex.zza;
                ((TaskCompletionSource) obj2).setResult(Boolean.valueOf(((com.google.android.gms.games.internal.zzbz) obj).zzbd()));
            }
        }).setMethodKey(6681).build());
    }

    @Override // com.google.android.gms.games.VideosClient
    public final Task<Void> registerOnCaptureOverlayStateChangedListener(VideosClient.OnCaptureOverlayStateListener onCaptureOverlayStateListener) {
        final ListenerHolder registerListener = registerListener(onCaptureOverlayStateListener, VideosClient.OnCaptureOverlayStateListener.class.getSimpleName());
        Preconditions.checkNotNull(registerListener.getListenerKey(), "Key must not be null");
        RemoteCall remoteCall = new RemoteCall() { // from class: com.google.android.gms.internal.games.zzes
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                ListenerHolder listenerHolder = ListenerHolder.this;
                int i = zzex.zza;
                ((com.google.android.gms.games.internal.zzbz) obj).zzaL(listenerHolder);
                ((TaskCompletionSource) obj2).setResult(null);
            }
        };
        return doRegisterEventListener(RegistrationMethods.builder().register(remoteCall).unregister(new RemoteCall() { // from class: com.google.android.gms.internal.games.zzet
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                int i = zzex.zza;
                ((com.google.android.gms.games.internal.zzbz) obj).zzbb();
                ((TaskCompletionSource) obj2).setResult(true);
            }
        }).withHolder(registerListener).setMethodKey(6682).build());
    }

    @Override // com.google.android.gms.games.VideosClient
    public final Task<Boolean> unregisterOnCaptureOverlayStateChangedListener(VideosClient.OnCaptureOverlayStateListener onCaptureOverlayStateListener) {
        return doUnregisterEventListener(ListenerHolders.createListenerKey(onCaptureOverlayStateListener, VideosClient.OnCaptureOverlayStateListener.class.getSimpleName()), 6683);
    }

    public zzex(Context context, Games.GamesOptions gamesOptions) {
        super(context, gamesOptions);
    }
}
