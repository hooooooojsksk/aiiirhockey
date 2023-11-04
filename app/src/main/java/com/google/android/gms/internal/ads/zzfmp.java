package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.IInterface;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzfmp extends zzfml {
    final /* synthetic */ zzfmv zza;

    public zzfmp(zzfmv zzfmvVar) {
        this.zza = zzfmvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfml
    public final void zza() {
        Object obj;
        AtomicInteger atomicInteger;
        IInterface iInterface;
        zzfmk zzfmkVar;
        Context context;
        ServiceConnection serviceConnection;
        AtomicInteger atomicInteger2;
        zzfmk zzfmkVar2;
        obj = this.zza.zzg;
        synchronized (obj) {
            atomicInteger = this.zza.zzl;
            if (atomicInteger.get() > 0) {
                atomicInteger2 = this.zza.zzl;
                if (atomicInteger2.decrementAndGet() > 0) {
                    zzfmkVar2 = this.zza.zzc;
                    zzfmkVar2.zzc("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
            }
            zzfmv zzfmvVar = this.zza;
            iInterface = zzfmvVar.zzn;
            if (iInterface != null) {
                zzfmkVar = zzfmvVar.zzc;
                zzfmkVar.zzc("Unbind from service.", new Object[0]);
                zzfmv zzfmvVar2 = this.zza;
                context = zzfmvVar2.zzb;
                serviceConnection = zzfmvVar2.zzm;
                context.unbindService(serviceConnection);
                this.zza.zzh = false;
                this.zza.zzn = null;
                this.zza.zzm = null;
            }
            this.zza.zzw();
        }
    }
}
