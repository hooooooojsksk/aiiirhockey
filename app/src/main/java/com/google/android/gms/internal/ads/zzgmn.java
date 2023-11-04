package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzgmn extends zzgqm implements zzgrx {
    private static final zzgmn zzb;
    private int zzd;

    static {
        zzgmn zzgmnVar = new zzgmn();
        zzb = zzgmnVar;
        zzgqm.zzaT(zzgmn.class, zzgmnVar);
    }

    private zzgmn() {
    }

    public static zzgmn zzc() {
        return zzb;
    }

    public static zzgmn zzd(zzgpe zzgpeVar, zzgpy zzgpyVar) throws zzgqy {
        return (zzgmn) zzgqm.zzaG(zzb, zzgpeVar, zzgpyVar);
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
                    return new zzgmm(null);
                }
                return new zzgmn();
            }
            return zzaQ(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzd"});
        }
        return (byte) 1;
    }
}
