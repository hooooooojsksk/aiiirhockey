package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzdmc implements zzgwy {
    private final zzgxl zza;

    public zzdmc(zzgxl zzgxlVar) {
        this.zza = zzgxlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzawo zzawoVar;
        if (((zzcuf) this.zza).zza().zzo.zza == 3) {
            zzawoVar = zzawo.REWARDED_INTERSTITIAL;
        } else {
            zzawoVar = zzawo.REWARD_BASED_VIDEO_AD;
        }
        zzgxg.zzb(zzawoVar);
        return zzawoVar;
    }
}
