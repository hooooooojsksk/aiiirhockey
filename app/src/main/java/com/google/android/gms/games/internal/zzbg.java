package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.snapshot.SnapshotMetadataBuffer;
import com.google.android.gms.games.snapshot.Snapshots;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
final class zzbg extends zzao implements Snapshots.LoadSnapshotsResult {
    public zzbg(DataHolder dataHolder) {
        super(dataHolder);
    }

    @Override // com.google.android.gms.games.snapshot.Snapshots.LoadSnapshotsResult
    public final SnapshotMetadataBuffer getSnapshots() {
        return new SnapshotMetadataBuffer(this.mDataHolder);
    }
}
