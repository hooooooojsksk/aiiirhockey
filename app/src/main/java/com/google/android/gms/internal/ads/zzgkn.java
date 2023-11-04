package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzgkn extends zzgqm implements zzgrx {
    private static final zzgkn zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        zzgkn zzgknVar = new zzgkn();
        zzb = zzgknVar;
        zzgqm.zzaT(zzgkn.class, zzgknVar);
    }

    private zzgkn() {
    }

    public static zzgkm zza() {
        return (zzgkm) zzb.zzaA();
    }

    public static zzgkn zzd() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgqm
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzgkm(null);
                }
                return new zzgkn();
            }
            return zzaQ(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final int zze() {
        int i = this.zzf;
        int i2 = 3;
        if (i == 0) {
            i2 = 2;
        } else if (i != 1) {
            i2 = i != 2 ? i != 3 ? 0 : 5 : 4;
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    public final int zzf() {
        int i = this.zze;
        int i2 = 3;
        if (i == 0) {
            i2 = 2;
        } else if (i != 1) {
            i2 = i != 2 ? i != 3 ? 0 : 5 : 4;
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    public final int zzg() {
        int i = this.zzd;
        int i2 = 4;
        if (i == 0) {
            i2 = 2;
        } else if (i == 1) {
            i2 = 3;
        } else if (i != 2) {
            i2 = i != 3 ? i != 4 ? 0 : 6 : 5;
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }
}
