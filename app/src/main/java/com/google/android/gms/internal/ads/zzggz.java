package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzggz extends zzgqm implements zzgrx {
    private static final zzggz zzb;
    private int zzd;
    private zzghc zze;

    static {
        zzggz zzggzVar = new zzggz();
        zzb = zzggzVar;
        zzgqm.zzaT(zzggz.class, zzggzVar);
    }

    private zzggz() {
    }

    public static zzggy zzc() {
        return (zzggy) zzb.zzaA();
    }

    public static zzggz zze(zzgpe zzgpeVar, zzgpy zzgpyVar) throws zzgqy {
        return (zzggz) zzgqm.zzaG(zzb, zzgpeVar, zzgpyVar);
    }

    public static /* synthetic */ void zzh(zzggz zzggzVar, zzghc zzghcVar) {
        zzghcVar.getClass();
        zzggzVar.zze = zzghcVar;
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
                    return new zzggy(null);
                }
                return new zzggz();
            }
            return zzaQ(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }

    public final zzghc zzf() {
        zzghc zzghcVar = this.zze;
        return zzghcVar == null ? zzghc.zze() : zzghcVar;
    }
}
