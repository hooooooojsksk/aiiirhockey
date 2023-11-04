package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.io.IOException;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzavy implements BaseGmsClient.BaseConnectionCallbacks {
    public static final /* synthetic */ int zzd = 0;
    final /* synthetic */ zzavq zza;
    final /* synthetic */ zzbzs zzb;
    final /* synthetic */ zzawa zzc;

    public zzavy(zzawa zzawaVar, zzavq zzavqVar, zzbzs zzbzsVar) {
        this.zzc = zzawaVar;
        this.zza = zzavqVar;
        this.zzb = zzbzsVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        Object obj;
        boolean z;
        final zzavp zzavpVar;
        obj = this.zzc.zzd;
        synchronized (obj) {
            zzawa zzawaVar = this.zzc;
            z = zzawaVar.zzb;
            if (z) {
                return;
            }
            zzawaVar.zzb = true;
            zzavpVar = this.zzc.zza;
            if (zzavpVar == null) {
                return;
            }
            zzfuu zzfuuVar = zzbzn.zza;
            final zzavq zzavqVar = this.zza;
            final zzbzs zzbzsVar = this.zzb;
            final zzfut zza = zzfuuVar.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzavv
                @Override // java.lang.Runnable
                public final void run() {
                    zzavn zzf;
                    zzavy zzavyVar = zzavy.this;
                    zzavp zzavpVar2 = zzavpVar;
                    zzavq zzavqVar2 = zzavqVar;
                    zzbzs zzbzsVar2 = zzbzsVar;
                    try {
                        zzavs zzq = zzavpVar2.zzq();
                        if (zzavpVar2.zzp()) {
                            zzf = zzq.zzg(zzavqVar2);
                        } else {
                            zzf = zzq.zzf(zzavqVar2);
                        }
                        if (!zzf.zze()) {
                            zzbzsVar2.zze(new RuntimeException("No entry contents."));
                            zzawa.zze(zzavyVar.zzc);
                            return;
                        }
                        zzavx zzavxVar = new zzavx(zzavyVar, zzf.zzc(), 1);
                        int read = zzavxVar.read();
                        if (read == -1) {
                            throw new IOException("Unable to read from cache.");
                        }
                        zzavxVar.unread(read);
                        zzbzsVar2.zzd(zzawc.zzb(zzavxVar, zzf.zzd(), zzf.zzg(), zzf.zza(), zzf.zzf()));
                    } catch (RemoteException | IOException e) {
                        zzbza.zzh("Unable to obtain a cache service instance.", e);
                        zzbzsVar2.zze(e);
                        zzawa.zze(zzavyVar.zzc);
                    }
                }
            });
            final zzbzs zzbzsVar2 = this.zzb;
            zzbzsVar2.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzavw
                @Override // java.lang.Runnable
                public final void run() {
                    zzbzs zzbzsVar3 = zzbzs.this;
                    Future future = zza;
                    int i = zzavy.zzd;
                    if (zzbzsVar3.isCancelled()) {
                        future.cancel(true);
                    }
                }
            }, zzbzn.zzf);
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
    }
}
