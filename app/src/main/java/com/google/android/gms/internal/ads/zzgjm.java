package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzgjm extends zzgqm implements zzgrx {
    private static final zzgjm zzb;
    private int zzd;
    private zzgjp zze;
    private zzgpe zzf = zzgpe.zzb;

    static {
        zzgjm zzgjmVar = new zzgjm();
        zzb = zzgjmVar;
        zzgqm.zzaT(zzgjm.class, zzgjmVar);
    }

    private zzgjm() {
    }

    public static zzgjl zzc() {
        return (zzgjl) zzb.zzaA();
    }

    public static zzgjm zze(zzgpe zzgpeVar, zzgpy zzgpyVar) throws zzgqy {
        return (zzgjm) zzgqm.zzaG(zzb, zzgpeVar, zzgpyVar);
    }

    public static /* synthetic */ void zzi(zzgjm zzgjmVar, zzgjp zzgjpVar) {
        zzgjpVar.getClass();
        zzgjmVar.zze = zzgjpVar;
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
                    return new zzgjl(null);
                }
                return new zzgjm();
            }
            return zzaQ(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zzgjp zzf() {
        zzgjp zzgjpVar = this.zze;
        return zzgjpVar == null ? zzgjp.zzf() : zzgjpVar;
    }

    public final zzgpe zzg() {
        return this.zzf;
    }
}
