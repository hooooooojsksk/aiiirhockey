package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzgim extends zzgqm implements zzgrx {
    private static final zzgim zzb;
    private int zzd;
    private int zze;

    static {
        zzgim zzgimVar = new zzgim();
        zzb = zzgimVar;
        zzgqm.zzaT(zzgim.class, zzgimVar);
    }

    private zzgim() {
    }

    public static zzgil zzc() {
        return (zzgil) zzb.zzaA();
    }

    public static zzgim zze(zzgpe zzgpeVar, zzgpy zzgpyVar) throws zzgqy {
        return (zzgim) zzgqm.zzaG(zzb, zzgpeVar, zzgpyVar);
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
                    return new zzgil(null);
                }
                return new zzgim();
            }
            return zzaQ(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zze", "zzd"});
        }
        return (byte) 1;
    }
}
