package com.google.android.gms.internal.ads;

import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes.dex */
public final class zzeei {
    private final zzezm zza;
    private final zzdna zzb;
    private final zzdpi zzc;
    private final zzfdk zzd;

    public zzeei(zzezm zzezmVar, zzdna zzdnaVar, zzdpi zzdpiVar, zzfdk zzfdkVar) {
        this.zza = zzezmVar;
        this.zzb = zzdnaVar;
        this.zzc = zzdpiVar;
        this.zzd = zzfdkVar;
    }

    public final void zza(zzeyf zzeyfVar, zzeyc zzeycVar, int i, @Nullable zzeax zzeaxVar, long j) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhS)).booleanValue()) {
            zzdph zza = this.zzc.zza();
            zza.zze(zzeyfVar);
            zza.zzd(zzeycVar);
            zza.zzb("action", "adapter_status");
            zza.zzb("adapter_l", String.valueOf(j));
            zza.zzb("sc", Integer.toString(i));
            if (zzeaxVar != null) {
                zza.zzb("arec", Integer.toString(zzeaxVar.zzb().zza));
                String zza2 = this.zza.zza(zzeaxVar.getMessage());
                if (zza2 != null) {
                    zza.zzb("areec", zza2);
                }
            }
            zzdmz zzb = this.zzb.zzb(zzeycVar.zzu);
            if (zzb != null) {
                zza.zzb("ancn", zzb.zza);
                zzbpq zzbpqVar = zzb.zzb;
                if (zzbpqVar != null) {
                    zza.zzb("adapter_v", zzbpqVar.toString());
                }
                zzbpq zzbpqVar2 = zzb.zzc;
                if (zzbpqVar2 != null) {
                    zza.zzb("adapter_sv", zzbpqVar2.toString());
                }
            }
            zza.zzg();
            return;
        }
        zzfdj zzb2 = zzfdj.zzb("adapter_status");
        zzb2.zzg(zzeyfVar);
        zzb2.zzf(zzeycVar);
        zzb2.zza("adapter_l", String.valueOf(j));
        zzb2.zza("sc", Integer.toString(i));
        if (zzeaxVar != null) {
            zzb2.zza("arec", Integer.toString(zzeaxVar.zzb().zza));
            String zza3 = this.zza.zza(zzeaxVar.getMessage());
            if (zza3 != null) {
                zzb2.zza("areec", zza3);
            }
        }
        zzdmz zzb3 = this.zzb.zzb(zzeycVar.zzu);
        if (zzb3 != null) {
            zzb2.zza("ancn", zzb3.zza);
            zzbpq zzbpqVar3 = zzb3.zzb;
            if (zzbpqVar3 != null) {
                zzb2.zza("adapter_v", zzbpqVar3.toString());
            }
            zzbpq zzbpqVar4 = zzb3.zzc;
            if (zzbpqVar4 != null) {
                zzb2.zza("adapter_sv", zzbpqVar4.toString());
            }
        }
        this.zzd.zzb(zzb2);
    }
}
