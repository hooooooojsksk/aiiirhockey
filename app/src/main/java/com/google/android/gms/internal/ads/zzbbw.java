package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* loaded from: classes2.dex */
public class zzbbw {
    private final String zza;
    private final Object zzb;
    private final int zzc;

    public zzbbw(String str, Object obj, int i) {
        this.zza = str;
        this.zzb = obj;
        this.zzc = i;
    }

    public static zzbbw zza(String str, double d) {
        return new zzbbw(str, Double.valueOf(d), 3);
    }

    public static zzbbw zzb(String str, long j) {
        return new zzbbw(str, Long.valueOf(j), 2);
    }

    public static zzbbw zzc(String str, String str2) {
        return new zzbbw(str, str2, 4);
    }

    public static zzbbw zzd(String str, boolean z) {
        return new zzbbw(str, Boolean.valueOf(z), 1);
    }

    public final Object zze() {
        zzbda zza = zzbdc.zza();
        if (zza == null) {
            if (zzbdc.zzb() != null) {
                zzbdc.zzb().zza();
            }
            return this.zzb;
        }
        int i = this.zzc - 1;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return zza.zzd(this.zza, (String) this.zzb);
                }
                return zza.zzb(this.zza, ((Double) this.zzb).doubleValue());
            }
            return zza.zzc(this.zza, ((Long) this.zzb).longValue());
        }
        return zza.zza(this.zza, ((Boolean) this.zzb).booleanValue());
    }
}
