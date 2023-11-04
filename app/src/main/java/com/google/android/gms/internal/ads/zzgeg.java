package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzgeg {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzgeg(Class cls, Class cls2, zzgef zzgefVar) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgeg) {
            zzgeg zzgegVar = (zzgeg) obj;
            return zzgegVar.zza.equals(this.zza) && zzgegVar.zzb.equals(this.zzb);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        String simpleName = this.zza.getSimpleName();
        String simpleName2 = this.zzb.getSimpleName();
        return simpleName + " with serialization type: " + simpleName2;
    }
}
