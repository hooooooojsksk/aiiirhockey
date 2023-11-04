package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzghr extends zzgqm implements zzgrx {
    private static final zzghr zzb;
    private int zzd;

    static {
        zzghr zzghrVar = new zzghr();
        zzb = zzghrVar;
        zzgqm.zzaT(zzghr.class, zzghrVar);
    }

    private zzghr() {
    }

    public static zzghq zzc() {
        return (zzghq) zzb.zzaA();
    }

    public static zzghr zze() {
        return zzb;
    }

    public final int zza() {
        return this.zzd;
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
                    return new zzghq(null);
                }
                return new zzghr();
            }
            return zzaQ(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzd"});
        }
        return (byte) 1;
    }
}
