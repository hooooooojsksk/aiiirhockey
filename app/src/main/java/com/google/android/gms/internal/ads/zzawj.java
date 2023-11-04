package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzawj {
    final /* synthetic */ zzawk zza;
    private final byte[] zzb;
    private int zzc;

    public /* synthetic */ zzawj(zzawk zzawkVar, byte[] bArr, zzawi zzawiVar) {
        this.zza = zzawkVar;
        this.zzb = bArr;
    }

    public final synchronized void zzd() {
        try {
            zzawk zzawkVar = this.zza;
            if (zzawkVar.zzb) {
                zzawkVar.zza.zzj(this.zzb);
                this.zza.zza.zzi(0);
                this.zza.zza.zzg(this.zzc);
                this.zza.zza.zzh(null);
                this.zza.zza.zzf();
            }
        } catch (RemoteException e) {
            zzbza.zzf("Clearcut log failed", e);
        }
    }

    public final zzawj zza(int i) {
        this.zzc = i;
        return this;
    }

    public final synchronized void zzc() {
        ExecutorService executorService;
        executorService = this.zza.zzc;
        executorService.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzawh
            @Override // java.lang.Runnable
            public final void run() {
                zzawj.this.zzd();
            }
        });
    }
}
