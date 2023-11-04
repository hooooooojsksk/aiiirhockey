package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzld {
    private final zzaa zza;
    private final SparseArray zzb;

    public zzld(zzaa zzaaVar, SparseArray sparseArray) {
        this.zza = zzaaVar;
        SparseArray sparseArray2 = new SparseArray(zzaaVar.zzb());
        for (int i = 0; i < zzaaVar.zzb(); i++) {
            int zza = zzaaVar.zza(i);
            zzlc zzlcVar = (zzlc) sparseArray.get(zza);
            Objects.requireNonNull(zzlcVar);
            sparseArray2.append(zza, zzlcVar);
        }
        this.zzb = sparseArray2;
    }

    public final int zza(int i) {
        return this.zza.zza(i);
    }

    public final int zzb() {
        return this.zza.zzb();
    }

    public final zzlc zzc(int i) {
        zzlc zzlcVar = (zzlc) this.zzb.get(i);
        Objects.requireNonNull(zzlcVar);
        return zzlcVar;
    }

    public final boolean zzd(int i) {
        return this.zza.zzc(i);
    }
}
