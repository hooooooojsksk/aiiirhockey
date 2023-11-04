package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzcmt implements zzfuf {
    final /* synthetic */ zzcmv zza;

    public zzcmt(zzcmv zzcmvVar) {
        this.zza = zzcmvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzezg zzezgVar;
        zzffb zzffbVar;
        zzeyo zzeyoVar;
        zzeyc zzeycVar;
        zzeyc zzeycVar2;
        Context context;
        String str = (String) obj;
        zzcmv zzcmvVar = this.zza;
        zzezgVar = zzcmvVar.zzh;
        zzffbVar = zzcmvVar.zzg;
        zzeyoVar = zzcmvVar.zze;
        zzeycVar = zzcmvVar.zzf;
        zzeycVar2 = zzcmvVar.zzf;
        List zzd = zzffbVar.zzd(zzeyoVar, zzeycVar, false, "", str, zzeycVar2.zzc);
        zzbyj zzo = com.google.android.gms.ads.internal.zzt.zzo();
        context = this.zza.zza;
        zzezgVar.zzc(zzd, true == zzo.zzx(context) ? 2 : 1);
    }
}
