package com.google.android.gms.internal.games;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes2.dex */
final class zzdc extends zzdh {
    final /* synthetic */ int zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdc(zzdi zzdiVar, GoogleApiClient googleApiClient, int i) {
        super(googleApiClient);
        this.zza = i;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((com.google.android.gms.games.internal.zzbz) anyClient).zzao(this, this.zza, true, false);
    }
}
