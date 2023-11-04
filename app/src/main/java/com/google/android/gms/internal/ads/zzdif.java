package com.google.android.gms.internal.ads;

import androidx.collection.ArrayMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzdif implements zzcvi {
    private final zzdgi zza;
    private final zzdgn zzb;

    public zzdif(zzdgi zzdgiVar, zzdgn zzdgnVar) {
        this.zza = zzdgiVar;
        this.zzb = zzdgnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcvi
    public final void zzl() {
        zzdgi zzdgiVar = this.zza;
        if (zzdgiVar.zzu() == null) {
            return;
        }
        zzcei zzq = zzdgiVar.zzq();
        zzcei zzr = zzdgiVar.zzr();
        if (zzq == null) {
            zzq = zzr == null ? null : zzr;
        }
        if (!this.zzb.zzd() || zzq == null) {
            return;
        }
        zzq.zzd("onSdkImpression", new ArrayMap());
    }
}
