package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzcgg {
    private final zzbzg zza;
    private final Context zzb;
    private final WeakReference zzc;

    public /* synthetic */ zzcgg(zzcge zzcgeVar, zzcgf zzcgfVar) {
        zzbzg zzbzgVar;
        Context context;
        WeakReference weakReference;
        zzbzgVar = zzcgeVar.zza;
        this.zza = zzbzgVar;
        context = zzcgeVar.zzb;
        this.zzb = context;
        weakReference = zzcgeVar.zzc;
        this.zzc = weakReference;
    }

    public final Context zza() {
        return this.zzb;
    }

    public final zzapw zzb() {
        return new zzapw(new com.google.android.gms.ads.internal.zzi(this.zzb, this.zza));
    }

    public final zzbde zzc() {
        return new zzbde(this.zzb);
    }

    public final zzbzg zzd() {
        return this.zza;
    }

    public final String zze() {
        return com.google.android.gms.ads.internal.zzt.zzp().zzc(this.zzb, this.zza.zza);
    }

    public final WeakReference zzf() {
        return this.zzc;
    }
}
