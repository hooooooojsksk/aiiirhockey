package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzglq extends zzgqm implements zzgrx {
    private static final zzglq zzb;
    private int zzd;
    private zzgqv zze = zzaM();

    static {
        zzglq zzglqVar = new zzglq();
        zzb = zzglqVar;
        zzgqm.zzaT(zzglq.class, zzglqVar);
    }

    private zzglq() {
    }

    public static zzgln zza() {
        return (zzgln) zzb.zzaA();
    }

    public static /* synthetic */ void zze(zzglq zzglqVar, zzglp zzglpVar) {
        zzglpVar.getClass();
        zzgqv zzgqvVar = zzglqVar.zze;
        if (!zzgqvVar.zzc()) {
            zzglqVar.zze = zzgqm.zzaN(zzgqvVar);
        }
        zzglqVar.zze.add(zzglpVar);
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
                    return new zzgln(null);
                }
                return new zzglq();
            }
            return zzaQ(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzd", "zze", zzglp.class});
        }
        return (byte) 1;
    }
}
