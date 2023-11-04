package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.snapshot.SnapshotMetadata;
import com.google.android.gms.games.snapshot.SnapshotMetadataBuffer;
import com.google.android.gms.games.snapshot.SnapshotMetadataEntity;
import com.google.android.gms.games.snapshot.Snapshots;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
final class zzah extends zzao implements Snapshots.CommitSnapshotResult {
    private final SnapshotMetadata zza;

    public zzah(DataHolder dataHolder) {
        super(dataHolder);
        SnapshotMetadataBuffer snapshotMetadataBuffer = new SnapshotMetadataBuffer(dataHolder);
        try {
            if (snapshotMetadataBuffer.getCount() > 0) {
                this.zza = new SnapshotMetadataEntity(snapshotMetadataBuffer.get(0));
            } else {
                this.zza = null;
            }
        } finally {
            snapshotMetadataBuffer.release();
        }
    }

    @Override // com.google.android.gms.games.snapshot.Snapshots.CommitSnapshotResult
    public final SnapshotMetadata getSnapshotMetadata() {
        return this.zza;
    }
}
