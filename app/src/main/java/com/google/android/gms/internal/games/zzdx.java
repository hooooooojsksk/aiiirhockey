package com.google.android.gms.internal.games;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.games.snapshot.SnapshotContents;
import com.google.android.gms.games.snapshot.SnapshotMetadataChange;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes2.dex */
final class zzdx extends zzej {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ SnapshotMetadataChange zzc;
    final /* synthetic */ SnapshotContents zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdx(zzek zzekVar, GoogleApiClient googleApiClient, String str, String str2, SnapshotMetadataChange snapshotMetadataChange, SnapshotContents snapshotContents) {
        super(googleApiClient, null);
        this.zza = str;
        this.zzb = str2;
        this.zzc = snapshotMetadataChange;
        this.zzd = snapshotContents;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((com.google.android.gms.games.internal.zzbz) anyClient).zzaM(this, this.zza, this.zzb, this.zzc, this.zzd);
    }
}
