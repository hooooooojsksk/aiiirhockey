package com.google.android.gms.internal.games;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.snapshot.SnapshotMetadata;
import com.google.android.gms.games.snapshot.Snapshots;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes2.dex */
final class zzdy implements Snapshots.CommitSnapshotResult {
    final /* synthetic */ Status zza;

    public zzdy(zzea zzeaVar, Status status) {
        this.zza = status;
    }

    @Override // com.google.android.gms.games.snapshot.Snapshots.CommitSnapshotResult
    public final SnapshotMetadata getSnapshotMetadata() {
        return null;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.zza;
    }
}
