package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzakf {
    private final Executor zza;

    public zzakf(Handler handler) {
        this.zza = new zzakd(this, handler);
    }

    public final void zza(zzako zzakoVar, zzakx zzakxVar) {
        zzakoVar.zzm("post-error");
        zzaku zza = zzaku.zza(zzakxVar);
        Executor executor = this.zza;
        ((zzakd) executor).zza.post(new zzake(zzakoVar, zza, null));
    }

    public final void zzb(zzako zzakoVar, zzaku zzakuVar, Runnable runnable) {
        zzakoVar.zzq();
        zzakoVar.zzm("post-response");
        Executor executor = this.zza;
        ((zzakd) executor).zza.post(new zzake(zzakoVar, zzakuVar, runnable));
    }
}
