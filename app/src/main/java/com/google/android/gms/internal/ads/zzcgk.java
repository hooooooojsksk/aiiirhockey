package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzcgk implements zzgwy {
    private final zzcgg zza;

    public zzcgk(zzcgg zzcggVar) {
        this.zza = zzcggVar;
    }

    public final WeakReference zza() {
        WeakReference zzf = this.zza.zzf();
        zzgxg.zzb(zzf);
        return zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    public final /* synthetic */ Object zzb() {
        WeakReference zzf = this.zza.zzf();
        zzgxg.zzb(zzf);
        return zzf;
    }
}
