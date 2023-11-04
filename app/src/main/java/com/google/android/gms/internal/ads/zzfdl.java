package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzfdl implements zzgwy {
    private final zzgxl zza;
    private final zzgxl zzb;
    private final zzgxl zzc;

    public zzfdl(zzgxl zzgxlVar, zzgxl zzgxlVar2, zzgxl zzgxlVar3) {
        this.zza = zzgxlVar;
        this.zzb = zzgxlVar2;
        this.zzc = zzgxlVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    public final /* bridge */ /* synthetic */ Object zzb() {
        Object obj;
        zzgws zza = zzgwx.zza(this.zza);
        zzgws zza2 = zzgwx.zza(this.zzb);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zzc.zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhT)).booleanValue()) {
            obj = new zzfdn((zzfdk) zza.zzb(), scheduledExecutorService);
        } else {
            obj = (zzfdk) zza2.zzb();
        }
        zzgxg.zzb(obj);
        return obj;
    }
}
