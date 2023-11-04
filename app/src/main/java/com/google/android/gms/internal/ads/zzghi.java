package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzghi extends zzgqm implements zzgrx {
    private static final zzghi zzb;
    private zzgho zzd;
    private zzgkc zze;

    static {
        zzghi zzghiVar = new zzghi();
        zzb = zzghiVar;
        zzgqm.zzaT(zzghi.class, zzghiVar);
    }

    private zzghi() {
    }

    public static zzghh zza() {
        return (zzghh) zzb.zzaA();
    }

    public static zzghi zzd(zzgpe zzgpeVar, zzgpy zzgpyVar) throws zzgqy {
        return (zzghi) zzgqm.zzaG(zzb, zzgpeVar, zzgpyVar);
    }

    public static /* synthetic */ void zzg(zzghi zzghiVar, zzgho zzghoVar) {
        zzghoVar.getClass();
        zzghiVar.zzd = zzghoVar;
    }

    public static /* synthetic */ void zzh(zzghi zzghiVar, zzgkc zzgkcVar) {
        zzgkcVar.getClass();
        zzghiVar.zze = zzgkcVar;
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
                    return new zzghh(null);
                }
                return new zzghi();
            }
            return zzaQ(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }

    public final zzgho zze() {
        zzgho zzghoVar = this.zzd;
        return zzghoVar == null ? zzgho.zze() : zzghoVar;
    }

    public final zzgkc zzf() {
        zzgkc zzgkcVar = this.zze;
        return zzgkcVar == null ? zzgkc.zze() : zzgkcVar;
    }
}
