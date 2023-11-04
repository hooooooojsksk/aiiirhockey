package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public abstract class zzdwz implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    protected final zzbzs zza = new zzbzs();
    protected boolean zzb = false;
    protected boolean zzc = false;
    protected zzbsq zzd;
    protected Context zze;
    protected Looper zzf;
    protected ScheduledExecutorService zzg;

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        String format = String.format(Locale.US, "Remote ad service connection failed, cause: %d.", Integer.valueOf(connectionResult.getErrorCode()));
        zzbza.zze(format);
        this.zza.zze(new zzdvi(1, format));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public void onConnectionSuspended(int i) {
        String format = String.format(Locale.US, "Remote ad service connection suspended, cause: %d.", Integer.valueOf(i));
        zzbza.zze(format);
        this.zza.zze(new zzdvi(1, format));
    }

    public final synchronized void zzb() {
        if (this.zzd == null) {
            this.zzd = new zzbsq(this.zze, this.zzf, this, this);
        }
        this.zzd.checkAvailabilityAndConnect();
    }

    public final synchronized void zzc() {
        this.zzc = true;
        zzbsq zzbsqVar = this.zzd;
        if (zzbsqVar == null) {
            return;
        }
        if (zzbsqVar.isConnected() || this.zzd.isConnecting()) {
            this.zzd.disconnect();
        }
        Binder.flushPendingCommands();
    }
}
