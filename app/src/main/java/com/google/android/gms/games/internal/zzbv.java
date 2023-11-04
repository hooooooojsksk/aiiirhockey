package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.games.GamesStatusCodes;
import com.google.android.gms.games.GamesStatusUtils;
import com.google.android.gms.games.SnapshotsClient;
import com.google.android.gms.games.snapshot.SnapshotContentsEntity;
import com.google.android.gms.games.snapshot.SnapshotEntity;
import com.google.android.gms.games.snapshot.SnapshotMetadataBuffer;
import com.google.android.gms.games.snapshot.SnapshotMetadataEntity;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public final class zzbv extends zza {
    private final TaskCompletionSource zza;

    public zzbv(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzcb
    public final void zzq(DataHolder dataHolder, String str, Contents contents, Contents contents2, Contents contents3) {
        SnapshotMetadataBuffer snapshotMetadataBuffer = new SnapshotMetadataBuffer(dataHolder);
        try {
            if (snapshotMetadataBuffer.getCount() >= 2 && str != null && contents3 != null) {
                SnapshotEntity snapshotEntity = new SnapshotEntity(new SnapshotMetadataEntity(snapshotMetadataBuffer.get(0)), new SnapshotContentsEntity(contents));
                SnapshotEntity snapshotEntity2 = new SnapshotEntity(new SnapshotMetadataEntity(snapshotMetadataBuffer.get(1)), new SnapshotContentsEntity(contents2));
                snapshotMetadataBuffer.close();
                this.zza.setResult(new SnapshotsClient.DataOrConflict(null, new SnapshotsClient.SnapshotConflict(snapshotEntity, str, snapshotEntity2, new SnapshotContentsEntity(contents3))));
                return;
            }
            this.zza.setResult(null);
            snapshotMetadataBuffer.close();
        } catch (Throwable th) {
            try {
                snapshotMetadataBuffer.close();
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzcb
    public final void zzs(DataHolder dataHolder, Contents contents) {
        int statusCode = dataHolder.getStatusCode();
        SnapshotMetadataBuffer snapshotMetadataBuffer = new SnapshotMetadataBuffer(dataHolder);
        try {
            SnapshotEntity snapshotEntity = snapshotMetadataBuffer.getCount() > 0 ? new SnapshotEntity(new SnapshotMetadataEntity(snapshotMetadataBuffer.get(0)), new SnapshotContentsEntity(contents)) : null;
            snapshotMetadataBuffer.close();
            if (statusCode == 0) {
                this.zza.setResult(new SnapshotsClient.DataOrConflict(snapshotEntity, null));
                return;
            }
            if (statusCode == 4002) {
                if (snapshotEntity != null && snapshotEntity.getMetadata() != null) {
                    this.zza.setException(new SnapshotsClient.SnapshotContentUnavailableApiException(GamesStatusCodes.zza(GamesStatusCodes.STATUS_SNAPSHOT_CONTENTS_UNAVAILABLE), snapshotEntity.getMetadata()));
                    return;
                }
                statusCode = GamesStatusCodes.STATUS_SNAPSHOT_CONTENTS_UNAVAILABLE;
            }
            GamesStatusUtils.zza(this.zza, statusCode);
        } catch (Throwable th) {
            try {
                snapshotMetadataBuffer.close();
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
            }
            throw th;
        }
    }
}
