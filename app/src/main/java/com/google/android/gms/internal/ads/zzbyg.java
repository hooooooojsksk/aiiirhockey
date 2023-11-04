package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzbyg extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ zzbyj zza;

    public zzbyg(zzbyj zzbyjVar) {
        this.zza = zzbyjVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.zza.zzn;
        atomicBoolean.set(true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.zza.zzn;
        atomicBoolean.set(false);
    }
}
