package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzcge {
    private zzbzg zza;
    private Context zzb;
    private WeakReference zzc;

    public final zzcge zzc(Context context) {
        this.zzc = new WeakReference(context);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.zzb = context;
        return this;
    }

    public final zzcge zzd(zzbzg zzbzgVar) {
        this.zza = zzbzgVar;
        return this;
    }
}
