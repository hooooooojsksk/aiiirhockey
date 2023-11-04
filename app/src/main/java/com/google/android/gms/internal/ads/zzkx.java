package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzkx extends BroadcastReceiver {
    final /* synthetic */ zzky zza;

    public /* synthetic */ zzkx(zzky zzkyVar, zzkw zzkwVar) {
        this.zza = zzkyVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Handler handler;
        final zzky zzkyVar = this.zza;
        handler = zzkyVar.zzb;
        handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkv
            @Override // java.lang.Runnable
            public final void run() {
                zzky.zzd(zzky.this);
            }
        });
    }
}
