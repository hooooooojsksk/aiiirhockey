package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzcpp implements zzgwy {
    private final zzgxl zza;

    public zzcpp(zzgxl zzgxlVar) {
        this.zza = zzgxlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    /* renamed from: zza */
    public final Boolean zzb() {
        boolean z = true;
        if (((zzcuf) this.zza).zza().zza() == null) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzfd)).booleanValue()) {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }
}
