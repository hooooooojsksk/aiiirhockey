package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.event.EventBuffer;
import com.google.android.gms.games.event.Events;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
final class zzba extends zzao implements Events.LoadEventsResult {
    private final EventBuffer zza;

    public zzba(DataHolder dataHolder) {
        super(dataHolder);
        this.zza = new EventBuffer(dataHolder);
    }

    @Override // com.google.android.gms.games.event.Events.LoadEventsResult
    public final EventBuffer getEvents() {
        return this.zza;
    }
}
