package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzgid extends zzgqm implements zzgrx {
    private static final zzgid zzb;
    private int zzd;
    private zzgpe zze = zzgpe.zzb;

    static {
        zzgid zzgidVar = new zzgid();
        zzb = zzgidVar;
        zzgqm.zzaT(zzgid.class, zzgidVar);
    }

    private zzgid() {
    }

    public static zzgic zzc() {
        return (zzgic) zzb.zzaA();
    }

    public static zzgid zze(zzgpe zzgpeVar, zzgpy zzgpyVar) throws zzgqy {
        return (zzgid) zzgqm.zzaG(zzb, zzgpeVar, zzgpyVar);
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
                    return new zzgic(null);
                }
                return new zzgid();
            }
            return zzaQ(zzb, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }

    public final zzgpe zzf() {
        return this.zze;
    }
}
