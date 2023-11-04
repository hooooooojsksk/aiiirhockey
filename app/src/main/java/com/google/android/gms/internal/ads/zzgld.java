package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzgld extends zzgqm implements zzgrx {
    private static final zzgld zzb;
    private String zzd = "";
    private zzgpe zze = zzgpe.zzb;
    private int zzf;

    static {
        zzgld zzgldVar = new zzgld();
        zzb = zzgldVar;
        zzgqm.zzaT(zzgld.class, zzgldVar);
    }

    private zzgld() {
    }

    public static zzglc zza() {
        return (zzglc) zzb.zzaA();
    }

    public static zzgld zzd() {
        return zzb;
    }

    public static /* synthetic */ void zzh(zzgld zzgldVar, String str) {
        str.getClass();
        zzgldVar.zzd = str;
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
                    return new zzglc(null);
                }
                return new zzgld();
            }
            return zzaQ(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zzgme zze() {
        zzgme zzb2 = zzgme.zzb(this.zzf);
        return zzb2 == null ? zzgme.UNRECOGNIZED : zzb2;
    }

    public final zzgpe zzf() {
        return this.zze;
    }

    public final String zzg() {
        return this.zzd;
    }
}
