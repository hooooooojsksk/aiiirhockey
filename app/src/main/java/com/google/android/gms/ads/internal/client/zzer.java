package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbza;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* loaded from: classes.dex */
public final class zzer implements Runnable {
    final /* synthetic */ zzet zza;

    public zzer(zzet zzetVar) {
        this.zza = zzetVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbh zzbhVar;
        zzbh zzbhVar2;
        zzeu zzeuVar = this.zza.zza;
        zzbhVar = zzeuVar.zza;
        if (zzbhVar != null) {
            try {
                zzbhVar2 = zzeuVar.zza;
                zzbhVar2.zze(1);
            } catch (RemoteException e) {
                zzbza.zzk("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
