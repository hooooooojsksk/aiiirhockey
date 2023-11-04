package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzgdv {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzgdv(Class cls, Class cls2, zzgdu zzgduVar) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgdv) {
            zzgdv zzgdvVar = (zzgdv) obj;
            return zzgdvVar.zza.equals(this.zza) && zzgdvVar.zzb.equals(this.zzb);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        String simpleName = this.zza.getSimpleName();
        String simpleName2 = this.zzb.getSimpleName();
        return simpleName + " with primitive type: " + simpleName2;
    }
}
