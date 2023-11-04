package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzebh implements zzdee {
    private final zzbzg zza;
    private final zzfut zzb;
    private final zzeyc zzc;
    private final zzcei zzd;
    private final zzeyx zze;
    private final zzbhr zzf;
    private final boolean zzg;

    public zzebh(zzbzg zzbzgVar, zzfut zzfutVar, zzeyc zzeycVar, zzcei zzceiVar, zzeyx zzeyxVar, boolean z, zzbhr zzbhrVar) {
        this.zza = zzbzgVar;
        this.zzb = zzfutVar;
        this.zzc = zzeycVar;
        this.zzd = zzceiVar;
        this.zze = zzeyxVar;
        this.zzg = z;
        this.zzf = zzbhrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdee
    public final void zza(boolean z, Context context, zzcvb zzcvbVar) {
        int i;
        zzcnv zzcnvVar = (zzcnv) zzfuj.zzp(this.zzb);
        this.zzd.zzan(true);
        boolean zze = this.zzg ? this.zzf.zze(true) : true;
        boolean z2 = this.zzg;
        com.google.android.gms.ads.internal.zzj zzjVar = new com.google.android.gms.ads.internal.zzj(zze, true, z2 ? this.zzf.zzd() : false, z2 ? this.zzf.zza() : 0.0f, -1, z, this.zzc.zzP, false);
        if (zzcvbVar != null) {
            zzcvbVar.zzf();
        }
        com.google.android.gms.ads.internal.zzt.zzi();
        zzddt zzg = zzcnvVar.zzg();
        zzcei zzceiVar = this.zzd;
        int i2 = this.zzc.zzR;
        if (i2 == -1) {
            com.google.android.gms.ads.internal.client.zzw zzwVar = this.zze.zzj;
            if (zzwVar != null) {
                int i3 = zzwVar.zza;
                if (i3 == 1) {
                    i = 7;
                } else if (i3 == 2) {
                    i = 6;
                }
                zzbzg zzbzgVar = this.zza;
                zzeyc zzeycVar = this.zzc;
                String str = zzeycVar.zzC;
                zzeyh zzeyhVar = zzeycVar.zzt;
                com.google.android.gms.ads.internal.overlay.zzm.zza(context, new AdOverlayInfoParcel((com.google.android.gms.ads.internal.client.zza) null, zzg, (com.google.android.gms.ads.internal.overlay.zzz) null, zzceiVar, i, zzbzgVar, str, zzjVar, zzeyhVar.zzb, zzeyhVar.zza, this.zze.zzf, zzcvbVar), true);
            }
            zzbza.zze("Error setting app open orientation; no targeting orientation available.");
            i2 = this.zzc.zzR;
        }
        i = i2;
        zzbzg zzbzgVar2 = this.zza;
        zzeyc zzeycVar2 = this.zzc;
        String str2 = zzeycVar2.zzC;
        zzeyh zzeyhVar2 = zzeycVar2.zzt;
        com.google.android.gms.ads.internal.overlay.zzm.zza(context, new AdOverlayInfoParcel((com.google.android.gms.ads.internal.client.zza) null, zzg, (com.google.android.gms.ads.internal.overlay.zzz) null, zzceiVar, i, zzbzgVar2, str2, zzjVar, zzeyhVar2.zzb, zzeyhVar2.zza, this.zze.zzf, zzcvbVar), true);
    }
}
