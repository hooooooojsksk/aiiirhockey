package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzavk implements BaseGmsClient.BaseConnectionCallbacks {
    final /* synthetic */ zzavm zza;

    public zzavk(zzavm zzavmVar) {
        this.zza = zzavmVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        Object obj;
        Object obj2;
        zzavp zzavpVar;
        zzavp zzavpVar2;
        obj = this.zza.zzc;
        synchronized (obj) {
            try {
                zzavm zzavmVar = this.zza;
                zzavpVar = zzavmVar.zzd;
                if (zzavpVar != null) {
                    zzavpVar2 = zzavmVar.zzd;
                    zzavmVar.zzf = zzavpVar2.zzq();
                }
            } catch (DeadObjectException e) {
                zzbza.zzh("Unable to obtain a cache service instance.", e);
                zzavm.zzh(this.zza);
            }
            obj2 = this.zza.zzc;
            obj2.notifyAll();
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        Object obj;
        Object obj2;
        obj = this.zza.zzc;
        synchronized (obj) {
            this.zza.zzf = null;
            obj2 = this.zza.zzc;
            obj2.notifyAll();
        }
    }
}
