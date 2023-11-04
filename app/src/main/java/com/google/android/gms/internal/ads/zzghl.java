package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzghl extends zzgqm implements zzgrx {
    private static final zzghl zzb;
    private int zzd;
    private zzghr zze;
    private zzgpe zzf = zzgpe.zzb;

    static {
        zzghl zzghlVar = new zzghl();
        zzb = zzghlVar;
        zzgqm.zzaT(zzghl.class, zzghlVar);
    }

    private zzghl() {
    }

    public static zzghk zzc() {
        return (zzghk) zzb.zzaA();
    }

    public static zzghl zze() {
        return zzb;
    }

    public static zzghl zzf(zzgpe zzgpeVar, zzgpy zzgpyVar) throws zzgqy {
        return (zzghl) zzgqm.zzaG(zzb, zzgpeVar, zzgpyVar);
    }

    public static /* synthetic */ void zzj(zzghl zzghlVar, zzghr zzghrVar) {
        zzghrVar.getClass();
        zzghlVar.zze = zzghrVar;
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
                    return new zzghk(null);
                }
                return new zzghl();
            }
            return zzaQ(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zzghr zzg() {
        zzghr zzghrVar = this.zze;
        return zzghrVar == null ? zzghr.zze() : zzghrVar;
    }

    public final zzgpe zzh() {
        return this.zzf;
    }
}
