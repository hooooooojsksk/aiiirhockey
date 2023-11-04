package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzfdq implements zzfdk {
    private final zzfdu zza;
    private final zzfds zzb;
    private final zzfdh zzc;

    public zzfdq(zzfdh zzfdhVar, zzfdu zzfduVar, zzfds zzfdsVar, byte[] bArr) {
        this.zzc = zzfdhVar;
        this.zza = zzfduVar;
        this.zzb = zzfdsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfdk
    public final String zza(zzfdj zzfdjVar) {
        zzfdu zzfduVar = this.zza;
        Map zzj = zzfdjVar.zzj();
        this.zzb.zza(zzj);
        return zzfduVar.zza(zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzfdk
    public final void zzb(zzfdj zzfdjVar) {
        this.zzc.zzb(zza(zzfdjVar));
    }
}
