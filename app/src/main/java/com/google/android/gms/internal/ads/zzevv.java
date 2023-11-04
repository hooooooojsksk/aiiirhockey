package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzevv implements zzgwy {
    private final zzgxl zza;
    private final zzgxl zzb;
    private final zzgxl zzc;

    public zzevv(zzgxl zzgxlVar, zzgxl zzgxlVar2, zzgxl zzgxlVar3) {
        this.zza = zzgxlVar;
        this.zzb = zzgxlVar2;
        this.zzc = zzgxlVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    /* renamed from: zza */
    public final zzevt zzb() {
        zzbyd zzi;
        Context context = (Context) this.zza.zzb();
        zzfaf zzfafVar = (zzfaf) this.zzb.zzb();
        zzfax zzfaxVar = (zzfax) this.zzc.zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzfT)).booleanValue()) {
            zzi = com.google.android.gms.ads.internal.zzt.zzo().zzh().zzh();
        } else {
            zzi = com.google.android.gms.ads.internal.zzt.zzo().zzh().zzi();
        }
        boolean z = false;
        if (zzi != null && zzi.zzh()) {
            z = true;
        }
        if (((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzgj)).intValue() > 0) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzfS)).booleanValue() || z) {
                zzfaw zza = zzfaxVar.zza(zzfan.AppOpen, context, zzfafVar, new zzeux(new zzeuu()));
                return new zzeuz(new zzevj(new zzevi()), new zzevf(zza.zza, zzbzn.zza), zza.zzb, zza.zza.zza().zzf, zzbzn.zza);
            }
        }
        return new zzevi();
    }
}
