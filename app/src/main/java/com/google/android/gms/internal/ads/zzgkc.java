package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzgkc extends zzgqm implements zzgrx {
    private static final zzgkc zzb;
    private zzgkf zzd;
    private int zze;
    private int zzf;

    static {
        zzgkc zzgkcVar = new zzgkc();
        zzb = zzgkcVar;
        zzgqm.zzaT(zzgkc.class, zzgkcVar);
    }

    private zzgkc() {
    }

    public static zzgkb zzc() {
        return (zzgkb) zzb.zzaA();
    }

    public static zzgkc zze() {
        return zzb;
    }

    public static zzgkc zzf(zzgpe zzgpeVar, zzgpy zzgpyVar) throws zzgqy {
        return (zzgkc) zzgqm.zzaG(zzb, zzgpeVar, zzgpyVar);
    }

    public static /* synthetic */ void zzh(zzgkc zzgkcVar, zzgkf zzgkfVar) {
        zzgkfVar.getClass();
        zzgkcVar.zzd = zzgkfVar;
    }

    public final int zza() {
        return this.zze;
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
                    return new zzgkb(null);
                }
                return new zzgkc();
            }
            return zzaQ(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zzgkf zzg() {
        zzgkf zzgkfVar = this.zzd;
        return zzgkfVar == null ? zzgkf.zze() : zzgkfVar;
    }
}
