package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzgjz extends zzgqm implements zzgrx {
    private static final zzgjz zzb;
    private int zzd;
    private zzgkf zze;
    private zzgpe zzf = zzgpe.zzb;

    static {
        zzgjz zzgjzVar = new zzgjz();
        zzb = zzgjzVar;
        zzgqm.zzaT(zzgjz.class, zzgjzVar);
    }

    private zzgjz() {
    }

    public static zzgjy zzc() {
        return (zzgjy) zzb.zzaA();
    }

    public static zzgjz zze() {
        return zzb;
    }

    public static zzgjz zzf(zzgpe zzgpeVar, zzgpy zzgpyVar) throws zzgqy {
        return (zzgjz) zzgqm.zzaG(zzb, zzgpeVar, zzgpyVar);
    }

    public static /* synthetic */ void zzj(zzgjz zzgjzVar, zzgkf zzgkfVar) {
        zzgkfVar.getClass();
        zzgjzVar.zze = zzgkfVar;
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
                    return new zzgjy(null);
                }
                return new zzgjz();
            }
            return zzaQ(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zzgkf zzg() {
        zzgkf zzgkfVar = this.zze;
        return zzgkfVar == null ? zzgkf.zze() : zzgkfVar;
    }

    public final zzgpe zzh() {
        return this.zzf;
    }
}
