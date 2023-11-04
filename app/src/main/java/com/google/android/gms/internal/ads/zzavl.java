package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzavl implements BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzavm zza;

    public zzavl(zzavm zzavmVar) {
        this.zza = zzavmVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        Object obj;
        zzavp zzavpVar;
        Object obj2;
        obj = this.zza.zzc;
        synchronized (obj) {
            this.zza.zzf = null;
            zzavm zzavmVar = this.zza;
            zzavpVar = zzavmVar.zzd;
            if (zzavpVar != null) {
                zzavmVar.zzd = null;
            }
            obj2 = this.zza.zzc;
            obj2.notifyAll();
        }
    }
}
