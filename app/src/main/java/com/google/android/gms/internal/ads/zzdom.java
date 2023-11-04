package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzdom implements zzgwy {
    private final zzgxl zza;
    private final zzgxl zzb;
    private final zzgxl zzc;
    private final zzgxl zzd;

    public zzdom(zzgxl zzgxlVar, zzgxl zzgxlVar2, zzgxl zzgxlVar3, zzgxl zzgxlVar4) {
        this.zza = zzgxlVar;
        this.zzb = zzgxlVar2;
        this.zzc = zzgxlVar3;
        this.zzd = zzgxlVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set emptySet;
        final String str = (String) this.zza.zzb();
        Context zza = ((zzcgj) this.zzb).zza();
        zzfuu zzfuuVar = zzbzn.zza;
        zzgxg.zzb(zzfuuVar);
        Map zzb = ((zzgxc) this.zzd).zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzew)).booleanValue()) {
            zzawe zzaweVar = new zzawe(new zzawk(zza));
            zzaweVar.zzb(new zzawd() { // from class: com.google.android.gms.internal.ads.zzdon
                @Override // com.google.android.gms.internal.ads.zzawd
                public final void zza(zzaxt zzaxtVar) {
                    zzaxtVar.zzh(str);
                }
            });
            emptySet = Collections.singleton(new zzdbu(new zzdop(zzaweVar, zzb), zzfuuVar));
        } else {
            emptySet = Collections.emptySet();
        }
        zzgxg.zzb(emptySet);
        return emptySet;
    }
}
