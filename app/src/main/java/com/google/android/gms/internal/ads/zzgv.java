package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzgv {
    private final Context zza;
    private final zzgt zzb;

    public zzgv(Context context, Handler handler, zzgu zzguVar) {
        this.zza = context.getApplicationContext();
        this.zzb = new zzgt(this, handler, zzguVar);
    }
}
