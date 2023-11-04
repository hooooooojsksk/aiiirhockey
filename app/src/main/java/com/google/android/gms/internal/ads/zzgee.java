package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzgee {
    private final Class zza;
    private final zzgoj zzb;

    public /* synthetic */ zzgee(Class cls, zzgoj zzgojVar, zzged zzgedVar) {
        this.zza = cls;
        this.zzb = zzgojVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgee) {
            zzgee zzgeeVar = (zzgee) obj;
            return zzgeeVar.zza.equals(this.zza) && zzgeeVar.zzb.equals(this.zzb);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        String simpleName = this.zza.getSimpleName();
        String valueOf = String.valueOf(this.zzb);
        return simpleName + ", object identifier: " + valueOf;
    }
}
