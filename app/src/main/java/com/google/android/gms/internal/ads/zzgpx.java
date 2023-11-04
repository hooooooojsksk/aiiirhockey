package com.google.android.gms.internal.ads;

import androidx.core.internal.view.SupportMenu;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzgpx {
    private final Object zza;
    private final int zzb;

    public zzgpx(Object obj, int i) {
        this.zza = obj;
        this.zzb = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgpx) {
            zzgpx zzgpxVar = (zzgpx) obj;
            return this.zza == zzgpxVar.zza && this.zzb == zzgpxVar.zzb;
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * SupportMenu.USER_MASK) + this.zzb;
    }
}
