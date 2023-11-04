package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzgip extends zzgqm implements zzgrx {
    private static final zzgip zzb;
    private int zzd;
    private zzgpe zze = zzgpe.zzb;

    static {
        zzgip zzgipVar = new zzgip();
        zzb = zzgipVar;
        zzgqm.zzaT(zzgip.class, zzgipVar);
    }

    private zzgip() {
    }

    public static zzgio zzc() {
        return (zzgio) zzb.zzaA();
    }

    public static zzgip zze(zzgpe zzgpeVar, zzgpy zzgpyVar) throws zzgqy {
        return (zzgip) zzgqm.zzaG(zzb, zzgpeVar, zzgpyVar);
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
                    return new zzgio(null);
                }
                return new zzgip();
            }
            return zzaQ(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }

    public final zzgpe zzf() {
        return this.zze;
    }
}
