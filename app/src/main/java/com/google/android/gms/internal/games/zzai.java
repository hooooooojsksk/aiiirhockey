package com.google.android.gms.internal.games;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes2.dex */
final class zzai extends zzan {
    final /* synthetic */ boolean zza;
    final /* synthetic */ String[] zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzai(zzar zzarVar, GoogleApiClient googleApiClient, boolean z, String[] strArr) {
        super(googleApiClient, null);
        this.zza = z;
        this.zzb = strArr;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((com.google.android.gms.games.internal.zzbz) anyClient).zzak(this, this.zza, this.zzb);
    }
}
