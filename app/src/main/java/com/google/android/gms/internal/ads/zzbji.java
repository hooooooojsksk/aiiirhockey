package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzbji implements BaseGmsClient.BaseConnectionCallbacks {
    final /* synthetic */ zzbzs zza;
    final /* synthetic */ zzbjk zzb;

    public zzbji(zzbjk zzbjkVar, zzbzs zzbzsVar) {
        this.zzb = zzbjkVar;
        this.zza = zzbzsVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzbix zzbixVar;
        try {
            zzbzs zzbzsVar = this.zza;
            zzbixVar = this.zzb.zza;
            zzbzsVar.zzd(zzbixVar.zzp());
        } catch (DeadObjectException e) {
            this.zza.zze(e);
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        zzbzs zzbzsVar = this.zza;
        zzbzsVar.zze(new RuntimeException("onConnectionSuspended: " + i));
    }
}
