package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzflj extends zzfmb {
    private final int zza;
    private final String zzb;

    public /* synthetic */ zzflj(int i, String str, zzfli zzfliVar) {
        this.zza = i;
        this.zzb = str;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfmb) {
            zzfmb zzfmbVar = (zzfmb) obj;
            if (this.zza == zzfmbVar.zza() && ((str = this.zzb) != null ? str.equals(zzfmbVar.zzb()) : zzfmbVar.zzb() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zza ^ 1000003;
        String str = this.zzb;
        return (i * 1000003) ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        int i = this.zza;
        String str = this.zzb;
        return "OverlayDisplayState{statusCode=" + i + ", sessionToken=" + str + "}";
    }

    @Override // com.google.android.gms.internal.ads.zzfmb
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfmb
    public final String zzb() {
        return this.zzb;
    }
}
