package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzgmc extends zzgqm implements zzgrx {
    private static final zzgmc zzb;
    private String zzd = "";
    private zzgld zze;

    static {
        zzgmc zzgmcVar = new zzgmc();
        zzb = zzgmcVar;
        zzgqm.zzaT(zzgmc.class, zzgmcVar);
    }

    private zzgmc() {
    }

    public static zzgmc zzd() {
        return zzb;
    }

    public static zzgmc zze(zzgpe zzgpeVar, zzgpy zzgpyVar) throws zzgqy {
        return (zzgmc) zzgqm.zzaG(zzb, zzgpeVar, zzgpyVar);
    }

    public final zzgld zza() {
        zzgld zzgldVar = this.zze;
        return zzgldVar == null ? zzgld.zzd() : zzgldVar;
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
                    return new zzgmb(null);
                }
                return new zzgmc();
            }
            return zzaQ(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }

    public final String zzf() {
        return this.zzd;
    }

    public final boolean zzg() {
        return this.zze != null;
    }
}
