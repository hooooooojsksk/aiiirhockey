package com.google.android.gms.internal.games;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.games.snapshot.SnapshotMetadata;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes2.dex */
final class zzdw extends zzed {
    final /* synthetic */ SnapshotMetadata zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdw(zzek zzekVar, GoogleApiClient googleApiClient, SnapshotMetadata snapshotMetadata) {
        super(googleApiClient, null);
        this.zza = snapshotMetadata;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((com.google.android.gms.games.internal.zzbz) anyClient).zzQ(this, this.zza.getSnapshotId());
    }
}
