package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzcwf implements zzgwy {
    private final zzgxl zza;

    public zzcwf(zzgxl zzgxlVar) {
        this.zza = zzgxlVar;
    }

    public static zzcwe zzc(Set set) {
        return new zzcwe(set);
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    /* renamed from: zza */
    public final zzcwe zzb() {
        return new zzcwe(((zzgxj) this.zza).zzb());
    }
}
