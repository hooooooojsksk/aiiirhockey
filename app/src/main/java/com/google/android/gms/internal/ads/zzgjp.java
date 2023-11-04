package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzgjp extends zzgqm implements zzgrx {
    private static final zzgjp zzb;
    private int zzd;
    private zzgjj zze;
    private zzgpe zzf = zzgpe.zzb;
    private zzgpe zzg = zzgpe.zzb;

    static {
        zzgjp zzgjpVar = new zzgjp();
        zzb = zzgjpVar;
        zzgqm.zzaT(zzgjp.class, zzgjpVar);
    }

    private zzgjp() {
    }

    public static zzgjo zzd() {
        return (zzgjo) zzb.zzaA();
    }

    public static zzgjp zzf() {
        return zzb;
    }

    public static zzgjp zzg(zzgpe zzgpeVar, zzgpy zzgpyVar) throws zzgqy {
        return (zzgjp) zzgqm.zzaG(zzb, zzgpeVar, zzgpyVar);
    }

    public static /* synthetic */ void zzk(zzgjp zzgjpVar, zzgjj zzgjjVar) {
        zzgjjVar.getClass();
        zzgjpVar.zze = zzgjjVar;
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
                    return new zzgjo(null);
                }
                return new zzgjp();
            }
            return zzaQ(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final zzgjj zzc() {
        zzgjj zzgjjVar = this.zze;
        return zzgjjVar == null ? zzgjj.zze() : zzgjjVar;
    }

    public final zzgpe zzh() {
        return this.zzf;
    }

    public final zzgpe zzi() {
        return this.zzg;
    }
}
