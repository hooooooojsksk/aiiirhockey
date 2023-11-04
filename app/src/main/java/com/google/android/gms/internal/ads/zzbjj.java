package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzbjj implements BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzbzs zza;

    public zzbjj(zzbjk zzbjkVar, zzbzs zzbzsVar) {
        this.zza = zzbzsVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        this.zza.zze(new RuntimeException("Connection failed."));
    }
}
