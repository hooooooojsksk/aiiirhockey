package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzdma implements zzgwy {
    private final zzgxl zza;
    private final zzgxl zzb;
    private final zzgxl zzc;

    public zzdma(zzgxl zzgxlVar, zzgxl zzgxlVar2, zzgxl zzgxlVar3) {
        this.zza = zzgxlVar;
        this.zzb = zzgxlVar2;
        this.zzc = zzgxlVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    public final /* synthetic */ Object zzb() {
        zzgxl zzgxlVar = this.zza;
        zzgxl zzgxlVar2 = this.zzb;
        int i = ((zzcuf) this.zzc).zza().zzo.zza;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 != 0) {
                return ((zzefx) zzgxlVar2).zzb();
            }
            return ((zzefx) zzgxlVar).zzb();
        }
        throw null;
    }
}
