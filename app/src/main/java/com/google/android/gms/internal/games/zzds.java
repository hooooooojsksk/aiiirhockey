package com.google.android.gms.internal.games;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.games.AnnotatedData;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.SnapshotsClient;
import com.google.android.gms.games.snapshot.Snapshot;
import com.google.android.gms.games.snapshot.SnapshotContents;
import com.google.android.gms.games.snapshot.SnapshotMetadata;
import com.google.android.gms.games.snapshot.SnapshotMetadataBuffer;
import com.google.android.gms.games.snapshot.SnapshotMetadataChange;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes2.dex */
public final class zzds extends zzad implements SnapshotsClient {
    public static final /* synthetic */ int zza = 0;

    public zzds(Activity activity, Games.GamesOptions gamesOptions) {
        super(activity, gamesOptions);
    }

    @Override // com.google.android.gms.games.SnapshotsClient
    public final Task<SnapshotMetadata> commitAndClose(final Snapshot snapshot, final SnapshotMetadataChange snapshotMetadataChange) {
        return doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.games.zzdn
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                Snapshot snapshot2 = Snapshot.this;
                SnapshotMetadataChange snapshotMetadataChange2 = snapshotMetadataChange;
                int i = zzds.zza;
                ((com.google.android.gms.games.internal.zzbz) obj).zzP((TaskCompletionSource) obj2, snapshot2, snapshotMetadataChange2);
            }
        }).setMethodKey(6672).build());
    }

    @Override // com.google.android.gms.games.SnapshotsClient
    public final Task<String> delete(final SnapshotMetadata snapshotMetadata) {
        return doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.games.zzdj
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                SnapshotMetadata snapshotMetadata2 = SnapshotMetadata.this;
                int i = zzds.zza;
                ((com.google.android.gms.games.internal.zzbz) obj).zzR((TaskCompletionSource) obj2, snapshotMetadata2.getSnapshotId());
            }
        }).setMethodKey(6674).build());
    }

    @Override // com.google.android.gms.games.SnapshotsClient
    public final Task<Void> discardAndClose(final Snapshot snapshot) {
        return doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.games.zzdq
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                Snapshot snapshot2 = Snapshot.this;
                int i = zzds.zza;
                ((com.google.android.gms.games.internal.zzbz) obj).zzS(snapshot2);
                ((TaskCompletionSource) obj2).setResult(null);
            }
        }).setMethodKey(6673).build());
    }

    @Override // com.google.android.gms.games.SnapshotsClient
    public final Task<Integer> getMaxCoverImageSize() {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.games.zzdo
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                int i = zzds.zza;
                ((TaskCompletionSource) obj2).setResult(Integer.valueOf(((com.google.android.gms.games.internal.zzbz) obj).zzp()));
            }
        }).setMethodKey(6668).build());
    }

    @Override // com.google.android.gms.games.SnapshotsClient
    public final Task<Integer> getMaxDataSize() {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.games.zzdp
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                int i = zzds.zza;
                ((TaskCompletionSource) obj2).setResult(Integer.valueOf(((com.google.android.gms.games.internal.zzbz) obj).zzr()));
            }
        }).setMethodKey(6667).build());
    }

    @Override // com.google.android.gms.games.SnapshotsClient
    public final Task<Intent> getSelectSnapshotIntent(final String str, final boolean z, final boolean z2, final int i) {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.games.zzdk
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                String str2 = str;
                boolean z3 = z;
                boolean z4 = z2;
                int i2 = i;
                int i3 = zzds.zza;
                ((TaskCompletionSource) obj2).setResult(((com.google.android.gms.games.internal.zzbz) obj).zzB(str2, z3, z4, i2));
            }
        }).setMethodKey(6669).build());
    }

    @Override // com.google.android.gms.games.SnapshotsClient
    public final Task<AnnotatedData<SnapshotMetadataBuffer>> load(final boolean z) {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.games.zzdr
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                boolean z2 = z;
                int i = zzds.zza;
                ((com.google.android.gms.games.internal.zzbz) obj).zzaF((TaskCompletionSource) obj2, z2);
            }
        }).setMethodKey(6670).build());
    }

    @Override // com.google.android.gms.games.SnapshotsClient
    public final Task<SnapshotsClient.DataOrConflict<Snapshot>> open(SnapshotMetadata snapshotMetadata) {
        return open(snapshotMetadata.getUniqueName(), false, -1);
    }

    @Override // com.google.android.gms.games.SnapshotsClient
    public final Task<SnapshotsClient.DataOrConflict<Snapshot>> resolveConflict(String str, Snapshot snapshot) {
        SnapshotMetadata metadata = snapshot.getMetadata();
        SnapshotMetadataChange.Builder builder = new SnapshotMetadataChange.Builder();
        builder.fromMetadata(metadata);
        SnapshotMetadataChange build = builder.build();
        return doWrite(TaskApiCall.builder().run(new zzdl(str, metadata.getSnapshotId(), build, snapshot.getSnapshotContents())).setMethodKey(6675).build());
    }

    public zzds(Context context, Games.GamesOptions gamesOptions) {
        super(context, gamesOptions);
    }

    @Override // com.google.android.gms.games.SnapshotsClient
    public final Task<SnapshotsClient.DataOrConflict<Snapshot>> open(SnapshotMetadata snapshotMetadata, int i) {
        return open(snapshotMetadata.getUniqueName(), false, i);
    }

    @Override // com.google.android.gms.games.SnapshotsClient
    public final Task<SnapshotsClient.DataOrConflict<Snapshot>> open(String str, boolean z) {
        return open(str, z, -1);
    }

    @Override // com.google.android.gms.games.SnapshotsClient
    public final Task<SnapshotsClient.DataOrConflict<Snapshot>> open(final String str, final boolean z, final int i) {
        return doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.games.zzdm
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                String str2 = str;
                boolean z2 = z;
                int i2 = i;
                int i3 = zzds.zza;
                ((com.google.android.gms.games.internal.zzbz) obj).zzaJ((TaskCompletionSource) obj2, str2, z2, i2);
            }
        }).setMethodKey(6671).build());
    }

    @Override // com.google.android.gms.games.SnapshotsClient
    public final Task<SnapshotsClient.DataOrConflict<Snapshot>> resolveConflict(String str, String str2, SnapshotMetadataChange snapshotMetadataChange, SnapshotContents snapshotContents) {
        return doWrite(TaskApiCall.builder().run(new zzdl(str, str2, snapshotMetadataChange, snapshotContents)).setMethodKey(6675).build());
    }
}
