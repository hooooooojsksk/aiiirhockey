package com.google.android.gms.internal.games;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.games.snapshot.Snapshot;
import com.google.android.gms.games.snapshot.SnapshotMetadataChange;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes2.dex */
final class zzdv extends zzea {
    final /* synthetic */ Snapshot zza;
    final /* synthetic */ SnapshotMetadataChange zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdv(zzek zzekVar, GoogleApiClient googleApiClient, Snapshot snapshot, SnapshotMetadataChange snapshotMetadataChange) {
        super(googleApiClient, null);
        this.zza = snapshot;
        this.zzb = snapshotMetadataChange;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((com.google.android.gms.games.internal.zzbz) anyClient).zzO(this, this.zza, this.zzb);
    }
}
