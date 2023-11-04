package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzctz {
    private final Context zza;
    private final zzeyx zzb;
    private final Bundle zzc;
    private final zzeyp zzd;
    private final zzctr zze;

    public /* synthetic */ zzctz(zzctx zzctxVar, zzcty zzctyVar) {
        Context context;
        zzeyx zzeyxVar;
        Bundle bundle;
        zzeyp zzeypVar;
        zzctr zzctrVar;
        context = zzctxVar.zza;
        this.zza = context;
        zzeyxVar = zzctxVar.zzb;
        this.zzb = zzeyxVar;
        bundle = zzctxVar.zzc;
        this.zzc = bundle;
        zzeypVar = zzctxVar.zzd;
        this.zzd = zzeypVar;
        zzctrVar = zzctxVar.zze;
        this.zze = zzctrVar;
    }

    public final Context zza(Context context) {
        return this.zza;
    }

    public final Bundle zzb() {
        return this.zzc;
    }

    public final zzctr zzc() {
        return this.zze;
    }

    public final zzctx zzd() {
        zzctx zzctxVar = new zzctx();
        zzctxVar.zzd(this.zza);
        zzctxVar.zzh(this.zzb);
        zzctxVar.zze(this.zzc);
        zzctxVar.zzf(this.zze);
        return zzctxVar;
    }

    public final zzeyp zze() {
        return this.zzd;
    }

    public final zzeyx zzf() {
        return this.zzb;
    }
}
