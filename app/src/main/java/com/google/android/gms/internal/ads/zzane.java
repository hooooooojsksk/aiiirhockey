package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzane extends zzgqm implements zzgrx {
    private static final zzane zzb;
    private int zzd;
    private long zze = -1;
    private int zzf = 1000;
    private int zzg = 1000;

    static {
        zzane zzaneVar = new zzane();
        zzb = zzaneVar;
        zzgqm.zzaT(zzane.class, zzaneVar);
    }

    private zzane() {
    }

    @Override // com.google.android.gms.internal.ads.zzgqm
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                zzgqq zzgqqVar = zzany.zza;
                return zzaQ(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဌ\u0001\u0003ဌ\u0002", new Object[]{"zzd", "zze", "zzf", zzgqqVar, "zzg", zzgqqVar});
            } else if (i2 != 3) {
                if (i2 != 4) {
                    if (i2 != 5) {
                        return null;
                    }
                    return zzb;
                }
                return new zzand(null);
            } else {
                return new zzane();
            }
        }
        return (byte) 1;
    }
}
