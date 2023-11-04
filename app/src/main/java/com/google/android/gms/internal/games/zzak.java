package com.google.android.gms.internal.games;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes2.dex */
final class zzak extends zzaq {
    final /* synthetic */ String zza;
    final /* synthetic */ int zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzak(zzar zzarVar, GoogleApiClient googleApiClient, String str, int i) {
        super(googleApiClient, null);
        this.zza = str;
        this.zzb = i;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((com.google.android.gms.games.internal.zzbz) anyClient).zzab(this.zza, this.zzb);
    }
}
