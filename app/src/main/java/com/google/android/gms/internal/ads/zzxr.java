package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayDeque;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzxr {
    private final zzyd zza;
    private final zzxs zzb;
    private final ArrayDeque zzc = new ArrayDeque();
    private final ArrayDeque zzd = new ArrayDeque();
    private boolean zze = true;
    private final zzda zzf = zzda.zza;

    public zzxr(zzyd zzydVar, zzxs zzxsVar) {
        this.zza = zzydVar;
        this.zzb = zzxsVar;
    }

    public final void zza(String str) {
        Context context;
        context = this.zzb.zze;
        if (zzew.zza < 29 || context.getApplicationContext().getApplicationInfo().targetSdkVersion < 29) {
            return;
        }
        zzfnb.zzb(str).startsWith("OMX.");
    }

    public final boolean zzb(zzaf zzafVar) throws zzhj {
        if (this.zze) {
            this.zze = false;
            return false;
        }
        return false;
    }
}
