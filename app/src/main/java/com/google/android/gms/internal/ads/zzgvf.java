package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzgvf extends zzgqm implements zzgrx {
    private static final zzgvf zzb;
    private int zzd;
    private zzgve zze;
    private zzgpe zzh;
    private int zzi;
    private zzgpe zzj;
    private byte zzk = 2;
    private zzgqv zzf = zzaM();
    private zzgpe zzg = zzgpe.zzb;

    static {
        zzgvf zzgvfVar = new zzgvf();
        zzb = zzgvfVar;
        zzgqm.zzaT(zzgvf.class, zzgvfVar);
    }

    private zzgvf() {
        zzgpe zzgpeVar = zzgpe.zzb;
        this.zzh = zzgpeVar;
        this.zzj = zzgpeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgqm
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 == 5) {
                            return zzb;
                        }
                        this.zzk = obj == null ? (byte) 0 : (byte) 1;
                        return null;
                    }
                    return new zzgvc(null);
                }
                return new zzgvf();
            }
            return zzaQ(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"zzd", "zze", "zzf", zzgux.class, "zzg", "zzh", "zzi", "zzj"});
        }
        return Byte.valueOf(this.zzk);
    }
}
