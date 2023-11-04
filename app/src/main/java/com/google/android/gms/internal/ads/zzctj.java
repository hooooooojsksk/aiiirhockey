package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzctj implements zzgwy {
    private final zzgxl zza;
    private final zzgxl zzb;
    private final zzgxl zzc;

    public zzctj(zzgxl zzgxlVar, zzgxl zzgxlVar2, zzgxl zzgxlVar3) {
        this.zza = zzgxlVar;
        this.zzb = zzgxlVar2;
        this.zzc = zzgxlVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context context = (Context) this.zza.zzb();
        final zzbzg zza = ((zzcgu) this.zzb).zza();
        final zzeyx zza2 = ((zzcuf) this.zzc).zza();
        return new zzfnj() { // from class: com.google.android.gms.internal.ads.zzcti
            @Override // com.google.android.gms.internal.ads.zzfnj
            public final Object apply(Object obj) {
                Context context2 = context;
                zzbzg zzbzgVar = zza;
                zzeyx zzeyxVar = zza2;
                zzeyc zzeycVar = (zzeyc) obj;
                com.google.android.gms.ads.internal.util.zzas zzasVar = new com.google.android.gms.ads.internal.util.zzas(context2);
                zzasVar.zzp(zzeycVar.zzC);
                zzasVar.zzq(zzeycVar.zzD.toString());
                zzasVar.zzo(zzbzgVar.zza);
                zzasVar.zzn(zzeyxVar.zzf);
                return zzasVar;
            }
        };
    }
}
