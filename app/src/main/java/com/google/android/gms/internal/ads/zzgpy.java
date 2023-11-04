package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzgpy {
    static final zzgpy zza = new zzgpy(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private static volatile zzgpy zzd;
    private final Map zze;

    zzgpy() {
        this.zze = new HashMap();
    }

    public static zzgpy zza() {
        return zza;
    }

    public final zzgqk zzc(zzgrw zzgrwVar, int i) {
        return (zzgqk) this.zze.get(new zzgpx(zzgrwVar, i));
    }

    zzgpy(boolean z) {
        this.zze = Collections.emptyMap();
    }

    public static zzgpy zzb() {
        zzgpy zzgpyVar = zzd;
        if (zzgpyVar != null) {
            return zzgpyVar;
        }
        synchronized (zzgpy.class) {
            zzgpy zzgpyVar2 = zzd;
            if (zzgpyVar2 != null) {
                return zzgpyVar2;
            }
            zzgpy zzb2 = zzgqg.zzb(zzgpy.class);
            zzd = zzb2;
            return zzb2;
        }
    }
}
