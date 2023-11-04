package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzgkt extends zzgqm implements zzgrx {
    private static final zzgkt zzb;
    private int zzd;
    private zzgkn zze;
    private zzgpe zzf = zzgpe.zzb;

    static {
        zzgkt zzgktVar = new zzgkt();
        zzb = zzgktVar;
        zzgqm.zzaT(zzgkt.class, zzgktVar);
    }

    private zzgkt() {
    }

    public static zzgks zzd() {
        return (zzgks) zzb.zzaA();
    }

    public static zzgkt zzf() {
        return zzb;
    }

    public static zzgkt zzg(zzgpe zzgpeVar, zzgpy zzgpyVar) throws zzgqy {
        return (zzgkt) zzgqm.zzaG(zzb, zzgpeVar, zzgpyVar);
    }

    public static /* synthetic */ void zzj(zzgkt zzgktVar, zzgkn zzgknVar) {
        zzgknVar.getClass();
        zzgktVar.zze = zzgknVar;
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
                    return new zzgks(null);
                }
                return new zzgkt();
            }
            return zzaQ(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zzgkn zzc() {
        zzgkn zzgknVar = this.zze;
        return zzgknVar == null ? zzgkn.zzd() : zzgknVar;
    }

    public final zzgpe zzh() {
        return this.zzf;
    }

    public final boolean zzl() {
        return this.zze != null;
    }
}
