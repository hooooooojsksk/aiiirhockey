package com.google.android.gms.internal.games;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.snapshot.Snapshot;
import com.google.android.gms.games.snapshot.SnapshotContents;
import com.google.android.gms.games.snapshot.Snapshots;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes2.dex */
final class zzeh implements Snapshots.OpenSnapshotResult {
    final /* synthetic */ Status zza;

    public zzeh(zzej zzejVar, Status status) {
        this.zza = status;
    }

    @Override // com.google.android.gms.games.snapshot.Snapshots.OpenSnapshotResult
    public final String getConflictId() {
        return null;
    }

    @Override // com.google.android.gms.games.snapshot.Snapshots.OpenSnapshotResult
    public final Snapshot getConflictingSnapshot() {
        return null;
    }

    @Override // com.google.android.gms.games.snapshot.Snapshots.OpenSnapshotResult
    public final SnapshotContents getResolutionSnapshotContents() {
        return null;
    }

    @Override // com.google.android.gms.games.snapshot.Snapshots.OpenSnapshotResult
    public final Snapshot getSnapshot() {
        return null;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.zza;
    }
}
