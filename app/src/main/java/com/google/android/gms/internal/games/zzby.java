package com.google.android.gms.internal.games;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes2.dex */
final class zzby extends zzcj {
    final /* synthetic */ String zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ int zzd;
    final /* synthetic */ boolean zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzby(zzcm zzcmVar, GoogleApiClient googleApiClient, String str, int i, int i2, int i3, boolean z) {
        super(googleApiClient, null);
        this.zza = str;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = i3;
        this.zze = z;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((com.google.android.gms.games.internal.zzbz) anyClient).zzax(this, this.zza, this.zzb, this.zzc, this.zzd, this.zze);
    }
}
