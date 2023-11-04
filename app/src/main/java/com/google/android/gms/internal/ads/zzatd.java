package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzatd extends BroadcastReceiver {
    final /* synthetic */ zzatg zza;

    public zzatd(zzatg zzatgVar) {
        this.zza = zzatgVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.zza.zzj(3);
    }
}
