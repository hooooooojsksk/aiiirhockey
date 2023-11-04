package com.google.android.gms.internal.games;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.event.EventBuffer;
import com.google.android.gms.games.event.Events;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes2.dex */
final class zzal implements Events.LoadEventsResult {
    final /* synthetic */ Status zza;

    public zzal(zzan zzanVar, Status status) {
        this.zza = status;
    }

    @Override // com.google.android.gms.games.event.Events.LoadEventsResult
    public final EventBuffer getEvents() {
        return new EventBuffer(DataHolder.empty(14));
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.zza;
    }

    @Override // com.google.android.gms.common.api.Releasable
    public final void release() {
    }
}
