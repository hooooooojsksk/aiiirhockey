package com.google.android.gms.internal.games;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes2.dex */
final class zzdd extends zzdh {
    final /* synthetic */ int zza;
    final /* synthetic */ boolean zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdd(zzdi zzdiVar, GoogleApiClient googleApiClient, int i, boolean z) {
        super(googleApiClient);
        this.zza = i;
        this.zzb = z;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((com.google.android.gms.games.internal.zzbz) anyClient).zzaC(this, "played_with", this.zza, false, this.zzb);
    }
}
