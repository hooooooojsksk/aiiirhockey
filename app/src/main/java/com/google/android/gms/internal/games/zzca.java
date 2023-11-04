package com.google.android.gms.internal.games;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes2.dex */
final class zzca extends zzcl {
    final /* synthetic */ String zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ String zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzca(zzcm zzcmVar, GoogleApiClient googleApiClient, String str, long j, String str2) {
        super(googleApiClient);
        this.zza = str;
        this.zzb = j;
        this.zzc = str2;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((com.google.android.gms.games.internal.zzbz) anyClient).zzaX(this, this.zza, this.zzb, this.zzc);
    }
}
