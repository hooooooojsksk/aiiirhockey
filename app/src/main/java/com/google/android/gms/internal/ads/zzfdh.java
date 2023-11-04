package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzfdh {
    private final Executor zza;
    private final zzbzf zzb;

    public zzfdh(Executor executor, zzbzf zzbzfVar) {
        this.zza = executor;
        this.zzb = zzbzfVar;
    }

    public final /* synthetic */ void zza(String str) {
        this.zzb.zza(str);
    }

    public final void zzb(final String str) {
        this.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfdg
            @Override // java.lang.Runnable
            public final void run() {
                zzfdh.this.zza(str);
            }
        });
    }
}
