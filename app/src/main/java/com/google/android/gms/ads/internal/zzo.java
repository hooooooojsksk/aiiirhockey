package com.google.android.gms.ads.internal;

import android.content.Context;
import com.google.android.gms.internal.ads.zzapv;
import com.google.android.gms.internal.ads.zzapw;
import com.google.android.gms.internal.ads.zzbzg;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes.dex */
public final class zzo implements Callable {
    final /* synthetic */ zzs zza;

    public zzo(zzs zzsVar) {
        this.zza = zzsVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzbzg zzbzgVar;
        Context context;
        zzs zzsVar = this.zza;
        zzbzgVar = zzsVar.zza;
        String str = zzbzgVar.zza;
        context = zzsVar.zzd;
        return new zzapw(zzapv.zzt(str, context, false));
    }
}
