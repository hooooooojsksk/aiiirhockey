package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzdtx implements zzgwy {
    private final zzgxl zza;

    public zzdtx(zzgxl zzgxlVar) {
        this.zza = zzgxlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    /* renamed from: zza */
    public final String zzb() {
        String packageName = ((zzcgj) this.zza).zza().getPackageName();
        zzgxg.zzb(packageName);
        return packageName;
    }
}
