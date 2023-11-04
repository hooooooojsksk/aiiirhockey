package com.google.android.gms.internal.games;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes2.dex */
final class zzdf extends zzdh {
    final /* synthetic */ boolean zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdf(zzdi zzdiVar, GoogleApiClient googleApiClient, boolean z) {
        super(googleApiClient);
        this.zza = z;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((com.google.android.gms.games.internal.zzbz) anyClient).zzag(this, this.zza);
    }
}
