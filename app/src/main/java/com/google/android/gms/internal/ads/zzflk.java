package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzflk extends zzfmd {
    private String zza;
    private String zzb;

    @Override // com.google.android.gms.internal.ads.zzfmd
    public final zzfmd zza(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfmd
    public final zzfmd zzb(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfmd
    public final zzfme zzc() {
        return new zzflm(this.zza, this.zzb, null);
    }
}
