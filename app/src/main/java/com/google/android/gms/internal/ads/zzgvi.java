package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzgvi extends zzgqm implements zzgrx {
    private static final zzgvi zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private zzgpe zzg = zzgpe.zzb;
    private zzgpe zzh = zzgpe.zzb;

    static {
        zzgvi zzgviVar = new zzgvi();
        zzb = zzgviVar;
        zzgqm.zzaT(zzgvi.class, zzgviVar);
    }

    private zzgvi() {
    }

    public static zzgvg zza() {
        return (zzgvg) zzb.zzaA();
    }

    public static /* synthetic */ void zzd(zzgvi zzgviVar, String str) {
        zzgviVar.zzd |= 2;
        zzgviVar.zzf = "image/png";
    }

    public static /* synthetic */ void zze(zzgvi zzgviVar, zzgpe zzgpeVar) {
        zzgpeVar.getClass();
        zzgviVar.zzd |= 4;
        zzgviVar.zzg = zzgpeVar;
    }

    public static /* synthetic */ void zzf(zzgvi zzgviVar, int i) {
        zzgviVar.zze = 1;
        zzgviVar.zzd = 1 | zzgviVar.zzd;
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
                    return new zzgvg(null);
                }
                return new zzgvi();
            }
            return zzaQ(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzd", "zze", zzgvh.zza, "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
