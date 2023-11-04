package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzglp extends zzgqm implements zzgrx {
    private static final zzglp zzb;
    private String zzd = "";
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzglp zzglpVar = new zzglp();
        zzb = zzglpVar;
        zzgqm.zzaT(zzglp.class, zzglpVar);
    }

    private zzglp() {
    }

    public static zzglo zza() {
        return (zzglo) zzb.zzaA();
    }

    public static /* synthetic */ void zzd(zzglp zzglpVar, String str) {
        str.getClass();
        zzglpVar.zzd = str;
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
                    return new zzglo(null);
                }
                return new zzglp();
            }
            return zzaQ(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
