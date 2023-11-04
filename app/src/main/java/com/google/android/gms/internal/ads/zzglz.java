package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzglz extends zzgqm implements zzgrx {
    private static final zzglz zzb;
    private int zzd;
    private zzgmc zze;

    static {
        zzglz zzglzVar = new zzglz();
        zzb = zzglzVar;
        zzgqm.zzaT(zzglz.class, zzglzVar);
    }

    private zzglz() {
    }

    public static zzgly zzc() {
        return (zzgly) zzb.zzaA();
    }

    public static zzglz zze(zzgpe zzgpeVar, zzgpy zzgpyVar) throws zzgqy {
        return (zzglz) zzgqm.zzaG(zzb, zzgpeVar, zzgpyVar);
    }

    public static /* synthetic */ void zzh(zzglz zzglzVar, zzgmc zzgmcVar) {
        zzgmcVar.getClass();
        zzglzVar.zze = zzgmcVar;
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
                    return new zzgly(null);
                }
                return new zzglz();
            }
            return zzaQ(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }

    public final zzgmc zzf() {
        zzgmc zzgmcVar = this.zze;
        return zzgmcVar == null ? zzgmc.zzd() : zzgmcVar;
    }
}
