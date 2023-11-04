package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzajc {
    private final List zza;
    private final zzabb[] zzb;

    public zzajc(List list) {
        this.zza = list;
        this.zzb = new zzabb[list.size()];
    }

    public final void zza(long j, zzen zzenVar) {
        if (zzenVar.zza() < 9) {
            return;
        }
        int zze = zzenVar.zze();
        int zze2 = zzenVar.zze();
        int zzk = zzenVar.zzk();
        if (zze == 434 && zze2 == 1195456820 && zzk == 3) {
            zzzh.zzb(j, zzenVar, this.zzb);
        }
    }

    public final void zzb(zzzx zzzxVar, zzaiz zzaizVar) {
        for (int i = 0; i < this.zzb.length; i++) {
            zzaizVar.zzc();
            zzabb zzv = zzzxVar.zzv(zzaizVar.zza(), 3);
            zzaf zzafVar = (zzaf) this.zza.get(i);
            String str = zzafVar.zzm;
            boolean z = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z = false;
            }
            zzdl.zze(z, "Invalid closed caption mime type provided: ".concat(String.valueOf(str)));
            zzad zzadVar = new zzad();
            zzadVar.zzH(zzaizVar.zzb());
            zzadVar.zzS(str);
            zzadVar.zzU(zzafVar.zze);
            zzadVar.zzK(zzafVar.zzd);
            zzadVar.zzu(zzafVar.zzE);
            zzadVar.zzI(zzafVar.zzo);
            zzv.zzk(zzadVar.zzY());
            this.zzb[i] = zzv;
        }
    }
}
