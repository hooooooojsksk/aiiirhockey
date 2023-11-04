package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.games.VideosClient;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public final class zzn extends zzaw {
    public zzn(ListenerHolder listenerHolder) {
        super(listenerHolder);
    }

    @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzcb
    public final void zzd(final int i) {
        zzw(new zzbq() { // from class: com.google.android.gms.games.internal.zzm
            @Override // com.google.android.gms.games.internal.zzbq
            public final void zza(Object obj) {
                ((VideosClient.OnCaptureOverlayStateListener) obj).onCaptureOverlayStateChanged(i);
            }
        });
    }
}
