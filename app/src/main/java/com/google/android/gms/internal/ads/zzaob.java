package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzaob extends zzgqm implements zzgrx {
    private static final zzaob zzb;
    private int zzd;
    private long zze;
    private String zzf = "";
    private zzgpe zzg = zzgpe.zzb;

    static {
        zzaob zzaobVar = new zzaob();
        zzb = zzaobVar;
        zzgqm.zzaT(zzaob.class, zzaobVar);
    }

    private zzaob() {
    }

    public static zzaob zzd() {
        return zzb;
    }

    public final long zza() {
        return this.zze;
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
                    return new zzaoa(null);
                }
                return new zzaob();
            }
            return zzaQ(zzb, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final boolean zze() {
        return (this.zzd & 1) != 0;
    }
}
