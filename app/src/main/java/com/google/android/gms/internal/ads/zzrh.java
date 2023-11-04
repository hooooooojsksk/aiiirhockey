package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzrh {
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;

    public zzrh(String str, boolean z, boolean z2) {
        this.zza = str;
        this.zzb = z;
        this.zzc = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == zzrh.class) {
            zzrh zzrhVar = (zzrh) obj;
            if (TextUtils.equals(this.zza, zzrhVar.zza) && this.zzb == zzrhVar.zzb && this.zzc == zzrhVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode() + 31;
        return (((hashCode * 31) + (true != this.zzb ? 1237 : 1231)) * 31) + (true == this.zzc ? 1231 : 1237);
    }
}
