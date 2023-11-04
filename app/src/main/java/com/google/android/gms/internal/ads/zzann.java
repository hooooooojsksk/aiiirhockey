package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzann extends zzgqm implements zzgrx {
    private static final zzann zzb;
    private int zzd;
    private long zze = -1;
    private int zzf = 1000;

    static {
        zzann zzannVar = new zzann();
        zzb = zzannVar;
        zzgqm.zzaT(zzann.class, zzannVar);
    }

    private zzann() {
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
                    return new zzanm(null);
                }
                return new zzann();
            }
            return zzaQ(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဌ\u0001", new Object[]{"zzd", "zze", "zzf", zzany.zza});
        }
        return (byte) 1;
    }
}
