package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzfmu implements ServiceConnection {
    final /* synthetic */ zzfmv zza;

    public /* synthetic */ zzfmu(zzfmv zzfmvVar, zzfmt zzfmtVar) {
        this.zza = zzfmvVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzfmk zzfmkVar;
        zzfmkVar = this.zza.zzc;
        zzfmkVar.zzc("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.zza.zzc().post(new zzfmr(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzfmk zzfmkVar;
        zzfmkVar = this.zza.zzc;
        zzfmkVar.zzc("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.zza.zzc().post(new zzfms(this));
    }
}
