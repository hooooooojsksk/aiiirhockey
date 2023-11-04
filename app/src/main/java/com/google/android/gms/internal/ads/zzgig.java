package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzgig extends zzgqm implements zzgrx {
    private static final zzgig zzb;
    private int zzd;
    private int zze;

    static {
        zzgig zzgigVar = new zzgig();
        zzb = zzgigVar;
        zzgqm.zzaT(zzgig.class, zzgigVar);
    }

    private zzgig() {
    }

    public static zzgif zzc() {
        return (zzgif) zzb.zzaA();
    }

    public static zzgig zze(zzgpe zzgpeVar, zzgpy zzgpyVar) throws zzgqy {
        return (zzgig) zzgqm.zzaG(zzb, zzgpeVar, zzgpyVar);
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
                    return new zzgif(null);
                }
                return new zzgig();
            }
            return zzaQ(zzb, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }
}
