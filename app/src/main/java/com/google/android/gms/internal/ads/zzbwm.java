package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzbwm extends zzbxg {
    private final Clock zzb;
    private final zzbwm zzc = this;
    private final zzgxl zzd;
    private final zzgxl zze;
    private final zzgxl zzf;
    private final zzgxl zzg;
    private final zzgxl zzh;
    private final zzgxl zzi;
    private final zzgxl zzj;
    private final zzgxl zzk;

    public /* synthetic */ zzbwm(Context context, Clock clock, com.google.android.gms.ads.internal.util.zzg zzgVar, zzbxf zzbxfVar, zzbwl zzbwlVar) {
        this.zzb = clock;
        zzgwy zza = zzgwz.zza(context);
        this.zzd = zza;
        zzgwy zza2 = zzgwz.zza(zzgVar);
        this.zze = zza2;
        zzgwy zza3 = zzgwz.zza(zzbxfVar);
        this.zzf = zza3;
        this.zzg = zzgwx.zzc(new zzbwe(zza, zza2, zza3));
        zzgwy zza4 = zzgwz.zza(clock);
        this.zzh = zza4;
        zzgxl zzc = zzgwx.zzc(new zzbwg(zza4, zza2, zza3));
        this.zzi = zzc;
        zzbwi zzbwiVar = new zzbwi(zza4, zzc);
        this.zzj = zzbwiVar;
        this.zzk = zzgwx.zzc(new zzbxl(zza, zzbwiVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbxg
    final zzbwd zza() {
        return (zzbwd) this.zzg.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbxg
    public final zzbwh zzb() {
        return new zzbwh(this.zzb, (zzbwf) this.zzi.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzbxg
    final zzbxk zzc() {
        return (zzbxk) this.zzk.zzb();
    }
}
