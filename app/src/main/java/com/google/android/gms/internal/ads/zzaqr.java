package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzaqr implements zzfjo {
    private final zzfhr zza;
    private final zzfii zzb;
    private final zzarf zzc;
    private final zzaqq zzd;
    private final zzaqa zze;
    private final zzarh zzf;
    private final zzaqy zzg;
    private final zzaqp zzh;

    public zzaqr(zzfhr zzfhrVar, zzfii zzfiiVar, zzarf zzarfVar, zzaqq zzaqqVar, zzaqa zzaqaVar, zzarh zzarhVar, zzaqy zzaqyVar, zzaqp zzaqpVar) {
        this.zza = zzfhrVar;
        this.zzb = zzfiiVar;
        this.zzc = zzarfVar;
        this.zzd = zzaqqVar;
        this.zze = zzaqaVar;
        this.zzf = zzarhVar;
        this.zzg = zzaqyVar;
        this.zzh = zzaqpVar;
    }

    private final Map zze() {
        HashMap hashMap = new HashMap();
        zzans zzb = this.zzb.zzb();
        hashMap.put("v", this.zza.zzb());
        hashMap.put("gms", Boolean.valueOf(this.zza.zzc()));
        hashMap.put("int", zzb.zzh());
        hashMap.put("up", Boolean.valueOf(this.zzd.zza()));
        hashMap.put("t", new Throwable());
        zzaqy zzaqyVar = this.zzg;
        if (zzaqyVar != null) {
            hashMap.put("tcq", Long.valueOf(zzaqyVar.zzc()));
            hashMap.put("tpq", Long.valueOf(this.zzg.zzg()));
            hashMap.put("tcv", Long.valueOf(this.zzg.zzd()));
            hashMap.put("tpv", Long.valueOf(this.zzg.zzh()));
            hashMap.put("tchv", Long.valueOf(this.zzg.zzb()));
            hashMap.put("tphv", Long.valueOf(this.zzg.zzf()));
            hashMap.put("tcc", Long.valueOf(this.zzg.zza()));
            hashMap.put("tpc", Long.valueOf(this.zzg.zze()));
        }
        return hashMap;
    }

    @Override // com.google.android.gms.internal.ads.zzfjo
    public final Map zza() {
        Map zze = zze();
        zze.put("lts", Long.valueOf(this.zzc.zza()));
        return zze;
    }

    @Override // com.google.android.gms.internal.ads.zzfjo
    public final Map zzb() {
        Map zze = zze();
        zzans zza = this.zzb.zza();
        zze.put("gai", Boolean.valueOf(this.zza.zzd()));
        zze.put("did", zza.zzg());
        zze.put("dst", Integer.valueOf(zza.zzal() - 1));
        zze.put("doo", Boolean.valueOf(zza.zzai()));
        zzaqa zzaqaVar = this.zze;
        if (zzaqaVar != null) {
            zze.put("nt", Long.valueOf(zzaqaVar.zza()));
        }
        zzarh zzarhVar = this.zzf;
        if (zzarhVar != null) {
            zze.put("vs", Long.valueOf(zzarhVar.zzc()));
            zze.put("vf", Long.valueOf(this.zzf.zzb()));
        }
        return zze;
    }

    @Override // com.google.android.gms.internal.ads.zzfjo
    public final Map zzc() {
        Map zze = zze();
        zzaqp zzaqpVar = this.zzh;
        if (zzaqpVar != null) {
            zze.put("vst", zzaqpVar.zza());
        }
        return zze;
    }

    public final void zzd(View view) {
        this.zzc.zzd(view);
    }
}
