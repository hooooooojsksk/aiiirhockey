package com.google.android.gms.internal.games;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes2.dex */
public final class zzdu extends zzej {
    final /* synthetic */ String zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdu(zzek zzekVar, GoogleApiClient googleApiClient, String str, boolean z, int i) {
        super(googleApiClient, null);
        this.zza = str;
        this.zzb = z;
        this.zzc = i;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((com.google.android.gms.games.internal.zzbz) anyClient).zzaI(this, this.zza, this.zzb, this.zzc);
    }
}
