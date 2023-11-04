package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzgxk implements zzgxl {
    private static final Object zza = new Object();
    private volatile zzgxl zzb;
    private volatile Object zzc = zza;

    private zzgxk(zzgxl zzgxlVar) {
        this.zzb = zzgxlVar;
    }

    public static zzgxl zza(zzgxl zzgxlVar) {
        if ((zzgxlVar instanceof zzgxk) || (zzgxlVar instanceof zzgwx)) {
            return zzgxlVar;
        }
        Objects.requireNonNull(zzgxlVar);
        return new zzgxk(zzgxlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    public final Object zzb() {
        Object obj = this.zzc;
        if (obj == zza) {
            zzgxl zzgxlVar = this.zzb;
            if (zzgxlVar == null) {
                return this.zzc;
            }
            Object zzb = zzgxlVar.zzb();
            this.zzc = zzb;
            this.zzb = null;
            return zzb;
        }
        return obj;
    }
}
