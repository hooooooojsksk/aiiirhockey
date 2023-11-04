package com.google.android.gms.internal.measurement;

import android.content.Context;
import java.util.Objects;
import javax.annotation.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: classes.dex */
public final class zzhb extends zzhy {
    private final Context zza;
    private final zzih zzb;

    public zzhb(Context context, @Nullable zzih zzihVar) {
        Objects.requireNonNull(context, "Null context");
        this.zza = context;
        this.zzb = zzihVar;
    }

    public final boolean equals(Object obj) {
        zzih zzihVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzhy) {
            zzhy zzhyVar = (zzhy) obj;
            if (this.zza.equals(zzhyVar.zza()) && ((zzihVar = this.zzb) != null ? zzihVar.equals(zzhyVar.zzb()) : zzhyVar.zzb() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.zza.hashCode() ^ 1000003) * 1000003;
        zzih zzihVar = this.zzb;
        return hashCode ^ (zzihVar == null ? 0 : zzihVar.hashCode());
    }

    public final String toString() {
        String obj = this.zza.toString();
        String valueOf = String.valueOf(this.zzb);
        return "FlagsContext{context=" + obj + ", hermeticFileOverrides=" + valueOf + "}";
    }

    @Override // com.google.android.gms.internal.measurement.zzhy
    public final Context zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzhy
    @Nullable
    public final zzih zzb() {
        return this.zzb;
    }
}
