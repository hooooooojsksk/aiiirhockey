package com.google.android.gms.internal.ads;

import javax.annotation.CheckForNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* loaded from: classes.dex */
public final class zzfnz extends zzfnq {
    private final Object zza;

    public zzfnz(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof zzfnz) {
            return this.zza.equals(((zzfnz) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.zza + ")";
    }

    @Override // com.google.android.gms.internal.ads.zzfnq
    public final zzfnq zza(zzfnj zzfnjVar) {
        Object apply = zzfnjVar.apply(this.zza);
        zzfnu.zzc(apply, "the Function passed to Optional.transform() must not return null.");
        return new zzfnz(apply);
    }

    @Override // com.google.android.gms.internal.ads.zzfnq
    public final Object zzb(Object obj) {
        return this.zza;
    }
}
