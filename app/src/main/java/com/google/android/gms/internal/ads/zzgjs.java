package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzgjs extends zzgqm implements zzgrx {
    private static final zzgjs zzb;
    private int zzd;
    private int zze;
    private zzgpe zzf = zzgpe.zzb;

    static {
        zzgjs zzgjsVar = new zzgjs();
        zzb = zzgjsVar;
        zzgqm.zzaT(zzgjs.class, zzgjsVar);
    }

    private zzgjs() {
    }

    public static zzgjr zza() {
        return (zzgjr) zzb.zzaA();
    }

    public static zzgjs zzd() {
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
                    return new zzgjr(null);
                }
                return new zzgjs();
            }
            return zzaQ(zzb, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zzgpe zze() {
        return this.zzf;
    }

    public final int zzg() {
        int i = this.zzd;
        int i2 = 5;
        if (i == 0) {
            i2 = 2;
        } else if (i == 2) {
            i2 = 4;
        } else if (i != 3) {
            i2 = i != 4 ? i != 5 ? 0 : 7 : 6;
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    public final int zzh() {
        int zzb2 = zzgjw.zzb(this.zze);
        if (zzb2 == 0) {
            return 1;
        }
        return zzb2;
    }
}
