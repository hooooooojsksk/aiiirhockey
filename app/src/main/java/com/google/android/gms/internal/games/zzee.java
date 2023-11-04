package com.google.android.gms.internal.games;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.snapshot.SnapshotMetadataBuffer;
import com.google.android.gms.games.snapshot.Snapshots;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes2.dex */
final class zzee implements Snapshots.LoadSnapshotsResult {
    final /* synthetic */ Status zza;

    public zzee(zzeg zzegVar, Status status) {
        this.zza = status;
    }

    @Override // com.google.android.gms.games.snapshot.Snapshots.LoadSnapshotsResult
    public final SnapshotMetadataBuffer getSnapshots() {
        return new SnapshotMetadataBuffer(DataHolder.empty(14));
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.zza;
    }

    @Override // com.google.android.gms.common.api.Releasable
    public final void release() {
    }
}
