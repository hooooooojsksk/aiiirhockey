package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzglt extends zzgqm implements zzgrx {
    private static final zzglt zzb;
    private int zzd;
    private zzglw zze;

    static {
        zzglt zzgltVar = new zzglt();
        zzb = zzgltVar;
        zzgqm.zzaT(zzglt.class, zzgltVar);
    }

    private zzglt() {
    }

    public static zzgls zzc() {
        return (zzgls) zzb.zzaA();
    }

    public static zzglt zze(zzgpe zzgpeVar, zzgpy zzgpyVar) throws zzgqy {
        return (zzglt) zzgqm.zzaG(zzb, zzgpeVar, zzgpyVar);
    }

    public static /* synthetic */ void zzh(zzglt zzgltVar, zzglw zzglwVar) {
        zzglwVar.getClass();
        zzgltVar.zze = zzglwVar;
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
                    return new zzgls(null);
                }
                return new zzglt();
            }
            return zzaQ(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }

    public final zzglw zzf() {
        zzglw zzglwVar = this.zze;
        return zzglwVar == null ? zzglw.zzc() : zzglwVar;
    }
}
