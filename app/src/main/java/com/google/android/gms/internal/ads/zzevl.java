package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes.dex */
public final class zzevl implements zzfnj {
    final /* synthetic */ zzevp zza;

    public zzevl(zzevp zzevpVar) {
        this.zza = zzevpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfnj
    @NullableDecl
    public final /* bridge */ /* synthetic */ Object apply(@NullableDecl Object obj) {
        zzfat zze;
        zzevo zzevoVar;
        zzbza.zzh("", (zzdvi) obj);
        com.google.android.gms.ads.internal.util.zze.zza("Failed to get a cache key, reverting to legacy flow.");
        zzevp zzevpVar = this.zza;
        zze = zzevpVar.zze();
        zzevpVar.zzd = new zzevo(null, zze, null);
        zzevoVar = this.zza.zzd;
        return zzevoVar;
    }
}
