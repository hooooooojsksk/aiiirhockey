package com.google.android.gms.internal.games;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes2.dex */
final class zzs extends zzab {
    final /* synthetic */ String zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzs(zzac zzacVar, String str, GoogleApiClient googleApiClient, String str2) {
        super(str, googleApiClient);
        this.zza = str2;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((com.google.android.gms.games.internal.zzbz) anyClient).zzaZ(null, this.zza);
    }
}
