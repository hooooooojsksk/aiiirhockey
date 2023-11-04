package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzflm extends zzfme {
    private final String zza;
    private final String zzb;

    public /* synthetic */ zzflm(String str, String str2, zzfll zzfllVar) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfme) {
            zzfme zzfmeVar = (zzfme) obj;
            String str = this.zza;
            if (str != null ? str.equals(zzfmeVar.zzb()) : zzfmeVar.zzb() == null) {
                String str2 = this.zzb;
                if (str2 != null ? str2.equals(zzfmeVar.zza()) : zzfmeVar.zza() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        String str = this.zza;
        String str2 = this.zzb;
        return "OverlayDisplayUpdateRequest{sessionToken=" + str + ", appId=" + str2 + "}";
    }

    @Override // com.google.android.gms.internal.ads.zzfme
    public final String zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfme
    public final String zzb() {
        return this.zza;
    }

    public final int hashCode() {
        String str = this.zza;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.zzb;
        return ((hashCode ^ 1000003) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }
}
