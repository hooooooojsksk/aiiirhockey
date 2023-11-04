package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public class zzbn {
    public final Object zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final int zze;

    public zzbn(zzbn zzbnVar) {
        this.zza = zzbnVar.zza;
        this.zzb = zzbnVar.zzb;
        this.zzc = zzbnVar.zzc;
        this.zzd = zzbnVar.zzd;
        this.zze = zzbnVar.zze;
    }

    public zzbn(Object obj, int i, int i2, long j) {
        this(obj, i, i2, j, -1);
    }

    private zzbn(Object obj, int i, int i2, long j, int i3) {
        this.zza = obj;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = j;
        this.zze = i3;
    }

    public zzbn(Object obj, long j) {
        this(obj, -1, -1, j, -1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzbn) {
            zzbn zzbnVar = (zzbn) obj;
            return this.zza.equals(zzbnVar.zza) && this.zzb == zzbnVar.zzb && this.zzc == zzbnVar.zzc && this.zzd == zzbnVar.zzd && this.zze == zzbnVar.zze;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.zza.hashCode() + 527) * 31) + this.zzb) * 31) + this.zzc) * 31) + ((int) this.zzd)) * 31) + this.zze;
    }

    public final zzbn zza(Object obj) {
        return this.zza.equals(obj) ? this : new zzbn(obj, this.zzb, this.zzc, this.zzd, this.zze);
    }

    public final boolean zzb() {
        return this.zzb != -1;
    }

    public zzbn(Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }
}
