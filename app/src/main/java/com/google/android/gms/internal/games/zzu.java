package com.google.android.gms.internal.games;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes2.dex */
final class zzu extends zzab {
    final /* synthetic */ String zza;
    final /* synthetic */ int zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzu(zzac zzacVar, String str, GoogleApiClient googleApiClient, String str2, int i) {
        super(str, googleApiClient);
        this.zza = str2;
        this.zzb = i;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((com.google.android.gms.games.internal.zzbz) anyClient).zzZ(null, this.zza, this.zzb);
    }
}
