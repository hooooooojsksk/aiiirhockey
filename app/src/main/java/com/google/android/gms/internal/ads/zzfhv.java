package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzfhv extends zzfhr {
    private final String zza;
    private final boolean zzb;
    private final boolean zzc;

    public /* synthetic */ zzfhv(String str, boolean z, boolean z2, zzfhu zzfhuVar) {
        this.zza = str;
        this.zzb = z;
        this.zzc = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfhr) {
            zzfhr zzfhrVar = (zzfhr) obj;
            if (this.zza.equals(zzfhrVar.zzb()) && this.zzb == zzfhrVar.zzd() && this.zzc == zzfhrVar.zzc()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode() ^ 1000003;
        return (((hashCode * 1000003) ^ (true != this.zzb ? 1237 : 1231)) * 1000003) ^ (true == this.zzc ? 1231 : 1237);
    }

    public final String toString() {
        String str = this.zza;
        boolean z = this.zzb;
        boolean z2 = this.zzc;
        return "AdShield2Options{clientVersion=" + str + ", shouldGetAdvertisingId=" + z + ", isGooglePlayServicesAvailable=" + z2 + "}";
    }

    @Override // com.google.android.gms.internal.ads.zzfhr
    public final String zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfhr
    public final boolean zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfhr
    public final boolean zzd() {
        return this.zzb;
    }
}
