package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzggw extends zzgqm implements zzgrx {
    private static final zzggw zzb;
    private int zzd;
    private zzgpe zze = zzgpe.zzb;
    private zzghc zzf;

    static {
        zzggw zzggwVar = new zzggw();
        zzb = zzggwVar;
        zzgqm.zzaT(zzggw.class, zzggwVar);
    }

    private zzggw() {
    }

    public static zzggv zzc() {
        return (zzggv) zzb.zzaA();
    }

    public static zzggw zze(zzgpe zzgpeVar, zzgpy zzgpyVar) throws zzgqy {
        return (zzggw) zzgqm.zzaG(zzb, zzgpeVar, zzgpyVar);
    }

    public static /* synthetic */ void zzj(zzggw zzggwVar, zzghc zzghcVar) {
        zzghcVar.getClass();
        zzggwVar.zzf = zzghcVar;
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
                    return new zzggv(null);
                }
                return new zzggw();
            }
            return zzaQ(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zzghc zzf() {
        zzghc zzghcVar = this.zzf;
        return zzghcVar == null ? zzghc.zze() : zzghcVar;
    }

    public final zzgpe zzg() {
        return this.zze;
    }
}
