package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzegh implements com.google.android.gms.ads.internal.zzf {
    final /* synthetic */ zzbzs zza;
    final /* synthetic */ zzeyo zzb;
    final /* synthetic */ zzeyc zzc;
    final /* synthetic */ zzegn zzd;
    final /* synthetic */ zzegi zze;

    public zzegh(zzegi zzegiVar, zzbzs zzbzsVar, zzeyo zzeyoVar, zzeyc zzeycVar, zzegn zzegnVar) {
        this.zze = zzegiVar;
        this.zza = zzbzsVar;
        this.zzb = zzeyoVar;
        this.zzc = zzeycVar;
        this.zzd = zzegnVar;
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zza(View view) {
        zzegr zzegrVar;
        zzbzs zzbzsVar = this.zza;
        zzegrVar = this.zze.zzd;
        zzbzsVar.zzd(zzegrVar.zza(this.zzb, this.zzc, view, this.zzd));
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzb() {
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzc() {
    }
}
