package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public class zzaw extends zza {
    private final ListenerHolder zza;

    public zzaw(ListenerHolder listenerHolder) {
        this.zza = (ListenerHolder) Preconditions.checkNotNull(listenerHolder, "Callback must not be null");
    }

    public final void zzw(zzbq zzbqVar) {
        ListenerHolder listenerHolder = this.zza;
        int i = zzbz.zze;
        listenerHolder.notifyListener(new zzr(zzbqVar));
    }
}
